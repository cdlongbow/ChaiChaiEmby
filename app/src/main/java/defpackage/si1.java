package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class si1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ DefaultBandwidthMeter b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pn1 e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ AtomicLong j;
    public final /* synthetic */ on1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si1(DefaultBandwidthMeter defaultBandwidthMeter, int i, int i2, pn1 pn1Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, AtomicLong atomicLong, on1 on1Var, Continuation continuation) {
        super(2, continuation);
        this.b = defaultBandwidthMeter;
        this.c = i;
        this.d = i2;
        this.e = pn1Var;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
        this.j = atomicLong;
        this.k = on1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new si1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((si1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ExoPlayer exoPlayer = (ExoPlayer) this.g.getValue();
            qi1 qi1Var = new qi1(this.h, this.i);
            ri1 ri1Var = new ri1(this.j, this.k);
            this.a = 1;
            if (ig2.H(exoPlayer, this.b, this.c, this.d, this.e, qi1Var, ri1Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
