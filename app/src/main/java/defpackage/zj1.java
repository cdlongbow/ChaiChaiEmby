package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zj1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ to1 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ ln1 e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ ih1 k;
    public final /* synthetic */ ih1 l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj1(String str, Function0 function0, to1 to1Var, Function2 function2, ln1 ln1Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, ih1 ih1Var, ih1 ih1Var2, MutableState mutableState5, MutableState mutableState6) {
        super(1, Intrinsics.Kotlin.class, "handleMediaSourceSelect", "PlayerScreenContent$lambda$121$handleMediaSourceSelect(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Lkotlin/jvm/functions/Function2;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", 0);
        this.a = str;
        this.b = function0;
        this.c = to1Var;
        this.d = function2;
        this.e = ln1Var;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
        this.j = mutableState4;
        this.k = ih1Var;
        this.l = ih1Var2;
        this.m = mutableState5;
        this.n = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        dn1.E0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, str);
        return Unit.INSTANCE;
    }
}
