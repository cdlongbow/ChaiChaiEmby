package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fv0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ FocusRequester d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ fv0(String str, Function0 function0, FocusRequester focusRequester, Function0 function1, int i, int i2, int i3) {
        this.a = i3;
        this.b = str;
        this.c = function0;
        this.d = focusRequester;
        this.e = function1;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gv0.a(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                kz1.a(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.h);
                break;
        }
        return Unit.INSTANCE;
    }
}
