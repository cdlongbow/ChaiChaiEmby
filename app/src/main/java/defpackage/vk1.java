package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vk1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableIntState c;
    public final /* synthetic */ og1 d;
    public final /* synthetic */ og1 e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ sh1 h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ on1 j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ MutableState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk1(CoroutineScope coroutineScope, MutableState mutableState, MutableIntState mutableIntState, og1 og1Var, og1 og1Var2, MutableState mutableState2, sh1 sh1Var, Function1 function1, on1 on1Var, Context context, MutableState mutableState3) {
        super(1, Intrinsics.Kotlin.class, "handlePlaybackSpeedChange", "PlayerScreenContent$lambda$121$handlePlaybackSpeedChange(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Lcom/dh/myembyapp/ui/screens/player/PlayerDecoderState;Lcom/dh/myembyapp/ui/screens/player/PlayerDecoderState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerRebuildController;Lkotlin/jvm/functions/Function1;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;F)V", 0);
        this.a = coroutineScope;
        this.b = mutableState;
        this.c = mutableIntState;
        this.d = og1Var;
        this.e = og1Var2;
        this.g = mutableState2;
        this.h = sh1Var;
        this.i = function1;
        this.j = on1Var;
        this.k = context;
        this.l = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dn1.Y(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, ((Number) obj).floatValue(), true, true, "用户请求倍速", new o91(5), new o91(6));
        return Unit.INSTANCE;
    }
}
