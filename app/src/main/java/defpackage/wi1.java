package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wi1 extends AdaptedFunctionReference implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi1(to1 to1Var) {
        super(2, to1Var, to1.class, "stopPlayback", "stopPlayback(Ljava/lang/String;JZ)V", 0);
        this.a = 0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                long jLongValue = ((Number) obj2).longValue();
                str.getClass();
                ((to1) this.receiver).K(jLongValue, true, str);
                break;
            case 1:
                String str2 = (String) obj;
                long jLongValue2 = ((Number) obj2).longValue();
                str2.getClass();
                ((to1) this.receiver).K(jLongValue2, true, str2);
                break;
            default:
                String str3 = (String) obj;
                long jLongValue3 = ((Number) obj2).longValue();
                str3.getClass();
                ((to1) this.receiver).K(jLongValue3, true, str3);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }
}
