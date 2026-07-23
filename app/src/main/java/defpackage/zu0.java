package defpackage;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zu0 {
    public final MutableState a = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final MutableState b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final MutableState c = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final MutableState d = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final MutableState e = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final MutableState f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public final MutableState g;
    public final MutableState h;
    public final MutableIntState i;

    public zu0() {
        Boolean bool = Boolean.FALSE;
        this.g = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.i = SnapshotIntStateKt.mutableIntStateOf(0);
    }
}
