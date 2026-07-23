package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v80 extends FunctionReferenceImpl implements Function2, SuspendFunction {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(to1 to1Var, int i) {
        super(2, to1Var, to1.class, "reportTraktPlaybackStarted", "reportTraktPlaybackStarted(Ljava/lang/String;J)V", 0);
        this.a = i;
        switch (i) {
            case 6:
                super(2, to1Var, to1.class, "reportTraktPlaybackPaused", "reportTraktPlaybackPaused(Ljava/lang/String;J)V", 0);
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                Integer num = (Integer) obj2;
                str.getClass();
                va0 va0Var = (va0) this.receiver;
                va0Var.getClass();
                MutableStateFlow mutableStateFlow = va0Var.Q;
                Object value = mutableStateFlow.getValue();
                r40 r40Var = (r40) (Intrinsics.areEqual(((r40) value).a, str) ? value : null);
                if (r40Var == null) {
                    r40Var = new r40(str, 6);
                }
                mutableStateFlow.setValue(va0Var.m(str, num, r40Var.c));
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                Integer num2 = (Integer) obj2;
                str2.getClass();
                va0 va0Var2 = (va0) this.receiver;
                va0Var2.getClass();
                MutableStateFlow mutableStateFlow2 = va0Var2.Q;
                Object value2 = mutableStateFlow2.getValue();
                r40 r40Var2 = (r40) (Intrinsics.areEqual(((r40) value2).a, str2) ? value2 : null);
                if (r40Var2 == null) {
                    r40Var2 = new r40(str2, 6);
                }
                mutableStateFlow2.setValue(va0Var2.m(str2, r40Var2.b, num2));
                return Unit.INSTANCE;
            case 2:
                String str3 = (String) obj;
                Integer num3 = (Integer) obj2;
                str3.getClass();
                va0 va0Var3 = (va0) this.receiver;
                va0Var3.getClass();
                r40 r40Var3 = (r40) ((Map) va0Var3.S.getValue()).get(str3);
                if (r40Var3 == null) {
                    r40Var3 = new r40(str3, 6);
                }
                va0Var3.A(str3, va0Var3.l(str3, num3, r40Var3.c));
                return Unit.INSTANCE;
            case 3:
                String str4 = (String) obj;
                Integer num4 = (Integer) obj2;
                str4.getClass();
                va0 va0Var4 = (va0) this.receiver;
                va0Var4.getClass();
                r40 r40Var4 = (r40) ((Map) va0Var4.S.getValue()).get(str4);
                if (r40Var4 == null) {
                    r40Var4 = new r40(str4, 6);
                }
                va0Var4.A(str4, va0Var4.l(str4, r40Var4.b, num4));
                return Unit.INSTANCE;
            case 4:
                Object objM = ((zq0) this.receiver).M((List) obj, (Continuation) obj2);
                return objM == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM : Result.m8824boximpl(objM);
            case 5:
                String str5 = (String) obj;
                long jLongValue = ((Number) obj2).longValue();
                str5.getClass();
                to1 to1Var = (to1) this.receiver;
                to1Var.getClass();
                to1Var.I(jLongValue, ya2.a, str5);
                return Unit.INSTANCE;
            default:
                String str6 = (String) obj;
                long jLongValue2 = ((Number) obj2).longValue();
                str6.getClass();
                to1 to1Var2 = (to1) this.receiver;
                to1Var2.getClass();
                to1Var2.I(jLongValue2, ya2.b, str6);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(zq0 zq0Var) {
        super(2, zq0Var, zq0.class, "saveLibraryOrder", "saveLibraryOrder-gIAlu-s(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v80(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }
}
