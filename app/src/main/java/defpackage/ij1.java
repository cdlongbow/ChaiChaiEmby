package defpackage;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ij1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ ih1 b;
    public final /* synthetic */ ih1 c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij1(MutableState mutableState, ih1 ih1Var, ih1 ih1Var2, MutableState mutableState2) {
        super(0, Intrinsics.Kotlin.class, "dismissOnlineSubtitleSearchDialog", "PlayerScreenContent$lambda$121$dismissOnlineSubtitleSearchDialog(Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = mutableState;
        this.b = ih1Var;
        this.c = ih1Var2;
        this.d = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.setValue(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        this.b.a.setValue(Boolean.TRUE);
        Unit unit2 = Unit.INSTANCE;
        MutableIntState mutableIntState = this.c.f;
        mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
        Unit unit3 = Unit.INSTANCE;
        this.d.setValue(Long.valueOf(System.currentTimeMillis()));
        Unit unit4 = Unit.INSTANCE;
        return Unit.INSTANCE;
    }
}
