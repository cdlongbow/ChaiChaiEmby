package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gl1 extends AdaptedFunctionReference implements Function0 {
    public final /* synthetic */ eo1 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl1(eo1 eo1Var, Function0 function0, MutableState mutableState, MutableState mutableState2) {
        super(0, Intrinsics.Kotlin.class, "resolveCurrentSubtitleStreamIndexForTranscode", "PlayerScreenContent$lambda$121$resolveCurrentSubtitleStreamIndexForTranscode(Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Z)Ljava/lang/Integer;", 0);
        this.a = eo1Var;
        this.b = function0;
        this.c = mutableState;
        this.d = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState mutableState = this.d;
        eo1 eo1Var = this.a;
        return dn1.m0(eo1Var, this.b, this.c, mutableState, eo1Var.d);
    }
}
