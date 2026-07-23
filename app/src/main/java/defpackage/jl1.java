package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jl1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ to1 a;
    public final /* synthetic */ MutableState b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl1(to1 to1Var, MutableState mutableState) {
        super(1, Intrinsics.Kotlin.class, "executeCurrentPlaybackInfoReloadRequest", "PlayerScreenContent$lambda$121$executeCurrentPlaybackInfoReloadRequest(Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerPlaybackInfoReloadRequest;)V", 0);
        this.a = to1Var;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nh1 nh1Var = (nh1) obj;
        nh1Var.getClass();
        dn1.e0(this.a, this.b, nh1Var);
        return Unit.INSTANCE;
    }
}
