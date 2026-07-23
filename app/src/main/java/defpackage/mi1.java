package defpackage;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mi1 implements Function3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ mi1(u61 u61Var, wr1 wr1Var, wr1 wr1Var2, MutableState mutableState, FocusRequester focusRequester, List list, Function0 function0, Function1 function1) {
        this.c = wr1Var;
        this.d = focusRequester;
        this.b = mutableState;
        this.e = list;
        this.g = wr1Var2;
        this.h = u61Var;
        this.i = function0;
        this.j = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strS;
        long error;
        boolean z;
        int i = this.a;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj3;
                str.getClass();
                str2.getClass();
                dn1.f0((CoroutineScope) obj10, (UserPreferences) obj9, this.b, (MutableState) obj8, (MutableState) obj7, (sh1) obj5, (og1) obj4, (MutableState) obj6, str, (Throwable) obj2, str2);
                break;
            default:
                wr1 wr1Var = (wr1) obj10;
                FocusRequester focusRequester = (FocusRequester) obj9;
                List<wr1> list = (List) obj8;
                wr1 wr1Var2 = (wr1) obj7;
                u61 u61Var = (u61) obj6;
                Function0 function0 = (Function0) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1826507464, iIntValue, -1, "com.dh.myembyapp.ui.components.QrNetworkSettingsDialog.<anonymous>.<anonymous>.<anonymous> (QrNetworkSettingsDialog.kt:106)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), Alignment.INSTANCE.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer);
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("扫码网络", null, materialTheme.getColorScheme(composer, i3).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getTitleMedium(), composer, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk("手机扫码配置、搜索、导入等功能都会使用这里选中的本机地址生成二维码。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i3).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getBodySmall(), composer, 6, 0, 131066);
                    Composer composer2 = composer;
                    String strS2 = wr1Var != null ? mr.s("优先使用当前活动网络，当前解析为 ", wr1Var.c, "（", wr1Var.a(), "）") : "自动检测当前可用的局域网地址";
                    MutableState mutableState = this.b;
                    boolean z2 = ((String) mutableState.getValue()) == null;
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), focusRequester);
                    boolean zChanged = composer2.changed(mutableState);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new zq1(3, mutableState);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    xr1.a(6, composer2, modifierFocusRequester, "自动", strS2, (Function0) objRememberedValue, z2);
                    if (list.isEmpty()) {
                        composer2.startReplaceGroup(304629672);
                        TextKt.m3048TextNvy7gAk("当前没有检测到可用于二维码展示的 IPv4 地址，请确认电视已经接入局域网。", null, materialTheme.getColorScheme(composer2, i3).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodySmall(), composer2, 6, 0, 131066);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(304920700);
                        for (wr1 wr1Var3 : list) {
                            String strA = wr1Var3.a();
                            StringBuilder sb = new StringBuilder();
                            sb.append(wr1Var3.c);
                            if (wr1Var3.d) {
                                sb.append(" · 当前活动网络");
                            }
                            String string = sb.toString();
                            boolean zAreEqual = Intrinsics.areEqual((String) mutableState.getValue(), wr1Var3.a);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            boolean zChanged2 = composer2.changed(mutableState) | composer2.changed(wr1Var3);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new jx0(25, wr1Var3, mutableState);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            xr1.a(3072, composer2, modifierFillMaxWidth$default, strA, string, (Function0) objRememberedValue2, zAreEqual);
                        }
                        composer2.endReplaceGroup();
                    }
                    if (wr1Var2 != null) {
                        composer2 = composer2;
                        strS = mr.s("当前二维码将显示 ", wr1Var2.c, "（", wr1Var2.a(), "）");
                    } else {
                        composer2 = composer2;
                        strS = "当前未找到可用地址，二维码相关功能可能无法启动";
                    }
                    String str3 = strS;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextStyle bodySmall = materialTheme2.getTypography(composer2, i4).getBodySmall();
                    if (wr1Var2 != null) {
                        composer2.startReplaceGroup(306029105);
                        error = Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer2, i4).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(306144425);
                        error = materialTheme2.getColorScheme(composer2, i4).getError();
                        composer2.endReplaceGroup();
                    }
                    Composer composer3 = composer2;
                    TextKt.m3048TextNvy7gAk(str3, null, error, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer3, 0, 0, 131066);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    float fM7813constructorimpl = Dp.m7813constructorimpl(12.0f);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(fM7813constructorimpl, companion4.getEnd()), companion4.getTop(), composer3, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Object objRememberedValue3 = composer3.rememberedValue();
                    Composer.Companion companion6 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion6.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    MutableState mutableState2 = (MutableState) objRememberedValue3;
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (objRememberedValue4 == companion6.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    MutableState mutableState3 = (MutableState) objRememberedValue4;
                    ButtonColors buttonColorsI = hc2.i(jc2.c, false, composer3, 6, 2);
                    ButtonScale buttonScaleL = hc2.l(1.05f);
                    ButtonGlow buttonGlowA = el0.a(u61Var);
                    ButtonBorder buttonBorderH = hc2.h(composer3);
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f));
                    Object objRememberedValue5 = composer3.rememberedValue();
                    int i6 = 15;
                    if (objRememberedValue5 == companion6.getEmpty()) {
                        objRememberedValue5 = new li1(15, mutableState2);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue5), null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(-515652690, true, new w91(14, mutableState2), composer3, 54), composer3, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                    ButtonColors buttonColorsI2 = hc2.i(jc2.b, false, composer3, 6, 2);
                    ButtonScale buttonScaleL2 = hc2.l(1.05f);
                    ButtonGlow buttonGlowA2 = el0.a(u61Var);
                    ButtonBorder buttonBorderH2 = hc2.h(composer3);
                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f));
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (objRememberedValue6 == companion6.getEmpty()) {
                        objRememberedValue6 = new li1(16, mutableState3);
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs2, (Function1) objRememberedValue6);
                    boolean zChanged3 = composer3.changed(function1) | composer3.changed(mutableState);
                    Object objRememberedValue7 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue7 == companion6.getEmpty()) {
                        z = true;
                        objRememberedValue7 = new b50(function1, mutableState, 1);
                        composer3.updateRememberedValue(objRememberedValue7);
                    } else {
                        z = true;
                    }
                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue7, modifierOnFocusChanged, null, false, buttonScaleL2, buttonGlowA2, null, buttonColorsI2, 0.0f, buttonBorderH2, null, null, ComposableLambdaKt.rememberComposableLambda(-515053033, z, new w91(i6, mutableState3), composer3, 54), composer3, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                    if (x2.m(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ mi1(CoroutineScope coroutineScope, UserPreferences userPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, sh1 sh1Var, og1 og1Var, MutableState mutableState4) {
        this.c = coroutineScope;
        this.d = userPreferences;
        this.b = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.i = sh1Var;
        this.j = og1Var;
        this.h = mutableState4;
    }
}
