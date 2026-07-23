package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.window.PopupPositionProvider;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class el implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ el(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, CoroutineScope coroutineScope, boolean z, Function2 function2, int i) {
        this.a = 0;
        this.d = popupPositionProvider;
        this.e = basicTooltipState;
        this.g = coroutineScope;
        this.b = z;
        this.h = function2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.TooltipPopup$lambda$2((PopupPositionProvider) obj6, (BasicTooltipState) obj5, (CoroutineScope) obj4, this.b, (Function2) obj3, this.c, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                vj0.a(this.b, (String) obj6, (List) obj5, (String) obj4, (Function1) obj3, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                fz0.b((String) obj6, (ImageVector) obj5, this.b, (Function0) obj4, (Modifier) obj3, (Composer) obj, iUpdateChangedFlags2);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                ra1.a((re) obj6, this.b, (String) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, iUpdateChangedFlags3);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                c52.a((SubtitlePreferences.SubtitleColor) obj6, this.b, (Function0) obj5, (FocusRequester) obj4, (Modifier) obj3, (Composer) obj, iUpdateChangedFlags4);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                v72.a((DarkThemeStyle) obj6, (DarkThemeGlowPosition) obj5, this.b, (Modifier) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags5);
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TimePickerKt.ToggleItem$lambda$50(this.b, (Shape) obj6, (Function0) obj5, (TimePickerColors) obj4, (Function3) obj3, this.c, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ el(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.g = obj3;
        this.h = obj4;
        this.c = i;
    }

    public /* synthetic */ el(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.g = obj3;
        this.h = obj4;
        this.c = i;
    }

    public /* synthetic */ el(boolean z, Object obj, Object obj2, Object obj3, Function function, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
        this.h = function;
        this.c = i;
    }
}
