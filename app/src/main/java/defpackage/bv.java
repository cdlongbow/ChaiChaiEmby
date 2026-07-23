package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bv implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ Function e;
    public final /* synthetic */ Function g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ bv(ContextMenuState contextMenuState, Function0 function0, Function1 function1, Modifier modifier, boolean z, Function0 function2, Function2 function3, int i, int i2) {
        this.j = contextMenuState;
        this.b = function0;
        this.e = function1;
        this.d = modifier;
        this.c = z;
        this.k = function2;
        this.g = function3;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function function = this.g;
        Function function2 = this.e;
        Object obj3 = this.k;
        Object obj4 = this.b;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ContextMenuAreaKt.ContextMenuArea$lambda$3((ContextMenuState) obj5, (Function0) obj4, (Function1) function2, this.d, this.c, (Function0) obj3, (Function2) function, this.h, this.i, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                ud1.a((String) obj5, (Function0) obj4, this.c, this.d, (FocusRequester) obj3, (Function1) function2, (Function2) function, (Composer) obj, iUpdateChangedFlags, this.i);
                return Unit.INSTANCE;
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return PullToRefreshKt.PullToRefreshBox$lambda$1(this.c, (Function0) obj4, this.d, (PullToRefreshState) obj5, (Alignment) obj3, (Function3) function2, (Function3) function, this.h, this.i, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SliderKt.Slider$lambda$7((SliderState) obj5, this.d, this.c, (SliderColors) obj4, (MutableInteractionSource) obj3, (Function3) function2, (Function3) function, this.h, this.i, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ bv(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3 function3, Function3 function4, int i, int i2) {
        this.j = sliderState;
        this.d = modifier;
        this.c = z;
        this.b = sliderColors;
        this.k = mutableInteractionSource;
        this.e = function3;
        this.g = function4;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ bv(String str, Function0 function0, boolean z, Modifier modifier, FocusRequester focusRequester, Function1 function1, Function2 function2, int i, int i2) {
        this.j = str;
        this.b = function0;
        this.c = z;
        this.d = modifier;
        this.k = focusRequester;
        this.e = function1;
        this.g = function2;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ bv(boolean z, Function0 function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3 function3, Function3 function4, int i, int i2) {
        this.c = z;
        this.b = function0;
        this.d = modifier;
        this.j = pullToRefreshState;
        this.k = alignment;
        this.e = function3;
        this.g = function4;
        this.h = i;
        this.i = i2;
    }
}
