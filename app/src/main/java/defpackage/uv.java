package defpackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uv implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ uv(LegacyTextFieldState legacyTextFieldState, boolean z, WindowInfo windowInfo, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        this.c = legacyTextFieldState;
        this.b = z;
        this.d = windowInfo;
        this.e = textFieldSelectionManager;
        this.g = textFieldValue;
        this.h = offsetMapping;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                return CoreTextFieldKt.CoreTextField$lambda$16$0((LegacyTextFieldState) obj6, this.b, (WindowInfo) obj5, (TextFieldSelectionManager) obj4, (TextFieldValue) obj3, (OffsetMapping) obj2, (LayoutCoordinates) obj);
            default:
                List list = (List) obj6;
                Function3 function3 = (Function3) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                hq hqVar = new hq(17);
                lazyListScope.items(list.size(), new w5(11, hqVar, list), new x5(list, 10), ComposableLambdaKt.composableLambdaInstance(802480018, true, new z70(list, list, (Map) obj5, this.b, (String) obj4, (Function1) obj3, function3)));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ uv(List list, Map map, boolean z, String str, Function1 function1, Function3 function3) {
        this.c = list;
        this.d = map;
        this.b = z;
        this.e = str;
        this.g = function1;
        this.h = function3;
    }
}
