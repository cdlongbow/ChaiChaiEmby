package defpackage;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class km1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ MutableIntState a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km1(MutableIntState mutableIntState) {
        super(1, Intrinsics.Kotlin.class, "invalidatePendingPlaybackSpeedCompatibilityChecks", "PlayerScreenContent$lambda$121$invalidatePendingPlaybackSpeedCompatibilityChecks(Landroidx/compose/runtime/MutableIntState;Ljava/lang/String;)V", 0);
        this.a = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        dn1.F0(this.a, str);
        return Unit.INSTANCE;
    }
}
