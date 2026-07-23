package defpackage;

import androidx.compose.runtime.State;
import com.dh.myembyapp.data.DanmakuSettings;


import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class h00 extends SuspendLambda implements Function2 {
    public final /* synthetic */ DanmakuPlayer a;
    public final /* synthetic */ DanmakuSettings b;
    public final /* synthetic */ float c;
    public final /* synthetic */ State d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(DanmakuPlayer danmakuPlayer, DanmakuSettings danmakuSettings, float f, State state, Continuation continuation) {
        super(2, continuation);
        this.a = danmakuPlayer;
        this.b = danmakuSettings;
        this.c = f;
        this.d = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h00(this.a, this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h00) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((up1) this.d.getValue()) != null) {
            DanmakuSettings danmakuSettings = this.b;
            float f = this.c;
            DanmakuConfig danmakuConfigC = l00.c(danmakuSettings, f);
            DanmakuPlayer danmakuPlayer = this.a;
            danmakuPlayer.updateConfig(danmakuConfigC);
            danmakuPlayer.updatePlaySpeed(f);
        }
        return Unit.INSTANCE;
    }
}
