package defpackage;

import android.content.Context;
import android.util.Log;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ej1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState A;
    public final /* synthetic */ MutableState B;
    public final /* synthetic */ AtomicLong C;
    public final /* synthetic */ on1 D;
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ CoroutineScope j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ Function0 l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ eo1 n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ ln1 p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ SubtitlePreferences r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;
    public final /* synthetic */ MutableState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, CoroutineScope coroutineScope, Context context, Function0 function0, Function1 function1, eo1 eo1Var, MutableState mutableState9, ln1 ln1Var, Function0 function2, SubtitlePreferences subtitlePreferences, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, AtomicLong atomicLong, on1 on1Var, Continuation continuation) {
        super(2, continuation);
        this.a = mutableState;
        this.b = mutableState2;
        this.c = mutableState3;
        this.d = mutableState4;
        this.e = mutableState5;
        this.g = mutableState6;
        this.h = mutableState7;
        this.i = mutableState8;
        this.j = coroutineScope;
        this.k = context;
        this.l = function0;
        this.m = function1;
        this.n = eo1Var;
        this.o = mutableState9;
        this.p = ln1Var;
        this.q = function2;
        this.r = subtitlePreferences;
        this.s = mutableState10;
        this.t = mutableState11;
        this.u = mutableState12;
        this.v = mutableState13;
        this.w = mutableState14;
        this.x = mutableState15;
        this.y = mutableState16;
        this.z = mutableState17;
        this.A = mutableState18;
        this.B = mutableState19;
        this.C = atomicLong;
        this.D = on1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ej1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ej1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean zBooleanValue = ((Boolean) this.a.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.b.getValue()).booleanValue();
        String str = (String) this.c.getValue();
        MutableState mutableState = this.d;
        String str2 = (String) mutableState.getValue();
        MutableState mutableState2 = this.e;
        float fFloatValue = ((Number) mutableState2.getValue()).floatValue();
        int iIntValue = ((Number) this.g.getValue()).intValue();
        int iIntValue2 = ((Number) this.h.getValue()).intValue();
        String str3 = (String) this.i.getValue();
        if (!zBooleanValue) {
            MutableState mutableState3 = this.i;
            if (!zBooleanValue2) {
                mutableState3.setValue(null);
                Unit unit = Unit.INSTANCE;
            } else if (str != null) {
                String strD = in1.d(str, str2, fFloatValue);
                if (strD == null) {
                    mutableState3.setValue(null);
                    Unit unit2 = Unit.INSTANCE;
                } else if (!Intrinsics.areEqual(strD, str3)) {
                    Log.d("SubtitleDelay", "检测到已保存的外挂字幕时间偏移，自动恢复: delay=" + fFloatValue + "s, url=" + str);
                    BuildersKt__Builders_commonKt.launch$default(this.j, null, null, new dj1(str, str2, fFloatValue, iIntValue, iIntValue2, this.k, mutableState, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, mutableState2, mutableState3, this.a, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, null), 3, null);
                    Unit unit3 = Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
