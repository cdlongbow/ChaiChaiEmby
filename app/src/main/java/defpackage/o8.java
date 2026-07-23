package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.dh.myembyapp.data.model.PersonInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ o8(ImageVector imageVector, Function0 function0, boolean z, boolean z2, boolean z3, FocusRequester focusRequester, Modifier modifier, int i) {
        this.h = imageVector;
        this.e = function0;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.j = focusRequester;
        this.i = modifier;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.g;
        Object obj3 = this.i;
        Object obj4 = this.j;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                s8.a(this.e, (Function2) obj5, this.b, this.c, this.d, (Modifier) obj3, (v8) obj4, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                u90.a((PersonInfo) obj5, (FocusRequester) obj3, this.b, this.c, this.d, (Function1) obj4, this.e, (Composer) obj, iUpdateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                e92.c((ImageVector) obj5, this.e, this.b, this.c, this.d, (FocusRequester) obj4, (Modifier) obj3, (Composer) obj, iUpdateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o8(PersonInfo personInfo, FocusRequester focusRequester, boolean z, boolean z2, boolean z3, Function1 function1, Function0 function0, int i) {
        this.h = personInfo;
        this.i = focusRequester;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.j = function1;
        this.e = function0;
        this.g = i;
    }

    public /* synthetic */ o8(Function0 function0, Function2 function2, boolean z, boolean z2, boolean z3, Modifier modifier, v8 v8Var, int i) {
        this.e = function0;
        this.h = function2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.i = modifier;
        this.j = v8Var;
        this.g = i;
    }
}
