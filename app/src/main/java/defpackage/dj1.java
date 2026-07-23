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
public final class dj1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState A;
    public final /* synthetic */ MutableState B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ AtomicLong D;
    public final /* synthetic */ on1 E;
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ eo1 l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ ln1 n;
    public final /* synthetic */ Function0 o;
    public final /* synthetic */ SubtitlePreferences p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;
    public final /* synthetic */ MutableState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj1(String str, String str2, float f, int i, int i2, Context context, MutableState mutableState, Function0 function0, Function1 function1, eo1 eo1Var, MutableState mutableState2, ln1 ln1Var, Function0 function2, SubtitlePreferences subtitlePreferences, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, AtomicLong atomicLong, on1 on1Var, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = f;
        this.e = i;
        this.g = i2;
        this.h = context;
        this.i = mutableState;
        this.j = function0;
        this.k = function1;
        this.l = eo1Var;
        this.m = mutableState2;
        this.n = ln1Var;
        this.o = function2;
        this.p = subtitlePreferences;
        this.q = mutableState3;
        this.r = mutableState4;
        this.s = mutableState5;
        this.t = mutableState6;
        this.u = mutableState7;
        this.v = mutableState8;
        this.w = mutableState9;
        this.x = mutableState10;
        this.y = mutableState11;
        this.z = mutableState12;
        this.A = mutableState13;
        this.B = mutableState14;
        this.C = mutableState15;
        this.D = atomicLong;
        this.E = on1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new dj1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dj1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (dn1.X(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.b, this.c, this.d, this.e, this.g, false, this) == coroutine_suspended) {
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
