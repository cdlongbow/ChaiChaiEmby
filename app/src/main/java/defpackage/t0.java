package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ t0(Collection collection, int i) {
        this.a = i;
        this.b = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zRetainAll$lambda$0;
        int i = this.a;
        Collection collection = this.b;
        switch (i) {
            case 0:
                zRetainAll$lambda$0 = AbstractPersistentList.retainAll$lambda$0(collection, obj);
                break;
            case 1:
                zRetainAll$lambda$0 = collection.contains(obj);
                break;
            case 2:
                zRetainAll$lambda$0 = collection.contains(obj);
                break;
            case 3:
                zRetainAll$lambda$0 = collection.contains(obj);
                break;
            case 4:
                zRetainAll$lambda$0 = SnapshotStateList.retainAll$lambda$0(collection, (List) obj);
                break;
            default:
                zRetainAll$lambda$0 = SnapshotStateSet.retainAll$lambda$0(collection, (Set) obj);
                break;
        }
        return Boolean.valueOf(zRetainAll$lambda$0);
    }
}
