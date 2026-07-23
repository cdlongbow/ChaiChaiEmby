package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kd1 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ kd1(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        switch (this.a) {
            case 0:
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-834010372, iIntValue, -1, "com.dh.myembyapp.ui.screens.person.PersonHeader.<anonymous>.<anonymous> (PersonScreen.kt:159)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.m5151copywmQWz5c$default(ColorKt.Color(4291875024L), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer2);
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageVector person = PersonKt.getPerson(Icons.INSTANCE.getDefault());
                    Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(80.0f));
                    long jColor = ColorKt.Color(4286611584L);
                    Composer composer3 = composer2;
                    String str = this.b;
                    IconKt.m2496Iconww6aTOc(person, str, modifierM1064size3ABfNKs, jColor, composer3, 3456, 0);
                    String str2 = this.c;
                    if (str2.length() > 0) {
                        composer3.startReplaceGroup(-1023446278);
                        g12.a(str2, str, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ContentScale.INSTANCE.getCrop(), composer3, 1573248, 1976);
                        composer3 = composer3;
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1023163744);
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                Function2 function2 = (Function2) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                function2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= composer4.changedInstance(function2) ? 4 : 2;
                }
                if (composer4.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-104257008, iIntValue2, -1, "com.dh.myembyapp.ui.components.WebDavInputField.<anonymous>.<anonymous> (WebDavSyncDialog.kt:676)");
                    }
                    if (StringsKt.isBlank(this.b)) {
                        composer4.startReplaceGroup(-659083952);
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i2 = MaterialTheme.$stable;
                        TextKt.m3048TextNvy7gAk(this.c, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i2).getOnSurfaceVariant(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer4, i2).getBodyMedium(), 0L, TextUnitKt.getSp(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer4, 0, 0, 131066);
                        composer = composer4;
                        composer.endReplaceGroup();
                    } else {
                        composer = composer4;
                        composer.startReplaceGroup(-658818158);
                        composer.endReplaceGroup();
                    }
                    if (id.u(composer, iIntValue2 & 14, function2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
