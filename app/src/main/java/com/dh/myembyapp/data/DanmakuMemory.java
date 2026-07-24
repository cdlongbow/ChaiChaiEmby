package com.dh.myembyapp.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import defpackage.c61;
import defpackage.dl;
import defpackage.i02;
import defpackage.kb0;
import defpackage.ll0;
import defpackage.s01;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class DanmakuMemory {
    private static final String KEY_EPISODE_MEMORY = "episode_danmaku_memory";
    private static final String KEY_MOVIE_MEMORY = "movie_danmaku_memory";
    private static final String KEY_SEASON_MEMORY = "season_danmaku_memory";
    private static final int MAX_EPISODE_CACHE = 100;
    private static final int MAX_MOVIE_CACHE = 100;
    private static final int MAX_SEASON_CACHE = 100;
    private static final String PREFS_NAME = "danmaku_memory";
    private static final String TAG = "DanmakuMemory";
    private final Gson gson;
    private final SharedPreferences prefs;
    

    public DanmakuMemory(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
        this.gson = new Gson();
    }

    private final List<EpisodeDanmakuMemory> getEpisodeMemories() {
        String string = this.prefs.getString(KEY_EPISODE_MEMORY, null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List<EpisodeDanmakuMemory> list = (List) this.gson.fromJson(string, new TypeToken<List<? extends EpisodeDanmakuMemory>>() { // from class: com.dh.myembyapp.data.DanmakuMemory$getEpisodeMemories$type$1
            }.getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e(TAG, "解析剧集弹幕记忆失败", e);
            return CollectionsKt.emptyList();
        }
    }

    private final List<MovieDanmakuMemory> getMovieMemories() {
        String string = this.prefs.getString(KEY_MOVIE_MEMORY, null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List<MovieDanmakuMemory> list = (List) this.gson.fromJson(string, new TypeToken<List<? extends MovieDanmakuMemory>>() { // from class: com.dh.myembyapp.data.DanmakuMemory$getMovieMemories$type$1
            }.getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e(TAG, "解析电影弹幕记忆失败", e);
            return CollectionsKt.emptyList();
        }
    }

    private final List<SeasonDanmakuMemory> getSeasonMemories() {
        String string = this.prefs.getString(KEY_SEASON_MEMORY, null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List<SeasonDanmakuMemory> list = (List) this.gson.fromJson(string, new TypeToken<List<? extends SeasonDanmakuMemory>>() { // from class: com.dh.myembyapp.data.DanmakuMemory$getSeasonMemories$type$1
            }.getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e(TAG, "解析季级别弹幕记忆失败", e);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean saveEpisodeDanmaku$lambda$1(String str, EpisodeDanmakuMemory episodeDanmakuMemory) {
        episodeDanmakuMemory.getClass();
        return Intrinsics.areEqual(episodeDanmakuMemory.getItemId(), str);
    }

    private final void saveEpisodeMemories(List<EpisodeDanmakuMemory> list) {
        this.prefs.edit().putString(KEY_EPISODE_MEMORY, this.gson.toJson(list)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean saveMovieDanmaku$lambda$1(String str, MovieDanmakuMemory movieDanmakuMemory) {
        movieDanmakuMemory.getClass();
        return Intrinsics.areEqual(movieDanmakuMemory.getItemId(), str);
    }

    private final void saveMovieMemories(List<MovieDanmakuMemory> list) {
        this.prefs.edit().putString(KEY_MOVIE_MEMORY, this.gson.toJson(list)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean saveSeasonDanmaku$lambda$1(String str, SeasonDanmakuMemory seasonDanmakuMemory) {
        seasonDanmakuMemory.getClass();
        return Intrinsics.areEqual(seasonDanmakuMemory.getSeasonId(), str);
    }

    private final void saveSeasonMemories(List<SeasonDanmakuMemory> list) {
        this.prefs.edit().putString(KEY_SEASON_MEMORY, this.gson.toJson(list)).apply();
    }

    public final Integer extractEpisodeNumber(String episodeTitle) {
        episodeTitle.getClass();
        MatchResult matchResultFind$default = Regex.find$default(new Regex("第(\\d+)[集话]"), episodeTitle, 0, 2, null);
        if (matchResultFind$default != null) {
            return StringsKt.toIntOrNull(matchResultFind$default.getGroupValues().get(1));
        }
        MatchResult matchResultFind$default2 = Regex.find$default(new Regex("[Ss]\\d+[Ee](\\d+)"), episodeTitle, 0, 2, null);
        if (matchResultFind$default2 != null) {
            return StringsKt.toIntOrNull(matchResultFind$default2.getGroupValues().get(1));
        }
        MatchResult matchResultFind$default3 = Regex.find$default(new Regex("[Ee](\\d+)"), episodeTitle, 0, 2, null);
        if (matchResultFind$default3 != null) {
            return StringsKt.toIntOrNull(matchResultFind$default3.getGroupValues().get(1));
        }
        MatchResult matchResultFind$default4 = Regex.find$default(new Regex("^(\\d+)$"), StringsKt.trim((CharSequence) episodeTitle).toString(), 0, 2, null);
        if (matchResultFind$default4 != null) {
            return StringsKt.toIntOrNull(matchResultFind$default4.getGroupValues().get(1));
        }
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("一", 1), TuplesKt.to("二", 2), TuplesKt.to("三", 3), TuplesKt.to("四", 4), TuplesKt.to("五", 5), TuplesKt.to("六", 6), TuplesKt.to("七", 7), TuplesKt.to("八", 8), TuplesKt.to("九", 9), TuplesKt.to("十", 10), TuplesKt.to("十一", 11), TuplesKt.to("十二", 12), TuplesKt.to("十三", 13), TuplesKt.to("十四", 14), TuplesKt.to("十五", 15), TuplesKt.to("十六", 16), TuplesKt.to("十七", 17), TuplesKt.to("十八", 18), TuplesKt.to("十九", 19), TuplesKt.to("二十", 20));
        MatchResult matchResultFind$default5 = Regex.find$default(new Regex("第([一二三四五六七八九十]+)[集话]"), episodeTitle, 0, 2, null);
        if (matchResultFind$default5 != null) {
            return (Integer) mapMapOf.get(matchResultFind$default5.getGroupValues().get(1));
        }
        return null;
    }

    public final EpisodeDanmakuMemory getEpisodeDanmaku(String itemId) {
        Object next;
        itemId.getClass();
        Iterator<T> it = getEpisodeMemories().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((EpisodeDanmakuMemory) next).getItemId(), itemId));
        EpisodeDanmakuMemory episodeDanmakuMemory = (EpisodeDanmakuMemory) next;
        if (episodeDanmakuMemory == null) {
            ll0.l("未找到剧集弹幕记忆: itemId=", itemId, TAG);
            return episodeDanmakuMemory;
        }
        Log.d(TAG, "========== 查找到剧集弹幕记忆 ==========");
        Log.d(TAG, "媒体ID: " + itemId);
        s01.E("弹幕标题: ", episodeDanmakuMemory.getAnimeTitle(), " - ", episodeDanmakuMemory.getEpisodeTitle(), TAG);
        Log.d(TAG, "弹幕API: " + episodeDanmakuMemory.getApiUrl());
        Log.d(TAG, "episodeId: " + episodeDanmakuMemory.getEpisodeId());
        Log.d(TAG, "记忆时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(episodeDanmakuMemory.getTimestamp())));
        Log.d(TAG, "========================================");
        return episodeDanmakuMemory;
    }

    public final MovieDanmakuMemory getMovieDanmaku(String itemId) {
        Object next;
        itemId.getClass();
        Iterator<T> it = getMovieMemories().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((MovieDanmakuMemory) next).getItemId(), itemId));
        MovieDanmakuMemory movieDanmakuMemory = (MovieDanmakuMemory) next;
        if (movieDanmakuMemory == null) {
            ll0.l("未找到电影弹幕记忆: itemId=", itemId, TAG);
            return movieDanmakuMemory;
        }
        Log.d(TAG, "========== 查找到电影弹幕记忆 ==========");
        Log.d(TAG, "媒体ID: " + itemId);
        s01.E("弹幕标题: ", movieDanmakuMemory.getAnimeTitle(), " - ", movieDanmakuMemory.getEpisodeTitle(), TAG);
        Log.d(TAG, "弹幕API: " + movieDanmakuMemory.getApiUrl());
        Log.d(TAG, "episodeId: " + movieDanmakuMemory.getEpisodeId());
        Log.d(TAG, "记忆时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(movieDanmakuMemory.getTimestamp())));
        Log.d(TAG, "========================================");
        return movieDanmakuMemory;
    }

    public final SeasonDanmakuMemory getSeasonDanmaku(String seasonId) {
        Object next;
        seasonId.getClass();
        Iterator<T> it = getSeasonMemories().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((SeasonDanmakuMemory) next).getSeasonId(), seasonId));
        SeasonDanmakuMemory seasonDanmakuMemory = (SeasonDanmakuMemory) next;
        if (seasonDanmakuMemory == null) {
            ll0.l("未找到季级别弹幕记忆: seasonId=", seasonId, TAG);
            return seasonDanmakuMemory;
        }
        Log.d(TAG, "========== 查找到季级别弹幕记忆 ==========");
        Log.d(TAG, "季ID: " + seasonId);
        Log.d(TAG, "弹幕番剧: " + seasonDanmakuMemory.getAnimeTitle());
        Log.d(TAG, "弹幕API: " + seasonDanmakuMemory.getApiUrl());
        Log.d(TAG, "animeId: " + seasonDanmakuMemory.getAnimeId());
        Log.d(TAG, "记忆时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(seasonDanmakuMemory.getTimestamp())));
        Log.d(TAG, "==========================================");
        return seasonDanmakuMemory;
    }

    public final boolean matchEpisodeNumber(int currentEpisodeNumber, String danmakuEpisodeTitle) {
        danmakuEpisodeTitle.getClass();
        Integer numExtractEpisodeNumber = extractEpisodeNumber(danmakuEpisodeTitle);
        boolean z = numExtractEpisodeNumber != null && numExtractEpisodeNumber.intValue() == currentEpisodeNumber;
        Log.d(TAG, "集数匹配: 当前集数=" + currentEpisodeNumber + ", 弹幕标题=\"" + danmakuEpisodeTitle + "\", 提取集数=" + numExtractEpisodeNumber + ", 匹配=" + (z ? "✓" : "✗"));
        return z;
    }

    public final void saveEpisodeDanmaku(String itemId, String apiUrl, long episodeId, String animeTitle, String episodeTitle) {
        Object next;
        itemId.getClass();
        apiUrl.getClass();
        animeTitle.getClass();
        episodeTitle.getClass();
        List<EpisodeDanmakuMemory> mutableList = CollectionsKt.toMutableList((Collection) getEpisodeMemories());
        Iterator<T> it = mutableList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((EpisodeDanmakuMemory) next).getItemId(), itemId));
        EpisodeDanmakuMemory episodeDanmakuMemory = (EpisodeDanmakuMemory) next;
        if (episodeDanmakuMemory != null) {
            Log.d(TAG, "========== 更新剧集弹幕记忆 ==========");
            Log.d(TAG, "媒体ID: ".concat(itemId));
            s01.E("旧记忆: ", episodeDanmakuMemory.getAnimeTitle(), " - ", episodeDanmakuMemory.getEpisodeTitle(), TAG);
            Log.d(TAG, "旧API: " + episodeDanmakuMemory.getApiUrl());
            Log.d(TAG, "旧episodeId: " + episodeDanmakuMemory.getEpisodeId());
            Log.d(TAG, "新记忆: " + animeTitle + " - " + episodeTitle);
            Log.d(TAG, "新API: ".concat(apiUrl));
            StringBuilder sb = new StringBuilder("新episodeId: ");
            sb.append(episodeId);
            Log.d(TAG, sb.toString());
            Log.d(TAG, "=====================================");
        } else {
            Log.d(TAG, "========== 新增剧集弹幕记忆 ==========");
            Log.d(TAG, "媒体ID: ".concat(itemId));
            s01.E("弹幕标题: ", animeTitle, " - ", episodeTitle, TAG);
            Log.d(TAG, "弹幕API: ".concat(apiUrl));
            Log.d(TAG, "episodeId: " + episodeId);
            Log.d(TAG, "=====================================");
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(itemId, 5));
        mutableList.add(new EpisodeDanmakuMemory(itemId, apiUrl, episodeId, animeTitle, episodeTitle, 0L, 32, null));
        if (mutableList.size() > 100) {
            Log.d(TAG, "剧集记忆缓存已满，删除" + CollectionsKt.take(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.DanmakuMemory$saveEpisodeDanmaku$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((DanmakuMemory.EpisodeDanmakuMemory) t).getTimestamp()), Long.valueOf(((DanmakuMemory.EpisodeDanmakuMemory) t2).getTimestamp()));
                }
            }), mutableList.size() - 100).size() + "个旧记忆");
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.DanmakuMemory$saveEpisodeDanmaku$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((DanmakuMemory.EpisodeDanmakuMemory) t).getTimestamp()), Long.valueOf(((DanmakuMemory.EpisodeDanmakuMemory) t2).getTimestamp()));
                }
            }), 100);
        }
        saveEpisodeMemories(mutableList);
        Log.d(TAG, "剧集弹幕记忆已保存，当前缓存数量: " + mutableList.size() + "/100");
    }

    public final void saveMovieDanmaku(String itemId, String apiUrl, long episodeId, String animeTitle, String episodeTitle) {
        Object next;
        itemId.getClass();
        apiUrl.getClass();
        animeTitle.getClass();
        episodeTitle.getClass();
        List<MovieDanmakuMemory> mutableList = CollectionsKt.toMutableList((Collection) getMovieMemories());
        Iterator<T> it = mutableList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((MovieDanmakuMemory) next).getItemId(), itemId));
        MovieDanmakuMemory movieDanmakuMemory = (MovieDanmakuMemory) next;
        if (movieDanmakuMemory != null) {
            Log.d(TAG, "========== 更新电影弹幕记忆 ==========");
            Log.d(TAG, "媒体ID: ".concat(itemId));
            s01.E("旧记忆: ", movieDanmakuMemory.getAnimeTitle(), " - ", movieDanmakuMemory.getEpisodeTitle(), TAG);
            Log.d(TAG, "旧API: " + movieDanmakuMemory.getApiUrl());
            Log.d(TAG, "旧episodeId: " + movieDanmakuMemory.getEpisodeId());
            Log.d(TAG, "新记忆: " + animeTitle + " - " + episodeTitle);
            Log.d(TAG, "新API: ".concat(apiUrl));
            StringBuilder sb = new StringBuilder("新episodeId: ");
            sb.append(episodeId);
            Log.d(TAG, sb.toString());
            Log.d(TAG, "=====================================");
        } else {
            Log.d(TAG, "========== 新增电影弹幕记忆 ==========");
            Log.d(TAG, "媒体ID: ".concat(itemId));
            s01.E("弹幕标题: ", animeTitle, " - ", episodeTitle, TAG);
            Log.d(TAG, "弹幕API: ".concat(apiUrl));
            Log.d(TAG, "episodeId: " + episodeId);
            Log.d(TAG, "=====================================");
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(itemId, 4));
        mutableList.add(new MovieDanmakuMemory(itemId, apiUrl, episodeId, animeTitle, episodeTitle, 0L, 32, null));
        if (mutableList.size() > 100) {
            Log.d(TAG, "电影记忆缓存已满，删除" + CollectionsKt.take(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.DanmakuMemory$saveMovieDanmaku$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((DanmakuMemory.MovieDanmakuMemory) t).getTimestamp()), Long.valueOf(((DanmakuMemory.MovieDanmakuMemory) t2).getTimestamp()));
                }
            }), mutableList.size() - 100).size() + "个旧记忆");
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.DanmakuMemory$saveMovieDanmaku$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((DanmakuMemory.MovieDanmakuMemory) t).getTimestamp()), Long.valueOf(((DanmakuMemory.MovieDanmakuMemory) t2).getTimestamp()));
                }
            }), 100);
        }
        saveMovieMemories(mutableList);
        Log.d(TAG, "电影弹幕记忆已保存，当前缓存数量: " + mutableList.size() + "/100");
    }

    public final void saveSeasonDanmaku(String seasonId, String apiUrl, int animeId, String animeTitle) {
        Object next;
        s01.D(seasonId, apiUrl, animeTitle);
        List<SeasonDanmakuMemory> mutableList = CollectionsKt.toMutableList((Collection) getSeasonMemories());
        Iterator<T> it = mutableList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((SeasonDanmakuMemory) next).getSeasonId(), seasonId));
        SeasonDanmakuMemory seasonDanmakuMemory = (SeasonDanmakuMemory) next;
        if (seasonDanmakuMemory != null) {
            Log.d(TAG, "========== 更新季级别弹幕记忆 ==========");
            Log.d(TAG, "季ID: ".concat(seasonId));
            Log.d(TAG, "旧记忆: " + seasonDanmakuMemory.getAnimeTitle());
            Log.d(TAG, "旧API: " + seasonDanmakuMemory.getApiUrl());
            Log.d(TAG, "旧animeId: " + seasonDanmakuMemory.getAnimeId());
            Log.d(TAG, "新记忆: ".concat(animeTitle));
            Log.d(TAG, "新API: ".concat(apiUrl));
            Log.d(TAG, "新animeId: " + animeId);
            Log.d(TAG, "========================================");
        } else {
            Log.d(TAG, "========== 新增季级别弹幕记忆 ==========");
            Log.d(TAG, "季ID: ".concat(seasonId));
            Log.d(TAG, "弹幕番剧: ".concat(animeTitle));
            Log.d(TAG, "弹幕API: ".concat(apiUrl));
            Log.d(TAG, "animeId: " + animeId);
            Log.d(TAG, "========================================");
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(seasonId, 3));
        mutableList.add(new SeasonDanmakuMemory(seasonId, apiUrl, animeId, animeTitle, 0L, 16, null));
        if (mutableList.size() > 100) {
            Log.d(TAG, "季级别记忆缓存已满，删除" + CollectionsKt.take(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.DanmakuMemory$saveSeasonDanmaku$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((DanmakuMemory.SeasonDanmakuMemory) t).getTimestamp()), Long.valueOf(((DanmakuMemory.SeasonDanmakuMemory) t2).getTimestamp()));
                }
            }), mutableList.size() - 100).size() + "个旧记忆");
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.DanmakuMemory$saveSeasonDanmaku$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((DanmakuMemory.SeasonDanmakuMemory) t).getTimestamp()), Long.valueOf(((DanmakuMemory.SeasonDanmakuMemory) t2).getTimestamp()));
                }
            }), 100);
        }
        saveSeasonMemories(mutableList);
        Log.d(TAG, "季级别弹幕记忆已保存，当前缓存数量: " + mutableList.size() + "/100");
    }

        public static final  class SeasonDanmakuMemory {
        
        private final int animeId;
        private final String animeTitle;
        private final String apiUrl;
        private final String seasonId;
        private final long timestamp;

        public /* synthetic */ SeasonDanmakuMemory(String str, String str2, int i, String str3, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, str3, (i2 & 16) != 0 ? System.currentTimeMillis() : j);
        }

        public static /* synthetic */ SeasonDanmakuMemory copy$default(SeasonDanmakuMemory seasonDanmakuMemory, String str, String str2, int i, String str3, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = seasonDanmakuMemory.seasonId;
            }
            if ((i2 & 2) != 0) {
                str2 = seasonDanmakuMemory.apiUrl;
            }
            if ((i2 & 4) != 0) {
                i = seasonDanmakuMemory.animeId;
            }
            if ((i2 & 8) != 0) {
                str3 = seasonDanmakuMemory.animeTitle;
            }
            if ((i2 & 16) != 0) {
                j = seasonDanmakuMemory.timestamp;
            }
            long j2 = j;
            return seasonDanmakuMemory.copy(str, str2, i, str3, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        /* JADX INFO: renamed from: component4, reason: from getter */

        /* JADX INFO: renamed from: component5, reason: from getter */

        public final SeasonDanmakuMemory copy(String seasonId, String apiUrl, int animeId, String animeTitle, long timestamp) {
            seasonId.getClass();
            apiUrl.getClass();
            animeTitle.getClass();
            return new SeasonDanmakuMemory(seasonId, apiUrl, animeId, animeTitle, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeasonDanmakuMemory)) {
                return false;
            }
            SeasonDanmakuMemory seasonDanmakuMemory = (SeasonDanmakuMemory) other;
            return Intrinsics.areEqual(this.seasonId, seasonDanmakuMemory.seasonId) && Intrinsics.areEqual(this.apiUrl, seasonDanmakuMemory.apiUrl) && this.animeId == seasonDanmakuMemory.animeId && Intrinsics.areEqual(this.animeTitle, seasonDanmakuMemory.animeTitle) && this.timestamp == seasonDanmakuMemory.timestamp;
        }






        public int hashCode() {
            int i = i02.i((i02.i(this.seasonId.hashCode() * 31, 31, this.apiUrl) + this.animeId) * 31, 31, this.animeTitle);
            long j = this.timestamp;
            return i + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            String str = this.seasonId;
            String str2 = this.apiUrl;
            int i = this.animeId;
            String str3 = this.animeTitle;
            long j = this.timestamp;
            StringBuilder sbZ = kb0.z("SeasonDanmakuMemory(seasonId=", str, ", apiUrl=", str2, ", animeId=");
            sbZ.append(i);
            sbZ.append(", animeTitle=");
            sbZ.append(str3);
            sbZ.append(", timestamp=");
            return c61.i(j, ")", sbZ);
        }

        public SeasonDanmakuMemory(String str, String str2, int i, String str3, long j) {
            s01.D(str, str2, str3);
            this.seasonId = str;
            this.apiUrl = str2;
            this.animeId = i;
            this.animeTitle = str3;
            this.timestamp = j;
        }
    }

        public static final  class EpisodeDanmakuMemory {
        
        private final String animeTitle;
        private final String apiUrl;
        private final long episodeId;
        private final String episodeTitle;
        private final String itemId;
        private final long timestamp;

        public EpisodeDanmakuMemory(String str, String str2, long j, String str3, String str4, long j2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.itemId = str;
            this.apiUrl = str2;
            this.episodeId = j;
            this.animeTitle = str3;
            this.episodeTitle = str4;
            this.timestamp = j2;
        }

        public static /* synthetic */ EpisodeDanmakuMemory copy$default(EpisodeDanmakuMemory episodeDanmakuMemory, String str, String str2, long j, String str3, String str4, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = episodeDanmakuMemory.itemId;
            }
            if ((i & 2) != 0) {
                str2 = episodeDanmakuMemory.apiUrl;
            }
            if ((i & 4) != 0) {
                j = episodeDanmakuMemory.episodeId;
            }
            if ((i & 8) != 0) {
                str3 = episodeDanmakuMemory.animeTitle;
            }
            if ((i & 16) != 0) {
                str4 = episodeDanmakuMemory.episodeTitle;
            }
            if ((i & 32) != 0) {
                j2 = episodeDanmakuMemory.timestamp;
            }
            long j3 = j;
            return episodeDanmakuMemory.copy(str, str2, j3, str3, str4, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        /* JADX INFO: renamed from: component4, reason: from getter */

        /* JADX INFO: renamed from: component5, reason: from getter */

        /* JADX INFO: renamed from: component6, reason: from getter */

        public final EpisodeDanmakuMemory copy(String itemId, String apiUrl, long episodeId, String animeTitle, String episodeTitle, long timestamp) {
            itemId.getClass();
            apiUrl.getClass();
            animeTitle.getClass();
            episodeTitle.getClass();
            return new EpisodeDanmakuMemory(itemId, apiUrl, episodeId, animeTitle, episodeTitle, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EpisodeDanmakuMemory)) {
                return false;
            }
            EpisodeDanmakuMemory episodeDanmakuMemory = (EpisodeDanmakuMemory) other;
            return Intrinsics.areEqual(this.itemId, episodeDanmakuMemory.itemId) && Intrinsics.areEqual(this.apiUrl, episodeDanmakuMemory.apiUrl) && this.episodeId == episodeDanmakuMemory.episodeId && Intrinsics.areEqual(this.animeTitle, episodeDanmakuMemory.animeTitle) && Intrinsics.areEqual(this.episodeTitle, episodeDanmakuMemory.episodeTitle) && this.timestamp == episodeDanmakuMemory.timestamp;
        }







        public int hashCode() {
            int i = i02.i(this.itemId.hashCode() * 31, 31, this.apiUrl);
            long j = this.episodeId;
            int i2 = i02.i(i02.i((i + ((int) (j ^ (j >>> 32)))) * 31, 31, this.animeTitle), 31, this.episodeTitle);
            long j2 = this.timestamp;
            return i2 + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            String str = this.itemId;
            String str2 = this.apiUrl;
            long j = this.episodeId;
            String str3 = this.animeTitle;
            String str4 = this.episodeTitle;
            long j2 = this.timestamp;
            StringBuilder sbZ = kb0.z("EpisodeDanmakuMemory(itemId=", str, ", apiUrl=", str2, ", episodeId=");
            sbZ.append(j);
            sbZ.append(", animeTitle=");
            sbZ.append(str3);
            sbZ.append(", episodeTitle=");
            sbZ.append(str4);
            sbZ.append(", timestamp=");
            return c61.i(j2, ")", sbZ);
        }

        public /* synthetic */ EpisodeDanmakuMemory(String str, String str2, long j, String str3, String str4, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j, str3, str4, (i & 32) != 0 ? System.currentTimeMillis() : j2);
        }
    }

        public static final  class MovieDanmakuMemory {
        
        private final String animeTitle;
        private final String apiUrl;
        private final long episodeId;
        private final String episodeTitle;
        private final String itemId;
        private final long timestamp;

        public MovieDanmakuMemory(String str, String str2, long j, String str3, String str4, long j2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.itemId = str;
            this.apiUrl = str2;
            this.episodeId = j;
            this.animeTitle = str3;
            this.episodeTitle = str4;
            this.timestamp = j2;
        }

        public static /* synthetic */ MovieDanmakuMemory copy$default(MovieDanmakuMemory movieDanmakuMemory, String str, String str2, long j, String str3, String str4, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = movieDanmakuMemory.itemId;
            }
            if ((i & 2) != 0) {
                str2 = movieDanmakuMemory.apiUrl;
            }
            if ((i & 4) != 0) {
                j = movieDanmakuMemory.episodeId;
            }
            if ((i & 8) != 0) {
                str3 = movieDanmakuMemory.animeTitle;
            }
            if ((i & 16) != 0) {
                str4 = movieDanmakuMemory.episodeTitle;
            }
            if ((i & 32) != 0) {
                j2 = movieDanmakuMemory.timestamp;
            }
            long j3 = j;
            return movieDanmakuMemory.copy(str, str2, j3, str3, str4, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        /* JADX INFO: renamed from: component4, reason: from getter */

        /* JADX INFO: renamed from: component5, reason: from getter */

        /* JADX INFO: renamed from: component6, reason: from getter */

        public final MovieDanmakuMemory copy(String itemId, String apiUrl, long episodeId, String animeTitle, String episodeTitle, long timestamp) {
            itemId.getClass();
            apiUrl.getClass();
            animeTitle.getClass();
            episodeTitle.getClass();
            return new MovieDanmakuMemory(itemId, apiUrl, episodeId, animeTitle, episodeTitle, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MovieDanmakuMemory)) {
                return false;
            }
            MovieDanmakuMemory movieDanmakuMemory = (MovieDanmakuMemory) other;
            return Intrinsics.areEqual(this.itemId, movieDanmakuMemory.itemId) && Intrinsics.areEqual(this.apiUrl, movieDanmakuMemory.apiUrl) && this.episodeId == movieDanmakuMemory.episodeId && Intrinsics.areEqual(this.animeTitle, movieDanmakuMemory.animeTitle) && Intrinsics.areEqual(this.episodeTitle, movieDanmakuMemory.episodeTitle) && this.timestamp == movieDanmakuMemory.timestamp;
        }







        public int hashCode() {
            int i = i02.i(this.itemId.hashCode() * 31, 31, this.apiUrl);
            long j = this.episodeId;
            int i2 = i02.i(i02.i((i + ((int) (j ^ (j >>> 32)))) * 31, 31, this.animeTitle), 31, this.episodeTitle);
            long j2 = this.timestamp;
            return i2 + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            String str = this.itemId;
            String str2 = this.apiUrl;
            long j = this.episodeId;
            String str3 = this.animeTitle;
            String str4 = this.episodeTitle;
            long j2 = this.timestamp;
            StringBuilder sbZ = kb0.z("MovieDanmakuMemory(itemId=", str, ", apiUrl=", str2, ", episodeId=");
            sbZ.append(j);
            sbZ.append(", animeTitle=");
            sbZ.append(str3);
            sbZ.append(", episodeTitle=");
            sbZ.append(str4);
            sbZ.append(", timestamp=");
            return c61.i(j2, ")", sbZ);
        }

        public /* synthetic */ MovieDanmakuMemory(String str, String str2, long j, String str3, String str4, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j, str3, str4, (i & 32) != 0 ? System.currentTimeMillis() : j2);
        }
    }
}
