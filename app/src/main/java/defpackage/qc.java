package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qc {
    public static final MutableState a;
    public static final MutableState b;
    public static final CoroutineScope c;

    static {
        Boolean bool = Boolean.FALSE;
        a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        c = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
    }
}
