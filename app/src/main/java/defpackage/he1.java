package defpackage;

import android.util.Log;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class he1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ie1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he1(ie1 ie1Var, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.b = ie1Var;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new he1(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((he1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        ie1 ie1Var = this.b;
        Function1 function1 = ie1Var.f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function2 = ie1Var.e;
                this.a = 1;
                if (function2.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
            }
            int i2 = this.c;
            String str2 = i2 != 0 ? "，将使用解码输出" : "";
            if (i2 == 0) {
                str = "0.0秒";
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%+.1f秒", Arrays.copyOf(new Object[]{Float.valueOf(i2 / 1000.0f)}, 1));
            }
            function1.invoke("音频偏移已设置为 " + str + str2);
        } catch (Exception e) {
            ei1 ei1Var = ie1Var.d;
            int i3 = this.d;
            ei1Var.invoke(Boxing.boxInt(i3));
            ie1Var.b.saveAudioDelayMs(i3);
            Log.e("PlayerScreen", "应用音频偏移失败", e);
            function1.invoke("音频偏移应用失败: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
