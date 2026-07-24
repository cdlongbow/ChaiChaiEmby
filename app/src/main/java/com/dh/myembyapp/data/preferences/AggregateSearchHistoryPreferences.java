package com.dh.myembyapp.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class AggregateSearchHistoryPreferences {
    private static final String KEY_HISTORY = "history";
    public static final int MAX_HISTORY_COUNT = 5;
    private static final String PREFS_NAME = "aggregate_search_history";
    private static final String TAG = "AggregateSearchHistory";
    private final SharedPreferences prefs;
    

    public AggregateSearchHistoryPreferences(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
    }

    private final List<String> parseHistory(String json) {
        if (json == null || StringsKt.isBlank(json)) {
            return CollectionsKt.emptyList();
        }
        try {
            JSONArray jSONArray = new JSONArray(json);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArray.optString(i);
                strOptString.getClass();
                String string = StringsKt.trim((CharSequence) strOptString).toString();
                if (!StringsKt.isBlank(string)) {
                    if (!(listCreateListBuilder != null) || !listCreateListBuilder.isEmpty()) {
                        Iterator it = listCreateListBuilder.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (!StringsKt__StringsJVMKt.equals((String) it.next(), string, true));
                    }
                    listCreateListBuilder.add(string);
                    break;
                }
            }
            return CollectionsKt.take(CollectionsKt.build(listCreateListBuilder), 5);
        } catch (Exception e) {
            Log.e(TAG, "Parse aggregate search history failed", e);
            return CollectionsKt.emptyList();
        }
    }

    private final void saveHistory(List<String> history) {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(history, 10));
        Iterator<T> it = history.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!StringsKt.isBlank((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = CollectionsKt.take(arrayList2, 5).iterator();
        while (it2.hasNext()) {
            jSONArray.put((String) it2.next());
        }
        this.prefs.edit().putString(KEY_HISTORY, jSONArray.toString()).apply();
    }

    public final List<String> addKeyword(String keyword) {
        keyword.getClass();
        String string = StringsKt.trim((CharSequence) keyword).toString();
        if (StringsKt.isBlank(string)) {
            return getHistory();
        }
        List listListOf = CollectionsKt.listOf(string);
        List<String> history = getHistory();
        ArrayList arrayList = new ArrayList();
        for (Object obj : history) {
            if (!StringsKt__StringsJVMKt.equals((String) obj, string, true)) {
                arrayList.add(obj);
            }
        }
        List<String> listTake = CollectionsKt.take(CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList), 5);
        saveHistory(listTake);
        return listTake;
    }

    public final void clearHistory() {
        this.prefs.edit().remove(KEY_HISTORY).apply();
    }

    public final List<String> getHistory() {
        return parseHistory(this.prefs.getString(KEY_HISTORY, null));
    }
}
