package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.SubtitlePreferences;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class vl1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState A;
    public final /* synthetic */ AtomicLong B;
    public final /* synthetic */ on1 C;
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ eo1 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ SubtitlePreferences l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ ln1 u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;
    public final /* synthetic */ MutableState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl1(String str, String str2, int i, int i2, Function0 function0, Function1 function1, Context context, eo1 eo1Var, Function0 function2, SubtitlePreferences subtitlePreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, ln1 ln1Var, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, AtomicLong atomicLong, on1 on1Var, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.g = function0;
        this.h = function1;
        this.i = context;
        this.j = eo1Var;
        this.k = function2;
        this.l = subtitlePreferences;
        this.m = mutableState;
        this.n = mutableState2;
        this.o = mutableState3;
        this.p = mutableState4;
        this.q = mutableState5;
        this.r = mutableState6;
        this.s = mutableState7;
        this.t = mutableState8;
        this.u = ln1Var;
        this.v = mutableState9;
        this.w = mutableState10;
        this.x = mutableState11;
        this.y = mutableState12;
        this.z = mutableState13;
        this.A = mutableState14;
        this.B = atomicLong;
        this.C = on1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vl1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vl1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            Function0 function0 = this.g;
            Function1 function1 = this.h;
            Context context = this.i;
            eo1 eo1Var = this.j;
            Object objK = ku.K(new c4(function0, function1, context, eo1Var, this.p, this.q, this.r, this.s, 3), new ci1(this.t, this.u, this.z, this.A, this.B, this.C, 0), new tm1(eo1Var, this.k, this.l, this.v, this.w, this.x, this.y), this.b, this.d, this.e, new vh1(14, this.m), new vh1(15, this.n), new vh1(16, this.o), new n61(context, 7), this);
            if (objK != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objK = Unit.INSTANCE;
            }
            if (objK == coroutine_suspended) {
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
