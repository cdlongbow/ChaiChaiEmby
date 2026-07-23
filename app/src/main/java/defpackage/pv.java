package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pv(Object obj, boolean z, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.d;
        boolean z = this.b;
        switch (i) {
            case 0:
                return CoreTextFieldKt.SelectionToolbarAndHandles$lambda$1((TextFieldSelectionManager) obj3, z, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return ExposedDropdownMenuDefaults.TrailingIcon$lambda$1((ExposedDropdownMenuDefaults) obj3, z, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                ((Integer) obj2).intValue();
                gr1.g(z, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                hb2.h(z, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ pv(boolean z, Object obj, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.c = i;
    }
}
