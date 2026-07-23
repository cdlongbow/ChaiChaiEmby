package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.Library;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ int m;

    public /* synthetic */ n4(String str, Library library, boolean z, boolean z2, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function1, Function1 function2, Function0 function0, Function0 function3, int i) {
        this.a = 2;
        this.d = str;
        this.e = library;
        this.i = z;
        this.j = z2;
        this.h = focusRequester;
        this.g = focusRequester2;
        this.c = function1;
        this.k = function2;
        this.b = function0;
        this.l = function3;
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.g;
        Object obj6 = this.h;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                f7.e(this.b, this.c, this.d, (Function2) obj7, (Function3) obj5, (Function2) obj6, this.i, this.j, (Modifier) obj4, (p7) obj3, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                f7.e(this.b, this.c, this.d, (Function2) obj7, (Function3) obj5, (Function2) obj6, this.i, this.j, (Modifier) obj4, (p7) obj3, (Composer) obj, iUpdateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                sy0.d(this.d, (Library) obj7, this.i, this.j, (FocusRequester) obj6, (FocusRequester) obj5, this.c, (Function1) obj4, this.b, (Function0) obj3, (Composer) obj, iUpdateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n4(Function0 function0, Function1 function1, String str, Function2 function2, Function3 function3, Function2 function4, boolean z, boolean z2, Modifier modifier, p7 p7Var, int i, int i2) {
        this.a = i2;
        this.b = function0;
        this.c = function1;
        this.d = str;
        this.e = function2;
        this.g = function3;
        this.h = function4;
        this.i = z;
        this.j = z2;
        this.k = modifier;
        this.l = p7Var;
        this.m = i;
    }
}
