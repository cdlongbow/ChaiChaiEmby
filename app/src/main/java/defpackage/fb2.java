package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fb2 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ xa2 o;
    public final /* synthetic */ MutableState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb2(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Function1 function1, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, xa2 xa2Var, MutableState mutableState12) {
        super(0, Intrinsics.Kotlin.class, "requestDeviceCode", "TraktSyncDialog$requestDeviceCode(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/data/repository/TraktRepository;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = coroutineScope;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = function1;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.j = mutableState7;
        this.k = mutableState8;
        this.l = mutableState9;
        this.m = mutableState10;
        this.n = mutableState11;
        this.o = xa2Var;
        this.p = mutableState12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState mutableState = this.b;
        if (!((Boolean) mutableState.getValue()).booleanValue()) {
            MutableState mutableState2 = this.c;
            if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                Function1 function1 = this.d;
                MutableState mutableState3 = this.e;
                MutableState mutableState4 = this.g;
                MutableState mutableState5 = this.h;
                MutableState mutableState6 = this.i;
                MutableState mutableState7 = this.j;
                MutableState mutableState8 = this.k;
                MutableState mutableState9 = this.l;
                MutableState mutableState10 = this.m;
                MutableState mutableState11 = this.n;
                i92 i92VarD = hb2.d(function1, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, false);
                mutableState.setValue(Boolean.TRUE);
                mutableState10.setValue("正在生成授权二维码...");
                mutableState11.setValue(q92.c);
                BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new s6(this.o, i92VarD, this.p, mutableState2, mutableState10, mutableState11, mutableState, (Continuation) null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
