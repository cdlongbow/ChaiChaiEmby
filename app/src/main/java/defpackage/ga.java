package defpackage;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ga implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ int e;

    public /* synthetic */ ga(Modifier modifier, Function0 function0, boolean z, int i) {
        this.a = 0;
        this.d = modifier;
        this.c = function0;
        this.b = z;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidSelectionHandles_androidKt.SelectionHandleIcon$lambda$0(this.d, this.c, this.b, this.e, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                u90.c0(this.d, this.c, this.b, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                u90.Z(this.d, this.c, this.b, (Composer) obj, iUpdateChangedFlags2);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                u90.z0(this.d, this.c, this.b, (Composer) obj, iUpdateChangedFlags3);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                u90.o0(this.d, this.c, this.b, (Composer) obj, iUpdateChangedFlags4);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                u90.A0(this.d, this.c, this.b, (Composer) obj, iUpdateChangedFlags5);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ga(Function0 function0, Modifier modifier, boolean z, int i, int i2) {
        this.a = i2;
        this.c = function0;
        this.d = modifier;
        this.b = z;
        this.e = i;
    }

    public /* synthetic */ ga(boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = function0;
        this.d = modifier;
        this.e = i;
    }
}
