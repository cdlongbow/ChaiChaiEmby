package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zl1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ eo1 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ on1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl1(Function0 function0, eo1 eo1Var, MutableState mutableState, on1 on1Var) {
        super(0, Intrinsics.Kotlin.class, "resolveCurrentAudioStreamIndexForTranscode", "PlayerScreenContent$lambda$121$resolveCurrentAudioStreamIndexForTranscode(Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;)Ljava/lang/Integer;", 0);
        this.a = function0;
        this.b = eo1Var;
        this.c = mutableState;
        this.d = on1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return dn1.G0(this.a, this.b, this.c, this.d);
    }
}
