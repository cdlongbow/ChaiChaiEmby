package defpackage;

import android.view.ViewConfiguration;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wg1 {
    public final MutableState a = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final MutableState b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableIntState f;
    public final MutableState g;
    public final MutableState h;
    public final long i;

    public wg1() {
        Boolean bool = Boolean.FALSE;
        this.c = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.e = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f = SnapshotIntStateKt.mutableIntStateOf(0);
        this.g = SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.i = ViewConfiguration.getLongPressTimeout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }
}
