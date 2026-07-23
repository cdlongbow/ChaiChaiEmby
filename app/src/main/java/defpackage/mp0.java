package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class mp0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ zq0 b;
    public final /* synthetic */ Ref.ObjectRef c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(zq0 zq0Var, Ref.ObjectRef objectRef, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Context context, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.b = zq0Var;
        this.c = objectRef;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = context;
        this.i = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new mp0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mp0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        Object objG;
        Job job2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        Ref.ObjectRef objectRef = this.c;
        MutableState mutableState = this.e;
        MutableState mutableState2 = this.d;
        MutableState mutableState3 = this.i;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutableState2.setValue(Boolean.TRUE);
                mutableState.setValue(CollectionsKt.emptyList());
                zq0 zq0Var = this.b;
                this.a = 1;
                objG = zq0Var.G(this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                objG = ((Result) obj).getValue();
            }
            Boolean bool = Boolean.FALSE;
            mutableState2.setValue(bool);
            MutableState mutableState4 = this.g;
            if (Result.m8832isSuccessimpl(objG)) {
                mutableState.setValue((List) objG);
                mutableState4.setValue(Boolean.TRUE);
            }
            Context context = this.h;
            Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objG);
            if (thM8828exceptionOrNullimpl != null) {
                mutableState.setValue(CollectionsKt.emptyList());
                String message = thM8828exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "准备媒体库排序数据失败";
                }
                Toast.makeText(context, message, 0).show();
            }
            Job job3 = (Job) mutableState3.getValue();
            T t = objectRef.element;
            if (t == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("job");
                job2 = null;
            } else {
                job2 = (Job) t;
            }
            if (job3 == job2) {
                mutableState3.setValue(null);
                mutableState2.setValue(bool);
            }
        } catch (CancellationException unused) {
        } finally {
            Job job4 = (Job) mutableState3.getValue();
            T t2 = objectRef.element;
            if (t2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("job");
                job = null;
            } else {
                job = (Job) t2;
            }
            if (job4 == job) {
                mutableState3.setValue(null);
                mutableState2.setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }
}
