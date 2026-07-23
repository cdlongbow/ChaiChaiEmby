package com.dh.myembyapp.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/dh/myembyapp/data/preferences/AggregateSearchHistoryPreferences;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "getHistory", "", "", "addKeyword", "keyword", "clearHistory", "", "saveHistory", AggregateSearchHistoryPreferences.KEY_HISTORY, "parseHistory", "json", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AggregateSearchHistoryPreferences {
    private static final String KEY_HISTORY = "history";
    public static final int MAX_HISTORY_COUNT = 5;
    private static final String PREFS_NAME = "aggregate_search_history";
    private static final String TAG = "AggregateSearchHistory";
    private final SharedPreferences prefs;
    public static final int $stable = 8;

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
