package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gb2 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb2(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11) {
        super(0, Intrinsics.Kotlin.class, "logout", "TraktSyncDialog$logout(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = function1;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
        this.j = mutableState8;
        this.k = mutableState9;
        this.l = mutableState10;
        this.m = mutableState11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState mutableState = this.b;
        mutableState.setValue("");
        MutableState mutableState2 = this.c;
        mutableState2.setValue("");
        MutableState mutableState3 = this.d;
        mutableState3.setValue(0L);
        this.e.setValue(null);
        this.g.setValue(Boolean.FALSE);
        this.a.invoke(hb2.c(this.h, mutableState, mutableState2, mutableState3, this.i, this.j, this.k));
        this.l.setValue("已退出 Trakt 授权。");
        this.m.setValue(q92.a);
        return Unit.INSTANCE;
    }
}
