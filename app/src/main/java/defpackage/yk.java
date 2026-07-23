package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yk implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ yk(String str, boolean z, Function0 function0, boolean z2, FocusRequester focusRequester, int i, int i2) {
        this.g = str;
        this.b = z;
        this.h = function0;
        this.c = z2;
        this.i = focusRequester;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.WrappedAnchor$lambda$1(this.b, (BasicTooltipState) obj5, this.c, (Modifier) obj4, (Function2) obj3, this.d, this.e, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                boolean z = this.b;
                boolean z2 = this.c;
                zb0.c((String) obj5, z, (Function0) obj4, z2, (FocusRequester) obj3, (Composer) obj, iUpdateChangedFlags, this.e);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ yk(boolean z, BasicTooltipState basicTooltipState, boolean z2, Modifier modifier, Function2 function2, int i, int i2) {
        this.b = z;
        this.g = basicTooltipState;
        this.c = z2;
        this.h = modifier;
        this.i = function2;
        this.d = i;
        this.e = i2;
    }
}
