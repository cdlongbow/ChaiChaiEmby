package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hn1 extends FunctionReferenceImpl implements Function1 {
    public static final hn1 a = new hn1(1, tl0.class, "normalizeContentFrameRate", "normalizeContentFrameRate(F)Ljava/lang/Float;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return tl0.D(((Number) obj).floatValue());
    }
}
