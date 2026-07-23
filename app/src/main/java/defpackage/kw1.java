package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.ToggleableAppBarItem;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kw1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kw1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0$3$0((SelectionManager) obj2, (MutableState) obj);
            case 1:
                return SwipeToDismissBoxKt.rememberSwipeToDismissBoxState$lambda$1$lambda$0((SwipeToDismissBoxValue) obj2, (Function1) obj);
            case 2:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$3$0((TextFieldSelectionManager) obj2, (MutableState) obj);
            case 3:
                ((MutableState) obj).setValue((LightThemeBackgroundStyle) obj2);
                return Unit.INSTANCE;
            case 4:
                ((MutableState) obj).setValue((DarkThemeStyle) obj2);
                return Unit.INSTANCE;
            case 5:
                ((MutableState) obj).setValue((DarkThemeGlowPosition) obj2);
                return Unit.INSTANCE;
            case 6:
                ((MutableState) obj).setValue((AppThemePreset) obj2);
                return Unit.INSTANCE;
            case 7:
                return ToggleableAppBarItem.MenuContent$lambda$2$lambda$1((ToggleableAppBarItem) obj2, (AppBarMenuState) obj);
            case 8:
                return TransformedTextFieldState.outputTransformedText$lambda$0$0((TransformedTextFieldState) obj2, (OutputTransformation) obj);
            case 9:
                return TransformedTextFieldState.codepointTransformedText$lambda$0$0((TransformedTextFieldState) obj2, (CodepointTransformation) obj);
            default:
                return WideNavigationRailStateKt.rememberWideNavigationRailState$lambda$1$lambda$0((WideNavigationRailValue) obj2, (FiniteAnimationSpec) obj);
        }
    }
}
