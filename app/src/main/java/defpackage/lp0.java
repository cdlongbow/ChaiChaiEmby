package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.model.ItemCounts;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class lp0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zq0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ State g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(zq0 zq0Var, Context context, boolean z, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.b = zq0Var;
        this.e = context;
        this.c = z;
        this.d = mutableState;
        this.g = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                MutableState mutableState = this.d;
                State state = this.g;
                return new lp0(this.c, (gq0) obj2, this.b, mutableState, state, continuation);
            default:
                MutableState mutableState2 = (MutableState) this.g;
                return new lp0(this.b, (Context) obj2, this.c, this.d, mutableState2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((lp0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        boolean z = this.c;
        State state = this.g;
        Object obj2 = this.e;
        MutableState mutableState = this.d;
        zq0 zq0Var = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (z && ((rn0) mutableState.getValue()) == rn0.a && !((gq0) obj2).a.isEmpty() && ((ItemCounts) state.getValue()) == null && zq0Var.H && !zq0Var.F && zq0Var.s.getValue() == null) {
                    zq0Var.F = true;
                    Job job = zq0Var.y;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    zq0Var.y = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var), Dispatchers.getIO(), null, new mq0(zq0Var, null, 0), 2, null);
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                if (((cq0) mutableState.getValue()).a != null) {
                    Context context = (Context) obj2;
                    String str = ((cq0) mutableState.getValue()).a;
                    context.getClass();
                    if (zq0Var.Q == null) {
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        zq0Var.Q = new aa(applicationContext);
                    }
                    zq0Var.R = str;
                    zq0Var.K = ((Boolean) ((MutableState) state).getValue()).booleanValue();
                    if (z) {
                        zq0Var.E(true, false);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(boolean z, gq0 gq0Var, zq0 zq0Var, MutableState mutableState, State state, Continuation continuation) {
        super(2, continuation);
        this.c = z;
        this.e = gq0Var;
        this.b = zq0Var;
        this.d = mutableState;
        this.g = state;
    }
}
