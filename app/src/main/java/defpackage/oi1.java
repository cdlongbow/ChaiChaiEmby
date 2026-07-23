package defpackage;

import androidx.compose.runtime.State;
import com.dh.myembyapp.data.DecoderSettings;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class oi1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ og1 a;
    public final /* synthetic */ State b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi1(og1 og1Var, State state, Continuation continuation) {
        super(2, continuation);
        this.a = og1Var;
        this.b = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new oi1(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oi1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        DecoderSettings.DecoderConfig decoderConfig = (DecoderSettings.DecoderConfig) this.b.getValue();
        if (decoderConfig == null) {
            return Unit.INSTANCE;
        }
        String mode = decoderConfig.getMode();
        mode.getClass();
        og1 og1Var = this.a;
        og1Var.a.setValue(mode);
        String audioMode = decoderConfig.getAudioMode();
        audioMode.getClass();
        og1Var.b.setValue(audioMode);
        og1Var.d.setValue(Boolean.valueOf(decoderConfig.getAudioPassthroughPriorityEnabled()));
        og1Var.e.setValue(Boolean.valueOf(decoderConfig.getDv7CompatibilityEnabled()));
        og1Var.f.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
