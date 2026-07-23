package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ FocusRequester e;
    public final /* synthetic */ FocusRequester g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ int j;

    public /* synthetic */ z4(List list, String str, boolean z, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function1, Function2 function2, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = focusRequester;
        this.g = focusRequester2;
        this.h = function1;
        this.i = function2;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                f7.M(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.j | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                f7.a(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.j | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                f7.a(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.j | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
