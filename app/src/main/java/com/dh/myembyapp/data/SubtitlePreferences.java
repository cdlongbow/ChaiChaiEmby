package com.dh.myembyapp.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import defpackage.dl;
import defpackage.i02;
import defpackage.kb0;
import defpackage.mr;
import defpackage.qi0;
import defpackage.s01;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 42\u00020\u0001:\u000545678B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\"\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017J(\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u0017J \u0010 \u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017J\u001a\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#H\u0002J\u0016\u0010$\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0#H\u0002J;\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017J&\u0010.\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017J\u001e\u00101\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0010J\u000e\u00102\u001a\b\u0012\u0004\u0012\u0002000#H\u0002J\u0016\u00103\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002000#H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/dh/myembyapp/data/SubtitlePreferences;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "gson", "Lcom/google/gson/Gson;", "isSubtitlesEnabled", "", "saveSubtitlesEnabled", "", "enabled", "getBitmapSubtitleBrightness", "", "saveBitmapSubtitleBrightness", "value", "isBitmapSubtitleBrightnessEnabled", "saveBitmapSubtitleBrightnessEnabled", "saveSeriesSubtitleSelection", "seriesId", "", "languageType", "subtitleTitle", "clearSeriesSubtitleSelection", "saveSeriesDisplaySettings", "settings", "Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleDisplaySettings;", "getSeriesSubtitlePref", "Lcom/dh/myembyapp/data/SubtitlePreferences$SeriesSubtitlePref;", "getSeriesDisplaySettings", "makeTrackKey", "getSeriesPrefs", "", "saveSeriesPrefs", "list", "saveMovieSubtitleSelection", "itemId", "mediaSourceId", "trackIndex", "apiStreamIndex", "trackTitle", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V", "clearMovieSubtitleSelection", "saveMovieDisplaySettings", "getMovieSubtitlePref", "Lcom/dh/myembyapp/data/SubtitlePreferences$MovieSubtitlePref;", "getMovieDisplaySettings", "getMoviePrefs", "saveMoviePrefs", "Companion", "SubtitleColor", "SubtitleDisplaySettings", "SeriesSubtitlePref", "MovieSubtitlePref", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SubtitlePreferences {
    public static final int BITMAP_SUBTITLE_BRIGHTNESS_DEFAULT = 80;
    public static final int BITMAP_SUBTITLE_BRIGHTNESS_MAX = 100;
    public static final int BITMAP_SUBTITLE_BRIGHTNESS_MIN = 5;
    public static final int BITMAP_SUBTITLE_BRIGHTNESS_STEP = 5;
    private static final String KEY_BITMAP_SUBTITLE_BRIGHTNESS = "bitmap_subtitle_brightness";
    private static final String KEY_BITMAP_SUBTITLE_BRIGHTNESS_ENABLED = "bitmap_subtitle_brightness_enabled";
    private static final String KEY_MOVIE_PREFS = "movie_subtitle_prefs_v2";
    private static final String KEY_SERIES_PREFS = "series_subtitle_prefs_v2";
    private static final String KEY_SUBTITLES_ENABLED = "subtitles_enabled";
    private static final int MAX_MOVIE_CACHE = 100;
    private static final int MAX_SERIES_CACHE = 100;
    private static final String PREFS_NAME = "subtitle_preferences";
    private static final String TAG = "SubtitlePrefs";
    private final Gson gson;
    private final SharedPreferences prefs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/data/SubtitlePreferences$Companion;", "", "<init>", "()V", "TAG", "", "PREFS_NAME", "KEY_SERIES_PREFS", "KEY_MOVIE_PREFS", "KEY_SUBTITLES_ENABLED", "KEY_BITMAP_SUBTITLE_BRIGHTNESS", "KEY_BITMAP_SUBTITLE_BRIGHTNESS_ENABLED", "MAX_SERIES_CACHE", "", "MAX_MOVIE_CACHE", "BITMAP_SUBTITLE_BRIGHTNESS_MIN", "BITMAP_SUBTITLE_BRIGHTNESS_MAX", "BITMAP_SUBTITLE_BRIGHTNESS_STEP", "BITMAP_SUBTITLE_BRIGHTNESS_DEFAULT", "normalizeBitmapSubtitleBrightness", "value", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int normalizeBitmapSubtitleBrightness(int value) {
            if (value <= 0) {
                return 80;
            }
            int iCoerceIn = RangesKt.coerceIn(value, 5, 100);
            return RangesKt.coerceIn(iCoerceIn - (iCoerceIn % 5), 5, 100);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleColor;", "", "colorValue", "", "displayName", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getColorValue", "()I", "getDisplayName", "()Ljava/lang/String;", "WHITE", "YELLOW", "CYAN", "GREEN", "MAGENTA", "RED", "BLUE", "ORANGE", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum SubtitleColor {
        WHITE(-1, "白色"),
        YELLOW(InputDeviceCompat.SOURCE_ANY, "黄色"),
        CYAN(-16711681, "青色"),
        GREEN(-16711936, "绿色"),
        MAGENTA(-65281, "洋红"),
        RED(SupportMenu.CATEGORY_MASK, "红色"),
        BLUE(-16776961, "蓝色"),
        ORANGE(-23296, "橙色");

        private final int colorValue;
        private final String displayName;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleColor$Companion;", "", "<init>", "()V", "fromOrdinal", "Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleColor;", "ordinal", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SubtitleColor fromOrdinal(int ordinal) {
                EnumEntries<SubtitleColor> entries = SubtitleColor.getEntries();
                return (ordinal < 0 || ordinal >= entries.size()) ? SubtitleColor.WHITE : entries.get(ordinal);
            }

            private Companion() {
            }
        }

        SubtitleColor(int i, String str) {
            this.colorValue = i;
            this.displayName = str;
        }

        public static EnumEntries<SubtitleColor> getEntries() {
            return $ENTRIES;
        }


    }

    public SubtitlePreferences(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
        this.gson = new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearMovieSubtitleSelection$lambda$0(String str, MovieSubtitlePref movieSubtitlePref) {
        movieSubtitlePref.getClass();
        return Intrinsics.areEqual(movieSubtitlePref.getItemId() + "|" + movieSubtitlePref.getMediaSourceId(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearSeriesSubtitleSelection$lambda$0(String str, SeriesSubtitlePref seriesSubtitlePref) {
        seriesSubtitlePref.getClass();
        return Intrinsics.areEqual(seriesSubtitlePref.getSeriesId(), str);
    }

    private final List<MovieSubtitlePref> getMoviePrefs() {
        String string = this.prefs.getString(KEY_MOVIE_PREFS, null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List<MovieSubtitlePref> list = (List) this.gson.fromJson(string, new TypeToken<List<? extends MovieSubtitlePref>>() { // from class: com.dh.myembyapp.data.SubtitlePreferences$getMoviePrefs$type$1
            }.getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e(TAG, "解析电影偏好失败", e);
            return CollectionsKt.emptyList();
        }
    }

    private final List<SeriesSubtitlePref> getSeriesPrefs() {
        String string = this.prefs.getString(KEY_SERIES_PREFS, null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List<SeriesSubtitlePref> list = (List) this.gson.fromJson(string, new TypeToken<List<? extends SeriesSubtitlePref>>() { // from class: com.dh.myembyapp.data.SubtitlePreferences$getSeriesPrefs$type$1
            }.getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e(TAG, "解析剧集偏好失败", e);
            return CollectionsKt.emptyList();
        }
    }

    private final String makeTrackKey(String languageType, String subtitleTitle) {
        if (subtitleTitle == null) {
            subtitleTitle = "";
        }
        return mr.C(languageType, "|", subtitleTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean saveMovieDisplaySettings$lambda$0(String str, MovieSubtitlePref movieSubtitlePref) {
        movieSubtitlePref.getClass();
        return Intrinsics.areEqual(movieSubtitlePref.getItemId() + "|" + movieSubtitlePref.getMediaSourceId(), str);
    }

    private final void saveMoviePrefs(List<MovieSubtitlePref> list) {
        this.prefs.edit().putString(KEY_MOVIE_PREFS, this.gson.toJson(list)).apply();
    }

    public static /* synthetic */ void saveMovieSubtitleSelection$default(SubtitlePreferences subtitlePreferences, String str, String str2, int i, Integer num, String str3, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        subtitlePreferences.saveMovieSubtitleSelection(str, str2, i, num, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean saveMovieSubtitleSelection$lambda$0(String str, MovieSubtitlePref movieSubtitlePref) {
        movieSubtitlePref.getClass();
        return Intrinsics.areEqual(movieSubtitlePref.getItemId() + "|" + movieSubtitlePref.getMediaSourceId(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean saveSeriesDisplaySettings$lambda$0(String str, SeriesSubtitlePref seriesSubtitlePref) {
        seriesSubtitlePref.getClass();
        return Intrinsics.areEqual(seriesSubtitlePref.getSeriesId(), str);
    }

    private final void saveSeriesPrefs(List<SeriesSubtitlePref> list) {
        this.prefs.edit().putString(KEY_SERIES_PREFS, this.gson.toJson(list)).apply();
    }

    public static /* synthetic */ void saveSeriesSubtitleSelection$default(SubtitlePreferences subtitlePreferences, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        subtitlePreferences.saveSeriesSubtitleSelection(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean saveSeriesSubtitleSelection$lambda$0(String str, SeriesSubtitlePref seriesSubtitlePref) {
        seriesSubtitlePref.getClass();
        return Intrinsics.areEqual(seriesSubtitlePref.getSeriesId(), str);
    }

    public final void clearMovieSubtitleSelection(String itemId, String mediaSourceId) {
        itemId.getClass();
        mediaSourceId.getClass();
        MovieSubtitlePref movieSubtitlePref = getMovieSubtitlePref(itemId, mediaSourceId);
        if (movieSubtitlePref == null) {
            return;
        }
        List<MovieSubtitlePref> mutableList = CollectionsKt.toMutableList((Collection) getMoviePrefs());
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(mr.C(itemId, "|", mediaSourceId), 23));
        mutableList.add(MovieSubtitlePref.copy$default(movieSubtitlePref, null, null, 0, null, null, null, Boolean.FALSE, System.currentTimeMillis(), 63, null));
        if (mutableList.size() > 100) {
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.SubtitlePreferences$clearMovieSubtitleSelection$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((SubtitlePreferences.MovieSubtitlePref) t).getTimestamp()), Long.valueOf(((SubtitlePreferences.MovieSubtitlePref) t2).getTimestamp()));
                }
            }), 100);
        }
        saveMoviePrefs(mutableList);
        s01.E("清除电影字幕选择记忆: itemId=", itemId, ", mediaSourceId=", mediaSourceId, TAG);
    }

    public final void clearSeriesSubtitleSelection(String seriesId) {
        seriesId.getClass();
        SeriesSubtitlePref seriesSubtitlePref = getSeriesSubtitlePref(seriesId);
        if (seriesSubtitlePref == null) {
            return;
        }
        List<SeriesSubtitlePref> mutableList = CollectionsKt.toMutableList((Collection) getSeriesPrefs());
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(seriesId, 24));
        mutableList.add(SeriesSubtitlePref.copy$default(seriesSubtitlePref, null, null, null, null, Boolean.FALSE, System.currentTimeMillis(), 15, null));
        if (mutableList.size() > 100) {
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.SubtitlePreferences$clearSeriesSubtitleSelection$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((SubtitlePreferences.SeriesSubtitlePref) t).getTimestamp()), Long.valueOf(((SubtitlePreferences.SeriesSubtitlePref) t2).getTimestamp()));
                }
            }), 100);
        }
        saveSeriesPrefs(mutableList);
        Log.d(TAG, "清除剧集字幕选择记忆: seriesId=".concat(seriesId));
    }

    public final int getBitmapSubtitleBrightness() {
        return INSTANCE.normalizeBitmapSubtitleBrightness(this.prefs.getInt(KEY_BITMAP_SUBTITLE_BRIGHTNESS, 80));
    }

    public final SubtitleDisplaySettings getMovieDisplaySettings(String itemId, String mediaSourceId, int trackIndex) {
        itemId.getClass();
        mediaSourceId.getClass();
        MovieSubtitlePref movieSubtitlePref = getMovieSubtitlePref(itemId, mediaSourceId);
        if (movieSubtitlePref == null) {
            return new SubtitleDisplaySettings(0.0f, 0.0f, 0L, 0, 15, null);
        }
        SubtitleDisplaySettings subtitleDisplaySettings = movieSubtitlePref.getTrackSettings().get(Integer.valueOf(trackIndex));
        Log.d(TAG, "获取电影字幕设置: trackIndex=" + trackIndex + ", 已存储的indexes=" + movieSubtitlePref.getTrackSettings().keySet() + ", 找到=" + (subtitleDisplaySettings != null));
        if (subtitleDisplaySettings == null) {
            return new SubtitleDisplaySettings(0.0f, 0.0f, 0L, 0, 15, null);
        }
        return subtitleDisplaySettings;
    }

    public final MovieSubtitlePref getMovieSubtitlePref(String itemId, String mediaSourceId) {
        Object next;
        itemId.getClass();
        mediaSourceId.getClass();
        Iterator<T> it = getMoviePrefs().iterator();
        while (it.hasNext()) {
            next = it.next();
            MovieSubtitlePref movieSubtitlePref = (MovieSubtitlePref) next;
            if (Intrinsics.areEqual(movieSubtitlePref.getItemId(), itemId) && Intrinsics.areEqual(movieSubtitlePref.getMediaSourceId(), mediaSourceId)) {
                return (MovieSubtitlePref) next;
            }
        }
        next = null;
        return (MovieSubtitlePref) next;
    }

    public final SubtitleDisplaySettings getSeriesDisplaySettings(String seriesId, String languageType, String subtitleTitle) {
        seriesId.getClass();
        languageType.getClass();
        SeriesSubtitlePref seriesSubtitlePref = getSeriesSubtitlePref(seriesId);
        if (seriesSubtitlePref == null) {
            return new SubtitleDisplaySettings(0.0f, 0.0f, 0L, 0, 15, null);
        }
        String strMakeTrackKey = makeTrackKey(languageType, subtitleTitle);
        SubtitleDisplaySettings subtitleDisplaySettings = seriesSubtitlePref.getTrackSettings().get(strMakeTrackKey);
        Log.d(TAG, "获取剧集字幕设置: trackKey=" + strMakeTrackKey + ", 已存储的keys=" + seriesSubtitlePref.getTrackSettings().keySet() + ", 找到=" + (subtitleDisplaySettings != null));
        if (subtitleDisplaySettings == null) {
            return new SubtitleDisplaySettings(0.0f, 0.0f, 0L, 0, 15, null);
        }
        return subtitleDisplaySettings;
    }

    public final SeriesSubtitlePref getSeriesSubtitlePref(String seriesId) {
        Object next;
        seriesId.getClass();
        Iterator<T> it = getSeriesPrefs().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((SeriesSubtitlePref) next).getSeriesId(), seriesId)) {
                return (SeriesSubtitlePref) next;
            }
        }
        next = null;
        return (SeriesSubtitlePref) next;
    }

    public final boolean isBitmapSubtitleBrightnessEnabled() {
        return this.prefs.getBoolean(KEY_BITMAP_SUBTITLE_BRIGHTNESS_ENABLED, true);
    }

    public final boolean isSubtitlesEnabled() {
        return this.prefs.getBoolean(KEY_SUBTITLES_ENABLED, true);
    }

    public final void saveBitmapSubtitleBrightness(int value) {
        int iNormalizeBitmapSubtitleBrightness = INSTANCE.normalizeBitmapSubtitleBrightness(value);
        this.prefs.edit().putInt(KEY_BITMAP_SUBTITLE_BRIGHTNESS, iNormalizeBitmapSubtitleBrightness).apply();
        Log.d(TAG, "保存全局图形字幕亮度: brightness=" + iNormalizeBitmapSubtitleBrightness);
    }

    public final void saveBitmapSubtitleBrightnessEnabled(boolean enabled) {
        this.prefs.edit().putBoolean(KEY_BITMAP_SUBTITLE_BRIGHTNESS_ENABLED, enabled).apply();
        Log.d(TAG, "保存全局图形字幕亮度增强开关: enabled=" + enabled);
    }

    public final void saveMovieDisplaySettings(String itemId, String mediaSourceId, int trackIndex, SubtitleDisplaySettings settings) {
        Map<Integer, SubtitleDisplaySettings> mapEmptyMap;
        itemId.getClass();
        mediaSourceId.getClass();
        settings.getClass();
        MovieSubtitlePref movieSubtitlePref = getMovieSubtitlePref(itemId, mediaSourceId);
        if (movieSubtitlePref == null || (mapEmptyMap = movieSubtitlePref.getTrackSettings()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Map mutableMap = MapsKt.toMutableMap(mapEmptyMap);
        mutableMap.put(Integer.valueOf(trackIndex), settings);
        List<MovieSubtitlePref> mutableList = CollectionsKt.toMutableList((Collection) getMoviePrefs());
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(mr.C(itemId, "|", mediaSourceId), 25));
        mutableList.add(new MovieSubtitlePref(itemId, mediaSourceId, movieSubtitlePref != null ? movieSubtitlePref.getCurrentTrackIndex() : trackIndex, movieSubtitlePref != null ? movieSubtitlePref.getCurrentApiStreamIndex() : null, movieSubtitlePref != null ? movieSubtitlePref.getCurrentTrackTitle() : null, mutableMap, movieSubtitlePref != null ? movieSubtitlePref.getMemoryEnabled() : null, 0L, 128, null));
        if (mutableList.size() > 100) {
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.SubtitlePreferences$saveMovieDisplaySettings$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((SubtitlePreferences.MovieSubtitlePref) t).getTimestamp()), Long.valueOf(((SubtitlePreferences.MovieSubtitlePref) t2).getTimestamp()));
                }
            }), 100);
        }
        saveMoviePrefs(mutableList);
        Log.d(TAG, "保存电影字幕显示设置: itemId=" + itemId + ", trackIndex=" + trackIndex + ", settings=" + settings);
    }

    public final void saveMovieSubtitleSelection(String itemId, String mediaSourceId, int trackIndex, Integer apiStreamIndex, String trackTitle) {
        Map<Integer, SubtitleDisplaySettings> mapEmptyMap;
        itemId.getClass();
        mediaSourceId.getClass();
        MovieSubtitlePref movieSubtitlePref = getMovieSubtitlePref(itemId, mediaSourceId);
        if (movieSubtitlePref == null || (mapEmptyMap = movieSubtitlePref.getTrackSettings()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Map<Integer, SubtitleDisplaySettings> map = mapEmptyMap;
        List<MovieSubtitlePref> mutableList = CollectionsKt.toMutableList((Collection) getMoviePrefs());
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(mr.C(itemId, "|", mediaSourceId), 22));
        mutableList.add(new MovieSubtitlePref(itemId, mediaSourceId, trackIndex, apiStreamIndex, trackTitle, map, Boolean.TRUE, 0L, 128, null));
        if (mutableList.size() > 100) {
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.SubtitlePreferences$saveMovieSubtitleSelection$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((SubtitlePreferences.MovieSubtitlePref) t).getTimestamp()), Long.valueOf(((SubtitlePreferences.MovieSubtitlePref) t2).getTimestamp()));
                }
            }), 100);
        }
        saveMoviePrefs(mutableList);
        Log.d(TAG, "保存电影字幕选择: itemId=" + itemId + ", trackIndex=" + trackIndex + ", apiStreamIndex=" + apiStreamIndex + ", title=" + trackTitle);
    }

    public final void saveSeriesDisplaySettings(String seriesId, String languageType, String subtitleTitle, SubtitleDisplaySettings settings) {
        Map<String, SubtitleDisplaySettings> mapEmptyMap;
        String currentSubtitleTitle;
        String currentLanguageType;
        seriesId.getClass();
        languageType.getClass();
        settings.getClass();
        SeriesSubtitlePref seriesSubtitlePref = getSeriesSubtitlePref(seriesId);
        String str = languageType;
        String str2 = subtitleTitle;
        String strMakeTrackKey = makeTrackKey(str, str2);
        if (seriesSubtitlePref == null || (mapEmptyMap = seriesSubtitlePref.getTrackSettings()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Map mutableMap = MapsKt.toMutableMap(mapEmptyMap);
        mutableMap.put(strMakeTrackKey, settings);
        List<SeriesSubtitlePref> mutableList = CollectionsKt.toMutableList((Collection) getSeriesPrefs());
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(seriesId, 26));
        if (seriesSubtitlePref != null && (currentLanguageType = seriesSubtitlePref.getCurrentLanguageType()) != null) {
            str = currentLanguageType;
        }
        if (seriesSubtitlePref != null && (currentSubtitleTitle = seriesSubtitlePref.getCurrentSubtitleTitle()) != null) {
            str2 = currentSubtitleTitle;
        }
        mutableList.add(new SeriesSubtitlePref(seriesId, str, str2, mutableMap, seriesSubtitlePref != null ? seriesSubtitlePref.getMemoryEnabled() : null, 0L, 32, null));
        if (mutableList.size() > 100) {
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.SubtitlePreferences$saveSeriesDisplaySettings$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((SubtitlePreferences.SeriesSubtitlePref) t).getTimestamp()), Long.valueOf(((SubtitlePreferences.SeriesSubtitlePref) t2).getTimestamp()));
                }
            }), 100);
        }
        saveSeriesPrefs(mutableList);
        StringBuilder sbZ = kb0.z("保存剧集字幕显示设置: seriesId=", seriesId, ", trackKey=", strMakeTrackKey, ", settings=");
        sbZ.append(settings);
        Log.d(TAG, sbZ.toString());
    }

    public final void saveSeriesSubtitleSelection(String seriesId, String languageType, String subtitleTitle) {
        Map<String, SubtitleDisplaySettings> mapEmptyMap;
        seriesId.getClass();
        languageType.getClass();
        SeriesSubtitlePref seriesSubtitlePref = getSeriesSubtitlePref(seriesId);
        if (seriesSubtitlePref == null || (mapEmptyMap = seriesSubtitlePref.getTrackSettings()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Map<String, SubtitleDisplaySettings> map = mapEmptyMap;
        List<SeriesSubtitlePref> mutableList = CollectionsKt.toMutableList((Collection) getSeriesPrefs());
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(seriesId, 27));
        mutableList.add(new SeriesSubtitlePref(seriesId, languageType, subtitleTitle, map, Boolean.TRUE, 0L, 32, null));
        if (mutableList.size() > 100) {
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.SubtitlePreferences$saveSeriesSubtitleSelection$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((SubtitlePreferences.SeriesSubtitlePref) t).getTimestamp()), Long.valueOf(((SubtitlePreferences.SeriesSubtitlePref) t2).getTimestamp()));
                }
            }), 100);
        }
        saveSeriesPrefs(mutableList);
        StringBuilder sbZ = kb0.z("保存剧集字幕选择: seriesId=", seriesId, ", language=", languageType, ", title=");
        sbZ.append(subtitleTitle);
        Log.d(TAG, sbZ.toString());
    }

    public final void saveSubtitlesEnabled(boolean enabled) {
        this.prefs.edit().putBoolean(KEY_SUBTITLES_ENABLED, enabled).apply();
        Log.d(TAG, "保存全局字幕开关: enabled=" + enabled);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JZ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/dh/myembyapp/data/SubtitlePreferences$SeriesSubtitlePref;", "", "seriesId", "", "currentLanguageType", "currentSubtitleTitle", "trackSettings", "", "Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleDisplaySettings;", "memoryEnabled", "", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;J)V", "getSeriesId", "()Ljava/lang/String;", "getCurrentLanguageType", "getCurrentSubtitleTitle", "getTrackSettings", "()Ljava/util/Map;", "getMemoryEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;J)Lcom/dh/myembyapp/data/SubtitlePreferences$SeriesSubtitlePref;", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SeriesSubtitlePref {
        public static final int $stable = 8;
        private final String currentLanguageType;
        private final String currentSubtitleTitle;
        private final Boolean memoryEnabled;
        private final String seriesId;
        private final long timestamp;
        private final Map<String, SubtitleDisplaySettings> trackSettings;

        public /* synthetic */ SeriesSubtitlePref(String str, String str2, String str3, Map map, Boolean bool, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? System.currentTimeMillis() : j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SeriesSubtitlePref copy$default(SeriesSubtitlePref seriesSubtitlePref, String str, String str2, String str3, Map map, Boolean bool, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = seriesSubtitlePref.seriesId;
            }
            if ((i & 2) != 0) {
                str2 = seriesSubtitlePref.currentLanguageType;
            }
            if ((i & 4) != 0) {
                str3 = seriesSubtitlePref.currentSubtitleTitle;
            }
            if ((i & 8) != 0) {
                map = seriesSubtitlePref.trackSettings;
            }
            if ((i & 16) != 0) {
                bool = seriesSubtitlePref.memoryEnabled;
            }
            if ((i & 32) != 0) {
                j = seriesSubtitlePref.timestamp;
            }
            long j2 = j;
            Boolean bool2 = bool;
            String str4 = str3;
            return seriesSubtitlePref.copy(str, str2, str4, map, bool2, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        public final Map<String, SubtitleDisplaySettings> component4() {
            return this.trackSettings;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */

        /* JADX INFO: renamed from: component6, reason: from getter */

        public final SeriesSubtitlePref copy(String seriesId, String currentLanguageType, String currentSubtitleTitle, Map<String, SubtitleDisplaySettings> trackSettings, Boolean memoryEnabled, long timestamp) {
            seriesId.getClass();
            currentLanguageType.getClass();
            trackSettings.getClass();
            return new SeriesSubtitlePref(seriesId, currentLanguageType, currentSubtitleTitle, trackSettings, memoryEnabled, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeriesSubtitlePref)) {
                return false;
            }
            SeriesSubtitlePref seriesSubtitlePref = (SeriesSubtitlePref) other;
            return Intrinsics.areEqual(this.seriesId, seriesSubtitlePref.seriesId) && Intrinsics.areEqual(this.currentLanguageType, seriesSubtitlePref.currentLanguageType) && Intrinsics.areEqual(this.currentSubtitleTitle, seriesSubtitlePref.currentSubtitleTitle) && Intrinsics.areEqual(this.trackSettings, seriesSubtitlePref.trackSettings) && Intrinsics.areEqual(this.memoryEnabled, seriesSubtitlePref.memoryEnabled) && this.timestamp == seriesSubtitlePref.timestamp;
        }






        public final Map<String, SubtitleDisplaySettings> getTrackSettings() {
            return this.trackSettings;
        }

        public int hashCode() {
            int i = i02.i(this.seriesId.hashCode() * 31, 31, this.currentLanguageType);
            String str = this.currentSubtitleTitle;
            int iHashCode = (this.trackSettings.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Boolean bool = this.memoryEnabled;
            int iHashCode2 = bool != null ? bool.hashCode() : 0;
            long j = this.timestamp;
            return ((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            String str = this.seriesId;
            String str2 = this.currentLanguageType;
            String str3 = this.currentSubtitleTitle;
            Map<String, SubtitleDisplaySettings> map = this.trackSettings;
            Boolean bool = this.memoryEnabled;
            long j = this.timestamp;
            StringBuilder sbZ = kb0.z("SeriesSubtitlePref(seriesId=", str, ", currentLanguageType=", str2, ", currentSubtitleTitle=");
            sbZ.append(str3);
            sbZ.append(", trackSettings=");
            sbZ.append(map);
            sbZ.append(", memoryEnabled=");
            sbZ.append(bool);
            sbZ.append(", timestamp=");
            sbZ.append(j);
            sbZ.append(")");
            return sbZ.toString();
        }

        public SeriesSubtitlePref(String str, String str2, String str3, Map<String, SubtitleDisplaySettings> map, Boolean bool, long j) {
            str.getClass();
            str2.getClass();
            map.getClass();
            this.seriesId = str;
            this.currentLanguageType = str2;
            this.currentSubtitleTitle = str3;
            this.trackSettings = map;
            this.memoryEnabled = bool;
            this.timestamp = j;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleDisplaySettings;", "", "verticalOffset", "", "scale", "timeOffsetMs", "", "colorOrdinal", "", "<init>", "(FFJI)V", "getVerticalOffset", "()F", "getScale", "getTimeOffsetMs", "()J", "getColorOrdinal", "()I", TtmlNode.ATTR_TTS_COLOR, "Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleColor;", "getColor", "()Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleColor;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubtitleDisplaySettings {
        public static final int $stable = 0;
        private final int colorOrdinal;
        private final float scale;
        private final long timeOffsetMs;
        private final float verticalOffset;

        public /* synthetic */ SubtitleDisplaySettings(float f, float f2, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i);
        }

        public static /* synthetic */ SubtitleDisplaySettings copy$default(SubtitleDisplaySettings subtitleDisplaySettings, float f, float f2, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = subtitleDisplaySettings.verticalOffset;
            }
            if ((i2 & 2) != 0) {
                f2 = subtitleDisplaySettings.scale;
            }
            if ((i2 & 4) != 0) {
                j = subtitleDisplaySettings.timeOffsetMs;
            }
            if ((i2 & 8) != 0) {
                i = subtitleDisplaySettings.colorOrdinal;
            }
            int i3 = i;
            return subtitleDisplaySettings.copy(f, f2, j, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        /* JADX INFO: renamed from: component4, reason: from getter */

        public final SubtitleDisplaySettings copy(float verticalOffset, float scale, long timeOffsetMs, int colorOrdinal) {
            return new SubtitleDisplaySettings(verticalOffset, scale, timeOffsetMs, colorOrdinal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubtitleDisplaySettings)) {
                return false;
            }
            SubtitleDisplaySettings subtitleDisplaySettings = (SubtitleDisplaySettings) other;
            return Float.compare(this.verticalOffset, subtitleDisplaySettings.verticalOffset) == 0 && Float.compare(this.scale, subtitleDisplaySettings.scale) == 0 && this.timeOffsetMs == subtitleDisplaySettings.timeOffsetMs && this.colorOrdinal == subtitleDisplaySettings.colorOrdinal;
        }

        public final SubtitleColor getColor() {
            return SubtitleColor.INSTANCE.fromOrdinal(this.colorOrdinal);
        }





        public int hashCode() {
            int iE = qi0.e(this.scale, Float.floatToIntBits(this.verticalOffset) * 31, 31);
            long j = this.timeOffsetMs;
            return ((iE + ((int) (j ^ (j >>> 32)))) * 31) + this.colorOrdinal;
        }

        public String toString() {
            return "SubtitleDisplaySettings(verticalOffset=" + this.verticalOffset + ", scale=" + this.scale + ", timeOffsetMs=" + this.timeOffsetMs + ", colorOrdinal=" + this.colorOrdinal + ")";
        }

        public SubtitleDisplaySettings(float f, float f2, long j, int i) {
            this.verticalOffset = f;
            this.scale = f2;
            this.timeOffsetMs = j;
            this.colorOrdinal = i;
        }

        public SubtitleDisplaySettings() {
            this(0.0f, 0.0f, 0L, 0, 15, null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010)\u001a\u00020\u000fHÆ\u0003Jp\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0014\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/dh/myembyapp/data/SubtitlePreferences$MovieSubtitlePref;", "", "itemId", "", "mediaSourceId", "currentTrackIndex", "", "currentApiStreamIndex", "currentTrackTitle", "trackSettings", "", "Lcom/dh/myembyapp/data/SubtitlePreferences$SubtitleDisplaySettings;", "memoryEnabled", "", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;J)V", "getItemId", "()Ljava/lang/String;", "getMediaSourceId", "getCurrentTrackIndex", "()I", "getCurrentApiStreamIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentTrackTitle", "getTrackSettings", "()Ljava/util/Map;", "getMemoryEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;J)Lcom/dh/myembyapp/data/SubtitlePreferences$MovieSubtitlePref;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MovieSubtitlePref {
        public static final int $stable = 8;
        private final Integer currentApiStreamIndex;
        private final int currentTrackIndex;
        private final String currentTrackTitle;
        private final String itemId;
        private final String mediaSourceId;
        private final Boolean memoryEnabled;
        private final long timestamp;
        private final Map<Integer, SubtitleDisplaySettings> trackSettings;

        public /* synthetic */ MovieSubtitlePref(String str, String str2, int i, Integer num, String str3, Map map, Boolean bool, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? MapsKt.emptyMap() : map, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? System.currentTimeMillis() : j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MovieSubtitlePref copy$default(MovieSubtitlePref movieSubtitlePref, String str, String str2, int i, Integer num, String str3, Map map, Boolean bool, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = movieSubtitlePref.itemId;
            }
            if ((i2 & 2) != 0) {
                str2 = movieSubtitlePref.mediaSourceId;
            }
            if ((i2 & 4) != 0) {
                i = movieSubtitlePref.currentTrackIndex;
            }
            if ((i2 & 8) != 0) {
                num = movieSubtitlePref.currentApiStreamIndex;
            }
            if ((i2 & 16) != 0) {
                str3 = movieSubtitlePref.currentTrackTitle;
            }
            if ((i2 & 32) != 0) {
                map = movieSubtitlePref.trackSettings;
            }
            if ((i2 & 64) != 0) {
                bool = movieSubtitlePref.memoryEnabled;
            }
            if ((i2 & 128) != 0) {
                j = movieSubtitlePref.timestamp;
            }
            long j2 = j;
            Map map2 = map;
            Boolean bool2 = bool;
            String str4 = str3;
            int i3 = i;
            return movieSubtitlePref.copy(str, str2, i3, num, str4, map2, bool2, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        /* JADX INFO: renamed from: component4, reason: from getter */

        /* JADX INFO: renamed from: component5, reason: from getter */

        public final Map<Integer, SubtitleDisplaySettings> component6() {
            return this.trackSettings;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */

        /* JADX INFO: renamed from: component8, reason: from getter */

        public final MovieSubtitlePref copy(String itemId, String mediaSourceId, int currentTrackIndex, Integer currentApiStreamIndex, String currentTrackTitle, Map<Integer, SubtitleDisplaySettings> trackSettings, Boolean memoryEnabled, long timestamp) {
            itemId.getClass();
            mediaSourceId.getClass();
            trackSettings.getClass();
            return new MovieSubtitlePref(itemId, mediaSourceId, currentTrackIndex, currentApiStreamIndex, currentTrackTitle, trackSettings, memoryEnabled, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MovieSubtitlePref)) {
                return false;
            }
            MovieSubtitlePref movieSubtitlePref = (MovieSubtitlePref) other;
            return Intrinsics.areEqual(this.itemId, movieSubtitlePref.itemId) && Intrinsics.areEqual(this.mediaSourceId, movieSubtitlePref.mediaSourceId) && this.currentTrackIndex == movieSubtitlePref.currentTrackIndex && Intrinsics.areEqual(this.currentApiStreamIndex, movieSubtitlePref.currentApiStreamIndex) && Intrinsics.areEqual(this.currentTrackTitle, movieSubtitlePref.currentTrackTitle) && Intrinsics.areEqual(this.trackSettings, movieSubtitlePref.trackSettings) && Intrinsics.areEqual(this.memoryEnabled, movieSubtitlePref.memoryEnabled) && this.timestamp == movieSubtitlePref.timestamp;
        }








        public final Map<Integer, SubtitleDisplaySettings> getTrackSettings() {
            return this.trackSettings;
        }

        public int hashCode() {
            int i = (i02.i(this.itemId.hashCode() * 31, 31, this.mediaSourceId) + this.currentTrackIndex) * 31;
            Integer num = this.currentApiStreamIndex;
            int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.currentTrackTitle;
            int iHashCode2 = (this.trackSettings.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Boolean bool = this.memoryEnabled;
            int iHashCode3 = bool != null ? bool.hashCode() : 0;
            long j = this.timestamp;
            return ((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            String str = this.itemId;
            String str2 = this.mediaSourceId;
            int i = this.currentTrackIndex;
            Integer num = this.currentApiStreamIndex;
            String str3 = this.currentTrackTitle;
            Map<Integer, SubtitleDisplaySettings> map = this.trackSettings;
            Boolean bool = this.memoryEnabled;
            long j = this.timestamp;
            StringBuilder sbZ = kb0.z("MovieSubtitlePref(itemId=", str, ", mediaSourceId=", str2, ", currentTrackIndex=");
            sbZ.append(i);
            sbZ.append(", currentApiStreamIndex=");
            sbZ.append(num);
            sbZ.append(", currentTrackTitle=");
            sbZ.append(str3);
            sbZ.append(", trackSettings=");
            sbZ.append(map);
            sbZ.append(", memoryEnabled=");
            sbZ.append(bool);
            sbZ.append(", timestamp=");
            sbZ.append(j);
            sbZ.append(")");
            return sbZ.toString();
        }

        public MovieSubtitlePref(String str, String str2, int i, Integer num, String str3, Map<Integer, SubtitleDisplaySettings> map, Boolean bool, long j) {
            str.getClass();
            str2.getClass();
            map.getClass();
            this.itemId = str;
            this.mediaSourceId = str2;
            this.currentTrackIndex = i;
            this.currentApiStreamIndex = num;
            this.currentTrackTitle = str3;
            this.trackSettings = map;
            this.memoryEnabled = bool;
            this.timestamp = j;
        }
    }
}
