package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ym1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ ih1 b;
    public final /* synthetic */ ih1 c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym1(MutableState mutableState, ih1 ih1Var, ih1 ih1Var2, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        super(0, Intrinsics.Kotlin.class, "preparePlaybackRestart", "PlayerScreenContent$lambda$121$preparePlaybackRestart(Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = mutableState;
        this.b = ih1Var;
        this.c = ih1Var2;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dn1.i0(this.a, this.b, this.c, this.d, this.e, this.g);
        return Unit.INSTANCE;
    }
}
