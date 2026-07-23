package defpackage;

import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xk1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ ie1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk1(ie1 ie1Var) {
        super(1, Intrinsics.Kotlin.class, "handleAudioDelayMsChange", "PlayerScreenContent$lambda$121$handleAudioDelayMsChange(Lcom/dh/myembyapp/ui/screens/player/PlayerAudioDelayHandler;I)V", 0);
        this.a = ie1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        ie1 ie1Var = this.a;
        Function0 function0 = ie1Var.g;
        int iNormalizeAudioDelayMs = UserPreferences.INSTANCE.normalizeAudioDelayMs(iIntValue);
        zh1 zh1Var = ie1Var.c;
        if (iNormalizeAudioDelayMs == ((Number) zh1Var.invoke()).intValue()) {
            function0.invoke();
        } else {
            int iIntValue2 = ((Number) zh1Var.invoke()).intValue();
            ie1Var.d.invoke(Integer.valueOf(iNormalizeAudioDelayMs));
            ie1Var.b.saveAudioDelayMs(iNormalizeAudioDelayMs);
            function0.invoke();
            BuildersKt__Builders_commonKt.launch$default(ie1Var.a, null, null, new he1(ie1Var, iNormalizeAudioDelayMs, iIntValue2, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
