package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rm1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ MutableState b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm1(MutableState mutableState, MutableState mutableState2) {
        super(0, Intrinsics.Kotlin.class, "shouldAllowPlaybackStart", "PlayerScreenContent$lambda$121$shouldAllowPlaybackStart(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Z", 0);
        this.a = mutableState;
        this.b = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(dn1.q0(this.a, this.b));
    }
}
