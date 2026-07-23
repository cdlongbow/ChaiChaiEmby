package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hl1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ eo1 a;
    public final /* synthetic */ ln1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl1(eo1 eo1Var, ln1 ln1Var) {
        super(0, Intrinsics.Kotlin.class, "resolveCurrentPositionTicksForTranscode", "PlayerScreenContent$lambda$121$resolveCurrentPositionTicksForTranscode(Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;)J", 0);
        this.a = eo1Var;
        this.b = ln1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(dn1.H0(this.a, this.b));
    }
}
