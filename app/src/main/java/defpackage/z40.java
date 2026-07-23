package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z40 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaItem b;
    public final /* synthetic */ List c;
    public final /* synthetic */ String d;
    public final /* synthetic */ FocusRequester e;
    public final /* synthetic */ FocusRequester g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function0 l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Modifier o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    public /* synthetic */ z40(MediaItem mediaItem, List list, String str, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function1, Function2 function2, Function2 function3, Function2 function4, Function0 function0, Function0 function5, boolean z, Modifier modifier, int i, int i2, int i3) {
        this.a = i3;
        this.b = mediaItem;
        this.c = list;
        this.d = str;
        this.e = focusRequester;
        this.g = focusRequester2;
        this.h = function1;
        this.i = function2;
        this.j = function3;
        this.k = function4;
        this.l = function0;
        this.m = function5;
        this.n = z;
        this.o = modifier;
        this.p = i;
        this.q = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.q);
                u90.w0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.p | 1);
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.q);
                u90.f0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iUpdateChangedFlags3, iUpdateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }
}
