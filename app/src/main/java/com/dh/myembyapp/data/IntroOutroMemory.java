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
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class IntroOutroMemory {
    private static final String KEY_SEASON_MEMORY = "season_intro_outro_memory";
    private static final int MAX_CACHE = 100;
    private static final String PREFS_NAME = "intro_outro_memory";
    private static final String TAG = "IntroOutroMemory";
    private final Gson gson;
    private final SharedPreferences prefs;
    

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

    