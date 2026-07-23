package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.VideoPriorityRule;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ q7(TextFieldSelectionManager textFieldSelectionManager, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, Function1 function1, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i) {
        this.e = textFieldSelectionManager;
        this.g = legacyTextFieldState;
        this.b = z;
        this.c = z2;
        this.h = function1;
        this.i = textFieldValue;
        this.j = offsetMapping;
        this.k = density;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.k;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.j;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                m8.f((ServerConfig) obj8, (List) obj6, this.b, (VideoVersionPrioritySettings) obj5, (String) obj4, this.c, (FocusRequester) obj7, (Function3) obj3, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return CoreTextFieldKt.CoreTextField$lambda$22$0$1((TextFieldSelectionManager) obj8, (LegacyTextFieldState) obj6, this.b, this.c, (Function1) obj5, (TextFieldValue) obj4, (OffsetMapping) obj7, (Density) obj3, this.d, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                cc1.H((VideoPriorityRule) obj8, this.b, this.c, (FocusRequester) obj7, (FocusRequester) obj6, (Function1) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q7(ServerConfig serverConfig, List list, boolean z, VideoVersionPrioritySettings videoVersionPrioritySettings, String str, boolean z2, FocusRequester focusRequester, Function3 function3, int i) {
        this.e = serverConfig;
        this.g = list;
        this.b = z;
        this.h = videoVersionPrioritySettings;
        this.i = str;
        this.c = z2;
        this.j = focusRequester;
        this.k = function3;
        this.d = i;
    }

    public /* synthetic */ q7(VideoPriorityRule videoPriorityRule, boolean z, boolean z2, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function1, Function0 function0, Function0 function2, int i) {
        this.e = videoPriorityRule;
        this.b = z;
        this.c = z2;
        this.j = focusRequester;
        this.g = focusRequester2;
        this.h = function1;
        this.i = function0;
        this.k = function2;
        this.d = i;
    }
}
