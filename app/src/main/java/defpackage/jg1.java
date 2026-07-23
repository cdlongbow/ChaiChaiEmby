package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Forward10Kt;
import androidx.compose.material.icons.filled.ListKt;
import androidx.compose.material.icons.filled.MoreHorizKt;
import androidx.compose.material.icons.filled.MusicNoteKt;
import androidx.compose.material.icons.filled.PauseKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material.icons.filled.Replay10Kt;
import androidx.compose.material.icons.filled.ReplayKt;
import androidx.compose.material.icons.filled.SkipNextKt;
import androidx.compose.material.icons.filled.SubtitlesKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.IntroOutroSettings;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaSourcePriorityKt;
import com.dh.myembyapp.data.model.PlayerDefaultViewMode;
import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;
import com.dh.myembyapp.data.model.PlayerResizeMode;
import com.dh.myembyapp.data.model.ResolutionLabelStyle;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import com.dh.myembyapp.data.model.VideoResolutionKt;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jg1 {
    public static final long a = Color.m5151copywmQWz5c$default(ColorKt.Color(4280953386L), 0.95f, 0.0f, 0.0f, 0.0f, 14, null);
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final float k;
    public static final float l;
    public static final float m;

    static {
        Color.Companion companion = Color.INSTANCE;
        b = Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        c = Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
        d = Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
        e = Color.m5151copywmQWz5c$default(companion.m5178getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
        f = companion.m5189getWhite0d7_KjU();
        g = Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
        h = Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        i = ColorKt.Color(4284790262L);
        j = ColorKt.Color(4294953047L);
        k = Dp.m7813constructorimpl(80.0f);
        l = Dp.m7813constructorimpl(250.0f);
        m = Dp.m7813constructorimpl(100.0f);
    }

    /* JADX WARN: Failed to calculate best type for var: r8v59 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v59 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v59 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v59 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v60 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v60 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v59 Object, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void a(com.dh.myembyapp.data.model.MediaItem r154, java.util.List r155, java.lang.String r156, java.lang.String r157, androidx.media3.exoplayer.ExoPlayer r158, long r159, long r161, long r163, float r165, java.util.List r166, kotlin.jvm.functions.Function0 r167, kotlin.jvm.functions.Function0 r168, defpackage.vk1 r169, kotlin.jvm.functions.Function0 r170, kotlin.jvm.functions.Function0 r171, kotlin.jvm.functions.Function0 r172, kotlin.jvm.functions.Function0 r173, boolean r174, boolean r175, boolean r176, com.dh.myembyapp.data.model.TranscodeQualityOption r177, java.lang.Integer r178, java.lang.Integer r179, defpackage.zk1 r180, defpackage.al1 r181, defpackage.zj1 r182, defpackage.ak1 r183, defpackage.th1 r184, defpackage.th1 r185, defpackage.th1 r186, boolean r187, defpackage.nv r188, defpackage.wh1 r189, int r190, defpackage.wh1 r191, int r192, defpackage.wh1 r193, boolean r194, com.dh.myembyapp.data.model.DanmakuConfig r195, com.dh.myembyapp.data.preferences.DanmakuPreferences r196, defpackage.uw r197, kotlin.jvm.functions.Function0 r198, kotlin.jvm.functions.Function0 r199, kotlin.jvm.functions.Function0 r200, kotlin.jvm.functions.Function1 r201, java.lang.String r202, java.lang.String r203, boolean r204, boolean r205, kotlin.jvm.functions.Function1 r206, kotlin.jvm.functions.Function1 r207, kotlin.jvm.functions.Function1 r208, kotlin.jvm.functions.Function1 r209, float r210, int r211, int r212, int r213, boolean r214, com.dh.myembyapp.data.SubtitlePreferences.SubtitleColor r215, boolean r216, boolean r217, boolean r218, boolean r219, boolean r220, boolean r221, boolean r222, defpackage.jk1 r223, kotlin.jvm.functions.Function1 r224, kotlin.jvm.functions.Function1 r225, kotlin.jvm.functions.Function1 r226, defpackage.nk1 r227, kotlin.jvm.functions.Function1 r228, kotlin.jvm.functions.Function2 r229, kotlin.jvm.functions.Function1 r230, defpackage.qk1 r231, boolean r232, kotlin.jvm.functions.Function0 r233, java.lang.Long r234, java.lang.Long r235, java.lang.Long r236, java.lang.Long r237, java.lang.Long r238, java.lang.Long r239, com.dh.myembyapp.data.IntroOutroSettings.Settings r240, defpackage.sk1 r241, defpackage.tk1 r242, kotlin.jvm.functions.Function1 r243, defpackage.c71 r244, com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode r245, kotlin.jvm.functions.Function1 r246, com.dh.myembyapp.data.model.SystemNetworkSpeedPosition r247, kotlin.jvm.functions.Function1 r248, com.dh.myembyapp.data.model.SystemTimeDisplayMode r249, kotlin.jvm.functions.Function1 r250, int r251, kotlin.jvm.functions.Function1 r252, int r253, kotlin.jvm.functions.Function1 r254, com.dh.myembyapp.data.model.PlayerResizeMode r255, kotlin.jvm.functions.Function1 r256, com.dh.myembyapp.data.model.PlayerDefaultViewMode r257, kotlin.jvm.functions.Function1 r258, com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode r259, kotlin.jvm.functions.Function1 r260, com.dh.myembyapp.data.model.VideoVersionPrioritySettings r261, kotlin.jvm.functions.Function1 r262, com.dh.myembyapp.data.model.AudioVersionPrioritySettings r263, kotlin.jvm.functions.Function1 r264, com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings r265, kotlin.jvm.functions.Function1 r266, androidx.compose.runtime.Composer r267, int r268, int r269, int r270, int r271, int r272, int r273, int r274, int r275, int r276, int r277, int r278, int r279) {
        /*
            Method dump skipped, instruction units count: 8854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg1.a(com.dh.myembyapp.data.model.MediaItem, java.util.List, java.lang.String, java.lang.String, androidx.media3.exoplayer.ExoPlayer, long, long, long, float, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, vk1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.dh.myembyapp.data.model.TranscodeQualityOption, java.lang.Integer, java.lang.Integer, zk1, al1, zj1, ak1, th1, th1, th1, boolean, nv, wh1, int, wh1, int, wh1, boolean, com.dh.myembyapp.data.model.DanmakuConfig, com.dh.myembyapp.data.preferences.DanmakuPreferences, uw, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, float, int, int, int, boolean, com.dh.myembyapp.data.SubtitlePreferences$SubtitleColor, boolean, boolean, boolean, boolean, boolean, boolean, boolean, jk1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, nk1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, qk1, boolean, kotlin.jvm.functions.Function0, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, com.dh.myembyapp.data.IntroOutroSettings$Settings, sk1, tk1, kotlin.jvm.functions.Function1, c71, com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode, kotlin.jvm.functions.Function1, com.dh.myembyapp.data.model.SystemNetworkSpeedPosition, kotlin.jvm.functions.Function1, com.dh.myembyapp.data.model.SystemTimeDisplayMode, kotlin.jvm.functions.Function1, int, kotlin.jvm.functions.Function1, int, kotlin.jvm.functions.Function1, com.dh.myembyapp.data.model.PlayerResizeMode, kotlin.jvm.functions.Function1, com.dh.myembyapp.data.model.PlayerDefaultViewMode, kotlin.jvm.functions.Function1, com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode, kotlin.jvm.functions.Function1, com.dh.myembyapp.data.model.VideoVersionPrioritySettings, kotlin.jvm.functions.Function1, com.dh.myembyapp.data.model.AudioVersionPrioritySettings, kotlin.jvm.functions.Function1, com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int, int, int, int, int, int, int, int, int, int):void");
    }

    public static final void b(MutableState mutableState) {
        mutableState.setValue(Boolean.FALSE);
    }

    public static final void c(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void d(MutableState mutableState) {
        mutableState.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int f(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int g(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int h(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final void i(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void j(final boolean z, final float f2, final boolean z2, final boolean z3, final boolean z4, final int i2, final Function0 function0, Function0 function1, final Function0 function2, final Function0 function3, final zk1 zk1Var, final Function1 function4, final Function0 function5, final Function0 function6, final Function0 function7, final Function0 function8, final Function0 function9, final Function0 function10, final Function0 function11, final FocusRequester focusRequester, final FocusRequester focusRequester2, final FocusRequester focusRequester3, final FocusRequester focusRequester4, final FocusRequester focusRequester5, final FocusRequester focusRequester6, final FocusRequester focusRequester7, FocusRequester focusRequester8, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        FocusRequester focusRequester9;
        Object obj;
        MutableState mutableState;
        IconButtonDefaults iconButtonDefaults;
        long j2;
        long j3;
        int i9;
        IconButtonDefaults iconButtonDefaults2;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        final Function0 function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-222495383);
        if ((i3 & 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i6 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 |= composerStartRestartGroup.changed(true) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        int i10 = i3 & 100663296;
        int i11 = GroupFlagsKt.HasAuxSlotFlag;
        if (i10 == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        int i12 = i6;
        if ((i4 & 6) == 0) {
            i7 = i4 | (composerStartRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(zk1Var) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function6) ? 16384 : 8192;
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function7) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function8) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function9) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function10)) {
                i11 = 67108864;
            }
            i7 |= i11;
        }
        if ((i4 & 805306368) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function11) ? 536870912 : 268435456;
        }
        int i13 = i7;
        if ((i5 & 6) == 0) {
            i8 = i5 | (composerStartRestartGroup.changed(focusRequester) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(focusRequester2) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerStartRestartGroup.changed(focusRequester3) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(focusRequester4) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(focusRequester5) ? 16384 : 8192;
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 |= composerStartRestartGroup.changed(focusRequester6) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i8 |= composerStartRestartGroup.changed(focusRequester7) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i8 |= composerStartRestartGroup.changed(focusRequester8) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute(((i12 & 306783379) == 306783378 && (i13 & 306783379) == 306783378 && (i8 & 4793491) == 4793490) ? false : true, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222495383, i12, i13, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow (PlayerControls.kt:1539)");
            }
            final int iCoerceIn = (RangesKt.coerceIn(i2, 5, 60) / 5) * 5;
            final ImageVector replay10 = iCoerceIn == 10 ? Replay10Kt.getReplay10(Icons.INSTANCE.getDefault()) : ReplayKt.getReplay(Icons.INSTANCE.getDefault());
            final ImageVector forward10 = iCoerceIn == 10 ? Forward10Kt.getForward10(Icons.INSTANCE.getDefault()) : ReplayKt.getReplay(Icons.INSTANCE.getDefault());
            final TextStyle textStyleM7288copyp1EtxEg$default = TextStyle.m7288copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelLarge(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null);
            float fM7813constructorimpl = Dp.m7813constructorimpl(38.0f);
            float fM7813constructorimpl2 = Dp.m7813constructorimpl(44.0f);
            final float fM7813constructorimpl3 = Dp.m7813constructorimpl(21.0f);
            final float fM7813constructorimpl4 = Dp.m7813constructorimpl(25.0f);
            final float fM7813constructorimpl5 = Dp.m7813constructorimpl(22.0f);
            float fM7813constructorimpl6 = Dp.m7813constructorimpl(34.0f);
            Color.Companion companion = Color.INSTANCE;
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
            final long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(companion.m5178getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
            final long jM5189getWhite0d7_KjU = companion.m5189getWhite0d7_KjU();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState10 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState11 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState12 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState13 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState14 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState15 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState16 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion2.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState17 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion2.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState18 = (MutableState) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion2.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            MutableState mutableState19 = (MutableState) objRememberedValue10;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion2.getEmpty()) {
                obj = null;
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            } else {
                obj = null;
            }
            MutableState mutableState20 = (MutableState) objRememberedValue11;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFocusGroup = FocusableKt.focusGroup(BackgroundKt.m275backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, obj), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(24.0f))), Color.m5151copywmQWz5c$default(companion.m5178getBlack0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null));
            int i14 = i13 & 14;
            boolean z5 = (i14 == 4) | ((i13 & 896) == 256);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue12 == companion2.getEmpty()) {
                objRememberedValue12 = new hf1(function4, function3, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(FocusChangedModifierKt.onFocusChanged(modifierFocusGroup, (Function1) objRememberedValue12), Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(6.0f));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i15 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion4, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i15), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean z6 = ((i12 & 29360128) == 8388608) | (i14 == 4);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue13 == companion2.getEmpty()) {
                objRememberedValue13 = new hh0(1, function0, function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            Function0 function13 = (Function0) objRememberedValue13;
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1064size3ABfNKs(companion3, fM7813constructorimpl), focusRequester);
            boolean z7 = i14 == 4;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue14 == companion2.getEmpty()) {
                objRememberedValue14 = new qx(function3, mutableState10, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue14);
            IconButtonDefaults iconButtonDefaults3 = IconButtonDefaults.INSTANCE;
            long jM5151copywmQWz5c$default3 = Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            int i16 = (IconButtonDefaults.$stable << 24) | 3510;
            ButtonColors buttonColorsM8385colorsoq7We08 = iconButtonDefaults3.m8385colorsoq7We08(jM5151copywmQWz5c$default3, jM5189getWhite0d7_KjU, jM5151copywmQWz5c$default, jM5151copywmQWz5c$default2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i16, PsExtractor.VIDEO_STREAM_MASK);
            composerStartRestartGroup = composerStartRestartGroup;
            final int i17 = 0;
            IconButtonKt.IconButton(function13, modifierOnFocusChanged, null, false, null, null, null, buttonColorsM8385colorsoq7We08, null, null, ComposableLambdaKt.rememberComposableLambda(1514033989, true, new Function3() { // from class: ue1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i18 = i17;
                    MutableState mutableState21 = mutableState10;
                    float f3 = fM7813constructorimpl3;
                    long j4 = jM5189getWhite0d7_KjU;
                    long j5 = jM5151copywmQWz5c$default2;
                    int i19 = iCoerceIn;
                    switch (i18) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            ((BoxScope) obj2).getClass();
                            if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1514033989, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1611)");
                                }
                                IconKt.m2496Iconww6aTOc(replay10, x2.f(i19, "快退", "秒"), SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState21.getValue()).booleanValue() ? j5 : j4, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ((BoxScope) obj2).getClass();
                            if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1679448253, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1663)");
                                }
                                IconKt.m2496Iconww6aTOc(replay10, x2.f(i19, "快进", "秒"), i19 == 10 ? SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3) : ScaleKt.scale(SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), -1.0f, 1.0f), ((Boolean) mutableState21.getValue()).booleanValue() ? j5 : j4, composer3, 0, 0);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 0, 6, 892);
            boolean z8 = ((i12 & 1879048192) == 536870912) | (i14 == 4);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue15 == companion2.getEmpty()) {
                objRememberedValue15 = new hh0(2, function2, function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            Function0 function14 = (Function0) objRememberedValue15;
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion3, fM7813constructorimpl2);
            boolean z9 = i14 == 4;
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue16 == companion2.getEmpty()) {
                objRememberedValue16 = new qx(function3, mutableState11, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            final long j4 = jM5151copywmQWz5c$default2;
            IconButtonKt.IconButton(function14, FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue16), null, false, null, null, null, iconButtonDefaults3.m8385colorsoq7We08(Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM5189getWhite0d7_KjU, jM5151copywmQWz5c$default, jM5151copywmQWz5c$default2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i16, PsExtractor.VIDEO_STREAM_MASK), null, null, ComposableLambdaKt.rememberComposableLambda(2113141052, true, new Function3() { // from class: ve1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((BoxScope) obj2).getClass();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2113141052, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1637)");
                        }
                        boolean z10 = z;
                        Icons.Filled filled = Icons.INSTANCE.getDefault();
                        IconKt.m2496Iconww6aTOc(z10 ? PauseKt.getPause(filled) : PlayArrowKt.getPlayArrow(filled), z10 ? "暂停" : "播放", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, fM7813constructorimpl4), ((Boolean) mutableState11.getValue()).booleanValue() ? jM5151copywmQWz5c$default2 : jM5189getWhite0d7_KjU, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 0, 6, 892);
            boolean z10 = ((i12 & 234881024) == 67108864) | (i14 == 4);
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue17 == companion2.getEmpty()) {
                function12 = function1;
                objRememberedValue17 = new hh0(3, function12, function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            } else {
                function12 = function1;
            }
            Function0 function15 = (Function0) objRememberedValue17;
            Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion3, fM7813constructorimpl);
            boolean z11 = i14 == 4;
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue18 == companion2.getEmpty()) {
                mutableState = mutableState12;
                objRememberedValue18 = new qx(function3, mutableState, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            } else {
                mutableState = mutableState12;
            }
            final int i18 = 1;
            final MutableState mutableState21 = mutableState;
            final long j5 = jM5189getWhite0d7_KjU;
            IconButtonKt.IconButton(function15, FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs2, (Function1) objRememberedValue18), null, false, null, null, null, iconButtonDefaults3.m8385colorsoq7We08(Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), jM5189getWhite0d7_KjU, jM5151copywmQWz5c$default, j4, 0L, 0L, 0L, 0L, composerStartRestartGroup, i16, PsExtractor.VIDEO_STREAM_MASK), null, null, ComposableLambdaKt.rememberComposableLambda(1679448253, true, new Function3() { // from class: ue1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i19 = i18;
                    MutableState mutableState22 = mutableState21;
                    float f3 = fM7813constructorimpl3;
                    long j6 = jM5189getWhite0d7_KjU;
                    long j7 = j4;
                    int i110 = iCoerceIn;
                    switch (i19) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            ((BoxScope) obj2).getClass();
                            if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1514033989, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1611)");
                                }
                                IconKt.m2496Iconww6aTOc(forward10, x2.f(i110, "快退", "秒"), SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState22.getValue()).booleanValue() ? j7 : j6, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ((BoxScope) obj2).getClass();
                            if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1679448253, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1663)");
                                }
                                IconKt.m2496Iconww6aTOc(forward10, x2.f(i110, "快进", "秒"), i110 == 10 ? SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3) : ScaleKt.scale(SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), -1.0f, 1.0f), ((Boolean) mutableState22.getValue()).booleanValue() ? j7 : j6, composer3, 0, 0);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 0, 6, 892);
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-1023850894);
                boolean z12 = ((i13 & Input.Keys.FORWARD_DEL) == 32) | (i14 == 4);
                Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                if (z12 || objRememberedValue19 == companion2.getEmpty()) {
                    objRememberedValue19 = new jx0(19, zk1Var, function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                }
                Function0 function16 = (Function0) objRememberedValue19;
                Modifier modifierM1064size3ABfNKs3 = SizeKt.m1064size3ABfNKs(companion3, fM7813constructorimpl);
                boolean z13 = i14 == 4;
                Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                if (z13 || objRememberedValue20 == companion2.getEmpty()) {
                    mutableState9 = mutableState13;
                    objRememberedValue20 = new qx(function3, mutableState9, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                } else {
                    mutableState9 = mutableState13;
                }
                Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs3, (Function1) objRememberedValue20);
                ButtonColors buttonColorsM8385colorsoq7We09 = iconButtonDefaults3.m8385colorsoq7We08(Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j5, jM5151copywmQWz5c$default, j4, 0L, 0L, 0L, 0L, composerStartRestartGroup, i16, PsExtractor.VIDEO_STREAM_MASK);
                iconButtonDefaults = iconButtonDefaults3;
                j2 = jM5151copywmQWz5c$default;
                final int i19 = 0;
                final MutableState mutableState22 = mutableState9;
                Function3 function17 = new Function3() { // from class: qe1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i20 = i19;
                        MutableState mutableState23 = mutableState22;
                        float f3 = fM7813constructorimpl5;
                        long j6 = j5;
                        long j7 = j4;
                        BoxScope boxScope = (BoxScope) obj2;
                        switch (i20) {
                            case 0:
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(648022624, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1696)");
                                    }
                                    IconKt.m2496Iconww6aTOc(SkipNextKt.getSkipNext(Icons.INSTANCE.getDefault()), "下一集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState23.getValue()).booleanValue() ? j7 : j6, composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1195092585, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1724)");
                                    }
                                    IconKt.m2496Iconww6aTOc(ListKt.getList(Icons.INSTANCE.getDefault()), "选集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState23.getValue()).booleanValue() ? j7 : j6, composer3, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer4 = (Composer) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1245755454, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1749)");
                                    }
                                    IconKt.m2496Iconww6aTOc(SubtitlesKt.getSubtitles(Icons.INSTANCE.getDefault()), "字幕选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState23.getValue()).booleanValue() ? j7 : j6, composer4, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                break;
                            case 3:
                                Composer composer5 = (Composer) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(812062655, iIntValue4, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1773)");
                                    }
                                    IconKt.m2496Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.INSTANCE.getDefault()), "音轨选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState23.getValue()).booleanValue() ? j7 : j6, composer5, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer6 = (Composer) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2062478183, iIntValue5, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1883)");
                                    }
                                    IconKt.m2496Iconww6aTOc(MoreHorizKt.getMoreHoriz(Icons.INSTANCE.getDefault()), "更多", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState23.getValue()).booleanValue() ? j7 : j6, composer6, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                j4 = j4;
                j5 = j5;
                IconButtonKt.IconButton(function16, modifierOnFocusChanged2, null, false, null, null, null, buttonColorsM8385colorsoq7We09, null, null, ComposableLambdaKt.rememberComposableLambda(648022624, true, function17, composerStartRestartGroup, 54), composerStartRestartGroup, 0, 6, 892);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                iconButtonDefaults = iconButtonDefaults3;
                j2 = jM5151copywmQWz5c$default;
                composerStartRestartGroup.startReplaceGroup(-1022771691);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1022655286);
                Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.m1064size3ABfNKs(companion3, fM7813constructorimpl), focusRequester6);
                boolean z14 = i14 == 4;
                Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                if (z14 || objRememberedValue21 == companion2.getEmpty()) {
                    mutableState8 = mutableState14;
                    objRememberedValue21 = new qx(function3, mutableState8, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                } else {
                    mutableState8 = mutableState14;
                }
                long j6 = j2;
                i9 = i16;
                IconButtonDefaults iconButtonDefaults4 = iconButtonDefaults;
                final long j7 = j4;
                final long j8 = j5;
                j3 = j6;
                iconButtonDefaults2 = iconButtonDefaults4;
                final int i20 = 1;
                final MutableState mutableState23 = mutableState8;
                j4 = j7;
                j5 = j8;
                IconButtonKt.IconButton(function5, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue21), null, false, null, null, null, iconButtonDefaults4.m8385colorsoq7We08(Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j8, j6, j7, 0L, 0L, 0L, 0L, composerStartRestartGroup, i9, PsExtractor.VIDEO_STREAM_MASK), null, null, ComposableLambdaKt.rememberComposableLambda(-1195092585, true, new Function3() { // from class: qe1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i21 = i20;
                        MutableState mutableState24 = mutableState23;
                        float f3 = fM7813constructorimpl3;
                        long j9 = j8;
                        long j10 = j7;
                        BoxScope boxScope = (BoxScope) obj2;
                        switch (i21) {
                            case 0:
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(648022624, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1696)");
                                    }
                                    IconKt.m2496Iconww6aTOc(SkipNextKt.getSkipNext(Icons.INSTANCE.getDefault()), "下一集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState24.getValue()).booleanValue() ? j10 : j9, composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1195092585, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1724)");
                                    }
                                    IconKt.m2496Iconww6aTOc(ListKt.getList(Icons.INSTANCE.getDefault()), "选集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState24.getValue()).booleanValue() ? j10 : j9, composer3, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer4 = (Composer) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1245755454, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1749)");
                                    }
                                    IconKt.m2496Iconww6aTOc(SubtitlesKt.getSubtitles(Icons.INSTANCE.getDefault()), "字幕选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState24.getValue()).booleanValue() ? j10 : j9, composer4, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                break;
                            case 3:
                                Composer composer5 = (Composer) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(812062655, iIntValue4, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1773)");
                                    }
                                    IconKt.m2496Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.INSTANCE.getDefault()), "音轨选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState24.getValue()).booleanValue() ? j10 : j9, composer5, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer6 = (Composer) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                boxScope.getClass();
                                if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2062478183, iIntValue5, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1883)");
                                    }
                                    IconKt.m2496Iconww6aTOc(MoreHorizKt.getMoreHoriz(Icons.INSTANCE.getDefault()), "更多", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState24.getValue()).booleanValue() ? j10 : j9, composer6, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 >> 9) & 14, 6, 892);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                j3 = j2;
                i9 = r34;
                iconButtonDefaults2 = iconButtonDefaults;
                composerStartRestartGroup.startReplaceGroup(-1021599147);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFocusRequester3 = FocusRequesterModifierKt.focusRequester(SizeKt.m1064size3ABfNKs(companion3, fM7813constructorimpl), focusRequester2);
            boolean z15 = i14 == 4;
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (z15 || objRememberedValue22 == companion2.getEmpty()) {
                mutableState2 = mutableState15;
                objRememberedValue22 = new qx(function3, mutableState2, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            } else {
                mutableState2 = mutableState15;
            }
            long j9 = j3;
            IconButtonDefaults iconButtonDefaults5 = iconButtonDefaults2;
            final long j10 = j4;
            final long j11 = j5;
            final int i21 = 2;
            final MutableState mutableState24 = mutableState2;
            IconButtonKt.IconButton(function6, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester3, (Function1) objRememberedValue22), null, false, null, null, null, iconButtonDefaults5.m8385colorsoq7We08(Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j11, j9, j10, 0L, 0L, 0L, 0L, composerStartRestartGroup, i9, PsExtractor.VIDEO_STREAM_MASK), null, null, ComposableLambdaKt.rememberComposableLambda(1245755454, true, new Function3() { // from class: qe1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i22 = i21;
                    MutableState mutableState25 = mutableState24;
                    float f3 = fM7813constructorimpl3;
                    long j12 = j11;
                    long j13 = j10;
                    BoxScope boxScope = (BoxScope) obj2;
                    switch (i22) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(648022624, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1696)");
                                }
                                IconKt.m2496Iconww6aTOc(SkipNextKt.getSkipNext(Icons.INSTANCE.getDefault()), "下一集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState25.getValue()).booleanValue() ? j13 : j12, composer2, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1195092585, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1724)");
                                }
                                IconKt.m2496Iconww6aTOc(ListKt.getList(Icons.INSTANCE.getDefault()), "选集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState25.getValue()).booleanValue() ? j13 : j12, composer3, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        case 2:
                            Composer composer4 = (Composer) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1245755454, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1749)");
                                }
                                IconKt.m2496Iconww6aTOc(SubtitlesKt.getSubtitles(Icons.INSTANCE.getDefault()), "字幕选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState25.getValue()).booleanValue() ? j13 : j12, composer4, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                        case 3:
                            Composer composer5 = (Composer) obj3;
                            int iIntValue4 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(812062655, iIntValue4, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1773)");
                                }
                                IconKt.m2496Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.INSTANCE.getDefault()), "音轨选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState25.getValue()).booleanValue() ? j13 : j12, composer5, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer6 = (Composer) obj3;
                            int iIntValue5 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2062478183, iIntValue5, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1883)");
                                }
                                IconKt.m2496Iconww6aTOc(MoreHorizKt.getMoreHoriz(Icons.INSTANCE.getDefault()), "更多", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState25.getValue()).booleanValue() ? j13 : j12, composer6, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer6.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 >> 12) & 14, 6, 892);
            Modifier modifierFocusRequester4 = FocusRequesterModifierKt.focusRequester(SizeKt.m1064size3ABfNKs(companion3, fM7813constructorimpl), focusRequester3);
            boolean z16 = i14 == 4;
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (z16 || objRememberedValue23 == companion2.getEmpty()) {
                mutableState3 = mutableState16;
                objRememberedValue23 = new qx(function3, mutableState3, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            } else {
                mutableState3 = mutableState16;
            }
            int i22 = i9;
            final int i23 = 3;
            final MutableState mutableState25 = mutableState3;
            final long j12 = j11;
            IconButtonKt.IconButton(function7, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester4, (Function1) objRememberedValue23), null, false, null, null, null, iconButtonDefaults5.m8385colorsoq7We08(Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j11, j9, j10, 0L, 0L, 0L, 0L, composerStartRestartGroup, i9, PsExtractor.VIDEO_STREAM_MASK), null, null, ComposableLambdaKt.rememberComposableLambda(812062655, true, new Function3() { // from class: qe1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i24 = i23;
                    MutableState mutableState26 = mutableState25;
                    float f3 = fM7813constructorimpl3;
                    long j13 = j11;
                    long j14 = j10;
                    BoxScope boxScope = (BoxScope) obj2;
                    switch (i24) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(648022624, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1696)");
                                }
                                IconKt.m2496Iconww6aTOc(SkipNextKt.getSkipNext(Icons.INSTANCE.getDefault()), "下一集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState26.getValue()).booleanValue() ? j14 : j13, composer2, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1195092585, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1724)");
                                }
                                IconKt.m2496Iconww6aTOc(ListKt.getList(Icons.INSTANCE.getDefault()), "选集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState26.getValue()).booleanValue() ? j14 : j13, composer3, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        case 2:
                            Composer composer4 = (Composer) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1245755454, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1749)");
                                }
                                IconKt.m2496Iconww6aTOc(SubtitlesKt.getSubtitles(Icons.INSTANCE.getDefault()), "字幕选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState26.getValue()).booleanValue() ? j14 : j13, composer4, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                        case 3:
                            Composer composer5 = (Composer) obj3;
                            int iIntValue4 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(812062655, iIntValue4, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1773)");
                                }
                                IconKt.m2496Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.INSTANCE.getDefault()), "音轨选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState26.getValue()).booleanValue() ? j14 : j13, composer5, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer6 = (Composer) obj3;
                            int iIntValue5 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2062478183, iIntValue5, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1883)");
                                }
                                IconKt.m2496Iconww6aTOc(MoreHorizKt.getMoreHoriz(Icons.INSTANCE.getDefault()), "更多", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState26.getValue()).booleanValue() ? j14 : j13, composer6, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer6.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 >> 15) & 14, 6, 892);
            Modifier modifierFocusRequester5 = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(companion3, fM7813constructorimpl6), focusRequester4);
            boolean z17 = i14 == 4;
            Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (z17 || objRememberedValue24 == companion2.getEmpty()) {
                mutableState4 = mutableState18;
                objRememberedValue24 = new qx(function3, mutableState4, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            } else {
                mutableState4 = mutableState18;
            }
            Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester5, (Function1) objRememberedValue24);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long jM5151copywmQWz5c$default4 = Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
            int i24 = (ButtonDefaults.$stable << 24) | 3510;
            ButtonDefaults buttonDefaults2 = buttonDefaults;
            long j13 = j9;
            final MutableState mutableState26 = mutableState4;
            final long j14 = j10;
            ButtonKt.m8231ButtonTCVpFMg(function8, modifierOnFocusChanged3, null, false, null, null, null, buttonDefaults.m8228colorsoq7We08(jM5151copywmQWz5c$default4, j12, j9, j10, 0L, 0L, 0L, 0L, composerStartRestartGroup, i24, PsExtractor.VIDEO_STREAM_MASK), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(1483952573, true, new Function3() { // from class: re1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((RowScope) obj2).getClass();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1483952573, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1801)");
                        }
                        TextKt.m3048TextNvy7gAk(f2 + "x", null, ((Boolean) mutableState26.getValue()).booleanValue() ? j10 : j12, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer2, 0, 0, 131066);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 >> 18) & 14, 390, 2940);
            if (z4) {
                composerStartRestartGroup.startReplaceGroup(-1018460583);
                Modifier modifierFocusRequester6 = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(companion3, fM7813constructorimpl6), focusRequester5);
                boolean z18 = i14 == 4;
                Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                if (z18 || objRememberedValue25 == companion2.getEmpty()) {
                    mutableState7 = mutableState19;
                    objRememberedValue25 = new qx(function3, mutableState7, 9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
                } else {
                    mutableState7 = mutableState19;
                }
                Modifier modifierOnFocusChanged4 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester6, (Function1) objRememberedValue25);
                ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults2.m8228colorsoq7We08(Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), j12, j13, j14, 0L, 0L, 0L, 0L, composerStartRestartGroup, i24, PsExtractor.VIDEO_STREAM_MASK);
                buttonDefaults2 = buttonDefaults2;
                j13 = j13;
                PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(0.0f));
                final int i25 = 0;
                final MutableState mutableState27 = mutableState7;
                Function3 function18 = new Function3() { // from class: se1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i26 = i25;
                        MutableState mutableState28 = mutableState27;
                        long j15 = j12;
                        long j16 = j14;
                        switch (i26) {
                            case 0:
                                Composer composer2 = (Composer) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((RowScope) obj2).getClass();
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1124221040, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1829)");
                                    }
                                    TextKt.m3048TextNvy7gAk("弹", null, ((Boolean) mutableState28.getValue()).booleanValue() ? j16 : j15, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer2, 6, 0, 130042);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ((RowScope) obj2).getClass();
                                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1025295948, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1858)");
                                    }
                                    TextKt.m3048TextNvy7gAk("解码", null, ((Boolean) mutableState28.getValue()).booleanValue() ? j16 : j15, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer3, 6, 0, 130042);
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
                };
                j14 = j14;
                j12 = j12;
                ButtonKt.m8231ButtonTCVpFMg(function9, modifierOnFocusChanged4, null, false, null, null, null, buttonColorsM8228colorsoq7We08, 0.0f, null, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(-1124221040, true, function18, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 >> 21) & 14, 390, 2940);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1017265099);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierFocusRequester7 = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(companion3, fM7813constructorimpl6), focusRequester7);
            boolean z19 = i14 == 4;
            Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
            if (z19 || objRememberedValue26 == companion2.getEmpty()) {
                mutableState5 = mutableState20;
                objRememberedValue26 = new qx(function3, mutableState5, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
            } else {
                mutableState5 = mutableState20;
            }
            long j15 = j13;
            final long j16 = j14;
            final long j17 = j12;
            final int i26 = 1;
            final MutableState mutableState28 = mutableState5;
            ButtonKt.m8231ButtonTCVpFMg(function10, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester7, (Function1) objRememberedValue26), null, false, null, null, null, buttonDefaults2.m8228colorsoq7We08(Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), j17, j15, j16, 0L, 0L, 0L, 0L, composerStartRestartGroup, i24, PsExtractor.VIDEO_STREAM_MASK), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1025295948, true, new Function3() { // from class: se1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i27 = i26;
                    MutableState mutableState29 = mutableState28;
                    long j18 = j17;
                    long j19 = j16;
                    switch (i27) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            ((RowScope) obj2).getClass();
                            if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1124221040, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1829)");
                                }
                                TextKt.m3048TextNvy7gAk("弹", null, ((Boolean) mutableState29.getValue()).booleanValue() ? j19 : j18, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer2, 6, 0, 130042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            ((RowScope) obj2).getClass();
                            if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1025295948, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1858)");
                                }
                                TextKt.m3048TextNvy7gAk("解码", null, ((Boolean) mutableState29.getValue()).booleanValue() ? j19 : j18, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer3, 6, 0, 130042);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 >> 24) & 14, 390, 2940);
            composerStartRestartGroup.startReplaceGroup(-1016079535);
            Modifier modifierM1064size3ABfNKs4 = SizeKt.m1064size3ABfNKs(companion3, fM7813constructorimpl);
            focusRequester9 = focusRequester8;
            Modifier modifierFocusRequester8 = FocusRequesterModifierKt.focusRequester(modifierM1064size3ABfNKs4, focusRequester9);
            boolean z20 = i14 == 4;
            Object objRememberedValue27 = composerStartRestartGroup.rememberedValue();
            if (z20 || objRememberedValue27 == companion2.getEmpty()) {
                mutableState6 = mutableState17;
                objRememberedValue27 = new qx(function3, mutableState6, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
            } else {
                mutableState6 = mutableState17;
            }
            final int i27 = 4;
            final MutableState mutableState29 = mutableState6;
            IconButtonKt.IconButton(function11, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester8, (Function1) objRememberedValue27), null, false, null, null, null, iconButtonDefaults5.m8385colorsoq7We08(Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j17, j15, j16, 0L, 0L, 0L, 0L, composerStartRestartGroup, i22, PsExtractor.VIDEO_STREAM_MASK), null, null, ComposableLambdaKt.rememberComposableLambda(-2062478183, true, new Function3() { // from class: qe1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i28 = i27;
                    MutableState mutableState210 = mutableState29;
                    float f3 = fM7813constructorimpl3;
                    long j18 = j17;
                    long j19 = j16;
                    BoxScope boxScope = (BoxScope) obj2;
                    switch (i28) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(648022624, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1696)");
                                }
                                IconKt.m2496Iconww6aTOc(SkipNextKt.getSkipNext(Icons.INSTANCE.getDefault()), "下一集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState210.getValue()).booleanValue() ? j19 : j18, composer2, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1195092585, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1724)");
                                }
                                IconKt.m2496Iconww6aTOc(ListKt.getList(Icons.INSTANCE.getDefault()), "选集", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState210.getValue()).booleanValue() ? j19 : j18, composer3, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        case 2:
                            Composer composer4 = (Composer) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1245755454, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1749)");
                                }
                                IconKt.m2496Iconww6aTOc(SubtitlesKt.getSubtitles(Icons.INSTANCE.getDefault()), "字幕选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState210.getValue()).booleanValue() ? j19 : j18, composer4, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                        case 3:
                            Composer composer5 = (Composer) obj3;
                            int iIntValue4 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(812062655, iIntValue4, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1773)");
                                }
                                IconKt.m2496Iconww6aTOc(MusicNoteKt.getMusicNote(Icons.INSTANCE.getDefault()), "音轨选择", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState210.getValue()).booleanValue() ? j19 : j18, composer5, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer6 = (Composer) obj3;
                            int iIntValue5 = ((Integer) obj4).intValue();
                            boxScope.getClass();
                            if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2062478183, iIntValue5, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsActionRow.<anonymous>.<anonymous> (PlayerControls.kt:1883)");
                                }
                                IconKt.m2496Iconww6aTOc(MoreHorizKt.getMoreHoriz(Icons.INSTANCE.getDefault()), "更多", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, f3), ((Boolean) mutableState210.getValue()).booleanValue() ? j19 : j18, composer6, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer6.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 >> 27) & 14, 6, 892);
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            focusRequester9 = focusRequester8;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final FocusRequester focusRequester10 = focusRequester9;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: te1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i4);
                    int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i5);
                    jg1.j(z, f2, z2, z3, z4, i2, function0, function12, function2, function3, zk1Var, function4, function5, function6, function7, function8, function9, function10, function11, focusRequester, focusRequester2, focusRequester3, focusRequester4, focusRequester5, focusRequester6, focusRequester7, focusRequester10, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:321:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:323:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:326:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:327:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:332:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:336:0x0411  */
    /* JADX WARN: Code duplicated, block: B:339:0x041d  */
    /* JADX WARN: Code duplicated, block: B:340:0x0421  */
    /* JADX WARN: Code duplicated, block: B:343:0x043a  */
    /* JADX WARN: Code duplicated, block: B:347:0x045e  */
    /* JADX WARN: Code duplicated, block: B:352:0x0483  */
    /* JADX WARN: Code duplicated, block: B:355:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:356:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:359:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:364:0x0515  */
    /* JADX WARN: Code duplicated, block: B:369:0x054c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:370:0x054e  */
    /* JADX WARN: Code duplicated, block: B:371:0x0570  */
    /* JADX WARN: Code duplicated, block: B:375:0x057d  */
    /* JADX WARN: Code duplicated, block: B:376:0x057f  */
    /* JADX WARN: Code duplicated, block: B:381:0x058c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:382:0x058e  */
    /* JADX WARN: Code duplicated, block: B:387:0x0599  */
    /* JADX WARN: Code duplicated, block: B:415:0x0773  */
    /* JADX WARN: Code duplicated, block: B:417:0x078e  */
    /* JADX WARN: Code duplicated, block: B:419:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:422:0x0848  */
    /* JADX WARN: Code duplicated, block: B:425:0x0854  */
    /* JADX WARN: Code duplicated, block: B:426:0x0858  */
    /* JADX WARN: Code duplicated, block: B:428:0x0991  */
    /* JADX WARN: Code duplicated, block: B:431:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:432:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:435:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:437:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(final MediaItem mediaItem, final String str, final String str2, final String str3, final boolean z, final ExoPlayer exoPlayer, final long j2, final long j3, final long j4, final float f2, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final int i2, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final Function0 function4, final Function0 function5, final zk1 zk1Var, final Function0 function6, final Function1 function7, final Function1 function8, final Function0 function9, final Function0 function10, final Function0 function11, final Function0 function12, final Function0 function13, final Function0 function14, final Function0 function15, final FocusRequester focusRequester, final FocusRequester focusRequester2, final FocusRequester focusRequester3, final FocusRequester focusRequester4, final FocusRequester focusRequester5, final FocusRequester focusRequester6, final FocusRequester focusRequester7, final FocusRequester focusRequester8, final FocusRequester focusRequester9, Composer composer, final int i3, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean playWhenReady;
        Modifier.Companion companion;
        boolean z7;
        Object objRememberedValue;
        Alignment.Companion companion2;
        ComposeUiNode.Companion companion3;
        Function0<ComposeUiNode> constructor;
        BoxScopeInstance boxScopeInstance;
        int i13;
        int i14;
        char c2;
        char c3;
        float f3;
        int i15;
        Object obj;
        int i16;
        Function0<ComposeUiNode> constructor2;
        Density density;
        boolean zChanged;
        Object objRememberedValue2;
        float f4;
        int iIntValue;
        boolean zChanged2;
        Object objRememberedValue3;
        float f5;
        int iIntValue2;
        Object objRememberedValue4;
        Composer.Companion companion4;
        int i17;
        MutableState mutableState;
        Object objRememberedValue5;
        MutableState mutableState2;
        boolean zChanged3;
        Object objRememberedValue6;
        IntSize intSize;
        boolean zChanged4;
        Object objRememberedValue7;
        DpSize dpSizeM7899boximpl;
        boolean z8;
        Object objRememberedValue8;
        boolean z9;
        Composer composerStartRestartGroup = composer.startRestartGroup(1669159905);
        if ((i3 & 6) == 0) {
            i8 = ((i3 & 8) == 0 ? composerStartRestartGroup.changed(mediaItem) : composerStartRestartGroup.changedInstance(mediaItem) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        if ((i3 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(exoPlayer) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i8 |= composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i8 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
        }
        int i18 = i3 & 100663296;
        int i19 = GroupFlagsKt.HasAuxSlotFlag;
        if (i18 == 0) {
            i8 |= composerStartRestartGroup.changed(j4) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i8 |= composerStartRestartGroup.changed(f2) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i9 = i4 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
        } else {
            i9 = i4;
        }
        if ((i4 & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i9 |= composerStartRestartGroup.changed(true) ? 16384 : 8192;
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i9 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
        }
        int i20 = i9;
        if ((i5 & 6) == 0) {
            i10 = i5 | (composerStartRestartGroup.changedInstance(function4) ? 4 : 2);
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function5) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(zk1Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function6) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function7) ? 16384 : 8192;
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function8) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function9) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function10) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function11) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(function12) ? 536870912 : 268435456;
        }
        int i21 = i10;
        if ((i6 & 6) == 0) {
            i11 = i6 | (composerStartRestartGroup.changedInstance(function13) ? 4 : 2);
        } else {
            i11 = i6;
        }
        if ((i6 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function14) ? 32 : 16;
        }
        if ((i6 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function15) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
        }
        if ((i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i11 |= composerStartRestartGroup.changed(focusRequester3) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i11 |= composerStartRestartGroup.changed(focusRequester4) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i11 |= composerStartRestartGroup.changed(focusRequester5) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            if (composerStartRestartGroup.changed(focusRequester6)) {
                i19 = 67108864;
            }
            i11 |= i19;
        }
        if ((i6 & 805306368) == 0) {
            i11 |= composerStartRestartGroup.changed(focusRequester7) ? 536870912 : 268435456;
        }
        if ((i7 & 6) == 0) {
            i12 = i7 | (composerStartRestartGroup.changed(focusRequester8) ? 4 : 2);
        } else {
            i12 = i7;
        }
        if ((i7 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(focusRequester9) ? 32 : 16;
        }
        int i22 = i12;
        if ((i8 & 306783379) == 306783378 && (i20 & 306783379) == 306783378 && (i21 & 306783379) == 306783378 && (i11 & 306783379) == 306783378) {
            if ((i22 & 19) == 18) {
                z6 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z6, i8 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1669159905, i8, i20, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsChrome (PlayerControls.kt:1110)");
                }
                playWhenReady = exoPlayer.getPlayWhenReady();
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                if ((i21 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z7 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new fg1(function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default, (Function1) objRememberedValue);
                companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i23 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnPreviewKeyEvent);
                companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i23), composerM4318constructorimpl));
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (z) {
                    i13 = i8;
                    companion3 = companion3;
                    i14 = i20;
                    c2 = ' ';
                    c3 = 3;
                    f3 = 0.0f;
                    i15 = 1;
                    obj = null;
                    i16 = 2;
                    composerStartRestartGroup.startReplaceGroup(-2091174117);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-2095648533);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    zChanged = composerStartRestartGroup.changed(density);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    f4 = l;
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = Integer.valueOf(density.mo414roundToPx0680j_4(f4));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    iIntValue = ((Number) objRememberedValue2).intValue();
                    zChanged2 = composerStartRestartGroup.changed(density);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    f5 = m;
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = Integer.valueOf(density.mo414roundToPx0680j_4(f5));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    iIntValue2 = ((Number) objRememberedValue3).intValue();
                    Object[] objArr = {str};
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    companion4 = Composer.INSTANCE;
                    i17 = i8;
                    if (objRememberedValue4 == companion4.getEmpty()) {
                        objRememberedValue4 = new o91(3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue4, composerStartRestartGroup, 48);
                    Object[] objArr2 = {str};
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion4.getEmpty()) {
                        objRememberedValue5 = new o91(4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) objRememberedValue5, composerStartRestartGroup, 48);
                    zChanged3 = composerStartRestartGroup.changed(((Number) mutableState.getValue()).intValue()) | composerStartRestartGroup.changed(((Number) mutableState2.getValue()).intValue()) | composerStartRestartGroup.changed(iIntValue) | composerStartRestartGroup.changed(iIntValue2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue6 == companion4.getEmpty()) {
                        objRememberedValue6 = q(((Number) mutableState.getValue()).intValue(), ((Number) mutableState2.getValue()).intValue(), iIntValue, iIntValue2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    intSize = (IntSize) objRememberedValue6;
                    zChanged4 = composerStartRestartGroup.changed(intSize) | composerStartRestartGroup.changed(density);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue7 == companion4.getEmpty()) {
                        if (intSize != null) {
                            long jM7984unboximpl = intSize.m7984unboximpl();
                            dpSizeM7899boximpl = DpSize.m7899boximpl(DpKt.m7835DpSizeYgX7TsA(density.mo417toDpu2uoSUM((int) (jM7984unboximpl >> 32)), density.mo417toDpu2uoSUM((int) (jM7984unboximpl & 4294967295L))));
                        } else {
                            dpSizeM7899boximpl = null;
                        }
                        composerStartRestartGroup.updateRememberedValue(dpSizeM7899boximpl);
                        objRememberedValue7 = dpSizeM7899boximpl;
                    }
                    DpSize dpSize = (DpSize) objRememberedValue7;
                    if ((i17 & Input.Keys.FORWARD_DEL) == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (z8 || objRememberedValue8 == companion4.getEmpty()) {
                        if (str != null || StringsKt.isBlank(str)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objRememberedValue8 = mr.m(!z9, null, 2, null, composerStartRestartGroup);
                    }
                    MutableState mutableState3 = (MutableState) objRememberedValue8;
                    if (str == null && !StringsKt.isBlank(str) && ((Boolean) mutableState3.getValue()).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(-2094208304);
                        Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getTopStart());
                        Brush.Companion companion5 = Brush.INSTANCE;
                        Color.Companion companion6 = Color.INSTANCE;
                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(BackgroundKt.background$default(modifierAlign, Brush.Companion.m5113verticalGradient8A3gB4$default(companion5, CollectionsKt.listOf((Object[]) new Color[]{Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion6.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5142boximpl(companion6.m5187getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m7813constructorimpl(18.0f));
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i24 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM999padding3ABfNKs);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
                        mr.z(companion3, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i24), composerM4318constructorimpl2));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        bs0 bs0Var = new bs0((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                        bs0Var.c = str;
                        hs0.a(bs0Var, true);
                        bs0Var.e = new ri(mutableState3, 10);
                        fs0 fs0VarA = bs0Var.a();
                        Modifier modifierM1050height3ABfNKs = dpSize != null ? SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, DpSize.m7911getWidthD9Ej5fM(dpSize.getPackedValue())), DpSize.m7909getHeightD9Ej5fM(dpSize.getPackedValue())) : GraphicsLayerModifierKt.m5317graphicsLayer_6ThJ44$default(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, f4), f5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524283, null);
                        boolean zChanged5 = composerStartRestartGroup.changed(iIntValue) | composerStartRestartGroup.changed(iIntValue2) | composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5 || objRememberedValue9 == companion4.getEmpty()) {
                            objRememberedValue9 = new ef1(iIntValue, iIntValue2, mutableState3, mutableState, mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        i13 = i17;
                        i14 = i20;
                        c2 = ' ';
                        i15 = 1;
                        c3 = 3;
                        obj = null;
                        i16 = 2;
                        f3 = 0.0f;
                        g12.b(fs0VarA, "Logo", modifierM1050height3ABfNKs, null, null, null, (Function1) objRememberedValue9, null, null, ContentScale.INSTANCE.getFit(), composerStartRestartGroup, 48, 6, 31608);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        i14 = i20;
                        i13 = i17;
                        c3 = 3;
                        f3 = 0.0f;
                        i15 = 1;
                        obj = null;
                        i16 = 2;
                        c2 = ' ';
                        composerStartRestartGroup.startReplaceGroup(-2091184037);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-2087614821);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-2091027332);
                    Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, f3, i15, obj), companion2.getBottomCenter());
                    Brush.Companion companion7 = Brush.INSTANCE;
                    Color.Companion companion8 = Color.INSTANCE;
                    Color colorM5142boximpl = Color.m5142boximpl(companion8.m5187getTransparent0d7_KjU());
                    Color colorM5142boximpl2 = Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion8.m5178getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null));
                    Color[] colorArr = new Color[i16];
                    colorArr[0] = colorM5142boximpl;
                    colorArr[i15] = colorM5142boximpl2;
                    Modifier modifierM1002paddingqDBjuR0 = PaddingKt.m1002paddingqDBjuR0(BackgroundKt.background$default(modifierAlign2, Brush.Companion.m5113verticalGradient8A3gB4$default(companion7, CollectionsKt.listOf((Object[]) colorArr), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m7813constructorimpl(26.0f), Dp.m7813constructorimpl(20.0f), Dp.m7813constructorimpl(26.0f), Dp.m7813constructorimpl(8.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), companion2.getStart(), composerStartRestartGroup, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i25 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> c2));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1002paddingqDBjuR0);
                    constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion3, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i25), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i26 = i13 >> 3;
                    int i27 = MediaItem.$stable | (i13 & 14) | (i26 & Input.Keys.FORWARD_DEL) | (i26 & 896);
                    int i28 = i13 >> 9;
                    int i29 = i27 | (i28 & 7168) | (i28 & 57344) | (i28 & 458752) | ((i14 << 18) & 3670016) | ((i14 << 15) & 29360128) | ((i11 << 12) & 234881024) | (i11 & 1879048192);
                    int i30 = i14 >> 15;
                    int i31 = ((i21 >> 15) & 14) | (i30 & Input.Keys.FORWARD_DEL) | (i30 & 896) | (i30 & 7168) | (i30 & 57344);
                    int i32 = i21 << 15;
                    Composer composer2 = composerStartRestartGroup;
                    m(mediaItem, str2, str3, j2, j3, j4, z2, z4, focusRequester2, focusRequester7, function8, function0, function1, function2, function3, function4, function5, composer2, i29, i31 | (i32 & 458752) | (i32 & 3670016));
                    int i33 = i14 << 3;
                    int i34 = ((i13 >> 24) & Input.Keys.FORWARD_DEL) | (i33 & 896) | (i33 & 7168) | (i33 & 57344) | (i33 & 458752) | (i33 & 3670016) | (i33 & 29360128) | (i33 & 234881024) | (i33 & 1879048192);
                    int i35 = i21 >> 9;
                    int i36 = ((i21 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | ((i21 >> 6) & 896) | (i35 & 7168) | (i35 & 57344) | (i35 & 458752) | (i35 & 3670016);
                    int i37 = i11 << 21;
                    int i38 = i36 | (i37 & 29360128) | (i37 & 234881024) | (i37 & 1879048192);
                    int i39 = i11 >> 12;
                    int i40 = ((i11 >> 9) & 14) | (i39 & Input.Keys.FORWARD_DEL) | (i39 & 896) | (i39 & 7168) | (i39 & 57344) | (i39 & 458752);
                    int i41 = i22 << 18;
                    j(playWhenReady, f2, z3, z4, z5, i2, function0, function1, function2, function5, zk1Var, function7, function9, function10, function11, function12, function13, function14, function15, focusRequester, focusRequester3, focusRequester4, focusRequester5, focusRequester6, focusRequester7, focusRequester8, focusRequester9, composer2, i34, i38, i40 | (i41 & 3670016) | (i41 & 29360128));
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ff1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i4);
                        int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i5);
                        int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(i6);
                        int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(i7);
                        jg1.k(mediaItem, str, str2, str3, z, exoPlayer, j2, j3, j4, f2, z2, z3, z4, z5, i2, function0, function1, function2, function3, function4, function5, zk1Var, function6, function7, function8, function9, function10, function11, function12, function13, function14, function15, focusRequester, focusRequester2, focusRequester3, focusRequester4, focusRequester5, focusRequester6, focusRequester7, focusRequester8, focusRequester9, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3, iUpdateChangedFlags4, iUpdateChangedFlags5);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        z6 = true;
        if (composerStartRestartGroup.shouldExecute(z6, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1669159905, i8, i20, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsChrome (PlayerControls.kt:1110)");
            }
            playWhenReady = exoPlayer.getPlayWhenReady();
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            if ((i21 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z7) {
                objRememberedValue = new fg1(function6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new fg1(function6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnPreviewKeyEvent2 = KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default2, (Function1) objRememberedValue);
            companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i210 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnPreviewKeyEvent2);
            companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion3, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl4, Integer.valueOf(i210), composerM4318constructorimpl4));
            boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-2095648533);
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                zChanged = composerStartRestartGroup.changed(density);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                f4 = l;
                if (zChanged) {
                    objRememberedValue2 = Integer.valueOf(density.mo414roundToPx0680j_4(f4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = Integer.valueOf(density.mo414roundToPx0680j_4(f4));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                iIntValue = ((Number) objRememberedValue2).intValue();
                zChanged2 = composerStartRestartGroup.changed(density);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                f5 = m;
                if (zChanged2) {
                    objRememberedValue3 = Integer.valueOf(density.mo414roundToPx0680j_4(f5));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = Integer.valueOf(density.mo414roundToPx0680j_4(f5));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                iIntValue2 = ((Number) objRememberedValue3).intValue();
                Object[] objArr3 = {str};
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                companion4 = Composer.INSTANCE;
                i17 = i8;
                if (objRememberedValue4 == companion4.getEmpty()) {
                    objRememberedValue4 = new o91(3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr3, (Function0) objRememberedValue4, composerStartRestartGroup, 48);
                Object[] objArr4 = {str};
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion4.getEmpty()) {
                    objRememberedValue5 = new o91(4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(objArr4, (Function0) objRememberedValue5, composerStartRestartGroup, 48);
                zChanged3 = composerStartRestartGroup.changed(((Number) mutableState.getValue()).intValue()) | composerStartRestartGroup.changed(((Number) mutableState2.getValue()).intValue()) | composerStartRestartGroup.changed(iIntValue) | composerStartRestartGroup.changed(iIntValue2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = q(((Number) mutableState.getValue()).intValue(), ((Number) mutableState2.getValue()).intValue(), iIntValue, iIntValue2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = q(((Number) mutableState.getValue()).intValue(), ((Number) mutableState2.getValue()).intValue(), iIntValue, iIntValue2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                intSize = (IntSize) objRememberedValue6;
                zChanged4 = composerStartRestartGroup.changed(intSize) | composerStartRestartGroup.changed(density);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    if (intSize != null) {
                        long jM7984unboximpl2 = intSize.m7984unboximpl();
                        dpSizeM7899boximpl = DpSize.m7899boximpl(DpKt.m7835DpSizeYgX7TsA(density.mo417toDpu2uoSUM((int) (jM7984unboximpl2 >> 32)), density.mo417toDpu2uoSUM((int) (jM7984unboximpl2 & 4294967295L))));
                    } else {
                        dpSizeM7899boximpl = null;
                    }
                    composerStartRestartGroup.updateRememberedValue(dpSizeM7899boximpl);
                    objRememberedValue7 = dpSizeM7899boximpl;
                } else {
                    if (intSize != null) {
                        long jM7984unboximpl3 = intSize.m7984unboximpl();
                        dpSizeM7899boximpl = DpSize.m7899boximpl(DpKt.m7835DpSizeYgX7TsA(density.mo417toDpu2uoSUM((int) (jM7984unboximpl3 >> 32)), density.mo417toDpu2uoSUM((int) (jM7984unboximpl3 & 4294967295L))));
                    } else {
                        dpSizeM7899boximpl = null;
                    }
                    composerStartRestartGroup.updateRememberedValue(dpSizeM7899boximpl);
                    objRememberedValue7 = dpSizeM7899boximpl;
                }
                DpSize dpSize2 = (DpSize) objRememberedValue7;
                if ((i17 & Input.Keys.FORWARD_DEL) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    if (str != null) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    objRememberedValue8 = mr.m(!z9, null, 2, null, composerStartRestartGroup);
                } else {
                    if (str != null) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    objRememberedValue8 = mr.m(!z9, null, 2, null, composerStartRestartGroup);
                }
                MutableState mutableState4 = (MutableState) objRememberedValue8;
                if (str == null) {
                    i14 = i20;
                    i13 = i17;
                    c3 = 3;
                    f3 = 0.0f;
                    i15 = 1;
                    obj = null;
                    i16 = 2;
                    c2 = ' ';
                    composerStartRestartGroup.startReplaceGroup(-2091184037);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    i14 = i20;
                    i13 = i17;
                    c3 = 3;
                    f3 = 0.0f;
                    i15 = 1;
                    obj = null;
                    i16 = 2;
                    c2 = ' ';
                    composerStartRestartGroup.startReplaceGroup(-2091184037);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i13 = i8;
                companion3 = companion3;
                i14 = i20;
                c2 = ' ';
                c3 = 3;
                f3 = 0.0f;
                i15 = 1;
                obj = null;
                i16 = 2;
                composerStartRestartGroup.startReplaceGroup(-2091174117);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-2091027332);
                Modifier modifierAlign3 = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, f3, i15, obj), companion2.getBottomCenter());
                Brush.Companion companion9 = Brush.INSTANCE;
                Color.Companion companion10 = Color.INSTANCE;
                Color colorM5142boximpl3 = Color.m5142boximpl(companion10.m5187getTransparent0d7_KjU());
                Color colorM5142boximpl4 = Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion10.m5178getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null));
                Color[] colorArr2 = new Color[i16];
                colorArr2[0] = colorM5142boximpl3;
                colorArr2[i15] = colorM5142boximpl4;
                Modifier modifierM1002paddingqDBjuR1 = PaddingKt.m1002paddingqDBjuR0(BackgroundKt.background$default(modifierAlign3, Brush.Companion.m5113verticalGradient8A3gB4$default(companion9, CollectionsKt.listOf((Object[]) colorArr2), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m7813constructorimpl(26.0f), Dp.m7813constructorimpl(20.0f), Dp.m7813constructorimpl(26.0f), Dp.m7813constructorimpl(8.0f));
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), companion2.getStart(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i211 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> c2));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1002paddingqDBjuR1);
                constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion3, composerM4318constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl5, Integer.valueOf(i211), composerM4318constructorimpl5));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i212 = i13 >> 3;
                int i213 = MediaItem.$stable | (i13 & 14) | (i212 & Input.Keys.FORWARD_DEL) | (i212 & 896);
                int i214 = i13 >> 9;
                int i215 = i213 | (i214 & 7168) | (i214 & 57344) | (i214 & 458752) | ((i14 << 18) & 3670016) | ((i14 << 15) & 29360128) | ((i11 << 12) & 234881024) | (i11 & 1879048192);
                int i310 = i14 >> 15;
                int i311 = ((i21 >> 15) & 14) | (i310 & Input.Keys.FORWARD_DEL) | (i310 & 896) | (i310 & 7168) | (i310 & 57344);
                int i312 = i21 << 15;
                Composer composer3 = composerStartRestartGroup;
                m(mediaItem, str2, str3, j2, j3, j4, z2, z4, focusRequester2, focusRequester7, function8, function0, function1, function2, function3, function4, function5, composer3, i215, i311 | (i312 & 458752) | (i312 & 3670016));
                int i313 = i14 << 3;
                int i314 = ((i13 >> 24) & Input.Keys.FORWARD_DEL) | (i313 & 896) | (i313 & 7168) | (i313 & 57344) | (i313 & 458752) | (i313 & 3670016) | (i313 & 29360128) | (i313 & 234881024) | (i313 & 1879048192);
                int i315 = i21 >> 9;
                int i316 = ((i21 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | ((i21 >> 6) & 896) | (i315 & 7168) | (i315 & 57344) | (i315 & 458752) | (i315 & 3670016);
                int i317 = i11 << 21;
                int i318 = i316 | (i317 & 29360128) | (i317 & 234881024) | (i317 & 1879048192);
                int i319 = i11 >> 12;
                int i42 = ((i11 >> 9) & 14) | (i319 & Input.Keys.FORWARD_DEL) | (i319 & 896) | (i319 & 7168) | (i319 & 57344) | (i319 & 458752);
                int i43 = i22 << 18;
                j(playWhenReady, f2, z3, z4, z5, i2, function0, function1, function2, function5, zk1Var, function7, function9, function10, function11, function12, function13, function14, function15, focusRequester, focusRequester3, focusRequester4, focusRequester5, focusRequester6, focusRequester7, focusRequester8, focusRequester9, composer3, i314, i318, i42 | (i43 & 3670016) | (i43 & 29360128));
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2087614821);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ff1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i4);
                    int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i5);
                    int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(i6);
                    int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(i7);
                    jg1.k(mediaItem, str, str2, str3, z, exoPlayer, j2, j3, j4, f2, z2, z3, z4, z5, i2, function0, function1, function2, function3, function4, function5, zk1Var, function6, function7, function8, function9, function10, function11, function12, function13, function14, function15, focusRequester, focusRequester2, focusRequester3, focusRequester4, focusRequester5, focusRequester6, focusRequester7, focusRequester8, focusRequester9, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3, iUpdateChangedFlags4, iUpdateChangedFlags5);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:788:0x0b59  */
    /* JADX WARN: Code duplicated, block: B:789:0x0b5b  */
    /* JADX WARN: Code duplicated, block: B:792:0x0b63  */
    /* JADX WARN: Code duplicated, block: B:793:0x0b66  */
    /* JADX WARN: Code duplicated, block: B:796:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:797:0x0b74  */
    /* JADX WARN: Code duplicated, block: B:800:0x0b80  */
    /* JADX WARN: Code duplicated, block: B:801:0x0b82  */
    /* JADX WARN: Code duplicated, block: B:804:0x0b8e  */
    /* JADX WARN: Code duplicated, block: B:805:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:808:0x0b9d  */
    /* JADX WARN: Code duplicated, block: B:812:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:815:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:816:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:819:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:820:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:823:0x0bf9  */
    /* JADX WARN: Code duplicated, block: B:826:0x0c03  */
    /* JADX WARN: Code duplicated, block: B:830:0x0c0d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(final MediaItem mediaItem, final List list, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, Function1 function1, final Function1 function2, final Function1 function3, Function1 function4, final Function1 function5, final boolean z5, final boolean z6, final boolean z7, final int i2, final Function1 function6, final Function0 function0, final Function0 function7, final zj1 zj1Var, final ak1 ak1Var, final String str2, final SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode, final Function1 function8, final SystemNetworkSpeedPosition systemNetworkSpeedPosition, final Function1 function9, final SystemTimeDisplayMode systemTimeDisplayMode, final Function1 function10, final int i3, final Function1 function11, final int i4, final Function1 function12, final PlayerResizeMode playerResizeMode, final Function1 function13, final PlayerDefaultViewMode playerDefaultViewMode, final Function1 function14, final PlayerFrameRateMatchingMode playerFrameRateMatchingMode, final Function1 function15, final VideoVersionPrioritySettings videoVersionPrioritySettings, final Function1 function16, final AudioVersionPrioritySettings audioVersionPrioritySettings, final Function1 function17, final SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, final Function1 function18, final Long l2, final Long l3, final Long l4, final Long l5, final Long l6, final Long l7, final long j2, final long j3, final IntroOutroSettings.Settings settings, final Function1 function19, final c71 c71Var, final Function0 function20, Composer composer, final int i5, final int i6, final int i7, final int i8, final int i9, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Function0 function21;
        Composer composer2;
        final Function1 function22;
        Function1 function23;
        int i17;
        Composer composer3;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer composer4;
        int i22;
        SnapshotMutationPolicy snapshotMutationPolicy;
        boolean z8;
        Long l8;
        MediaItem mediaItem2;
        boolean z9;
        boolean z10;
        int i23;
        boolean z11;
        boolean z12;
        boolean z13;
        int i24;
        boolean z14;
        boolean z15;
        Object objRememberedValue;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objRememberedValue2;
        Function1 function24;
        Function0 function25;
        Function0 function26;
        Function0 function27;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1437806681);
        if ((i5 & 6) == 0) {
            i11 = i5 | ((i5 & 8) == 0 ? composerStartRestartGroup.changed(mediaItem) : composerStartRestartGroup.changedInstance(mediaItem) ? 4 : 2);
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i11 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i11 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        int i25 = i5 & 100663296;
        int i26 = GroupFlagsKt.HasAuxSlotFlag;
        if (i25 == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
        }
        int i27 = i11;
        if ((i6 & 6) == 0) {
            i12 = i6 | (composerStartRestartGroup.changedInstance(function4) ? 4 : 2);
        } else {
            i12 = i6;
        }
        if ((i6 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function5) ? 32 : 16;
        }
        if ((i6 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i12 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(z6) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changed(z7) ? 16384 : 8192;
        }
        if ((i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i12 |= composerStartRestartGroup.changed(true) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i12 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function6) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function7) ? 536870912 : 268435456;
        }
        int i28 = i12;
        if ((i7 & 48) == 0) {
            i13 = i7 | (composerStartRestartGroup.changedInstance(ak1Var) ? 32 : 16);
        } else {
            i13 = i7;
        }
        if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i13 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(systemNetworkSpeedDisplayMode.ordinal()) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function8) ? 16384 : 8192;
        }
        if ((i7 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i13 |= composerStartRestartGroup.changed(systemNetworkSpeedPosition.ordinal()) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function9) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i13 |= composerStartRestartGroup.changed(systemTimeDisplayMode.ordinal()) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function10) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.changed(i3) ? 536870912 : 268435456;
        }
        int i29 = i13;
        if ((i8 & 6) == 0) {
            i14 = i8 | (composerStartRestartGroup.changedInstance(function11) ? 4 : 2);
        } else {
            i14 = i8;
        }
        if ((i8 & 48) == 0) {
            i14 |= composerStartRestartGroup.changed(i4) ? 32 : 16;
        }
        if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i14 |= composerStartRestartGroup.changed(playerResizeMode.ordinal()) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
        }
        if ((i8 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i14 |= composerStartRestartGroup.changed(playerDefaultViewMode.ordinal()) ? 131072 : 65536;
        }
        if ((i8 & 1572864) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(function14) ? 1048576 : 524288;
        }
        if ((i8 & 12582912) == 0) {
            i14 |= composerStartRestartGroup.changed(playerFrameRateMatchingMode.ordinal()) ? 8388608 : 4194304;
        }
        if ((i8 & 100663296) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(function15) ? 67108864 : 33554432;
        }
        if ((i8 & 805306368) == 0) {
            i14 |= (i8 & 1073741824) == 0 ? composerStartRestartGroup.changed(videoVersionPrioritySettings) : composerStartRestartGroup.changedInstance(videoVersionPrioritySettings) ? 536870912 : 268435456;
        }
        int i30 = i14;
        if ((i9 & 6) == 0) {
            i15 = i9 | (composerStartRestartGroup.changedInstance(function16) ? 4 : 2);
        } else {
            i15 = i9;
        }
        if ((i9 & 48) == 0) {
            i15 |= (i9 & 64) == 0 ? composerStartRestartGroup.changed(audioVersionPrioritySettings) : composerStartRestartGroup.changedInstance(audioVersionPrioritySettings) ? 32 : 16;
        }
        if ((i9 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(function17) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i15 |= (i9 & 4096) == 0 ? composerStartRestartGroup.changed(subtitleVersionPrioritySettings) : composerStartRestartGroup.changedInstance(subtitleVersionPrioritySettings) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(function18) ? 16384 : 8192;
        }
        if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i15 |= composerStartRestartGroup.changed(l2) ? 131072 : 65536;
        }
        if ((i9 & 1572864) == 0) {
            i15 |= composerStartRestartGroup.changed(l3) ? 1048576 : 524288;
        }
        if ((i9 & 12582912) == 0) {
            i15 |= composerStartRestartGroup.changed(l4) ? 8388608 : 4194304;
        }
        if ((i9 & 100663296) == 0) {
            if (composerStartRestartGroup.changed(l5)) {
                i26 = 67108864;
            }
            i15 |= i26;
        }
        if ((i9 & 805306368) == 0) {
            i15 |= composerStartRestartGroup.changed(l6) ? 536870912 : 268435456;
        }
        int i31 = i15;
        if ((i10 & 6) == 0) {
            i16 = i10 | (composerStartRestartGroup.changed(l7) ? 4 : 2);
        } else {
            i16 = i10;
        }
        if ((i10 & 48) == 0) {
            i16 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i10 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i16 |= composerStartRestartGroup.changed(j3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i16 |= composerStartRestartGroup.changed(settings) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i16 |= composerStartRestartGroup.changedInstance(function19) ? 16384 : 8192;
        }
        if ((i10 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i16 |= composerStartRestartGroup.changedInstance(c71Var) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i16 |= composerStartRestartGroup.changedInstance(function20) ? 1048576 : 524288;
        }
        int i32 = i16;
        if (composerStartRestartGroup.shouldExecute(((i27 & 306783379) == 306783378 && (i28 & 306783379) == 306783378 && (i29 & 306783377) == 306783376 && (i30 & 306783379) == 306783378 && (i31 & 306783379) == 306783378 && (i32 & 599187) == 599186) ? false : true, i27 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1437806681, i27, i28, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsMoreOverlays (PlayerControls.kt:2200)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(12777732);
                int i33 = i28 & 234881024;
                i19 = 1879048192;
                int i34 = i32 & 3670016;
                i18 = i28;
                boolean z20 = (i34 == 1048576) | (i33 == 67108864);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z20 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new hh0(16, function0, function20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                i17 = i27;
                BackHandlerKt.BackHandler(true, (Function0) objRememberedValue3, composerStartRestartGroup, 6, 0);
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(12920394);
                    boolean z21 = ((i17 & 29360128) == 8388608) | ((i17 & 1879048192) == 536870912) | (i34 == 1048576);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z21 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new nf1(function1, function3, function20, 4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function25 = (Function0) objRememberedValue4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(13097559);
                    composerStartRestartGroup.endReplaceGroup();
                    function25 = null;
                }
                if (z6) {
                    composerStartRestartGroup.startReplaceGroup(13196170);
                    boolean z22 = ((i17 & 29360128) == 8388608) | ((i17 & 234881024) == 67108864) | (i34 == 1048576);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z22 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new nf1(function1, function2, function20, 5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function26 = (Function0) objRememberedValue5;
                } else {
                    composerStartRestartGroup.startReplaceGroup(13373335);
                    composerStartRestartGroup.endReplaceGroup();
                    function26 = null;
                }
                if (z7) {
                    composerStartRestartGroup.startReplaceGroup(13475077);
                    boolean z23 = ((i17 & 29360128) == 8388608) | ((i18 & 14) == 4) | (i34 == 1048576);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z23 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new nf1(function1, function4, function20, 6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function27 = (Function0) objRememberedValue6;
                } else {
                    composerStartRestartGroup.startReplaceGroup(13657047);
                    composerStartRestartGroup.endReplaceGroup();
                    function27 = null;
                }
                composerStartRestartGroup.startReplaceGroup(13756650);
                boolean z24 = ((i17 & 29360128) == 8388608) | ((i18 & Input.Keys.FORWARD_DEL) == 32) | (i34 == 1048576);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z24 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new nf1(function1, function5, function20, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function0 function28 = (Function0) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                boolean z25 = (i33 == 67108864) | (i34 == 1048576);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (z25 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new hh0(18, function0, function20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                m51.a(function25, function26, function27, function28, i2, function6, (Function0) objRememberedValue8, composerStartRestartGroup, (i18 >> 6) & 516096);
                composer3 = composerStartRestartGroup;
                composer3.endReplaceGroup();
            } else {
                i17 = i27;
                composer3 = composerStartRestartGroup;
                i18 = i28;
                i19 = 1879048192;
                composer3.startReplaceGroup(14214427);
                composer3.endReplaceGroup();
            }
            if (z4) {
                composer3.startReplaceGroup(14309411);
                int i35 = i18 & Input.Keys.FORWARD_DEL;
                int i36 = i17 & 29360128;
                i20 = 458752;
                int i37 = i32 & 3670016;
                boolean z26 = (i36 == 8388608) | (i35 == 32) | (i37 == 1048576);
                Object objRememberedValue9 = composer3.rememberedValue();
                if (z26 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new nf1(function5, function1, function20, 8);
                    composer3.updateRememberedValue(objRememberedValue9);
                }
                i21 = 57344;
                BackHandlerKt.BackHandler(true, (Function0) objRememberedValue9, composer3, 6, 0);
                boolean z27 = ((i29 & 3670016) == 1048576) | ((i29 & 57344) == 16384) | ((i29 & 234881024) == 67108864) | ((i30 & 14) == 4) | ((i30 & 896) == 256) | ((i30 & 57344) == 16384) | ((i30 & 3670016) == 1048576) | ((i30 & 234881024) == 67108864) | ((i31 & 14) == 4) | ((i31 & 896) == 256) | ((i31 & 57344) == 16384) | (i35 == 32) | ((i18 & i19) == 536870912) | (i37 == 1048576);
                Object objRememberedValue10 = composer3.rememberedValue();
                if (z27 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new Function11() { // from class: qf1
                        @Override // kotlin.jvm.functions.Function11
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
                            SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode2 = (SystemNetworkSpeedDisplayMode) obj;
                            SystemNetworkSpeedPosition systemNetworkSpeedPosition2 = (SystemNetworkSpeedPosition) obj2;
                            SystemTimeDisplayMode systemTimeDisplayMode2 = (SystemTimeDisplayMode) obj3;
                            Integer num = (Integer) obj4;
                            num.intValue();
                            Integer num2 = (Integer) obj5;
                            num2.intValue();
                            PlayerResizeMode playerResizeMode2 = (PlayerResizeMode) obj6;
                            PlayerDefaultViewMode playerDefaultViewMode2 = (PlayerDefaultViewMode) obj7;
                            PlayerFrameRateMatchingMode playerFrameRateMatchingMode2 = (PlayerFrameRateMatchingMode) obj8;
                            VideoVersionPrioritySettings videoVersionPrioritySettings2 = (VideoVersionPrioritySettings) obj9;
                            AudioVersionPrioritySettings audioVersionPrioritySettings2 = (AudioVersionPrioritySettings) obj10;
                            SubtitleVersionPrioritySettings subtitleVersionPrioritySettings2 = (SubtitleVersionPrioritySettings) obj11;
                            systemNetworkSpeedDisplayMode2.getClass();
                            systemNetworkSpeedPosition2.getClass();
                            systemTimeDisplayMode2.getClass();
                            playerResizeMode2.getClass();
                            playerDefaultViewMode2.getClass();
                            playerFrameRateMatchingMode2.getClass();
                            videoVersionPrioritySettings2.getClass();
                            audioVersionPrioritySettings2.getClass();
                            subtitleVersionPrioritySettings2.getClass();
                            function8.invoke(systemNetworkSpeedDisplayMode2);
                            function9.invoke(systemNetworkSpeedPosition2);
                            function10.invoke(systemTimeDisplayMode2);
                            function11.invoke(num);
                            function12.invoke(num2);
                            function13.invoke(playerResizeMode2);
                            function14.invoke(playerDefaultViewMode2);
                            function15.invoke(playerFrameRateMatchingMode2);
                            function16.invoke(videoVersionPrioritySettings2);
                            function17.invoke(audioVersionPrioritySettings2);
                            function18.invoke(subtitleVersionPrioritySettings2);
                            function5.invoke(Boolean.FALSE);
                            function7.invoke();
                            function20.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    function24 = function5;
                    composer3.updateRememberedValue(objRememberedValue10);
                } else {
                    function24 = function5;
                }
                Function11 function110 = (Function11) objRememberedValue10;
                boolean z28 = (i35 == 32) | (i36 == 8388608) | (i37 == 1048576);
                Object objRememberedValue11 = composer3.rememberedValue();
                if (z28 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = new nf1(function24, function1, function20, 9);
                    composer3.updateRememberedValue(objRememberedValue11);
                }
                cc1.i(systemNetworkSpeedDisplayMode, systemNetworkSpeedPosition, systemTimeDisplayMode, i3, i4, playerResizeMode, playerDefaultViewMode, playerFrameRateMatchingMode, videoVersionPrioritySettings, audioVersionPrioritySettings, subtitleVersionPrioritySettings, function110, (Function0) objRememberedValue11, composer3, ((i29 >> 9) & 14) | ((i29 >> 12) & Input.Keys.FORWARD_DEL) | ((i29 >> 15) & 896) | ((i29 >> 18) & 7168) | ((i30 << 9) & 57344) | ((i30 << 6) & 458752) | ((i30 << 3) & 3670016) | (i30 & 29360128) | (VideoVersionPrioritySettings.$stable << 24) | ((i30 >> 3) & 234881024) | (AudioVersionPrioritySettings.$stable << 27) | ((i31 << 24) & i19), SubtitleVersionPrioritySettings.$stable | ((i31 >> 9) & 14));
                composer3.endReplaceGroup();
            } else {
                i20 = 458752;
                i21 = 57344;
                composer3.startReplaceGroup(16362107);
                composer3.endReplaceGroup();
            }
            if (z2) {
                composer3.startReplaceGroup(16416357);
                int i38 = i17 & i19;
                int i39 = i17 & 29360128;
                int i40 = i32 & 3670016;
                boolean z29 = (i38 == 536870912) | (i39 == 8388608) | (i40 == 1048576);
                Object objRememberedValue12 = composer3.rememberedValue();
                if (z29 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new nf1(function3, function1, function20, 10);
                    composer3.updateRememberedValue(objRememberedValue12);
                }
                BackHandlerKt.BackHandler(true, (Function0) objRememberedValue12, composer3, 6, 0);
                String name = mediaItem.getName();
                boolean z30 = (i38 == 536870912) | (i39 == 8388608) | (i40 == 1048576);
                Object objRememberedValue13 = composer3.rememberedValue();
                if (z30 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue13 = new nf1(function3, function1, function20, 2);
                    composer3.updateRememberedValue(objRememberedValue13);
                }
                Function0 function29 = (Function0) objRememberedValue13;
                boolean zChangedInstance = (i38 == 536870912) | ((i29 & Input.Keys.FORWARD_DEL) == 32) | composer3.changedInstance(list) | ((i18 & i19) == 536870912) | (i40 == 1048576);
                Object objRememberedValue14 = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    i22 = 2;
                    oh ohVar = new oh(ak1Var, list, function3, function7, function20);
                    composer3.updateRememberedValue(ohVar);
                    objRememberedValue14 = ohVar;
                } else {
                    i22 = 2;
                }
                z8 = false;
                snapshotMutationPolicy = null;
                o(name, list, str, str2, function29, (Function2) objRememberedValue14, composer3, (i17 & 1008) | ((i29 << 3) & 7168));
                composer4 = composer3;
                composer4.endReplaceGroup();
            } else {
                composer4 = composer3;
                i22 = 2;
                snapshotMutationPolicy = null;
                z8 = false;
                composer4.startReplaceGroup(17206299);
                composer4.endReplaceGroup();
            }
            if (z3) {
                composer4.startReplaceGroup(17413999);
                final Context context = (Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Object objRememberedValue15 = composer4.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue15 == companion.getEmpty()) {
                    objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(settings.getAutoPriority()), snapshotMutationPolicy, i22, snapshotMutationPolicy);
                    composer4.updateRememberedValue(objRememberedValue15);
                }
                MutableState mutableState = (MutableState) objRememberedValue15;
                Object objRememberedValue16 = composer4.rememberedValue();
                if (objRememberedValue16 == companion.getEmpty()) {
                    objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(settings.getSkipIntro()), snapshotMutationPolicy, i22, snapshotMutationPolicy);
                    composer4.updateRememberedValue(objRememberedValue16);
                }
                MutableState mutableState2 = (MutableState) objRememberedValue16;
                Object objRememberedValue17 = composer4.rememberedValue();
                if (objRememberedValue17 == companion.getEmpty()) {
                    objRememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(settings.getSkipOutro()), snapshotMutationPolicy, i22, snapshotMutationPolicy);
                    composer4.updateRememberedValue(objRememberedValue17);
                }
                MutableState mutableState3 = (MutableState) objRememberedValue17;
                Object objRememberedValue18 = composer4.rememberedValue();
                if (objRememberedValue18 == companion.getEmpty()) {
                    l8 = l6;
                    objRememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(l8, snapshotMutationPolicy, i22, snapshotMutationPolicy);
                    composer4.updateRememberedValue(objRememberedValue18);
                } else {
                    l8 = l6;
                }
                final MutableState mutableState4 = (MutableState) objRememberedValue18;
                Object objRememberedValue19 = composer4.rememberedValue();
                if (objRememberedValue19 == companion.getEmpty()) {
                    objRememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(l7, snapshotMutationPolicy, i22, snapshotMutationPolicy);
                    composer4.updateRememberedValue(objRememberedValue19);
                }
                final MutableState mutableState5 = (MutableState) objRememberedValue19;
                Long l9 = (Long) mutableState4.getValue();
                Long l10 = (Long) mutableState5.getValue();
                boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) mutableState3.getValue()).booleanValue();
                int i41 = i32 & 896;
                boolean z31 = i41 == 256 ? true : z8;
                int i42 = i32 & Input.Keys.FORWARD_DEL;
                boolean zChangedInstance2 = (i42 == 32 ? true : z8) | z31 | composer4.changedInstance(context);
                Object objRememberedValue20 = composer4.rememberedValue();
                if (zChangedInstance2 || objRememberedValue20 == companion.getEmpty()) {
                    final int i43 = 0;
                    objRememberedValue20 = new Function0() { // from class: of1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i44 = i43;
                            MutableState mutableState6 = mutableState5;
                            MutableState mutableState7 = mutableState4;
                            Context context2 = context;
                            long j4 = j2;
                            long j5 = j3;
                            switch (i44) {
                                case 0:
                                    if (((Long) mutableState7.getValue()) != null) {
                                        mutableState7.setValue(null);
                                    } else if (j5 <= 0) {
                                        Toast.makeText(context2, "无法获取视频时长，无法标记片头", 0).show();
                                    } else if (j4 > j5 / 2) {
                                        Toast.makeText(context2, "片头标记不能超过视频一半时长", 0).show();
                                    } else {
                                        if (((Long) mutableState6.getValue()) != null) {
                                            Long l11 = (Long) mutableState6.getValue();
                                            l11.getClass();
                                            long jCoerceAtLeast = RangesKt.coerceAtLeast(j5 - l11.longValue(), 0L);
                                            if (j4 >= jCoerceAtLeast) {
                                                Toast.makeText(context2, "片头时间必须早于片尾时间", 0).show();
                                            } else if (jCoerceAtLeast - j4 <= Renderer.DEFAULT_DURATION_TO_PROGRESS_US) {
                                                Toast.makeText(context2, "片头与片尾需间隔至少10秒", 0).show();
                                            }
                                        }
                                        mutableState7.setValue(Long.valueOf(j4));
                                    }
                                    break;
                                default:
                                    if (((Long) mutableState7.getValue()) != null) {
                                        mutableState7.setValue(null);
                                    } else if (j5 > 0) {
                                        long j6 = j5 / 2;
                                        long jCoerceAtLeast2 = RangesKt.coerceAtLeast(j5 - j4, 0L);
                                        if (jCoerceAtLeast2 > j6) {
                                            Toast.makeText(context2, "片尾标记不能早于视频一半时长", 0).show();
                                        } else {
                                            if (((Long) mutableState6.getValue()) != null) {
                                                Long l12 = (Long) mutableState6.getValue();
                                                l12.getClass();
                                                if (j4 > l12.longValue()) {
                                                    Long l13 = (Long) mutableState6.getValue();
                                                    l13.getClass();
                                                    if (j4 - l13.longValue() <= Renderer.DEFAULT_DURATION_TO_PROGRESS_US) {
                                                        Toast.makeText(context2, "片头与片尾需间隔至少10秒", 0).show();
                                                    }
                                                } else {
                                                    Toast.makeText(context2, "片尾时间必须晚于片头时间", 0).show();
                                                }
                                            }
                                            mutableState7.setValue(Long.valueOf(jCoerceAtLeast2));
                                        }
                                    } else {
                                        Toast.makeText(context2, "无法获取视频时长，无法标记片尾", 0).show();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue20);
                }
                Function0 function30 = (Function0) objRememberedValue20;
                boolean zChangedInstance3 = (i41 == 256 ? true : z8) | (i42 == 32 ? true : z8) | composer4.changedInstance(context);
                Object objRememberedValue21 = composer4.rememberedValue();
                if (zChangedInstance3 || objRememberedValue21 == companion.getEmpty()) {
                    final int i44 = 1;
                    Function0 function31 = new Function0() { // from class: of1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i45 = i44;
                            MutableState mutableState6 = mutableState4;
                            MutableState mutableState7 = mutableState5;
                            Context context2 = context;
                            long j4 = j2;
                            long j5 = j3;
                            switch (i45) {
                                case 0:
                                    if (((Long) mutableState7.getValue()) != null) {
                                        mutableState7.setValue(null);
                                    } else if (j5 <= 0) {
                                        Toast.makeText(context2, "无法获取视频时长，无法标记片头", 0).show();
                                    } else if (j4 > j5 / 2) {
                                        Toast.makeText(context2, "片头标记不能超过视频一半时长", 0).show();
                                    } else {
                                        if (((Long) mutableState6.getValue()) != null) {
                                            Long l11 = (Long) mutableState6.getValue();
                                            l11.getClass();
                                            long jCoerceAtLeast = RangesKt.coerceAtLeast(j5 - l11.longValue(), 0L);
                                            if (j4 >= jCoerceAtLeast) {
                                                Toast.makeText(context2, "片头时间必须早于片尾时间", 0).show();
                                            } else if (jCoerceAtLeast - j4 <= Renderer.DEFAULT_DURATION_TO_PROGRESS_US) {
                                                Toast.makeText(context2, "片头与片尾需间隔至少10秒", 0).show();
                                            }
                                        }
                                        mutableState7.setValue(Long.valueOf(j4));
                                    }
                                    break;
                                default:
                                    if (((Long) mutableState7.getValue()) != null) {
                                        mutableState7.setValue(null);
                                    } else if (j5 > 0) {
                                        long j6 = j5 / 2;
                                        long jCoerceAtLeast2 = RangesKt.coerceAtLeast(j5 - j4, 0L);
                                        if (jCoerceAtLeast2 > j6) {
                                            Toast.makeText(context2, "片尾标记不能早于视频一半时长", 0).show();
                                        } else {
                                            if (((Long) mutableState6.getValue()) != null) {
                                                Long l12 = (Long) mutableState6.getValue();
                                                l12.getClass();
                                                if (j4 > l12.longValue()) {
                                                    Long l13 = (Long) mutableState6.getValue();
                                                    l13.getClass();
                                                    if (j4 - l13.longValue() <= Renderer.DEFAULT_DURATION_TO_PROGRESS_US) {
                                                        Toast.makeText(context2, "片头与片尾需间隔至少10秒", 0).show();
                                                    }
                                                } else {
                                                    Toast.makeText(context2, "片尾时间必须晚于片头时间", 0).show();
                                                }
                                            }
                                            mutableState7.setValue(Long.valueOf(jCoerceAtLeast2));
                                        }
                                    } else {
                                        Toast.makeText(context2, "无法获取视频时长，无法标记片尾", 0).show();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mutableState5 = mutableState5;
                    mutableState4 = mutableState4;
                    objRememberedValue21 = function31;
                    context = context;
                    composer4.updateRememberedValue(objRememberedValue21);
                }
                Function0 function32 = (Function0) objRememberedValue21;
                Object objRememberedValue22 = composer4.rememberedValue();
                if (objRememberedValue22 == companion.getEmpty()) {
                    objRememberedValue22 = new ub1(20, mutableState);
                    composer4.updateRememberedValue(objRememberedValue22);
                }
                Function1 function33 = (Function1) objRememberedValue22;
                Object objRememberedValue23 = composer4.rememberedValue();
                if (objRememberedValue23 == companion.getEmpty()) {
                    objRememberedValue23 = new ub1(21, mutableState2);
                    composer4.updateRememberedValue(objRememberedValue23);
                }
                Function1 function34 = (Function1) objRememberedValue23;
                Object objRememberedValue24 = composer4.rememberedValue();
                if (objRememberedValue24 == companion.getEmpty()) {
                    objRememberedValue24 = new ub1(22, mutableState3);
                    composer4.updateRememberedValue(objRememberedValue24);
                }
                Function1 function35 = (Function1) objRememberedValue24;
                boolean z32 = ((i31 & i19) == 536870912 ? true : z8) | ((i32 & 14) == 4 ? true : z8);
                if ((i17 & 14) != 4) {
                    if ((i17 & 8) != 0) {
                        mediaItem2 = mediaItem;
                        if (composer4.changedInstance(mediaItem2)) {
                        }
                        boolean zChangedInstance4 = z32 | z9 | composer4.changedInstance(context);
                        if ((i32 & i21) == 16384) {
                            z10 = true;
                        } else {
                            z10 = z8;
                        }
                        boolean z33 = zChangedInstance4 | z10;
                        i23 = i18 & 14;
                        if (i23 == 4) {
                            z11 = true;
                        } else {
                            z11 = z8;
                        }
                        boolean z34 = z33 | z11;
                        if ((i32 & i20) == 131072) {
                            z12 = true;
                        } else {
                            z12 = z8;
                        }
                        boolean z35 = z34 | z12;
                        if ((i18 & i19) == 536870912) {
                            z13 = true;
                        } else {
                            z13 = z8;
                        }
                        boolean z36 = z35 | z13;
                        i24 = i32 & 3670016;
                        if (i24 == 1048576) {
                            z14 = true;
                        } else {
                            z14 = z8;
                        }
                        z15 = z36 | z14;
                        objRememberedValue = composer4.rememberedValue();
                        if (!z15 || objRememberedValue == companion.getEmpty()) {
                            function23 = function4;
                            z16 = true;
                            composer2 = composer4;
                            objRememberedValue = new u1(l8, l7, mediaItem2, context, function19, function23, c71Var, function7, function20, mutableState4, mutableState5, mutableState, mutableState2, mutableState3);
                            function21 = function20;
                            composer2.updateRememberedValue(objRememberedValue);
                        } else {
                            function21 = function20;
                            function23 = function4;
                            z16 = true;
                            composer2 = composer4;
                        }
                        Function0 function36 = (Function0) objRememberedValue;
                        if (i23 == 4) {
                            z17 = z16;
                        } else {
                            z17 = z8;
                        }
                        if ((i17 & 29360128) == 8388608) {
                            z18 = z16;
                        } else {
                            z18 = z8;
                        }
                        boolean z37 = z18 | z17;
                        if (i24 == 1048576) {
                            z8 = z16;
                        }
                        z19 = z37 | z8;
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!z19 || objRememberedValue2 == companion.getEmpty()) {
                            function22 = function1;
                            objRememberedValue2 = new nf1(function23, function22, function21, 3);
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            function22 = function1;
                        }
                        gv0.b(l2, l3, l4, l5, l9, l10, j2, zBooleanValue, zBooleanValue2, zBooleanValue3, function30, function32, function33, function34, function35, function36, (Function0) objRememberedValue2, composer2, ((i31 >> 15) & 8190) | ((i32 << 15) & 3670016), 28032);
                        composer2.endReplaceGroup();
                    } else {
                        mediaItem2 = mediaItem;
                    }
                    z9 = z8;
                    boolean zChangedInstance5 = z32 | z9 | composer4.changedInstance(context);
                    if ((i32 & i21) == 16384) {
                        z10 = true;
                    } else {
                        z10 = z8;
                    }
                    boolean z38 = zChangedInstance5 | z10;
                    i23 = i18 & 14;
                    if (i23 == 4) {
                        z11 = true;
                    } else {
                        z11 = z8;
                    }
                    boolean z39 = z38 | z11;
                    if ((i32 & i20) == 131072) {
                        z12 = true;
                    } else {
                        z12 = z8;
                    }
                    boolean z310 = z39 | z12;
                    if ((i18 & i19) == 536870912) {
                        z13 = true;
                    } else {
                        z13 = z8;
                    }
                    boolean z311 = z310 | z13;
                    i24 = i32 & 3670016;
                    if (i24 == 1048576) {
                        z14 = true;
                    } else {
                        z14 = z8;
                    }
                    z15 = z311 | z14;
                    objRememberedValue = composer4.rememberedValue();
                    if (z15) {
                        function23 = function4;
                        z16 = true;
                        composer2 = composer4;
                        objRememberedValue = new u1(l8, l7, mediaItem2, context, function19, function23, c71Var, function7, function20, mutableState4, mutableState5, mutableState, mutableState2, mutableState3);
                        function21 = function20;
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        function23 = function4;
                        z16 = true;
                        composer2 = composer4;
                        objRememberedValue = new u1(l8, l7, mediaItem2, context, function19, function23, c71Var, function7, function20, mutableState4, mutableState5, mutableState, mutableState2, mutableState3);
                        function21 = function20;
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function37 = (Function0) objRememberedValue;
                    if (i23 == 4) {
                        z17 = z16;
                    } else {
                        z17 = z8;
                    }
                    if ((i17 & 29360128) == 8388608) {
                        z18 = z16;
                    } else {
                        z18 = z8;
                    }
                    boolean z312 = z18 | z17;
                    if (i24 == 1048576) {
                        z8 = z16;
                    }
                    z19 = z312 | z8;
                    objRememberedValue2 = composer2.rememberedValue();
                    if (z19) {
                        function22 = function1;
                        objRememberedValue2 = new nf1(function23, function22, function21, 3);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        function22 = function1;
                        objRememberedValue2 = new nf1(function23, function22, function21, 3);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    gv0.b(l2, l3, l4, l5, l9, l10, j2, zBooleanValue, zBooleanValue2, zBooleanValue3, function30, function32, function33, function34, function35, function37, (Function0) objRememberedValue2, composer2, ((i31 >> 15) & 8190) | ((i32 << 15) & 3670016), 28032);
                    composer2.endReplaceGroup();
                } else {
                    mediaItem2 = mediaItem;
                }
                z9 = true;
                boolean zChangedInstance6 = z32 | z9 | composer4.changedInstance(context);
                if ((i32 & i21) == 16384) {
                    z10 = true;
                } else {
                    z10 = z8;
                }
                boolean z313 = zChangedInstance6 | z10;
                i23 = i18 & 14;
                if (i23 == 4) {
                    z11 = true;
                } else {
                    z11 = z8;
                }
                boolean z314 = z313 | z11;
                if ((i32 & i20) == 131072) {
                    z12 = true;
                } else {
                    z12 = z8;
                }
                boolean z315 = z314 | z12;
                if ((i18 & i19) == 536870912) {
                    z13 = true;
                } else {
                    z13 = z8;
                }
                boolean z316 = z315 | z13;
                i24 = i32 & 3670016;
                if (i24 == 1048576) {
                    z14 = true;
                } else {
                    z14 = z8;
                }
                z15 = z316 | z14;
                objRememberedValue = composer4.rememberedValue();
                if (z15) {
                    function23 = function4;
                    z16 = true;
                    composer2 = composer4;
                    objRememberedValue = new u1(l8, l7, mediaItem2, context, function19, function23, c71Var, function7, function20, mutableState4, mutableState5, mutableState, mutableState2, mutableState3);
                    function21 = function20;
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    function23 = function4;
                    z16 = true;
                    composer2 = composer4;
                    objRememberedValue = new u1(l8, l7, mediaItem2, context, function19, function23, c71Var, function7, function20, mutableState4, mutableState5, mutableState, mutableState2, mutableState3);
                    function21 = function20;
                    composer2.updateRememberedValue(objRememberedValue);
                }
                Function0 function38 = (Function0) objRememberedValue;
                if (i23 == 4) {
                    z17 = z16;
                } else {
                    z17 = z8;
                }
                if ((i17 & 29360128) == 8388608) {
                    z18 = z16;
                } else {
                    z18 = z8;
                }
                boolean z317 = z18 | z17;
                if (i24 == 1048576) {
                    z8 = z16;
                }
                z19 = z317 | z8;
                objRememberedValue2 = composer2.rememberedValue();
                if (z19) {
                    function22 = function1;
                    objRememberedValue2 = new nf1(function23, function22, function21, 3);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    function22 = function1;
                    objRememberedValue2 = new nf1(function23, function22, function21, 3);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                gv0.b(l2, l3, l4, l5, l9, l10, j2, zBooleanValue, zBooleanValue2, zBooleanValue3, function30, function32, function33, function34, function35, function38, (Function0) objRememberedValue2, composer2, ((i31 >> 15) & 8190) | ((i32 << 15) & 3670016), 28032);
                composer2.endReplaceGroup();
            } else {
                function21 = function20;
                composer2 = composer4;
                function22 = function1;
                function23 = function4;
                composer2.startReplaceGroup(22807131);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function21 = function20;
            composer2 = composerStartRestartGroup;
            function22 = function1;
            function23 = function4;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1 function39 = function23;
            final Function0 function40 = function21;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: pf1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i6);
                    int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i7);
                    int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(i8);
                    int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(i9);
                    int iUpdateChangedFlags6 = RecomposeScopeImplKt.updateChangedFlags(i10);
                    jg1.l(mediaItem, list, str, z, z2, z3, z4, function22, function2, function3, function39, function5, z5, z6, z7, i2, function6, function0, function7, zj1Var, ak1Var, str2, systemNetworkSpeedDisplayMode, function8, systemNetworkSpeedPosition, function9, systemTimeDisplayMode, function10, i3, function11, i4, function12, playerResizeMode, function13, playerDefaultViewMode, function14, playerFrameRateMatchingMode, function15, videoVersionPrioritySettings, function16, audioVersionPrioritySettings, function17, subtitleVersionPrioritySettings, function18, l2, l3, l4, l5, l6, l7, j2, j3, settings, function19, c71Var, function40, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3, iUpdateChangedFlags4, iUpdateChangedFlags5, iUpdateChangedFlags6);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    public static final void m(final MediaItem mediaItem, final String str, final String str2, final long j2, final long j3, final long j4, final boolean z, final boolean z2, final FocusRequester focusRequester, final FocusRequester focusRequester2, final Function1 function1, final Function0 function0, final Function0 function2, final Function0 function3, final Function0 function4, final Function0 function5, final Function0 function6, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        Modifier modifierFocusProperties;
        char c2;
        boolean z3;
        Modifier.Companion companion;
        float f2;
        float f3;
        Object obj;
        Object r2;
        Composer composerStartRestartGroup = composer.startRestartGroup(555886397);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(mediaItem) : composerStartRestartGroup.changedInstance(mediaItem) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changed(j4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(focusRequester) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(focusRequester2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function5) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function6) ? 1048576 : 524288;
        }
        int i6 = i5;
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (598163 & i6) == 598162) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(555886397, i4, i6, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsProgressSection (PlayerControls.kt:1323)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion3, focusRequester);
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1630911315);
                boolean z4 = (1879048192 & i4) == 536870912;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new h5(focusRequester2, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                modifierFocusProperties = FocusPropertiesKt.focusProperties(companion3, (Function1) objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1630913925);
                composerStartRestartGroup.endReplaceGroup();
                modifierFocusProperties = companion3;
            }
            Modifier modifierFocusable$default = FocusableKt.focusable$default(modifierFocusRequester.then(modifierFocusProperties), false, null, 3, null);
            boolean z5 = (i6 & 14) == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new r7(function1, mutableState, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusable$default, (Function1) objRememberedValue3);
            boolean z6 = ((i6 & 458752) == 131072) | ((i6 & Input.Keys.FORWARD_DEL) == 32) | ((3670016 & i6) == 1048576) | ((i6 & 896) == 256) | ((57344 & i6) == 16384);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new gg1(function0, function6, function2, function4, function5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue4);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f));
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion4.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnPreviewKeyEvent);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion5, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (StringsKt.isBlank(mediaItem.getName()) && (str == null || StringsKt.isBlank(str))) {
                composerStartRestartGroup.startReplaceGroup(-194999589);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                companion5 = companion5;
                z3 = false;
                c2 = ' ';
            } else {
                composerStartRestartGroup.startReplaceGroup(-195981080);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyQ = mr.q(10.0f, arrangement, companion4.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                c2 = ' ';
                int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion5, composerM4318constructorimpl2, measurePolicyQ, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i8), composerM4318constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (StringsKt.isBlank(mediaItem.getName())) {
                    composer2 = composerStartRestartGroup;
                    z3 = false;
                    composer2.startReplaceGroup(-150366758);
                    composer2.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-150723847);
                    z3 = false;
                    TextKt.m3048TextNvy7gAk(mediaItem.getName(), rowScopeInstance.weight(companion3, 1.0f, false), Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleLarge(), composerStartRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110584);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                String str3 = (str == null || StringsKt.isBlank(str)) ? null : str;
                if (str3 == null) {
                    composer2.startReplaceGroup(-150296327);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-150296326);
                    TextKt.m3048TextNvy7gAk(str3, null, Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.88f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 24576, 114682);
                    Unit unit = Unit.INSTANCE;
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            boolean z7 = (((Boolean) mutableState.getValue()).booleanValue() || z) ? true : z3;
            float fM7813constructorimpl = Dp.m7813constructorimpl(z7 ? 5.0f : 3.0f);
            float fM7813constructorimpl2 = z7 ? Dp.m7813constructorimpl(10.0f) : fM7813constructorimpl;
            float fM7813constructorimpl3 = Dp.m7813constructorimpl(((Boolean) mutableState.getValue()).booleanValue() ? 4.0f : 2.0f);
            long j5 = j4 > 0 ? j4 : 1L;
            long jCoerceIn = RangesKt.coerceIn(j2, 0L, j5);
            long j6 = j5;
            long jCoerceIn2 = RangesKt.coerceIn(j3, 0L, j6);
            double d2 = j6;
            final float fCoerceIn = RangesKt.coerceIn((float) (jCoerceIn / d2), 0.0f, 1.0f);
            final float fCoerceIn2 = RangesKt.coerceIn((float) (jCoerceIn2 / d2), 0.0f, 1.0f);
            final long jM5151copywmQWz5c$default = ((Boolean) mutableState.getValue()).booleanValue() ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
            final long jM5151copywmQWz5c$default2 = ((Boolean) mutableState.getValue()).booleanValue() ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
            Color.Companion companion6 = Color.INSTANCE;
            final long jM5151copywmQWz5c$default3 = Color.m5151copywmQWz5c$default(companion6.m5189getWhite0d7_KjU(), 0.96f, 0.0f, 0.0f, 0.0f, 14, null);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            final float fMo420toPx0680j_4 = density.mo420toPx0680j_4(fM7813constructorimpl);
            final float fMo420toPx0680j_5 = density.mo420toPx0680j_4(fM7813constructorimpl3);
            if (str2 == null) {
                composer2.startReplaceGroup(-193635931);
                composer2.endReplaceGroup();
                companion = companion3;
                f2 = fM7813constructorimpl;
                f3 = fM7813constructorimpl2;
                obj = null;
                r2 = 1;
            } else {
                composer2.startReplaceGroup(-193635930);
                Composer composer3 = composer2;
                companion = companion3;
                f2 = fM7813constructorimpl;
                f3 = fM7813constructorimpl2;
                obj = null;
                r2 = 1;
                TextKt.m3048TextNvy7gAk(str2, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Color.m5151copywmQWz5c$default(companion6.m5189getWhite0d7_KjU(), 0.88f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer3, 432, 24960, 110584);
                composer2 = composer3;
                Unit unit2 = Unit.INSTANCE;
                composer2.endReplaceGroup();
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, r2, obj);
            MeasurePolicy measurePolicyQ2 = mr.q(10.0f, arrangement, companion4.getCenterVertically(), composer2, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> c2));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer2);
            ComposeUiNode.Companion companion7 = companion5;
            mr.z(companion7, composerM4318constructorimpl3, measurePolicyQ2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            String strR = r(j2);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            Composer composer4 = composer2;
            TextKt.m3048TextNvy7gAk(strR, null, companion6.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i10).getBodySmall(), composer4, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
            final float f4 = f2;
            final boolean z8 = z7;
            BoxWithConstraintsKt.BoxWithConstraints(ClipKt.clipToBounds(SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance2, companion, 1.0f, false, 2, null), f3)), null, false, ComposableLambdaKt.rememberComposableLambda(1163742093, r2, new Function3() { // from class: we1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    long j7;
                    BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj2;
                    Composer composer5 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    boxWithConstraintsScope.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer5.changed(boxWithConstraintsScope) ? 4 : 2;
                    }
                    if (composer5.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1163742093, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlayerControlsProgressSection.<anonymous>.<anonymous>.<anonymous> (PlayerControls.kt:1453)");
                        }
                        float fMo734getMaxWidthD9Ej5fM = boxWithConstraintsScope.mo734getMaxWidthD9Ej5fM();
                        boolean z9 = z8;
                        float fM7813constructorimpl4 = z9 ? Dp.m7813constructorimpl(10.0f) : Dp.m7813constructorimpl(0.0f);
                        float fM7813constructorimpl5 = Dp.m7813constructorimpl(fM7813constructorimpl4 / 2.0f);
                        final float f5 = fCoerceIn;
                        float fM7813constructorimpl6 = Dp.m7813constructorimpl(Dp.m7813constructorimpl(fMo734getMaxWidthD9Ej5fM * f5) - fM7813constructorimpl5);
                        Modifier.Companion companion8 = Modifier.INSTANCE;
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), f4);
                        Alignment.Companion companion9 = Alignment.INSTANCE;
                        Modifier modifierAlign = boxWithConstraintsScope.align(modifierM1050height3ABfNKs, companion9.getCenterStart());
                        final float f6 = fMo420toPx0680j_5;
                        boolean zChanged = composer5.changed(f6);
                        final float f7 = fMo420toPx0680j_4;
                        boolean zChanged2 = zChanged | composer5.changed(f7);
                        final long j8 = jM5151copywmQWz5c$default2;
                        boolean zChanged3 = zChanged2 | composer5.changed(j8);
                        final long j9 = jM5151copywmQWz5c$default;
                        boolean zChanged4 = zChanged3 | composer5.changed(j9);
                        final float f8 = fCoerceIn2;
                        boolean zChanged5 = zChanged4 | composer5.changed(f8) | composer5.changed(f5);
                        Object objRememberedValue5 = composer5.rememberedValue();
                        final long j10 = jM5151copywmQWz5c$default3;
                        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            Function1 function7 = new Function1() { // from class: ye1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    DrawScope drawScope = (DrawScope) obj5;
                                    drawScope.getClass();
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5620getSizeNHjbRc() >> 32));
                                    float f9 = f7;
                                    float fCoerceAtLeast = RangesKt.coerceAtLeast(f6, f9 / 2.0f);
                                    pc0.n(drawScope, j8, 0L, Size.m4972constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L)), CornerRadius.m4866constructorimpl((((long) Float.floatToRawIntBits(fCoerceAtLeast)) << 32) | (((long) Float.floatToRawIntBits(fCoerceAtLeast)) & 4294967295L)), null, 0.0f, null, 0, 242, null);
                                    pc0.n(drawScope, j9, 0L, Size.m4972constructorimpl((((long) Float.floatToRawIntBits(f8 * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L)), CornerRadius.m4866constructorimpl((((long) Float.floatToRawIntBits(fCoerceAtLeast)) << 32) | (((long) Float.floatToRawIntBits(fCoerceAtLeast)) & 4294967295L)), null, 0.0f, null, 0, 242, null);
                                    pc0.n(drawScope, j10, 0L, Size.m4972constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat * f5)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L)), CornerRadius.m4866constructorimpl((((long) Float.floatToRawIntBits(fCoerceAtLeast)) << 32) | (((long) Float.floatToRawIntBits(fCoerceAtLeast)) & 4294967295L)), null, 0.0f, null, 0, 242, null);
                                    return Unit.INSTANCE;
                                }
                            };
                            j7 = j10;
                            composer5.updateRememberedValue(function7);
                            objRememberedValue5 = function7;
                        } else {
                            j7 = j10;
                        }
                        CanvasKt.Canvas(modifierAlign, (Function1) objRememberedValue5, composer5, 0);
                        if (z9) {
                            composer5.startReplaceGroup(66132967);
                            Modifier modifierM274backgroundbw27NRU = BackgroundKt.m274backgroundbw27NRU(boxWithConstraintsScope.align(SizeKt.m1064size3ABfNKs(OffsetKt.m959offsetVpY3zN4$default(r18, ((Dp) RangesKt___RangesKt.coerceIn(Dp.m7811boximpl(fM7813constructorimpl6), Dp.m7811boximpl(Dp.m7813constructorimpl(0.0f)), Dp.m7811boximpl(Dp.m7813constructorimpl(fMo734getMaxWidthD9Ej5fM - fM7813constructorimpl4)))).m7827unboximpl(), 0.0f, 2, r17), fM7813constructorimpl4), companion9.getCenterStart()), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getTopStart(), false);
                            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                            int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierM274backgroundbw27NRU);
                            ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor4 = companion10.getConstructor();
                            if (composer5.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor4);
                            } else {
                                composer5.useNode();
                            }
                            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer5);
                            mr.z(companion10, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl4, Integer.valueOf(i11), composerM4318constructorimpl4));
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            BoxKt.Box(BackgroundKt.m274backgroundbw27NRU(SizeKt.fillMaxSize$default(PaddingKt.m999padding3ABfNKs(companion8, Dp.m7813constructorimpl(1.5f)), 0.0f, 1, 0), j7, RoundedCornerShapeKt.RoundedCornerShape(50)), composer5, 0);
                            composer5.endNode();
                            composer5.endReplaceGroup();
                        } else {
                            composer5.startReplaceGroup(66792213);
                            composer5.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer5.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 3072, 6);
            TextKt.m3048TextNvy7gAk(r(j4), null, companion6.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i10).getBodySmall(), composer4, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
            if (x2.m(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xe1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    jg1.m(mediaItem, str, str2, j2, j3, j4, z, z2, focusRequester, focusRequester2, function1, function0, function2, function3, function4, function5, function6, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:496:0x0701  */
    /* JADX WARN: Code duplicated, block: B:501:0x070f  */
    /* JADX WARN: Code duplicated, block: B:504:0x0716  */
    /* JADX WARN: Code duplicated, block: B:506:0x0719  */
    /* JADX WARN: Code duplicated, block: B:509:0x0729  */
    /* JADX WARN: Code duplicated, block: B:512:0x0733  */
    /* JADX WARN: Code duplicated, block: B:515:0x073d  */
    /* JADX WARN: Code duplicated, block: B:518:0x0747  */
    /* JADX WARN: Code duplicated, block: B:521:0x0751  */
    /* JADX WARN: Code duplicated, block: B:524:0x075b  */
    /* JADX WARN: Code duplicated, block: B:527:0x0764  */
    /* JADX WARN: Code duplicated, block: B:530:0x076d  */
    /* JADX WARN: Code duplicated, block: B:533:0x0776  */
    /* JADX WARN: Code duplicated, block: B:536:0x077f  */
    /* JADX WARN: Code duplicated, block: B:539:0x0788  */
    /* JADX WARN: Code duplicated, block: B:540:0x078b  */
    /* JADX WARN: Code duplicated, block: B:543:0x0794  */
    /* JADX WARN: Code duplicated, block: B:544:0x0797  */
    /* JADX WARN: Code duplicated, block: B:547:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:548:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:551:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:552:0x07af  */
    /* JADX WARN: Code duplicated, block: B:554:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:555:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:556:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:559:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:562:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:565:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:567:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:569:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:572:0x0800  */
    /* JADX WARN: Code duplicated, block: B:590:0x0881  */
    /* JADX WARN: Code duplicated, block: B:591:0x088a  */
    /* JADX WARN: Code duplicated, block: B:593:0x0892  */
    /* JADX WARN: Code duplicated, block: B:594:0x089b  */
    /* JADX WARN: Code duplicated, block: B:606:0x08bf A[PHI: r1
      0x08bf: PHI (r1v61 java.lang.String) = (r1v60 java.lang.String), (r1v64 java.lang.String) binds: [B:622:0x08f0, B:604:0x08bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:886:0x0801 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v44 java.lang.Object, still in use, count: 2, list:
          (r2v44 java.lang.Object) from 0x087d: PHI (r2 I:Object) = (r2v41 java.lang.Object), (r2v44 java.lang.Object) binds: [B:587:0x087c, B:889:0x087d] A[DONT_GENERATE, DONT_INLINE]
          (r2v44 java.lang.Object) from 0x0873: CHECK_CAST (com.dh.myembyapp.data.model.MediaStream) (r2v44 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final void n(final com.dh.myembyapp.data.model.MediaItem r62, final java.lang.String r63, final androidx.media3.exoplayer.ExoPlayer r64, final com.dh.myembyapp.data.SubtitlePreferences r65, final boolean r66, final boolean r67, final boolean r68, final kotlin.jvm.functions.Function1 r69, final kotlin.jvm.functions.Function1 r70, final kotlin.jvm.functions.Function1 r71, final int r72, final kotlin.jvm.functions.Function1 r73, final boolean r74, final kotlin.jvm.functions.Function0 r75, final boolean r76, final float r77, final int r78, final int r79, final int r80, final boolean r81, final com.dh.myembyapp.data.SubtitlePreferences.SubtitleColor r82, final boolean r83, final boolean r84, final boolean r85, final boolean r86, final boolean r87, final boolean r88, final java.lang.Integer r89, final boolean r90, final defpackage.jk1 r91, final kotlin.jvm.functions.Function1 r92, final kotlin.jvm.functions.Function1 r93, final kotlin.jvm.functions.Function1 r94, final defpackage.nk1 r95, final kotlin.jvm.functions.Function1 r96, final defpackage.qk1 r97, final kotlin.jvm.functions.Function0 r98, final kotlin.jvm.functions.Function0 r99, androidx.compose.runtime.Composer r100, final int r101, final int r102, final int r103, final int r104) {
        /*
            Method dump skipped, instruction units count: 3452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg1.n(com.dh.myembyapp.data.model.MediaItem, java.lang.String, androidx.media3.exoplayer.ExoPlayer, com.dh.myembyapp.data.SubtitlePreferences, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function0, boolean, float, int, int, int, boolean, com.dh.myembyapp.data.SubtitlePreferences$SubtitleColor, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Integer, boolean, jk1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, nk1, kotlin.jvm.functions.Function1, qk1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:99:0x0151  */
    public static final void o(String str, List list, String str2, String str3, Function0 function0, Function2 function2, Composer composer, int i2) {
        String str4;
        int i3;
        Function2 function3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        j60 j60Var;
        int iIntValue;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1268925057);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            str4 = str;
            i3 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i2;
        } else {
            str4 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function3 = function2;
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        } else {
            function3 = function2;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1268925057, i6, -1, "com.dh.myembyapp.ui.screens.player.components.VersionSelectionDialog (PlayerControls.kt:2440)");
            }
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(1756046144);
                Unit unit = Unit.INSTANCE;
                boolean z = (57344 & i6) == 16384;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new i90(function0, null, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    j60Var = new j60(str4, list, str2, str3, function0, function3, i2, 1);
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(1756110531);
                composerStartRestartGroup.endReplaceGroup();
                boolean zChanged = ((i6 & 896) == 256) | composerStartRestartGroup.changed(list);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    if (str2 != null) {
                        Iterator it = list.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i4 = -1;
                                break;
                            } else {
                                if (Intrinsics.areEqual(((MediaSource) it.next()).getId(), str2)) {
                                    i4 = i7;
                                    break;
                                }
                                i7++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i4);
                        if (i4 < 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 0;
                        }
                    } else {
                        iIntValue = 0;
                    }
                    objRememberedValue2 = Integer.valueOf(iIntValue);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                int iIntValue2 = ((Number) objRememberedValue2).intValue();
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = mr.n(composerStartRestartGroup);
                }
                FocusRequester focusRequester = (FocusRequester) objRememberedValue3;
                Unit unit2 = Unit.INSTANCE;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ji(focusRequester, null, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                long j2 = a;
                long j3 = f;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0(function0, pt.a, null, ComposableLambdaKt.rememberComposableLambda(-622675511, true, new r50(i5, function0), composerStartRestartGroup, 54), null, pt.b, ComposableLambdaKt.rememberComposableLambda(1659898572, true, new i60(str, list, str2, str3, iIntValue2, function2, focusRequester, 1), composerStartRestartGroup, 54), null, j2, 0L, j3, j3, 0.0f, null, composer2, ((i6 >> 12) & 14) | 102435888, 54, 12948);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(j60Var);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            j60Var = new j60(str, list, str2, str3, function0, function2, i2, 2);
            scopeUpdateScopeEndRestartGroup.updateScope(j60Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[PHI: r1
      0x006c: PHI (r1v33 java.lang.String) = (r1v7 java.lang.String), (r1v73 java.lang.String) binds: [B:27:0x0067, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0107  */
    public static final ArrayList p(MediaSource mediaSource) {
        String path;
        int iLastIndexOf$default;
        String lowerCase;
        String str;
        String strRemoveSuffix;
        String string;
        ArrayList arrayList = new ArrayList();
        String strBuildVideoResolutionLabel = VideoResolutionKt.buildVideoResolutionLabel(mediaSource, ResolutionLabelStyle.UPPERCASE);
        if (strBuildVideoResolutionLabel != null) {
            arrayList.add(strBuildVideoResolutionLabel);
        }
        String strBuildVideoTypeLabel = MediaSourcePriorityKt.buildVideoTypeLabel(mediaSource);
        if (strBuildVideoTypeLabel != null) {
            arrayList.add(strBuildVideoTypeLabel);
        }
        String container = mediaSource.getContainer();
        String str2 = null;
        if (container != null && (string = StringsKt.trim((CharSequence) container).toString()) != null) {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt.isBlank(lowerCase)) {
                lowerCase = null;
            }
            if (lowerCase != null) {
                switch (lowerCase) {
                    case 3711:
                        if (!lowerCase.equals("ts")) {
                            str = "TS";
                        }
                        break;
                    case 96980:
                        if (!lowerCase.equals("avi")) {
                            str = "AVI";
                        }
                        break;
                    case 101488:
                        if (!lowerCase.equals("flv")) {
                            str = "FLV";
                        }
                        break;
                    case 104581:
                        if (!lowerCase.equals("iso")) {
                            str = ExifInterface.TAG_RW2_ISO;
                        }
                        break;
                    case 106479:
                        if (!lowerCase.equals("m4v")) {
                            str = "M4V";
                        }
                        break;
                    case 108184:
                        if (!lowerCase.equals("mkv")) {
                            str = "MKV";
                        }
                        break;
                    case 108273:
                        if (!lowerCase.equals("mp4")) {
                            str = "MP4";
                        }
                        break;
                    case 108308:
                        if (!lowerCase.equals("mov")) {
                            str = "MOV";
                        }
                        break;
                    case 117856:
                        if (!lowerCase.equals("wmv")) {
                            str = "WMV";
                        }
                        break;
                    case 3298980:
                        if (!lowerCase.equals("m2ts")) {
                            str = "M2TS";
                        }
                        break;
                    case 3645337:
                        if (!lowerCase.equals("webm")) {
                            str = "WEBM";
                        }
                        break;
                    case 310992972:
                        if (!lowerCase.equals("matroska")) {
                            str = "MKV";
                        }
                        break;
                    default:
                        str = null;
                        break;
                }
            } else {
                path = mediaSource.getPath();
                if (path == null) {
                    path = "";
                }
                iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) path, '.', 0, false, 6, (Object) null);
                if (iLastIndexOf$default >= 0) {
                    lowerCase = null;
                } else {
                    lowerCase = null;
                }
                if (lowerCase == null) {
                    switch (lowerCase) {
                        case "ts":
                            str = "TS";
                            break;
                        case "avi":
                            str = "AVI";
                            break;
                        case "flv":
                            str = "FLV";
                            break;
                        case "iso":
                            str = ExifInterface.TAG_RW2_ISO;
                            break;
                        case "m4v":
                            str = "M4V";
                            break;
                        case "mkv":
                            str = "MKV";
                            break;
                        case "mp4":
                            str = "MP4";
                            break;
                        case "mov":
                            str = "MOV";
                            break;
                        case "wmv":
                            str = "WMV";
                            break;
                        case "m2ts":
                            str = "M2TS";
                            break;
                        case "webm":
                            str = "WEBM";
                            break;
                        case "matroska":
                            str = "MKV";
                            break;
                        default:
                            str = null;
                            break;
                    }
                } else {
                    str = null;
                }
            }
        } else {
            path = mediaSource.getPath();
            if (path == null) {
                path = "";
            }
            iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) path, '.', 0, false, 6, (Object) null);
            if (iLastIndexOf$default >= 0 || iLastIndexOf$default >= StringsKt__StringsKt.getLastIndex(path)) {
                lowerCase = null;
            } else {
                lowerCase = path.substring(iLastIndexOf$default + 1).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            if (lowerCase == null) {
                switch (lowerCase) {
                    case 3711:
                        if (!lowerCase.equals("ts")) {
                            str = "TS";
                        }
                        break;
                    case 96980:
                        if (!lowerCase.equals("avi")) {
                            str = "AVI";
                        }
                        break;
                    case 101488:
                        if (!lowerCase.equals("flv")) {
                            str = "FLV";
                        }
                        break;
                    case 104581:
                        if (!lowerCase.equals("iso")) {
                            str = ExifInterface.TAG_RW2_ISO;
                        }
                        break;
                    case 106479:
                        if (!lowerCase.equals("m4v")) {
                            str = "M4V";
                        }
                        break;
                    case 108184:
                        if (!lowerCase.equals("mkv")) {
                            str = "MKV";
                        }
                        break;
                    case 108273:
                        if (!lowerCase.equals("mp4")) {
                            str = "MP4";
                        }
                        break;
                    case 108308:
                        if (!lowerCase.equals("mov")) {
                            str = "MOV";
                        }
                        break;
                    case 117856:
                        if (!lowerCase.equals("wmv")) {
                            str = "WMV";
                        }
                        break;
                    case 3298980:
                        if (!lowerCase.equals("m2ts")) {
                            str = "M2TS";
                        }
                        break;
                    case 3645337:
                        if (!lowerCase.equals("webm")) {
                            str = "WEBM";
                        }
                        break;
                    case 310992972:
                        if (!lowerCase.equals("matroska")) {
                            str = "MKV";
                        }
                        break;
                    default:
                        str = null;
                        break;
                }
            } else {
                str = null;
            }
        }
        if (str != null) {
            arrayList.add(str);
        }
        Long size = mediaSource.getSize();
        if (size == null || size.longValue() <= 0) {
            strRemoveSuffix = null;
        } else {
            double dLongValue = size.longValue() / 1.073741824E9d;
            if (dLongValue >= 1.0d) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                strRemoveSuffix = StringsKt__StringsKt.removeSuffix(String.format("%.2fG", Arrays.copyOf(new Object[]{Double.valueOf(dLongValue)}, 1)), (CharSequence) ".00");
            } else {
                double dLongValue2 = size.longValue() / 1048576.0d;
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                strRemoveSuffix = String.format("%.0fM", Arrays.copyOf(new Object[]{Double.valueOf(dLongValue2)}, 1));
            }
        }
        if (strRemoveSuffix != null) {
            arrayList.add(strRemoveSuffix);
        }
        Integer bitrate = mediaSource.getBitrate();
        if (bitrate != null && bitrate.intValue() > 0) {
            if (bitrate.intValue() >= 1000000) {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                str2 = String.format("%.1fMbps", Arrays.copyOf(new Object[]{Double.valueOf(((double) bitrate.intValue()) / 1000000.0d)}, 1));
            } else {
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                str2 = String.format("%dKbps", Arrays.copyOf(new Object[]{Integer.valueOf(bitrate.intValue() / 1000)}, 1));
            }
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        return arrayList;
    }

    public static final IntSize q(int i2, int i3, int i4, int i5) {
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            return null;
        }
        float f2 = i2;
        float f3 = i3;
        float fMin = Math.min(i4 / f2, i5 / f3);
        int iCoerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(f2 * fMin), 1);
        return IntSize.m7972boximpl(IntSize.m7975constructorimpl((((long) RangesKt.coerceAtLeast(MathKt.roundToInt(f3 * fMin), 1)) & 4294967295L) | (((long) iCoerceAtLeast) << 32)));
    }

    public static final String r(long j2) {
        long j3 = j2 / 1000;
        long j4 = j3 / 3600;
        long j5 = (j3 % 3600) / 60;
        long j6 = j3 % 60;
        if (j4 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6)}, 2));
    }
}
