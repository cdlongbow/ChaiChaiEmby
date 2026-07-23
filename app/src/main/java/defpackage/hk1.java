package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hk1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ ng1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk1(ng1 ng1Var) {
        super(1, Intrinsics.Kotlin.class, "handleAudioPassthroughPriorityChange", "PlayerScreenContent$lambda$121$handleAudioPassthroughPriorityChange(Lcom/dh/myembyapp/ui/screens/player/PlayerDecoderSelectionHandler;Z)V", 0);
        this.a = ng1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ng1 ng1Var = this.a;
        ng1Var.h.invoke();
        BuildersKt__Builders_commonKt.launch$default(ng1Var.a, null, null, new mg1(ng1Var, zBooleanValue, null, 0), 3, null);
        return Unit.INSTANCE;
    }
}
