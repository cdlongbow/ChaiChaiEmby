package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.SubtitlePreferences;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jk1 extends FunctionReferenceImpl implements Function3 {
    public final /* synthetic */ MutableState A;
    public final /* synthetic */ MutableState B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ AtomicLong D;
    public final /* synthetic */ on1 E;
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ eo1 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ SubtitlePreferences j;
    public final /* synthetic */ CoroutineScope k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ ln1 v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;
    public final /* synthetic */ MutableState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, eo1 eo1Var, Function0 function0, SubtitlePreferences subtitlePreferences, CoroutineScope coroutineScope, Context context, Function0 function1, Function1 function2, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, ln1 ln1Var, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, AtomicLong atomicLong, on1 on1Var) {
        super(3, Intrinsics.Kotlin.class, "handleSubtitleSettingsApply", "PlayerScreenContent$lambda$121$handleSubtitleSettingsApply(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lkotlin/jvm/functions/Function0;Lcom/dh/myembyapp/data/SubtitlePreferences;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/concurrent/atomic/AtomicLong;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;FII)V", 0);
        this.a = mutableState;
        this.b = mutableState2;
        this.c = mutableState3;
        this.d = mutableState4;
        this.e = mutableState5;
        this.g = mutableState6;
        this.h = eo1Var;
        this.i = function0;
        this.j = subtitlePreferences;
        this.k = coroutineScope;
        this.l = context;
        this.m = function1;
        this.n = function2;
        this.o = mutableState7;
        this.p = mutableState8;
        this.q = mutableState9;
        this.r = mutableState10;
        this.s = mutableState11;
        this.t = mutableState12;
        this.u = mutableState13;
        this.v = ln1Var;
        this.w = mutableState14;
        this.x = mutableState15;
        this.y = mutableState16;
        this.z = mutableState17;
        this.A = mutableState18;
        this.B = mutableState19;
        this.C = mutableState20;
        this.D = atomicLong;
        this.E = on1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj).floatValue();
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        MutableState mutableState = this.a;
        float fFloatValue2 = ((Number) mutableState.getValue()).floatValue();
        String str = (String) this.b.getValue();
        MutableState mutableState2 = this.c;
        String str2 = (String) mutableState2.getValue();
        boolean zBooleanValue = ((Boolean) this.d.getValue()).booleanValue();
        eo1 eo1Var = this.h;
        Function0 function0 = this.i;
        SubtitlePreferences subtitlePreferences = this.j;
        MutableState mutableState3 = this.q;
        MutableState mutableState4 = this.r;
        MutableState mutableState5 = this.s;
        MutableState mutableState6 = this.t;
        tl1 tl1Var = new tl1(eo1Var, function0, subtitlePreferences, mutableState3, mutableState4, mutableState5, mutableState6);
        wl1 wl1Var = new wl1(this.A);
        this.e.setValue(Integer.valueOf(iIntValue));
        Unit unit = Unit.INSTANCE;
        this.g.setValue(Integer.valueOf(iIntValue2));
        boolean z = fFloatValue == fFloatValue2;
        CoroutineScope coroutineScope = this.k;
        Context context = this.l;
        boolean z2 = z;
        Function0 function1 = this.m;
        Function1 function2 = this.n;
        MutableState mutableState7 = this.o;
        MutableState mutableState8 = this.p;
        MutableState mutableState9 = this.u;
        ln1 ln1Var = this.v;
        MutableState mutableState10 = this.w;
        MutableState mutableState11 = this.x;
        MutableState mutableState12 = this.y;
        MutableState mutableState13 = this.z;
        MutableState mutableState14 = this.B;
        MutableState mutableState15 = this.C;
        AtomicLong atomicLong = this.D;
        on1 on1Var = this.E;
        if (str != null && zBooleanValue && !z2 && fFloatValue != 0.0f) {
            tl1Var.invoke(Float.valueOf(fFloatValue2), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ul1(str, str2, fFloatValue, iIntValue, iIntValue2, context, mutableState2, function1, function2, eo1Var, mutableState9, ln1Var, function0, subtitlePreferences, mutableState3, mutableState4, mutableState5, mutableState6, mutableState, mutableState7, mutableState8, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState15, atomicLong, on1Var, null), 3, null);
        } else if (str == null || !zBooleanValue || fFloatValue2 == 0.0f || fFloatValue != 0.0f) {
            mutableState.setValue(Float.valueOf(fFloatValue));
            tl1Var.invoke(Float.valueOf(fFloatValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
            if (fFloatValue == 0.0f) {
                mutableState7.setValue(null);
            }
        } else {
            tl1Var.invoke(Float.valueOf(fFloatValue2), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new vl1(str, str2, iIntValue, iIntValue2, function1, function2, context, eo1Var, function0, subtitlePreferences, mutableState, mutableState7, mutableState8, mutableState10, mutableState11, mutableState12, mutableState13, mutableState9, ln1Var, mutableState3, mutableState4, mutableState5, mutableState6, mutableState14, mutableState15, atomicLong, on1Var, null), 3, null);
        }
        wl1Var.invoke();
        return Unit.INSTANCE;
    }
}
