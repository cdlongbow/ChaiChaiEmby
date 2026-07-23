package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.data.preferences.DanmakuPreferences;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class kx {
    public final MutableState a;
    public final MutableState b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;

    public kx(DanmakuPreferences danmakuPreferences) {
        danmakuPreferences.getClass();
        this.a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(danmakuPreferences.getDanmakuConfig(), null, 2, null);
        this.b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new uw(), null, 2, null);
        Boolean bool = Boolean.FALSE;
        this.d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(danmakuPreferences.getDanmakuVisible()), null, 2, null);
        this.h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final void a(List list, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        Object next;
        String str7;
        str.getClass();
        String apiDisplayName = b().getApiDisplayName(str2);
        this.b.setValue(list);
        if (str3 != null) {
            if (StringsKt.isBlank(str3)) {
                str3 = "-";
            }
            str5 = str3;
        } else {
            str5 = "-";
        }
        if (str4 != null) {
            if (StringsKt.isBlank(str4)) {
                str4 = "-";
            }
            str6 = str4;
        } else {
            str6 = "-";
        }
        Iterator it = SequencesKt.mapNotNull(CollectionsKt.asSequence(list), new uc1(7)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (StringsKt.isBlank((String) next));
        String str8 = (String) next;
        String str9 = (str8 == null || StringsKt.isBlank(str8)) ? "-" : str8;
        if (str2 != null) {
            if (StringsKt.isBlank(str2)) {
                str2 = "-";
            }
            str7 = str2;
        } else {
            str7 = "-";
        }
        this.c.setValue(new uw(str, str5, str6, str9, apiDisplayName, str7, list.size()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DanmakuConfig b() {
        return (DanmakuConfig) this.a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }
}
