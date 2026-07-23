package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ky0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageVector b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ FocusRequester e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ ky0(ImageVector imageVector, String str, boolean z, FocusRequester focusRequester, Function1 function1, Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = imageVector;
        this.c = str;
        this.d = z;
        this.e = focusRequester;
        this.g = function1;
        this.h = function0;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sy0.a(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xy1.a(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
