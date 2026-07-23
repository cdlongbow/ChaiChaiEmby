package defpackage;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xy implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ xy(Modifier modifier, int i, int i2) {
        this.a = 4;
        this.c = modifier;
        this.b = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                gz.b((Function1) this.c, this.b, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                gz.g((Function1) this.c, this.b, (Composer) obj, iUpdateChangedFlags2);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                cc1.w((Function1) this.c, this.b, (Composer) obj, iUpdateChangedFlags3);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                cc1.a((Function1) this.c, this.b, (Composer) obj, iUpdateChangedFlags4);
                return Unit.INSTANCE;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidCursorHandle_androidKt.DefaultCursorHandle$lambda$0((Modifier) this.c, this.b, this.d, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ xy(int i, int i2, int i3, Function1 function1) {
        this.a = i3;
        this.b = i;
        this.c = function1;
        this.d = i2;
    }
}
