package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ModalWideNavigationRailProperties;
import androidx.compose.material3.RailPredictiveBackState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.WideNavigationRail_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.server.ServerIconLibraryInputServerManager;
import com.dh.myembyapp.server.WebDavSyncConfigServerManager;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ kh(List list, String str, Function0 function0, Function1 function1, Function1 function2, Function0 function3, int i) {
        this.a = 8;
        this.d = list;
        this.g = str;
        this.b = function0;
        this.h = function1;
        this.e = function2;
        this.i = function3;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.b;
        Object obj8 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pi.o((ch) obj8, (Set) obj4, (String) obj3, (Function1) obj6, (Function0) obj7, (Function0) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                return BottomSheetScaffoldKt.BottomSheetScaffoldLayout$lambda$16((Function2) obj8, (Function2) obj4, (Function2) obj3, (Function2) obj6, (Function0) obj7, (SheetState) obj5, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return ComposableLambdaImpl.invoke$lambda$4((ComposableLambdaImpl) obj8, this.e, this.g, this.h, this.b, this.i, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                ((Integer) obj2).getClass();
                u90.b((List) obj8, (LazyListState) obj4, (Map) obj7, (String) obj3, (Function1) obj6, (Function3) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                LazyListState lazyListState = (LazyListState) obj8;
                List list = (List) obj4;
                String str = (String) obj3;
                String str2 = (String) obj7;
                Function1 function1 = (Function1) obj6;
                FocusRequester focusRequester = (FocusRequester) obj5;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1066438567, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.MoviePlaybackOptionsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:2696)");
                    }
                    Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(400.0f), 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    PaddingValues paddingValuesM996PaddingValuesa9UjIt4$default = PaddingKt.m996PaddingValuesa9UjIt4$default(0.0f, Dp.m7813constructorimpl(16.0f), 0.0f, Dp.m7813constructorimpl(18.0f), 5, null);
                    boolean zChangedInstance = composer.changedInstance(list) | composer.changed(str) | composer.changed(str2);
                    int i3 = this.c;
                    boolean zChanged = composer.changed(i3) | zChangedInstance | composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        s60 s60Var = new s60(list, str, str2, i3, focusRequester, function1);
                        composer.updateRememberedValue(s60Var);
                        objRememberedValue = s60Var;
                    }
                    LazyDslKt.LazyColumn(modifierM1052heightInVpY3zN4$default, lazyListState, paddingValuesM996PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 24966, 488);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                gy0.b((String) obj3, (Function1) obj6, (Function1) obj8, (Function1) obj4, (Function0) obj7, (cz0) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ld1.c((String) obj3, (String) obj8, (String) obj4, (Function1) obj6, (Function0) obj7, (md1) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                lx1.f((ServerConfig) obj8, (px1) obj4, (ServerIconLibraryInputServerManager) obj3, (Function0) obj7, (Function1) obj6, (Function1) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                q32.d((List) obj8, (String) obj3, (Function0) obj7, (Function1) obj6, (Function1) obj4, (Function0) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                return TimePickerKt.PeriodToggleImpl$lambda$47((Modifier) obj8, (TimePickerState) obj4, (TimePickerColors) obj3, (MeasurePolicy) obj6, (Shape) obj7, (Shape) obj5, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                ((Integer) obj2).getClass();
                ef2.f((ye2) obj8, (pf2) obj4, (WebDavSyncConfigServerManager) obj3, (Function0) obj7, (Function1) obj6, (Function1) obj5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                return WideNavigationRail_androidKt.ModalWideNavigationRailDialog$lambda$10((Function0) obj7, (ModalWideNavigationRailProperties) obj8, (Function1) obj6, (Function0) obj5, (RailPredictiveBackState) obj4, (Function2) obj3, this.c, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ kh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
        this.h = obj4;
        this.b = obj5;
        this.i = obj6;
        this.c = i;
    }

    public /* synthetic */ kh(Object obj, Object obj2, Object obj3, Function0 function0, Function1 function1, Function1 function2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
        this.b = function0;
        this.h = function1;
        this.i = function2;
        this.c = i;
    }

    public /* synthetic */ kh(String str, String str2, String str3, Function1 function1, Function0 function0, md1 md1Var, int i) {
        this.a = 6;
        this.g = str;
        this.d = str2;
        this.e = str3;
        this.h = function1;
        this.b = function0;
        this.i = md1Var;
        this.c = i;
    }

    public /* synthetic */ kh(String str, Function1 function1, Function1 function2, Function1 function3, Function0 function0, cz0 cz0Var, int i) {
        this.a = 5;
        this.g = str;
        this.h = function1;
        this.d = function2;
        this.e = function3;
        this.b = function0;
        this.i = cz0Var;
        this.c = i;
    }

    public /* synthetic */ kh(List list, LazyListState lazyListState, Map map, String str, Function1 function1, Function3 function3, int i) {
        this.a = 3;
        this.d = list;
        this.e = lazyListState;
        this.b = map;
        this.g = str;
        this.h = function1;
        this.i = function3;
        this.c = i;
    }

    public /* synthetic */ kh(LazyListState lazyListState, List list, String str, String str2, int i, Function1 function1, FocusRequester focusRequester) {
        this.a = 4;
        this.d = lazyListState;
        this.e = list;
        this.g = str;
        this.b = str2;
        this.c = i;
        this.h = function1;
        this.i = focusRequester;
    }

    public /* synthetic */ kh(Function0 function0, ModalWideNavigationRailProperties modalWideNavigationRailProperties, Function1 function1, Function0 function2, RailPredictiveBackState railPredictiveBackState, Function2 function3, int i) {
        this.a = 11;
        this.b = function0;
        this.d = modalWideNavigationRailProperties;
        this.h = function1;
        this.i = function2;
        this.e = railPredictiveBackState;
        this.g = function3;
        this.c = i;
    }
}
