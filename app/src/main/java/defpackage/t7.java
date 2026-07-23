package defpackage;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.api.IqiyiSuggestItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t7 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ t7(List list, int i, Function1 function1) {
        this.a = i;
        this.b = list;
        this.c = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Function1 function1 = this.c;
        List<IqiyiSuggestItem> list = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-950698937, iIntValue, -1, "com.dh.myembyapp.ui.screens.search.AggregateSuggestTags.<anonymous>.<anonymous> (AggregateSearchContent.kt:421)");
                    }
                    for (IqiyiSuggestItem iqiyiSuggestItem : list) {
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        MutableState mutableState = (MutableState) objRememberedValue;
                        boolean zChanged = composer.changed(function1) | composer.changedInstance(iqiyiSuggestItem);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new z7(i2, function1, iqiyiSuggestItem);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new t1(23, mutableState);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Composer composer2 = composer;
                        SurfaceKt.m2908Surfaceo_FOJdg(function0, FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue3), false, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), 0L, 0L, 0.0f, 0.0f, yc2.k(((Boolean) mutableState.getValue()).booleanValue(), composer), null, ComposableLambdaKt.rememberComposableLambda(-1404865791, true, new a2(3, iqiyiSuggestItem, mutableState), composer, 54), composer2, 0, 6, 756);
                        composer = composer2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-254790490, iIntValue2, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchHistoryTags.<anonymous>.<anonymous> (AggregateSearchContent.kt:347)");
                    }
                    for (String str : CollectionsKt.take(list, 5)) {
                        boolean zChanged2 = composer3.changed(function1) | composer3.changed(str);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new y7(0, str, function1);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        m8.c(str, (Function0) objRememberedValue4, composer3, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
