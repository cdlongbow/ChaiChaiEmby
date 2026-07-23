package defpackage;

import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class iz0 implements FlowCollector {
    public final /* synthetic */ FlowCollector a;
    public final /* synthetic */ lz0 b;
    public final /* synthetic */ String c;

    public iz0(FlowCollector flowCollector, lz0 lz0Var, String str) {
        this.a = flowCollector;
        this.b = lz0Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        hz0 hz0Var;
        String str;
        if (continuation instanceof hz0) {
            hz0Var = (hz0) continuation;
            int i = hz0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hz0Var.b = i - Integer.MIN_VALUE;
            } else {
                hz0Var = new hz0(this, continuation);
            }
        } else {
            hz0Var = new hz0(this, continuation);
        }
        Object obj2 = hz0Var.a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = hz0Var.b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            Set setEmptySet = (Set) ((Preferences) obj).get(this.b.b);
            if (setEmptySet == null) {
                setEmptySet = SetsKt.emptySet();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = setEmptySet.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = this.c;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                if (StringsKt__StringsJVMKt.startsWith$default((String) next, str, false, 2, null)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList.get(i3);
                i3++;
                arrayList2.add(StringsKt.removePrefix((String) obj3, (CharSequence) str));
            }
            Set set = CollectionsKt.toSet(arrayList2);
            hz0Var.c = null;
            hz0Var.e = null;
            hz0Var.g = null;
            FlowCollector flowCollector = this.a;
            hz0Var.h = null;
            hz0Var.b = 1;
            if (flowCollector.emit(set, hz0Var) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
