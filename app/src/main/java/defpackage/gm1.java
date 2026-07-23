package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gm1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ ln1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm1(ln1 ln1Var) {
        super(1, Intrinsics.Kotlin.class, "requestRelativeSeek", "PlayerScreenContent$lambda$121$requestRelativeSeek(Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;J)V", 0);
        this.a = ln1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dn1.l0(this.a, ((Number) obj).longValue());
        return Unit.INSTANCE;
    }
}
