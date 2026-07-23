package com.dh.myembyapp.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import defpackage.dl;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/dh/myembyapp/data/IntroOutroMemory;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "gson", "Lcom/google/gson/Gson;", "saveSeasonIntroOutro", "", "seasonId", "", "manualIntroTime", "", "manualOutroRemainingMs", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getSeasonIntroOutro", "Lcom/dh/myembyapp/data/IntroOutroMemory$SeasonIntroOutroMemory;", "getSeasonMemories", "", "saveSeasonMemories", "list", "Companion", "SeasonIntroOutroMemory", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IntroOutroMemory {
    private static final String KEY_SEASON_MEMORY = "season_intro_outro_memory";
    private static final int MAX_CACHE = 100;
    private static final String PREFS_NAME = "intro_outro_memory";
    private static final String TAG = "IntroOutroMemory";
    private final Gson gson;
    private final SharedPreferences prefs;
    public static final int $stable = 8;

    public IntroOutroMemory(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
        this.gson = new Gson();
    }

    private final List<SeasonIntroOutroMemory> getSeasonMemories() {
        String string = this.prefs.getString(KEY_SEASON_MEMORY, null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        try {
            List<SeasonIntroOutroMemory> list = (List) this.gson.fromJson(string, new TypeToken<List<? extends SeasonIntroOutroMemory>>() { // from class: com.dh.myembyapp.data.IntroOutroMemory$getSeasonMemories$type$1
            }.getType());
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (Exception e) {
            Log.e(TAG, "解析季片头片尾记忆失败", e);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean saveSeasonIntroOutro$lambda$0(String str, SeasonIntroOutroMemory seasonIntroOutroMemory) {
        seasonIntroOutroMemory.getClass();
        return Intrinsics.areEqual(seasonIntroOutroMemory.getSeasonId(), str);
    }

    private final void saveSeasonMemories(List<SeasonIntroOutroMemory> list) {
        this.prefs.edit().putString(KEY_SEASON_MEMORY, this.gson.toJson(list)).apply();
    }

    public final SeasonIntroOutroMemory getSeasonIntroOutro(String seasonId) {
        Object next;
        seasonId.getClass();
        Iterator<T> it = getSeasonMemories().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((SeasonIntroOutroMemory) next).getSeasonId(), seasonId)) {
                return (SeasonIntroOutroMemory) next;
            }
        }
        next = null;
        return (SeasonIntroOutroMemory) next;
    }

    public final void saveSeasonIntroOutro(String seasonId, Long manualIntroTime, Long manualOutroRemainingMs) {
        seasonId.getClass();
        List<SeasonIntroOutroMemory> mutableList = CollectionsKt.toMutableList((Collection) getSeasonMemories());
        CollectionsKt__MutableCollectionsKt.removeAll((List) mutableList, (Function1) new dl(seasonId, 11));
        mutableList.add(new SeasonIntroOutroMemory(seasonId, manualIntroTime, manualOutroRemainingMs, 0L, 8, null));
        if (mutableList.size() > 100) {
            mutableList = CollectionsKt.takeLast(CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.dh.myembyapp.data.IntroOutroMemory$saveSeasonIntroOutro$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((IntroOutroMemory.SeasonIntroOutroMemory) t).getTimestamp()), Long.valueOf(((IntroOutroMemory.SeasonIntroOutroMemory) t2).getTimestamp()));
                }
            }), 100);
        }
        saveSeasonMemories(mutableList);
        Log.d(TAG, "保存季片头片尾记忆: seasonId=" + seasonId + ", intro=" + manualIntroTime + ", outroRemaining=" + manualOutroRemainingMs);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/IntroOutroMemory$SeasonIntroOutroMemory;", "", "seasonId", "", "manualIntroTime", "", "manualOutroRemainingMs", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;J)V", "getSeasonId", "()Ljava/lang/String;", "getManualIntroTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getManualOutroRemainingMs", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;J)Lcom/dh/myembyapp/data/IntroOutroMemory$SeasonIntroOutroMemory;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SeasonIntroOutroMemory {
        public static final int $stable = 0;
        private final Long manualIntroTime;
        private final Long manualOutroRemainingMs;
        private final String seasonId;
        private final long timestamp;

        public /* synthetic */ SeasonIntroOutroMemory(String str, Long l, Long l2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? System.currentTimeMillis() : j);
        }

        public static /* synthetic */ SeasonIntroOutroMemory copy$default(SeasonIntroOutroMemory seasonIntroOutroMemory, String str, Long l, Long l2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = seasonIntroOutroMemory.seasonId;
            }
            if ((i & 2) != 0) {
                l = seasonIntroOutroMemory.manualIntroTime;
            }
            if ((i & 4) != 0) {
                l2 = seasonIntroOutroMemory.manualOutroRemainingMs;
            }
            if ((i & 8) != 0) {
                j = seasonIntroOutroMemory.timestamp;
            }
            Long l3 = l2;
            return seasonIntroOutroMemory.copy(str, l, l3, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        /* JADX INFO: renamed from: component4, reason: from getter */

        public final SeasonIntroOutroMemory copy(String seasonId, Long manualIntroTime, Long manualOutroRemainingMs, long timestamp) {
            seasonId.getClass();
            return new SeasonIntroOutroMemory(seasonId, manualIntroTime, manualOutroRemainingMs, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeasonIntroOutroMemory)) {
                return false;
            }
            SeasonIntroOutroMemory seasonIntroOutroMemory = (SeasonIntroOutroMemory) other;
            return Intrinsics.areEqual(this.seasonId, seasonIntroOutroMemory.seasonId) && Intrinsics.areEqual(this.manualIntroTime, seasonIntroOutroMemory.manualIntroTime) && Intrinsics.areEqual(this.manualOutroRemainingMs, seasonIntroOutroMemory.manualOutroRemainingMs) && this.timestamp == seasonIntroOutroMemory.timestamp;
        }





        public int hashCode() {
            int iHashCode = this.seasonId.hashCode() * 31;
            Long l = this.manualIntroTime;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.manualOutroRemainingMs;
            int iHashCode3 = l2 != null ? l2.hashCode() : 0;
            long j = this.timestamp;
            return ((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "SeasonIntroOutroMemory(seasonId=" + this.seasonId + ", manualIntroTime=" + this.manualIntroTime + ", manualOutroRemainingMs=" + this.manualOutroRemainingMs + ", timestamp=" + this.timestamp + ")";
        }

        public SeasonIntroOutroMemory(String str, Long l, Long l2, long j) {
            str.getClass();
            this.seasonId = str;
            this.manualIntroTime = l;
            this.manualOutroRemainingMs = l2;
            this.timestamp = j;
        }
    }
}
