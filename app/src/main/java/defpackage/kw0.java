package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.material3.LabelKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.dh.myembyapp.data.ProxyProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kw0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kw0(ProxyProtocol proxyProtocol, Function1 function1, boolean z, int i) {
        this.a = 2;
        this.d = proxyProtocol;
        this.e = function1;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        boolean z = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LabelKt.HandleInteractions$lambda$7(this.b, (TooltipState) obj4, (MutableInteractionSource) obj3, this.c, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                lh1.d(z, (fj1) obj4, (gj1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                gr1.f((ProxyProtocol) obj4, (Function1) obj3, z, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                sv1.b(z, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                c52.f(z, (Function1) obj4, (FocusRequester) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextFieldSelectionManagerKt.TextFieldSelectionHandle$lambda$3(this.b, (ResolvedTextDirection) obj4, (TextFieldSelectionManager) obj3, this.c, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ kw0(boolean z, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
