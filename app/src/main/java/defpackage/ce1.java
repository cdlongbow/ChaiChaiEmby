package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.dh.myembyapp.data.AudioTrackMemory;
import com.dh.myembyapp.data.VideoVersionMemory;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.VideoResolutionKt;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ce1 {
    public final SharedPreferences a;
    public final Gson b;

    public ce1(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("playback_memory_preferences", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = new Gson();
    }

    public static String i(String str, String str2) {
        if (str2 != null) {
            if (StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return mr.C(str, "|", str2);
            }
        }
        return null;
    }

    public static String l(MediaItem mediaItem) {
        String seriesId = mediaItem.getSeriesId();
        if (seriesId == null) {
            return null;
        }
        String seasonId = mediaItem.getSeasonId();
        if (seasonId == null && (seasonId = mediaItem.getParentId()) == null) {
            Integer parentIndexNumber = mediaItem.getParentIndexNumber();
            String strF = parentIndexNumber != null ? i9.f(parentIndexNumber.intValue(), "season_") : null;
            seasonId = strF == null ? "series" : strF;
        }
        return mr.C(seriesId, "|", seasonId);
    }

    public static List m(List list, Function1 function1) {
        return list.size() > 200 ? CollectionsKt.takeLast(CollectionsKt.sortedWith(list, new t90(function1, 8)), 200) : list;
    }

    public final void a(MediaItem mediaItem, String str) {
        mediaItem.getClass();
        boolean zAreEqual = Intrinsics.areEqual(mediaItem.getType(), "Episode");
        Gson gson = this.b;
        SharedPreferences sharedPreferences = this.a;
        if (zAreEqual) {
            String strL = l(mediaItem);
            if (strL == null) {
                return;
            }
            List listF = f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (!Intrinsics.areEqual(((AudioTrackMemory) obj).getKey(), strL)) {
                    arrayList.add(obj);
                }
            }
            sharedPreferences.edit().putString("season_audio_memories_v1", gson.toJson(arrayList)).apply();
            Log.d("PlaybackMemory", "清除剧集音轨记忆: key=".concat(strL));
            return;
        }
        String strI = i(mediaItem.getId(), str);
        if (strI == null) {
            return;
        }
        List listD = d();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listD) {
            if (!Intrinsics.areEqual(((AudioTrackMemory) obj2).getKey(), strI)) {
                arrayList2.add(obj2);
            }
        }
        sharedPreferences.edit().putString("movie_audio_memories_v1", gson.toJson(arrayList2)).apply();
        Log.d("PlaybackMemory", "清除电影音轨记忆: key=".concat(strI));
    }

    public final void b(MediaItem mediaItem) {
        mediaItem.getClass();
        boolean zAreEqual = Intrinsics.areEqual(mediaItem.getType(), "Episode");
        Gson gson = this.b;
        SharedPreferences sharedPreferences = this.a;
        if (!zAreEqual) {
            List listE = e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                if (!Intrinsics.areEqual(((VideoVersionMemory) obj).getItemId(), mediaItem.getId())) {
                    arrayList.add(obj);
                }
            }
            sharedPreferences.edit().putString("movie_video_memories_v1", gson.toJson(arrayList)).apply();
            ll0.l("清除电影视频版本记忆: itemId=", mediaItem.getId(), "PlaybackMemory");
            return;
        }
        String strL = l(mediaItem);
        if (strL == null) {
            return;
        }
        List listG = g();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listG) {
            if (!Intrinsics.areEqual(((VideoVersionMemory) obj2).getKey(), strL)) {
                arrayList2.add(obj2);
            }
        }
        sharedPreferences.edit().putString("season_video_memories_v1", gson.toJson(arrayList2)).apply();
        Log.d("PlaybackMemory", "清除剧集视频版本记忆: key=".concat(strL));
    }

    public final AudioTrackMemory c(MediaItem mediaItem, String str) {
        mediaItem.getClass();
        Object obj = null;
        if (Intrinsics.areEqual(mediaItem.getType(), "Episode")) {
            String strL = l(mediaItem);
            if (strL == null) {
                return null;
            }
            for (Object obj2 : f()) {
                if (Intrinsics.areEqual(((AudioTrackMemory) obj2).getKey(), strL)) {
                    obj = obj2;
                    break;
                }
            }
            return (AudioTrackMemory) obj;
        }
        String strI = i(mediaItem.getId(), str);
        if (strI == null) {
            return null;
        }
        for (Object obj3 : d()) {
            if (Intrinsics.areEqual(((AudioTrackMemory) obj3).getKey(), strI)) {
                obj = obj3;
                break;
            }
        }
        return (AudioTrackMemory) obj;
    }

    public final List d() {
        String string = this.a.getString("movie_audio_memories_v1", null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List list = (List) this.b.fromJson(string, new yd1().getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e("PlaybackMemory", "解析播放记忆失败: key=movie_audio_memories_v1", e);
            return CollectionsKt.emptyList();
        }
    }

    public final List e() {
        String string = this.a.getString("movie_video_memories_v1", null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List list = (List) this.b.fromJson(string, new zd1().getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e("PlaybackMemory", "解析播放记忆失败: key=movie_video_memories_v1", e);
            return CollectionsKt.emptyList();
        }
    }

    public final List f() {
        String string = this.a.getString("season_audio_memories_v1", null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List list = (List) this.b.fromJson(string, new ae1().getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e("PlaybackMemory", "解析播放记忆失败: key=season_audio_memories_v1", e);
            return CollectionsKt.emptyList();
        }
    }

    public final List g() {
        String string = this.a.getString("season_video_memories_v1", null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List list = (List) this.b.fromJson(string, new be1().getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e("PlaybackMemory", "解析播放记忆失败: key=season_video_memories_v1", e);
            return CollectionsKt.emptyList();
        }
    }

    public final VideoVersionMemory h(MediaItem mediaItem) {
        mediaItem.getClass();
        Object obj = null;
        if (!Intrinsics.areEqual(mediaItem.getType(), "Episode")) {
            for (Object obj2 : e()) {
                if (Intrinsics.areEqual(((VideoVersionMemory) obj2).getItemId(), mediaItem.getId())) {
                    obj = obj2;
                    break;
                }
            }
            return (VideoVersionMemory) obj;
        }
        String strL = l(mediaItem);
        if (strL == null) {
            return null;
        }
        for (Object obj3 : g()) {
            if (Intrinsics.areEqual(((VideoVersionMemory) obj3).getKey(), strL)) {
                obj = obj3;
                break;
            }
        }
        return (VideoVersionMemory) obj;
    }

    public final void j(MediaItem mediaItem, String str, AudioTrackMemory audioTrackMemory) {
        mediaItem.getClass();
        final AudioTrackMemory audioTrackMemoryCopy$default = AudioTrackMemory.copy$default(audioTrackMemory, Intrinsics.areEqual(mediaItem.getType(), "Episode") ? l(mediaItem) : i(mediaItem.getId(), str), Intrinsics.areEqual(mediaItem.getType(), "Episode") ? null : mediaItem.getId(), null, null, null, null, null, System.currentTimeMillis(), Input.Keys.INSERT, null);
        boolean zAreEqual = Intrinsics.areEqual(mediaItem.getType(), "Episode");
        Gson gson = this.b;
        SharedPreferences sharedPreferences = this.a;
        if (zAreEqual) {
            if (audioTrackMemoryCopy$default.getKey() == null) {
                return;
            }
            List mutableList = CollectionsKt.toMutableList((Collection) f());
            final int i = 0;
            CollectionsKt__MutableCollectionsKt.removeAll(mutableList, new Function1() { // from class: wd1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean zAreEqual2;
                    int i2 = i;
                    AudioTrackMemory audioTrackMemory2 = audioTrackMemoryCopy$default;
                    AudioTrackMemory audioTrackMemory3 = (AudioTrackMemory) obj;
                    switch (i2) {
                        case 0:
                            audioTrackMemory3.getClass();
                            zAreEqual2 = Intrinsics.areEqual(audioTrackMemory3.getKey(), audioTrackMemory2.getKey());
                            break;
                        default:
                            audioTrackMemory3.getClass();
                            zAreEqual2 = Intrinsics.areEqual(audioTrackMemory3.getKey(), audioTrackMemory2.getKey());
                            break;
                    }
                    return Boolean.valueOf(zAreEqual2);
                }
            });
            mutableList.add(audioTrackMemoryCopy$default);
            sharedPreferences.edit().putString("season_audio_memories_v1", gson.toJson(m(mutableList, new uc1(2)))).apply();
            s01.E("保存剧集音轨记忆: key=", audioTrackMemoryCopy$default.getKey(), ", codec=", audioTrackMemoryCopy$default.getCodecType(), "PlaybackMemory");
            return;
        }
        if (audioTrackMemoryCopy$default.getKey() == null) {
            return;
        }
        List mutableList2 = CollectionsKt.toMutableList((Collection) d());
        final int i2 = 1;
        CollectionsKt__MutableCollectionsKt.removeAll(mutableList2, new Function1() { // from class: wd1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zAreEqual2;
                int i3 = i2;
                AudioTrackMemory audioTrackMemory2 = audioTrackMemoryCopy$default;
                AudioTrackMemory audioTrackMemory3 = (AudioTrackMemory) obj;
                switch (i3) {
                    case 0:
                        audioTrackMemory3.getClass();
                        zAreEqual2 = Intrinsics.areEqual(audioTrackMemory3.getKey(), audioTrackMemory2.getKey());
                        break;
                    default:
                        audioTrackMemory3.getClass();
                        zAreEqual2 = Intrinsics.areEqual(audioTrackMemory3.getKey(), audioTrackMemory2.getKey());
                        break;
                }
                return Boolean.valueOf(zAreEqual2);
            }
        });
        mutableList2.add(audioTrackMemoryCopy$default);
        sharedPreferences.edit().putString("movie_audio_memories_v1", gson.toJson(m(mutableList2, new uc1(3)))).apply();
        Log.d("PlaybackMemory", "保存电影音轨记忆: key=" + audioTrackMemoryCopy$default.getKey() + ", stream=" + audioTrackMemoryCopy$default.getApiStreamIndex());
    }

    public final void k(MediaItem mediaItem, MediaSource mediaSource, List list) {
        String id;
        Integer num;
        List mediaSources;
        mediaItem.getClass();
        mediaSource.getClass();
        String strL = Intrinsics.areEqual(mediaItem.getType(), "Episode") ? l(mediaItem) : mediaItem.getId();
        if (Intrinsics.areEqual(mediaItem.getType(), "Episode")) {
            id = null;
            num = null;
        } else {
            id = mediaItem.getId();
            num = null;
        }
        String id2 = mediaSource.getId();
        Integer num2 = num;
        String strE = ee1.e(mediaSource);
        Integer numValueOf = Integer.valueOf(VideoResolutionKt.resolveVideoResolutionSortValue(mediaSource));
        if (list == null) {
            mediaSources = mediaItem.getMediaSources();
            if (mediaSources == null) {
                mediaSources = CollectionsKt.emptyList();
            }
        } else {
            mediaSources = list;
        }
        if (!mediaSources.isEmpty()) {
            VideoVersionMemory videoVersionMemory = new VideoVersionMemory(null, null, mediaSource.getId(), ee1.e(mediaSource), Integer.valueOf(VideoResolutionKt.resolveVideoResolutionSortValue(mediaSource)), null, 0L, 99, null);
            List listB = ee1.b(mediaSources, videoVersionMemory);
            if (listB.isEmpty()) {
                listB = ee1.c(mediaSources, videoVersionMemory);
            }
            if (listB.isEmpty()) {
                listB = ee1.a(mediaSources, videoVersionMemory);
            }
            Iterator it = listB.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(((MediaSource) it.next()).getId(), mediaSource.getId())) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf2 = Integer.valueOf(i);
            if (i >= 0) {
                num2 = numValueOf2;
            }
        }
        VideoVersionMemory videoVersionMemory2 = new VideoVersionMemory(strL, id, id2, strE, numValueOf, num2, System.currentTimeMillis());
        boolean zAreEqual = Intrinsics.areEqual(mediaItem.getType(), "Episode");
        Gson gson = this.b;
        SharedPreferences sharedPreferences = this.a;
        if (!zAreEqual) {
            List mutableList = CollectionsKt.toMutableList((Collection) e());
            CollectionsKt__MutableCollectionsKt.removeAll(mutableList, (Function1) new mc0(mediaItem, 28));
            mutableList.add(videoVersionMemory2);
            sharedPreferences.edit().putString("movie_video_memories_v1", gson.toJson(m(mutableList, new uc1(5)))).apply();
            s01.E("保存电影视频版本记忆: itemId=", mediaItem.getId(), ", source=", mediaSource.getId(), "PlaybackMemory");
            return;
        }
        String strL2 = l(mediaItem);
        if (strL2 == null) {
            return;
        }
        List mutableList2 = CollectionsKt.toMutableList((Collection) g());
        CollectionsKt__MutableCollectionsKt.removeAll(mutableList2, (Function1) new dl(strL2, 17));
        mutableList2.add(videoVersionMemory2);
        sharedPreferences.edit().putString("season_video_memories_v1", gson.toJson(m(mutableList2, new uc1(4)))).apply();
        s01.E("保存剧集视频版本记忆: key=", strL2, ", source=", mediaSource.getId(), "PlaybackMemory");
    }
}
