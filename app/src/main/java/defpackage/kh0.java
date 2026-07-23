package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kh0 {
    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x0311  */
    /* JADX WARN: Code duplicated, block: B:128:0x031e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0331  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    public static final void a(final Function0 function0, final Function0 function1, Function0 function2, String str, String str2, String str3, float f, float f2, float f3, Composer composer, final int i, final int i2) {
        int i3;
        Function0 function3;
        Function0 function4;
        int i4;
        String str4;
        int i5;
        int i6;
        String str5;
        int i7;
        int i8;
        final String str6;
        char c;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        Composer composer2;
        final float f4;
        final Function0 function5;
        final String str7;
        final String str8;
        final float f5;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        final String str9;
        String str10;
        final float fM7813constructorimpl;
        final float fM7813constructorimpl2;
        float fM7813constructorimpl3;
        function0.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1090824648);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function3 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        } else {
            function3 = function1;
        }
        int i18 = i2 & 4;
        if (i18 == 0) {
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function4 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    str4 = str;
                    if (composerStartRestartGroup.changed(str4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        str5 = str2;
                        if (composerStartRestartGroup.changed(str5)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        str6 = str3;
                        c = ' ';
                    } else {
                        str6 = str3;
                        c = ' ';
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if (composerStartRestartGroup.changed(str6)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(f2)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 256;
                        if (i14 != 0) {
                            if ((i & 100663296) == 0) {
                                if (composerStartRestartGroup.changed(f3)) {
                                    i15 = 67108864;
                                } else {
                                    i15 = GroupFlagsKt.HasAuxSlotFlag;
                                }
                                i3 |= i15;
                            }
                            i16 = i3 | 805306368;
                            if ((i16 & 306783379) != 306783378) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                                if (i18 != 0) {
                                    function5 = null;
                                } else {
                                    function5 = function4;
                                }
                                if (i4 != 0) {
                                    str9 = "是否退出软件";
                                    i17 = i8;
                                } else {
                                    i17 = i8;
                                    str9 = str4;
                                }
                                if (i6 != 0) {
                                    str10 = "退出";
                                } else {
                                    str10 = str5;
                                }
                                if (i17 != 0) {
                                    str6 = "取消";
                                }
                                if (i10 != 0) {
                                    fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                                } else {
                                    fM7813constructorimpl = f;
                                }
                                if (i12 != 0) {
                                    fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                                } else {
                                    fM7813constructorimpl2 = f2;
                                }
                                if (i14 != 0) {
                                    fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                                } else {
                                    fM7813constructorimpl3 = f3;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                                }
                                final long sp = TextUnitKt.getSp(20);
                                final float fM7813constructorimpl4 = Dp.m7813constructorimpl(8.0f);
                                final float fM7813constructorimpl5 = Dp.m7813constructorimpl(8.0f);
                                TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                f3 = fM7813constructorimpl3;
                                AnnotatedString annotatedString = new AnnotatedString(str10, null, 2, null);
                                FontWeight.Companion companion = FontWeight.INSTANCE;
                                final float fM7827unboximpl = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl4) + density.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer, annotatedString, new TextStyle(0L, sp, companion.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp, companion.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                                composer2 = composerStartRestartGroup;
                                composer2.startReplaceGroup(-1033024150);
                                composer2.endReplaceGroup();
                                final Function0 function6 = function3;
                                final String str11 = str6;
                                final String str12 = str10;
                                AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Composer composer3 = (Composer) obj;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                            }
                                            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                            int i19 = MaterialTheme.$stable;
                                            CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                            long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                            float fM7813constructorimpl6 = Dp.m7813constructorimpl(8.0f);
                                            final String str13 = str9;
                                            final float f7 = fM7827unboximpl;
                                            final String str14 = str12;
                                            final Function0 function7 = function6;
                                            final long j = sp;
                                            final float f8 = fM7813constructorimpl4;
                                            final float f9 = fM7813constructorimpl5;
                                            final String str15 = str11;
                                            final Function0 function8 = function5;
                                            final Function0 function9 = function0;
                                            SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl6, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                                public final Object invoke(Object obj3, Object obj4) {
                                                    Composer composer4 = (Composer) obj3;
                                                    int iIntValue2 = ((Integer) obj4).intValue();
                                                    if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                        }
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                                        Arrangement arrangement = Arrangement.INSTANCE;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                        int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                                        if (composer4.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                        mr.z(companion4, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                        int i21 = MaterialTheme.$stable;
                                                        TextKt.m3048TextNvy7gAk(str13, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                        id.i(16.0f, companion2, composer4, 6);
                                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion3.getCenterHorizontally()), companion3.getTop(), composer4, 6);
                                                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                        int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                                        if (composer4.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor2);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                        mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        float f10 = f7;
                                                        Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion2, f10), Dp.m7813constructorimpl(48.0f));
                                                        String str16 = str14;
                                                        Function0 function10 = function7;
                                                        long j2 = j;
                                                        float f11 = f8;
                                                        float f12 = f9;
                                                        hc2.c(str16, function10, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                        Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion2, f10), Dp.m7813constructorimpl(48.0f));
                                                        Function0 function11 = function8;
                                                        boolean zChanged = composer4.changed(function11);
                                                        Function0 function12 = function9;
                                                        boolean zChanged2 = zChanged | composer4.changed(function12);
                                                        Object objRememberedValue = composer4.rememberedValue();
                                                        if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue = new hh0(0, function11, function12);
                                                            composer4.updateRememberedValue(objRememberedValue);
                                                        }
                                                        hc2.b(str15, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                        if (x2.m(composer4)) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer4.skipToGroupEnd();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, composer3, 54), composer3, 12607488, 104);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer3.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f4 = fM7813constructorimpl;
                                f5 = fM7813constructorimpl2;
                                str7 = str9;
                                str8 = str12;
                                str6 = str11;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                f4 = f;
                                function5 = function4;
                                str7 = str4;
                                str8 = str5;
                                f5 = f2;
                            }
                            f6 = f3;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                final Function0 function7 = function5;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        kh0.a(function0, function1, function7, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        }
                        i3 |= 100663296;
                        i16 = i3 | 805306368;
                        if ((i16 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                            if (i18 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i4 != 0) {
                                str9 = "是否退出软件";
                                i17 = i8;
                            } else {
                                i17 = i8;
                                str9 = str4;
                            }
                            if (i6 != 0) {
                                str10 = "退出";
                            } else {
                                str10 = str5;
                            }
                            if (i17 != 0) {
                                str6 = "取消";
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (i14 != 0) {
                                fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                            } else {
                                fM7813constructorimpl3 = f3;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                            }
                            final long sp2 = TextUnitKt.getSp(20);
                            final float fM7813constructorimpl6 = Dp.m7813constructorimpl(8.0f);
                            final float fM7813constructorimpl7 = Dp.m7813constructorimpl(8.0f);
                            TextMeasurer textMeasurerRememberTextMeasurer2 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            f3 = fM7813constructorimpl3;
                            AnnotatedString annotatedString2 = new AnnotatedString(str10, null, 2, null);
                            FontWeight.Companion companion2 = FontWeight.INSTANCE;
                            final float fM7827unboximpl2 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl6) + density2.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer2, annotatedString2, new TextStyle(0L, sp2, companion2.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer2, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp2, companion2.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(-1033024150);
                            composer2.endReplaceGroup();
                            final Function0 function8 = function3;
                            final String str13 = str6;
                            final String str14 = str10;
                            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer3 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                        }
                                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                        int i19 = MaterialTheme.$stable;
                                        CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                        long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                        float fM7813constructorimpl8 = Dp.m7813constructorimpl(8.0f);
                                        final String str15 = str9;
                                        final float f7 = fM7827unboximpl2;
                                        final String str16 = str14;
                                        final Function0 function9 = function8;
                                        final long j = sp2;
                                        final float f8 = fM7813constructorimpl6;
                                        final float f9 = fM7813constructorimpl7;
                                        final String str17 = str13;
                                        final Function0 function10 = function5;
                                        final Function0 function11 = function0;
                                        SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl8, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                            public final Object invoke(Object obj3, Object obj4) {
                                                Composer composer4 = (Composer) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                    }
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                                    Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                                                    Arrangement arrangement = Arrangement.INSTANCE;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion5, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                    int i21 = MaterialTheme.$stable;
                                                    TextKt.m3048TextNvy7gAk(str15, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                    id.i(16.0f, companion3, composer4, 6);
                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion4.getCenterHorizontally()), companion4.getTop(), composer4, 6);
                                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    float f10 = f7;
                                                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion3, f10), Dp.m7813constructorimpl(48.0f));
                                                    String str18 = str16;
                                                    Function0 function12 = function9;
                                                    long j2 = j;
                                                    float f11 = f8;
                                                    float f12 = f9;
                                                    hc2.c(str18, function12, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                    Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion3, f10), Dp.m7813constructorimpl(48.0f));
                                                    Function0 function13 = function10;
                                                    boolean zChanged = composer4.changed(function13);
                                                    Function0 function14 = function11;
                                                    boolean zChanged2 = zChanged | composer4.changed(function14);
                                                    Object objRememberedValue = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new hh0(0, function13, function14);
                                                        composer4.updateRememberedValue(objRememberedValue);
                                                    }
                                                    hc2.b(str17, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                    if (x2.m(composer4)) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, composer3, 54), composer3, 12607488, 104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = fM7813constructorimpl;
                            f5 = fM7813constructorimpl2;
                            str7 = str9;
                            str8 = str14;
                            str6 = str13;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f4 = f;
                            function5 = function4;
                            str7 = str4;
                            str8 = str5;
                            f5 = f2;
                        }
                        f6 = f3;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Function0 function9 = function5;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    kh0.a(function0, function1, function9, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(f3)) {
                                i15 = 67108864;
                            } else {
                                i15 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i3 |= i15;
                        }
                        i16 = i3 | 805306368;
                        if ((i16 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                            if (i18 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i4 != 0) {
                                str9 = "是否退出软件";
                                i17 = i8;
                            } else {
                                i17 = i8;
                                str9 = str4;
                            }
                            if (i6 != 0) {
                                str10 = "退出";
                            } else {
                                str10 = str5;
                            }
                            if (i17 != 0) {
                                str6 = "取消";
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (i14 != 0) {
                                fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                            } else {
                                fM7813constructorimpl3 = f3;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                            }
                            final long sp3 = TextUnitKt.getSp(20);
                            final float fM7813constructorimpl8 = Dp.m7813constructorimpl(8.0f);
                            final float fM7813constructorimpl9 = Dp.m7813constructorimpl(8.0f);
                            TextMeasurer textMeasurerRememberTextMeasurer3 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            f3 = fM7813constructorimpl3;
                            AnnotatedString annotatedString3 = new AnnotatedString(str10, null, 2, null);
                            FontWeight.Companion companion3 = FontWeight.INSTANCE;
                            final float fM7827unboximpl3 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl8) + density3.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer3, annotatedString3, new TextStyle(0L, sp3, companion3.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer3, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp3, companion3.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(-1033024150);
                            composer2.endReplaceGroup();
                            final Function0 function10 = function3;
                            final String str15 = str6;
                            final String str16 = str10;
                            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer3 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                        }
                                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                        int i19 = MaterialTheme.$stable;
                                        CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                        long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                        float fM7813constructorimpl10 = Dp.m7813constructorimpl(8.0f);
                                        final String str17 = str9;
                                        final float f7 = fM7827unboximpl3;
                                        final String str18 = str16;
                                        final Function0 function11 = function10;
                                        final long j = sp3;
                                        final float f8 = fM7813constructorimpl8;
                                        final float f9 = fM7813constructorimpl9;
                                        final String str19 = str15;
                                        final Function0 function12 = function5;
                                        final Function0 function13 = function0;
                                        SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl10, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                            public final Object invoke(Object obj3, Object obj4) {
                                                Composer composer4 = (Composer) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                    }
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                    Alignment.Companion companion5 = Alignment.INSTANCE;
                                                    Alignment.Horizontal centerHorizontally = companion5.getCenterHorizontally();
                                                    Arrangement arrangement = Arrangement.INSTANCE;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion6, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                    int i21 = MaterialTheme.$stable;
                                                    TextKt.m3048TextNvy7gAk(str17, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                    id.i(16.0f, companion4, composer4, 6);
                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion5.getCenterHorizontally()), companion5.getTop(), composer4, 6);
                                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion6, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    float f10 = f7;
                                                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion4, f10), Dp.m7813constructorimpl(48.0f));
                                                    String str110 = str18;
                                                    Function0 function14 = function11;
                                                    long j2 = j;
                                                    float f11 = f8;
                                                    float f12 = f9;
                                                    hc2.c(str110, function14, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                    Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion4, f10), Dp.m7813constructorimpl(48.0f));
                                                    Function0 function15 = function12;
                                                    boolean zChanged = composer4.changed(function15);
                                                    Function0 function16 = function13;
                                                    boolean zChanged2 = zChanged | composer4.changed(function16);
                                                    Object objRememberedValue = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new hh0(0, function15, function16);
                                                        composer4.updateRememberedValue(objRememberedValue);
                                                    }
                                                    hc2.b(str19, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                    if (x2.m(composer4)) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, composer3, 54), composer3, 12607488, 104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = fM7813constructorimpl;
                            f5 = fM7813constructorimpl2;
                            str7 = str9;
                            str8 = str16;
                            str6 = str15;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f4 = f;
                            function5 = function4;
                            str7 = str4;
                            str8 = str5;
                            f5 = f2;
                        }
                        f6 = f3;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Function0 function11 = function5;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    kh0.a(function0, function1, function11, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp4 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl10 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl11 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer4 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString4 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion4 = FontWeight.INSTANCE;
                        final float fM7827unboximpl4 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl10) + density4.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer4, annotatedString4, new TextStyle(0L, sp4, companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer4, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp4, companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function12 = function3;
                        final String str17 = str6;
                        final String str18 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl12 = Dp.m7813constructorimpl(8.0f);
                                    final String str19 = str9;
                                    final float f7 = fM7827unboximpl4;
                                    final String str110 = str18;
                                    final Function0 function13 = function12;
                                    final long j = sp4;
                                    final float f8 = fM7813constructorimpl10;
                                    final float f9 = fM7813constructorimpl11;
                                    final String str111 = str17;
                                    final Function0 function14 = function5;
                                    final Function0 function15 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl12, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion6.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion7.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion7, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str19, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion5, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion6.getCenterHorizontally()), companion6.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion7, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion5, f10), Dp.m7813constructorimpl(48.0f));
                                                String str112 = str110;
                                                Function0 function16 = function13;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str112, function16, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion5, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function17 = function14;
                                                boolean zChanged = composer4.changed(function17);
                                                Function0 function18 = function15;
                                                boolean zChanged2 = zChanged | composer4.changed(function18);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function17, function18);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str111, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str18;
                        str6 = str17;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function13 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function13, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 24576;
                str5 = str2;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str6 = str3;
                    c = ' ';
                } else {
                    str6 = str3;
                    c = ' ';
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(str6)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(f3)) {
                                i15 = 67108864;
                            } else {
                                i15 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i3 |= i15;
                        }
                        i16 = i3 | 805306368;
                        if ((i16 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                            if (i18 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i4 != 0) {
                                str9 = "是否退出软件";
                                i17 = i8;
                            } else {
                                i17 = i8;
                                str9 = str4;
                            }
                            if (i6 != 0) {
                                str10 = "退出";
                            } else {
                                str10 = str5;
                            }
                            if (i17 != 0) {
                                str6 = "取消";
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (i14 != 0) {
                                fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                            } else {
                                fM7813constructorimpl3 = f3;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                            }
                            final long sp5 = TextUnitKt.getSp(20);
                            final float fM7813constructorimpl12 = Dp.m7813constructorimpl(8.0f);
                            final float fM7813constructorimpl13 = Dp.m7813constructorimpl(8.0f);
                            TextMeasurer textMeasurerRememberTextMeasurer5 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                            Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            f3 = fM7813constructorimpl3;
                            AnnotatedString annotatedString5 = new AnnotatedString(str10, null, 2, null);
                            FontWeight.Companion companion5 = FontWeight.INSTANCE;
                            final float fM7827unboximpl5 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl12) + density5.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer5, annotatedString5, new TextStyle(0L, sp5, companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer5, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp5, companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(-1033024150);
                            composer2.endReplaceGroup();
                            final Function0 function14 = function3;
                            final String str19 = str6;
                            final String str110 = str10;
                            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer3 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                        }
                                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                        int i19 = MaterialTheme.$stable;
                                        CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                        long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                        float fM7813constructorimpl14 = Dp.m7813constructorimpl(8.0f);
                                        final String str111 = str9;
                                        final float f7 = fM7827unboximpl5;
                                        final String str112 = str110;
                                        final Function0 function15 = function14;
                                        final long j = sp5;
                                        final float f8 = fM7813constructorimpl12;
                                        final float f9 = fM7813constructorimpl13;
                                        final String str113 = str19;
                                        final Function0 function16 = function5;
                                        final Function0 function17 = function0;
                                        SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl14, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                            public final Object invoke(Object obj3, Object obj4) {
                                                Composer composer4 = (Composer) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                    }
                                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                    Alignment.Companion companion7 = Alignment.INSTANCE;
                                                    Alignment.Horizontal centerHorizontally = companion7.getCenterHorizontally();
                                                    Arrangement arrangement = Arrangement.INSTANCE;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion8.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion8, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                    int i21 = MaterialTheme.$stable;
                                                    TextKt.m3048TextNvy7gAk(str111, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                    id.i(16.0f, companion6, composer4, 6);
                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion7.getCenterHorizontally()), companion7.getTop(), composer4, 6);
                                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                    Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion8, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    float f10 = f7;
                                                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion6, f10), Dp.m7813constructorimpl(48.0f));
                                                    String str114 = str112;
                                                    Function0 function18 = function15;
                                                    long j2 = j;
                                                    float f11 = f8;
                                                    float f12 = f9;
                                                    hc2.c(str114, function18, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                    Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion6, f10), Dp.m7813constructorimpl(48.0f));
                                                    Function0 function19 = function16;
                                                    boolean zChanged = composer4.changed(function19);
                                                    Function0 function110 = function17;
                                                    boolean zChanged2 = zChanged | composer4.changed(function110);
                                                    Object objRememberedValue = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new hh0(0, function19, function110);
                                                        composer4.updateRememberedValue(objRememberedValue);
                                                    }
                                                    hc2.b(str113, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                    if (x2.m(composer4)) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, composer3, 54), composer3, 12607488, 104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = fM7813constructorimpl;
                            f5 = fM7813constructorimpl2;
                            str7 = str9;
                            str8 = str110;
                            str6 = str19;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f4 = f;
                            function5 = function4;
                            str7 = str4;
                            str8 = str5;
                            f5 = f2;
                        }
                        f6 = f3;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Function0 function15 = function5;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    kh0.a(function0, function1, function15, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp6 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl14 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl15 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer6 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString6 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion6 = FontWeight.INSTANCE;
                        final float fM7827unboximpl6 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl14) + density6.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer6, annotatedString6, new TextStyle(0L, sp6, companion6.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer6, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp6, companion6.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function16 = function3;
                        final String str111 = str6;
                        final String str112 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl16 = Dp.m7813constructorimpl(8.0f);
                                    final String str113 = str9;
                                    final float f7 = fM7827unboximpl6;
                                    final String str114 = str112;
                                    final Function0 function17 = function16;
                                    final long j = sp6;
                                    final float f8 = fM7813constructorimpl14;
                                    final float f9 = fM7813constructorimpl15;
                                    final String str115 = str111;
                                    final Function0 function18 = function5;
                                    final Function0 function19 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl16, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion7, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion8 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion8.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion9.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion9, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str113, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion7, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion8.getCenterHorizontally()), companion8.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion9.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion9, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion7, f10), Dp.m7813constructorimpl(48.0f));
                                                String str116 = str114;
                                                Function0 function110 = function17;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str116, function110, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion7, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function111 = function18;
                                                boolean zChanged = composer4.changed(function111);
                                                Function0 function112 = function19;
                                                boolean zChanged2 = zChanged | composer4.changed(function112);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function111, function112);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str115, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str112;
                        str6 = str111;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function17 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function17, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i14 = i2 & 256;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(f3)) {
                            i15 = 67108864;
                        } else {
                            i15 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i3 |= i15;
                    }
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp7 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl16 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl17 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer7 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString7 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion7 = FontWeight.INSTANCE;
                        final float fM7827unboximpl7 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl16) + density7.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer7, annotatedString7, new TextStyle(0L, sp7, companion7.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer7, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp7, companion7.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function18 = function3;
                        final String str113 = str6;
                        final String str114 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl18 = Dp.m7813constructorimpl(8.0f);
                                    final String str115 = str9;
                                    final float f7 = fM7827unboximpl7;
                                    final String str116 = str114;
                                    final Function0 function19 = function18;
                                    final long j = sp7;
                                    final float f8 = fM7813constructorimpl16;
                                    final float f9 = fM7813constructorimpl17;
                                    final String str117 = str113;
                                    final Function0 function110 = function5;
                                    final Function0 function111 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl18, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion9 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion9.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion10.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion10, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str115, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion8, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion9.getCenterHorizontally()), companion9.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion10.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion10, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion8, f10), Dp.m7813constructorimpl(48.0f));
                                                String str118 = str116;
                                                Function0 function112 = function19;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str118, function112, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion8, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function113 = function110;
                                                boolean zChanged = composer4.changed(function113);
                                                Function0 function114 = function111;
                                                boolean zChanged2 = zChanged | composer4.changed(function114);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function113, function114);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str117, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str114;
                        str6 = str113;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function19 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function19, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp8 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl18 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl19 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer8 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString8 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion8 = FontWeight.INSTANCE;
                    final float fM7827unboximpl8 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl18) + density8.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer8, annotatedString8, new TextStyle(0L, sp8, companion8.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer8, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp8, companion8.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function110 = function3;
                    final String str115 = str6;
                    final String str116 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl110 = Dp.m7813constructorimpl(8.0f);
                                final String str117 = str9;
                                final float f7 = fM7827unboximpl8;
                                final String str118 = str116;
                                final Function0 function111 = function110;
                                final long j = sp8;
                                final float f8 = fM7813constructorimpl18;
                                final float f9 = fM7813constructorimpl19;
                                final String str119 = str115;
                                final Function0 function112 = function5;
                                final Function0 function113 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl110, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion9 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion9, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion10 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion10.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion11.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion11, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str117, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion9, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion10.getCenterHorizontally()), companion10.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion11.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion11, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion9, f10), Dp.m7813constructorimpl(48.0f));
                                            String str1110 = str118;
                                            Function0 function114 = function111;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str1110, function114, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion9, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function115 = function112;
                                            boolean zChanged = composer4.changed(function115);
                                            Function0 function116 = function113;
                                            boolean zChanged2 = zChanged | composer4.changed(function116);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function115, function116);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str119, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str116;
                    str6 = str115;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function111 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function111, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 3072;
            str4 = str;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    str5 = str2;
                    if (composerStartRestartGroup.changed(str5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str6 = str3;
                    c = ' ';
                } else {
                    str6 = str3;
                    c = ' ';
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(str6)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(f3)) {
                                i15 = 67108864;
                            } else {
                                i15 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i3 |= i15;
                        }
                        i16 = i3 | 805306368;
                        if ((i16 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                            if (i18 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i4 != 0) {
                                str9 = "是否退出软件";
                                i17 = i8;
                            } else {
                                i17 = i8;
                                str9 = str4;
                            }
                            if (i6 != 0) {
                                str10 = "退出";
                            } else {
                                str10 = str5;
                            }
                            if (i17 != 0) {
                                str6 = "取消";
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (i14 != 0) {
                                fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                            } else {
                                fM7813constructorimpl3 = f3;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                            }
                            final long sp9 = TextUnitKt.getSp(20);
                            final float fM7813constructorimpl110 = Dp.m7813constructorimpl(8.0f);
                            final float fM7813constructorimpl111 = Dp.m7813constructorimpl(8.0f);
                            TextMeasurer textMeasurerRememberTextMeasurer9 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                            Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            f3 = fM7813constructorimpl3;
                            AnnotatedString annotatedString9 = new AnnotatedString(str10, null, 2, null);
                            FontWeight.Companion companion9 = FontWeight.INSTANCE;
                            final float fM7827unboximpl9 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl110) + density9.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer9, annotatedString9, new TextStyle(0L, sp9, companion9.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer9, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp9, companion9.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(-1033024150);
                            composer2.endReplaceGroup();
                            final Function0 function112 = function3;
                            final String str117 = str6;
                            final String str118 = str10;
                            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer3 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                        }
                                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                        int i19 = MaterialTheme.$stable;
                                        CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                        long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                        float fM7813constructorimpl112 = Dp.m7813constructorimpl(8.0f);
                                        final String str119 = str9;
                                        final float f7 = fM7827unboximpl9;
                                        final String str1110 = str118;
                                        final Function0 function113 = function112;
                                        final long j = sp9;
                                        final float f8 = fM7813constructorimpl110;
                                        final float f9 = fM7813constructorimpl111;
                                        final String str1111 = str117;
                                        final Function0 function114 = function5;
                                        final Function0 function115 = function0;
                                        SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl112, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                            public final Object invoke(Object obj3, Object obj4) {
                                                Composer composer4 = (Composer) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                    }
                                                    Modifier.Companion companion10 = Modifier.INSTANCE;
                                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion10, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                    Alignment.Companion companion11 = Alignment.INSTANCE;
                                                    Alignment.Horizontal centerHorizontally = companion11.getCenterHorizontally();
                                                    Arrangement arrangement = Arrangement.INSTANCE;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion12.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion12, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion12, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                    int i21 = MaterialTheme.$stable;
                                                    TextKt.m3048TextNvy7gAk(str119, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                    id.i(16.0f, companion10, composer4, 6);
                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion11.getCenterHorizontally()), companion11.getTop(), composer4, 6);
                                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                    Function0<ComposeUiNode> constructor2 = companion12.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion12, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion12, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    float f10 = f7;
                                                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion10, f10), Dp.m7813constructorimpl(48.0f));
                                                    String str1112 = str1110;
                                                    Function0 function116 = function113;
                                                    long j2 = j;
                                                    float f11 = f8;
                                                    float f12 = f9;
                                                    hc2.c(str1112, function116, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                    Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion10, f10), Dp.m7813constructorimpl(48.0f));
                                                    Function0 function117 = function114;
                                                    boolean zChanged = composer4.changed(function117);
                                                    Function0 function118 = function115;
                                                    boolean zChanged2 = zChanged | composer4.changed(function118);
                                                    Object objRememberedValue = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new hh0(0, function117, function118);
                                                        composer4.updateRememberedValue(objRememberedValue);
                                                    }
                                                    hc2.b(str1111, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                    if (x2.m(composer4)) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, composer3, 54), composer3, 12607488, 104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = fM7813constructorimpl;
                            f5 = fM7813constructorimpl2;
                            str7 = str9;
                            str8 = str118;
                            str6 = str117;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f4 = f;
                            function5 = function4;
                            str7 = str4;
                            str8 = str5;
                            f5 = f2;
                        }
                        f6 = f3;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Function0 function113 = function5;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    kh0.a(function0, function1, function113, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp10 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl112 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl113 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer10 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString10 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion10 = FontWeight.INSTANCE;
                        final float fM7827unboximpl10 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl112) + density10.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer10, annotatedString10, new TextStyle(0L, sp10, companion10.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer10, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp10, companion10.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function114 = function3;
                        final String str119 = str6;
                        final String str1110 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl114 = Dp.m7813constructorimpl(8.0f);
                                    final String str1111 = str9;
                                    final float f7 = fM7827unboximpl10;
                                    final String str1112 = str1110;
                                    final Function0 function115 = function114;
                                    final long j = sp10;
                                    final float f8 = fM7813constructorimpl112;
                                    final float f9 = fM7813constructorimpl113;
                                    final String str1113 = str119;
                                    final Function0 function116 = function5;
                                    final Function0 function117 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl114, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion11 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion11, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion12 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion12.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion13.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion13, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion13, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str1111, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion11, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion12.getCenterHorizontally()), companion12.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion13.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion13, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion13, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion11, f10), Dp.m7813constructorimpl(48.0f));
                                                String str1114 = str1112;
                                                Function0 function118 = function115;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str1114, function118, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion11, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function119 = function116;
                                                boolean zChanged = composer4.changed(function119);
                                                Function0 function1110 = function117;
                                                boolean zChanged2 = zChanged | composer4.changed(function1110);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function119, function1110);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str1113, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str1110;
                        str6 = str119;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function115 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function115, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i14 = i2 & 256;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(f3)) {
                            i15 = 67108864;
                        } else {
                            i15 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i3 |= i15;
                    }
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp11 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl114 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl115 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer11 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString11 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion11 = FontWeight.INSTANCE;
                        final float fM7827unboximpl11 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl114) + density11.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer11, annotatedString11, new TextStyle(0L, sp11, companion11.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer11, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp11, companion11.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function116 = function3;
                        final String str1111 = str6;
                        final String str1112 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl116 = Dp.m7813constructorimpl(8.0f);
                                    final String str1113 = str9;
                                    final float f7 = fM7827unboximpl11;
                                    final String str1114 = str1112;
                                    final Function0 function117 = function116;
                                    final long j = sp11;
                                    final float f8 = fM7813constructorimpl114;
                                    final float f9 = fM7813constructorimpl115;
                                    final String str1115 = str1111;
                                    final Function0 function118 = function5;
                                    final Function0 function119 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl116, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion12 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion12, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion13 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion13.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion14.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion14, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str1113, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion12, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion13.getCenterHorizontally()), companion13.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion14.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion14, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion12, f10), Dp.m7813constructorimpl(48.0f));
                                                String str1116 = str1114;
                                                Function0 function1110 = function117;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str1116, function1110, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion12, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function1111 = function118;
                                                boolean zChanged = composer4.changed(function1111);
                                                Function0 function1112 = function119;
                                                boolean zChanged2 = zChanged | composer4.changed(function1112);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function1111, function1112);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str1115, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str1112;
                        str6 = str1111;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function117 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function117, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp12 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl116 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl117 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer12 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString12 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion12 = FontWeight.INSTANCE;
                    final float fM7827unboximpl12 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl116) + density12.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer12, annotatedString12, new TextStyle(0L, sp12, companion12.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer12, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp12, companion12.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function118 = function3;
                    final String str1113 = str6;
                    final String str1114 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl118 = Dp.m7813constructorimpl(8.0f);
                                final String str1115 = str9;
                                final float f7 = fM7827unboximpl12;
                                final String str1116 = str1114;
                                final Function0 function119 = function118;
                                final long j = sp12;
                                final float f8 = fM7813constructorimpl116;
                                final float f9 = fM7813constructorimpl117;
                                final String str1117 = str1113;
                                final Function0 function1110 = function5;
                                final Function0 function1111 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl118, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion13 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion13, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion14 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion14.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion15.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion15, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion15, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str1115, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion13, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion14.getCenterHorizontally()), companion14.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion15.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion15, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion15, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion13, f10), Dp.m7813constructorimpl(48.0f));
                                            String str1118 = str1116;
                                            Function0 function1112 = function119;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str1118, function1112, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion13, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function1113 = function1110;
                                            boolean zChanged = composer4.changed(function1113);
                                            Function0 function1114 = function1111;
                                            boolean zChanged2 = zChanged | composer4.changed(function1114);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function1113, function1114);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str1117, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str1114;
                    str6 = str1113;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function119 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function119, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 24576;
            str5 = str2;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str6 = str3;
                c = ' ';
            } else {
                str6 = str3;
                c = ' ';
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(str6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(f3)) {
                            i15 = 67108864;
                        } else {
                            i15 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i3 |= i15;
                    }
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp13 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl118 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl119 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer13 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString13 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion13 = FontWeight.INSTANCE;
                        final float fM7827unboximpl13 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl118) + density13.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer13, annotatedString13, new TextStyle(0L, sp13, companion13.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer13, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp13, companion13.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function1110 = function3;
                        final String str1115 = str6;
                        final String str1116 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl1110 = Dp.m7813constructorimpl(8.0f);
                                    final String str1117 = str9;
                                    final float f7 = fM7827unboximpl13;
                                    final String str1118 = str1116;
                                    final Function0 function1111 = function1110;
                                    final long j = sp13;
                                    final float f8 = fM7813constructorimpl118;
                                    final float f9 = fM7813constructorimpl119;
                                    final String str1119 = str1115;
                                    final Function0 function1112 = function5;
                                    final Function0 function1113 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1110, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion14 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion14, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion15 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion15.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion16.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion16, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion16, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str1117, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion14, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion14, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion15.getCenterHorizontally()), companion15.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion16.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion16, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion16, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion14, f10), Dp.m7813constructorimpl(48.0f));
                                                String str11110 = str1118;
                                                Function0 function1114 = function1111;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str11110, function1114, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion14, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function1115 = function1112;
                                                boolean zChanged = composer4.changed(function1115);
                                                Function0 function1116 = function1113;
                                                boolean zChanged2 = zChanged | composer4.changed(function1116);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function1115, function1116);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str1119, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str1116;
                        str6 = str1115;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function1111 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function1111, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp14 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl1110 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl1111 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer14 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString14 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion14 = FontWeight.INSTANCE;
                    final float fM7827unboximpl14 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl1110) + density14.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer14, annotatedString14, new TextStyle(0L, sp14, companion14.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer14, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp14, companion14.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function1112 = function3;
                    final String str1117 = str6;
                    final String str1118 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl1112 = Dp.m7813constructorimpl(8.0f);
                                final String str1119 = str9;
                                final float f7 = fM7827unboximpl14;
                                final String str11110 = str1118;
                                final Function0 function1113 = function1112;
                                final long j = sp14;
                                final float f8 = fM7813constructorimpl1110;
                                final float f9 = fM7813constructorimpl1111;
                                final String str11111 = str1117;
                                final Function0 function1114 = function5;
                                final Function0 function1115 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1112, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion15 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion15, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion16 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion16.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion17.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion17, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion17, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str1119, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion15, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion15, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion16.getCenterHorizontally()), companion16.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion17.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion17, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion17, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion15, f10), Dp.m7813constructorimpl(48.0f));
                                            String str11112 = str11110;
                                            Function0 function1116 = function1113;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str11112, function1116, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion15, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function1117 = function1114;
                                            boolean zChanged = composer4.changed(function1117);
                                            Function0 function1118 = function1115;
                                            boolean zChanged2 = zChanged | composer4.changed(function1118);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function1117, function1118);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str11111, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str1118;
                    str6 = str1117;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function1113 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function1113, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 12582912;
            i14 = i2 & 256;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i15 = 67108864;
                    } else {
                        i15 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i3 |= i15;
                }
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp15 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl1112 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl1113 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer15 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString15 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion15 = FontWeight.INSTANCE;
                    final float fM7827unboximpl15 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl1112) + density15.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer15, annotatedString15, new TextStyle(0L, sp15, companion15.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer15, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp15, companion15.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function1114 = function3;
                    final String str1119 = str6;
                    final String str11110 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl1114 = Dp.m7813constructorimpl(8.0f);
                                final String str11111 = str9;
                                final float f7 = fM7827unboximpl15;
                                final String str11112 = str11110;
                                final Function0 function1115 = function1114;
                                final long j = sp15;
                                final float f8 = fM7813constructorimpl1112;
                                final float f9 = fM7813constructorimpl1113;
                                final String str11113 = str1119;
                                final Function0 function1116 = function5;
                                final Function0 function1117 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1114, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion16 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion16, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion17 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion17.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion18.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion18, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion18, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str11111, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion16, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion16, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion17.getCenterHorizontally()), companion17.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion18.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion18, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion18, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion16, f10), Dp.m7813constructorimpl(48.0f));
                                            String str11114 = str11112;
                                            Function0 function1118 = function1115;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str11114, function1118, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion16, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function1119 = function1116;
                                            boolean zChanged = composer4.changed(function1119);
                                            Function0 function11110 = function1117;
                                            boolean zChanged2 = zChanged | composer4.changed(function11110);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function1119, function11110);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str11113, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str11110;
                    str6 = str1119;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function1115 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function1115, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 100663296;
            i16 = i3 | 805306368;
            if ((i16 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                if (i18 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
                if (i4 != 0) {
                    str9 = "是否退出软件";
                    i17 = i8;
                } else {
                    i17 = i8;
                    str9 = str4;
                }
                if (i6 != 0) {
                    str10 = "退出";
                } else {
                    str10 = str5;
                }
                if (i17 != 0) {
                    str6 = "取消";
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (i14 != 0) {
                    fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                } else {
                    fM7813constructorimpl3 = f3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                }
                final long sp16 = TextUnitKt.getSp(20);
                final float fM7813constructorimpl1114 = Dp.m7813constructorimpl(8.0f);
                final float fM7813constructorimpl1115 = Dp.m7813constructorimpl(8.0f);
                TextMeasurer textMeasurerRememberTextMeasurer16 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                f3 = fM7813constructorimpl3;
                AnnotatedString annotatedString16 = new AnnotatedString(str10, null, 2, null);
                FontWeight.Companion companion16 = FontWeight.INSTANCE;
                final float fM7827unboximpl16 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl1114) + density16.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer16, annotatedString16, new TextStyle(0L, sp16, companion16.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer16, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp16, companion16.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-1033024150);
                composer2.endReplaceGroup();
                final Function0 function1116 = function3;
                final String str11111 = str6;
                final String str11112 = str10;
                AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer3 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                            }
                            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                            int i19 = MaterialTheme.$stable;
                            CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                            long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                            float fM7813constructorimpl1116 = Dp.m7813constructorimpl(8.0f);
                            final String str11113 = str9;
                            final float f7 = fM7827unboximpl16;
                            final String str11114 = str11112;
                            final Function0 function1117 = function1116;
                            final long j = sp16;
                            final float f8 = fM7813constructorimpl1114;
                            final float f9 = fM7813constructorimpl1115;
                            final String str11115 = str11111;
                            final Function0 function1118 = function5;
                            final Function0 function1119 = function0;
                            SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1116, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer4 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                        }
                                        Modifier.Companion companion17 = Modifier.INSTANCE;
                                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion17, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                        Alignment.Companion companion18 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion18.getCenterHorizontally();
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                        ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion19.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion19, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion19, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                        int i21 = MaterialTheme.$stable;
                                        TextKt.m3048TextNvy7gAk(str11113, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                        id.i(16.0f, companion17, composer4, 6);
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion17, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion18.getCenterHorizontally()), companion18.getTop(), composer4, 6);
                                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor2 = companion19.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion19, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion19, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        float f10 = f7;
                                        Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion17, f10), Dp.m7813constructorimpl(48.0f));
                                        String str11116 = str11114;
                                        Function0 function11110 = function1117;
                                        long j2 = j;
                                        float f11 = f8;
                                        float f12 = f9;
                                        hc2.c(str11116, function11110, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                        Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion17, f10), Dp.m7813constructorimpl(48.0f));
                                        Function0 function11111 = function1118;
                                        boolean zChanged = composer4.changed(function11111);
                                        Function0 function11112 = function1119;
                                        boolean zChanged2 = zChanged | composer4.changed(function11112);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new hh0(0, function11111, function11112);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        hc2.b(str11115, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                        if (x2.m(composer4)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 12607488, 104);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM7813constructorimpl;
                f5 = fM7813constructorimpl2;
                str7 = str9;
                str8 = str11112;
                str6 = str11111;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f4 = f;
                function5 = function4;
                str7 = str4;
                str8 = str5;
                f5 = f2;
            }
            f6 = f3;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function0 function1117 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        kh0.a(function0, function1, function1117, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        function4 = function2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                str4 = str;
                if (composerStartRestartGroup.changed(str4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    str5 = str2;
                    if (composerStartRestartGroup.changed(str5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str6 = str3;
                    c = ' ';
                } else {
                    str6 = str3;
                    c = ' ';
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(str6)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 256;
                    if (i14 != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changed(f3)) {
                                i15 = 67108864;
                            } else {
                                i15 = GroupFlagsKt.HasAuxSlotFlag;
                            }
                            i3 |= i15;
                        }
                        i16 = i3 | 805306368;
                        if ((i16 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                            if (i18 != 0) {
                                function5 = null;
                            } else {
                                function5 = function4;
                            }
                            if (i4 != 0) {
                                str9 = "是否退出软件";
                                i17 = i8;
                            } else {
                                i17 = i8;
                                str9 = str4;
                            }
                            if (i6 != 0) {
                                str10 = "退出";
                            } else {
                                str10 = str5;
                            }
                            if (i17 != 0) {
                                str6 = "取消";
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (i14 != 0) {
                                fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                            } else {
                                fM7813constructorimpl3 = f3;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                            }
                            final long sp17 = TextUnitKt.getSp(20);
                            final float fM7813constructorimpl1116 = Dp.m7813constructorimpl(8.0f);
                            final float fM7813constructorimpl1117 = Dp.m7813constructorimpl(8.0f);
                            TextMeasurer textMeasurerRememberTextMeasurer17 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                            Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            f3 = fM7813constructorimpl3;
                            AnnotatedString annotatedString17 = new AnnotatedString(str10, null, 2, null);
                            FontWeight.Companion companion17 = FontWeight.INSTANCE;
                            final float fM7827unboximpl17 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl1116) + density17.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer17, annotatedString17, new TextStyle(0L, sp17, companion17.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer17, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp17, companion17.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(-1033024150);
                            composer2.endReplaceGroup();
                            final Function0 function1118 = function3;
                            final String str11113 = str6;
                            final String str11114 = str10;
                            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer3 = (Composer) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                        }
                                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                        int i19 = MaterialTheme.$stable;
                                        CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                        long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                        float fM7813constructorimpl1118 = Dp.m7813constructorimpl(8.0f);
                                        final String str11115 = str9;
                                        final float f7 = fM7827unboximpl17;
                                        final String str11116 = str11114;
                                        final Function0 function1119 = function1118;
                                        final long j = sp17;
                                        final float f8 = fM7813constructorimpl1116;
                                        final float f9 = fM7813constructorimpl1117;
                                        final String str11117 = str11113;
                                        final Function0 function11110 = function5;
                                        final Function0 function11111 = function0;
                                        SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1118, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                            public final Object invoke(Object obj3, Object obj4) {
                                                Composer composer4 = (Composer) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                    }
                                                    Modifier.Companion companion18 = Modifier.INSTANCE;
                                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion18, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                    Alignment.Companion companion19 = Alignment.INSTANCE;
                                                    Alignment.Horizontal centerHorizontally = companion19.getCenterHorizontally();
                                                    Arrangement arrangement = Arrangement.INSTANCE;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion110.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion110, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion110, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                    int i21 = MaterialTheme.$stable;
                                                    TextKt.m3048TextNvy7gAk(str11115, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                    id.i(16.0f, companion18, composer4, 6);
                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion18, 0.0f, 1, null);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion19.getCenterHorizontally()), companion19.getTop(), composer4, 6);
                                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                    int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                    Function0<ComposeUiNode> constructor2 = companion110.getConstructor();
                                                    if (composer4.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                    mr.z(companion110, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion110, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    float f10 = f7;
                                                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion18, f10), Dp.m7813constructorimpl(48.0f));
                                                    String str11118 = str11116;
                                                    Function0 function11112 = function1119;
                                                    long j2 = j;
                                                    float f11 = f8;
                                                    float f12 = f9;
                                                    hc2.c(str11118, function11112, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                    Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion18, f10), Dp.m7813constructorimpl(48.0f));
                                                    Function0 function11113 = function11110;
                                                    boolean zChanged = composer4.changed(function11113);
                                                    Function0 function11114 = function11111;
                                                    boolean zChanged2 = zChanged | composer4.changed(function11114);
                                                    Object objRememberedValue = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new hh0(0, function11113, function11114);
                                                        composer4.updateRememberedValue(objRememberedValue);
                                                    }
                                                    hc2.b(str11117, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                    if (x2.m(composer4)) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, composer3, 54), composer3, 12607488, 104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = fM7813constructorimpl;
                            f5 = fM7813constructorimpl2;
                            str7 = str9;
                            str8 = str11114;
                            str6 = str11113;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f4 = f;
                            function5 = function4;
                            str7 = str4;
                            str8 = str5;
                            f5 = f2;
                        }
                        f6 = f3;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Function0 function1119 = function5;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    kh0.a(function0, function1, function1119, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp18 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl1118 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl1119 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer18 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString18 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion18 = FontWeight.INSTANCE;
                        final float fM7827unboximpl18 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl1118) + density18.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer18, annotatedString18, new TextStyle(0L, sp18, companion18.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer18, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp18, companion18.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function11110 = function3;
                        final String str11115 = str6;
                        final String str11116 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl11110 = Dp.m7813constructorimpl(8.0f);
                                    final String str11117 = str9;
                                    final float f7 = fM7827unboximpl18;
                                    final String str11118 = str11116;
                                    final Function0 function11111 = function11110;
                                    final long j = sp18;
                                    final float f8 = fM7813constructorimpl1118;
                                    final float f9 = fM7813constructorimpl1119;
                                    final String str11119 = str11115;
                                    final Function0 function11112 = function5;
                                    final Function0 function11113 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl11110, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion19 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion19, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion110 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion110.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion111.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion111, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion111, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str11117, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion19, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion19, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion110.getCenterHorizontally()), companion110.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion111.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion111, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion111, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion19, f10), Dp.m7813constructorimpl(48.0f));
                                                String str111110 = str11118;
                                                Function0 function11114 = function11111;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str111110, function11114, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion19, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function11115 = function11112;
                                                boolean zChanged = composer4.changed(function11115);
                                                Function0 function11116 = function11113;
                                                boolean zChanged2 = zChanged | composer4.changed(function11116);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function11115, function11116);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str11119, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str11116;
                        str6 = str11115;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function11111 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function11111, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 12582912;
                i14 = i2 & 256;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(f3)) {
                            i15 = 67108864;
                        } else {
                            i15 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i3 |= i15;
                    }
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp19 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl11110 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl11111 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer19 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString19 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion19 = FontWeight.INSTANCE;
                        final float fM7827unboximpl19 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl11110) + density19.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer19, annotatedString19, new TextStyle(0L, sp19, companion19.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer19, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp19, companion19.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function11112 = function3;
                        final String str11117 = str6;
                        final String str11118 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl11112 = Dp.m7813constructorimpl(8.0f);
                                    final String str11119 = str9;
                                    final float f7 = fM7827unboximpl19;
                                    final String str111110 = str11118;
                                    final Function0 function11113 = function11112;
                                    final long j = sp19;
                                    final float f8 = fM7813constructorimpl11110;
                                    final float f9 = fM7813constructorimpl11111;
                                    final String str111111 = str11117;
                                    final Function0 function11114 = function5;
                                    final Function0 function11115 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl11112, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion110 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion110, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion111 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion111.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion112.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion112, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion112, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str11119, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion110, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion110, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion111.getCenterHorizontally()), companion111.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion112.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion112, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion112, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion110, f10), Dp.m7813constructorimpl(48.0f));
                                                String str111112 = str111110;
                                                Function0 function11116 = function11113;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str111112, function11116, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion110, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function11117 = function11114;
                                                boolean zChanged = composer4.changed(function11117);
                                                Function0 function11118 = function11115;
                                                boolean zChanged2 = zChanged | composer4.changed(function11118);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function11117, function11118);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str111111, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str11118;
                        str6 = str11117;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function11113 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function11113, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp110 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl11112 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl11113 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer110 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString110 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion110 = FontWeight.INSTANCE;
                    final float fM7827unboximpl110 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl11112) + density110.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer110, annotatedString110, new TextStyle(0L, sp110, companion110.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer110, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp110, companion110.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function11114 = function3;
                    final String str11119 = str6;
                    final String str111110 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl11114 = Dp.m7813constructorimpl(8.0f);
                                final String str111111 = str9;
                                final float f7 = fM7827unboximpl110;
                                final String str111112 = str111110;
                                final Function0 function11115 = function11114;
                                final long j = sp110;
                                final float f8 = fM7813constructorimpl11112;
                                final float f9 = fM7813constructorimpl11113;
                                final String str111113 = str11119;
                                final Function0 function11116 = function5;
                                final Function0 function11117 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl11114, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion111 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion111, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion112 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion112.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion113.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion113, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion113, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str111111, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion111, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion111, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion112.getCenterHorizontally()), companion112.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion113.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion113, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion113, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion111, f10), Dp.m7813constructorimpl(48.0f));
                                            String str111114 = str111112;
                                            Function0 function11118 = function11115;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str111114, function11118, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion111, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function11119 = function11116;
                                            boolean zChanged = composer4.changed(function11119);
                                            Function0 function111110 = function11117;
                                            boolean zChanged2 = zChanged | composer4.changed(function111110);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function11119, function111110);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str111113, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str111110;
                    str6 = str11119;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function11115 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function11115, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 24576;
            str5 = str2;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str6 = str3;
                c = ' ';
            } else {
                str6 = str3;
                c = ' ';
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(str6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(f3)) {
                            i15 = 67108864;
                        } else {
                            i15 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i3 |= i15;
                    }
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp111 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl11114 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl11115 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer111 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString111 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion111 = FontWeight.INSTANCE;
                        final float fM7827unboximpl111 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl11114) + density111.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer111, annotatedString111, new TextStyle(0L, sp111, companion111.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer111, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp111, companion111.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function11116 = function3;
                        final String str111111 = str6;
                        final String str111112 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl11116 = Dp.m7813constructorimpl(8.0f);
                                    final String str111113 = str9;
                                    final float f7 = fM7827unboximpl111;
                                    final String str111114 = str111112;
                                    final Function0 function11117 = function11116;
                                    final long j = sp111;
                                    final float f8 = fM7813constructorimpl11114;
                                    final float f9 = fM7813constructorimpl11115;
                                    final String str111115 = str111111;
                                    final Function0 function11118 = function5;
                                    final Function0 function11119 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl11116, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion112 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion112, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion113 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion113.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion114.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion114, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion114, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str111113, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion112, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion112, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion113.getCenterHorizontally()), companion113.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion114.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion114, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion114, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion112, f10), Dp.m7813constructorimpl(48.0f));
                                                String str111116 = str111114;
                                                Function0 function111110 = function11117;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str111116, function111110, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion112, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function111111 = function11118;
                                                boolean zChanged = composer4.changed(function111111);
                                                Function0 function111112 = function11119;
                                                boolean zChanged2 = zChanged | composer4.changed(function111112);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function111111, function111112);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str111115, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str111112;
                        str6 = str111111;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function11117 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function11117, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp112 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl11116 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl11117 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer112 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString112 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion112 = FontWeight.INSTANCE;
                    final float fM7827unboximpl112 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl11116) + density112.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer112, annotatedString112, new TextStyle(0L, sp112, companion112.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer112, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp112, companion112.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function11118 = function3;
                    final String str111113 = str6;
                    final String str111114 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl11118 = Dp.m7813constructorimpl(8.0f);
                                final String str111115 = str9;
                                final float f7 = fM7827unboximpl112;
                                final String str111116 = str111114;
                                final Function0 function11119 = function11118;
                                final long j = sp112;
                                final float f8 = fM7813constructorimpl11116;
                                final float f9 = fM7813constructorimpl11117;
                                final String str111117 = str111113;
                                final Function0 function111110 = function5;
                                final Function0 function111111 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl11118, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion113 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion113, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion114 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion114.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion115.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion115, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion115, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str111115, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion113, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion113, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion114.getCenterHorizontally()), companion114.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion115.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion115, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion115, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion113, f10), Dp.m7813constructorimpl(48.0f));
                                            String str111118 = str111116;
                                            Function0 function111112 = function11119;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str111118, function111112, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion113, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function111113 = function111110;
                                            boolean zChanged = composer4.changed(function111113);
                                            Function0 function111114 = function111111;
                                            boolean zChanged2 = zChanged | composer4.changed(function111114);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function111113, function111114);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str111117, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str111114;
                    str6 = str111113;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function11119 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function11119, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 12582912;
            i14 = i2 & 256;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i15 = 67108864;
                    } else {
                        i15 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i3 |= i15;
                }
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp113 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl11118 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl11119 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer113 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString113 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion113 = FontWeight.INSTANCE;
                    final float fM7827unboximpl113 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl11118) + density113.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer113, annotatedString113, new TextStyle(0L, sp113, companion113.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer113, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp113, companion113.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function111110 = function3;
                    final String str111115 = str6;
                    final String str111116 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl111110 = Dp.m7813constructorimpl(8.0f);
                                final String str111117 = str9;
                                final float f7 = fM7827unboximpl113;
                                final String str111118 = str111116;
                                final Function0 function111111 = function111110;
                                final long j = sp113;
                                final float f8 = fM7813constructorimpl11118;
                                final float f9 = fM7813constructorimpl11119;
                                final String str111119 = str111115;
                                final Function0 function111112 = function5;
                                final Function0 function111113 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl111110, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion114 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion114, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion115 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion115.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion116.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion116, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion116, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str111117, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion114, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion114, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion115.getCenterHorizontally()), companion115.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion116.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion116, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion116, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion114, f10), Dp.m7813constructorimpl(48.0f));
                                            String str1111110 = str111118;
                                            Function0 function111114 = function111111;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str1111110, function111114, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion114, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function111115 = function111112;
                                            boolean zChanged = composer4.changed(function111115);
                                            Function0 function111116 = function111113;
                                            boolean zChanged2 = zChanged | composer4.changed(function111116);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function111115, function111116);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str111119, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str111116;
                    str6 = str111115;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function111111 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function111111, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 100663296;
            i16 = i3 | 805306368;
            if ((i16 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                if (i18 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
                if (i4 != 0) {
                    str9 = "是否退出软件";
                    i17 = i8;
                } else {
                    i17 = i8;
                    str9 = str4;
                }
                if (i6 != 0) {
                    str10 = "退出";
                } else {
                    str10 = str5;
                }
                if (i17 != 0) {
                    str6 = "取消";
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (i14 != 0) {
                    fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                } else {
                    fM7813constructorimpl3 = f3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                }
                final long sp114 = TextUnitKt.getSp(20);
                final float fM7813constructorimpl111110 = Dp.m7813constructorimpl(8.0f);
                final float fM7813constructorimpl111111 = Dp.m7813constructorimpl(8.0f);
                TextMeasurer textMeasurerRememberTextMeasurer114 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                f3 = fM7813constructorimpl3;
                AnnotatedString annotatedString114 = new AnnotatedString(str10, null, 2, null);
                FontWeight.Companion companion114 = FontWeight.INSTANCE;
                final float fM7827unboximpl114 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl111110) + density114.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer114, annotatedString114, new TextStyle(0L, sp114, companion114.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer114, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp114, companion114.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-1033024150);
                composer2.endReplaceGroup();
                final Function0 function111112 = function3;
                final String str111117 = str6;
                final String str111118 = str10;
                AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer3 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                            }
                            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                            int i19 = MaterialTheme.$stable;
                            CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                            long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                            float fM7813constructorimpl111112 = Dp.m7813constructorimpl(8.0f);
                            final String str111119 = str9;
                            final float f7 = fM7827unboximpl114;
                            final String str1111110 = str111118;
                            final Function0 function111113 = function111112;
                            final long j = sp114;
                            final float f8 = fM7813constructorimpl111110;
                            final float f9 = fM7813constructorimpl111111;
                            final String str1111111 = str111117;
                            final Function0 function111114 = function5;
                            final Function0 function111115 = function0;
                            SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl111112, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer4 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                        }
                                        Modifier.Companion companion115 = Modifier.INSTANCE;
                                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion115, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                        Alignment.Companion companion116 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion116.getCenterHorizontally();
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                        ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion117.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion117, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion117, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                        int i21 = MaterialTheme.$stable;
                                        TextKt.m3048TextNvy7gAk(str111119, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                        id.i(16.0f, companion115, composer4, 6);
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion115, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion116.getCenterHorizontally()), companion116.getTop(), composer4, 6);
                                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor2 = companion117.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion117, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion117, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        float f10 = f7;
                                        Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion115, f10), Dp.m7813constructorimpl(48.0f));
                                        String str1111112 = str1111110;
                                        Function0 function111116 = function111113;
                                        long j2 = j;
                                        float f11 = f8;
                                        float f12 = f9;
                                        hc2.c(str1111112, function111116, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                        Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion115, f10), Dp.m7813constructorimpl(48.0f));
                                        Function0 function111117 = function111114;
                                        boolean zChanged = composer4.changed(function111117);
                                        Function0 function111118 = function111115;
                                        boolean zChanged2 = zChanged | composer4.changed(function111118);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new hh0(0, function111117, function111118);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        hc2.b(str1111111, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                        if (x2.m(composer4)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 12607488, 104);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM7813constructorimpl;
                f5 = fM7813constructorimpl2;
                str7 = str9;
                str8 = str111118;
                str6 = str111117;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f4 = f;
                function5 = function4;
                str7 = str4;
                str8 = str5;
                f5 = f2;
            }
            f6 = f3;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function0 function111113 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        kh0.a(function0, function1, function111113, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 3072;
        str4 = str;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                str5 = str2;
                if (composerStartRestartGroup.changed(str5)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                str6 = str3;
                c = ' ';
            } else {
                str6 = str3;
                c = ' ';
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(str6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 256;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(f3)) {
                            i15 = 67108864;
                        } else {
                            i15 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i3 |= i15;
                    }
                    i16 = i3 | 805306368;
                    if ((i16 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                        if (i18 != 0) {
                            function5 = null;
                        } else {
                            function5 = function4;
                        }
                        if (i4 != 0) {
                            str9 = "是否退出软件";
                            i17 = i8;
                        } else {
                            i17 = i8;
                            str9 = str4;
                        }
                        if (i6 != 0) {
                            str10 = "退出";
                        } else {
                            str10 = str5;
                        }
                        if (i17 != 0) {
                            str6 = "取消";
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (i14 != 0) {
                            fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                        } else {
                            fM7813constructorimpl3 = f3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                        }
                        final long sp115 = TextUnitKt.getSp(20);
                        final float fM7813constructorimpl111112 = Dp.m7813constructorimpl(8.0f);
                        final float fM7813constructorimpl111113 = Dp.m7813constructorimpl(8.0f);
                        TextMeasurer textMeasurerRememberTextMeasurer115 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                        Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f3 = fM7813constructorimpl3;
                        AnnotatedString annotatedString115 = new AnnotatedString(str10, null, 2, null);
                        FontWeight.Companion companion115 = FontWeight.INSTANCE;
                        final float fM7827unboximpl115 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl111112) + density115.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer115, annotatedString115, new TextStyle(0L, sp115, companion115.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer115, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp115, companion115.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1033024150);
                        composer2.endReplaceGroup();
                        final Function0 function111114 = function3;
                        final String str111119 = str6;
                        final String str1111110 = str10;
                        AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer3 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                    }
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i19 = MaterialTheme.$stable;
                                    CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                    long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                    float fM7813constructorimpl111114 = Dp.m7813constructorimpl(8.0f);
                                    final String str1111111 = str9;
                                    final float f7 = fM7827unboximpl115;
                                    final String str1111112 = str1111110;
                                    final Function0 function111115 = function111114;
                                    final long j = sp115;
                                    final float f8 = fM7813constructorimpl111112;
                                    final float f9 = fM7813constructorimpl111113;
                                    final String str1111113 = str111119;
                                    final Function0 function111116 = function5;
                                    final Function0 function111117 = function0;
                                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl111114, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer4 = (Composer) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                                }
                                                Modifier.Companion companion116 = Modifier.INSTANCE;
                                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion116, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                                Alignment.Companion companion117 = Alignment.INSTANCE;
                                                Alignment.Horizontal centerHorizontally = companion117.getCenterHorizontally();
                                                Arrangement arrangement = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion118.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion118, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion118, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                int i21 = MaterialTheme.$stable;
                                                TextKt.m3048TextNvy7gAk(str1111111, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                                id.i(16.0f, companion116, composer4, 6);
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion116, 0.0f, 1, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion117.getCenterHorizontally()), companion117.getTop(), composer4, 6);
                                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                                int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor2 = companion118.getConstructor();
                                                if (composer4.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                                mr.z(companion118, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion118, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                float f10 = f7;
                                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion116, f10), Dp.m7813constructorimpl(48.0f));
                                                String str1111114 = str1111112;
                                                Function0 function111118 = function111115;
                                                long j2 = j;
                                                float f11 = f8;
                                                float f12 = f9;
                                                hc2.c(str1111114, function111118, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                                Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion116, f10), Dp.m7813constructorimpl(48.0f));
                                                Function0 function111119 = function111116;
                                                boolean zChanged = composer4.changed(function111119);
                                                Function0 function1111110 = function111117;
                                                boolean zChanged2 = zChanged | composer4.changed(function1111110);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new hh0(0, function111119, function1111110);
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                hc2.b(str1111113, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                                if (x2.m(composer4)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 12607488, 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f4 = fM7813constructorimpl;
                        f5 = fM7813constructorimpl2;
                        str7 = str9;
                        str8 = str1111110;
                        str6 = str111119;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        function5 = function4;
                        str7 = str4;
                        str8 = str5;
                        f5 = f2;
                    }
                    f6 = f3;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function0 function111115 = function5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                kh0.a(function0, function1, function111115, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 100663296;
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp116 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl111114 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl111115 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer116 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString116 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion116 = FontWeight.INSTANCE;
                    final float fM7827unboximpl116 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl111114) + density116.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer116, annotatedString116, new TextStyle(0L, sp116, companion116.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer116, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp116, companion116.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function111116 = function3;
                    final String str1111111 = str6;
                    final String str1111112 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl111116 = Dp.m7813constructorimpl(8.0f);
                                final String str1111113 = str9;
                                final float f7 = fM7827unboximpl116;
                                final String str1111114 = str1111112;
                                final Function0 function111117 = function111116;
                                final long j = sp116;
                                final float f8 = fM7813constructorimpl111114;
                                final float f9 = fM7813constructorimpl111115;
                                final String str1111115 = str1111111;
                                final Function0 function111118 = function5;
                                final Function0 function111119 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl111116, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion117 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion117, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion118 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion118.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion119.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion119, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion119, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str1111113, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion117, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion117, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion118.getCenterHorizontally()), companion118.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion119.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion119, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion119, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion117, f10), Dp.m7813constructorimpl(48.0f));
                                            String str1111116 = str1111114;
                                            Function0 function1111110 = function111117;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str1111116, function1111110, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion117, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function1111111 = function111118;
                                            boolean zChanged = composer4.changed(function1111111);
                                            Function0 function1111112 = function111119;
                                            boolean zChanged2 = zChanged | composer4.changed(function1111112);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function1111111, function1111112);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str1111115, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str1111112;
                    str6 = str1111111;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function111117 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function111117, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 12582912;
            i14 = i2 & 256;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i15 = 67108864;
                    } else {
                        i15 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i3 |= i15;
                }
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp117 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl111116 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl111117 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer117 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString117 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion117 = FontWeight.INSTANCE;
                    final float fM7827unboximpl117 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl111116) + density117.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer117, annotatedString117, new TextStyle(0L, sp117, companion117.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer117, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp117, companion117.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function111118 = function3;
                    final String str1111113 = str6;
                    final String str1111114 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl111118 = Dp.m7813constructorimpl(8.0f);
                                final String str1111115 = str9;
                                final float f7 = fM7827unboximpl117;
                                final String str1111116 = str1111114;
                                final Function0 function111119 = function111118;
                                final long j = sp117;
                                final float f8 = fM7813constructorimpl111116;
                                final float f9 = fM7813constructorimpl111117;
                                final String str1111117 = str1111113;
                                final Function0 function1111110 = function5;
                                final Function0 function1111111 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl111118, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion118 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion118, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion119 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion119.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion1110.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion1110, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1110, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str1111115, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion118, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion118, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion119.getCenterHorizontally()), companion119.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion1110.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion1110, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1110, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion118, f10), Dp.m7813constructorimpl(48.0f));
                                            String str1111118 = str1111116;
                                            Function0 function1111112 = function111119;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str1111118, function1111112, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion118, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function1111113 = function1111110;
                                            boolean zChanged = composer4.changed(function1111113);
                                            Function0 function1111114 = function1111111;
                                            boolean zChanged2 = zChanged | composer4.changed(function1111114);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function1111113, function1111114);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str1111117, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str1111114;
                    str6 = str1111113;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function111119 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function111119, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 100663296;
            i16 = i3 | 805306368;
            if ((i16 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                if (i18 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
                if (i4 != 0) {
                    str9 = "是否退出软件";
                    i17 = i8;
                } else {
                    i17 = i8;
                    str9 = str4;
                }
                if (i6 != 0) {
                    str10 = "退出";
                } else {
                    str10 = str5;
                }
                if (i17 != 0) {
                    str6 = "取消";
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (i14 != 0) {
                    fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                } else {
                    fM7813constructorimpl3 = f3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                }
                final long sp118 = TextUnitKt.getSp(20);
                final float fM7813constructorimpl111118 = Dp.m7813constructorimpl(8.0f);
                final float fM7813constructorimpl111119 = Dp.m7813constructorimpl(8.0f);
                TextMeasurer textMeasurerRememberTextMeasurer118 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                f3 = fM7813constructorimpl3;
                AnnotatedString annotatedString118 = new AnnotatedString(str10, null, 2, null);
                FontWeight.Companion companion118 = FontWeight.INSTANCE;
                final float fM7827unboximpl118 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl111118) + density118.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer118, annotatedString118, new TextStyle(0L, sp118, companion118.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer118, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp118, companion118.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-1033024150);
                composer2.endReplaceGroup();
                final Function0 function1111110 = function3;
                final String str1111115 = str6;
                final String str1111116 = str10;
                AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer3 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                            }
                            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                            int i19 = MaterialTheme.$stable;
                            CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                            long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                            float fM7813constructorimpl1111110 = Dp.m7813constructorimpl(8.0f);
                            final String str1111117 = str9;
                            final float f7 = fM7827unboximpl118;
                            final String str1111118 = str1111116;
                            final Function0 function1111111 = function1111110;
                            final long j = sp118;
                            final float f8 = fM7813constructorimpl111118;
                            final float f9 = fM7813constructorimpl111119;
                            final String str1111119 = str1111115;
                            final Function0 function1111112 = function5;
                            final Function0 function1111113 = function0;
                            SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1111110, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer4 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                        }
                                        Modifier.Companion companion119 = Modifier.INSTANCE;
                                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion119, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                        Alignment.Companion companion1110 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion1110.getCenterHorizontally();
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                        ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion1111.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion1111, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1111, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                        int i21 = MaterialTheme.$stable;
                                        TextKt.m3048TextNvy7gAk(str1111117, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                        id.i(16.0f, companion119, composer4, 6);
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion119, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion1110.getCenterHorizontally()), companion1110.getTop(), composer4, 6);
                                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor2 = companion1111.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion1111, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1111, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        float f10 = f7;
                                        Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion119, f10), Dp.m7813constructorimpl(48.0f));
                                        String str11111110 = str1111118;
                                        Function0 function1111114 = function1111111;
                                        long j2 = j;
                                        float f11 = f8;
                                        float f12 = f9;
                                        hc2.c(str11111110, function1111114, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                        Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion119, f10), Dp.m7813constructorimpl(48.0f));
                                        Function0 function1111115 = function1111112;
                                        boolean zChanged = composer4.changed(function1111115);
                                        Function0 function1111116 = function1111113;
                                        boolean zChanged2 = zChanged | composer4.changed(function1111116);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new hh0(0, function1111115, function1111116);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        hc2.b(str1111119, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                        if (x2.m(composer4)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 12607488, 104);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM7813constructorimpl;
                f5 = fM7813constructorimpl2;
                str7 = str9;
                str8 = str1111116;
                str6 = str1111115;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f4 = f;
                function5 = function4;
                str7 = str4;
                str8 = str5;
                f5 = f2;
            }
            f6 = f3;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function0 function1111111 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        kh0.a(function0, function1, function1111111, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 24576;
        str5 = str2;
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            str6 = str3;
            c = ' ';
        } else {
            str6 = str3;
            c = ' ';
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(str6)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
        }
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        i12 = i2 & 128;
        if (i12 != 0) {
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            i14 = i2 & 256;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i15 = 67108864;
                    } else {
                        i15 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i3 |= i15;
                }
                i16 = i3 | 805306368;
                if ((i16 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                    if (i18 != 0) {
                        function5 = null;
                    } else {
                        function5 = function4;
                    }
                    if (i4 != 0) {
                        str9 = "是否退出软件";
                        i17 = i8;
                    } else {
                        i17 = i8;
                        str9 = str4;
                    }
                    if (i6 != 0) {
                        str10 = "退出";
                    } else {
                        str10 = str5;
                    }
                    if (i17 != 0) {
                        str6 = "取消";
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (i14 != 0) {
                        fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                    } else {
                        fM7813constructorimpl3 = f3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                    }
                    final long sp119 = TextUnitKt.getSp(20);
                    final float fM7813constructorimpl1111110 = Dp.m7813constructorimpl(8.0f);
                    final float fM7813constructorimpl1111111 = Dp.m7813constructorimpl(8.0f);
                    TextMeasurer textMeasurerRememberTextMeasurer119 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f3 = fM7813constructorimpl3;
                    AnnotatedString annotatedString119 = new AnnotatedString(str10, null, 2, null);
                    FontWeight.Companion companion119 = FontWeight.INSTANCE;
                    final float fM7827unboximpl119 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl1111110) + density119.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer119, annotatedString119, new TextStyle(0L, sp119, companion119.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer119, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp119, companion119.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1033024150);
                    composer2.endReplaceGroup();
                    final Function0 function1111112 = function3;
                    final String str1111117 = str6;
                    final String str1111118 = str10;
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                                }
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i19 = MaterialTheme.$stable;
                                CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                                long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                                float fM7813constructorimpl1111112 = Dp.m7813constructorimpl(8.0f);
                                final String str1111119 = str9;
                                final float f7 = fM7827unboximpl119;
                                final String str11111110 = str1111118;
                                final Function0 function1111113 = function1111112;
                                final long j = sp119;
                                final float f8 = fM7813constructorimpl1111110;
                                final float f9 = fM7813constructorimpl1111111;
                                final String str11111111 = str1111117;
                                final Function0 function1111114 = function5;
                                final Function0 function1111115 = function0;
                                SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1111112, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer4 = (Composer) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                            }
                                            Modifier.Companion companion1110 = Modifier.INSTANCE;
                                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion1110, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                            Alignment.Companion companion1111 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion1111.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                            ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion1112.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion1112, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1112, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                            int i21 = MaterialTheme.$stable;
                                            TextKt.m3048TextNvy7gAk(str1111119, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                            id.i(16.0f, companion1110, composer4, 6);
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion1110, 0.0f, 1, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion1111.getCenterHorizontally()), companion1111.getTop(), composer4, 6);
                                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                            int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = companion1112.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                            mr.z(companion1112, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1112, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            float f10 = f7;
                                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion1110, f10), Dp.m7813constructorimpl(48.0f));
                                            String str11111112 = str11111110;
                                            Function0 function1111116 = function1111113;
                                            long j2 = j;
                                            float f11 = f8;
                                            float f12 = f9;
                                            hc2.c(str11111112, function1111116, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                            Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion1110, f10), Dp.m7813constructorimpl(48.0f));
                                            Function0 function1111117 = function1111114;
                                            boolean zChanged = composer4.changed(function1111117);
                                            Function0 function1111118 = function1111115;
                                            boolean zChanged2 = zChanged | composer4.changed(function1111118);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new hh0(0, function1111117, function1111118);
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            hc2.b(str11111111, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                            if (x2.m(composer4)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54), composer3, 12607488, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f4 = fM7813constructorimpl;
                    f5 = fM7813constructorimpl2;
                    str7 = str9;
                    str8 = str1111118;
                    str6 = str1111117;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f4 = f;
                    function5 = function4;
                    str7 = str4;
                    str8 = str5;
                    f5 = f2;
                }
                f6 = f3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function0 function1111113 = function5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            kh0.a(function0, function1, function1111113, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 100663296;
            i16 = i3 | 805306368;
            if ((i16 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                if (i18 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
                if (i4 != 0) {
                    str9 = "是否退出软件";
                    i17 = i8;
                } else {
                    i17 = i8;
                    str9 = str4;
                }
                if (i6 != 0) {
                    str10 = "退出";
                } else {
                    str10 = str5;
                }
                if (i17 != 0) {
                    str6 = "取消";
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (i14 != 0) {
                    fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                } else {
                    fM7813constructorimpl3 = f3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                }
                final long sp1110 = TextUnitKt.getSp(20);
                final float fM7813constructorimpl1111112 = Dp.m7813constructorimpl(8.0f);
                final float fM7813constructorimpl1111113 = Dp.m7813constructorimpl(8.0f);
                TextMeasurer textMeasurerRememberTextMeasurer1110 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                f3 = fM7813constructorimpl3;
                AnnotatedString annotatedString1110 = new AnnotatedString(str10, null, 2, null);
                FontWeight.Companion companion1110 = FontWeight.INSTANCE;
                final float fM7827unboximpl1110 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl1111112) + density1110.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer1110, annotatedString1110, new TextStyle(0L, sp1110, companion1110.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer1110, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp1110, companion1110.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-1033024150);
                composer2.endReplaceGroup();
                final Function0 function1111114 = function3;
                final String str1111119 = str6;
                final String str11111110 = str10;
                AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer3 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                            }
                            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                            int i19 = MaterialTheme.$stable;
                            CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                            long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                            float fM7813constructorimpl1111114 = Dp.m7813constructorimpl(8.0f);
                            final String str11111111 = str9;
                            final float f7 = fM7827unboximpl1110;
                            final String str11111112 = str11111110;
                            final Function0 function1111115 = function1111114;
                            final long j = sp1110;
                            final float f8 = fM7813constructorimpl1111112;
                            final float f9 = fM7813constructorimpl1111113;
                            final String str11111113 = str1111119;
                            final Function0 function1111116 = function5;
                            final Function0 function1111117 = function0;
                            SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1111114, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer4 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                        }
                                        Modifier.Companion companion1111 = Modifier.INSTANCE;
                                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion1111, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                        Alignment.Companion companion1112 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion1112.getCenterHorizontally();
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                        ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion1113.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion1113, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1113, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                        int i21 = MaterialTheme.$stable;
                                        TextKt.m3048TextNvy7gAk(str11111111, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                        id.i(16.0f, companion1111, composer4, 6);
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion1111, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion1112.getCenterHorizontally()), companion1112.getTop(), composer4, 6);
                                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor2 = companion1113.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion1113, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1113, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        float f10 = f7;
                                        Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion1111, f10), Dp.m7813constructorimpl(48.0f));
                                        String str11111114 = str11111112;
                                        Function0 function1111118 = function1111115;
                                        long j2 = j;
                                        float f11 = f8;
                                        float f12 = f9;
                                        hc2.c(str11111114, function1111118, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                        Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion1111, f10), Dp.m7813constructorimpl(48.0f));
                                        Function0 function1111119 = function1111116;
                                        boolean zChanged = composer4.changed(function1111119);
                                        Function0 function11111110 = function1111117;
                                        boolean zChanged2 = zChanged | composer4.changed(function11111110);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new hh0(0, function1111119, function11111110);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        hc2.b(str11111113, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                        if (x2.m(composer4)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 12607488, 104);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM7813constructorimpl;
                f5 = fM7813constructorimpl2;
                str7 = str9;
                str8 = str11111110;
                str6 = str1111119;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f4 = f;
                function5 = function4;
                str7 = str4;
                str8 = str5;
                f5 = f2;
            }
            f6 = f3;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function0 function1111115 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        kh0.a(function0, function1, function1111115, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 12582912;
        i14 = i2 & 256;
        if (i14 != 0) {
            if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i15 = 67108864;
                } else {
                    i15 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i3 |= i15;
            }
            i16 = i3 | 805306368;
            if ((i16 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
                if (i18 != 0) {
                    function5 = null;
                } else {
                    function5 = function4;
                }
                if (i4 != 0) {
                    str9 = "是否退出软件";
                    i17 = i8;
                } else {
                    i17 = i8;
                    str9 = str4;
                }
                if (i6 != 0) {
                    str10 = "退出";
                } else {
                    str10 = str5;
                }
                if (i17 != 0) {
                    str6 = "取消";
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (i14 != 0) {
                    fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
                } else {
                    fM7813constructorimpl3 = f3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
                }
                final long sp1111 = TextUnitKt.getSp(20);
                final float fM7813constructorimpl1111114 = Dp.m7813constructorimpl(8.0f);
                final float fM7813constructorimpl1111115 = Dp.m7813constructorimpl(8.0f);
                TextMeasurer textMeasurerRememberTextMeasurer1111 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                Density density1111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                f3 = fM7813constructorimpl3;
                AnnotatedString annotatedString1111 = new AnnotatedString(str10, null, 2, null);
                FontWeight.Companion companion1111 = FontWeight.INSTANCE;
                final float fM7827unboximpl1111 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl1111114) + density1111.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer1111, annotatedString1111, new TextStyle(0L, sp1111, companion1111.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer1111, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp1111, companion1111.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-1033024150);
                composer2.endReplaceGroup();
                final Function0 function1111116 = function3;
                final String str11111111 = str6;
                final String str11111112 = str10;
                AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer3 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                            }
                            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                            int i19 = MaterialTheme.$stable;
                            CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                            long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                            float fM7813constructorimpl1111116 = Dp.m7813constructorimpl(8.0f);
                            final String str11111113 = str9;
                            final float f7 = fM7827unboximpl1111;
                            final String str11111114 = str11111112;
                            final Function0 function1111117 = function1111116;
                            final long j = sp1111;
                            final float f8 = fM7813constructorimpl1111114;
                            final float f9 = fM7813constructorimpl1111115;
                            final String str11111115 = str11111111;
                            final Function0 function1111118 = function5;
                            final Function0 function1111119 = function0;
                            SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1111116, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer4 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                        }
                                        Modifier.Companion companion1112 = Modifier.INSTANCE;
                                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion1112, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                        Alignment.Companion companion1113 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion1113.getCenterHorizontally();
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                        ComposeUiNode.Companion companion1114 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion1114.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion1114, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1114, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                        int i21 = MaterialTheme.$stable;
                                        TextKt.m3048TextNvy7gAk(str11111113, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                        id.i(16.0f, companion1112, composer4, 6);
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion1112, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion1113.getCenterHorizontally()), companion1113.getTop(), composer4, 6);
                                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                        int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor2 = companion1114.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                        mr.z(companion1114, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1114, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        float f10 = f7;
                                        Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion1112, f10), Dp.m7813constructorimpl(48.0f));
                                        String str11111116 = str11111114;
                                        Function0 function11111110 = function1111117;
                                        long j2 = j;
                                        float f11 = f8;
                                        float f12 = f9;
                                        hc2.c(str11111116, function11111110, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                        Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion1112, f10), Dp.m7813constructorimpl(48.0f));
                                        Function0 function11111111 = function1111118;
                                        boolean zChanged = composer4.changed(function11111111);
                                        Function0 function11111112 = function1111119;
                                        boolean zChanged2 = zChanged | composer4.changed(function11111112);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new hh0(0, function11111111, function11111112);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        hc2.b(str11111115, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                        if (x2.m(composer4)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 12607488, 104);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f4 = fM7813constructorimpl;
                f5 = fM7813constructorimpl2;
                str7 = str9;
                str8 = str11111112;
                str6 = str11111111;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f4 = f;
                function5 = function4;
                str7 = str4;
                str8 = str5;
                f5 = f2;
            }
            f6 = f3;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function0 function1111117 = function5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        kh0.a(function0, function1, function1111117, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 100663296;
        i16 = i3 | 805306368;
        if ((i16 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i16 & 1)) {
            if (i18 != 0) {
                function5 = null;
            } else {
                function5 = function4;
            }
            if (i4 != 0) {
                str9 = "是否退出软件";
                i17 = i8;
            } else {
                i17 = i8;
                str9 = str4;
            }
            if (i6 != 0) {
                str10 = "退出";
            } else {
                str10 = str5;
            }
            if (i17 != 0) {
                str6 = "取消";
            }
            if (i10 != 0) {
                fM7813constructorimpl = Dp.m7813constructorimpl(360.0f);
            } else {
                fM7813constructorimpl = f;
            }
            if (i12 != 0) {
                fM7813constructorimpl2 = Dp.m7813constructorimpl(180.0f);
            } else {
                fM7813constructorimpl2 = f2;
            }
            if (i14 != 0) {
                fM7813constructorimpl3 = Dp.m7813constructorimpl(120.0f);
            } else {
                fM7813constructorimpl3 = f3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1090824648, i16, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog (ExitConfirmDialog.kt:40)");
            }
            final long sp1112 = TextUnitKt.getSp(20);
            final float fM7813constructorimpl1111116 = Dp.m7813constructorimpl(8.0f);
            final float fM7813constructorimpl1111117 = Dp.m7813constructorimpl(8.0f);
            TextMeasurer textMeasurerRememberTextMeasurer1112 = TextMeasurerHelperKt.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
            Density density1112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            f3 = fM7813constructorimpl3;
            AnnotatedString annotatedString1112 = new AnnotatedString(str10, null, 2, null);
            FontWeight.Companion companion1112 = FontWeight.INSTANCE;
            final float fM7827unboximpl1112 = ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(12.0f) + Dp.m7813constructorimpl(Dp.m7813constructorimpl(2.0f * fM7813constructorimpl1111116) + density1112.mo417toDpu2uoSUM(Math.max((int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer1112, annotatedString1112, new TextStyle(0L, sp1112, companion1112.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c), (int) (TextMeasurer.m7249measurexDpz5zY$default(textMeasurerRememberTextMeasurer1112, new AnnotatedString(str6, null, 2, null), new TextStyle(0L, sp1112, companion1112.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777209, (DefaultConstructorMarker) null), 0, false, 1, null, 0L, null, null, null, false, 2028, null).getSize() >> c)))))), Dp.m7811boximpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f3 - Dp.m7813constructorimpl(20.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(96.0f)))).m7827unboximpl()), Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(8.0f) + f3)))).m7827unboximpl();
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(-1033024150);
            composer2.endReplaceGroup();
            final Function0 function1111118 = function3;
            final String str11111113 = str6;
            final String str11111114 = str10;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false, 6, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-422129457, true, new Function2() { // from class: ih0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-422129457, iIntValue, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous> (ExitConfirmDialog.kt:83)");
                        }
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl), fM7813constructorimpl2);
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i19 = MaterialTheme.$stable;
                        CornerBasedShape large = materialTheme.getShapes(composer3, i19).getLarge();
                        long surface = materialTheme.getColorScheme(composer3, i19).getSurface();
                        float fM7813constructorimpl1111118 = Dp.m7813constructorimpl(8.0f);
                        final String str11111115 = str9;
                        final float f7 = fM7827unboximpl1112;
                        final String str11111116 = str11111114;
                        final Function0 function1111119 = function1111118;
                        final long j = sp1112;
                        final float f8 = fM7813constructorimpl1111116;
                        final float f9 = fM7813constructorimpl1111117;
                        final String str11111117 = str11111113;
                        final Function0 function11111110 = function5;
                        final Function0 function11111111 = function0;
                        SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, large, surface, 0L, fM7813constructorimpl1111118, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1180220054, true, new Function2() { // from class: gh0
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
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer4 = (Composer) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (composer4.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1180220054, iIntValue2, -1, "com.dh.myembyapp.ui.components.ExitConfirmDialog.<anonymous>.<anonymous> (ExitConfirmDialog.kt:91)");
                                    }
                                    Modifier.Companion companion1113 = Modifier.INSTANCE;
                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion1113, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                    Alignment.Companion companion1114 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion1114.getCenterHorizontally();
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), centerHorizontally, composer4, 54);
                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                    int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                    ComposeUiNode.Companion companion1115 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion1115.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                                    mr.z(companion1115, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1115, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                    int i21 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk(str11111115, null, materialTheme2.getColorScheme(composer4, i21).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer4, i21).getTitleLarge(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 131066);
                                    id.i(16.0f, companion1113, composer4, 6);
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion1113, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion1114.getCenterHorizontally()), companion1114.getTop(), composer4, 6);
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                    int i22 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                    Function0<ComposeUiNode> constructor2 = companion1115.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                    mr.z(companion1115, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion1115, composerM4318constructorimpl2, Integer.valueOf(i22), composerM4318constructorimpl2));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    float f10 = f7;
                                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion1113, f10), Dp.m7813constructorimpl(48.0f));
                                    String str11111118 = str11111116;
                                    Function0 function11111112 = function1111119;
                                    long j2 = j;
                                    float f11 = f8;
                                    float f12 = f9;
                                    hc2.c(str11111118, function11111112, modifierM1050height3ABfNKs2, false, null, j2, f11, f12, composer4, 14352384, 24);
                                    Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion1113, f10), Dp.m7813constructorimpl(48.0f));
                                    Function0 function11111113 = function11111110;
                                    boolean zChanged = composer4.changed(function11111113);
                                    Function0 function11111114 = function11111111;
                                    boolean zChanged2 = zChanged | composer4.changed(function11111114);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new hh0(0, function11111113, function11111114);
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    hc2.b(str11111117, (Function0) objRememberedValue, modifierM1050height3ABfNKs3, false, j2, f11, f12, composer4, 1794048, 8);
                                    if (x2.m(composer4)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 12607488, 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composer2, 54), composer2, (i16 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f4 = fM7813constructorimpl;
            f5 = fM7813constructorimpl2;
            str7 = str9;
            str8 = str11111114;
            str6 = str11111113;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            f4 = f;
            function5 = function4;
            str7 = str4;
            str8 = str5;
            f5 = f2;
        }
        f6 = f3;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 function1111119 = function5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kh0.a(function0, function1, function1111119, str7, str8, str6, f4, f5, f6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
