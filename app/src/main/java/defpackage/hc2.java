package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hc2 {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;

    static {
        Color.Companion companion = Color.INSTANCE;
        a = companion.m5189getWhite0d7_KjU();
        b = ColorKt.Color(4279308561L);
        c = ColorKt.Color(4282532418L);
        d = companion.m5189getWhite0d7_KjU();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:113:0x016e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0170  */
    /* JADX WARN: Code duplicated, block: B:117:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x0179  */
    /* JADX WARN: Code duplicated, block: B:121:0x0182  */
    /* JADX WARN: Code duplicated, block: B:122:0x0184  */
    /* JADX WARN: Code duplicated, block: B:125:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:135:0x023d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0246  */
    /* JADX WARN: Code duplicated, block: B:141:0x0255  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    public static final void a(final String str, Function0 function0, Modifier modifier, final jc2 jc2Var, boolean z, Function0 function1, final long j, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        boolean z3;
        Composer composer2;
        boolean z4;
        float f4;
        Function0 function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final boolean z5;
        Function0 function3;
        float fM7813constructorimpl;
        float fM7813constructorimpl2;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableState mutableState;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objRememberedValue2;
        int i10;
        Object objRememberedValue3;
        int i11;
        str.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1052169403);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(jc2Var.ordinal()) ? 2048 : 1024;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(j)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(f3)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i9 = 67108864;
                    } else {
                        i9 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i3 |= i9;
                }
                if ((i3 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i6 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1052169403, i3, -1, "com.dh.myembyapp.ui.theme.TvButton (TvButton.kt:370)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                    }
                    u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    if ((57344 & i3) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((i3 & Input.Keys.FORWARD_DEL) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z10 = z6 | z7;
                    if ((458752 & i3) == 131072) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z10 | z8;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z9 || objRememberedValue2 == companion.getEmpty()) {
                        i10 = 1;
                        objRememberedValue2 = new w60(z5, function0, function3, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        i10 = 1;
                    }
                    Function0 function4 = (Function0) objRememberedValue2;
                    function1 = function3;
                    Modifier modifierM1049defaultMinSizeVpY3zN4$default = SizeKt.m1049defaultMinSizeVpY3zN4$default(modifier, 0.0f, Dp.m7813constructorimpl(56.0f), i10, null);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new b42(12, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1049defaultMinSizeVpY3zN4$default, (Function1) objRememberedValue3);
                    ButtonColors buttonColorsI = i(jc2Var, z5, composerStartRestartGroup, (i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                    ButtonScale buttonScaleL = l(1.05f);
                    ButtonGlow buttonGlowA = el0.a(u61Var);
                    ButtonBorder buttonBorderH = h(composerStartRestartGroup);
                    ButtonShape buttonShapeShape$default = ButtonDefaults.shape$default(ButtonDefaults.INSTANCE, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium(), null, null, null, null, 30, null);
                    PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(fM7813constructorimpl, fM7813constructorimpl2);
                    Function3 function5 = new Function3() { // from class: fc2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Composer composer3 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1538912459, iIntValue, -1, "com.dh.myembyapp.ui.theme.TvButton.<anonymous> (TvButton.kt:399)");
                                }
                                FontWeight medium = FontWeight.INSTANCE.getMedium();
                                int iM7703getCentere0LSkKk = TextAlign.INSTANCE.m7703getCentere0LSkKk();
                                int iM7761getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8();
                                TextKt.m3048TextNvy7gAk(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), hc2.k(jc2Var, ((Boolean) mutableState.getValue()).booleanValue(), z5, composer3, 0, 0), null, j, null, medium, null, 0L, null, TextAlign.m7696boximpl(iM7703getCentere0LSkKk), 0L, iM7761getEllipsisgIe3tQ8, false, 1, 0, null, null, composer3, 1572912, 24960, 240552);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    boolean z11 = z5;
                    composer2 = composerStartRestartGroup;
                    ButtonKt.m8231ButtonTCVpFMg(function4, modifierOnFocusChanged, null, false, buttonScaleL, buttonGlowA, buttonShapeShape$default, buttonColorsI, 0.0f, buttonBorderH, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(1538912459, true, function5, composerStartRestartGroup, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 2316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM7813constructorimpl;
                    z4 = z11;
                    f4 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    z4 = z2;
                    f4 = f2;
                }
                function2 = function1;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new tr1(str, function0, modifier, jc2Var, z4, function2, j, f3, f4, i, i2));
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 256;
            if (i8 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i9 = 67108864;
                } else {
                    i9 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i3 |= i9;
            }
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i6 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1052169403, i3, -1, "com.dh.myembyapp.ui.theme.TvButton (TvButton.kt:370)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61 u61Var2 = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                if ((57344 & i3) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i3 & Input.Keys.FORWARD_DEL) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z12 = z6 | z7;
                if ((458752 & i3) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z12 | z8;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z9) {
                    i10 = 1;
                    objRememberedValue2 = new w60(z5, function0, function3, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    i10 = 1;
                    objRememberedValue2 = new w60(z5, function0, function3, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function6 = (Function0) objRememberedValue2;
                function1 = function3;
                Modifier modifierM1049defaultMinSizeVpY3zN4$default2 = SizeKt.m1049defaultMinSizeVpY3zN4$default(modifier, 0.0f, Dp.m7813constructorimpl(56.0f), i10, null);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new b42(12, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1049defaultMinSizeVpY3zN4$default2, (Function1) objRememberedValue3);
                ButtonColors buttonColorsI2 = i(jc2Var, z5, composerStartRestartGroup, (i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                ButtonScale buttonScaleL2 = l(1.05f);
                ButtonGlow buttonGlowA2 = el0.a(u61Var2);
                ButtonBorder buttonBorderH2 = h(composerStartRestartGroup);
                ButtonShape buttonShapeShape$default2 = ButtonDefaults.shape$default(ButtonDefaults.INSTANCE, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium(), null, null, null, null, 30, null);
                PaddingValues paddingValuesM993PaddingValuesYgX7TsA2 = PaddingKt.m993PaddingValuesYgX7TsA(fM7813constructorimpl, fM7813constructorimpl2);
                Function3 function7 = new Function3() { // from class: fc2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Composer composer3 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((RowScope) obj).getClass();
                        if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1538912459, iIntValue, -1, "com.dh.myembyapp.ui.theme.TvButton.<anonymous> (TvButton.kt:399)");
                            }
                            FontWeight medium = FontWeight.INSTANCE.getMedium();
                            int iM7703getCentere0LSkKk = TextAlign.INSTANCE.m7703getCentere0LSkKk();
                            int iM7761getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8();
                            TextKt.m3048TextNvy7gAk(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), hc2.k(jc2Var, ((Boolean) mutableState.getValue()).booleanValue(), z5, composer3, 0, 0), null, j, null, medium, null, 0L, null, TextAlign.m7696boximpl(iM7703getCentere0LSkKk), 0L, iM7761getEllipsisgIe3tQ8, false, 1, 0, null, null, composer3, 1572912, 24960, 240552);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                };
                boolean z13 = z5;
                composer2 = composerStartRestartGroup;
                ButtonKt.m8231ButtonTCVpFMg(function6, modifierOnFocusChanged2, null, false, buttonScaleL2, buttonGlowA2, buttonShapeShape$default2, buttonColorsI2, 0.0f, buttonBorderH2, paddingValuesM993PaddingValuesYgX7TsA2, null, ComposableLambdaKt.rememberComposableLambda(1538912459, true, function7, composerStartRestartGroup, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 2316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM7813constructorimpl;
                z4 = z13;
                f4 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                z4 = z2;
                f4 = f2;
            }
            function2 = function1;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new tr1(str, function0, modifier, jc2Var, z4, function2, j, f3, f4, i, i2));
            }
        }
        i3 |= 24576;
        z2 = z;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 256;
            if (i8 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i9 = 67108864;
                } else {
                    i9 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i3 |= i9;
            }
            if ((i3 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i6 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1052169403, i3, -1, "com.dh.myembyapp.ui.theme.TvButton (TvButton.kt:370)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61 u61Var3 = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                if ((57344 & i3) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i3 & Input.Keys.FORWARD_DEL) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z14 = z6 | z7;
                if ((458752 & i3) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z14 | z8;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z9) {
                    i10 = 1;
                    objRememberedValue2 = new w60(z5, function0, function3, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    i10 = 1;
                    objRememberedValue2 = new w60(z5, function0, function3, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function8 = (Function0) objRememberedValue2;
                function1 = function3;
                Modifier modifierM1049defaultMinSizeVpY3zN4$default3 = SizeKt.m1049defaultMinSizeVpY3zN4$default(modifier, 0.0f, Dp.m7813constructorimpl(56.0f), i10, null);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new b42(12, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(modifierM1049defaultMinSizeVpY3zN4$default3, (Function1) objRememberedValue3);
                ButtonColors buttonColorsI3 = i(jc2Var, z5, composerStartRestartGroup, (i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                ButtonScale buttonScaleL3 = l(1.05f);
                ButtonGlow buttonGlowA3 = el0.a(u61Var3);
                ButtonBorder buttonBorderH3 = h(composerStartRestartGroup);
                ButtonShape buttonShapeShape$default3 = ButtonDefaults.shape$default(ButtonDefaults.INSTANCE, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium(), null, null, null, null, 30, null);
                PaddingValues paddingValuesM993PaddingValuesYgX7TsA3 = PaddingKt.m993PaddingValuesYgX7TsA(fM7813constructorimpl, fM7813constructorimpl2);
                Function3 function9 = new Function3() { // from class: fc2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Composer composer3 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((RowScope) obj).getClass();
                        if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1538912459, iIntValue, -1, "com.dh.myembyapp.ui.theme.TvButton.<anonymous> (TvButton.kt:399)");
                            }
                            FontWeight medium = FontWeight.INSTANCE.getMedium();
                            int iM7703getCentere0LSkKk = TextAlign.INSTANCE.m7703getCentere0LSkKk();
                            int iM7761getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8();
                            TextKt.m3048TextNvy7gAk(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), hc2.k(jc2Var, ((Boolean) mutableState.getValue()).booleanValue(), z5, composer3, 0, 0), null, j, null, medium, null, 0L, null, TextAlign.m7696boximpl(iM7703getCentere0LSkKk), 0L, iM7761getEllipsisgIe3tQ8, false, 1, 0, null, null, composer3, 1572912, 24960, 240552);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                };
                boolean z15 = z5;
                composer2 = composerStartRestartGroup;
                ButtonKt.m8231ButtonTCVpFMg(function8, modifierOnFocusChanged3, null, false, buttonScaleL3, buttonGlowA3, buttonShapeShape$default3, buttonColorsI3, 0.0f, buttonBorderH3, paddingValuesM993PaddingValuesYgX7TsA3, null, ComposableLambdaKt.rememberComposableLambda(1538912459, true, function9, composerStartRestartGroup, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 2316);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM7813constructorimpl;
                z4 = z15;
                f4 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                z4 = z2;
                f4 = f2;
            }
            function2 = function1;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new tr1(str, function0, modifier, jc2Var, z4, function2, j, f3, f4, i, i2));
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changed(j)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 256;
        if (i8 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed(f2)) {
                i9 = 67108864;
            } else {
                i9 = GroupFlagsKt.HasAuxSlotFlag;
            }
            i3 |= i9;
        }
        if ((i3 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i12 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i4 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            if (i6 != 0) {
                fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
            } else {
                fM7813constructorimpl = f3;
            }
            if (i8 != 0) {
                fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
            } else {
                fM7813constructorimpl2 = f2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1052169403, i3, -1, "com.dh.myembyapp.ui.theme.TvButton (TvButton.kt:370)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var4 = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            if ((57344 & i3) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i3 & Input.Keys.FORWARD_DEL) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z16 = z6 | z7;
            if ((458752 & i3) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z16 | z8;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z9) {
                i10 = 1;
                objRememberedValue2 = new w60(z5, function0, function3, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i10 = 1;
                objRememberedValue2 = new w60(z5, function0, function3, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function10 = (Function0) objRememberedValue2;
            function1 = function3;
            Modifier modifierM1049defaultMinSizeVpY3zN4$default4 = SizeKt.m1049defaultMinSizeVpY3zN4$default(modifier, 0.0f, Dp.m7813constructorimpl(56.0f), i10, null);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new b42(12, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged4 = FocusChangedModifierKt.onFocusChanged(modifierM1049defaultMinSizeVpY3zN4$default4, (Function1) objRememberedValue3);
            ButtonColors buttonColorsI4 = i(jc2Var, z5, composerStartRestartGroup, (i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT, 0);
            ButtonScale buttonScaleL4 = l(1.05f);
            ButtonGlow buttonGlowA4 = el0.a(u61Var4);
            ButtonBorder buttonBorderH4 = h(composerStartRestartGroup);
            ButtonShape buttonShapeShape$default4 = ButtonDefaults.shape$default(ButtonDefaults.INSTANCE, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium(), null, null, null, null, 30, null);
            PaddingValues paddingValuesM993PaddingValuesYgX7TsA4 = PaddingKt.m993PaddingValuesYgX7TsA(fM7813constructorimpl, fM7813constructorimpl2);
            Function3 function11 = new Function3() { // from class: fc2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((RowScope) obj).getClass();
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1538912459, iIntValue, -1, "com.dh.myembyapp.ui.theme.TvButton.<anonymous> (TvButton.kt:399)");
                        }
                        FontWeight medium = FontWeight.INSTANCE.getMedium();
                        int iM7703getCentere0LSkKk = TextAlign.INSTANCE.m7703getCentere0LSkKk();
                        int iM7761getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8();
                        TextKt.m3048TextNvy7gAk(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), hc2.k(jc2Var, ((Boolean) mutableState.getValue()).booleanValue(), z5, composer3, 0, 0), null, j, null, medium, null, 0L, null, TextAlign.m7696boximpl(iM7703getCentere0LSkKk), 0L, iM7761getEllipsisgIe3tQ8, false, 1, 0, null, null, composer3, 1572912, 24960, 240552);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            boolean z17 = z5;
            composer2 = composerStartRestartGroup;
            ButtonKt.m8231ButtonTCVpFMg(function10, modifierOnFocusChanged4, null, false, buttonScaleL4, buttonGlowA4, buttonShapeShape$default4, buttonColorsI4, 0.0f, buttonBorderH4, paddingValuesM993PaddingValuesYgX7TsA4, null, ComposableLambdaKt.rememberComposableLambda(1538912459, true, function11, composerStartRestartGroup, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 2316);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = fM7813constructorimpl;
            z4 = z17;
            f4 = fM7813constructorimpl2;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z4 = z2;
            f4 = f2;
        }
        function2 = function1;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tr1(str, function0, modifier, jc2Var, z4, function2, j, f3, f4, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0139  */
    /* JADX WARN: Code duplicated, block: B:95:0x0144  */
    /* JADX WARN: Code duplicated, block: B:98:0x0152  */
    public static final void b(String str, Function0 function0, Modifier modifier, boolean z, long j, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        long j2;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        float f4;
        int i9;
        boolean z3;
        Composer composer2;
        long j3;
        float f5;
        float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z4;
        long sp;
        float fM7813constructorimpl;
        float fM7813constructorimpl2;
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1009409177);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        f3 = f;
                        if (composerStartRestartGroup.changed(f3)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            f4 = f2;
                            if (composerStartRestartGroup.changed(f4)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 599187) != 599186) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                            if (i10 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i4 != 0) {
                                sp = TextUnitKt.getSp(22);
                            } else {
                                sp = j2;
                            }
                            if (i6 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                            } else {
                                fM7813constructorimpl = f3;
                            }
                            if (i8 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                            } else {
                                fM7813constructorimpl2 = f4;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                            }
                            jc2 jc2Var = jc2.c;
                            int i11 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                            int i12 = i3 << 6;
                            composer2 = composerStartRestartGroup;
                            a(str, function0, modifier, jc2Var, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11 | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z2 = z4;
                            j3 = sp;
                            f5 = fM7813constructorimpl;
                            f6 = fM7813constructorimpl2;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            j3 = j2;
                            f5 = f3;
                            f6 = f4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                        }
                    }
                    i3 |= 1572864;
                    f4 = f2;
                    if ((i3 & 599187) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j2;
                        }
                        if (i6 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f3;
                        }
                        if (i8 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f4;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                        }
                        jc2 jc2Var2 = jc2.c;
                        int i13 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                        int i14 = i3 << 6;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier, jc2Var2, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i13 | (3670016 & i14) | (29360128 & i14) | (i14 & 234881024), 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z2 = z4;
                        j3 = sp;
                        f5 = fM7813constructorimpl;
                        f6 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        j3 = j2;
                        f5 = f3;
                        f6 = f4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f3 = f;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        f4 = f2;
                        if (composerStartRestartGroup.changed(f4)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 599187) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j2;
                        }
                        if (i6 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f3;
                        }
                        if (i8 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f4;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                        }
                        jc2 jc2Var3 = jc2.c;
                        int i15 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                        int i16 = i3 << 6;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier, jc2Var3, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i15 | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024), 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z2 = z4;
                        j3 = sp;
                        f5 = fM7813constructorimpl;
                        f6 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        j3 = j2;
                        f5 = f3;
                        f6 = f4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                f4 = f2;
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                    }
                    jc2 jc2Var4 = jc2.c;
                    int i17 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                    int i18 = i3 << 6;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier, jc2Var4, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i17 | (3670016 & i18) | (29360128 & i18) | (i18 & 234881024), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z4;
                    j3 = sp;
                    f5 = fM7813constructorimpl;
                    f6 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    j3 = j2;
                    f5 = f3;
                    f6 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                }
            }
            i3 |= 24576;
            j2 = j;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    f3 = f;
                    if (composerStartRestartGroup.changed(f3)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        f4 = f2;
                        if (composerStartRestartGroup.changed(f4)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 599187) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j2;
                        }
                        if (i6 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f3;
                        }
                        if (i8 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f4;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                        }
                        jc2 jc2Var5 = jc2.c;
                        int i19 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                        int i110 = i3 << 6;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier, jc2Var5, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i19 | (3670016 & i110) | (29360128 & i110) | (i110 & 234881024), 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z2 = z4;
                        j3 = sp;
                        f5 = fM7813constructorimpl;
                        f6 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        j3 = j2;
                        f5 = f3;
                        f6 = f4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                f4 = f2;
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                    }
                    jc2 jc2Var6 = jc2.c;
                    int i111 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                    int i112 = i3 << 6;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier, jc2Var6, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i111 | (3670016 & i112) | (29360128 & i112) | (i112 & 234881024), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z4;
                    j3 = sp;
                    f5 = fM7813constructorimpl;
                    f6 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    j3 = j2;
                    f5 = f3;
                    f6 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            f3 = f;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    f4 = f2;
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                    }
                    jc2 jc2Var7 = jc2.c;
                    int i113 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                    int i114 = i3 << 6;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier, jc2Var7, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i113 | (3670016 & i114) | (29360128 & i114) | (i114 & 234881024), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z4;
                    j3 = sp;
                    f5 = fM7813constructorimpl;
                    f6 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    j3 = j2;
                    f5 = f3;
                    f6 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                }
            }
            i3 |= 1572864;
            f4 = f2;
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(22);
                } else {
                    sp = j2;
                }
                if (i6 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                }
                jc2 jc2Var8 = jc2.c;
                int i115 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                int i116 = i3 << 6;
                composer2 = composerStartRestartGroup;
                a(str, function0, modifier, jc2Var8, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i115 | (3670016 & i116) | (29360128 & i116) | (i116 & 234881024), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z4;
                j3 = sp;
                f5 = fM7813constructorimpl;
                f6 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                j3 = j2;
                f5 = f3;
                f6 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
            }
        }
        i3 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    f3 = f;
                    if (composerStartRestartGroup.changed(f3)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        f4 = f2;
                        if (composerStartRestartGroup.changed(f4)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 599187) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i4 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j2;
                        }
                        if (i6 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f3;
                        }
                        if (i8 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f4;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                        }
                        jc2 jc2Var9 = jc2.c;
                        int i117 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                        int i118 = i3 << 6;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier, jc2Var9, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i117 | (3670016 & i118) | (29360128 & i118) | (i118 & 234881024), 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z2 = z4;
                        j3 = sp;
                        f5 = fM7813constructorimpl;
                        f6 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        j3 = j2;
                        f5 = f3;
                        f6 = f4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                    }
                }
                i3 |= 1572864;
                f4 = f2;
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                    }
                    jc2 jc2Var10 = jc2.c;
                    int i119 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                    int i1110 = i3 << 6;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier, jc2Var10, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i119 | (3670016 & i1110) | (29360128 & i1110) | (i1110 & 234881024), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z4;
                    j3 = sp;
                    f5 = fM7813constructorimpl;
                    f6 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    j3 = j2;
                    f5 = f3;
                    f6 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            f3 = f;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    f4 = f2;
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                    }
                    jc2 jc2Var11 = jc2.c;
                    int i1111 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                    int i1112 = i3 << 6;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier, jc2Var11, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1111 | (3670016 & i1112) | (29360128 & i1112) | (i1112 & 234881024), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z4;
                    j3 = sp;
                    f5 = fM7813constructorimpl;
                    f6 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    j3 = j2;
                    f5 = f3;
                    f6 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                }
            }
            i3 |= 1572864;
            f4 = f2;
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(22);
                } else {
                    sp = j2;
                }
                if (i6 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                }
                jc2 jc2Var12 = jc2.c;
                int i1113 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                int i1114 = i3 << 6;
                composer2 = composerStartRestartGroup;
                a(str, function0, modifier, jc2Var12, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1113 | (3670016 & i1114) | (29360128 & i1114) | (i1114 & 234881024), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z4;
                j3 = sp;
                f5 = fM7813constructorimpl;
                f6 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                j3 = j2;
                f5 = f3;
                f6 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
            }
        }
        i3 |= 24576;
        j2 = j;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                f3 = f;
                if (composerStartRestartGroup.changed(f3)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    f4 = f2;
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i3 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j2;
                    }
                    if (i6 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                    }
                    jc2 jc2Var13 = jc2.c;
                    int i1115 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                    int i1116 = i3 << 6;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier, jc2Var13, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1115 | (3670016 & i1116) | (29360128 & i1116) | (i1116 & 234881024), 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z4;
                    j3 = sp;
                    f5 = fM7813constructorimpl;
                    f6 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    j3 = j2;
                    f5 = f3;
                    f6 = f4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
                }
            }
            i3 |= 1572864;
            f4 = f2;
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(22);
                } else {
                    sp = j2;
                }
                if (i6 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                }
                jc2 jc2Var14 = jc2.c;
                int i1117 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                int i1118 = i3 << 6;
                composer2 = composerStartRestartGroup;
                a(str, function0, modifier, jc2Var14, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1117 | (3670016 & i1118) | (29360128 & i1118) | (i1118 & 234881024), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z4;
                j3 = sp;
                f5 = fM7813constructorimpl;
                f6 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                j3 = j2;
                f5 = f3;
                f6 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        f3 = f;
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((1572864 & i) == 0) {
                f4 = f2;
                if (composerStartRestartGroup.changed(f4)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i3 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    sp = TextUnitKt.getSp(22);
                } else {
                    sp = j2;
                }
                if (i6 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
                }
                jc2 jc2Var15 = jc2.c;
                int i1119 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
                int i11110 = i3 << 6;
                composer2 = composerStartRestartGroup;
                a(str, function0, modifier, jc2Var15, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1119 | (3670016 & i11110) | (29360128 & i11110) | (i11110 & 234881024), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z4;
                j3 = sp;
                f5 = fM7813constructorimpl;
                f6 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                j3 = j2;
                f5 = f3;
                f6 = f4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
            }
        }
        i3 |= 1572864;
        f4 = f2;
        if ((i3 & 599187) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i10 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (i4 != 0) {
                sp = TextUnitKt.getSp(22);
            } else {
                sp = j2;
            }
            if (i6 != 0) {
                fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
            } else {
                fM7813constructorimpl = f3;
            }
            if (i8 != 0) {
                fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
            } else {
                fM7813constructorimpl2 = f4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009409177, i3, -1, "com.dh.myembyapp.ui.theme.TvCancelButton (TvButton.kt:480)");
            }
            jc2 jc2Var16 = jc2.c;
            int i11111 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
            int i11112 = i3 << 6;
            composer2 = composerStartRestartGroup;
            a(str, function0, modifier, jc2Var16, z4, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11111 | (3670016 & i11112) | (29360128 & i11112) | (i11112 & 234881024), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z4;
            j3 = sp;
            f5 = fM7813constructorimpl;
            f6 = fM7813constructorimpl2;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            j3 = j2;
            f5 = f3;
            f6 = f4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j3, f5, f6, i, i2, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0119  */
    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0181  */
    /* JADX WARN: Code duplicated, block: B:115:0x0190  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0114  */
    public static final void c(String str, Function0 function0, Modifier modifier, boolean z, Function0 function1, long j, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Function0 function2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        Composer composer2;
        float f3;
        Modifier modifier3;
        boolean z4;
        Function0 function3;
        long j2;
        float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        boolean z5;
        Function0 function4;
        long sp;
        float fM7813constructorimpl;
        float fM7813constructorimpl2;
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1862864907);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function2 = function1;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            if (composerStartRestartGroup.changed(j)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
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
                            if ((i3 & 4793491) != 4793490) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                                if (i14 != 0) {
                                    modifier4 = Modifier.INSTANCE;
                                } else {
                                    modifier4 = modifier2;
                                }
                                if (i4 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = z2;
                                }
                                if (i6 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i8 != 0) {
                                    sp = TextUnitKt.getSp(22);
                                } else {
                                    sp = j;
                                }
                                if (i10 != 0) {
                                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                                } else {
                                    fM7813constructorimpl = f;
                                }
                                if (i12 != 0) {
                                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                                } else {
                                    fM7813constructorimpl2 = f2;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                                }
                                jc2 jc2Var = jc2.b;
                                int i15 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                                int i16 = i3 << 3;
                                composer2 = composerStartRestartGroup;
                                a(str, function0, modifier4, jc2Var, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i15 | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z4 = z5;
                                function3 = function4;
                                j2 = sp;
                                f4 = fM7813constructorimpl;
                                f3 = fM7813constructorimpl2;
                            } else {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                f3 = f2;
                                modifier3 = modifier2;
                                z4 = z2;
                                function3 = function2;
                                j2 = j;
                                f4 = f;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                            }
                        }
                        i3 |= 12582912;
                        if ((i3 & 4793491) != 4793490) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                            if (i14 != 0) {
                                modifier4 = Modifier.INSTANCE;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i4 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i8 != 0) {
                                sp = TextUnitKt.getSp(22);
                            } else {
                                sp = j;
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                            }
                            jc2 jc2Var2 = jc2.b;
                            int i17 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                            int i18 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            a(str, function0, modifier4, jc2Var2, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i17 | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (i18 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z5;
                            function3 = function4;
                            j2 = sp;
                            f4 = fM7813constructorimpl;
                            f3 = fM7813constructorimpl2;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f3 = f2;
                            modifier3 = modifier2;
                            z4 = z2;
                            function3 = function2;
                            j2 = j;
                            f4 = f;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                        }
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                        if ((i3 & 4793491) != 4793490) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                            if (i14 != 0) {
                                modifier4 = Modifier.INSTANCE;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i4 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i8 != 0) {
                                sp = TextUnitKt.getSp(22);
                            } else {
                                sp = j;
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                            }
                            jc2 jc2Var3 = jc2.b;
                            int i19 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                            int i110 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            a(str, function0, modifier4, jc2Var3, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i19 | (57344 & i110) | (458752 & i110) | (3670016 & i110) | (29360128 & i110) | (i110 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z5;
                            function3 = function4;
                            j2 = sp;
                            f4 = fM7813constructorimpl;
                            f3 = fM7813constructorimpl2;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f3 = f2;
                            modifier3 = modifier2;
                            z4 = z2;
                            function3 = function2;
                            j2 = j;
                            f4 = f;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var4 = jc2.b;
                        int i111 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i112 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var4, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i111 | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (29360128 & i112) | (i112 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= 24576;
                function2 = function1;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (composerStartRestartGroup.changed(j)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
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
                        if ((i3 & 4793491) != 4793490) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                            if (i14 != 0) {
                                modifier4 = Modifier.INSTANCE;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i4 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i8 != 0) {
                                sp = TextUnitKt.getSp(22);
                            } else {
                                sp = j;
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                            }
                            jc2 jc2Var5 = jc2.b;
                            int i113 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                            int i114 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            a(str, function0, modifier4, jc2Var5, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i113 | (57344 & i114) | (458752 & i114) | (3670016 & i114) | (29360128 & i114) | (i114 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z5;
                            function3 = function4;
                            j2 = sp;
                            f4 = fM7813constructorimpl;
                            f3 = fM7813constructorimpl2;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f3 = f2;
                            modifier3 = modifier2;
                            z4 = z2;
                            function3 = function2;
                            j2 = j;
                            f4 = f;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var6 = jc2.b;
                        int i115 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i116 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var6, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i115 | (57344 & i116) | (458752 & i116) | (3670016 & i116) | (29360128 & i116) | (i116 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var7 = jc2.b;
                        int i117 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i118 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var7, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i117 | (57344 & i118) | (458752 & i118) | (3670016 & i118) | (29360128 & i118) | (i118 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var8 = jc2.b;
                    int i119 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i1110 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var8, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i119 | (57344 & i1110) | (458752 & i1110) | (3670016 & i1110) | (29360128 & i1110) | (i1110 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= 3072;
            z2 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (composerStartRestartGroup.changed(j)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
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
                        if ((i3 & 4793491) != 4793490) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                            if (i14 != 0) {
                                modifier4 = Modifier.INSTANCE;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i4 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i8 != 0) {
                                sp = TextUnitKt.getSp(22);
                            } else {
                                sp = j;
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                            }
                            jc2 jc2Var9 = jc2.b;
                            int i1111 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                            int i1112 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            a(str, function0, modifier4, jc2Var9, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1111 | (57344 & i1112) | (458752 & i1112) | (3670016 & i1112) | (29360128 & i1112) | (i1112 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z5;
                            function3 = function4;
                            j2 = sp;
                            f4 = fM7813constructorimpl;
                            f3 = fM7813constructorimpl2;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f3 = f2;
                            modifier3 = modifier2;
                            z4 = z2;
                            function3 = function2;
                            j2 = j;
                            f4 = f;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var10 = jc2.b;
                        int i1113 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i1114 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var10, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1113 | (57344 & i1114) | (458752 & i1114) | (3670016 & i1114) | (29360128 & i1114) | (i1114 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var11 = jc2.b;
                        int i1115 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i1116 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var11, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1115 | (57344 & i1116) | (458752 & i1116) | (3670016 & i1116) | (29360128 & i1116) | (i1116 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var12 = jc2.b;
                    int i1117 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i1118 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var12, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1117 | (57344 & i1118) | (458752 & i1118) | (3670016 & i1118) | (29360128 & i1118) | (i1118 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= 24576;
            function2 = function1;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (composerStartRestartGroup.changed(j)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
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
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var13 = jc2.b;
                        int i1119 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i11110 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var13, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1119 | (57344 & i11110) | (458752 & i11110) | (3670016 & i11110) | (29360128 & i11110) | (i11110 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var14 = jc2.b;
                    int i11111 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i11112 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var14, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11111 | (57344 & i11112) | (458752 & i11112) | (3670016 & i11112) | (29360128 & i11112) | (i11112 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var15 = jc2.b;
                    int i11113 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i11114 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var15, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11113 | (57344 & i11114) | (458752 & i11114) | (3670016 & i11114) | (29360128 & i11114) | (i11114 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i14 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 != 0) {
                    sp = TextUnitKt.getSp(22);
                } else {
                    sp = j;
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                }
                jc2 jc2Var16 = jc2.b;
                int i11115 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                int i11116 = i3 << 3;
                composer2 = composerStartRestartGroup;
                a(str, function0, modifier4, jc2Var16, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11115 | (57344 & i11116) | (458752 & i11116) | (3670016 & i11116) | (29360128 & i11116) | (i11116 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z4 = z5;
                function3 = function4;
                j2 = sp;
                f4 = fM7813constructorimpl;
                f3 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f3 = f2;
                modifier3 = modifier2;
                z4 = z2;
                function3 = function2;
                j2 = j;
                f4 = f;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
            }
        }
        i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (composerStartRestartGroup.changed(j)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
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
                        if ((i3 & 4793491) != 4793490) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                            if (i14 != 0) {
                                modifier4 = Modifier.INSTANCE;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i4 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i6 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i8 != 0) {
                                sp = TextUnitKt.getSp(22);
                            } else {
                                sp = j;
                            }
                            if (i10 != 0) {
                                fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                            } else {
                                fM7813constructorimpl = f;
                            }
                            if (i12 != 0) {
                                fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                            } else {
                                fM7813constructorimpl2 = f2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                            }
                            jc2 jc2Var17 = jc2.b;
                            int i11117 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                            int i11118 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            a(str, function0, modifier4, jc2Var17, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11117 | (57344 & i11118) | (458752 & i11118) | (3670016 & i11118) | (29360128 & i11118) | (i11118 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z5;
                            function3 = function4;
                            j2 = sp;
                            f4 = fM7813constructorimpl;
                            f3 = fM7813constructorimpl2;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            f3 = f2;
                            modifier3 = modifier2;
                            z4 = z2;
                            function3 = function2;
                            j2 = j;
                            f4 = f;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var18 = jc2.b;
                        int i11119 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i111110 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var18, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11119 | (57344 & i111110) | (458752 & i111110) | (3670016 & i111110) | (29360128 & i111110) | (i111110 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var19 = jc2.b;
                        int i111111 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i111112 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var19, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i111111 | (57344 & i111112) | (458752 & i111112) | (3670016 & i111112) | (29360128 & i111112) | (i111112 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var110 = jc2.b;
                    int i111113 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i111114 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var110, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i111113 | (57344 & i111114) | (458752 & i111114) | (3670016 & i111114) | (29360128 & i111114) | (i111114 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= 24576;
            function2 = function1;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (composerStartRestartGroup.changed(j)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
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
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var111 = jc2.b;
                        int i111115 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i111116 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var111, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i111115 | (57344 & i111116) | (458752 & i111116) | (3670016 & i111116) | (29360128 & i111116) | (i111116 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var112 = jc2.b;
                    int i111117 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i111118 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var112, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i111117 | (57344 & i111118) | (458752 & i111118) | (3670016 & i111118) | (29360128 & i111118) | (i111118 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var113 = jc2.b;
                    int i111119 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i1111110 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var113, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i111119 | (57344 & i1111110) | (458752 & i1111110) | (3670016 & i1111110) | (29360128 & i1111110) | (i1111110 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i14 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 != 0) {
                    sp = TextUnitKt.getSp(22);
                } else {
                    sp = j;
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                }
                jc2 jc2Var114 = jc2.b;
                int i1111111 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                int i1111112 = i3 << 3;
                composer2 = composerStartRestartGroup;
                a(str, function0, modifier4, jc2Var114, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1111111 | (57344 & i1111112) | (458752 & i1111112) | (3670016 & i1111112) | (29360128 & i1111112) | (i1111112 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z4 = z5;
                function3 = function4;
                j2 = sp;
                f4 = fM7813constructorimpl;
                f3 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f3 = f2;
                modifier3 = modifier2;
                z4 = z2;
                function3 = function2;
                j2 = j;
                f4 = f;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
            }
        }
        i3 |= 3072;
        z2 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (composerStartRestartGroup.changed(j)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
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
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                        if (i14 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i8 != 0) {
                            sp = TextUnitKt.getSp(22);
                        } else {
                            sp = j;
                        }
                        if (i10 != 0) {
                            fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                        } else {
                            fM7813constructorimpl = f;
                        }
                        if (i12 != 0) {
                            fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                        } else {
                            fM7813constructorimpl2 = f2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                        }
                        jc2 jc2Var115 = jc2.b;
                        int i1111113 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                        int i1111114 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        a(str, function0, modifier4, jc2Var115, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1111113 | (57344 & i1111114) | (458752 & i1111114) | (3670016 & i1111114) | (29360128 & i1111114) | (i1111114 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                        function3 = function4;
                        j2 = sp;
                        f4 = fM7813constructorimpl;
                        f3 = fM7813constructorimpl2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        f3 = f2;
                        modifier3 = modifier2;
                        z4 = z2;
                        function3 = function2;
                        j2 = j;
                        f4 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var116 = jc2.b;
                    int i1111115 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i1111116 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var116, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1111115 | (57344 & i1111116) | (458752 & i1111116) | (3670016 & i1111116) | (29360128 & i1111116) | (i1111116 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var117 = jc2.b;
                    int i1111117 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i1111118 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var117, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1111117 | (57344 & i1111118) | (458752 & i1111118) | (3670016 & i1111118) | (29360128 & i1111118) | (i1111118 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i14 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 != 0) {
                    sp = TextUnitKt.getSp(22);
                } else {
                    sp = j;
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                }
                jc2 jc2Var118 = jc2.b;
                int i1111119 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                int i11111110 = i3 << 3;
                composer2 = composerStartRestartGroup;
                a(str, function0, modifier4, jc2Var118, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i1111119 | (57344 & i11111110) | (458752 & i11111110) | (3670016 & i11111110) | (29360128 & i11111110) | (i11111110 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z4 = z5;
                function3 = function4;
                j2 = sp;
                f4 = fM7813constructorimpl;
                f3 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f3 = f2;
                modifier3 = modifier2;
                z4 = z2;
                function3 = function2;
                j2 = j;
                f4 = f;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
            }
        }
        i3 |= 24576;
        function2 = function1;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
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
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i14 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i8 != 0) {
                        sp = TextUnitKt.getSp(22);
                    } else {
                        sp = j;
                    }
                    if (i10 != 0) {
                        fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                    } else {
                        fM7813constructorimpl = f;
                    }
                    if (i12 != 0) {
                        fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                    } else {
                        fM7813constructorimpl2 = f2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                    }
                    jc2 jc2Var119 = jc2.b;
                    int i11111111 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                    int i11111112 = i3 << 3;
                    composer2 = composerStartRestartGroup;
                    a(str, function0, modifier4, jc2Var119, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11111111 | (57344 & i11111112) | (458752 & i11111112) | (3670016 & i11111112) | (29360128 & i11111112) | (i11111112 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z4 = z5;
                    function3 = function4;
                    j2 = sp;
                    f4 = fM7813constructorimpl;
                    f3 = fM7813constructorimpl2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    z4 = z2;
                    function3 = function2;
                    j2 = j;
                    f4 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i14 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 != 0) {
                    sp = TextUnitKt.getSp(22);
                } else {
                    sp = j;
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                }
                jc2 jc2Var1110 = jc2.b;
                int i11111113 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                int i11111114 = i3 << 3;
                composer2 = composerStartRestartGroup;
                a(str, function0, modifier4, jc2Var1110, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11111113 | (57344 & i11111114) | (458752 & i11111114) | (3670016 & i11111114) | (29360128 & i11111114) | (i11111114 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z4 = z5;
                function3 = function4;
                j2 = sp;
                f4 = fM7813constructorimpl;
                f3 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f3 = f2;
                modifier3 = modifier2;
                z4 = z2;
                function3 = function2;
                j2 = j;
                f4 = f;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i14 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i8 != 0) {
                    sp = TextUnitKt.getSp(22);
                } else {
                    sp = j;
                }
                if (i10 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i12 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl2 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
                }
                jc2 jc2Var1111 = jc2.b;
                int i11111115 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
                int i11111116 = i3 << 3;
                composer2 = composerStartRestartGroup;
                a(str, function0, modifier4, jc2Var1111, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11111115 | (57344 & i11111116) | (458752 & i11111116) | (3670016 & i11111116) | (29360128 & i11111116) | (i11111116 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z4 = z5;
                function3 = function4;
                j2 = sp;
                f4 = fM7813constructorimpl;
                f3 = fM7813constructorimpl2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                f3 = f2;
                modifier3 = modifier2;
                z4 = z2;
                function3 = function2;
                j2 = j;
                f4 = f;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
            }
        }
        i3 |= 12582912;
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i14 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i6 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i8 != 0) {
                sp = TextUnitKt.getSp(22);
            } else {
                sp = j;
            }
            if (i10 != 0) {
                fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
            } else {
                fM7813constructorimpl = f;
            }
            if (i12 != 0) {
                fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
            } else {
                fM7813constructorimpl2 = f2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862864907, i3, -1, "com.dh.myembyapp.ui.theme.TvConfirmButton (TvButton.kt:454)");
            }
            jc2 jc2Var1112 = jc2.b;
            int i11111117 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896);
            int i11111118 = i3 << 3;
            composer2 = composerStartRestartGroup;
            a(str, function0, modifier4, jc2Var1112, z5, function4, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i11111117 | (57344 & i11111118) | (458752 & i11111118) | (3670016 & i11111118) | (29360128 & i11111118) | (i11111118 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            z4 = z5;
            function3 = function4;
            j2 = sp;
            f4 = fM7813constructorimpl;
            f3 = fM7813constructorimpl2;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            f3 = f2;
            modifier3 = modifier2;
            z4 = z2;
            function3 = function2;
            j2 = j;
            f4 = f;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier3, z4, function3, j2, f4, f3, i, i2, 1));
        }
    }

    public static final void d(String str, Function0 function0, Modifier modifier, boolean z, long j, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        long j2;
        Composer composer2;
        boolean z2;
        float f3;
        float f4;
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1577066390);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 = i3 | 27648;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
            }
        }
        int i6 = 1769472 | i4;
        if (composerStartRestartGroup.shouldExecute((599187 & i6) != 599186, i6 & 1)) {
            long sp = i5 != 0 ? TextUnitKt.getSp(22) : j2;
            float fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
            float fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1577066390, i6, -1, "com.dh.myembyapp.ui.theme.TvDeleteButton (TvButton.kt:505)");
            }
            jc2 jc2Var = jc2.e;
            int i7 = (i6 & 14) | 3072 | (i6 & Input.Keys.FORWARD_DEL) | (i6 & 896) | ((i6 << 3) & 57344);
            int i8 = i6 << 6;
            composer2 = composerStartRestartGroup;
            a(str, function0, modifier, jc2Var, true, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i7 | (3670016 & i8) | (29360128 & i8) | (i8 & 234881024), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = true;
            j2 = sp;
            f3 = fM7813constructorimpl;
            f4 = fM7813constructorimpl2;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z2 = z;
            f3 = f;
            f4 = f2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ec2(str, function0, modifier, z2, j2, f3, f4, i, i2, 1));
        }
    }

    public static final void e(final String str, final Function0 function0, final Modifier modifier, boolean z, long j, float f, float f2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final boolean z2;
        final long j2;
        final float f3;
        final float f4;
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1283268291);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i3 = i2 | 1797120;
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            long sp = TextUnitKt.getSp(22);
            float fM7813constructorimpl = Dp.m7813constructorimpl(20.0f);
            float fM7813constructorimpl2 = Dp.m7813constructorimpl(10.0f);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1283268291, i3, -1, "com.dh.myembyapp.ui.theme.TvListButton (TvButton.kt:428)");
            }
            jc2 jc2Var = jc2.a;
            int i4 = (i3 & 14) | 3072 | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344);
            int i5 = i3 << 6;
            composer2 = composerStartRestartGroup;
            a(str, function0, modifier, jc2Var, true, null, sp, fM7813constructorimpl, fM7813constructorimpl2, composer2, i4 | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = true;
            j2 = sp;
            f3 = fM7813constructorimpl;
            f4 = fM7813constructorimpl2;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z2 = z;
            j2 = j;
            f3 = f;
            f4 = f2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gc2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hc2.e(str, function0, modifier, z2, j2, f3, f4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final boolean f(jc2 jc2Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-920451274, i, -1, "com.dh.myembyapp.ui.theme.shouldUseInvertedFocusedButtonColors (TvButton.kt:112)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(n72.g)).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        boolean z = (zBooleanValue || jc2Var == jc2.g) ? false : true;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }

    public static final long g(int i, Composer composer, int i2) {
        composer.startReplaceGroup(988140525);
        boolean z = (i2 & 1) == 0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988140525, i, -1, "com.dh.myembyapp.ui.theme.tvAccentFillColor (TvButton.kt:156)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i3 = MaterialTheme.$stable;
        long primary = materialTheme.getColorScheme(composer, i3).getPrimary();
        long primaryContainer = materialTheme.getColorScheme(composer, i3).getPrimaryContainer();
        if (ColorKt.m5204luminance8_81llA(materialTheme.getColorScheme(composer, i3).getSurface()) <= 0.5f) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return primary;
        }
        long jM5203lerpjxsXWHM = ColorKt.m5203lerpjxsXWHM(primary, primaryContainer, z ? 0.3f : 0.4f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM5203lerpjxsXWHM;
    }

    public static final ButtonBorder h(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-569326880, 0, -1, "com.dh.myembyapp.ui.theme.tvButtonBorder (TvButton.kt:339)");
        }
        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
        float fM7813constructorimpl = Dp.m7813constructorimpl(2.0f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
        }
        u61 u61Var = (u61) composer.consume(n72.b);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(fM7813constructorimpl, u61Var.b), 0.0f, null, 6, null), null, null, null, composer, ButtonDefaults.$stable << 15, 29);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonBorderBorder;
    }

    public static final ButtonColors i(jc2 jc2Var, boolean z, Composer composer, int i, int i2) {
        long jM5151copywmQWz5c$default;
        jc2Var.getClass();
        boolean z2 = (i2 & 2) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800020862, i, -1, "com.dh.myembyapp.ui.theme.tvButtonColors (TvButton.kt:136)");
        }
        composer.startReplaceGroup(-20898527);
        int i3 = i & 14;
        ic2 ic2VarJ = j(jc2Var, composer, i3);
        boolean zF = f(jc2Var, composer, i3);
        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
        long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(ic2VarJ.a, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        long jM5151copywmQWz5c$default3 = Color.m5151copywmQWz5c$default(zF ? a : ic2VarJ.b, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        long jM5151copywmQWz5c$default4 = Color.m5151copywmQWz5c$default(ic2VarJ.c, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        if (zF) {
            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(b, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM5151copywmQWz5c$default = ic2VarJ.c;
        }
        ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(jM5151copywmQWz5c$default2, jM5151copywmQWz5c$default4, jM5151copywmQWz5c$default3, jM5151copywmQWz5c$default, 0L, 0L, 0L, 0L, composer, ButtonDefaults.$stable << 24, PsExtractor.VIDEO_STREAM_MASK);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM8228colorsoq7We08;
    }

    public static final ic2 j(jc2 jc2Var, Composer composer, int i) {
        ic2 ic2Var;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1624068210, i, -1, "com.dh.myembyapp.ui.theme.tvButtonPalette (TvButton.kt:75)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
        }
        u61 u61Var = (u61) composer.consume(n72.b);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        int iOrdinal = jc2Var.ordinal();
        if (iOrdinal == 0) {
            ic2Var = new ic2(u61Var.e, u61Var.f, u61Var.g);
        } else if (iOrdinal == 1) {
            ic2Var = new ic2(u61Var.h, u61Var.i, u61Var.j);
        } else if (iOrdinal == 2) {
            ic2Var = new ic2(u61Var.k, u61Var.l, u61Var.m);
        } else if (iOrdinal == 3) {
            ic2Var = new ic2(u61Var.n, u61Var.o, u61Var.p);
        } else if (iOrdinal == 4) {
            ic2Var = new ic2(u61Var.q, u61Var.r, u61Var.s);
        } else {
            if (iOrdinal != 5) {
                qu.f();
                return null;
            }
            ic2Var = new ic2(u61Var.t, u61Var.u, u61Var.v);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ic2Var;
    }

    public static final long k(jc2 jc2Var, boolean z, boolean z2, Composer composer, int i, int i2) {
        boolean zF;
        jc2Var.getClass();
        boolean z3 = (i2 & 4) != 0 ? true : z2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1878236439, i, -1, "com.dh.myembyapp.ui.theme.tvButtonResolvedContentColor (TvButton.kt:122)");
        }
        int i3 = i & 14;
        long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(j(jc2Var, composer, i3).c, z3 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        if (z) {
            composer.startReplaceGroup(-1098945837);
            zF = f(jc2Var, composer, i3);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(292418658);
            composer.endReplaceGroup();
            zF = false;
        }
        if (zF) {
            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(b, z3 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM5151copywmQWz5c$default;
    }

    public static final ButtonScale l(float f) {
        return ButtonDefaults.scale$default(ButtonDefaults.INSTANCE, 0.0f, f, 0.0f, 0.0f, 0.0f, 29, null);
    }

    public static final ButtonColors m(boolean z, Composer composer, int i) {
        boolean z2 = (i & 1) == 0 ? z : true;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2115235259, 0, -1, "com.dh.myembyapp.ui.theme.tvImmersiveActionButtonColors (TvButton.kt:287)");
        }
        ButtonColors buttonColorsM8228colorsoq7We08 = ButtonDefaults.INSTANCE.m8228colorsoq7We08(Color.m5151copywmQWz5c$default(o(composer), z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(a, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(b, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, composer, ButtonDefaults.$stable << 24, PsExtractor.VIDEO_STREAM_MASK);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM8228colorsoq7We08;
    }

    public static final long n(boolean z, boolean z2, int i) {
        long jM5151copywmQWz5c$default;
        if ((i & 2) != 0) {
            z2 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-396542982, 0, -1, "com.dh.myembyapp.ui.theme.tvImmersiveActionButtonContentColor (TvButton.kt:298)");
        }
        if (z) {
            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(b, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM5151copywmQWz5c$default;
    }

    public static final long o(Composer composer) {
        long jM5203lerpjxsXWHM;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(825840334, 0, -1, "com.dh.myembyapp.ui.theme.tvImmersiveActionContainerColor (TvButton.kt:66)");
        }
        if (t(composer)) {
            composer.startReplaceGroup(1036812855);
            jM5203lerpjxsXWHM = ColorKt.m5203lerpjxsXWHM(xq.f, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0.72f);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1036909575);
            composer.endReplaceGroup();
            jM5203lerpjxsXWHM = xq.f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM5203lerpjxsXWHM;
    }

    public static final ButtonColors p(boolean z, Composer composer, int i, int i2) {
        boolean z2 = (i2 & 1) == 0 ? z : true;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(975555533, i, -1, "com.dh.myembyapp.ui.theme.tvImmersiveSecondaryButtonColors (TvButton.kt:266)");
        }
        ButtonColors buttonColorsM8228colorsoq7We08 = ButtonDefaults.INSTANCE.m8228colorsoq7We08(Color.m5151copywmQWz5c$default(c, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(d, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(a, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(b, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, composer, ButtonDefaults.$stable << 24, PsExtractor.VIDEO_STREAM_MASK);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM8228colorsoq7We08;
    }

    public static final long q(int i, int i2, boolean z, boolean z2) {
        long jM5151copywmQWz5c$default;
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(387004786, i, -1, "com.dh.myembyapp.ui.theme.tvImmersiveSecondaryButtonContentColor (TvButton.kt:277)");
        }
        if (z) {
            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(b, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(d, z2 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM5151copywmQWz5c$default;
    }

    public static final ButtonColors r(boolean z, long j, Composer composer, int i, int i2) {
        long j2 = (i2 & 4) != 0 ? c : j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-610325736, i, -1, "com.dh.myembyapp.ui.theme.tvImmersiveSelectableButtonColors (TvButton.kt:310)");
        }
        long jO = j2;
        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
        if (z) {
            composer.startReplaceGroup(-1617206535);
            jO = o(composer);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1617152254);
            composer.endReplaceGroup();
        }
        ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(Color.m5151copywmQWz5c$default(jO, 1.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(a, 1.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(b, 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, composer, ButtonDefaults.$stable << 24, PsExtractor.VIDEO_STREAM_MASK);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM8228colorsoq7We08;
    }

    public static final long s(boolean z) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(88639322, 0, -1, "com.dh.myembyapp.ui.theme.tvImmersiveSelectableButtonContentColor (TvButton.kt:325)");
        }
        long jM5151copywmQWz5c$default = z ? Color.m5151copywmQWz5c$default(b, 1.0f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM5151copywmQWz5c$default;
    }

    public static final boolean t(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1638468226, 0, -1, "com.dh.myembyapp.ui.theme.tvImmersiveUsesThemeAccent (TvButton.kt:59)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(n72.g)).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return zBooleanValue;
    }
}
