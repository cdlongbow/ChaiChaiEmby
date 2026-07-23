package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class sn1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ UserPreferences.AssSubtitleEnhancementGuard a;
    public final /* synthetic */ UserPreferences b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn1(UserPreferences.AssSubtitleEnhancementGuard assSubtitleEnhancementGuard, UserPreferences userPreferences, Continuation continuation) {
        super(2, continuation);
        this.a = assSubtitleEnhancementGuard;
        this.b = userPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new sn1(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sn1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        UserPreferences.AssSubtitleEnhancementGuard assSubtitleEnhancementGuard = this.a;
        if (assSubtitleEnhancementGuard != null) {
            this.b.saveEnableAssSubtitleEnhancement(false);
            Log.e("PlayerScreen", "检测到上次 ASS 增强渲染异常退出，已自动回退到 Media3 默认渲染。mediaId=" + assSubtitleEnhancementGuard.getMediaId() + ", subtitle=" + assSubtitleEnhancementGuard.getSubtitleLabel());
        }
        return Unit.INSTANCE;
    }
}
