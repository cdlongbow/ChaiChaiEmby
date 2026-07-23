package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rf1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ FocusRequester a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf1(FocusRequester focusRequester, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        super(0, Intrinsics.Kotlin.class, "toggleEpisodeMenu", "ModernPlayerControls$toggleEpisodeMenu(Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = focusRequester;
        this.b = function0;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (System.currentTimeMillis() - ((Number) this.c.getValue()).longValue() >= 300) {
            MutableState mutableState = this.d;
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            mutableState.setValue(Boolean.valueOf(!zBooleanValue));
            if (zBooleanValue) {
                FocusRequester.m4818requestFocus3ESFkO8$default(this.a, 0, 1, null);
            } else {
                this.e.setValue(Boolean.FALSE);
                jg1.i(this.g, false);
                jg1.b(this.h);
                jg1.c(this.i, false);
            }
            this.b.invoke();
        }
        return Unit.INSTANCE;
    }
}
