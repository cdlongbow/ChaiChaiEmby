package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yb1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ FocusRequester g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ yb1(String str, boolean z, Modifier modifier, FocusRequester focusRequester, Function0 function0, int i, int i2) {
        this.b = str;
        this.c = z;
        this.e = modifier;
        this.g = focusRequester;
        this.d = function0;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cc1.v(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.i, (Composer) obj, this.e, this.g, this.b, this.d, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                s92.b(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.i, (Composer) obj, this.e, this.g, this.b, this.d, this.c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ yb1(String str, boolean z, Function0 function0, Modifier modifier, FocusRequester focusRequester, int i, int i2) {
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = modifier;
        this.g = focusRequester;
        this.h = i;
        this.i = i2;
    }
}
