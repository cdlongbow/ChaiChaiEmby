package defpackage;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l22 implements ObserverHandle {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l22(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Snapshot.Companion.registerApplyObserver$lambda$1((Function2) obj);
                break;
            case 1:
                Snapshot.Companion.registerGlobalWriteObserver$lambda$1((Function1) obj);
                break;
            default:
                SnapshotObserverKt.observeSnapshots$lambda$1((SnapshotObserver) obj);
                break;
        }
    }
}
