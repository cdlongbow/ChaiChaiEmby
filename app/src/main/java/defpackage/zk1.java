package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zk1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ eo1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ CoroutineScope c;
    public final /* synthetic */ to1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ ln1 h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ ih1 j;
    public final /* synthetic */ ih1 k;
    public final /* synthetic */ MutableState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk1(eo1 eo1Var, Context context, CoroutineScope coroutineScope, to1 to1Var, String str, MutableState mutableState, ln1 ln1Var, MutableState mutableState2, ih1 ih1Var, ih1 ih1Var2, MutableState mutableState3) {
        super(0, Intrinsics.Kotlin.class, "handleNextEpisode", "PlayerScreenContent$lambda$121$handleNextEpisode(Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = eo1Var;
        this.b = context;
        this.c = coroutineScope;
        this.d = to1Var;
        this.e = str;
        this.g = mutableState;
        this.h = ln1Var;
        this.i = mutableState2;
        this.j = ih1Var;
        this.k = ih1Var2;
        this.l = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zAreEqual = Intrinsics.areEqual(this.a.a.getType(), "Episode");
        Context context = this.b;
        MutableState mutableState = this.l;
        if (zAreEqual) {
            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new i00(this.d, this.e, context, this.g, this.h, this.i, this.j, this.k, mutableState, (Continuation) null, 2), 3, null);
        } else {
            Toast.makeText(context, "当前内容没有下一集", 0).show();
        }
        dn1.h0(mutableState);
        return Unit.INSTANCE;
    }
}
