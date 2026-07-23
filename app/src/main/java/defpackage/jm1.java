package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jm1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ MutableState b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm1(MutableState mutableState, MutableState mutableState2) {
        super(0, Intrinsics.Kotlin.class, "resetNetworkSpeedState", "PlayerScreenContent$lambda$121$resetNetworkSpeedState(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = mutableState;
        this.b = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.setValue(null);
        this.b.setValue(null);
        return Unit.INSTANCE;
    }
}
