package defpackage;

import androidx.compose.runtime.MutableState;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ly implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ ly(List list, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        this.a = i;
        this.b = list;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        sw swVar;
        sw swVar2;
        int i = this.a;
        MutableState mutableState = this.e;
        MutableState mutableState2 = this.d;
        int i2 = -1;
        boolean z = false;
        MutableState mutableState3 = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                Iterator it = list.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((sw) it.next()).a, (String) mutableState3.getValue())) {
                        i2 = i3;
                        swVar = (sw) CollectionsKt.getOrNull(list, i2 - 1);
                        if (swVar != null) {
                            mutableState3.setValue(swVar.a);
                            mutableState2.setValue(Integer.valueOf(swVar.c));
                            mr.A((Number) mutableState.getValue(), 1, mutableState);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    i3++;
                }
                swVar = (sw) CollectionsKt.getOrNull(list, i2 - 1);
                if (swVar != null) {
                    mutableState3.setValue(swVar.a);
                    mutableState2.setValue(Integer.valueOf(swVar.c));
                    mr.A((Number) mutableState.getValue(), 1, mutableState);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Iterator it2 = list.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((sw) it2.next()).a, (String) mutableState3.getValue())) {
                        i2 = i4;
                        swVar2 = (sw) CollectionsKt.getOrNull(list, i2 + 1);
                        if (swVar2 != null) {
                            mutableState3.setValue(swVar2.a);
                            mutableState2.setValue(Integer.valueOf(swVar2.c));
                            mr.A((Number) mutableState.getValue(), 1, mutableState);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    i4++;
                }
                swVar2 = (sw) CollectionsKt.getOrNull(list, i2 + 1);
                if (swVar2 != null) {
                    mutableState3.setValue(swVar2.a);
                    mutableState2.setValue(Integer.valueOf(swVar2.c));
                    mr.A((Number) mutableState.getValue(), 1, mutableState);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
