package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class el1 extends FunctionReferenceImpl implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        long jLongValue = ((Number) obj2).longValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        str.getClass();
        ((to1) this.receiver).K(jLongValue, zBooleanValue, str);
        return Unit.INSTANCE;
    }
}
