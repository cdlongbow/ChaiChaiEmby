package defpackage;

import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.unit.IntRect;
import androidx.window.core.Version;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h62 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((TextFieldColors) obj).textSelectionColors;
            case 1:
                return TextFieldDelegate.Companion.notifyFocusedRect$lambda$0((TextDelegate) obj);
            case 2:
                return (TextForegroundStyle) obj;
            case 3:
                return TextLayoutState.layoutWithNewMeasureInputs__hBUhpc$lambda$0$0((TextLayoutState) obj);
            case 4:
                return TextLinkScope.textRange$lambda$0$2((IntRect) obj);
            case 5:
                return Boolean.valueOf(TextStringSimpleNode.applySemantics$lambda$3((TextStringSimpleNode) obj));
            case 6:
                ((sl1) obj).invoke();
                return Unit.INSTANCE;
            case 7:
                return Version.bigInteger_delegate$lambda$0((Version) obj);
            default:
                return WideNavigationRailStateImpl._currentVal$lambda$0((WideNavigationRailStateImpl) obj);
        }
    }
}
