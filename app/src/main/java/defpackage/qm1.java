package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qm1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ ln1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm1(ln1 ln1Var) {
        super(0, Intrinsics.Kotlin.class, "resolvePlaybackPositionForTransition", "PlayerScreenContent$lambda$121$resolvePlaybackPositionForTransition(Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;)J", 0);
        this.a = ln1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(dn1.n0(this.a));
    }
}
