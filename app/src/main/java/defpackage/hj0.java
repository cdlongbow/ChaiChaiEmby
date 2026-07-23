package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class hj0 implements FlowCollector {
    public final /* synthetic */ int a;
    public final /* synthetic */ FlowCollector b;
    public final /* synthetic */ Set c;

    public /* synthetic */ hj0(FlowCollector flowCollector, Set set, int i) {
        this.a = i;
        this.b = flowCollector;
        this.c = set;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        gj0 gj0Var;
        cy0 cy0Var;
        int i = this.a;
        Set set = this.c;
        FlowCollector flowCollector = this.b;
        switch (i) {
            case 0:
                if (continuation instanceof gj0) {
                    gj0Var = (gj0) continuation;
                    int i2 = gj0Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        gj0Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        gj0Var = new gj0(this, continuation);
                    }
                } else {
                    gj0Var = new gj0(this, continuation);
                }
                Object obj2 = gj0Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = gj0Var.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (set.add((String) obj3)) {
                            arrayList.add(obj3);
                        }
                    }
                    gj0Var.c = null;
                    gj0Var.e = null;
                    gj0Var.g = null;
                    gj0Var.h = null;
                    gj0Var.b = 1;
                    if (flowCollector.emit(arrayList, gj0Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof cy0) {
                    cy0Var = (cy0) continuation;
                    int i4 = cy0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        cy0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        cy0Var = new cy0(this, continuation);
                    }
                } else {
                    cy0Var = new cy0(this, continuation);
                }
                Object obj4 = cy0Var.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = cy0Var.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj4);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : (List) obj) {
                        if (set.add((String) obj5)) {
                            arrayList2.add(obj5);
                        }
                    }
                    cy0Var.c = null;
                    cy0Var.e = null;
                    cy0Var.g = null;
                    cy0Var.h = null;
                    cy0Var.b = 1;
                    if (flowCollector.emit(arrayList2, cy0Var) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj4);
                }
                return Unit.INSTANCE;
        }
    }
}
