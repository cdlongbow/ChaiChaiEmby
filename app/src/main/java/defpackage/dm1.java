package defpackage;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dm1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableIntState c;
    public final /* synthetic */ ln1 d;
    public final /* synthetic */ eo1 e;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ to1 h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ ih1 j;
    public final /* synthetic */ ih1 k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm1(boolean z, MutableState mutableState, MutableIntState mutableIntState, ln1 ln1Var, eo1 eo1Var, Function0 function0, to1 to1Var, MutableState mutableState2, ih1 ih1Var, ih1 ih1Var2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        super(0, Intrinsics.Kotlin.class, "retryPlaybackAfterError", "PlayerScreenContent$lambda$121$retryPlaybackAfterError(ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = z;
        this.b = mutableState;
        this.c = mutableIntState;
        this.d = ln1Var;
        this.e = eo1Var;
        this.g = function0;
        this.h = to1Var;
        this.i = mutableState2;
        this.j = ih1Var;
        this.k = ih1Var2;
        this.l = mutableState3;
        this.m = mutableState4;
        this.n = mutableState5;
        this.o = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.b.setValue(Boolean.FALSE);
        dn1.i0(this.i, this.j, this.k, this.l, this.m, this.n);
        if (this.a) {
            MutableIntState mutableIntState = this.c;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
        } else {
            dn1.e0(this.h, this.o, dn1.Z(this.e, this.g, RangesKt.coerceAtLeast(dn1.n0(this.d), 0L)));
        }
        return Unit.INSTANCE;
    }
}
