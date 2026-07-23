package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hm1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ ih1 a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ kx c;
    public final /* synthetic */ kx d;
    public final /* synthetic */ MutableState e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm1(ih1 ih1Var, MutableState mutableState, kx kxVar, kx kxVar2, MutableState mutableState2) {
        super(0, Intrinsics.Kotlin.class, "hasAnyOverlayOpenNow", "PlayerScreenContent$lambda$121$hasAnyOverlayOpenNow(Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlaybackState;Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlaybackState;Landroidx/compose/runtime/MutableState;)Z", 0);
        this.a = ih1Var;
        this.b = mutableState;
        this.c = kxVar;
        this.d = kxVar2;
        this.e = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(((Boolean) this.a.e.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue() || ((Boolean) this.c.d.getValue()).booleanValue() || dn1.W(this.d) || ((vd1) this.e.getValue()) != null);
    }
}
