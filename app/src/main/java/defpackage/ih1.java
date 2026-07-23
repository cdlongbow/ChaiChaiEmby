package defpackage;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ih1 {
    public final MutableState a;
    public final MutableState b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableIntState f;
    public final MutableIntState g;
    public final MutableState h;

    public ih1() {
        Boolean bool = Boolean.FALSE;
        this.a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f = SnapshotIntStateKt.mutableIntStateOf(0);
        this.g = SnapshotIntStateKt.mutableIntStateOf(0);
        this.h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
    }
}
