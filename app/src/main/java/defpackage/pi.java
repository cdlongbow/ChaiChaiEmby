package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerConfigKt;
import com.dh.myembyapp.server.BackupRouteConfigServerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pi {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Function0 function0, Modifier modifier, bh bhVar, Function2 function2, Composer composer, int i) {
        int i2;
        ah ahVar;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1794779140);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(bhVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i3 = i2;
        boolean z = false;
        int i4 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1794779140, i3, -1, "com.dh.myembyapp.ui.components.BackupRouteActionButton (BackupRouteManagerDialog.kt:1602)");
            }
            u61 u61VarY = hg2.y(composerStartRestartGroup);
            int i5 = (i3 >> 6) & 14;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(348421011, i5, -1, "com.dh.myembyapp.ui.components.backupRouteActionPalette (BackupRouteManagerDialog.kt:95)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            int iOrdinal = bhVar.ordinal();
            if (iOrdinal == 0) {
                ahVar = new ah(u61Var.h, u61Var.i, u61Var.j);
            } else if (iOrdinal == 1) {
                ahVar = new ah(u61Var.k, u61Var.l, u61Var.m);
            } else if (iOrdinal == 2) {
                ahVar = new ah(u61Var.n, u61Var.o, u61Var.p);
            } else {
                if (iOrdinal != 3) {
                    qu.f();
                    return;
                }
                ahVar = new ah(u61Var.q, u61Var.r, u61Var.s);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1794110971);
                z = !hg2.v(composerStartRestartGroup);
            } else {
                composerStartRestartGroup.startReplaceGroup(-217133510);
            }
            composerStartRestartGroup.endReplaceGroup();
            long jColor = z ? ColorKt.Color(4279308561L) : ahVar.c;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new zh(i4, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue2);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(999.0f));
            int i6 = ClickableSurfaceDefaults.$stable;
            int i7 = i6 << 15;
            ah ahVar2 = ahVar;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composerStartRestartGroup, i7, 30), clickableSurfaceDefaults.m8292colorsoq7We08(ahVar2.a, ahVar2.c, !hg2.v(composerStartRestartGroup) ? Color.INSTANCE.m5189getWhite0d7_KjU() : ahVar2.b, jColor, 0L, 0L, 0L, 0L, composerStartRestartGroup, i6 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61VarY.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i7, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-2057356517, true, new xh(jColor, function2), composerStartRestartGroup, 54), composerStartRestartGroup, i3 & 14, 48, 1564);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5(function0, modifier, bhVar, function2, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0167  */
    /* JADX WARN: Code duplicated, block: B:50:0x016d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0178  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, ImageVector imageVector, Composer composer, int i, int i2) {
        int i3;
        ImageVector imageVector2;
        int i4;
        boolean z;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        ImageVector imageVector3;
        long jM5162unboximpl;
        Function0<ComposeUiNode> constructor;
        Composer composerStartRestartGroup = composer.startRestartGroup(-614855476);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                imageVector2 = imageVector;
                i3 |= composerStartRestartGroup.changed(imageVector2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                if (i5 != 0) {
                    imageVector3 = null;
                } else {
                    imageVector3 = imageVector2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-614855476, i4, -1, "com.dh.myembyapp.ui.components.BackupRouteButtonContent (BackupRouteManagerDialog.kt:1649)");
                }
                jM5162unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m5162unboximpl();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f));
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (imageVector3 != null) {
                    composerStartRestartGroup.startReplaceGroup(1337630396);
                    IconKt.m2496Iconww6aTOc(imageVector3, (String) null, (Modifier) null, jM5162unboximpl, composerStartRestartGroup, ((i4 >> 3) & 14) | 48, 4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1337782234);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composer2 = composerStartRestartGroup;
                TextKt.m3048TextNvy7gAk(str, null, jM5162unboximpl, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null), composer2, i4 & 14, 0, 131066);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                imageVector2 = imageVector3;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new jh(str, imageVector2, i, i2));
            }
        }
        i3 |= 48;
        imageVector2 = imageVector;
        i4 = i3;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
            if (i5 != 0) {
                imageVector3 = null;
            } else {
                imageVector3 = imageVector2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-614855476, i4, -1, "com.dh.myembyapp.ui.components.BackupRouteButtonContent (BackupRouteManagerDialog.kt:1649)");
            }
            jM5162unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m5162unboximpl();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, centerVertically2, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            if (imageVector3 != null) {
                composerStartRestartGroup.startReplaceGroup(1337630396);
                IconKt.m2496Iconww6aTOc(imageVector3, (String) null, (Modifier) null, jM5162unboximpl, composerStartRestartGroup, ((i4 >> 3) & 14) | 48, 4);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1337782234);
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            TextKt.m3048TextNvy7gAk(str, null, jM5162unboximpl, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null), composer2, i4 & 14, 0, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            imageVector2 = imageVector3;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jh(str, imageVector2, i, i2));
        }
    }

    public static final void c(int i, Function0 function0, Function0 function1, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1742655222);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & Input.Keys.NUMPAD_3) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1742655222, i3, -1, "com.dh.myembyapp.ui.components.BackupRouteClearConfirmDialog (BackupRouteManagerDialog.kt:1430)");
            }
            AndroidDialog_androidKt.Dialog(function1, new DialogProperties(true, true, false), ComposableLambdaKt.rememberComposableLambda(1055178431, true, new h4(i, function1, function0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jh(i, function0, function1, i2, 0));
        }
    }

    public static final void d(boolean z, Composer composer, int i) {
        int i2;
        long jD;
        Composer composerStartRestartGroup = composer.startRestartGroup(626829323);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626829323, i2, -1, "com.dh.myembyapp.ui.components.BackupRouteCompactToggle (BackupRouteManagerDialog.kt:1673)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(52.0f)), Dp.m7813constructorimpl(28.0f));
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-645240044);
                jD = zc2.b(false, composerStartRestartGroup, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-645167566);
                jD = zc2.d(false, composerStartRestartGroup, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(kb0.v(999.0f, modifierM1050height3ABfNKs, jD), Dp.m7813constructorimpl(4.0f), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(z ? companion2.getCenterEnd() : companion2.getCenterStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m274backgroundbw27NRU(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), zc2.c(true), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ei(z, i, 0));
        }
    }

    public static final void e(BackupRouteConfig backupRouteConfig, Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1579781108);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(backupRouteConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1579781108, i2, -1, "com.dh.myembyapp.ui.components.BackupRouteDeleteConfirmDialog (BackupRouteManagerDialog.kt:1054)");
            }
            AndroidDialog_androidKt.Dialog(function1, new DialogProperties(true, true, false), ComposableLambdaKt.rememberComposableLambda(-1982080733, true, new r5(backupRouteConfig, function1, function0, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(backupRouteConfig, function0, function1, i, 2));
        }
    }

    public static final void f(ch chVar, Function0 function0, Function0 function1, Function0 function2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1753381398);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1753381398, i2, -1, "com.dh.myembyapp.ui.components.BackupRouteImportConfirmDialog (BackupRouteManagerDialog.kt:1122)");
            }
            List list = chVar.b;
            int i4 = chVar.a;
            int size = list.size();
            String strK = i4 > size ? c61.k("已找到 ", i4, size, " 条备选线路。全部导入会清空当前已填写的线路，并保留前 ", " 条。") : x2.f(i4, "已找到 ", " 条备选线路。导入时会先清空当前已填写的线路。");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Integer numValueOf = Integer.valueOf(i4);
            Integer numValueOf2 = Integer.valueOf(size);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ji(focusRequester, null, i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
            AndroidDialog_androidKt.Dialog(function2, new DialogProperties(true, true, false), ComposableLambdaKt.rememberComposableLambda(758973747, true, new oh(strK, function0, focusRequester, function1, function2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 9) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5((Object) chVar, (Object) function0, (Object) function1, (Object) function2, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(BackupRouteConfig backupRouteConfig, boolean z, Modifier modifier, Function0 function0, Composer composer, int i) {
        int i2;
        long onSurface;
        long jM5189getWhite0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1292638402);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(backupRouteConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        boolean z2 = false;
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1292638402, i2, -1, "com.dh.myembyapp.ui.components.BackupRouteImportSelectableItem (BackupRouteManagerDialog.kt:1331)");
            }
            u61 u61VarY = hg2.y(composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-313567853);
                composerStartRestartGroup.endReplaceGroup();
                onSurface = u61VarY.p;
            } else {
                composerStartRestartGroup.startReplaceGroup(-313513231);
                onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-979941475);
                z2 = !hg2.v(composerStartRestartGroup);
            } else {
                composerStartRestartGroup.startReplaceGroup(-313413416);
            }
            composerStartRestartGroup.endReplaceGroup();
            long jColor = z2 ? ColorKt.Color(4279308561L) : onSurface;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new zh(2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue2);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f));
            int i3 = ClickableSurfaceDefaults.$stable;
            int i4 = i3 << 15;
            ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composerStartRestartGroup, i4, 30);
            long j = z ? u61VarY.Q : u61VarY.C;
            if (hg2.v(composerStartRestartGroup)) {
                jM5189getWhite0d7_KjU = z ? u61VarY.R : u61VarY.D;
            } else {
                jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
            }
            long j2 = jColor;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, jM5189getWhite0d7_KjU, j2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i3 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61VarY.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1848920769, true, new hi(z, u61VarY, backupRouteConfig, j2), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 9) & 14, 48, 1564);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(backupRouteConfig, z, modifier, function0, i, 1));
        }
    }

    public static final void h(String str, Function1 function1, String str2, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(40316518);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(40316518, i2, -1, "com.dh.myembyapp.ui.components.BackupRouteInputField (BackupRouteManagerDialog.kt:1556)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            TextStyle textStyleMerge = materialTheme.getTypography(composerStartRestartGroup, i3).getBodySmall().merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16252927, (DefaultConstructorMarker) null));
            TextStyle textStyleM7288copyp1EtxEg$default = TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composerStartRestartGroup, i3).getBodySmall(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i5 = i2;
            TextKt.m3048TextNvy7gAk(str2, PaddingKt.m1003paddingqDBjuR0$default(companion2, Dp.m7813constructorimpl(4.0f), 0.0f, 0.0f, 0.0f, 14, null), jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composerStartRestartGroup, ((i2 >> 6) & 14) | 48, 0, 131064);
            composer2 = composerStartRestartGroup;
            yc2.d(str, function1, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, null, ComposableLambdaKt.rememberComposableLambda(3333687, true, new a2(7, str2, textStyleMerge), composerStartRestartGroup, 54), null, null, null, null, materialTheme.getTypography(composerStartRestartGroup, i3).getBodyMedium().merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, 0, 0, (TextMotion) null, 16252927, (DefaultConstructorMarker) null)), false, null, null, composer2, (i5 & 14) | 196992 | (i5 & Input.Keys.FORWARD_DEL), 6, 29656);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5(str, function1, (Object) str2, modifier, i, 2));
        }
    }

    public static final void i(final String str, final boolean z, final boolean z2, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1504991534);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1504991534, i2, -1, "com.dh.myembyapp.ui.components.BackupRouteItemActionDialog (BackupRouteManagerDialog.kt:953)");
            }
            AndroidDialog_androidKt.Dialog(function3, new DialogProperties(true, true, false), ComposableLambdaKt.rememberComposableLambda(-931393367, true, new Function2() { // from class: lh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-931393367, iIntValue, -1, "com.dh.myembyapp.ui.components.BackupRouteItemActionDialog.<anonymous> (BackupRouteManagerDialog.kt:962)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(360.0f));
                        CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14);
                        final String str2 = str;
                        final boolean z3 = z;
                        final boolean z4 = z2;
                        final Function0 function4 = function0;
                        final Function0 function5 = function1;
                        final Function0 function6 = function2;
                        final Function0 function7 = function3;
                        CardKt.Card(modifierM1069width3ABfNKs, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(41385889, true, new Function3() { // from class: uh
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                String str3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((ColumnScope) obj3).getClass();
                                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(41385889, iIntValue2, -1, "com.dh.myembyapp.ui.components.BackupRouteItemActionDialog.<anonymous>.<anonymous>.<anonymous> (BackupRouteManagerDialog.kt:972)");
                                    }
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), Alignment.INSTANCE.getStart(), composer3, 6);
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i5 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk(str2, null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i5).getTitleMedium(), composer3, 1572864, 0, 131006);
                                    final boolean z5 = z3;
                                    if (z5) {
                                        str3 = z4 ? "当前正在使用主线路" : "主线路不可编辑或删除";
                                    } else {
                                        str3 = "请选择操作";
                                    }
                                    TextKt.m3048TextNvy7gAk(str3, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i5).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i5).getBodySmall(), composer3, 0, 0, 131066);
                                    pi.a(function4, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bh.c, ComposableLambdaKt.rememberComposableLambda(2101696536, true, new Function2() { // from class: wh
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer4 = (Composer) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            if (composer4.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2101696536, iIntValue3, -1, "com.dh.myembyapp.ui.components.BackupRouteItemActionDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BackupRouteManagerDialog.kt:997)");
                                                }
                                                pi.b(z5 ? "启用主线路" : "启用该线路", CheckKt.getCheck(Icons.INSTANCE.getDefault()), composer4, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 54), composer3, 3504);
                                    if (z5) {
                                        composer3.startReplaceGroup(-653949173);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-654670884);
                                        pi.a(function5, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bh.a, vs.e, composer3, 3504);
                                        pi.a(function6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bh.d, vs.f, composer3, 3504);
                                        composer3.endReplaceGroup();
                                    }
                                    pi.a(function7, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bh.b, vs.g, composer3, 3504);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, 196614, 26);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 18) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mh(str, z, z2, function0, function1, function2, function3, i, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014d  */
    /* JADX WARN: Code duplicated, block: B:103:0x015d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0169  */
    /* JADX WARN: Code duplicated, block: B:106:0x0173  */
    /* JADX WARN: Code duplicated, block: B:109:0x017f  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:115:0x0258  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0268  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0123  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0133  */
    /* JADX WARN: Code duplicated, block: B:96:0x0138  */
    /* JADX WARN: Code duplicated, block: B:98:0x013c  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(final String str, final String str2, final boolean z, final boolean z2, final boolean z3, final boolean z4, Modifier modifier, final Function0 function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        final u61 u61VarY;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z6;
        MutableState mutableState;
        long onSurface;
        long j;
        long j2;
        long j3;
        long jM5189getWhite0d7_KjU;
        boolean z7;
        long jColor;
        Object objRememberedValue2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1045285192);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((12582912 & i) != 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i4 = 8388608;
                } else {
                    i4 = 4194304;
                }
                i3 |= i4;
            }
            if ((4793491 & i3) != 4793490) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
                if (i5 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1045285192, i3, -1, "com.dh.myembyapp.ui.components.BackupRouteListItem (BackupRouteManagerDialog.kt:847)");
                }
                u61VarY = hg2.y(composerStartRestartGroup);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    z6 = true;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    z6 = true;
                }
                mutableState = (MutableState) objRememberedValue;
                if (z4 || z2) {
                    composerStartRestartGroup.startReplaceGroup(-1577829737);
                    onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1577884359);
                    composerStartRestartGroup.endReplaceGroup();
                    onSurface = u61VarY.p;
                }
                if (z2) {
                    j = onSurface;
                    j2 = u61VarY.E;
                } else {
                    j = onSurface;
                    if (z4) {
                        j2 = u61VarY.Q;
                    } else {
                        j2 = u61VarY.C;
                    }
                }
                if (z2) {
                    j3 = j2;
                    jM5189getWhite0d7_KjU = u61VarY.F;
                } else {
                    j3 = j2;
                    if (z4) {
                        jM5189getWhite0d7_KjU = u61VarY.R;
                    } else {
                        jM5189getWhite0d7_KjU = u61VarY.D;
                    }
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(503308215);
                    z7 = !hg2.v(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1577313282);
                    composerStartRestartGroup.endReplaceGroup();
                    z7 = false;
                }
                if (z7) {
                    jColor = ColorKt.Color(4279308561L);
                } else {
                    jColor = j;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new zh(0, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifier4, (Function1) objRememberedValue2);
                ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f));
                int i6 = ClickableSurfaceDefaults.$stable;
                int i7 = i6 << 15;
                Modifier modifier5 = modifier4;
                boolean z8 = z6;
                ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composerStartRestartGroup, i7, 30);
                if (!hg2.v(composerStartRestartGroup)) {
                    jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                }
                final long j4 = jColor;
                SurfaceKt.m8520Surface05tvjtU(function0, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceDefaults.m8292colorsoq7We08(j3, j, jM5189getWhite0d7_KjU, j4, 0L, 0L, 0L, 0L, composerStartRestartGroup, i6 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61VarY.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i7, 29), null, null, ComposableLambdaKt.rememberComposableLambda(2132833209, z8, new Function3() { // from class: bi
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((BoxScope) obj).getClass();
                        if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2132833209, iIntValue, -1, "com.dh.myembyapp.ui.components.BackupRouteListItem.<anonymous> (BackupRouteManagerDialog.kt:891)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f));
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getCenterVertically(), composer2, 54);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                            mr.z(companion4, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
                            Modifier modifierE = zs1.E(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), companion3.getStart(), composer2, 6);
                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer2);
                            mr.z(companion4, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                            int i10 = MaterialTheme.$stable;
                            TextStyle bodySmall = materialTheme.getTypography(composer2, i10).getBodySmall();
                            TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
                            int iM7761getEllipsisgIe3tQ8 = companion5.m7761getEllipsisgIe3tQ8();
                            String str3 = str;
                            long j5 = j4;
                            TextKt.m3048TextNvy7gAk(str3, null, j5, null, 0L, null, null, null, 0L, null, null, 0L, iM7761getEllipsisgIe3tQ8, false, 1, 0, null, bodySmall, composer2, 0, 24960, 110586);
                            TextKt.m3048TextNvy7gAk(str2, null, Color.m5151copywmQWz5c$default(j5, 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion5.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer2, i10).getBodySmall(), composer2, 0, 24960, 110586);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), companion3.getTop(), composer2, 6);
                            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i11 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion2);
                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                            mr.z(companion4, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i11), composerM4318constructorimpl3));
                            boolean z9 = z3;
                            u61 u61Var = u61VarY;
                            if (z9) {
                                composer2.startReplaceGroup(1519024739);
                                pi.q("主线路", u61Var.k, u61Var.m, composer2, 6);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1519305351);
                                composer2.endReplaceGroup();
                            }
                            if (z4) {
                                composer2.startReplaceGroup(1519349092);
                                pi.q("当前启用", u61Var.n, u61Var.p, composer2, 6);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1519628743);
                                composer2.endReplaceGroup();
                            }
                            if (z) {
                                composer2.startReplaceGroup(1519674375);
                                pi.q("仅直连", u61Var.h, u61Var.j, composer2, 6);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1519951143);
                                composer2.endReplaceGroup();
                            }
                            if (i02.w(composer2)) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 21) & 14, 48, 1564);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ci
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pi.j(str, str2, z, z2, z3, z4, modifier3, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((12582912 & i) != 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        if ((4793491 & i3) != 4793490) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z5, i3 & 1)) {
            if (i5 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1045285192, i3, -1, "com.dh.myembyapp.ui.components.BackupRouteListItem (BackupRouteManagerDialog.kt:847)");
            }
            u61VarY = hg2.y(composerStartRestartGroup);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                z6 = true;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                z6 = true;
            }
            mutableState = (MutableState) objRememberedValue;
            if (z4) {
                composerStartRestartGroup.startReplaceGroup(-1577829737);
                onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1577829737);
                onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (z2) {
                j = onSurface;
                j2 = u61VarY.E;
            } else {
                j = onSurface;
                if (z4) {
                    j2 = u61VarY.Q;
                } else {
                    j2 = u61VarY.C;
                }
            }
            if (z2) {
                j3 = j2;
                jM5189getWhite0d7_KjU = u61VarY.F;
            } else {
                j3 = j2;
                if (z4) {
                    jM5189getWhite0d7_KjU = u61VarY.R;
                } else {
                    jM5189getWhite0d7_KjU = u61VarY.D;
                }
            }
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(503308215);
                z7 = !hg2.v(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1577313282);
                composerStartRestartGroup.endReplaceGroup();
                z7 = false;
            }
            if (z7) {
                jColor = ColorKt.Color(4279308561L);
            } else {
                jColor = j;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new zh(0, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifier4, (Function1) objRememberedValue2);
            ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f));
            int i8 = ClickableSurfaceDefaults.$stable;
            int i9 = i8 << 15;
            Modifier modifier6 = modifier4;
            boolean z9 = z6;
            ClickableSurfaceShape clickableSurfaceShapeShape2 = clickableSurfaceDefaults2.shape(roundedCornerShapeM1312RoundedCornerShape0680j_5, null, null, null, null, composerStartRestartGroup, i9, 30);
            if (!hg2.v(composerStartRestartGroup)) {
                jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
            }
            final long j5 = jColor;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierOnFocusChanged2, null, false, 0.0f, clickableSurfaceShapeShape2, clickableSurfaceDefaults2.m8292colorsoq7We08(j3, j, jM5189getWhite0d7_KjU, j5, 0L, 0L, 0L, 0L, composerStartRestartGroup, i8 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61VarY.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i9, 29), null, null, ComposableLambdaKt.rememberComposableLambda(2132833209, z9, new Function3() { // from class: bi
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((BoxScope) obj).getClass();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2132833209, iIntValue, -1, "com.dh.myembyapp.ui.components.BackupRouteListItem.<anonymous> (BackupRouteManagerDialog.kt:891)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f));
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getCenterVertically(), composer2, 54);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                        mr.z(companion4, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i10), composerM4318constructorimpl));
                        Modifier modifierE = zs1.E(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), companion3.getStart(), composer2, 6);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion4, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i11), composerM4318constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i12 = MaterialTheme.$stable;
                        TextStyle bodySmall = materialTheme.getTypography(composer2, i12).getBodySmall();
                        TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
                        int iM7761getEllipsisgIe3tQ8 = companion5.m7761getEllipsisgIe3tQ8();
                        String str3 = str;
                        long j6 = j5;
                        TextKt.m3048TextNvy7gAk(str3, null, j6, null, 0L, null, null, null, 0L, null, null, 0L, iM7761getEllipsisgIe3tQ8, false, 1, 0, null, bodySmall, composer2, 0, 24960, 110586);
                        TextKt.m3048TextNvy7gAk(str2, null, Color.m5151copywmQWz5c$default(j6, 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion5.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer2, i12).getBodySmall(), composer2, 0, 24960, 110586);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), companion3.getTop(), composer2, 6);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i13 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion2);
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                        mr.z(companion4, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i13), composerM4318constructorimpl3));
                        boolean z10 = z3;
                        u61 u61Var = u61VarY;
                        if (z10) {
                            composer2.startReplaceGroup(1519024739);
                            pi.q("主线路", u61Var.k, u61Var.m, composer2, 6);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1519305351);
                            composer2.endReplaceGroup();
                        }
                        if (z4) {
                            composer2.startReplaceGroup(1519349092);
                            pi.q("当前启用", u61Var.n, u61Var.p, composer2, 6);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1519628743);
                            composer2.endReplaceGroup();
                        }
                        if (z) {
                            composer2.startReplaceGroup(1519674375);
                            pi.q("仅直连", u61Var.h, u61Var.j, composer2, 6);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1519951143);
                            composer2.endReplaceGroup();
                        }
                        if (i02.w(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 21) & 14, 48, 1564);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ci
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pi.j(str, str2, z, z2, z3, z4, modifier3, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:236:0x0660  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(final ServerConfig serverConfig, BackupRouteConfigServerManager backupRouteConfigServerManager, Function0 function0, final Function1 function1, Function2 function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object obj;
        Object objMutableStateOf$default;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        Composer composer3;
        Bitmap bitmapY;
        FocusRequester focusRequester;
        boolean z;
        Object ghVar;
        SnapshotStateList snapshotStateList;
        MutableState mutableState8;
        dh dhVar;
        MutableState mutableState9;
        MutableState mutableState10;
        MutableState mutableState11;
        String str;
        boolean zChanged;
        Object objRememberedValue;
        MutableState mutableState12;
        Composer composer4;
        MutableState mutableState13;
        Object ihVar;
        SnapshotStateList snapshotStateList2;
        MutableState mutableState14;
        MutableState mutableState15;
        int i3;
        ch chVar;
        MutableState mutableState16;
        MutableState mutableState17;
        Object u1Var;
        MutableState mutableState18;
        MutableState mutableState19;
        MutableState mutableState20;
        MutableState mutableState21;
        MutableState mutableState22;
        MutableState mutableState23;
        Composer composer5;
        Object fiVar;
        MutableState mutableState24;
        MutableState mutableState25;
        MutableState mutableState26;
        MutableState mutableState27;
        MutableState mutableState28;
        String str2;
        int i4;
        MutableState mutableState29;
        MutableState mutableState30;
        MutableState mutableState31;
        MutableState mutableState32;
        Composer composer6;
        MutableState mutableState33;
        BackupRouteConfigServerManager backupRouteConfigServerManager2 = backupRouteConfigServerManager;
        backupRouteConfigServerManager2.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(248587398);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(serverConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(backupRouteConfigServerManager2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(248587398, i2, -1, "com.dh.myembyapp.ui.components.BackupRouteManagerDialog (BackupRouteManagerDialog.kt:143)");
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            final u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean zChanged2 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = CollectionsKt.take(serverConfig.getBackupRoutesSafe(), 50);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            List list = (List) objRememberedValue3;
            boolean zChanged3 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                obj = objRememberedValue4;
                SnapshotStateList snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
                snapshotStateListMutableStateListOf.addAll(list);
                composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf);
                obj = snapshotStateListMutableStateListOf;
            }
            obj = objRememberedValue4;
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj;
            boolean zChanged4 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                String activeBackupRouteId = serverConfig.getActiveBackupRouteId();
                if (activeBackupRouteId == null) {
                    activeBackupRouteId = "__main_route__";
                }
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activeBackupRouteId, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState34 = (MutableState) objRememberedValue5;
            boolean zChanged5 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState35 = (MutableState) objRememberedValue6;
            boolean zChanged6 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState36 = (MutableState) objRememberedValue7;
            boolean zChanged7 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState37 = (MutableState) objRememberedValue8;
            boolean zChanged8 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged8 || objRememberedValue9 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue9 = mutableStateMutableStateOf$default;
            }
            final MutableState mutableState38 = (MutableState) objRememberedValue9;
            boolean zChanged9 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged9 || objRememberedValue10 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue10 = mutableStateMutableStateOf$default2;
            }
            MutableState mutableState39 = (MutableState) objRememberedValue10;
            boolean zChanged10 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged10 || objRememberedValue11 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue11 = mutableStateMutableStateOf$default3;
            }
            final MutableState mutableState40 = (MutableState) objRememberedValue11;
            boolean zChanged11 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged11 || objRememberedValue12 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue12 = mutableStateMutableStateOf$default4;
            }
            final MutableState mutableState41 = (MutableState) objRememberedValue12;
            boolean zChanged12 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChanged12 || objRememberedValue13 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default5);
                objRememberedValue13 = mutableStateMutableStateOf$default5;
            }
            final MutableState mutableState42 = (MutableState) objRememberedValue13;
            boolean zChanged13 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (zChanged13 || objRememberedValue14 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default6);
                objRememberedValue14 = mutableStateMutableStateOf$default6;
            }
            MutableState mutableState43 = (MutableState) objRememberedValue14;
            boolean zChanged14 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChanged14 || objRememberedValue15 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default7);
                objRememberedValue15 = mutableStateMutableStateOf$default7;
            }
            MutableState mutableState44 = (MutableState) objRememberedValue15;
            boolean zChanged15 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (zChanged15 || objRememberedValue16 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SetsKt.emptySet(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default8);
                objRememberedValue16 = mutableStateMutableStateOf$default8;
            }
            final MutableState mutableState45 = (MutableState) objRememberedValue16;
            boolean zChanged16 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (zChanged16 || objRememberedValue17 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default9);
                objRememberedValue17 = mutableStateMutableStateOf$default9;
            }
            MutableState mutableState46 = (MutableState) objRememberedValue17;
            boolean zChanged17 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (zChanged17 || objRememberedValue18 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default10);
                objRememberedValue18 = mutableStateMutableStateOf$default10;
            }
            final MutableState mutableState47 = (MutableState) objRememberedValue18;
            boolean zChanged18 = composerStartRestartGroup.changed(serverConfig.getId());
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (zChanged18 || objRememberedValue19 == companion.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue19;
            }
            final MutableState mutableState48 = (MutableState) objMutableStateOf$default;
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == companion.getEmpty()) {
                objRememberedValue20 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue20;
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == companion.getEmpty()) {
                objRememberedValue21 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester3 = (FocusRequester) objRememberedValue21;
            String alias = serverConfig.getAlias();
            if (StringsKt.isBlank(alias)) {
                alias = "主线路";
            }
            final dh dhVar2 = new dh("__main_route__", alias, serverConfig.getDisplayAddress(), serverConfig.getDirectOnly(), null, true, serverConfig.getActiveBackupRouteId() == null);
            String id = serverConfig.getId();
            final MutableState mutableState49 = mutableState46;
            boolean zChanged19 = composerStartRestartGroup.changed(mutableState37) | composerStartRestartGroup.changedInstance(backupRouteConfigServerManager2) | composerStartRestartGroup.changedInstance(serverConfig) | composerStartRestartGroup.changed(snapshotStateList3) | composerStartRestartGroup.changed(mutableState34) | composerStartRestartGroup.changed(mutableState35) | composerStartRestartGroup.changed(mutableState36) | composerStartRestartGroup.changed(mutableState40) | composerStartRestartGroup.changed(mutableState41) | composerStartRestartGroup.changed(mutableState42) | composerStartRestartGroup.changed(mutableState43) | composerStartRestartGroup.changed(mutableState44) | composerStartRestartGroup.changed(mutableState45) | composerStartRestartGroup.changed(mutableState46) | composerStartRestartGroup.changed(mutableState39);
            int i5 = (i2 == true ? 1 : 0) & 7168;
            boolean zChanged20 = zChanged19 | (i5 == 2048) | composerStartRestartGroup.changed(mutableState38);
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (zChanged20 || objRememberedValue22 == companion.getEmpty()) {
                mutableState = mutableState37;
                mutableState2 = mutableState43;
                mutableState3 = mutableState44;
                objRememberedValue22 = new li(backupRouteConfigServerManager2, serverConfig, snapshotStateList3, mutableState34, mutableState35, mutableState36, mutableState40, mutableState41, mutableState42, mutableState2, mutableState3, mutableState45, mutableState49, mutableState39, function1, mutableState, mutableState38, null);
                backupRouteConfigServerManager2 = backupRouteConfigServerManager2;
                mutableState4 = mutableState36;
                mutableState5 = mutableState39;
                Composer composer7 = composerStartRestartGroup;
                snapshotStateList3 = snapshotStateList3;
                mutableState6 = mutableState34;
                mutableState7 = mutableState35;
                composer7.updateRememberedValue(objRememberedValue22);
                composer3 = composer7;
            } else {
                mutableState6 = mutableState34;
                mutableState2 = mutableState43;
                mutableState4 = mutableState36;
                composer3 = composerStartRestartGroup;
                mutableState = mutableState37;
                mutableState5 = mutableState39;
                mutableState7 = mutableState35;
                mutableState3 = mutableState44;
            }
            EffectsKt.LaunchedEffect(id, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue22, composer3, 0);
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composer3.changedInstance(backupRouteConfigServerManager2);
            Object objRememberedValue23 = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue23 == companion.getEmpty()) {
                objRememberedValue23 = new c(backupRouteConfigServerManager2, 10);
                composer3.updateRememberedValue(objRememberedValue23);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue23, composer3, 6);
            boolean zChanged21 = composer3.changed((String) mutableState.getValue());
            Object objRememberedValue24 = composer3.rememberedValue();
            if (zChanged21 || objRememberedValue24 == companion.getEmpty()) {
                String str3 = (String) mutableState.getValue();
                if (str3 == null || StringsKt.isBlank(str3)) {
                    bitmapY = null;
                } else {
                    String str4 = (String) mutableState.getValue();
                    str4.getClass();
                    bitmapY = ku.y(Input.Keys.NUMPAD_SUBTRACT, Input.Keys.NUMPAD_SUBTRACT, str4);
                }
                composer3.updateRememberedValue(bitmapY);
                objRememberedValue24 = bitmapY;
            }
            final Bitmap bitmap = (Bitmap) objRememberedValue24;
            Object objRememberedValue25 = composer3.rememberedValue();
            if (objRememberedValue25 == companion.getEmpty()) {
                focusRequester = focusRequester2;
                z = true;
                objRememberedValue25 = new ji(focusRequester, null, true ? 1 : 0);
                composer3.updateRememberedValue(objRememberedValue25);
            } else {
                focusRequester = r30;
                z = true;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue25, composer3, 6);
            DialogProperties dialogProperties = new DialogProperties(z, false, false);
            final MutableState mutableState50 = mutableState6;
            final MutableState mutableState51 = mutableState;
            final SnapshotStateList snapshotStateList4 = snapshotStateList3;
            final MutableState mutableState52 = mutableState7;
            final MutableState mutableState53 = mutableState5;
            final BackupRouteConfigServerManager backupRouteConfigServerManager3 = backupRouteConfigServerManager2;
            final FocusRequester focusRequester4 = focusRequester;
            final MutableState mutableState54 = mutableState4;
            final MutableState mutableState55 = mutableState3;
            final MutableState mutableState56 = mutableState2;
            Function2 function3 = new Function2() { // from class: fh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer8 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (composer8.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1744713891, iIntValue, -1, "com.dh.myembyapp.ui.components.BackupRouteManagerDialog.<anonymous> (BackupRouteManagerDialog.kt:404)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                        int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer8.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer8, modifierM275backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer8.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer8.startReusableNode();
                        if (composer8.getInserting()) {
                            composer8.createNode(constructor);
                        } else {
                            composer8.useNode();
                        }
                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer8);
                        mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(1180.0f)), Dp.m7813constructorimpl(720.0f));
                        CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer8, CardDefaults.$stable << 12, 14);
                        final Bitmap bitmap2 = bitmap;
                        final MutableState mutableState57 = mutableState48;
                        final MutableState mutableState58 = mutableState53;
                        final MutableState mutableState59 = mutableState40;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final BackupRouteConfigServerManager backupRouteConfigServerManager4 = backupRouteConfigServerManager3;
                        final ServerConfig serverConfig2 = serverConfig;
                        final MutableState mutableState60 = mutableState55;
                        final MutableState mutableState61 = mutableState45;
                        final MutableState mutableState62 = mutableState49;
                        final MutableState mutableState63 = mutableState56;
                        final MutableState mutableState64 = mutableState47;
                        final MutableState mutableState65 = mutableState51;
                        final MutableState mutableState66 = mutableState38;
                        final u61 u61Var2 = u61Var;
                        final SnapshotStateList snapshotStateList5 = snapshotStateList4;
                        final dh dhVar3 = dhVar2;
                        final FocusRequester focusRequester5 = focusRequester4;
                        final MutableState mutableState67 = mutableState50;
                        final MutableState mutableState68 = mutableState41;
                        final MutableState mutableState69 = mutableState52;
                        final MutableState mutableState70 = mutableState54;
                        final FocusRequester focusRequester6 = focusRequester3;
                        final MutableState mutableState71 = mutableState42;
                        final Function1 function4 = function1;
                        CardKt.Card(modifierM1050height3ABfNKs, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-1325744555, true, new Function3() { // from class: nh
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int iIntValue2 = ((Integer) obj6).intValue();
                                return pi.m(bitmap2, mutableState57, mutableState58, mutableState59, coroutineScope2, backupRouteConfigServerManager4, serverConfig2, mutableState60, mutableState61, mutableState62, mutableState63, mutableState64, mutableState65, mutableState66, u61Var2, snapshotStateList5, dhVar3, focusRequester5, mutableState67, mutableState68, mutableState69, mutableState70, focusRequester6, mutableState71, function4, (ColumnScope) obj4, (Composer) obj5, iIntValue2);
                            }
                        }, composer8, 54), composer8, 196614, 26);
                        composer8.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer8.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            MutableState mutableState57 = mutableState56;
            MutableState mutableState58 = mutableState47;
            Composer composer8 = composer3;
            boolean z2 = true;
            AndroidDialog_androidKt.Dialog(function0, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-1744713891, true, function3, composer8, 54), composer8, ((i2 >> 6) & 14) | 432, 0);
            dh dhVar3 = (dh) mutableState41.getValue();
            if (dhVar3 == null) {
                composer8.startReplaceGroup(1174320876);
                composer8.endReplaceGroup();
                mutableState10 = mutableState52;
                mutableState12 = mutableState41;
                snapshotStateList = snapshotStateList4;
                z2 = true;
                mutableState58 = mutableState58;
                mutableState49 = mutableState49;
                mutableState9 = mutableState50;
                composer4 = composer8;
            } else {
                composer8.startReplaceGroup(1174320877);
                String str5 = dhVar3.b;
                boolean z3 = dhVar3.f;
                boolean z4 = dhVar3.g;
                boolean zChanged22 = ((i2 & 57344) == 16384) | composer8.changed(dhVar3) | composer8.changed(snapshotStateList4) | composer8.changed(mutableState41);
                Object objRememberedValue26 = composer8.rememberedValue();
                if (zChanged22 || objRememberedValue26 == companion.getEmpty()) {
                    snapshotStateList = snapshotStateList4;
                    ghVar = new gh(0, function2, dhVar3, snapshotStateList, mutableState41);
                    mutableState8 = mutableState41;
                    composer8.updateRememberedValue(ghVar);
                } else {
                    snapshotStateList = snapshotStateList4;
                    mutableState8 = mutableState41;
                    ghVar = objRememberedValue26;
                }
                Function0 function4 = (Function0) ghVar;
                boolean zChanged23 = composer8.changed(dhVar3) | composer8.changed(mutableState50) | composer8.changed(mutableState52) | composer8.changed(mutableState54) | composer8.changed(mutableState40) | composer8.changed(mutableState8);
                Object objRememberedValue27 = composer8.rememberedValue();
                if (zChanged23 || objRememberedValue27 == companion.getEmpty()) {
                    MutableState mutableState59 = mutableState8;
                    objRememberedValue27 = new w1(dhVar3, mutableState50, mutableState52, mutableState54, mutableState40, mutableState59);
                    dhVar = dhVar3;
                    mutableState9 = mutableState50;
                    mutableState10 = mutableState52;
                    mutableState11 = mutableState59;
                    composer8.updateRememberedValue(objRememberedValue27);
                } else {
                    mutableState9 = mutableState50;
                    mutableState11 = mutableState8;
                    dhVar = dhVar3;
                    mutableState10 = mutableState52;
                }
                Function0 function5 = (Function0) objRememberedValue27;
                boolean zChanged24 = composer8.changed(mutableState11) | composer8.changed(r17) | composer8.changed(dhVar);
                Object objRememberedValue28 = composer8.rememberedValue();
                if (zChanged24) {
                    str = str5;
                } else {
                    str = str5;
                    if (objRememberedValue28 == companion.getEmpty()) {
                    }
                    Function0 function6 = (Function0) objRememberedValue28;
                    zChanged = composer8.changed(mutableState11);
                    objRememberedValue = composer8.rememberedValue();
                    if (zChanged || objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new r1(18, mutableState11);
                        composer8.updateRememberedValue(objRememberedValue);
                    }
                    mutableState57 = mutableState57;
                    mutableState12 = mutableState11;
                    i(str, z3, z4, function4, function5, function6, (Function0) objRememberedValue, composer8, 0);
                    Composer composer9 = composer8;
                    composer9.endReplaceGroup();
                    composer4 = composer9;
                }
                objRememberedValue28 = new hh(dhVar, mutableState11, r17, 0);
                composer8.updateRememberedValue(objRememberedValue28);
                Function0 function7 = (Function0) objRememberedValue28;
                zChanged = composer8.changed(mutableState11);
                objRememberedValue = composer8.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new r1(18, mutableState11);
                    composer8.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new r1(18, mutableState11);
                    composer8.updateRememberedValue(objRememberedValue);
                }
                mutableState57 = mutableState57;
                mutableState12 = mutableState11;
                i(str, z3, z4, function4, function5, function7, (Function0) objRememberedValue, composer8, 0);
                Composer composer10 = composer8;
                composer10.endReplaceGroup();
                composer4 = composer10;
            }
            BackupRouteConfig backupRouteConfig = (BackupRouteConfig) r17.getValue();
            if (backupRouteConfig == null) {
                composer4.startReplaceGroup(1174953803);
                composer4.endReplaceGroup();
                mutableState15 = mutableState12;
                snapshotStateList2 = snapshotStateList;
                mutableState13 = mutableState42;
                i3 = i5 == true ? 1 : 0;
                mutableState14 = mutableState54;
            } else {
                composer4.startReplaceGroup(1174953804);
                int i6 = i5;
                mutableState13 = r17;
                boolean zChanged25 = composer4.changed(snapshotStateList) | composer4.changed(mutableState9) | composer4.changed(mutableState10) | composer4.changed(mutableState54) | composer4.changed(mutableState12) | composer4.changed(mutableState40) | composer4.changed(mutableState53) | (i6 == 2048 ? z2 : false) | composer4.changed(backupRouteConfig) | composer4.changed(mutableState13);
                Object objRememberedValue29 = composer4.rememberedValue();
                if (zChanged25 || objRememberedValue29 == companion.getEmpty()) {
                    MutableState mutableState60 = mutableState12;
                    snapshotStateList2 = snapshotStateList;
                    mutableState14 = mutableState54;
                    ihVar = new ih(backupRouteConfig, snapshotStateList2, mutableState9, mutableState10, mutableState14, mutableState60, mutableState40, mutableState53, function1, mutableState13);
                    mutableState15 = mutableState60;
                    composer4.updateRememberedValue(ihVar);
                } else {
                    ihVar = objRememberedValue29;
                    snapshotStateList2 = snapshotStateList;
                    mutableState15 = mutableState12;
                    mutableState14 = mutableState54;
                }
                Function0 function8 = (Function0) ihVar;
                boolean zChanged26 = composer4.changed(mutableState13);
                Object objRememberedValue30 = composer4.rememberedValue();
                if (zChanged26 || objRememberedValue30 == companion.getEmpty()) {
                    objRememberedValue30 = new r1(19, mutableState13);
                    composer4.updateRememberedValue(objRememberedValue30);
                }
                e(backupRouteConfig, function8, (Function0) objRememberedValue30, composer4, 0);
                Unit unit2 = Unit.INSTANCE;
                composer4.endReplaceGroup();
                i3 = i6;
            }
            ch chVar2 = (ch) mutableState57.getValue();
            if (chVar2 == null) {
                composer4.startReplaceGroup(1175249636);
                composer4.endReplaceGroup();
                mutableState18 = mutableState15;
                mutableState19 = mutableState13;
                mutableState20 = mutableState57;
                mutableState22 = mutableState49;
                mutableState23 = mutableState55;
                mutableState17 = mutableState45;
                composer5 = composer4;
            } else {
                composer4.startReplaceGroup(1175249637);
                MutableState mutableState61 = mutableState57;
                MutableState mutableState62 = mutableState49;
                boolean zChanged27 = composer4.changed(mutableState61) | composer4.changed(r30) | composer4.changed(r31) | composer4.changed(mutableState62) | composer4.changedInstance(chVar2);
                Object objRememberedValue31 = composer4.rememberedValue();
                if (zChanged27 || objRememberedValue31 == companion.getEmpty()) {
                    objRememberedValue31 = new v1(chVar2, mutableState61, r30, r31, mutableState62, 2);
                    chVar = chVar2;
                    mutableState16 = r30;
                    composer4.updateRememberedValue(objRememberedValue31);
                } else {
                    mutableState16 = r30;
                    chVar = chVar2;
                }
                Function0 function9 = (Function0) objRememberedValue31;
                boolean zChanged28 = composer4.changed(mutableState9) | composer4.changed(snapshotStateList2) | composer4.changed(mutableState10) | composer4.changed(mutableState14) | composer4.changed(mutableState40) | composer4.changed(mutableState15) | composer4.changed(mutableState13) | composer4.changed(mutableState61) | composer4.changed(mutableState16) | composer4.changed(r31) | composer4.changed(mutableState62) | composer4.changed(mutableState53) | (i3 == 2048 ? z2 : false) | composer4.changedInstance(chVar);
                Object objRememberedValue32 = composer4.rememberedValue();
                mutableState17 = r31;
                if (zChanged28 || objRememberedValue32 == companion.getEmpty()) {
                    MutableState mutableState63 = mutableState15;
                    MutableState mutableState64 = mutableState13;
                    MutableState mutableState65 = mutableState16;
                    u1Var = new u1(chVar, snapshotStateList2, mutableState9, mutableState10, mutableState14, mutableState40, mutableState63, mutableState64, mutableState61, mutableState65, mutableState17, mutableState62, mutableState53, function1);
                    mutableState18 = mutableState63;
                    mutableState19 = mutableState64;
                    mutableState20 = mutableState61;
                    mutableState21 = mutableState65;
                    mutableState22 = mutableState62;
                    composer4.updateRememberedValue(u1Var);
                } else {
                    mutableState22 = mutableState62;
                    mutableState20 = mutableState61;
                    mutableState21 = mutableState16;
                    u1Var = objRememberedValue32;
                    mutableState18 = mutableState15;
                    mutableState19 = mutableState13;
                }
                Function0 function10 = (Function0) u1Var;
                boolean zChanged29 = composer4.changed(mutableState20);
                Object objRememberedValue33 = composer4.rememberedValue();
                if (zChanged29 || objRememberedValue33 == companion.getEmpty()) {
                    objRememberedValue33 = new r1(21, mutableState20);
                    composer4.updateRememberedValue(objRememberedValue33);
                }
                Composer composer11 = composer4;
                mutableState23 = mutableState21;
                f(chVar, function9, function10, (Function0) objRememberedValue33, composer11, 0);
                Composer composer12 = composer11;
                Unit unit3 = Unit.INSTANCE;
                composer12.endReplaceGroup();
                composer5 = composer12;
            }
            ch chVar3 = (ch) mutableState23.getValue();
            if (chVar3 == null) {
                composer5.startReplaceGroup(1175596464);
                composer5.endReplaceGroup();
                mutableState29 = mutableState23;
                mutableState30 = mutableState17;
                mutableState32 = mutableState22;
                i4 = i3;
                mutableState31 = mutableState20;
                mutableState27 = mutableState18;
                composer6 = composer5;
            } else {
                composer5.startReplaceGroup(1175596465);
                Set set = (Set) mutableState17.getValue();
                String str6 = (String) mutableState22.getValue();
                MutableState mutableState66 = mutableState17;
                MutableState mutableState67 = mutableState22;
                boolean zChanged30 = composer5.changed(mutableState66) | composer5.changed(mutableState67);
                Object objRememberedValue34 = composer5.rememberedValue();
                if (zChanged30 || objRememberedValue34 == companion.getEmpty()) {
                    objRememberedValue34 = new ai(0, mutableState66, mutableState67);
                    composer5.updateRememberedValue(objRememberedValue34);
                }
                Function1 function11 = (Function1) objRememberedValue34;
                boolean zChanged31 = composer5.changed(mutableState23) | composer5.changed(mutableState66) | composer5.changed(mutableState67) | composer5.changed(mutableState9) | composer5.changed(snapshotStateList2) | composer5.changed(mutableState10) | composer5.changed(mutableState14) | composer5.changed(mutableState40) | composer5.changed(mutableState18) | composer5.changed(mutableState19) | composer5.changed(mutableState20) | composer5.changed(mutableState53);
                MutableState mutableState68 = mutableState19;
                MutableState mutableState69 = mutableState20;
                int i7 = i3;
                boolean z5 = zChanged31 | (i7 == 2048 ? z2 : false);
                Object objRememberedValue35 = composer5.rememberedValue();
                if (z5 || objRememberedValue35 == companion.getEmpty()) {
                    MutableState mutableState70 = mutableState23;
                    MutableState mutableState71 = mutableState18;
                    SnapshotStateList snapshotStateList5 = snapshotStateList2;
                    MutableState mutableState72 = mutableState14;
                    MutableState mutableState73 = mutableState10;
                    MutableState mutableState74 = mutableState9;
                    fiVar = new fi(mutableState70, mutableState66, mutableState67, mutableState74, mutableState73, mutableState72, mutableState40, mutableState71, mutableState68, mutableState69, mutableState53, snapshotStateList5, function1);
                    mutableState24 = mutableState70;
                    mutableState25 = mutableState66;
                    mutableState26 = mutableState67;
                    mutableState9 = mutableState74;
                    mutableState10 = mutableState73;
                    mutableState14 = mutableState72;
                    mutableState27 = mutableState71;
                    mutableState28 = mutableState68;
                    snapshotStateList2 = snapshotStateList5;
                    composer5.updateRememberedValue(fiVar);
                } else {
                    MutableState mutableState75 = mutableState23;
                    fiVar = objRememberedValue35;
                    mutableState27 = mutableState18;
                    mutableState26 = mutableState67;
                    mutableState24 = mutableState75;
                    mutableState25 = mutableState66;
                    mutableState28 = mutableState68;
                }
                Function0 function12 = (Function0) fiVar;
                boolean zChanged32 = composer5.changed(mutableState24) | composer5.changed(mutableState25) | composer5.changed(mutableState26);
                Object objRememberedValue36 = composer5.rememberedValue();
                if (zChanged32) {
                    str2 = str6;
                } else {
                    str2 = str6;
                    if (objRememberedValue36 == companion.getEmpty()) {
                    }
                    i4 = i7 == true ? 1 : 0;
                    mutableState29 = mutableState24;
                    mutableState30 = mutableState25;
                    mutableState19 = mutableState28;
                    mutableState31 = mutableState69;
                    mutableState32 = mutableState26;
                    Composer composer13 = composer5;
                    o(chVar3, set, str2, function11, function12, (Function0) objRememberedValue36, composer13, 0);
                    Composer composer14 = composer13;
                    composer14.endReplaceGroup();
                    composer6 = composer14;
                }
                objRememberedValue36 = new ii(mutableState24, mutableState25, mutableState26, 0);
                composer5.updateRememberedValue(objRememberedValue36);
                i4 = i7 == true ? 1 : 0;
                mutableState29 = mutableState24;
                mutableState30 = mutableState25;
                mutableState19 = mutableState28;
                mutableState31 = mutableState69;
                mutableState32 = mutableState26;
                Composer composer15 = composer5;
                o(chVar3, set, str2, function11, function12, (Function0) objRememberedValue36, composer15, 0);
                Composer composer16 = composer15;
                composer16.endReplaceGroup();
                composer6 = composer16;
            }
            if (((Boolean) mutableState58.getValue()).booleanValue()) {
                composer6.startReplaceGroup(1176172693);
                int size = snapshotStateList2.size();
                MutableState mutableState76 = mutableState29;
                MutableState mutableState77 = mutableState30;
                MutableState mutableState78 = mutableState32;
                MutableState mutableState79 = mutableState58;
                boolean zChanged33 = composer6.changed(mutableState9) | composer6.changed(snapshotStateList2) | composer6.changed(mutableState10) | composer6.changed(mutableState14) | composer6.changed(mutableState40) | composer6.changed(mutableState27) | composer6.changed(mutableState19) | composer6.changed(mutableState31) | composer6.changed(mutableState76) | composer6.changed(mutableState77) | composer6.changed(mutableState78) | composer6.changed(mutableState53) | composer6.changed(mutableState79);
                MutableState mutableState80 = mutableState19;
                MutableState mutableState81 = mutableState27;
                if (i4 != 2048) {
                    z2 = false;
                }
                boolean z6 = zChanged33 | z2;
                Object objRememberedValue37 = composer6.rememberedValue();
                if (z6 || objRememberedValue37 == companion.getEmpty()) {
                    u1 u1Var2 = new u1(snapshotStateList2, mutableState9, mutableState10, mutableState14, mutableState40, mutableState81, mutableState80, mutableState31, mutableState76, mutableState77, mutableState78, mutableState53, mutableState79, function1, 2);
                    mutableState33 = mutableState79;
                    composer6.updateRememberedValue(u1Var2);
                    objRememberedValue37 = u1Var2;
                } else {
                    mutableState33 = mutableState79;
                }
                Function0 function13 = (Function0) objRememberedValue37;
                boolean zChanged34 = composer6.changed(mutableState33);
                Object objRememberedValue38 = composer6.rememberedValue();
                if (zChanged34 || objRememberedValue38 == companion.getEmpty()) {
                    objRememberedValue38 = new r1(22, mutableState33);
                    composer6.updateRememberedValue(objRememberedValue38);
                }
                c(size, function13, (Function0) objRememberedValue38, composer6, 0);
                composer6.endReplaceGroup();
            } else {
                composer6.startReplaceGroup(1176363932);
                composer6.endReplaceGroup();
            }
            composer2 = composer6;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer6;
            }
        } else {
            Composer composer17 = composerStartRestartGroup;
            composer17.skipToGroupEnd();
            composer2 = composer17;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh(serverConfig, backupRouteConfigServerManager, function0, function1, function2, i, 0));
        }
    }

    public static final void l(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, Function1 function1, List list) {
        n(snapshotStateList, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, list);
        mutableState11.setValue("已导入 " + list.size() + " 条服务器备选线路");
        mutableState4.setValue(null);
        function1.invoke(snapshotStateList.toList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v75 */
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
    public static final Unit m(Bitmap bitmap, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, CoroutineScope coroutineScope, BackupRouteConfigServerManager backupRouteConfigServerManager, ServerConfig serverConfig, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, u61 u61Var, SnapshotStateList snapshotStateList, dh dhVar, FocusRequester focusRequester, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, final MutableState mutableState14, FocusRequester focusRequester2, MutableState mutableState15, Function1 function1, ColumnScope columnScope, Composer composer, int i) {
        long jU;
        Composer composer2;
        Object r11;
        Object obj;
        float f;
        float f2;
        final int i2;
        long jU2;
        final int i3;
        String str = dhVar.a;
        columnScope.getClass();
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1325744555, i, -1, "com.dh.myembyapp.ui.components.BackupRouteManagerDialog.<anonymous>.<anonymous>.<anonymous> (BackupRouteManagerDialog.kt:416)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(18.0f));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getTop(), composer, 6);
            int iB = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer);
            mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(iB), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(210.0f)), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composer, 54);
            int iB2 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxHeight$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer);
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(iB2), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            TextKt.m3048TextNvy7gAk("手机扫码导入", null, materialTheme.getColorScheme(composer, i4).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getTitleMedium(), composer, 6, 0, 131066);
            if (bitmap != null) {
                composer.startReplaceGroup(-1777244943);
                ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "备用线路管理二维码", SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(156.0f)), null, null, 0.0f, null, 0, composer, 432, 248);
                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(12.0f)), composer, 6);
                String str2 = (String) mutableState9.getValue();
                TextKt.m3048TextNvy7gAk(str2 == null ? "" : str2, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i4).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodySmall(), composer, 0, 0, 131066);
                id.i(10.0f, companion, composer, 6);
                TextKt.m3048TextNvy7gAk("手机页面可批量新增、编辑 50 条以内的备用线路。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i4).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodySmall(), composer, 6, 0, 131066);
                composer.endReplaceGroup();
                composer2 = composer;
            } else {
                composer.startReplaceGroup(-1776212953);
                String str3 = ((Boolean) mutableState10.getValue()).booleanValue() ? "配置服务启动失败" : "正在启动配置服务...";
                TextStyle bodySmall = materialTheme.getTypography(composer, i4).getBodySmall();
                if (((Boolean) mutableState10.getValue()).booleanValue()) {
                    composer.startReplaceGroup(-1027120652);
                    jU = materialTheme.getColorScheme(composer, i4).getError();
                    composer.endReplaceGroup();
                } else {
                    jU = kb0.u(composer, -1027119464, materialTheme, composer, i4);
                }
                TextKt.m3048TextNvy7gAk(str3, null, jU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer, 0, 0, 131066);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), composer2, 6);
            boolean zChanged = composer2.changed(mutableState) | composer2.changed(mutableState2) | composer2.changed(mutableState3) | composer2.changedInstance(coroutineScope) | composer2.changedInstance(backupRouteConfigServerManager) | composer2.changedInstance(serverConfig) | composer2.changed(mutableState4) | composer2.changed(mutableState5) | composer2.changed(mutableState6) | composer2.changed(mutableState7);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                r11 = 1;
                obj = null;
                f = 0.0f;
                f2 = 10.0f;
                objRememberedValue = new ih(coroutineScope, mutableState, mutableState2, mutableState3, backupRouteConfigServerManager, serverConfig, mutableState4, mutableState5, mutableState6, mutableState7);
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                r11 = 1;
                obj = null;
                f = 0.0f;
                f2 = 10.0f;
            }
            Composer composer3 = composer2;
            a((Function0) objRememberedValue, SizeKt.fillMaxWidth$default(r17, f, r11, obj), ((Boolean) mutableState.getValue()).booleanValue() ? bh.b : bh.a, ComposableLambdaKt.rememberComposableLambda(-721610512, r11, new b2(9, mutableState), composer2, 54), composer3, 3120);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(r17, Dp.m7813constructorimpl(f2)), composer3, 6);
            boolean zChanged2 = composer3.changed(mutableState8);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new r1(20, mutableState8);
                composer3.updateRememberedValue(objRememberedValue2);
            }
            a((Function0) objRememberedValue2, SizeKt.fillMaxWidth$default(r17, f, r11, obj), bh.d, vs.a(), composer3, 3504);
            composer3.endNode();
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(zs1.E(rowScopeInstance, r17, 1.0f, false, 2, null), f, r11, obj);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(f2)), companion2.getStart(), composer3, 6);
            int iB3 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxHeight$default2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (!id.n(composer3.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer3);
            mr.z(companion3, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(iB3), composerM4318constructorimpl3));
            TextKt.m3048TextNvy7gAk("备用线路管理", null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getTitleLarge(), composer3, 1572870, 0, 131006);
            TextKt.m3048TextNvy7gAk(mr.r("主服务器：", serverConfig.getAlias(), "。可维护备用入口信息，也可以在左侧列表中直接启用某条线路。"), null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i4).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodySmall(), composer3, 0, 0, 131066);
            String str4 = (String) mutableState2.getValue();
            if (str4 == null || StringsKt.isBlank(str4)) {
                composer3.startReplaceGroup(-1209921028);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(-1210172655);
                String str5 = (String) mutableState2.getValue();
                TextKt.m3048TextNvy7gAk(str5 == null ? "" : str5, null, u61Var.P, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodySmall(), composer3, 0, 0, 131066);
                composer3.endReplaceGroup();
            }
            String str6 = (String) mutableState3.getValue();
            if (str6 == null || StringsKt.isBlank(str6)) {
                composer3.startReplaceGroup(-1209554980);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(-1209820061);
                String str7 = (String) mutableState3.getValue();
                TextKt.m3048TextNvy7gAk(str7 == null ? "" : str7, null, materialTheme.getColorScheme(composer3, i4).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodySmall(), composer3, 0, 0, 131066);
                composer3.endReplaceGroup();
            }
            Modifier modifierF = wn.F(columnScopeInstance, SizeKt.fillMaxWidth$default(r17, f, r11, obj), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f)), companion2.getTop(), composer3, 6);
            int iB4 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierF);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (!id.n(composer3.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor4);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer3);
            mr.z(companion3, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl4, Integer.valueOf(iB4), composerM4318constructorimpl4));
            Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(kb0.v(14.0f, SizeKt.fillMaxHeight$default(SizeKt.m1069width3ABfNKs(r17, Dp.m7813constructorimpl(310.0f)), f, r11, obj), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i4).getSurfaceVariant(), 0.52f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m7813constructorimpl(12.0f));
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(f2)), companion2.getStart(), composer3, 6);
            int iB5 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs2);
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            if (!id.n(composer3.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor5);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer3);
            mr.z(companion3, composerM4318constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
            Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl5, Integer.valueOf(iB5), composerM4318constructorimpl5));
            TextKt.m3048TextNvy7gAk(x2.f(snapshotStateList.size(), "已配置 ", "/50 条"), null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i4).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodyMedium(), composer3, 0, 0, 131066);
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(wn.F(columnScopeInstance, r17, 1.0f, false, 2, null), f, r11, obj), ScrollKt.rememberScrollState(0, composer3, 0, r11), false, null, false, 14, null), f, Dp.m7813constructorimpl(4.0f), r11, obj);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(f2)), companion2.getStart(), composer3, 6);
            int iB6 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierM1001paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
            if (!id.n(composer3.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor6);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer3);
            mr.z(companion3, composerM4318constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl6, currentCompositionLocalMap6);
            Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl6, Integer.valueOf(iB6), composerM4318constructorimpl6));
            composer3.startMovableGroup(80226151, str);
            String str8 = dhVar.b;
            String str9 = dhVar.c;
            boolean z = dhVar.d;
            boolean zAreEqual = Intrinsics.areEqual((String) mutableState11.getValue(), str);
            boolean z2 = dhVar.g;
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester);
            boolean zChanged3 = composer3.changed(mutableState11) | composer3.changed(dhVar) | composer3.changed(mutableState12);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new hh(dhVar, mutableState11, mutableState12, 2);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            j(str8, str9, z, zAreEqual, true, z2, modifierFocusRequester, (Function0) objRememberedValue3, composer3, 24576, 0);
            composer3.endMovableGroup();
            composer3.startReplaceGroup(80260465);
            Iterator<T> it = snapshotStateList.iterator();
            while (it.hasNext()) {
                BackupRouteConfig backupRouteConfig = (BackupRouteConfig) it.next();
                String id = backupRouteConfig.getId();
                String alias = backupRouteConfig.getAlias();
                if (StringsKt.isBlank(alias)) {
                    alias = "未命名线路";
                }
                String displayAddress = backupRouteConfig.getDisplayAddress();
                boolean directOnly = backupRouteConfig.getDirectOnly();
                boolean zAreEqual2 = Intrinsics.areEqual(backupRouteConfig.getId(), serverConfig.getActiveBackupRouteId());
                String str10 = alias;
                dh dhVar2 = new dh(id, str10, displayAddress, directOnly, backupRouteConfig, false, zAreEqual2);
                composer3.startMovableGroup(-136207964, id);
                boolean zAreEqual3 = Intrinsics.areEqual(id, (String) mutableState11.getValue());
                boolean zChanged4 = composer3.changed(mutableState11) | composer3.changed(dhVar2) | composer3.changed(mutableState12);
                Object objRememberedValue4 = composer3.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new hh(dhVar2, mutableState11, mutableState12, r11);
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                j(str10, displayAddress, directOnly, zAreEqual3, false, zAreEqual2, null, (Function0) objRememberedValue4, composer3, 24576, 64);
                composer3.endMovableGroup();
            }
            composer3.endReplaceGroup();
            boolean zChanged5 = composer3.changed(snapshotStateList) | composer3.changed(mutableState3) | composer3.changed(mutableState13) | composer3.changed(mutableState14) | composer3.changedInstance(serverConfig);
            Object objRememberedValue5 = composer3.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new v1(snapshotStateList, mutableState3, mutableState13, serverConfig, mutableState14);
                composer3.updateRememberedValue(objRememberedValue5);
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(companion4, 0.0f, r11, null), focusRequester2);
            bh bhVar = bh.a;
            a((Function0) objRememberedValue5, modifierFocusRequester2, bhVar, vs.b, composer3, 3456);
            composer3.endNode();
            composer3.endNode();
            Modifier modifierFillMaxHeight$default3 = SizeKt.fillMaxHeight$default(zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), 0.0f, r11, null);
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            Modifier modifierM999padding3ABfNKs3 = PaddingKt.m999padding3ABfNKs(kb0.v(14.0f, modifierFillMaxHeight$default3, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer3, i5).getSurfaceVariant(), 0.52f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m7813constructorimpl(12.0f));
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement2.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composer3, 0);
            int iB7 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs3);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
            if (!id.n(composer3.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor7);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer3);
            mr.z(companion6, composerM4318constructorimpl7, measurePolicyColumnMeasurePolicy5, composerM4318constructorimpl7, currentCompositionLocalMap7);
            Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl7, Integer.valueOf(iB7), composerM4318constructorimpl7));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            if (((BackupRouteConfig) mutableState14.getValue()) == null) {
                composer3.startReplaceGroup(1908262579);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                int iB8 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default);
                Function0<ComposeUiNode> constructor8 = companion6.getConstructor();
                if (!id.n(composer3.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor8);
                } else {
                    composer3.useNode();
                }
                Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer3);
                mr.z(companion6, composerM4318constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl8, currentCompositionLocalMap8);
                Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl8, Integer.valueOf(iB8), composerM4318constructorimpl8));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextKt.m3048TextNvy7gAk("从左侧选择线路进行操作，或在下方新增线路", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer3, i5).getOnSurface(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i5).getBodyLarge(), composer3, 6, 0, 131066);
                composer3.endNode();
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(1909211427);
                final BackupRouteConfig backupRouteConfig2 = (BackupRouteConfig) mutableState14.getValue();
                backupRouteConfig2.getClass();
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(wn.F(columnScopeInstance2, companion4, 1.0f, false, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion5.getStart(), composer3, 6);
                int iB9 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer3, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor9 = companion6.getConstructor();
                if (!id.n(composer3.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor9);
                } else {
                    composer3.useNode();
                }
                Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer3);
                mr.z(companion6, composerM4318constructorimpl9, measurePolicyColumnMeasurePolicy6, composerM4318constructorimpl9, currentCompositionLocalMap9);
                Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl9, Integer.valueOf(iB9), composerM4318constructorimpl9));
                TextKt.m3048TextNvy7gAk(((String) mutableState13.getValue()) == null ? "新增备用线路" : "编辑备用线路", null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i5).getTitleSmall(), composer3, 1572864, 0, 131006);
                String alias2 = backupRouteConfig2.getAlias();
                boolean zChanged6 = composer3.changed(mutableState14) | composer3.changed(backupRouteConfig2);
                Object objRememberedValue6 = composer3.rememberedValue();
                if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    final int i6 = 0;
                    objRememberedValue6 = new Function1() { // from class: rh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i7 = i6;
                            MutableState mutableState16 = mutableState14;
                            switch (i7) {
                                case 0:
                                    String str11 = (String) obj2;
                                    str11.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, str11, null, null, 0, null, false, GapComposerKt.nodeKey, null));
                                    break;
                                case 1:
                                    String str12 = (String) obj2;
                                    str12.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, null, str12, 0, null, false, 119, null));
                                    break;
                                case 2:
                                    String str13 = (String) obj2;
                                    str13.getClass();
                                    Integer intOrNull = StringsKt.toIntOrNull(str13);
                                    BackupRouteConfig backupRouteConfig3 = backupRouteConfig2;
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig3, null, null, null, null, intOrNull != null ? intOrNull.intValue() : backupRouteConfig3.getPort(), null, false, Input.Keys.ESCAPE, null));
                                    break;
                                default:
                                    String str14 = (String) obj2;
                                    str14.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, null, null, 0, str14, false, 95, null));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                h(alias2, (Function1) objRememberedValue6, "服务器别名", SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), composer3, 3456);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(f2)), companion5.getTop(), composer3, 6);
                int iB10 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer3, companion4);
                Function0<ComposeUiNode> constructor10 = companion6.getConstructor();
                if (!id.n(composer3.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor10);
                } else {
                    composer3.useNode();
                }
                Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composer3);
                mr.z(companion6, composerM4318constructorimpl10, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl10, currentCompositionLocalMap10);
                Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl10, Integer.valueOf(iB10), composerM4318constructorimpl10));
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                boolean zAreEqual4 = Intrinsics.areEqual(backupRouteConfig2.getProtocol(), "http");
                boolean zChanged7 = composer3.changed(mutableState14) | composer3.changed(backupRouteConfig2);
                Object objRememberedValue7 = composer3.rememberedValue();
                if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    final int i7 = 0;
                    objRememberedValue7 = new Function0() { // from class: sh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i8 = i7;
                            MutableState mutableState16 = mutableState14;
                            switch (i8) {
                                case 0:
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, "http", null, 0, null, false, Input.Keys.END, null));
                                    break;
                                case 1:
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, "https", null, 0, null, false, Input.Keys.END, null));
                                    break;
                                default:
                                    BackupRouteConfig backupRouteConfig3 = backupRouteConfig2;
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig3, null, null, null, null, 0, null, !backupRouteConfig3.getDirectOnly(), 63, null));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue7);
                }
                p("http", zAreEqual4, (Function0) objRememberedValue7, composer3, 6);
                boolean zAreEqual5 = Intrinsics.areEqual(backupRouteConfig2.getProtocol(), "https");
                boolean zChanged8 = composer3.changed(mutableState14) | composer3.changed(backupRouteConfig2);
                Object objRememberedValue8 = composer3.rememberedValue();
                if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    final int i8 = 1;
                    objRememberedValue8 = new Function0() { // from class: sh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i9 = i8;
                            MutableState mutableState16 = mutableState14;
                            switch (i9) {
                                case 0:
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, "http", null, 0, null, false, Input.Keys.END, null));
                                    break;
                                case 1:
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, "https", null, 0, null, false, Input.Keys.END, null));
                                    break;
                                default:
                                    BackupRouteConfig backupRouteConfig3 = backupRouteConfig2;
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig3, null, null, null, null, 0, null, !backupRouteConfig3.getDirectOnly(), 63, null));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue8);
                }
                p("https", zAreEqual5, (Function0) objRememberedValue8, composer3, 6);
                composer3.endNode();
                String host = backupRouteConfig2.getHost();
                boolean zChanged9 = composer3.changed(mutableState14) | composer3.changed(backupRouteConfig2);
                Object objRememberedValue9 = composer3.rememberedValue();
                if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    i2 = 1;
                    objRememberedValue9 = new Function1() { // from class: rh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i9 = i2;
                            MutableState mutableState16 = mutableState14;
                            switch (i9) {
                                case 0:
                                    String str11 = (String) obj2;
                                    str11.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, str11, null, null, 0, null, false, GapComposerKt.nodeKey, null));
                                    break;
                                case 1:
                                    String str12 = (String) obj2;
                                    str12.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, null, str12, 0, null, false, 119, null));
                                    break;
                                case 2:
                                    String str13 = (String) obj2;
                                    str13.getClass();
                                    Integer intOrNull = StringsKt.toIntOrNull(str13);
                                    BackupRouteConfig backupRouteConfig3 = backupRouteConfig2;
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig3, null, null, null, null, intOrNull != null ? intOrNull.intValue() : backupRouteConfig3.getPort(), null, false, Input.Keys.ESCAPE, null));
                                    break;
                                default:
                                    String str14 = (String) obj2;
                                    str14.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, null, null, 0, str14, false, 95, null));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue9);
                } else {
                    i2 = 1;
                }
                h(host, (Function1) objRememberedValue9, "服务器地址", SizeKt.fillMaxWidth$default(companion4, 0.0f, i2, null), composer3, 3456);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, i2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion5.getTop(), composer3, 6);
                int iB11 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor11 = companion6.getConstructor();
                if (!id.n(composer3.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor11);
                } else {
                    composer3.useNode();
                }
                Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composer3);
                mr.z(companion6, composerM4318constructorimpl11, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl11, currentCompositionLocalMap11);
                Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl11, Integer.valueOf(iB11), composerM4318constructorimpl11));
                String strValueOf = String.valueOf(backupRouteConfig2.getPort());
                boolean zChanged10 = composer3.changed(mutableState14) | composer3.changed(backupRouteConfig2);
                Object objRememberedValue10 = composer3.rememberedValue();
                if (zChanged10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    final int i9 = 2;
                    objRememberedValue10 = new Function1() { // from class: rh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i10 = i9;
                            MutableState mutableState16 = mutableState14;
                            switch (i10) {
                                case 0:
                                    String str11 = (String) obj2;
                                    str11.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, str11, null, null, 0, null, false, GapComposerKt.nodeKey, null));
                                    break;
                                case 1:
                                    String str12 = (String) obj2;
                                    str12.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, null, str12, 0, null, false, 119, null));
                                    break;
                                case 2:
                                    String str13 = (String) obj2;
                                    str13.getClass();
                                    Integer intOrNull = StringsKt.toIntOrNull(str13);
                                    BackupRouteConfig backupRouteConfig3 = backupRouteConfig2;
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig3, null, null, null, null, intOrNull != null ? intOrNull.intValue() : backupRouteConfig3.getPort(), null, false, Input.Keys.ESCAPE, null));
                                    break;
                                default:
                                    String str14 = (String) obj2;
                                    str14.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, null, null, 0, str14, false, 95, null));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue10);
                }
                h(strValueOf, (Function1) objRememberedValue10, "端口", zs1.E(rowScopeInstance2, companion4, 0.8f, false, 2, null), composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                String path = backupRouteConfig2.getPath();
                String str11 = path != null ? path : "";
                boolean zChanged11 = composer3.changed(mutableState14) | composer3.changed(backupRouteConfig2);
                Object objRememberedValue11 = composer3.rememberedValue();
                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    final int i10 = 3;
                    objRememberedValue11 = new Function1() { // from class: rh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i11 = i10;
                            MutableState mutableState16 = mutableState14;
                            switch (i11) {
                                case 0:
                                    String str12 = (String) obj2;
                                    str12.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, str12, null, null, 0, null, false, GapComposerKt.nodeKey, null));
                                    break;
                                case 1:
                                    String str13 = (String) obj2;
                                    str13.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, null, str13, 0, null, false, 119, null));
                                    break;
                                case 2:
                                    String str14 = (String) obj2;
                                    str14.getClass();
                                    Integer intOrNull = StringsKt.toIntOrNull(str14);
                                    BackupRouteConfig backupRouteConfig3 = backupRouteConfig2;
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig3, null, null, null, null, intOrNull != null ? intOrNull.intValue() : backupRouteConfig3.getPort(), null, false, Input.Keys.ESCAPE, null));
                                    break;
                                default:
                                    String str15 = (String) obj2;
                                    str15.getClass();
                                    mutableState16.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, null, null, 0, str15, false, 95, null));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue11);
                }
                h(str11, (Function1) objRememberedValue11, "路径（可选）", zs1.E(rowScopeInstance2, companion4, 1.2f, false, 2, null), composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                composer3.endNode();
                Object objRememberedValue12 = composer3.rememberedValue();
                Composer.Companion companion7 = Composer.INSTANCE;
                if (objRememberedValue12 == companion7.getEmpty()) {
                    objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer3.updateRememberedValue(objRememberedValue12);
                }
                MutableState mutableState16 = (MutableState) objRememberedValue12;
                Object objRememberedValue13 = composer3.rememberedValue();
                if (objRememberedValue13 == companion7.getEmpty()) {
                    objRememberedValue13 = new t1(28, mutableState16);
                    composer3.updateRememberedValue(objRememberedValue13);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion4, (Function1) objRememberedValue13);
                ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(f2));
                int i11 = ClickableSurfaceDefaults.$stable;
                int i12 = i11 << 15;
                ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composer3, i12, 30);
                long j = u61Var.C;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                }
                ProvidableCompositionLocal providableCompositionLocal = n72.g;
                boolean zBooleanValue = ((Boolean) composer3.consume(providableCompositionLocal)).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                long jM5189getWhite0d7_KjU = !zBooleanValue ? Color.INSTANCE.m5189getWhite0d7_KjU() : u61Var.D;
                long onSurface = materialTheme2.getColorScheme(composer3, i5).getOnSurface();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                }
                boolean zBooleanValue2 = ((Boolean) composer3.consume(providableCompositionLocal)).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                if (zBooleanValue2 || !((Boolean) mutableState16.getValue()).booleanValue()) {
                    jU2 = kb0.u(composer3, -1546354618, materialTheme2, composer3, i5);
                } else {
                    composer3.startReplaceGroup(-1546481160);
                    composer3.endReplaceGroup();
                    jU2 = ColorKt.Color(4279308561L);
                }
                ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, jM5189getWhite0d7_KjU, jU2, 0L, 0L, 0L, 0L, composer3, i11 << 24, PsExtractor.VIDEO_STREAM_MASK);
                ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composer, i12, 29);
                ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null);
                boolean zChanged12 = composer.changed(mutableState14) | composer.changed(backupRouteConfig2);
                Object objRememberedValue14 = composer.rememberedValue();
                if (zChanged12 || objRememberedValue14 == companion7.getEmpty()) {
                    i3 = 2;
                    objRememberedValue14 = new Function0() { // from class: sh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i13 = i3;
                            MutableState mutableState17 = mutableState14;
                            switch (i13) {
                                case 0:
                                    mutableState17.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, "http", null, 0, null, false, Input.Keys.END, null));
                                    break;
                                case 1:
                                    mutableState17.setValue(BackupRouteConfig.copy$default(backupRouteConfig2, null, null, "https", null, 0, null, false, Input.Keys.END, null));
                                    break;
                                default:
                                    BackupRouteConfig backupRouteConfig3 = backupRouteConfig2;
                                    mutableState17.setValue(BackupRouteConfig.copy$default(backupRouteConfig3, null, null, null, null, 0, null, !backupRouteConfig3.getDirectOnly(), 63, null));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue14);
                } else {
                    i3 = 2;
                }
                SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue14, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(-613165230, true, new p8(i3, backupRouteConfig2, mutableState16), composer, 54), composer, 0, 48, 1564);
                TextKt.m3048TextNvy7gAk(kb0.x("预览地址：", backupRouteConfig2.getDisplayAddress()), null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer, i5).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer, i5).getBodySmall(), composer, 0, 0, 131066);
                composer.endNode();
                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion4, Dp.m7813constructorimpl(f2)), composer, 6);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getEnd(), companion5.getCenterVertically(), composer, 54);
                int iB12 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor12 = companion6.getConstructor();
                if (!id.n(composer.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor12);
                } else {
                    composer.useNode();
                }
                Composer composerM4318constructorimpl12 = Updater.m4318constructorimpl(composer);
                mr.z(companion6, composerM4318constructorimpl12, measurePolicyRowMeasurePolicy5, composerM4318constructorimpl12, currentCompositionLocalMap12);
                Updater.m4326setimpl(composerM4318constructorimpl12, modifierMaterializeModifier12, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl12, Integer.valueOf(iB12), composerM4318constructorimpl12));
                MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion5.getTop(), composer, 6);
                int iB13 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap13 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer, companion4);
                Function0<ComposeUiNode> constructor13 = companion6.getConstructor();
                if (!id.n(composer.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor13);
                } else {
                    composer.useNode();
                }
                Composer composerM4318constructorimpl13 = Updater.m4318constructorimpl(composer);
                mr.z(companion6, composerM4318constructorimpl13, measurePolicyRowMeasurePolicy6, composerM4318constructorimpl13, currentCompositionLocalMap13);
                Updater.m4326setimpl(composerM4318constructorimpl13, modifierMaterializeModifier13, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl13, Integer.valueOf(iB13), composerM4318constructorimpl13));
                boolean zChanged13 = composer.changed(mutableState3) | composer.changed(mutableState14) | composer.changed(mutableState13) | composer.changed(snapshotStateList);
                Object objRememberedValue15 = composer.rememberedValue();
                if (zChanged13 || objRememberedValue15 == companion7.getEmpty()) {
                    objRememberedValue15 = new gh(snapshotStateList, mutableState3, mutableState13, mutableState14);
                    composer.updateRememberedValue(objRememberedValue15);
                }
                a((Function0) objRememberedValue15, SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(122.0f)), bh.b, vs.c, composer, 3504);
                boolean zChanged14 = composer.changed(mutableState14) | composer.changed(mutableState3) | composer.changed(snapshotStateList) | composer.changed(mutableState11) | composer.changed(mutableState13) | composer.changed(mutableState2) | composer.changed(mutableState12) | composer.changed(mutableState15) | composer.changed(function1);
                Object objRememberedValue16 = composer.rememberedValue();
                if (zChanged14 || objRememberedValue16 == companion7.getEmpty()) {
                    objRememberedValue16 = new th(snapshotStateList, mutableState14, mutableState3, mutableState11, mutableState13, mutableState2, mutableState12, mutableState15, function1, 0);
                    composer.updateRememberedValue(objRememberedValue16);
                }
                a((Function0) objRememberedValue16, SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(122.0f)), bhVar, vs.d, composer, 3504);
                composer.endNode();
                composer.endNode();
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, List list) {
        String str = (String) mutableState.getValue();
        List listTake = CollectionsKt.take(list, 50);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            arrayList.add(ServerConfigKt.normalizeBackupRouteConfig((BackupRouteConfig) it.next()));
        }
        snapshotStateList.clear();
        snapshotStateList.addAll(arrayList);
        if (Intrinsics.areEqual(str, "__main_route__") || arrayList.isEmpty()) {
            str = "__main_route__";
        } else {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (Intrinsics.areEqual(((BackupRouteConfig) obj).getId(), str)) {
                }
            }
            str = "__main_route__";
        }
        mutableState.setValue(str);
        mutableState2.setValue(null);
        mutableState3.setValue(null);
        mutableState4.setValue(null);
        mutableState5.setValue(null);
        mutableState6.setValue(null);
        mutableState7.setValue(null);
        mutableState8.setValue(null);
        mutableState9.setValue(SetsKt.emptySet());
        mutableState10.setValue(null);
    }

    public static final void o(ch chVar, Set set, String str, Function1 function1, Function0 function0, Function0 function2, Composer composer, int i) {
        int i2;
        Set set2;
        String str2;
        Function1 function3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-916989194);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            set2 = set;
            i2 |= composerStartRestartGroup.changedInstance(set2) ? 32 : 16;
        } else {
            set2 = set;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-916989194, i3, -1, "com.dh.myembyapp.ui.components.BackupRouteManualImportDialog (BackupRouteManagerDialog.kt:1214)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            int size = chVar.b.size();
            int i4 = chVar.a;
            String strK = i4 > size ? c61.k("已找到 ", i4, size, " 条备选线路，当前可导入前 ", " 条。默认未选择，请勾选需要导入的线路后保存。") : "默认未选择，请勾选需要导入的线路后保存。";
            Integer numValueOf = Integer.valueOf(size);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ji(focusRequester, null, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function2, new DialogProperties(true, true, false), ComposableLambdaKt.rememberComposableLambda(1715180287, true, new f8(strK, set2, size, str2, chVar, function3, focusRequester, function2, function0), composerStartRestartGroup, 54), composer2, ((i3 >> 15) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh(chVar, set, str, function1, function0, function2, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(String str, boolean z, Function0 function0, Composer composer, int i) {
        int i2;
        long onSurface;
        long jM5189getWhite0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1489726075);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        boolean z2 = false;
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1489726075, i2, -1, "com.dh.myembyapp.ui.components.BackupRouteProtocolChip (BackupRouteManagerDialog.kt:1501)");
            }
            u61 u61VarY = hg2.y(composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1402640679);
                composerStartRestartGroup.endReplaceGroup();
                onSurface = u61VarY.j;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1402639026);
                onSurface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface();
                composerStartRestartGroup.endReplaceGroup();
            }
            long j = onSurface;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1402637148);
                z2 = !hg2.v(composerStartRestartGroup);
            } else {
                composerStartRestartGroup.startReplaceGroup(-532077391);
            }
            composerStartRestartGroup.endReplaceGroup();
            long jColor = z2 ? ColorKt.Color(4279308561L) : j;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new t1(29, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue2);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(999.0f));
            int i3 = ClickableSurfaceDefaults.$stable;
            int i4 = i3 << 15;
            ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composerStartRestartGroup, i4, 30);
            long j2 = z ? u61VarY.h : u61VarY.C;
            if (hg2.v(composerStartRestartGroup)) {
                jM5189getWhite0d7_KjU = z ? u61VarY.i : u61VarY.D;
            } else {
                jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
            }
            long j3 = jColor;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceDefaults.m8292colorsoq7We08(j2, j, jM5189getWhite0d7_KjU, j3, 0L, 0L, 0L, 0L, composerStartRestartGroup, i3 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61VarY.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-692994298, true, new xh(str, j3), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 6) & 14, 48, 1564);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yh(str, z, function0, i, 0));
        }
    }

    public static final void q(final String str, final long j, final long j2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-737238013);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-737238013, i2, -1, "com.dh.myembyapp.ui.components.BackupRouteTag (BackupRouteManagerDialog.kt:1033)");
            }
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(BackgroundKt.m274backgroundbw27NRU(Modifier.INSTANCE, j, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(999.0f))), Dp.m7813constructorimpl(8.0f), Dp.m7813constructorimpl(3.0f));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m3048TextNvy7gAk(str, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composer2, i2 & 910, 24576, 114682);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pi.q(str, j, j2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
