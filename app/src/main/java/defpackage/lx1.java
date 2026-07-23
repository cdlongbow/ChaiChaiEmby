package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.api.ExternalHttpClient;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerIconEntry;
import com.dh.myembyapp.data.model.ServerIconLibrary;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.server.ServerIconLibraryInputServerManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lx1 {
    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0146  */
    /* JADX WARN: Code duplicated, block: B:105:0x014b  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0171  */
    /* JADX WARN: Code duplicated, block: B:111:0x017e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0197  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:127:0x0205  */
    /* JADX WARN: Code duplicated, block: B:128:0x0208  */
    /* JADX WARN: Code duplicated, block: B:131:0x021e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0223  */
    /* JADX WARN: Code duplicated, block: B:135:0x022c  */
    /* JADX WARN: Code duplicated, block: B:136:0x022f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0245  */
    /* JADX WARN: Code duplicated, block: B:141:0x0249  */
    /* JADX WARN: Code duplicated, block: B:142:0x024c  */
    /* JADX WARN: Code duplicated, block: B:145:0x025f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0267  */
    /* JADX WARN: Code duplicated, block: B:148:0x026a  */
    /* JADX WARN: Code duplicated, block: B:152:0x029e  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:158:0x02af  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:165:0x030f  */
    /* JADX WARN: Code duplicated, block: B:167:0x032f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0350  */
    /* JADX WARN: Code duplicated, block: B:173:0x0365  */
    /* JADX WARN: Code duplicated, block: B:181:0x0384  */
    /* JADX WARN: Code duplicated, block: B:183:0x038a  */
    /* JADX WARN: Code duplicated, block: B:186:0x039d  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:199:0x03de  */
    /* JADX WARN: Code duplicated, block: B:203:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:206:0x044f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0457  */
    /* JADX WARN: Code duplicated, block: B:212:0x0466  */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, Function0 function0, Modifier modifier, boolean z, cx1 cx1Var, final long j, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int iOrdinal;
        int i5;
        int i6;
        int i7;
        int i8;
        float f3;
        int i9;
        boolean z3;
        Modifier modifier2;
        boolean z4;
        float f4;
        float f5;
        cx1 cx1Var2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        float fM7813constructorimpl;
        float fM7813constructorimpl2;
        u61 u61VarY;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        int iOrdinal2;
        int i10;
        long jG;
        long jG2;
        ic2 ic2VarJ;
        float f6;
        float f7;
        long jM5189getWhite0d7_KjU;
        float f8;
        float f9;
        long jM5151copywmQWz5c$default;
        int i11;
        int i12;
        ButtonColors buttonColors;
        float f10;
        int iOrdinal3;
        MutableState mutableState2;
        int i13;
        boolean z5;
        int i14;
        long j2;
        ProvidableCompositionLocal providableCompositionLocal;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        float f11;
        long jM5151copywmQWz5c$default2;
        float f12;
        Object objRememberedValue2;
        ButtonColors buttonColorsI;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1262377756);
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
        int i16 = i2 & 8;
        if (i16 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (cx1Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = cx1Var.ordinal();
                }
                if (composerStartRestartGroup.changed(iOrdinal)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) != 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i3 |= i15;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
                f3 = f2;
            } else {
                f3 = f2;
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i16 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    cx1Var = cx1.a;
                } else {
                    cx1Var = cx1Var;
                }
                if (i6 != 0) {
                    fM7813constructorimpl = Dp.m7813constructorimpl(10.0f);
                } else {
                    fM7813constructorimpl = f;
                }
                if (i8 != 0) {
                    fM7813constructorimpl2 = Dp.m7813constructorimpl(6.0f);
                } else {
                    fM7813constructorimpl2 = f3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1262377756, i3, -1, "com.dh.myembyapp.ui.components.CenteredServerIconButton (ServerIconDialogs.kt:835)");
                }
                u61VarY = hg2.y(composerStartRestartGroup);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                iOrdinal2 = cx1Var.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        composerStartRestartGroup.startReplaceGroup(-1964225027);
                        buttonColorsI = hc2.i(jc2.c, z4, composerStartRestartGroup, ((i3 >> 6) & Input.Keys.FORWARD_DEL) | 6, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (iOrdinal2 == 2) {
                        composerStartRestartGroup.startReplaceGroup(-1964229390);
                        composerStartRestartGroup.endReplaceGroup();
                        qu.f();
                        return;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1964221894);
                        buttonColorsI = hc2.i(jc2.e, z4, composerStartRestartGroup, ((i3 >> 6) & Input.Keys.FORWARD_DEL) | 6, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    buttonColors = buttonColorsI;
                    u61VarY = u61VarY;
                    i3 = i3;
                    i11 = -1;
                    i12 = 6;
                } else {
                    cx1Var = cx1Var;
                    composerStartRestartGroup.startReplaceGroup(-1964227887);
                    i10 = (i3 >> 9) & 14;
                    jG = hc2.g(0, composerStartRestartGroup, 1);
                    jG2 = hc2.g(6, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2006963298, i10, -1, "com.dh.myembyapp.ui.theme.tvAccentActionButtonColors (TvButton.kt:172)");
                    }
                    composerStartRestartGroup.startReplaceGroup(251421472);
                    ic2VarJ = hc2.j(jc2.b, composerStartRestartGroup, 6);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    if (!hg2.v(composerStartRestartGroup)) {
                        jG = ic2VarJ.a;
                    }
                    if (z4) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.4f;
                    }
                    long jM5151copywmQWz5c$default3 = Color.m5151copywmQWz5c$default(jG, f6, 0.0f, 0.0f, 0.0f, 14, null);
                    if (!hg2.v(composerStartRestartGroup)) {
                        jG2 = hc2.a;
                    }
                    long j3 = jG2;
                    if (z4) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.4f;
                    }
                    long jM5151copywmQWz5c$default4 = Color.m5151copywmQWz5c$default(j3, f7, 0.0f, 0.0f, 0.0f, 14, null);
                    if (hg2.v(composerStartRestartGroup)) {
                        jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                    } else {
                        jM5189getWhite0d7_KjU = ic2VarJ.c;
                    }
                    long j4 = jM5189getWhite0d7_KjU;
                    if (z4) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.4f;
                    }
                    long jM5151copywmQWz5c$default5 = Color.m5151copywmQWz5c$default(j4, f8, 0.0f, 0.0f, 0.0f, 14, null);
                    if (hg2.v(composerStartRestartGroup)) {
                        long jM5189getWhite0d7_KjU2 = Color.INSTANCE.m5189getWhite0d7_KjU();
                        if (z4) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.4f;
                        }
                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(jM5189getWhite0d7_KjU2, f9, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        long j5 = hc2.b;
                        if (z4) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.4f;
                        }
                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(j5, f10, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    i11 = -1;
                    i12 = 6;
                    ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(jM5151copywmQWz5c$default3, jM5151copywmQWz5c$default5, jM5151copywmQWz5c$default4, jM5151copywmQWz5c$default, 0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 24, PsExtractor.VIDEO_STREAM_MASK);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    buttonColors = buttonColorsM8228colorsoq7We08;
                }
                iOrdinal3 = cx1Var.ordinal();
                if (iOrdinal3 != 0) {
                    mutableState2 = mutableState;
                    i13 = i3;
                    z5 = true;
                    composerStartRestartGroup.startReplaceGroup(-1964217138);
                    boolean zBooleanValue3 = ((Boolean) mutableState2.getValue()).booleanValue();
                    i14 = (i13 >> 6) & Input.Keys.FORWARD_DEL;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1176554219, i14, i11, "com.dh.myembyapp.ui.theme.tvAccentActionButtonContentColor (TvButton.kt:202)");
                    }
                    j2 = hc2.j(jc2.b, composerStartRestartGroup, i12).c;
                    composerStartRestartGroup.startReplaceGroup(1092212051);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1159792958, i12, i11, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                    }
                    providableCompositionLocal = n72.g;
                    zBooleanValue = ((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    if (zBooleanValue && zBooleanValue3) {
                        jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(hc2.b, z4 ? 1.0f : 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1159792958, i12, i11, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                        }
                        zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        if (zBooleanValue2) {
                            long jM5189getWhite0d7_KjU3 = Color.INSTANCE.m5189getWhite0d7_KjU();
                            if (z4) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.4f;
                            }
                            jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(jM5189getWhite0d7_KjU3, f11, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            if (z4) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.4f;
                            }
                            jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(j2, f12, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else if (iOrdinal3 != 1) {
                    z5 = true;
                    i13 = i3;
                    mutableState2 = mutableState;
                    composerStartRestartGroup.startReplaceGroup(-1964212299);
                    jM5151copywmQWz5c$default2 = hc2.k(jc2.c, ((Boolean) mutableState2.getValue()).booleanValue(), z4, composerStartRestartGroup, ((i13 >> 3) & 896) | i12, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (iOrdinal3 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-1964218465);
                    composerStartRestartGroup.endReplaceGroup();
                    qu.f();
                    return;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1964206350);
                    z5 = true;
                    mutableState2 = mutableState;
                    i13 = i3;
                    jM5151copywmQWz5c$default2 = hc2.k(jc2.e, ((Boolean) mutableState.getValue()).booleanValue(), z4, composerStartRestartGroup, ((i3 >> 3) & 896) | i12, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                final long j6 = jM5151copywmQWz5c$default2;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new li1(21, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                modifier2 = modifier;
                ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifier2, (Function1) objRememberedValue2), null, z4, hc2.l(1.04f), el0.a(u61VarY), null, buttonColors, 0.0f, hc2.h(composerStartRestartGroup), PaddingKt.m993PaddingValuesYgX7TsA(fM7813constructorimpl, fM7813constructorimpl2), null, ComposableLambdaKt.rememberComposableLambda(-1473330476, z5, new Function3() { // from class: ix1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((RowScope) obj).getClass();
                        if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1473330476, iIntValue, -1, "com.dh.myembyapp.ui.components.CenteredServerIconButton.<anonymous> (ServerIconDialogs.kt:872)");
                            }
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m5142boximpl(j6)), ComposableLambdaKt.rememberComposableLambda(994895764, true, new o9(str, j), composer2, 54), composer2, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 3) & 14) | (i13 & 7168), RendererCapabilities.DECODER_SUPPORT_MASK, 2372);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = fM7813constructorimpl;
                f4 = fM7813constructorimpl2;
            } else {
                modifier2 = modifier;
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                f4 = f3;
                f5 = f;
            }
            cx1Var2 = cx1Var;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier2, z4, cx1Var2, j, f5, f4, i, i2, 0));
            }
        }
        i3 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (cx1Var == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = cx1Var.ordinal();
            }
            if (composerStartRestartGroup.changed(iOrdinal)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i) != 0) {
            if (composerStartRestartGroup.changed(j)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i3 |= i15;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
            f3 = f2;
        } else {
            f3 = f2;
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
        }
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i16 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (i4 != 0) {
                cx1Var = cx1.a;
            } else {
                cx1Var = cx1Var;
            }
            if (i6 != 0) {
                fM7813constructorimpl = Dp.m7813constructorimpl(10.0f);
            } else {
                fM7813constructorimpl = f;
            }
            if (i8 != 0) {
                fM7813constructorimpl2 = Dp.m7813constructorimpl(6.0f);
            } else {
                fM7813constructorimpl2 = f3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1262377756, i3, -1, "com.dh.myembyapp.ui.components.CenteredServerIconButton (ServerIconDialogs.kt:835)");
            }
            u61VarY = hg2.y(composerStartRestartGroup);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            iOrdinal2 = cx1Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    composerStartRestartGroup.startReplaceGroup(-1964225027);
                    buttonColorsI = hc2.i(jc2.c, z4, composerStartRestartGroup, ((i3 >> 6) & Input.Keys.FORWARD_DEL) | 6, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (iOrdinal2 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-1964229390);
                    composerStartRestartGroup.endReplaceGroup();
                    qu.f();
                    return;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1964221894);
                    buttonColorsI = hc2.i(jc2.e, z4, composerStartRestartGroup, ((i3 >> 6) & Input.Keys.FORWARD_DEL) | 6, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                buttonColors = buttonColorsI;
                u61VarY = u61VarY;
                i3 = i3;
                i11 = -1;
                i12 = 6;
            } else {
                cx1Var = cx1Var;
                composerStartRestartGroup.startReplaceGroup(-1964227887);
                i10 = (i3 >> 9) & 14;
                jG = hc2.g(0, composerStartRestartGroup, 1);
                jG2 = hc2.g(6, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2006963298, i10, -1, "com.dh.myembyapp.ui.theme.tvAccentActionButtonColors (TvButton.kt:172)");
                }
                composerStartRestartGroup.startReplaceGroup(251421472);
                ic2VarJ = hc2.j(jc2.b, composerStartRestartGroup, 6);
                ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                if (!hg2.v(composerStartRestartGroup)) {
                    jG = ic2VarJ.a;
                }
                if (z4) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.4f;
                }
                long jM5151copywmQWz5c$default6 = Color.m5151copywmQWz5c$default(jG, f6, 0.0f, 0.0f, 0.0f, 14, null);
                if (!hg2.v(composerStartRestartGroup)) {
                    jG2 = hc2.a;
                }
                long j7 = jG2;
                if (z4) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.4f;
                }
                long jM5151copywmQWz5c$default7 = Color.m5151copywmQWz5c$default(j7, f7, 0.0f, 0.0f, 0.0f, 14, null);
                if (hg2.v(composerStartRestartGroup)) {
                    jM5189getWhite0d7_KjU = ic2VarJ.c;
                } else {
                    jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                }
                long j8 = jM5189getWhite0d7_KjU;
                if (z4) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.4f;
                }
                long jM5151copywmQWz5c$default8 = Color.m5151copywmQWz5c$default(j8, f8, 0.0f, 0.0f, 0.0f, 14, null);
                if (hg2.v(composerStartRestartGroup)) {
                    long j9 = hc2.b;
                    if (z4) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.4f;
                    }
                    jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(j9, f10, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    long jM5189getWhite0d7_KjU4 = Color.INSTANCE.m5189getWhite0d7_KjU();
                    if (z4) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.4f;
                    }
                    jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(jM5189getWhite0d7_KjU4, f9, 0.0f, 0.0f, 0.0f, 14, null);
                }
                i11 = -1;
                i12 = 6;
                ButtonColors buttonColorsM8228colorsoq7We09 = buttonDefaults2.m8228colorsoq7We08(jM5151copywmQWz5c$default6, jM5151copywmQWz5c$default8, jM5151copywmQWz5c$default7, jM5151copywmQWz5c$default, 0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 24, PsExtractor.VIDEO_STREAM_MASK);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                buttonColors = buttonColorsM8228colorsoq7We09;
            }
            iOrdinal3 = cx1Var.ordinal();
            if (iOrdinal3 != 0) {
                mutableState2 = mutableState;
                i13 = i3;
                z5 = true;
                composerStartRestartGroup.startReplaceGroup(-1964217138);
                boolean zBooleanValue4 = ((Boolean) mutableState2.getValue()).booleanValue();
                i14 = (i13 >> 6) & Input.Keys.FORWARD_DEL;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1176554219, i14, i11, "com.dh.myembyapp.ui.theme.tvAccentActionButtonContentColor (TvButton.kt:202)");
                }
                j2 = hc2.j(jc2.b, composerStartRestartGroup, i12).c;
                composerStartRestartGroup.startReplaceGroup(1092212051);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1159792958, i12, i11, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                }
                providableCompositionLocal = n72.g;
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                if (zBooleanValue) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1159792958, i12, i11, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                    }
                    zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    if (zBooleanValue2) {
                        if (z4) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.4f;
                        }
                        jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(j2, f12, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        long jM5189getWhite0d7_KjU5 = Color.INSTANCE.m5189getWhite0d7_KjU();
                        if (z4) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.4f;
                        }
                        jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(jM5189getWhite0d7_KjU5, f11, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1159792958, i12, i11, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                    }
                    zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    if (zBooleanValue2) {
                        if (z4) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.4f;
                        }
                        jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(j2, f12, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        long jM5189getWhite0d7_KjU6 = Color.INSTANCE.m5189getWhite0d7_KjU();
                        if (z4) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.4f;
                        }
                        jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(jM5189getWhite0d7_KjU6, f11, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (iOrdinal3 != 1) {
                z5 = true;
                i13 = i3;
                mutableState2 = mutableState;
                composerStartRestartGroup.startReplaceGroup(-1964212299);
                jM5151copywmQWz5c$default2 = hc2.k(jc2.c, ((Boolean) mutableState2.getValue()).booleanValue(), z4, composerStartRestartGroup, ((i13 >> 3) & 896) | i12, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (iOrdinal3 == 2) {
                composerStartRestartGroup.startReplaceGroup(-1964218465);
                composerStartRestartGroup.endReplaceGroup();
                qu.f();
                return;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1964206350);
                z5 = true;
                mutableState2 = mutableState;
                i13 = i3;
                jM5151copywmQWz5c$default2 = hc2.k(jc2.e, ((Boolean) mutableState.getValue()).booleanValue(), z4, composerStartRestartGroup, ((i3 >> 3) & 896) | i12, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            final long j10 = jM5151copywmQWz5c$default2;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new li1(21, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            modifier2 = modifier;
            ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifier2, (Function1) objRememberedValue2), null, z4, hc2.l(1.04f), el0.a(u61VarY), null, buttonColors, 0.0f, hc2.h(composerStartRestartGroup), PaddingKt.m993PaddingValuesYgX7TsA(fM7813constructorimpl, fM7813constructorimpl2), null, ComposableLambdaKt.rememberComposableLambda(-1473330476, z5, new Function3() { // from class: ix1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((RowScope) obj).getClass();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1473330476, iIntValue, -1, "com.dh.myembyapp.ui.components.CenteredServerIconButton.<anonymous> (ServerIconDialogs.kt:872)");
                        }
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m5142boximpl(j10)), ComposableLambdaKt.rememberComposableLambda(994895764, true, new o9(str, j), composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 3) & 14) | (i13 & 7168), RendererCapabilities.DECODER_SUPPORT_MASK, 2372);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = fM7813constructorimpl;
            f4 = fM7813constructorimpl2;
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
            f4 = f3;
            f5 = f;
        }
        cx1Var2 = cx1Var;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jx1(str, function0, modifier2, z4, cx1Var2, j, f5, f4, i, i2, 0));
        }
    }

    public static final void b(ServerIconEntry serverIconEntry, ks1 ks1Var, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-900516729);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(serverIconEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(ks1Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-900516729, i2, -1, "com.dh.myembyapp.ui.components.ServerIconGridItem (ServerIconDialogs.kt:896)");
            }
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(142.0f));
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant();
            int i3 = CardDefaults.$stable;
            CardColors cardColorsM8247colors5tl4gsc = cardDefaults.m8247colors5tl4gsc(surfaceVariant, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i3 << 18, 62);
            float fM7813constructorimpl = Dp.m7813constructorimpl(2.0f);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            CardKt.Card(function0, modifierM1050height3ABfNKs, null, null, cardColorsM8247colors5tl4gsc, CardDefaults.scale$default(cardDefaults, 0.0f, 1.05f, 0.0f, 5, null), cardDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(fM7813constructorimpl, u61Var.b), 0.0f, null, 6, null), null, composerStartRestartGroup, i3 << 9, 5), null, null, ComposableLambdaKt.rememberComposableLambda(1188201681, true, new p8(13, serverIconEntry, ks1Var), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 805306416, 396);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 27, serverIconEntry, ks1Var, function0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:77:0x015f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0164  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:84:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, String str2, Modifier modifier, ContentScale contentScale, Composer composer, int i, int i2) {
        int i3;
        ContentScale contentScale2;
        boolean z;
        ContentScale contentScale3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        ContentScale fit;
        Context context;
        boolean z2;
        Object objRememberedValue;
        Object objM8825constructorimpl;
        Boolean bool;
        String str3;
        File file;
        Composer composerStartRestartGroup = composer.startRestartGroup(-490366441);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                contentScale2 = contentScale;
                i3 |= composerStartRestartGroup.changed(contentScale2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i4 != 0) {
                    fit = ContentScale.INSTANCE.getFit();
                } else {
                    fit = contentScale2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-490366441, i3, -1, "com.dh.myembyapp.ui.components.ServerIconImage (ServerIconDialogs.kt:101)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = null;
                    if (str != null) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM8825constructorimpl = Result.m8825constructorimpl(Boolean.valueOf(new File(str).isFile()));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                        }
                        bool = Boolean.FALSE;
                        if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
                            objM8825constructorimpl = bool;
                        }
                        if (((Boolean) objM8825constructorimpl).booleanValue()) {
                            str3 = str;
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                            objRememberedValue = new File(str3);
                        }
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                file = (File) objRememberedValue;
                if (file != null) {
                    composerStartRestartGroup.startReplaceGroup(-1322451819);
                    bs0 bs0Var = new bs0(context);
                    bs0Var.c = file;
                    hs0.a(bs0Var, true);
                    fs0 fs0VarA = bs0Var.a();
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(zr1.emby_logo, composerStartRestartGroup, 0);
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(zr1.emby_logo, composerStartRestartGroup, 0);
                    int i5 = Painter.$stable;
                    ContentScale contentScale4 = fit;
                    g12.b(fs0VarA, str2, modifier, painterPainterResource, painterPainterResource2, null, null, null, null, contentScale4, composerStartRestartGroup, (i3 & 1008) | (i5 << 9) | (i5 << 12), (i3 >> 9) & 14, 31712);
                    fit = contentScale4;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1322018005);
                    ImageKt.Image(PainterResources_androidKt.painterResource(zr1.emby_logo, composerStartRestartGroup, 0), str2, modifier, (Alignment) null, fit, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344), 104);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                contentScale3 = fit;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                contentScale3 = contentScale2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new c2(str, str2, modifier, contentScale3, i, i2, 8));
            }
        }
        i3 |= 3072;
        contentScale2 = contentScale;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i4 != 0) {
                fit = ContentScale.INSTANCE.getFit();
            } else {
                fit = contentScale2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-490366441, i3, -1, "com.dh.myembyapp.ui.components.ServerIconImage (ServerIconDialogs.kt:101)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue = null;
                if (str != null) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(Boolean.valueOf(new File(str).isFile()));
                    bool = Boolean.FALSE;
                    if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
                        objM8825constructorimpl = bool;
                    }
                    if (((Boolean) objM8825constructorimpl).booleanValue()) {
                        str3 = str;
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        objRememberedValue = new File(str3);
                    }
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = null;
                if (str != null) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(Boolean.valueOf(new File(str).isFile()));
                    bool = Boolean.FALSE;
                    if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
                        objM8825constructorimpl = bool;
                    }
                    if (((Boolean) objM8825constructorimpl).booleanValue()) {
                        str3 = str;
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        objRememberedValue = new File(str3);
                    }
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            file = (File) objRememberedValue;
            if (file != null) {
                composerStartRestartGroup.startReplaceGroup(-1322451819);
                bs0 bs0Var2 = new bs0(context);
                bs0Var2.c = file;
                hs0.a(bs0Var2, true);
                fs0 fs0VarA2 = bs0Var2.a();
                Painter painterPainterResource3 = PainterResources_androidKt.painterResource(zr1.emby_logo, composerStartRestartGroup, 0);
                Painter painterPainterResource4 = PainterResources_androidKt.painterResource(zr1.emby_logo, composerStartRestartGroup, 0);
                int i6 = Painter.$stable;
                ContentScale contentScale5 = fit;
                g12.b(fs0VarA2, str2, modifier, painterPainterResource3, painterPainterResource4, null, null, null, null, contentScale5, composerStartRestartGroup, (i3 & 1008) | (i6 << 9) | (i6 << 12), (i3 >> 9) & 14, 31712);
                fit = contentScale5;
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1322018005);
                ImageKt.Image(PainterResources_androidKt.painterResource(zr1.emby_logo, composerStartRestartGroup, 0), str2, modifier, (Alignment) null, fit, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | (i3 & Input.Keys.FORWARD_DEL) | (i3 & 896) | ((i3 << 3) & 57344), 104);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            contentScale3 = fit;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            contentScale3 = contentScale2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c2(str, str2, modifier, contentScale3, i, i2, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void d(String str, ServerIconLibraryInputServerManager serverIconLibraryInputServerManager, Function0 function0, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function2;
        String str2;
        ServerIconLibraryInputServerManager serverIconLibraryInputServerManager2;
        Composer composer2;
        Object x91Var;
        int i3;
        MutableState mutableState;
        MutableState mutableState2;
        Bitmap bitmapY;
        Object fx1Var;
        FocusRequester focusRequester;
        SoftwareKeyboardController softwareKeyboardController;
        Object r0;
        boolean z;
        CoroutineScope coroutineScope;
        str.getClass();
        serverIconLibraryInputServerManager.getClass();
        function0.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1268047001);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(serverIconLibraryInputServerManager) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function2 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1268047001, i2, -1, "com.dh.myembyapp.ui.components.ServerIconLibraryUrlDialog (ServerIconDialogs.kt:137)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue2;
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue6;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(serverIconLibraryInputServerManager) | (i4 == 4) | composerStartRestartGroup.changed(mutableState3) | ((i2 & 7168) == 2048);
            int i5 = i2 & 896;
            boolean z3 = zChangedInstance | (i5 == 256);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue7 == companion.getEmpty()) {
                i3 = i4;
                mutableState = mutableState3;
                Function1 function3 = function2;
                mutableState2 = mutableState4;
                x91Var = new x91(serverIconLibraryInputServerManager, str, function3, function0, mutableState, mutableState2, mutableState5, (Continuation) null);
                serverIconLibraryInputServerManager2 = serverIconLibraryInputServerManager;
                mutableState5 = mutableState5;
                str2 = str;
                composerStartRestartGroup.updateRememberedValue(x91Var);
            } else {
                x91Var = objRememberedValue7;
                mutableState2 = mutableState4;
                i3 = i4;
                mutableState = mutableState3;
                str2 = str;
                serverIconLibraryInputServerManager2 = serverIconLibraryInputServerManager;
            }
            EffectsKt.LaunchedEffect(str2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) x91Var, composerStartRestartGroup, i3);
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(serverIconLibraryInputServerManager2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new kh1(serverIconLibraryInputServerManager2, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue8, composerStartRestartGroup, 6);
            boolean zChanged = composerStartRestartGroup.changed((String) mutableState2.getValue());
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue9 == companion.getEmpty()) {
                String str3 = (String) mutableState2.getValue();
                if (str3 == null || StringsKt.isBlank(str3)) {
                    bitmapY = null;
                } else {
                    String str4 = (String) mutableState2.getValue();
                    str4.getClass();
                    bitmapY = ku.y(280, 280, str4);
                }
                composerStartRestartGroup.updateRememberedValue(bitmapY);
                objRememberedValue9 = bitmapY;
            }
            Bitmap bitmap = (Bitmap) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new ji(focusRequester2, null, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 6);
            boolean zChanged2 = composerStartRestartGroup.changed(softwareKeyboardController2) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changedInstance(coroutineScope2) | (i5 == 256);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue11 == companion.getEmpty()) {
                focusRequester = focusRequester2;
                softwareKeyboardController = softwareKeyboardController2;
                r0 = 0;
                z = true;
                fx1Var = new fx1(softwareKeyboardController, focusManager, function0, mutableState6, coroutineScope2, focusRequester, 0);
                coroutineScope = coroutineScope2;
                composerStartRestartGroup.updateRememberedValue(fx1Var);
            } else {
                coroutineScope = coroutineScope2;
                focusRequester = focusRequester2;
                softwareKeyboardController = softwareKeyboardController2;
                r0 = 0;
                fx1Var = objRememberedValue11;
                z = true;
            }
            BackHandlerKt.BackHandler(z, (Function0) fx1Var, composerStartRestartGroup, 6, r0);
            Object r9 = ((((composerStartRestartGroup.changed(softwareKeyboardController) ? 1 : 0) | (composerStartRestartGroup.changedInstance(focusManager) ? 1 : 0)) | (composerStartRestartGroup.changedInstance(coroutineScope) ? 1 : 0)) == true ? 1 : 0) | (i5 == 256 ? z : r0);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (r9 != 0 || objRememberedValue12 == companion.getEmpty()) {
                fx1 fx1Var2 = new fx1(softwareKeyboardController, focusManager, function0, mutableState6, coroutineScope, focusRequester, 1);
                composerStartRestartGroup.updateRememberedValue(fx1Var2);
                objRememberedValue12 = fx1Var2;
            }
            MutableState mutableState7 = mutableState2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue12, new DialogProperties(z, (boolean) r0, (boolean) r0), ComposableLambdaKt.rememberComposableLambda(1397904446, z, new gx1(bitmap, mutableState7, mutableState5, mutableState, mutableState6, function0, softwareKeyboardController, focusManager, function1, focusRequester, 0), composerStartRestartGroup, 54), composer2, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str2 = str;
            serverIconLibraryInputServerManager2 = serverIconLibraryInputServerManager;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5((Object) str2, (Object) serverIconLibraryInputServerManager2, function0, (Object) function1, i, 21));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Function0 function0, MutableState mutableState, CoroutineScope coroutineScope, FocusRequester focusRequester) {
        if (!((Boolean) mutableState.getValue()).booleanValue()) {
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            focusManager.clearFocus(true);
            function0.invoke();
            return;
        }
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        focusManager.clearFocus(true);
        mutableState.setValue(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ji(focusRequester, null, 19), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(ServerConfig serverConfig, px1 px1Var, ServerIconLibraryInputServerManager serverIconLibraryInputServerManager, Function0 function0, Function1 function1, Function1 function2, Composer composer, int i) {
        Composer composer2;
        int i2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i3;
        MutableState mutableState;
        int i4;
        List<ServerIconEntry> listEmptyList;
        MutableState mutableState2;
        UserPreferences userPreferences;
        MutableState mutableState3;
        Object obj;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        int i5;
        CoroutineScope coroutineScope;
        int i6;
        Composer composer3;
        MutableState mutableState7;
        boolean z;
        Composer composer4;
        Composer composer5;
        Function0 function3 = function0;
        px1Var.getClass();
        serverIconLibraryInputServerManager.getClass();
        function3.getClass();
        function1.getClass();
        function2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1169517766);
        int i7 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(serverConfig) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(px1Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(serverIconLibraryInputServerManager) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i7) != 74898, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1169517766, i7, -1, "com.dh.myembyapp.ui.components.ServerIconPickerDialog (ServerIconDialogs.kt:342)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new UserPreferences(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            UserPreferences userPreferences2 = (UserPreferences) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(context);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = ExternalHttpClient.createDownloadClient$default(ExternalHttpClient.INSTANCE, null, false, true, 3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            OkHttpClient okHttpClient = (OkHttpClient) objRememberedValue2;
            boolean zChanged2 = composerStartRestartGroup.changed(context) | composerStartRestartGroup.changed(okHttpClient);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                xr0 xr0Var = new xr0(context);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                arrayList4.add(new z7(10, new m81(new c71(new o61(okHttpClient, 1), 3)), Reflection.getOrCreateKotlinClass(rd2.class)));
                xr0Var.e = new ds(ku.P(arrayList), ku.P(arrayList2), ku.P(arrayList3), ku.P(arrayList4), ku.P(arrayList5));
                ri riVar = hs0.a;
                ri riVar2 = is0.a;
                xr0Var.f.a.put(is0.a, new zv(200));
                objRememberedValue3 = xr0Var.a();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ks1 ks1Var = (ks1) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue4;
            boolean zChanged3 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                String serverIconLibraryUrl = userPreferences2.getServerIconLibraryUrl();
                objRememberedValue5 = serverIconLibraryUrl == null ? "" : serverIconLibraryUrl;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            String str = (String) objRememberedValue5;
            boolean zChanged4 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue6;
            boolean zChanged5 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue7 == companion.getEmpty()) {
                i2 = 2;
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                i2 = 2;
            }
            MutableState mutableState9 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState10 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue9 = mutableStateMutableStateOf$default;
            }
            MutableState mutableState11 = (MutableState) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                i3 = 2;
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            } else {
                snapshotMutationPolicy = null;
                i3 = 2;
            }
            MutableState mutableState12 = (MutableState) objRememberedValue10;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            MutableState mutableState13 = (MutableState) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            MutableState mutableState14 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue13 = mutableStateMutableStateOf$default2;
            }
            MutableState mutableState15 = (MutableState) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            MutableState mutableState16 = (MutableState) objRememberedValue14;
            String str2 = !StringsKt.isBlank((String) mutableState8.getValue()) ? "编辑图标库 URL" : "添加图标库 URL";
            String id = serverConfig.getId();
            boolean zChanged6 = composerStartRestartGroup.changed(mutableState8) | composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(px1Var) | composerStartRestartGroup.changed(mutableState9) | composerStartRestartGroup.changedInstance(userPreferences2);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue15 == companion.getEmpty()) {
                mutableState = mutableState8;
                i4 = 0;
                listEmptyList = null;
                objRememberedValue15 = new dy(mutableState, coroutineScope2, mutableState10, px1Var, mutableState11, userPreferences2, mutableState9, mutableState13, (Continuation) null);
                mutableState2 = mutableState10;
                userPreferences = userPreferences2;
                mutableState9 = mutableState9;
                mutableState3 = mutableState11;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            } else {
                mutableState = mutableState8;
                mutableState2 = mutableState10;
                i4 = 0;
                userPreferences = userPreferences2;
                mutableState3 = mutableState11;
                listEmptyList = null;
            }
            EffectsKt.LaunchedEffect(id, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, i4);
            boolean zChanged7 = composerStartRestartGroup.changed((ServerIconLibrary) mutableState9.getValue()) | composerStartRestartGroup.changed((String) mutableState13.getValue());
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue16 == companion.getEmpty()) {
                obj = objRememberedValue16;
                String string = StringsKt.trim((CharSequence) mutableState13.getValue()).toString();
                ServerIconLibrary serverIconLibrary = (ServerIconLibrary) mutableState9.getValue();
                if (serverIconLibrary != null) {
                    listEmptyList = serverIconLibrary.getIcons();
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj2 : listEmptyList) {
                    ServerIconEntry serverIconEntry = (ServerIconEntry) obj2;
                    if (StringsKt.isBlank(string) || StringsKt__StringsKt.contains(serverIconEntry.getName(), (CharSequence) string, true)) {
                        arrayList6.add(obj2);
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList6);
                obj = arrayList6;
            }
            obj = objRememberedValue16;
            List list = (List) obj;
            boolean z2 = (((Boolean) mutableState14.getValue()).booleanValue() || ((ServerIconEntry) mutableState16.getValue()) != null || ((Boolean) mutableState15.getValue()).booleanValue()) ? false : true;
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue17 == companion2.getEmpty()) {
                mutableState4 = mutableState16;
                mutableState5 = mutableState14;
                mutableState6 = mutableState15;
                objRememberedValue17 = new ii(mutableState5, mutableState4, mutableState6, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            } else {
                mutableState4 = mutableState16;
                mutableState5 = mutableState14;
                mutableState6 = mutableState15;
            }
            MutableState mutableState17 = mutableState2;
            BackHandlerKt.BackHandler(z2, (Function0) objRememberedValue17, composerStartRestartGroup, 48, 0);
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == companion2.getEmpty()) {
                objRememberedValue18 = new ii(mutableState5, mutableState4, mutableState6, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            MutableState mutableState18 = mutableState4;
            MutableState mutableState19 = mutableState3;
            MutableState mutableState20 = mutableState5;
            MutableState mutableState21 = mutableState9;
            MutableState mutableState22 = mutableState;
            MutableState mutableState23 = mutableState6;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue18, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-1440615729, true, new ex1(str2, serverConfig, mutableState9, mutableState, mutableState20, mutableState13, mutableState17, list, ks1Var, mutableState19, mutableState12, mutableState18, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 438, 0);
            if (((Boolean) mutableState20.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(344626701);
                String str3 = (String) mutableState22.getValue();
                Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue19 == companion2.getEmpty()) {
                    objRememberedValue19 = new zq1(7, mutableState20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                }
                Function0 function4 = (Function0) objRememberedValue19;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(r4) | composerStartRestartGroup.changed(mutableState21) | composerStartRestartGroup.changed(mutableState22) | composerStartRestartGroup.changedInstance(userPreferences);
                Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue20 == companion2.getEmpty()) {
                    Composer composer6 = composerStartRestartGroup;
                    i5 = 54;
                    s21 s21Var = new s21(coroutineScope2, mutableState17, px1Var, mutableState19, userPreferences, mutableState21, mutableState22, mutableState13);
                    coroutineScope = coroutineScope2;
                    composer6.updateRememberedValue(s21Var);
                    objRememberedValue20 = s21Var;
                    composer5 = composer6;
                } else {
                    i5 = 54;
                    coroutineScope = coroutineScope2;
                    composer5 = composerStartRestartGroup;
                }
                i6 = 3;
                Composer composer7 = composer5;
                d(str3, serverIconLibraryInputServerManager, function4, (Function1) objRememberedValue20, composer7, ((i7 >> 3) & Input.Keys.FORWARD_DEL) | RendererCapabilities.DECODER_SUPPORT_MASK);
                Composer composer8 = composer7;
                composer8.endReplaceGroup();
                composer3 = composer8;
            } else {
                i5 = 54;
                Composer composer9 = composerStartRestartGroup;
                coroutineScope = coroutineScope2;
                mutableState18 = mutableState18;
                i6 = 3;
                composer9.startReplaceGroup(344887132);
                composer9.endReplaceGroup();
                composer3 = composer9;
            }
            ServerIconEntry serverIconEntry2 = (ServerIconEntry) mutableState18.getValue();
            if (serverIconEntry2 == null) {
                composer3.startReplaceGroup(345025236);
                composer3.endReplaceGroup();
                function3 = function0;
                mutableState7 = mutableState23;
                composer4 = composer3;
                z = true;
            } else {
                composer3.startReplaceGroup(345025237);
                Object objRememberedValue21 = composer3.rememberedValue();
                if (objRememberedValue21 == companion2.getEmpty()) {
                    objRememberedValue21 = new ao0(i6, mutableState12, mutableState18);
                    composer3.updateRememberedValue(objRememberedValue21);
                }
                CoroutineScope coroutineScope3 = coroutineScope;
                MutableState mutableState24 = mutableState18;
                mutableState7 = mutableState23;
                function3 = function0;
                z = true;
                Composer composer10 = composer3;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue21, null, ComposableLambdaKt.rememberComposableLambda(1091480862, true, new hx1(serverIconEntry2, serverConfig, coroutineScope3, px1Var, function1, function2, function0, mutableState12, mutableState24, mutableState17, 1), composer3, i5), composer10, 390, 2);
                Unit unit = Unit.INSTANCE;
                composer10.endReplaceGroup();
                composer4 = composer10;
            }
            if (((Boolean) mutableState7.getValue()).booleanValue()) {
                composer4.startReplaceGroup(348820102);
                Object objRememberedValue22 = composer4.rememberedValue();
                if (objRememberedValue22 == companion2.getEmpty()) {
                    objRememberedValue22 = new zq1(8, mutableState7);
                    composer4.updateRememberedValue(objRememberedValue22);
                }
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue22, null, ComposableLambdaKt.rememberComposableLambda(1536452669, z, new dx1(function3, mutableState7, 0), composer4, i5), composer4, 390, 2);
                composer4.endReplaceGroup();
            } else {
                composer4.startReplaceGroup(351024636);
                composer4.endReplaceGroup();
            }
            composer2 = composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer4;
            }
        } else {
            Composer composer11 = composerStartRestartGroup;
            composer11.skipToGroupEnd();
            composer2 = composer11;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh((Object) serverConfig, (Object) px1Var, (Object) serverIconLibraryInputServerManager, function3, function1, function2, i, 7));
        }
    }

    public static final void g(CoroutineScope coroutineScope, MutableState mutableState, px1 px1Var, MutableState mutableState2, UserPreferences userPreferences, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, String str) {
        String string = StringsKt.trim((CharSequence) str).toString();
        if (StringsKt.isBlank(string)) {
            mutableState.setValue("请输入图标库 URL");
        } else {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new mi(px1Var, string, mutableState2, mutableState, userPreferences, mutableState3, mutableState4, mutableState5, (Continuation) null), 3, null);
        }
    }
}
