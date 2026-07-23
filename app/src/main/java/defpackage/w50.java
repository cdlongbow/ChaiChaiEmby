package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w50 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ float g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ w50(String str, FocusRequester focusRequester, boolean z, Modifier modifier, float f, Float f2, boolean z2, Function1 function1, Function0 function0, int i) {
        this.c = str;
        this.j = focusRequester;
        this.b = z;
        this.k = modifier;
        this.g = f;
        this.l = f2;
        this.d = z2;
        this.e = function1;
        this.h = function0;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.i;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                u90.s0(this.c, (FocusRequester) obj5, this.b, (Modifier) obj4, this.g, (Float) obj3, this.d, this.e, this.h, (Composer) obj, iUpdateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                bq0.R(this.b, (List) obj5, this.c, (String) obj4, this.d, this.e, (Function2) obj3, this.g, this.h, (Composer) obj, iUpdateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ w50(boolean z, List list, String str, String str2, boolean z2, Function1 function1, Function2 function2, float f, Function0 function0, int i) {
        this.b = z;
        this.j = list;
        this.c = str;
        this.k = str2;
        this.d = z2;
        this.e = function1;
        this.l = function2;
        this.g = f;
        this.h = function0;
        this.i = i;
    }
}
