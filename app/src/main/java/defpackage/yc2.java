package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yc2 {
    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:103:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:121:0x0177  */
    /* JADX WARN: Code duplicated, block: B:125:0x0180  */
    /* JADX WARN: Code duplicated, block: B:128:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x018c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0190  */
    /* JADX WARN: Code duplicated, block: B:133:0x0195  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:144:0x01de  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:152:0x0206  */
    /* JADX WARN: Code duplicated, block: B:154:0x0211  */
    /* JADX WARN: Code duplicated, block: B:157:0x0219  */
    /* JADX WARN: Code duplicated, block: B:160:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0258  */
    /* JADX WARN: Code duplicated, block: B:166:0x026a  */
    /* JADX WARN: Code duplicated, block: B:167:0x026d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0279  */
    /* JADX WARN: Code duplicated, block: B:174:0x0282  */
    /* JADX WARN: Code duplicated, block: B:177:0x0299  */
    /* JADX WARN: Code duplicated, block: B:178:0x029c  */
    /* JADX WARN: Code duplicated, block: B:181:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:186:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:189:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:190:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:193:0x02db  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:201:0x0324  */
    /* JADX WARN: Code duplicated, block: B:204:0x032e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0334  */
    /* JADX WARN: Code duplicated, block: B:209:0x0388  */
    /* JADX WARN: Code duplicated, block: B:211:0x0394  */
    /* JADX WARN: Code duplicated, block: B:214:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    public static final void a(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, TextStyle textStyle, SolidColor solidColor, KeyboardOptions keyboardOptions, Function0 function0, VisualTransformation visualTransformation, Function1 function2, Function4 function4, Function3 function3, Composer composer, int i, int i2, int i3) {
        int i4;
        boolean z2;
        TextStyle textStyle2;
        int i5;
        KeyboardOptions keyboardOptions2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        Composer composer2;
        Function0 function5;
        Function1 function6;
        KeyboardOptions keyboardOptions3;
        boolean z5;
        VisualTransformation visualTransformation2;
        Function4 function7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z6;
        Function0 function8;
        VisualTransformation none;
        Function4 function9;
        SoftwareKeyboardController softwareKeyboardController;
        FocusManager focusManager;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Object objRememberedValue2;
        MutableState mutableState;
        boolean z7;
        boolean zChanged;
        Object objRememberedValue3;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean zChangedInstance;
        Object objRememberedValue4;
        SoftwareKeyboardController softwareKeyboardController2;
        boolean z12;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Object objRememberedValue8;
        int i17;
        int i18;
        int i19;
        int i20;
        textFieldValue.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(956498258);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i21 = i3 & 8;
        if (i21 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                textStyle2 = textStyle;
                if (composerStartRestartGroup.changed(textStyle2)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i4 |= i20;
            } else {
                textStyle2 = textStyle;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(solidColor)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i4 |= i19;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                i4 |= 1572864;
                keyboardOptions2 = keyboardOptions;
            } else {
                keyboardOptions2 = keyboardOptions;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(keyboardOptions2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
            }
            i7 = i3 & 128;
            if (i7 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(true)) {
                    i18 = 67108864;
                } else {
                    i18 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i4 |= i18;
            }
            z3 = true;
            i9 = i3 & 512;
            if (i9 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
                i12 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i12 = i2 | i13;
            } else {
                i12 = i2;
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
                if ((i2 & 48) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i12 |= i15;
                }
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i12 |= i17;
                }
                i16 = i12;
                if ((i4 & 306783379) == 306783378 || (i16 & Input.Keys.NUMPAD_3) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z4, i4 & 1)) {
                    if (i21 != 0) {
                        z6 = true;
                    } else {
                        z6 = z2;
                    }
                    if (i5 != 0) {
                        keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    }
                    if (i7 != 0) {
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new w82(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        function8 = (Function0) objRememberedValue8;
                    } else {
                        function8 = function0;
                    }
                    if (i9 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation;
                    }
                    if (i11 != 0) {
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new y82(4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        function6 = (Function1) objRememberedValue7;
                    } else {
                        function6 = function2;
                    }
                    if (i14 != 0) {
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = sc2.c;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        function9 = (Function4) objRememberedValue6;
                    } else {
                        function9 = function4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(956498258, i4, i16, "com.dh.myembyapp.ui.theme.TvConfirmEditableBasicTextField (TvInput.kt:235)");
                    }
                    softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    if ((i16 & 14) == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zChanged = z7 | composerStartRestartGroup.changed(softwareKeyboardController);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new kc2(function6, softwareKeyboardController, mutableState, 0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue3);
                    if ((i16 & Input.Keys.FORWARD_DEL) == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean zChanged2 = z8 | composerStartRestartGroup.changed(softwareKeyboardController);
                    if ((i4 & 7168) == 2048) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z13 = zChanged2 | z9;
                    if ((i4 & Input.Keys.FORWARD_DEL) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z14 = z13 | z10;
                    if ((i4 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zChangedInstance = z14 | z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(focusManager);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new qc2(function9, focusManager, mutableState, softwareKeyboardController, z6, function1, textFieldValue, coroutineScope);
                        softwareKeyboardController2 = softwareKeyboardController;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        softwareKeyboardController2 = softwareKeyboardController;
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue4);
                    boolean z15 = !((Boolean) r19.getValue()).booleanValue();
                    boolean zChanged3 = composerStartRestartGroup.changed(softwareKeyboardController2);
                    if ((29360128 & i4) != 8388608) {
                        z3 = false;
                    }
                    z12 = zChanged3 | z3;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z12 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new rc2(function8, softwareKeyboardController2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composer2 = composerStartRestartGroup;
                    KeyboardOptions keyboardOptions4 = keyboardOptions2;
                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierOnPreviewKeyEvent, z6, z15, textStyle2, keyboardOptions4, i((Function0) ((KFunction) objRememberedValue5)), true, 0, 0, none, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3, composer2, (i4 & 7294) | ((i4 << 3) & 458752) | (3670016 & i4) | (234881024 & i4), ((i4 >> 24) & Input.Keys.FORWARD_DEL) | (57344 & (i4 >> 3)) | ((i16 << 9) & 458752), 13824);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function9;
                    function5 = function8;
                    z5 = z6;
                    keyboardOptions3 = keyboardOptions4;
                    visualTransformation2 = none;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function5 = function0;
                    function6 = function2;
                    keyboardOptions3 = keyboardOptions2;
                    z5 = z2;
                    visualTransformation2 = visualTransformation;
                    function7 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new jn1(textFieldValue, function1, modifier, z5, textStyle, solidColor, keyboardOptions3, function5, visualTransformation2, function6, function7, function3, i, i2, i3, 1));
                }
            }
            i12 |= 48;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i12 |= i17;
            }
            i16 = i12;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z4, i4 & 1)) {
                if (i21 != 0) {
                    z6 = true;
                } else {
                    z6 = z2;
                }
                if (i5 != 0) {
                    keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                }
                if (i7 != 0) {
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new w82(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    function8 = (Function0) objRememberedValue8;
                } else {
                    function8 = function0;
                }
                if (i9 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation;
                }
                if (i11 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new y82(4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function6 = (Function1) objRememberedValue7;
                } else {
                    function6 = function2;
                }
                if (i14 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = sc2.c;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function9 = (Function4) objRememberedValue6;
                } else {
                    function9 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(956498258, i4, i16, "com.dh.myembyapp.ui.theme.TvConfirmEditableBasicTextField (TvInput.kt:235)");
                }
                softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                if ((i16 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChanged = z7 | composerStartRestartGroup.changed(softwareKeyboardController);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new kc2(function6, softwareKeyboardController, mutableState, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new kc2(function6, softwareKeyboardController, mutableState, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue3);
                if ((i16 & Input.Keys.FORWARD_DEL) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zChanged4 = z8 | composerStartRestartGroup.changed(softwareKeyboardController);
                if ((i4 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z16 = zChanged4 | z9;
                if ((i4 & Input.Keys.FORWARD_DEL) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z17 = z16 | z10;
                if ((i4 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zChangedInstance = z17 | z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(focusManager);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue4 = new qc2(function9, focusManager, mutableState, softwareKeyboardController, z6, function1, textFieldValue, coroutineScope);
                    softwareKeyboardController2 = softwareKeyboardController;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new qc2(function9, focusManager, mutableState, softwareKeyboardController, z6, function1, textFieldValue, coroutineScope);
                    softwareKeyboardController2 = softwareKeyboardController;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierOnPreviewKeyEvent2 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged2, (Function1) objRememberedValue4);
                boolean z18 = !((Boolean) r19.getValue()).booleanValue();
                boolean zChanged5 = composerStartRestartGroup.changed(softwareKeyboardController2);
                if ((29360128 & i4) != 8388608) {
                    z3 = false;
                }
                z12 = zChanged5 | z3;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z12) {
                    objRememberedValue5 = new rc2(function8, softwareKeyboardController2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new rc2(function8, softwareKeyboardController2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composer2 = composerStartRestartGroup;
                KeyboardOptions keyboardOptions5 = keyboardOptions2;
                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierOnPreviewKeyEvent2, z6, z18, textStyle2, keyboardOptions5, i((Function0) ((KFunction) objRememberedValue5)), true, 0, 0, none, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3, composer2, (i4 & 7294) | ((i4 << 3) & 458752) | (3670016 & i4) | (234881024 & i4), ((i4 >> 24) & Input.Keys.FORWARD_DEL) | (57344 & (i4 >> 3)) | ((i16 << 9) & 458752), 13824);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function9;
                function5 = function8;
                z5 = z6;
                keyboardOptions3 = keyboardOptions5;
                visualTransformation2 = none;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function5 = function0;
                function6 = function2;
                keyboardOptions3 = keyboardOptions2;
                z5 = z2;
                visualTransformation2 = visualTransformation;
                function7 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(textFieldValue, function1, modifier, z5, textStyle, solidColor, keyboardOptions3, function5, visualTransformation2, function6, function7, function3, i, i2, i3, 1));
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            textStyle2 = textStyle;
            if (composerStartRestartGroup.changed(textStyle2)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i4 |= i20;
        } else {
            textStyle2 = textStyle;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changed(solidColor)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i4 |= i19;
        }
        i5 = i3 & 64;
        if (i5 != 0) {
            i4 |= 1572864;
            keyboardOptions2 = keyboardOptions;
        } else {
            keyboardOptions2 = keyboardOptions;
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(keyboardOptions2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
        }
        i7 = i3 & 128;
        if (i7 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i4 |= i8;
        }
        if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed(true)) {
                i18 = 67108864;
            } else {
                i18 = GroupFlagsKt.HasAuxSlotFlag;
            }
            i4 |= i18;
        }
        z3 = true;
        i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changed(visualTransformation)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i4 |= i10;
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
            i12 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i2 | i13;
        } else {
            i12 = i2;
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
            if ((i2 & 48) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i12 |= i15;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i12 |= i17;
            }
            i16 = i12;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z4, i4 & 1)) {
                if (i21 != 0) {
                    z6 = true;
                } else {
                    z6 = z2;
                }
                if (i5 != 0) {
                    keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                }
                if (i7 != 0) {
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new w82(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    function8 = (Function0) objRememberedValue8;
                } else {
                    function8 = function0;
                }
                if (i9 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation;
                }
                if (i11 != 0) {
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new y82(4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    function6 = (Function1) objRememberedValue7;
                } else {
                    function6 = function2;
                }
                if (i14 != 0) {
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = sc2.c;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    function9 = (Function4) objRememberedValue6;
                } else {
                    function9 = function4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(956498258, i4, i16, "com.dh.myembyapp.ui.theme.TvConfirmEditableBasicTextField (TvInput.kt:235)");
                }
                softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                if ((i16 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChanged = z7 | composerStartRestartGroup.changed(softwareKeyboardController);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new kc2(function6, softwareKeyboardController, mutableState, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new kc2(function6, softwareKeyboardController, mutableState, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue3);
                if ((i16 & Input.Keys.FORWARD_DEL) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zChanged6 = z8 | composerStartRestartGroup.changed(softwareKeyboardController);
                if ((i4 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z19 = zChanged6 | z9;
                if ((i4 & Input.Keys.FORWARD_DEL) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z110 = z19 | z10;
                if ((i4 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zChangedInstance = z110 | z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(focusManager);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue4 = new qc2(function9, focusManager, mutableState, softwareKeyboardController, z6, function1, textFieldValue, coroutineScope);
                    softwareKeyboardController2 = softwareKeyboardController;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new qc2(function9, focusManager, mutableState, softwareKeyboardController, z6, function1, textFieldValue, coroutineScope);
                    softwareKeyboardController2 = softwareKeyboardController;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierOnPreviewKeyEvent3 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged3, (Function1) objRememberedValue4);
                boolean z111 = !((Boolean) r19.getValue()).booleanValue();
                boolean zChanged7 = composerStartRestartGroup.changed(softwareKeyboardController2);
                if ((29360128 & i4) != 8388608) {
                    z3 = false;
                }
                z12 = zChanged7 | z3;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z12) {
                    objRememberedValue5 = new rc2(function8, softwareKeyboardController2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new rc2(function8, softwareKeyboardController2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composer2 = composerStartRestartGroup;
                KeyboardOptions keyboardOptions6 = keyboardOptions2;
                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierOnPreviewKeyEvent3, z6, z111, textStyle2, keyboardOptions6, i((Function0) ((KFunction) objRememberedValue5)), true, 0, 0, none, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3, composer2, (i4 & 7294) | ((i4 << 3) & 458752) | (3670016 & i4) | (234881024 & i4), ((i4 >> 24) & Input.Keys.FORWARD_DEL) | (57344 & (i4 >> 3)) | ((i16 << 9) & 458752), 13824);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function9;
                function5 = function8;
                z5 = z6;
                keyboardOptions3 = keyboardOptions6;
                visualTransformation2 = none;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function5 = function0;
                function6 = function2;
                keyboardOptions3 = keyboardOptions2;
                z5 = z2;
                visualTransformation2 = visualTransformation;
                function7 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jn1(textFieldValue, function1, modifier, z5, textStyle, solidColor, keyboardOptions3, function5, visualTransformation2, function6, function7, function3, i, i2, i3, 1));
            }
        }
        i12 |= 48;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        i16 = i12;
        if ((i4 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z4, i4 & 1)) {
            if (i21 != 0) {
                z6 = true;
            } else {
                z6 = z2;
            }
            if (i5 != 0) {
                keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
            }
            if (i7 != 0) {
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new w82(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                function8 = (Function0) objRememberedValue8;
            } else {
                function8 = function0;
            }
            if (i9 != 0) {
                none = VisualTransformation.INSTANCE.getNone();
            } else {
                none = visualTransformation;
            }
            if (i11 != 0) {
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new y82(4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                function6 = (Function1) objRememberedValue7;
            } else {
                function6 = function2;
            }
            if (i14 != 0) {
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = sc2.c;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                function9 = (Function4) objRememberedValue6;
            } else {
                function9 = function4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(956498258, i4, i16, "com.dh.myembyapp.ui.theme.TvConfirmEditableBasicTextField (TvInput.kt:235)");
            }
            softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState = (MutableState) objRememberedValue2;
            if ((i16 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            zChanged = z7 | composerStartRestartGroup.changed(softwareKeyboardController);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new kc2(function6, softwareKeyboardController, mutableState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new kc2(function6, softwareKeyboardController, mutableState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged4 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue3);
            if ((i16 & Input.Keys.FORWARD_DEL) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean zChanged8 = z8 | composerStartRestartGroup.changed(softwareKeyboardController);
            if ((i4 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z112 = zChanged8 | z9;
            if ((i4 & Input.Keys.FORWARD_DEL) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z113 = z112 | z10;
            if ((i4 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            zChangedInstance = z113 | z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(focusManager);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue4 = new qc2(function9, focusManager, mutableState, softwareKeyboardController, z6, function1, textFieldValue, coroutineScope);
                softwareKeyboardController2 = softwareKeyboardController;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new qc2(function9, focusManager, mutableState, softwareKeyboardController, z6, function1, textFieldValue, coroutineScope);
                softwareKeyboardController2 = softwareKeyboardController;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnPreviewKeyEvent4 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged4, (Function1) objRememberedValue4);
            boolean z114 = !((Boolean) r19.getValue()).booleanValue();
            boolean zChanged9 = composerStartRestartGroup.changed(softwareKeyboardController2);
            if ((29360128 & i4) != 8388608) {
                z3 = false;
            }
            z12 = zChanged9 | z3;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z12) {
                objRememberedValue5 = new rc2(function8, softwareKeyboardController2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new rc2(function8, softwareKeyboardController2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composer2 = composerStartRestartGroup;
            KeyboardOptions keyboardOptions7 = keyboardOptions2;
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierOnPreviewKeyEvent4, z6, z114, textStyle2, keyboardOptions7, i((Function0) ((KFunction) objRememberedValue5)), true, 0, 0, none, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3, composer2, (i4 & 7294) | ((i4 << 3) & 458752) | (3670016 & i4) | (234881024 & i4), ((i4 >> 24) & Input.Keys.FORWARD_DEL) | (57344 & (i4 >> 3)) | ((i16 << 9) & 458752), 13824);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function7 = function9;
            function5 = function8;
            z5 = z6;
            keyboardOptions3 = keyboardOptions7;
            visualTransformation2 = none;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function5 = function0;
            function6 = function2;
            keyboardOptions3 = keyboardOptions2;
            z5 = z2;
            visualTransformation2 = visualTransformation;
            function7 = function4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(textFieldValue, function1, modifier, z5, textStyle, solidColor, keyboardOptions3, function5, visualTransformation2, function6, function7, function3, i, i2, i3, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, Function1 function1, Modifier modifier, boolean z, TextStyle textStyle, SolidColor solidColor, KeyboardOptions keyboardOptions, Function0 function0, VisualTransformation visualTransformation, Function1 function2, Function4 function4, Function3 function3, Composer composer, int i, int i2, int i3) {
        int i4;
        VisualTransformation visualTransformation2;
        Function4 function5;
        String str2;
        Composer composer2;
        boolean z2;
        KeyboardOptions keyboardOptions2;
        Function0 function6;
        VisualTransformation visualTransformation3;
        Function4 function7;
        Function1 function8;
        Function4 function9;
        int i5;
        int i6;
        str.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1779643131);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i7 = i4 | 3072;
        if ((i & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 |= composerStartRestartGroup.changed(solidColor) ? 131072 : 65536;
        }
        int i8 = i7 | 14155776;
        if ((i & 100663296) == 0) {
            i8 |= composerStartRestartGroup.changed(true) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i8 |= 805306368;
            visualTransformation2 = visualTransformation;
        } else {
            visualTransformation2 = visualTransformation;
            if ((i & 805306368) == 0) {
                i8 |= composerStartRestartGroup.changed(visualTransformation2) ? 536870912 : 268435456;
            }
        }
        int i10 = i2 | 6;
        int i11 = i3 & 2048;
        if (i11 != 0) {
            i10 = i2 | 54;
            function5 = function4;
        } else {
            function5 = function4;
            if ((i2 & 48) == 0) {
                i10 |= composerStartRestartGroup.changedInstance(function5) ? 32 : 16;
            }
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        int i12 = i10;
        if (composerStartRestartGroup.shouldExecute(((i8 & 306783379) == 306783378 && (i12 & Input.Keys.NUMPAD_3) == 146) ? false : true, i8 & 1)) {
            KeyboardOptions keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new w82(6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function10 = (Function0) objRememberedValue;
            VisualTransformation none = i9 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation2;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new y82(5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function11 = (Function1) objRememberedValue2;
            if (i11 != 0) {
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = sc2.b;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                function9 = (Function4) objRememberedValue3;
            } else {
                function9 = function5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1779643131, i8, i12, "com.dh.myembyapp.ui.theme.TvConfirmEditableBasicTextField (TvInput.kt:179)");
            }
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                i6 = i12;
                i5 = i8;
                str2 = str;
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str2, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                str2 = str;
                i5 = i8;
                i6 = i12;
            }
            MutableState mutableState = (MutableState) objRememberedValue4;
            String text = ((TextFieldValue) mutableState.getValue()).getText();
            int i13 = i5 & 14;
            boolean z3 = i13 == 4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new i8(str2, mutableState, null, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(str2, text, (Function2) objRememberedValue5, composerStartRestartGroup, i13);
            TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
            boolean z4 = (i5 & Input.Keys.FORWARD_DEL) == 32;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new r7(function1, mutableState, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composer2 = composerStartRestartGroup;
            a(textFieldValue, (Function1) objRememberedValue6, modifier, true, textStyle, solidColor, keyboardOptions3, function10, none, function11, function9, function3, composer2, i5 & 2147483520, i6 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = true;
            keyboardOptions2 = keyboardOptions3;
            function6 = function10;
            visualTransformation3 = none;
            function8 = function11;
            function7 = function9;
        } else {
            str2 = str;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z2 = z;
            keyboardOptions2 = keyboardOptions;
            function6 = function0;
            visualTransformation3 = visualTransformation2;
            function7 = function5;
            function8 = function2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jn1(str2, function1, modifier, z2, textStyle, solidColor, keyboardOptions2, function6, visualTransformation3, function8, function7, function3, i, i2, i3, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(SoftwareKeyboardController softwareKeyboardController, MutableState mutableState) {
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            mutableState.setValue(Boolean.FALSE);
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0161  */
    /* JADX WARN: Code duplicated, block: B:124:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0173  */
    /* JADX WARN: Code duplicated, block: B:130:0x0186  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190  */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:158:0x01df  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:162:0x0205  */
    /* JADX WARN: Code duplicated, block: B:165:0x0213  */
    /* JADX WARN: Code duplicated, block: B:168:0x0222  */
    /* JADX WARN: Code duplicated, block: B:169:0x0231  */
    /* JADX WARN: Code duplicated, block: B:171:0x0235  */
    /* JADX WARN: Code duplicated, block: B:172:0x0238  */
    /* JADX WARN: Code duplicated, block: B:175:0x0240  */
    /* JADX WARN: Code duplicated, block: B:177:0x0249  */
    /* JADX WARN: Code duplicated, block: B:180:0x0256  */
    /* JADX WARN: Code duplicated, block: B:184:0x027e  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:194:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:195:0x0304  */
    /* JADX WARN: Code duplicated, block: B:198:0x031b  */
    /* JADX WARN: Code duplicated, block: B:199:0x031e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0326  */
    /* JADX WARN: Code duplicated, block: B:204:0x032c  */
    /* JADX WARN: Code duplicated, block: B:207:0x034a  */
    /* JADX WARN: Code duplicated, block: B:208:0x034c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0359  */
    /* JADX WARN: Code duplicated, block: B:213:0x035f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0374  */
    /* JADX WARN: Code duplicated, block: B:217:0x0376  */
    /* JADX WARN: Code duplicated, block: B:220:0x0392  */
    /* JADX WARN: Code duplicated, block: B:222:0x0398  */
    /* JADX WARN: Code duplicated, block: B:225:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:231:0x03df  */
    /* JADX WARN: Code duplicated, block: B:234:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:237:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:241:0x0407  */
    /* JADX WARN: Code duplicated, block: B:244:0x046a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0482  */
    /* JADX WARN: Code duplicated, block: B:249:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e  */
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
    public static final void d(final String str, Function1 function1, final Modifier modifier, boolean z, Function2 function2, Function2 function3, Function2 function4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, Function0 function0, TextStyle textStyle, boolean z2, TextFieldColors textFieldColors, Function1 function5, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        Function2 function6;
        int i6;
        int i7;
        Function2 function7;
        int i8;
        int i9;
        Function2 function8;
        int i10;
        int i11;
        final VisualTransformation visualTransformation2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        Function1 function9;
        Composer composer2;
        final KeyboardOptions keyboardOptions2;
        final Function0 function10;
        final Function2 function11;
        final Function2 function12;
        final boolean z5;
        final Function2 function13;
        final TextStyle textStyle2;
        final boolean z6;
        final TextFieldColors textFieldColors2;
        final Function1 function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        VisualTransformation none;
        KeyboardOptions keyboardOptions3;
        Object objRememberedValue;
        Composer.Companion companion;
        Function0 function15;
        TextStyle bodyMedium;
        boolean z7;
        TextFieldColors textFieldColorsM;
        Object objRememberedValue2;
        Function1 function16;
        TextFieldColors textFieldColors3;
        TextStyle textStyle3;
        Function2 function17;
        Function2 function18;
        boolean z8;
        Function2 function19;
        KeyboardOptions keyboardOptions4;
        VisualTransformation visualTransformation3;
        int i22;
        SoftwareKeyboardController softwareKeyboardController;
        FocusManager focusManager;
        Object objRememberedValue3;
        Composer.Companion companion2;
        CoroutineScope coroutineScope;
        Object objRememberedValue4;
        MutableState mutableState;
        Object objRememberedValue5;
        String str2;
        MutableState mutableState2;
        int i23;
        boolean z9;
        Object objRememberedValue6;
        boolean z10;
        boolean zChanged;
        Object objRememberedValue7;
        int i24;
        boolean z11;
        boolean zChangedInstance;
        Object objRememberedValue8;
        boolean z12;
        boolean z13;
        Object objRememberedValue9;
        boolean z14;
        Object objRememberedValue10;
        int i25;
        str.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1089588731);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i26 = i3 & 8;
        int i27 = 1024;
        if (i26 == 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    function6 = function2;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                    visualTransformation2 = visualTransformation;
                } else {
                    visualTransformation2 = visualTransformation;
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(visualTransformation2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 256;
                if (i13 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(keyboardOptions)) {
                        i14 = 67108864;
                    } else {
                        i14 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i4 |= i14;
                }
                i15 = i4 | 805306368;
                if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changed(true)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i16 = i2 | i25;
                } else {
                    i16 = i2;
                }
                if ((i2 & 48) != 0) {
                    i16 |= ((i3 & 2048) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 16 : 32;
                }
                i17 = i16;
                i18 = i3 & 4096;
                if (i18 != 0) {
                    i19 = i17;
                    if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        if (composerStartRestartGroup.changed(z2)) {
                            i20 = 256;
                        } else {
                            i20 = 128;
                        }
                        i19 |= i20;
                    }
                    if ((i2 & 3072) != 0) {
                        if ((i3 & 8192) == 0 && composerStartRestartGroup.changed(textFieldColors)) {
                            i27 = 2048;
                        }
                        i19 |= i27;
                    }
                    i21 = i19 | 24576;
                    if ((i15 & 306783379) == 306783378 || (i21 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z4, i15 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i26 != 0) {
                                z3 = true;
                            }
                            if (i5 != 0) {
                                function6 = null;
                            }
                            if (i7 != 0) {
                                function7 = null;
                            }
                            if (i9 != 0) {
                                function8 = null;
                            }
                            if (i11 != 0) {
                                none = VisualTransformation.INSTANCE.getNone();
                            } else {
                                none = visualTransformation2;
                            }
                            if (i13 != 0) {
                                keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                            } else {
                                keyboardOptions3 = keyboardOptions;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new w82(7);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function15 = (Function0) objRememberedValue;
                            if ((i3 & 2048) != 0) {
                                bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                                i21 &= -113;
                            } else {
                                bodyMedium = textStyle;
                            }
                            if (i18 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            VisualTransformation visualTransformation4 = none;
                            if ((i3 & 8192) != 0) {
                                textFieldColorsM = m(composerStartRestartGroup);
                                i21 &= -7169;
                            } else {
                                textFieldColorsM = textFieldColors;
                            }
                            int i28 = i21;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new y82(6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            function16 = (Function1) objRememberedValue2;
                            textFieldColors3 = textFieldColorsM;
                            textStyle3 = bodyMedium;
                            function17 = function7;
                            function18 = function6;
                            z8 = z3;
                            function19 = function8;
                            keyboardOptions4 = keyboardOptions3;
                            visualTransformation3 = visualTransformation4;
                            i22 = i28;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 2048) != 0) {
                                i21 &= -113;
                            }
                            if ((i3 & 8192) != 0) {
                                i21 &= -7169;
                            }
                            keyboardOptions4 = keyboardOptions;
                            textStyle3 = textStyle;
                            z7 = z2;
                            textFieldColors3 = textFieldColors;
                            i22 = i21;
                            visualTransformation3 = visualTransformation2;
                            function17 = function7;
                            function18 = function6;
                            z8 = z3;
                            function19 = function8;
                            function15 = function0;
                            function16 = function5;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1089588731, i15, i22, "com.dh.myembyapp.ui.theme.TvConfirmEditableOutlinedTextField (TvInput.kt:76)");
                        }
                        softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                        focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion2 = Composer.INSTANCE;
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        coroutineScope = (CoroutineScope) objRememberedValue3;
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                            objRememberedValue4 = mutableStateMutableStateOf$default;
                        }
                        mutableState = (MutableState) objRememberedValue4;
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion2.getEmpty()) {
                            str2 = str;
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            str2 = str;
                        }
                        mutableState2 = (MutableState) objRememberedValue5;
                        String text = ((TextFieldValue) mutableState2.getValue()).getText();
                        i23 = i15 & 14;
                        if (i23 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (z9 || objRememberedValue6 == companion2.getEmpty()) {
                            objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        EffectsKt.LaunchedEffect(str2, text, (Function2) objRememberedValue6, composerStartRestartGroup, i23);
                        TextFieldValue textFieldValue = (TextFieldValue) mutableState2.getValue();
                        if ((i22 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zChanged = z10 | composerStartRestartGroup.changed(softwareKeyboardController);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue7 == companion2.getEmpty()) {
                            objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue7);
                        i24 = i15 & 7168;
                        if (i24 == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zChangedInstance = z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue8 == companion2.getEmpty()) {
                            objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue8);
                        boolean z15 = !((Boolean) mutableState.getValue()).booleanValue();
                        boolean zChanged2 = composerStartRestartGroup.changed(softwareKeyboardController);
                        if ((1879048192 & i15) == 536870912) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zChanged2 | z12;
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (z13 || objRememberedValue9 == companion2.getEmpty()) {
                            objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        KeyboardActions keyboardActionsI = i((Function0) ((KFunction) objRememberedValue9));
                        z14 = (i15 & Input.Keys.FORWARD_DEL) == 32;
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (!z14 || objRememberedValue10 == companion2.getEmpty()) {
                            function9 = function1;
                            objRememberedValue10 = new r7(function9, mutableState2, 18);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        } else {
                            function9 = function1;
                        }
                        int i29 = i15 << 6;
                        int i30 = ((i22 << 12) & 458752) | i24 | (3670016 & i29) | (i29 & 29360128);
                        int i31 = ((i15 >> 12) & 896) | ((i22 << 3) & 7168);
                        int i32 = i15 >> 9;
                        boolean z16 = z7;
                        composer2 = composerStartRestartGroup;
                        OutlinedTextFieldKt.OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue10, modifierOnPreviewKeyEvent, z8, z15, textStyle3, (Function2<? super Composer, ? super Integer, Unit>) function18, (Function2<? super Composer, ? super Integer, Unit>) function17, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function19, z16, visualTransformation3, keyboardOptions4, keyboardActionsI, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColors3, composer2, i30, i31 | (i32 & 57344) | (i32 & 458752) | ((i22 << 21) & 29360128), (i22 >> 3) & 896, 3936000);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function14 = function16;
                        function10 = function15;
                        z5 = z8;
                        textStyle2 = textStyle3;
                        function12 = function18;
                        function11 = function17;
                        function13 = function19;
                        z6 = z16;
                        visualTransformation2 = visualTransformation3;
                        keyboardOptions2 = keyboardOptions4;
                        textFieldColors2 = textFieldColors3;
                    } else {
                        function9 = function1;
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        keyboardOptions2 = keyboardOptions;
                        function10 = function0;
                        function11 = function7;
                        function12 = function6;
                        z5 = z3;
                        function13 = function8;
                        textStyle2 = textStyle;
                        z6 = z2;
                        textFieldColors2 = textFieldColors;
                        function14 = function5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Function1 function20 = function9;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                                yc2.d(str, function20, modifier, z5, function12, function11, function13, visualTransformation2, keyboardOptions2, function10, textStyle2, z6, textFieldColors2, function14, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i19 = i17 | RendererCapabilities.DECODER_SUPPORT_MASK;
                if ((i2 & 3072) != 0) {
                    if ((i3 & 8192) == 0) {
                        i27 = 2048;
                    }
                    i19 |= i27;
                }
                i21 = i19 | 24576;
                if ((i15 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z4, i15 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i26 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        if (i11 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation2;
                        }
                        if (i13 != 0) {
                            keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new w82(7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function15 = (Function0) objRememberedValue;
                        if ((i3 & 2048) != 0) {
                            bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                            i21 &= -113;
                        } else {
                            bodyMedium = textStyle;
                        }
                        if (i18 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        VisualTransformation visualTransformation5 = none;
                        if ((i3 & 8192) != 0) {
                            textFieldColorsM = m(composerStartRestartGroup);
                            i21 &= -7169;
                        } else {
                            textFieldColorsM = textFieldColors;
                        }
                        int i210 = i21;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new y82(6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        function16 = (Function1) objRememberedValue2;
                        textFieldColors3 = textFieldColorsM;
                        textStyle3 = bodyMedium;
                        function17 = function7;
                        function18 = function6;
                        z8 = z3;
                        function19 = function8;
                        keyboardOptions4 = keyboardOptions3;
                        visualTransformation3 = visualTransformation5;
                        i22 = i210;
                    } else {
                        if (i26 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        if (i11 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation2;
                        }
                        if (i13 != 0) {
                            keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new w82(7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function15 = (Function0) objRememberedValue;
                        if ((i3 & 2048) != 0) {
                            bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                            i21 &= -113;
                        } else {
                            bodyMedium = textStyle;
                        }
                        if (i18 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        VisualTransformation visualTransformation6 = none;
                        if ((i3 & 8192) != 0) {
                            textFieldColorsM = m(composerStartRestartGroup);
                            i21 &= -7169;
                        } else {
                            textFieldColorsM = textFieldColors;
                        }
                        int i211 = i21;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new y82(6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        function16 = (Function1) objRememberedValue2;
                        textFieldColors3 = textFieldColorsM;
                        textStyle3 = bodyMedium;
                        function17 = function7;
                        function18 = function6;
                        z8 = z3;
                        function19 = function8;
                        keyboardOptions4 = keyboardOptions3;
                        visualTransformation3 = visualTransformation6;
                        i22 = i211;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1089588731, i15, i22, "com.dh.myembyapp.ui.theme.TvConfirmEditableOutlinedTextField (TvInput.kt:76)");
                    }
                    softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue3;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                        objRememberedValue4 = mutableStateMutableStateOf$default2;
                    }
                    mutableState = (MutableState) objRememberedValue4;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        str2 = str;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        str2 = str;
                    }
                    mutableState2 = (MutableState) objRememberedValue5;
                    String text2 = ((TextFieldValue) mutableState2.getValue()).getText();
                    i23 = i15 & 14;
                    if (i23 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z9) {
                        objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    EffectsKt.LaunchedEffect(str2, text2, (Function2) objRememberedValue6, composerStartRestartGroup, i23);
                    TextFieldValue textFieldValue2 = (TextFieldValue) mutableState2.getValue();
                    if ((i22 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zChanged = z10 | composerStartRestartGroup.changed(softwareKeyboardController);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue7);
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zChangedInstance = z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    Modifier modifierOnPreviewKeyEvent2 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged2, (Function1) objRememberedValue8);
                    boolean z17 = !((Boolean) mutableState.getValue()).booleanValue();
                    boolean zChanged3 = composerStartRestartGroup.changed(softwareKeyboardController);
                    if ((1879048192 & i15) == 536870912) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zChanged3 | z12;
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (z13) {
                        objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    KeyboardActions keyboardActionsI2 = i((Function0) ((KFunction) objRememberedValue9));
                    if ((i15 & Input.Keys.FORWARD_DEL) == 32) {
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (z14) {
                        function9 = function1;
                        objRememberedValue10 = new r7(function9, mutableState2, 18);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        function9 = function1;
                        objRememberedValue10 = new r7(function9, mutableState2, 18);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    int i212 = i15 << 6;
                    int i33 = ((i22 << 12) & 458752) | i24 | (3670016 & i212) | (i212 & 29360128);
                    int i34 = ((i15 >> 12) & 896) | ((i22 << 3) & 7168);
                    int i35 = i15 >> 9;
                    boolean z18 = z7;
                    composer2 = composerStartRestartGroup;
                    OutlinedTextFieldKt.OutlinedTextField(textFieldValue2, (Function1<? super TextFieldValue, Unit>) objRememberedValue10, modifierOnPreviewKeyEvent2, z8, z17, textStyle3, (Function2<? super Composer, ? super Integer, Unit>) function18, (Function2<? super Composer, ? super Integer, Unit>) function17, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function19, z18, visualTransformation3, keyboardOptions4, keyboardActionsI2, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColors3, composer2, i33, i34 | (i35 & 57344) | (i35 & 458752) | ((i22 << 21) & 29360128), (i22 >> 3) & 896, 3936000);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function14 = function16;
                    function10 = function15;
                    z5 = z8;
                    textStyle2 = textStyle3;
                    function12 = function18;
                    function11 = function17;
                    function13 = function19;
                    z6 = z18;
                    visualTransformation2 = visualTransformation3;
                    keyboardOptions2 = keyboardOptions4;
                    textFieldColors2 = textFieldColors3;
                } else {
                    function9 = function1;
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    keyboardOptions2 = keyboardOptions;
                    function10 = function0;
                    function11 = function7;
                    function12 = function6;
                    z5 = z3;
                    function13 = function8;
                    textStyle2 = textStyle;
                    z6 = z2;
                    textFieldColors2 = textFieldColors;
                    function14 = function5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function1 function21 = function9;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                            yc2.d(str, function21, modifier, z5, function12, function11, function13, visualTransformation2, keyboardOptions2, function10, textStyle2, z6, textFieldColors2, function14, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i4 |= 24576;
            function6 = function2;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
                visualTransformation2 = visualTransformation;
            } else {
                visualTransformation2 = visualTransformation;
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(visualTransformation2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(keyboardOptions)) {
                    i14 = 67108864;
                } else {
                    i14 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i4 |= i14;
            }
            i15 = i4 | 805306368;
            if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changed(true)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i16 = i2 | i25;
            } else {
                i16 = i2;
            }
            if ((i2 & 48) != 0) {
                i16 |= ((i3 & 2048) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 16 : 32;
            }
            i17 = i16;
            i18 = i3 & 4096;
            if (i18 != 0) {
                i19 = i17;
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i20 = 256;
                    } else {
                        i20 = 128;
                    }
                    i19 |= i20;
                }
                if ((i2 & 3072) != 0) {
                    if ((i3 & 8192) == 0) {
                        i27 = 2048;
                    }
                    i19 |= i27;
                }
                i21 = i19 | 24576;
                if ((i15 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z4, i15 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i26 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        if (i11 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation2;
                        }
                        if (i13 != 0) {
                            keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new w82(7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function15 = (Function0) objRememberedValue;
                        if ((i3 & 2048) != 0) {
                            bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                            i21 &= -113;
                        } else {
                            bodyMedium = textStyle;
                        }
                        if (i18 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        VisualTransformation visualTransformation7 = none;
                        if ((i3 & 8192) != 0) {
                            textFieldColorsM = m(composerStartRestartGroup);
                            i21 &= -7169;
                        } else {
                            textFieldColorsM = textFieldColors;
                        }
                        int i213 = i21;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new y82(6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        function16 = (Function1) objRememberedValue2;
                        textFieldColors3 = textFieldColorsM;
                        textStyle3 = bodyMedium;
                        function17 = function7;
                        function18 = function6;
                        z8 = z3;
                        function19 = function8;
                        keyboardOptions4 = keyboardOptions3;
                        visualTransformation3 = visualTransformation7;
                        i22 = i213;
                    } else {
                        if (i26 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        if (i11 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation2;
                        }
                        if (i13 != 0) {
                            keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new w82(7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function15 = (Function0) objRememberedValue;
                        if ((i3 & 2048) != 0) {
                            bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                            i21 &= -113;
                        } else {
                            bodyMedium = textStyle;
                        }
                        if (i18 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        VisualTransformation visualTransformation8 = none;
                        if ((i3 & 8192) != 0) {
                            textFieldColorsM = m(composerStartRestartGroup);
                            i21 &= -7169;
                        } else {
                            textFieldColorsM = textFieldColors;
                        }
                        int i214 = i21;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new y82(6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        function16 = (Function1) objRememberedValue2;
                        textFieldColors3 = textFieldColorsM;
                        textStyle3 = bodyMedium;
                        function17 = function7;
                        function18 = function6;
                        z8 = z3;
                        function19 = function8;
                        keyboardOptions4 = keyboardOptions3;
                        visualTransformation3 = visualTransformation8;
                        i22 = i214;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1089588731, i15, i22, "com.dh.myembyapp.ui.theme.TvConfirmEditableOutlinedTextField (TvInput.kt:76)");
                    }
                    softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue3;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                        objRememberedValue4 = mutableStateMutableStateOf$default3;
                    }
                    mutableState = (MutableState) objRememberedValue4;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        str2 = str;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        str2 = str;
                    }
                    mutableState2 = (MutableState) objRememberedValue5;
                    String text3 = ((TextFieldValue) mutableState2.getValue()).getText();
                    i23 = i15 & 14;
                    if (i23 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z9) {
                        objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    EffectsKt.LaunchedEffect(str2, text3, (Function2) objRememberedValue6, composerStartRestartGroup, i23);
                    TextFieldValue textFieldValue3 = (TextFieldValue) mutableState2.getValue();
                    if ((i22 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zChanged = z10 | composerStartRestartGroup.changed(softwareKeyboardController);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue7);
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zChangedInstance = z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    Modifier modifierOnPreviewKeyEvent3 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged3, (Function1) objRememberedValue8);
                    boolean z19 = !((Boolean) mutableState.getValue()).booleanValue();
                    boolean zChanged4 = composerStartRestartGroup.changed(softwareKeyboardController);
                    if ((1879048192 & i15) == 536870912) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zChanged4 | z12;
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (z13) {
                        objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    KeyboardActions keyboardActionsI3 = i((Function0) ((KFunction) objRememberedValue9));
                    if ((i15 & Input.Keys.FORWARD_DEL) == 32) {
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (z14) {
                        function9 = function1;
                        objRememberedValue10 = new r7(function9, mutableState2, 18);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        function9 = function1;
                        objRememberedValue10 = new r7(function9, mutableState2, 18);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    int i215 = i15 << 6;
                    int i36 = ((i22 << 12) & 458752) | i24 | (3670016 & i215) | (i215 & 29360128);
                    int i37 = ((i15 >> 12) & 896) | ((i22 << 3) & 7168);
                    int i38 = i15 >> 9;
                    boolean z110 = z7;
                    composer2 = composerStartRestartGroup;
                    OutlinedTextFieldKt.OutlinedTextField(textFieldValue3, (Function1<? super TextFieldValue, Unit>) objRememberedValue10, modifierOnPreviewKeyEvent3, z8, z19, textStyle3, (Function2<? super Composer, ? super Integer, Unit>) function18, (Function2<? super Composer, ? super Integer, Unit>) function17, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function19, z110, visualTransformation3, keyboardOptions4, keyboardActionsI3, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColors3, composer2, i36, i37 | (i38 & 57344) | (i38 & 458752) | ((i22 << 21) & 29360128), (i22 >> 3) & 896, 3936000);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function14 = function16;
                    function10 = function15;
                    z5 = z8;
                    textStyle2 = textStyle3;
                    function12 = function18;
                    function11 = function17;
                    function13 = function19;
                    z6 = z110;
                    visualTransformation2 = visualTransformation3;
                    keyboardOptions2 = keyboardOptions4;
                    textFieldColors2 = textFieldColors3;
                } else {
                    function9 = function1;
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    keyboardOptions2 = keyboardOptions;
                    function10 = function0;
                    function11 = function7;
                    function12 = function6;
                    z5 = z3;
                    function13 = function8;
                    textStyle2 = textStyle;
                    z6 = z2;
                    textFieldColors2 = textFieldColors;
                    function14 = function5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function1 function22 = function9;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                            yc2.d(str, function22, modifier, z5, function12, function11, function13, visualTransformation2, keyboardOptions2, function10, textStyle2, z6, textFieldColors2, function14, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i19 = i17 | RendererCapabilities.DECODER_SUPPORT_MASK;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8192) == 0) {
                    i27 = 2048;
                }
                i19 |= i27;
            }
            i21 = i19 | 24576;
            if ((i15 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z4, i15 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i26 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    if (i11 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation2;
                    }
                    if (i13 != 0) {
                        keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new w82(7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function15 = (Function0) objRememberedValue;
                    if ((i3 & 2048) != 0) {
                        bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                        i21 &= -113;
                    } else {
                        bodyMedium = textStyle;
                    }
                    if (i18 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    VisualTransformation visualTransformation9 = none;
                    if ((i3 & 8192) != 0) {
                        textFieldColorsM = m(composerStartRestartGroup);
                        i21 &= -7169;
                    } else {
                        textFieldColorsM = textFieldColors;
                    }
                    int i216 = i21;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new y82(6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function16 = (Function1) objRememberedValue2;
                    textFieldColors3 = textFieldColorsM;
                    textStyle3 = bodyMedium;
                    function17 = function7;
                    function18 = function6;
                    z8 = z3;
                    function19 = function8;
                    keyboardOptions4 = keyboardOptions3;
                    visualTransformation3 = visualTransformation9;
                    i22 = i216;
                } else {
                    if (i26 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    if (i11 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation2;
                    }
                    if (i13 != 0) {
                        keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new w82(7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function15 = (Function0) objRememberedValue;
                    if ((i3 & 2048) != 0) {
                        bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                        i21 &= -113;
                    } else {
                        bodyMedium = textStyle;
                    }
                    if (i18 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    VisualTransformation visualTransformation10 = none;
                    if ((i3 & 8192) != 0) {
                        textFieldColorsM = m(composerStartRestartGroup);
                        i21 &= -7169;
                    } else {
                        textFieldColorsM = textFieldColors;
                    }
                    int i217 = i21;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new y82(6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function16 = (Function1) objRememberedValue2;
                    textFieldColors3 = textFieldColorsM;
                    textStyle3 = bodyMedium;
                    function17 = function7;
                    function18 = function6;
                    z8 = z3;
                    function19 = function8;
                    keyboardOptions4 = keyboardOptions3;
                    visualTransformation3 = visualTransformation10;
                    i22 = i217;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1089588731, i15, i22, "com.dh.myembyapp.ui.theme.TvConfirmEditableOutlinedTextField (TvInput.kt:76)");
                }
                softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                coroutineScope = (CoroutineScope) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                    objRememberedValue4 = mutableStateMutableStateOf$default4;
                }
                mutableState = (MutableState) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    str2 = str;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    str2 = str;
                }
                mutableState2 = (MutableState) objRememberedValue5;
                String text4 = ((TextFieldValue) mutableState2.getValue()).getText();
                i23 = i15 & 14;
                if (i23 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z9) {
                    objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.LaunchedEffect(str2, text4, (Function2) objRememberedValue6, composerStartRestartGroup, i23);
                TextFieldValue textFieldValue4 = (TextFieldValue) mutableState2.getValue();
                if ((i22 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zChanged = z10 | composerStartRestartGroup.changed(softwareKeyboardController);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Modifier modifierOnFocusChanged4 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue7);
                i24 = i15 & 7168;
                if (i24 == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zChangedInstance = z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                Modifier modifierOnPreviewKeyEvent4 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged4, (Function1) objRememberedValue8);
                boolean z111 = !((Boolean) mutableState.getValue()).booleanValue();
                boolean zChanged5 = composerStartRestartGroup.changed(softwareKeyboardController);
                if ((1879048192 & i15) == 536870912) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zChanged5 | z12;
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (z13) {
                    objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                KeyboardActions keyboardActionsI4 = i((Function0) ((KFunction) objRememberedValue9));
                if ((i15 & Input.Keys.FORWARD_DEL) == 32) {
                }
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (z14) {
                    function9 = function1;
                    objRememberedValue10 = new r7(function9, mutableState2, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    function9 = function1;
                    objRememberedValue10 = new r7(function9, mutableState2, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                int i218 = i15 << 6;
                int i39 = ((i22 << 12) & 458752) | i24 | (3670016 & i218) | (i218 & 29360128);
                int i310 = ((i15 >> 12) & 896) | ((i22 << 3) & 7168);
                int i311 = i15 >> 9;
                boolean z112 = z7;
                composer2 = composerStartRestartGroup;
                OutlinedTextFieldKt.OutlinedTextField(textFieldValue4, (Function1<? super TextFieldValue, Unit>) objRememberedValue10, modifierOnPreviewKeyEvent4, z8, z111, textStyle3, (Function2<? super Composer, ? super Integer, Unit>) function18, (Function2<? super Composer, ? super Integer, Unit>) function17, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function19, z112, visualTransformation3, keyboardOptions4, keyboardActionsI4, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColors3, composer2, i39, i310 | (i311 & 57344) | (i311 & 458752) | ((i22 << 21) & 29360128), (i22 >> 3) & 896, 3936000);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function14 = function16;
                function10 = function15;
                z5 = z8;
                textStyle2 = textStyle3;
                function12 = function18;
                function11 = function17;
                function13 = function19;
                z6 = z112;
                visualTransformation2 = visualTransformation3;
                keyboardOptions2 = keyboardOptions4;
                textFieldColors2 = textFieldColors3;
            } else {
                function9 = function1;
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                keyboardOptions2 = keyboardOptions;
                function10 = function0;
                function11 = function7;
                function12 = function6;
                z5 = z3;
                function13 = function8;
                textStyle2 = textStyle;
                z6 = z2;
                textFieldColors2 = textFieldColors;
                function14 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function1 function23 = function9;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                        yc2.d(str, function23, modifier, z5, function12, function11, function13, visualTransformation2, keyboardOptions2, function10, textStyle2, z6, textFieldColors2, function14, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i4 |= 3072;
        z3 = z;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                function6 = function2;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
                visualTransformation2 = visualTransformation;
            } else {
                visualTransformation2 = visualTransformation;
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(visualTransformation2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(keyboardOptions)) {
                    i14 = 67108864;
                } else {
                    i14 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i4 |= i14;
            }
            i15 = i4 | 805306368;
            if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changed(true)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i16 = i2 | i25;
            } else {
                i16 = i2;
            }
            if ((i2 & 48) != 0) {
                i16 |= ((i3 & 2048) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 16 : 32;
            }
            i17 = i16;
            i18 = i3 & 4096;
            if (i18 != 0) {
                i19 = i17;
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i20 = 256;
                    } else {
                        i20 = 128;
                    }
                    i19 |= i20;
                }
                if ((i2 & 3072) != 0) {
                    if ((i3 & 8192) == 0) {
                        i27 = 2048;
                    }
                    i19 |= i27;
                }
                i21 = i19 | 24576;
                if ((i15 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (composerStartRestartGroup.shouldExecute(z4, i15 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i26 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        if (i11 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation2;
                        }
                        if (i13 != 0) {
                            keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new w82(7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function15 = (Function0) objRememberedValue;
                        if ((i3 & 2048) != 0) {
                            bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                            i21 &= -113;
                        } else {
                            bodyMedium = textStyle;
                        }
                        if (i18 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        VisualTransformation visualTransformation11 = none;
                        if ((i3 & 8192) != 0) {
                            textFieldColorsM = m(composerStartRestartGroup);
                            i21 &= -7169;
                        } else {
                            textFieldColorsM = textFieldColors;
                        }
                        int i219 = i21;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new y82(6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        function16 = (Function1) objRememberedValue2;
                        textFieldColors3 = textFieldColorsM;
                        textStyle3 = bodyMedium;
                        function17 = function7;
                        function18 = function6;
                        z8 = z3;
                        function19 = function8;
                        keyboardOptions4 = keyboardOptions3;
                        visualTransformation3 = visualTransformation11;
                        i22 = i219;
                    } else {
                        if (i26 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            function6 = null;
                        }
                        if (i7 != 0) {
                            function7 = null;
                        }
                        if (i9 != 0) {
                            function8 = null;
                        }
                        if (i11 != 0) {
                            none = VisualTransformation.INSTANCE.getNone();
                        } else {
                            none = visualTransformation2;
                        }
                        if (i13 != 0) {
                            keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                        } else {
                            keyboardOptions3 = keyboardOptions;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new w82(7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function15 = (Function0) objRememberedValue;
                        if ((i3 & 2048) != 0) {
                            bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                            i21 &= -113;
                        } else {
                            bodyMedium = textStyle;
                        }
                        if (i18 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        VisualTransformation visualTransformation12 = none;
                        if ((i3 & 8192) != 0) {
                            textFieldColorsM = m(composerStartRestartGroup);
                            i21 &= -7169;
                        } else {
                            textFieldColorsM = textFieldColors;
                        }
                        int i2110 = i21;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new y82(6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        function16 = (Function1) objRememberedValue2;
                        textFieldColors3 = textFieldColorsM;
                        textStyle3 = bodyMedium;
                        function17 = function7;
                        function18 = function6;
                        z8 = z3;
                        function19 = function8;
                        keyboardOptions4 = keyboardOptions3;
                        visualTransformation3 = visualTransformation12;
                        i22 = i2110;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1089588731, i15, i22, "com.dh.myembyapp.ui.theme.TvConfirmEditableOutlinedTextField (TvInput.kt:76)");
                    }
                    softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue3;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default5);
                        objRememberedValue4 = mutableStateMutableStateOf$default5;
                    }
                    mutableState = (MutableState) objRememberedValue4;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion2.getEmpty()) {
                        str2 = str;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        str2 = str;
                    }
                    mutableState2 = (MutableState) objRememberedValue5;
                    String text5 = ((TextFieldValue) mutableState2.getValue()).getText();
                    i23 = i15 & 14;
                    if (i23 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z9) {
                        objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    EffectsKt.LaunchedEffect(str2, text5, (Function2) objRememberedValue6, composerStartRestartGroup, i23);
                    TextFieldValue textFieldValue5 = (TextFieldValue) mutableState2.getValue();
                    if ((i22 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zChanged = z10 | composerStartRestartGroup.changed(softwareKeyboardController);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Modifier modifierOnFocusChanged5 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue7);
                    i24 = i15 & 7168;
                    if (i24 == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zChangedInstance = z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    Modifier modifierOnPreviewKeyEvent5 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged5, (Function1) objRememberedValue8);
                    boolean z113 = !((Boolean) mutableState.getValue()).booleanValue();
                    boolean zChanged6 = composerStartRestartGroup.changed(softwareKeyboardController);
                    if ((1879048192 & i15) == 536870912) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zChanged6 | z12;
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (z13) {
                        objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    KeyboardActions keyboardActionsI5 = i((Function0) ((KFunction) objRememberedValue9));
                    if ((i15 & Input.Keys.FORWARD_DEL) == 32) {
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (z14) {
                        function9 = function1;
                        objRememberedValue10 = new r7(function9, mutableState2, 18);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        function9 = function1;
                        objRememberedValue10 = new r7(function9, mutableState2, 18);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    int i2111 = i15 << 6;
                    int i312 = ((i22 << 12) & 458752) | i24 | (3670016 & i2111) | (i2111 & 29360128);
                    int i313 = ((i15 >> 12) & 896) | ((i22 << 3) & 7168);
                    int i314 = i15 >> 9;
                    boolean z114 = z7;
                    composer2 = composerStartRestartGroup;
                    OutlinedTextFieldKt.OutlinedTextField(textFieldValue5, (Function1<? super TextFieldValue, Unit>) objRememberedValue10, modifierOnPreviewKeyEvent5, z8, z113, textStyle3, (Function2<? super Composer, ? super Integer, Unit>) function18, (Function2<? super Composer, ? super Integer, Unit>) function17, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function19, z114, visualTransformation3, keyboardOptions4, keyboardActionsI5, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColors3, composer2, i312, i313 | (i314 & 57344) | (i314 & 458752) | ((i22 << 21) & 29360128), (i22 >> 3) & 896, 3936000);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function14 = function16;
                    function10 = function15;
                    z5 = z8;
                    textStyle2 = textStyle3;
                    function12 = function18;
                    function11 = function17;
                    function13 = function19;
                    z6 = z114;
                    visualTransformation2 = visualTransformation3;
                    keyboardOptions2 = keyboardOptions4;
                    textFieldColors2 = textFieldColors3;
                } else {
                    function9 = function1;
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    keyboardOptions2 = keyboardOptions;
                    function10 = function0;
                    function11 = function7;
                    function12 = function6;
                    z5 = z3;
                    function13 = function8;
                    textStyle2 = textStyle;
                    z6 = z2;
                    textFieldColors2 = textFieldColors;
                    function14 = function5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Function1 function24 = function9;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                            yc2.d(str, function24, modifier, z5, function12, function11, function13, visualTransformation2, keyboardOptions2, function10, textStyle2, z6, textFieldColors2, function14, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i19 = i17 | RendererCapabilities.DECODER_SUPPORT_MASK;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8192) == 0) {
                    i27 = 2048;
                }
                i19 |= i27;
            }
            i21 = i19 | 24576;
            if ((i15 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z4, i15 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i26 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    if (i11 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation2;
                    }
                    if (i13 != 0) {
                        keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new w82(7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function15 = (Function0) objRememberedValue;
                    if ((i3 & 2048) != 0) {
                        bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                        i21 &= -113;
                    } else {
                        bodyMedium = textStyle;
                    }
                    if (i18 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    VisualTransformation visualTransformation13 = none;
                    if ((i3 & 8192) != 0) {
                        textFieldColorsM = m(composerStartRestartGroup);
                        i21 &= -7169;
                    } else {
                        textFieldColorsM = textFieldColors;
                    }
                    int i2112 = i21;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new y82(6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function16 = (Function1) objRememberedValue2;
                    textFieldColors3 = textFieldColorsM;
                    textStyle3 = bodyMedium;
                    function17 = function7;
                    function18 = function6;
                    z8 = z3;
                    function19 = function8;
                    keyboardOptions4 = keyboardOptions3;
                    visualTransformation3 = visualTransformation13;
                    i22 = i2112;
                } else {
                    if (i26 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    if (i11 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation2;
                    }
                    if (i13 != 0) {
                        keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new w82(7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function15 = (Function0) objRememberedValue;
                    if ((i3 & 2048) != 0) {
                        bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                        i21 &= -113;
                    } else {
                        bodyMedium = textStyle;
                    }
                    if (i18 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    VisualTransformation visualTransformation14 = none;
                    if ((i3 & 8192) != 0) {
                        textFieldColorsM = m(composerStartRestartGroup);
                        i21 &= -7169;
                    } else {
                        textFieldColorsM = textFieldColors;
                    }
                    int i2113 = i21;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new y82(6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function16 = (Function1) objRememberedValue2;
                    textFieldColors3 = textFieldColorsM;
                    textStyle3 = bodyMedium;
                    function17 = function7;
                    function18 = function6;
                    z8 = z3;
                    function19 = function8;
                    keyboardOptions4 = keyboardOptions3;
                    visualTransformation3 = visualTransformation14;
                    i22 = i2113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1089588731, i15, i22, "com.dh.myembyapp.ui.theme.TvConfirmEditableOutlinedTextField (TvInput.kt:76)");
                }
                softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                coroutineScope = (CoroutineScope) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default6);
                    objRememberedValue4 = mutableStateMutableStateOf$default6;
                }
                mutableState = (MutableState) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    str2 = str;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    str2 = str;
                }
                mutableState2 = (MutableState) objRememberedValue5;
                String text6 = ((TextFieldValue) mutableState2.getValue()).getText();
                i23 = i15 & 14;
                if (i23 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z9) {
                    objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.LaunchedEffect(str2, text6, (Function2) objRememberedValue6, composerStartRestartGroup, i23);
                TextFieldValue textFieldValue6 = (TextFieldValue) mutableState2.getValue();
                if ((i22 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zChanged = z10 | composerStartRestartGroup.changed(softwareKeyboardController);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Modifier modifierOnFocusChanged6 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue7);
                i24 = i15 & 7168;
                if (i24 == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zChangedInstance = z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                Modifier modifierOnPreviewKeyEvent6 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged6, (Function1) objRememberedValue8);
                boolean z115 = !((Boolean) mutableState.getValue()).booleanValue();
                boolean zChanged7 = composerStartRestartGroup.changed(softwareKeyboardController);
                if ((1879048192 & i15) == 536870912) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zChanged7 | z12;
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (z13) {
                    objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                KeyboardActions keyboardActionsI6 = i((Function0) ((KFunction) objRememberedValue9));
                if ((i15 & Input.Keys.FORWARD_DEL) == 32) {
                }
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (z14) {
                    function9 = function1;
                    objRememberedValue10 = new r7(function9, mutableState2, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    function9 = function1;
                    objRememberedValue10 = new r7(function9, mutableState2, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                int i2114 = i15 << 6;
                int i315 = ((i22 << 12) & 458752) | i24 | (3670016 & i2114) | (i2114 & 29360128);
                int i316 = ((i15 >> 12) & 896) | ((i22 << 3) & 7168);
                int i317 = i15 >> 9;
                boolean z116 = z7;
                composer2 = composerStartRestartGroup;
                OutlinedTextFieldKt.OutlinedTextField(textFieldValue6, (Function1<? super TextFieldValue, Unit>) objRememberedValue10, modifierOnPreviewKeyEvent6, z8, z115, textStyle3, (Function2<? super Composer, ? super Integer, Unit>) function18, (Function2<? super Composer, ? super Integer, Unit>) function17, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function19, z116, visualTransformation3, keyboardOptions4, keyboardActionsI6, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColors3, composer2, i315, i316 | (i317 & 57344) | (i317 & 458752) | ((i22 << 21) & 29360128), (i22 >> 3) & 896, 3936000);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function14 = function16;
                function10 = function15;
                z5 = z8;
                textStyle2 = textStyle3;
                function12 = function18;
                function11 = function17;
                function13 = function19;
                z6 = z116;
                visualTransformation2 = visualTransformation3;
                keyboardOptions2 = keyboardOptions4;
                textFieldColors2 = textFieldColors3;
            } else {
                function9 = function1;
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                keyboardOptions2 = keyboardOptions;
                function10 = function0;
                function11 = function7;
                function12 = function6;
                z5 = z3;
                function13 = function8;
                textStyle2 = textStyle;
                z6 = z2;
                textFieldColors2 = textFieldColors;
                function14 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function1 function25 = function9;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                        yc2.d(str, function25, modifier, z5, function12, function11, function13, visualTransformation2, keyboardOptions2, function10, textStyle2, z6, textFieldColors2, function14, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i4 |= 24576;
        function6 = function2;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function7 = function3;
        } else {
            function7 = function3;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
            function8 = function4;
        } else {
            function8 = function4;
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function8)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
        }
        i11 = i3 & 128;
        if (i11 != 0) {
            i4 |= 12582912;
            visualTransformation2 = visualTransformation;
        } else {
            visualTransformation2 = visualTransformation;
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
        }
        i13 = i3 & 256;
        if (i13 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed(keyboardOptions)) {
                i14 = 67108864;
            } else {
                i14 = GroupFlagsKt.HasAuxSlotFlag;
            }
            i4 |= i14;
        }
        i15 = i4 | 805306368;
        if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changed(true)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i16 = i2 | i25;
        } else {
            i16 = i2;
        }
        if ((i2 & 48) != 0) {
            i16 |= ((i3 & 2048) == 0 || !composerStartRestartGroup.changed(textStyle)) ? 16 : 32;
        }
        i17 = i16;
        i18 = i3 & 4096;
        if (i18 != 0) {
            i19 = i17;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i20 = 256;
                } else {
                    i20 = 128;
                }
                i19 |= i20;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8192) == 0) {
                    i27 = 2048;
                }
                i19 |= i27;
            }
            i21 = i19 | 24576;
            if ((i15 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z4, i15 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i26 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    if (i11 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation2;
                    }
                    if (i13 != 0) {
                        keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new w82(7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function15 = (Function0) objRememberedValue;
                    if ((i3 & 2048) != 0) {
                        bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                        i21 &= -113;
                    } else {
                        bodyMedium = textStyle;
                    }
                    if (i18 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    VisualTransformation visualTransformation15 = none;
                    if ((i3 & 8192) != 0) {
                        textFieldColorsM = m(composerStartRestartGroup);
                        i21 &= -7169;
                    } else {
                        textFieldColorsM = textFieldColors;
                    }
                    int i2115 = i21;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new y82(6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function16 = (Function1) objRememberedValue2;
                    textFieldColors3 = textFieldColorsM;
                    textStyle3 = bodyMedium;
                    function17 = function7;
                    function18 = function6;
                    z8 = z3;
                    function19 = function8;
                    keyboardOptions4 = keyboardOptions3;
                    visualTransformation3 = visualTransformation15;
                    i22 = i2115;
                } else {
                    if (i26 != 0) {
                        z3 = true;
                    }
                    if (i5 != 0) {
                        function6 = null;
                    }
                    if (i7 != 0) {
                        function7 = null;
                    }
                    if (i9 != 0) {
                        function8 = null;
                    }
                    if (i11 != 0) {
                        none = VisualTransformation.INSTANCE.getNone();
                    } else {
                        none = visualTransformation2;
                    }
                    if (i13 != 0) {
                        keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    } else {
                        keyboardOptions3 = keyboardOptions;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new w82(7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function15 = (Function0) objRememberedValue;
                    if ((i3 & 2048) != 0) {
                        bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                        i21 &= -113;
                    } else {
                        bodyMedium = textStyle;
                    }
                    if (i18 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    VisualTransformation visualTransformation16 = none;
                    if ((i3 & 8192) != 0) {
                        textFieldColorsM = m(composerStartRestartGroup);
                        i21 &= -7169;
                    } else {
                        textFieldColorsM = textFieldColors;
                    }
                    int i2116 = i21;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new y82(6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function16 = (Function1) objRememberedValue2;
                    textFieldColors3 = textFieldColorsM;
                    textStyle3 = bodyMedium;
                    function17 = function7;
                    function18 = function6;
                    z8 = z3;
                    function19 = function8;
                    keyboardOptions4 = keyboardOptions3;
                    visualTransformation3 = visualTransformation16;
                    i22 = i2116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1089588731, i15, i22, "com.dh.myembyapp.ui.theme.TvConfirmEditableOutlinedTextField (TvInput.kt:76)");
                }
                softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                coroutineScope = (CoroutineScope) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default7);
                    objRememberedValue4 = mutableStateMutableStateOf$default7;
                }
                mutableState = (MutableState) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    str2 = str;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    str2 = str;
                }
                mutableState2 = (MutableState) objRememberedValue5;
                String text7 = ((TextFieldValue) mutableState2.getValue()).getText();
                i23 = i15 & 14;
                if (i23 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z9) {
                    objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.LaunchedEffect(str2, text7, (Function2) objRememberedValue6, composerStartRestartGroup, i23);
                TextFieldValue textFieldValue7 = (TextFieldValue) mutableState2.getValue();
                if ((i22 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zChanged = z10 | composerStartRestartGroup.changed(softwareKeyboardController);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Modifier modifierOnFocusChanged7 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue7);
                i24 = i15 & 7168;
                if (i24 == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zChangedInstance = z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                Modifier modifierOnPreviewKeyEvent7 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged7, (Function1) objRememberedValue8);
                boolean z117 = !((Boolean) mutableState.getValue()).booleanValue();
                boolean zChanged8 = composerStartRestartGroup.changed(softwareKeyboardController);
                if ((1879048192 & i15) == 536870912) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zChanged8 | z12;
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (z13) {
                    objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                KeyboardActions keyboardActionsI7 = i((Function0) ((KFunction) objRememberedValue9));
                if ((i15 & Input.Keys.FORWARD_DEL) == 32) {
                }
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (z14) {
                    function9 = function1;
                    objRememberedValue10 = new r7(function9, mutableState2, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    function9 = function1;
                    objRememberedValue10 = new r7(function9, mutableState2, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                int i2117 = i15 << 6;
                int i318 = ((i22 << 12) & 458752) | i24 | (3670016 & i2117) | (i2117 & 29360128);
                int i319 = ((i15 >> 12) & 896) | ((i22 << 3) & 7168);
                int i3110 = i15 >> 9;
                boolean z118 = z7;
                composer2 = composerStartRestartGroup;
                OutlinedTextFieldKt.OutlinedTextField(textFieldValue7, (Function1<? super TextFieldValue, Unit>) objRememberedValue10, modifierOnPreviewKeyEvent7, z8, z117, textStyle3, (Function2<? super Composer, ? super Integer, Unit>) function18, (Function2<? super Composer, ? super Integer, Unit>) function17, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function19, z118, visualTransformation3, keyboardOptions4, keyboardActionsI7, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColors3, composer2, i318, i319 | (i3110 & 57344) | (i3110 & 458752) | ((i22 << 21) & 29360128), (i22 >> 3) & 896, 3936000);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function14 = function16;
                function10 = function15;
                z5 = z8;
                textStyle2 = textStyle3;
                function12 = function18;
                function11 = function17;
                function13 = function19;
                z6 = z118;
                visualTransformation2 = visualTransformation3;
                keyboardOptions2 = keyboardOptions4;
                textFieldColors2 = textFieldColors3;
            } else {
                function9 = function1;
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                keyboardOptions2 = keyboardOptions;
                function10 = function0;
                function11 = function7;
                function12 = function6;
                z5 = z3;
                function13 = function8;
                textStyle2 = textStyle;
                z6 = z2;
                textFieldColors2 = textFieldColors;
                function14 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Function1 function26 = function9;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                        yc2.d(str, function26, modifier, z5, function12, function11, function13, visualTransformation2, keyboardOptions2, function10, textStyle2, z6, textFieldColors2, function14, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i19 = i17 | RendererCapabilities.DECODER_SUPPORT_MASK;
        if ((i2 & 3072) != 0) {
            if ((i3 & 8192) == 0) {
                i27 = 2048;
            }
            i19 |= i27;
        }
        i21 = i19 | 24576;
        if ((i15 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z4, i15 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i26 != 0) {
                    z3 = true;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                if (i11 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation2;
                }
                if (i13 != 0) {
                    keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                } else {
                    keyboardOptions3 = keyboardOptions;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new w82(7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function15 = (Function0) objRememberedValue;
                if ((i3 & 2048) != 0) {
                    bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                    i21 &= -113;
                } else {
                    bodyMedium = textStyle;
                }
                if (i18 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                VisualTransformation visualTransformation17 = none;
                if ((i3 & 8192) != 0) {
                    textFieldColorsM = m(composerStartRestartGroup);
                    i21 &= -7169;
                } else {
                    textFieldColorsM = textFieldColors;
                }
                int i2118 = i21;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new y82(6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                function16 = (Function1) objRememberedValue2;
                textFieldColors3 = textFieldColorsM;
                textStyle3 = bodyMedium;
                function17 = function7;
                function18 = function6;
                z8 = z3;
                function19 = function8;
                keyboardOptions4 = keyboardOptions3;
                visualTransformation3 = visualTransformation17;
                i22 = i2118;
            } else {
                if (i26 != 0) {
                    z3 = true;
                }
                if (i5 != 0) {
                    function6 = null;
                }
                if (i7 != 0) {
                    function7 = null;
                }
                if (i9 != 0) {
                    function8 = null;
                }
                if (i11 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation2;
                }
                if (i13 != 0) {
                    keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                } else {
                    keyboardOptions3 = keyboardOptions;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new w82(7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function15 = (Function0) objRememberedValue;
                if ((i3 & 2048) != 0) {
                    bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
                    i21 &= -113;
                } else {
                    bodyMedium = textStyle;
                }
                if (i18 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                VisualTransformation visualTransformation18 = none;
                if ((i3 & 8192) != 0) {
                    textFieldColorsM = m(composerStartRestartGroup);
                    i21 &= -7169;
                } else {
                    textFieldColorsM = textFieldColors;
                }
                int i2119 = i21;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new y82(6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                function16 = (Function1) objRememberedValue2;
                textFieldColors3 = textFieldColorsM;
                textStyle3 = bodyMedium;
                function17 = function7;
                function18 = function6;
                z8 = z3;
                function19 = function8;
                keyboardOptions4 = keyboardOptions3;
                visualTransformation3 = visualTransformation18;
                i22 = i2119;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1089588731, i15, i22, "com.dh.myembyapp.ui.theme.TvConfirmEditableOutlinedTextField (TvInput.kt:76)");
            }
            softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            coroutineScope = (CoroutineScope) objRememberedValue3;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                MutableState mutableStateMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default8);
                objRememberedValue4 = mutableStateMutableStateOf$default8;
            }
            mutableState = (MutableState) objRememberedValue4;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion2.getEmpty()) {
                str2 = str;
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                str2 = str;
            }
            mutableState2 = (MutableState) objRememberedValue5;
            String text8 = ((TextFieldValue) mutableState2.getValue()).getText();
            i23 = i15 & 14;
            if (i23 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z9) {
                objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new i8(str2, mutableState2, null, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.LaunchedEffect(str2, text8, (Function2) objRememberedValue6, composerStartRestartGroup, i23);
            TextFieldValue textFieldValue8 = (TextFieldValue) mutableState2.getValue();
            if ((i22 & 57344) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            zChanged = z10 | composerStartRestartGroup.changed(softwareKeyboardController);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new kc2(function16, softwareKeyboardController, mutableState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            Modifier modifierOnFocusChanged8 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue7);
            i24 = i15 & 7168;
            if (i24 == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            zChangedInstance = z11 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                objRememberedValue8 = new wc2(focusManager, mutableState, z8, coroutineScope, mutableState2, softwareKeyboardController);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Modifier modifierOnPreviewKeyEvent8 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged8, (Function1) objRememberedValue8);
            boolean z119 = !((Boolean) mutableState.getValue()).booleanValue();
            boolean zChanged9 = composerStartRestartGroup.changed(softwareKeyboardController);
            if ((1879048192 & i15) == 536870912) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zChanged9 | z12;
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z13) {
                objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                objRememberedValue9 = new xc2(function15, softwareKeyboardController, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            KeyboardActions keyboardActionsI8 = i((Function0) ((KFunction) objRememberedValue9));
            if ((i15 & Input.Keys.FORWARD_DEL) == 32) {
            }
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (z14) {
                function9 = function1;
                objRememberedValue10 = new r7(function9, mutableState2, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            } else {
                function9 = function1;
                objRememberedValue10 = new r7(function9, mutableState2, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            int i21110 = i15 << 6;
            int i3111 = ((i22 << 12) & 458752) | i24 | (3670016 & i21110) | (i21110 & 29360128);
            int i3112 = ((i15 >> 12) & 896) | ((i22 << 3) & 7168);
            int i3113 = i15 >> 9;
            boolean z1110 = z7;
            composer2 = composerStartRestartGroup;
            OutlinedTextFieldKt.OutlinedTextField(textFieldValue8, (Function1<? super TextFieldValue, Unit>) objRememberedValue10, modifierOnPreviewKeyEvent8, z8, z119, textStyle3, (Function2<? super Composer, ? super Integer, Unit>) function18, (Function2<? super Composer, ? super Integer, Unit>) function17, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function19, z1110, visualTransformation3, keyboardOptions4, keyboardActionsI8, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColors3, composer2, i3111, i3112 | (i3113 & 57344) | (i3113 & 458752) | ((i22 << 21) & 29360128), (i22 >> 3) & 896, 3936000);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function14 = function16;
            function10 = function15;
            z5 = z8;
            textStyle2 = textStyle3;
            function12 = function18;
            function11 = function17;
            function13 = function19;
            z6 = z1110;
            visualTransformation2 = visualTransformation3;
            keyboardOptions2 = keyboardOptions4;
            textFieldColors2 = textFieldColors3;
        } else {
            function9 = function1;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            keyboardOptions2 = keyboardOptions;
            function10 = function0;
            function11 = function7;
            function12 = function6;
            z5 = z3;
            function13 = function8;
            textStyle2 = textStyle;
            z6 = z2;
            textFieldColors2 = textFieldColors;
            function14 = function5;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1 function27 = function9;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: lc2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    yc2.d(str, function27, modifier, z5, function12, function11, function13, visualTransformation2, keyboardOptions2, function10, textStyle2, z6, textFieldColors2, function14, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(SoftwareKeyboardController softwareKeyboardController, MutableState mutableState) {
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            mutableState.setValue(Boolean.FALSE);
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
        }
    }

    public static final void f(boolean z, MutableState mutableState, Function1 function1, TextFieldValue textFieldValue, CoroutineScope coroutineScope, SoftwareKeyboardController softwareKeyboardController) {
        if (z) {
            mutableState.setValue(Boolean.TRUE);
            if (z) {
                function1.invoke(TextFieldValue.m7519copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, TextRangeKt.TextRange(textFieldValue.getText().length()), (TextRange) null, 5, (Object) null));
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new tc2(softwareKeyboardController, null, 0), 3, null);
            }
        }
    }

    public static final boolean g(KeyEvent keyEvent, boolean z, Function0 function0, Function0 function1, Function1 function2) {
        if (!KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            return false;
        }
        long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.INSTANCE;
        if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6007getEnterEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5993getDirectionCenterEK5gGoQ())) {
            if (z) {
                function1.invoke();
                return true;
            }
            function0.invoke();
            return true;
        }
        if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5999getDirectionUpEK5gGoQ())) {
            return h(z, function1, function2, FocusDirection.INSTANCE.m4800getUpdhqQ8s());
        }
        if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5994getDirectionDownEK5gGoQ())) {
            return h(z, function1, function2, FocusDirection.INSTANCE.m4793getDowndhqQ8s());
        }
        if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5997getDirectionLeftEK5gGoQ())) {
            return h(z, function1, function2, FocusDirection.INSTANCE.m4796getLeftdhqQ8s());
        }
        if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5998getDirectionRightEK5gGoQ())) {
            return h(z, function1, function2, FocusDirection.INSTANCE.m4799getRightdhqQ8s());
        }
        if ((!Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5936getBackEK5gGoQ()) && !Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6010getEscapeEK5gGoQ())) || !z) {
            return false;
        }
        function1.invoke();
        return true;
    }

    public static final boolean h(boolean z, Function0 function0, Function1 function1, int i) {
        if (z) {
            function0.invoke();
        }
        return ((Boolean) function1.invoke(FocusDirection.m4786boximpl(i))).booleanValue();
    }

    public static final KeyboardActions i(Function0 function0) {
        return new KeyboardActions(new tb(14, function0), new tb(15, function0), new tb(16, function0), new tb(17, function0), new tb(18, function0), new tb(19, function0));
    }

    public static final BorderStroke j(boolean z, Composer composer) {
        long primary;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1418410585, 0, -1, "com.dh.myembyapp.ui.theme.tvImmersiveInputBorder (TvInput.kt:385)");
        }
        float fM7813constructorimpl = Dp.m7813constructorimpl(z ? 2.0f : 1.0f);
        composer.startReplaceGroup(-1587934324);
        if (z) {
            composer.startReplaceGroup(-1981313928);
            composer.endReplaceGroup();
            primary = Color.INSTANCE.m5189getWhite0d7_KjU();
        } else if (hc2.t(composer)) {
            composer.startReplaceGroup(-1981238846);
            primary = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1981176753);
            composer.endReplaceGroup();
            primary = xq.d;
        }
        composer.endReplaceGroup();
        BorderStroke borderStrokeM301BorderStrokecXLIe8U = BorderStrokeKt.m301BorderStrokecXLIe8U(fM7813constructorimpl, primary);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM301BorderStrokecXLIe8U;
    }

    public static final BorderStroke k(boolean z, Composer composer) {
        long j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1611444372, 0, -1, "com.dh.myembyapp.ui.theme.tvInputBorder (TvInput.kt:372)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
        }
        u61 u61Var = (u61) composer.consume(n72.b);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        float fM7813constructorimpl = Dp.m7813constructorimpl(z ? 2.0f : 1.0f);
        if (z) {
            composer.startReplaceGroup(-1689620985);
            composer.endReplaceGroup();
            j = u61Var.b;
        } else {
            composer.startReplaceGroup(-1689567479);
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
            j = jM5151copywmQWz5c$default;
        }
        BorderStroke borderStrokeM301BorderStrokecXLIe8U = BorderStrokeKt.m301BorderStrokecXLIe8U(fM7813constructorimpl, j);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM301BorderStrokecXLIe8U;
    }

    public static final long l(boolean z, Composer composer) {
        long j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-266211941, 0, -1, "com.dh.myembyapp.ui.theme.tvInputContainerColor (TvInput.kt:362)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
        }
        u61 u61Var = (u61) composer.consume(n72.b);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if (z) {
            composer.startReplaceGroup(2084780082);
            composer.endReplaceGroup();
            j = u61Var.D;
        } else {
            composer.startReplaceGroup(2084839323);
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
            j = jM5151copywmQWz5c$default;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j;
    }

    public static final TextFieldColors m(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1952382518, 0, -1, "com.dh.myembyapp.ui.theme.tvOutlinedTextFieldColors (TvInput.kt:41)");
        }
        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i = MaterialTheme.$stable;
        long onSurface = materialTheme.getColorScheme(composer, i).getOnSurface();
        long onSurface2 = materialTheme.getColorScheme(composer, i).getOnSurface();
        long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getOnSurface(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getSurfaceVariant(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
        long jM5151copywmQWz5c$default3 = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getSurfaceVariant(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
        long jM5151copywmQWz5c$default4 = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getSurfaceVariant(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
        }
        u61 u61Var = (u61) composer.consume(n72.b);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        TextFieldColors textFieldColorsM2684colors0hiis_0 = outlinedTextFieldDefaults.m2684colors0hiis_0(onSurface, onSurface2, jM5151copywmQWz5c$default, 0L, jM5151copywmQWz5c$default2, jM5151copywmQWz5c$default3, jM5151copywmQWz5c$default4, 0L, materialTheme.getColorScheme(composer, i).getOnSurface(), 0L, null, u61Var.b, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getOutline(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getOutline(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, materialTheme.getColorScheme(composer, i).getOnSurfaceVariant(), materialTheme.getColorScheme(composer, i).getOnSurfaceVariant(), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getOnSurface(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getOnSurfaceVariant(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getOnSurfaceVariant(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, 0, 0, 0, 3072, 1686095496, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM2684colors0hiis_0;
    }
}
