package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xm1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ eo1 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm1(eo1 eo1Var, Function0 function0, MutableState mutableState, MutableState mutableState2) {
        super(1, Intrinsics.Kotlin.class, "resolveCurrentSubtitleStreamIndexForTranscode", "PlayerScreenContent$lambda$121$resolveCurrentSubtitleStreamIndexForTranscode(Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Z)Ljava/lang/Integer;", 0);
        this.a = eo1Var;
        this.b = function0;
        this.c = mutableState;
        this.d = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        return dn1.m0(this.a, this.b, this.c, this.d, zBooleanValue);
    }
}
