package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloudDownloadKt;
import androidx.compose.material.icons.filled.CloudUploadKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u40 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaItem b;
    public final /* synthetic */ aa0 c;
    public final /* synthetic */ FocusRequester d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function0 h;

    public /* synthetic */ u40(MediaItem mediaItem, aa0 aa0Var, FocusRequester focusRequester, MutableState mutableState, Function1 function1, Function0 function0, int i) {
        this.a = i;
        this.b = mediaItem;
        this.c = aa0Var;
        this.d = focusRequester;
        this.e = mutableState;
        this.g = function1;
        this.h = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final int i;
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1677947582, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.TraktWatchedSyncDialog.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:6865)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(companion, Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(20.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("Trakt 已看状态同步", null, u90.j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getTitleLarge(), composer, 390, 0, 131066);
                    TextKt.m3048TextNvy7gAk(this.b.getName(), PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(4.0f), 7, null), u90.k, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer, i3).getBodyMedium(), composer, 432, 24960, 110584);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer);
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    Icons icons = Icons.INSTANCE;
                    ImageVector cloudDownload = CloudDownloadKt.getCloudDownload(icons.getDefault());
                    MutableState mutableState = this.e;
                    boolean z = ((jb2) mutableState.getValue()) == jb2.b;
                    final aa0 aa0Var = this.c;
                    boolean z2 = !aa0Var.a;
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, this.d);
                    boolean zChanged = composer.changed(mutableState);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new a50(0, mutableState);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    u90.C0("Trakt 到本地", "将 Trakt 上的已看状态同步到本地", cloudDownload, z, z2, modifierFocusRequester, (Function0) objRememberedValue, composer, 54, 0);
                    ImageVector cloudUpload = CloudUploadKt.getCloudUpload(icons.getDefault());
                    boolean z3 = ((jb2) mutableState.getValue()) == jb2.a;
                    boolean zChanged2 = composer.changed(mutableState);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new a50(1, mutableState);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    u90.C0("本地到 Trakt", "将本地上的已看状态同步到 Trakt", cloudUpload, z3, z2, null, (Function0) objRememberedValue2, composer, 54, 32);
                    composer.endNode();
                    u90.D0(aa0Var, composer, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion2.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer);
                    mr.z(companion3, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Object objRememberedValue3 = composer.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion4.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    final MutableState mutableState2 = (MutableState) objRememberedValue3;
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(48.0f));
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == companion4.getEmpty()) {
                        objRememberedValue4 = new u00(5, mutableState2);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue4);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    long j = u90.g;
                    long j2 = u90.i;
                    Color.Companion companion5 = Color.INSTANCE;
                    long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(companion5.m5189getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                    int i6 = ButtonDefaults.$stable;
                    int i7 = (i6 << 24) | 1573254;
                    ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, jM5151copywmQWz5c$default, 0L, composer, i7, Input.Keys.F16);
                    ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.03f, 0.0f, 0.0f, 0.0f, 29, null);
                    int i8 = (i6 << 15) | 48;
                    ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer, i8, 29);
                    ButtonShape buttonShapeShape$default = ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)), null, null, null, null, 30, null);
                    Function1 function1 = this.g;
                    boolean zChanged3 = composer.changed(function1) | composer.changed(mutableState);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == companion4.getEmpty()) {
                        i = 0;
                        objRememberedValue5 = new b50(function1, mutableState, 0);
                        composer.updateRememberedValue(objRememberedValue5);
                    } else {
                        i = 0;
                    }
                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue5, modifierOnFocusChanged, null, z2, buttonScaleScale$default, null, buttonShapeShape$default, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(-1181222220, true, new Function3() { // from class: c50
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i9 = i;
                            MutableState mutableState3 = mutableState2;
                            aa0 aa0Var2 = aa0Var;
                            switch (i9) {
                                case 0:
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1181222220, iIntValue2, -1, "com.dh.myembyapp.ui.screens.detail.TraktWatchedSyncDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:6936)");
                                        }
                                        TextKt.m3048TextNvy7gAk(aa0Var2.a ? "同步中" : "同步", null, ((Boolean) mutableState3.getValue()).booleanValue() ? u90.c : u90.j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, 0, 24576, 245754);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-492489379, iIntValue3, -1, "com.dh.myembyapp.ui.screens.detail.TraktWatchedSyncDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:6964)");
                                        }
                                        TextKt.m3048TextNvy7gAk((aa0Var2.d == null && aa0Var2.e == null) ? "取消" : "关闭", null, ((Boolean) mutableState3.getValue()).booleanValue() ? u90.c : u90.j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer3, 0, 24576, 245754);
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
                    }, composer, 54), composer, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                    Object objRememberedValue6 = composer.rememberedValue();
                    if (objRememberedValue6 == companion4.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    final MutableState mutableState3 = (MutableState) objRememberedValue6;
                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(48.0f));
                    Object objRememberedValue7 = composer.rememberedValue();
                    if (objRememberedValue7 == companion4.getEmpty()) {
                        objRememberedValue7 = new u00(6, mutableState3);
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    final int i9 = 1;
                    ButtonKt.m8231ButtonTCVpFMg(this.h, FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs2, (Function1) objRememberedValue7), null, z2, ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.03f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)), null, null, null, null, 30, null), buttonDefaults.m8228colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, Color.m5151copywmQWz5c$default(companion5.m5189getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0L, composer, i7, Input.Keys.F16), 0.0f, buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer, i8, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-492489379, true, new Function3() { // from class: c50
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i10 = i9;
                            MutableState mutableState4 = mutableState3;
                            aa0 aa0Var2 = aa0Var;
                            switch (i10) {
                                case 0:
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1181222220, iIntValue2, -1, "com.dh.myembyapp.ui.screens.detail.TraktWatchedSyncDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:6936)");
                                        }
                                        TextKt.m3048TextNvy7gAk(aa0Var2.a ? "同步中" : "同步", null, ((Boolean) mutableState4.getValue()).booleanValue() ? u90.c : u90.j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, 0, 24576, 245754);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    ((RowScope) obj3).getClass();
                                    if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-492489379, iIntValue3, -1, "com.dh.myembyapp.ui.screens.detail.TraktWatchedSyncDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:6964)");
                                        }
                                        TextKt.m3048TextNvy7gAk((aa0Var2.d == null && aa0Var2.e == null) ? "取消" : "关闭", null, ((Boolean) mutableState4.getValue()).booleanValue() ? u90.c : u90.j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer3, 0, 24576, 245754);
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
                    }, composer, 54), composer, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                    if (x2.m(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-468416419, iIntValue2, -1, "com.dh.myembyapp.ui.screens.detail.TraktWatchedSyncDialog.<anonymous> (DetailScreen.kt:6850)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion7, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    SurfaceKt.m2905SurfaceT9BRK9s(SizeKt.m1071widthInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(520.0f)), 0.0f, Dp.m7813constructorimpl(520.0f), 1, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(24.0f)), u90.f, 0L, Dp.m7813constructorimpl(0.0f), Dp.m7813constructorimpl(12.0f), null, ComposableLambdaKt.rememberComposableLambda(1677947582, true, new u40(this.b, this.c, this.d, this.e, this.g, this.h, 0), composer2, 54), composer2, 12804486, 72);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
