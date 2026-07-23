package defpackage;

import com.dh.myembyapp.data.DecoderSettings;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class rj1 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ float b;
    public final /* synthetic */ sh1 c;
    public final /* synthetic */ og1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj1(sh1 sh1Var, og1 og1Var, Continuation continuation) {
        super(2, continuation);
        this.c = sh1Var;
        this.d = og1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        rj1 rj1Var = new rj1(this.c, this.d, continuation);
        rj1Var.b = ((Number) obj).floatValue();
        return rj1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rj1) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Float fBoxFloat = Boxing.boxFloat(f);
            this.b = f;
            this.a = 1;
            Object objA = this.c.a(true, fBoxFloat, true, 100L, DecoderSettings.AUDIO_DECODER_FORCE_FFMPEG, false, this);
            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objA = Unit.INSTANCE;
            }
            if (objA == coroutine_suspended) {
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
