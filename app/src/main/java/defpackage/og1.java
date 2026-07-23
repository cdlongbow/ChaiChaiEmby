package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;

/* JADX INFO: loaded from: classes4.dex */
public final class og1 {
    public final MutableState a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("auto", null, 2, null);
    public final MutableState b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("auto", null, 2, null);
    public final MutableState c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;

    public og1() {
        Boolean bool = Boolean.FALSE;
        this.d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String c() {
        String str = (String) this.c.getValue();
        return str == null ? (String) this.b.getValue() : str;
    }
}
