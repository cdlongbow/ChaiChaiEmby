package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cm1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ MutableState a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm1(MutableState mutableState) {
        super(0, Intrinsics.Kotlin.class, "markInteraction", "PlayerScreenContent$lambda$121$markInteraction(Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dn1.h0(this.a);
        return Unit.INSTANCE;
    }
}
