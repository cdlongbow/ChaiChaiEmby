package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m8 {
    /* JADX WARN: Code duplicated, block: B:266:0x0502  */
    /* JADX WARN: Code duplicated, block: B:269:0x0509  */
    /* JADX WARN: Code duplicated, block: B:272:0x0513  */
    /* JADX WARN: Code duplicated, block: B:278:0x0589  */
    /* JADX WARN: Code duplicated, block: B:281:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:284:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:285:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:289:0x0602  */
    /* JADX WARN: Code duplicated, block: B:294:0x061c A[LOOP:3: B:293:0x061a->B:294:0x061c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:297:0x0660  */
    /* JADX WARN: Code duplicated, block: B:299:0x066c  */
    /* JADX WARN: Code duplicated, block: B:300:0x066f  */
    /* JADX WARN: Code duplicated, block: B:303:0x067b  */
    /* JADX WARN: Code duplicated, block: B:309:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:325:0x0526 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x05fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0685 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0675 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final void a(final String str, final boolean z, final boolean z2, final List list, final int i, final Bitmap bitmap, final String str2, final boolean z3, final VideoVersionPrioritySettings videoVersionPrioritySettings, final String str3, final boolean z4, final FocusRequester focusRequester, final FocusRequester focusRequester2, final Function1 function1, final Function0 function0, final Function3 function3, Modifier modifier, FocusRequester focusRequester3, String str4, final List list2, final boolean z5, final Function1 function2, final List list3, final Function1 function4, final Function0 function5, Function1 function6, Composer composer, final int i2, final int i3, final int i4, final int i5) {
        FocusRequester focusRequester4;
        Function1 function7;
        Modifier modifier2;
        FocusRequester focusRequester5;
        final String str5;
        final Function1 function8;
        final FocusRequester focusRequester6;
        final Modifier modifier3;
        Function1 function9;
        int i6;
        Function0<ComposeUiNode> constructor;
        ArrayList arrayList;
        int size;
        int i7;
        int i8;
        Iterator it;
        int i9;
        Iterator it2;
        t8 t8Var;
        str.getClass();
        list.getClass();
        str2.getClass();
        videoVersionPrioritySettings.getClass();
        focusRequester.getClass();
        focusRequester2.getClass();
        function1.getClass();
        function0.getClass();
        function3.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(85903402);
        int i10 = (i2 & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i10 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(bitmap) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i10 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i10 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(videoVersionPrioritySettings) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i10 |= composerStartRestartGroup.changed(str3) ? 536870912 : 268435456;
        }
        int i11 = (i3 & 6) == 0 ? i3 | (composerStartRestartGroup.changed(z4) ? 4 : 2) : i3;
        if ((i3 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            focusRequester4 = focusRequester2;
            i11 |= composerStartRestartGroup.changed(focusRequester4) ? 256 : 128;
        } else {
            focusRequester4 = focusRequester2;
        }
        if ((i3 & 3072) == 0) {
            function7 = function1;
            i11 |= composerStartRestartGroup.changedInstance(function7) ? 2048 : 1024;
        } else {
            function7 = function1;
        }
        if ((i3 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        int i12 = i5 & 65536;
        if (i12 != 0) {
            i11 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i3 & 1572864) == 0) {
                i11 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
        }
        int i13 = i5 & 131072;
        if (i13 != 0) {
            i11 |= 12582912;
            focusRequester5 = focusRequester3;
        } else {
            focusRequester5 = focusRequester3;
            if ((i3 & 12582912) == 0) {
                i11 |= composerStartRestartGroup.changed(focusRequester5) ? 8388608 : 4194304;
            }
        }
        int i14 = i5 & 262144;
        if (i14 != 0) {
            i11 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i11 |= composerStartRestartGroup.changed(str4) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(list2) ? 536870912 : 268435456;
        }
        int i15 = i11;
        int i16 = (i4 & 6) == 0 ? i4 | (composerStartRestartGroup.changed(z5) ? 4 : 2) : i4;
        if ((i4 & 48) == 0) {
            i16 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i16 |= composerStartRestartGroup.changedInstance(list3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i16 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i16 |= composerStartRestartGroup.changedInstance(function5) ? 16384 : 8192;
        }
        int i17 = i5 & GroupFlagsKt.HasAuxSlotFlag;
        if (i17 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i16 |= composerStartRestartGroup.changedInstance(function6) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute(((i10 & 306783379) == 306783378 && (i15 & 306783379) == 306783378 && (i16 & 74899) == 74898) ? false : true, i10 & 1)) {
            Modifier modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier2;
            FocusRequester focusRequester7 = i13 != 0 ? null : focusRequester5;
            String str6 = i14 != 0 ? "聚合搜索" : str4;
            if (i17 != 0) {
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new a1(6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function9 = (Function1) objRememberedValue;
            } else {
                function9 = function6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(85903402, i10, i15, "com.dh.myembyapp.ui.screens.search.AggregateSearchContent (AggregateSearchContent.kt:120)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f)), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i18 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Modifier modifier5 = modifier4;
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i18), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i19 = i15 >> 6;
            int i20 = (i10 & 14) | (i19 & Input.Keys.FORWARD_DEL) | (i19 & 896) | ((i15 << 3) & 7168);
            int i21 = i15 >> 9;
            int i22 = i20 | (i21 & 57344) | (i21 & 458752) | ((i16 << 3) & 3670016);
            int i23 = i10;
            e(str, function7, function0, focusRequester4, focusRequester7, str6, function9, null, composerStartRestartGroup, i22);
            FocusRequester focusRequester8 = focusRequester7;
            String str7 = str6;
            Function1 function10 = function9;
            if (StringsKt.isBlank(str) && !z2) {
                composerStartRestartGroup.startReplaceGroup(136129323);
                int i24 = i16 << 9;
                b(bitmap, str2, list2, z5, function2, list3, function4, function5, composerStartRestartGroup, ((i23 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i15 >> 21) & 896) | (i24 & 7168) | (57344 & i24) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (!z) {
                composerStartRestartGroup.startReplaceGroup(136633352);
                int i25 = i16 << 9;
                b(bitmap, str2, list2, z5, function2, null, null, null, composerStartRestartGroup, ((i23 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i15 >> 21) & 896) | (i25 & 7168) | (57344 & i25), 224);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z2) {
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((t8) it3.next()).b.isEmpty()) {
                                if (z2) {
                                    composerStartRestartGroup.startReplaceGroup(138312343);
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(22.0f));
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                                    i6 = 0;
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                                    int i26 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
                                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i26), composerM4318constructorimpl2));
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(916465581);
                                    arrayList = new ArrayList();
                                    for (Object obj : list) {
                                        if (!((t8) obj).b.isEmpty()) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    size = arrayList.size();
                                    i7 = 0;
                                    while (i7 < size) {
                                        t8 t8Var2 = (t8) arrayList.get(i7);
                                        int i27 = i15 << 15;
                                        f(t8Var2.a, t8Var2.b, z3, videoVersionPrioritySettings, str3, z4, focusRequester, function3, composerStartRestartGroup, ((i23 >> 15) & 65408) | (i27 & 458752) | (i27 & 3670016) | ((i15 << 6) & 29360128));
                                        i7++;
                                        size = size;
                                        i6 = i6;
                                    }
                                    i8 = i6;
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (z2) {
                                        composerStartRestartGroup.startReplaceGroup(-1653626206);
                                        if (list.isEmpty()) {
                                            i9 = i8;
                                        } else {
                                            it = list.iterator();
                                            i9 = i8;
                                            while (it.hasNext()) {
                                                if (!((t8) it.next()).c) {
                                                }
                                            }
                                        }
                                        String strF = x2.f(i9, "还有 ", " 个服务器搜索中...");
                                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                        int i28 = MaterialTheme.$stable;
                                        TextKt.m3048TextNvy7gAk(strF, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i28).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i28).getBodyMedium(), composerStartRestartGroup, 0, 0, 131066);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-1653254299);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    if (!list.isEmpty()) {
                                        it2 = list.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                t8Var = (t8) it2.next();
                                                if (t8Var.b.isEmpty()) {
                                                }
                                                composerStartRestartGroup.startReplaceGroup(138312343);
                                                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(22.0f));
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                                                i6 = 0;
                                                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                                                int i29 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                constructor = companion5.getConstructor();
                                                if (composerStartRestartGroup.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (composerStartRestartGroup.getInserting()) {
                                                    composerStartRestartGroup.createNode(constructor);
                                                } else {
                                                    composerStartRestartGroup.useNode();
                                                }
                                                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
                                                mr.z(companion5, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i29), composerM4318constructorimpl3));
                                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                                composerStartRestartGroup.startReplaceGroup(916465581);
                                                arrayList = new ArrayList();
                                                while (r7.hasNext()) {
                                                    if (!((t8) obj).b.isEmpty()) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                size = arrayList.size();
                                                i7 = 0;
                                                while (i7 < size) {
                                                    t8 t8Var3 = (t8) arrayList.get(i7);
                                                    int i210 = i15 << 15;
                                                    f(t8Var3.a, t8Var3.b, z3, videoVersionPrioritySettings, str3, z4, focusRequester, function3, composerStartRestartGroup, ((i23 >> 15) & 65408) | (i210 & 458752) | (i210 & 3670016) | ((i15 << 6) & 29360128));
                                                    i7++;
                                                    size = size;
                                                    i6 = i6;
                                                }
                                                i8 = i6;
                                                composerStartRestartGroup.endReplaceGroup();
                                                if (z2) {
                                                    composerStartRestartGroup.startReplaceGroup(-1653626206);
                                                    if (list.isEmpty()) {
                                                        i9 = i8;
                                                    } else {
                                                        it = list.iterator();
                                                        i9 = i8;
                                                        while (it.hasNext()) {
                                                            if (!((t8) it.next()).c) {
                                                            }
                                                        }
                                                    }
                                                    String strF2 = x2.f(i9, "还有 ", " 个服务器搜索中...");
                                                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                                    int i211 = MaterialTheme.$stable;
                                                    TextKt.m3048TextNvy7gAk(strF2, null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i211).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composerStartRestartGroup, i211).getBodyMedium(), composerStartRestartGroup, 0, 0, 131066);
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else {
                                                    composerStartRestartGroup.startReplaceGroup(-1653254299);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                }
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceGroup();
                                            }
                                        }
                                    }
                                    composerStartRestartGroup.startReplaceGroup(137958478);
                                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                                    int i30 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk("未找到相关内容，换个关键词试试。", PaddingKt.m1001paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7813constructorimpl(12.0f), 1, null), Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composerStartRestartGroup, i30).getOnBackground(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composerStartRestartGroup, i30).getBodyLarge(), composerStartRestartGroup, 54, 0, 131064);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                            }
                        }
                    }
                }
                composerStartRestartGroup.startReplaceGroup(137059788);
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(24.0f), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i31 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion7, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i31), composerM4318constructorimpl4));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion6, Dp.m7813constructorimpl(24.0f)), 0L, Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composerStartRestartGroup, 390, 58);
                SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(12.0f)), composerStartRestartGroup, 6);
                String strF3 = ll0.f(new StringBuilder("正在搜索 "), i, " 个服务器...");
                MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                int i32 = MaterialTheme.$stable;
                TextKt.m3048TextNvy7gAk(strF3, null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composerStartRestartGroup, i32).getOnBackground(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composerStartRestartGroup, i32).getBodyLarge(), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else if (z2) {
                composerStartRestartGroup.startReplaceGroup(138312343);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_6 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(22.0f));
                Modifier.Companion companion8 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_6, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                i6 = 0;
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i212 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion8);
                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                constructor = companion9.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion9, composerM4318constructorimpl5, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl5, currentCompositionLocalMap5);
                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl5, Integer.valueOf(i212), composerM4318constructorimpl5));
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(916465581);
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    if (!((t8) obj).b.isEmpty()) {
                        arrayList.add(obj);
                    }
                }
                size = arrayList.size();
                i7 = 0;
                while (i7 < size) {
                    t8 t8Var4 = (t8) arrayList.get(i7);
                    int i213 = i15 << 15;
                    f(t8Var4.a, t8Var4.b, z3, videoVersionPrioritySettings, str3, z4, focusRequester, function3, composerStartRestartGroup, ((i23 >> 15) & 65408) | (i213 & 458752) | (i213 & 3670016) | ((i15 << 6) & 29360128));
                    i7++;
                    size = size;
                    i6 = i6;
                }
                i8 = i6;
                composerStartRestartGroup.endReplaceGroup();
                if (z2) {
                    composerStartRestartGroup.startReplaceGroup(-1653626206);
                    if (list.isEmpty()) {
                        i9 = i8;
                    } else {
                        it = list.iterator();
                        i9 = i8;
                        while (it.hasNext()) {
                            if (!((t8) it.next()).c && (i9 = i9 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    String strF4 = x2.f(i9, "还有 ", " 个服务器搜索中...");
                    MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                    int i214 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(strF4, null, Color.m5151copywmQWz5c$default(materialTheme5.getColorScheme(composerStartRestartGroup, i214).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composerStartRestartGroup, i214).getBodyMedium(), composerStartRestartGroup, 0, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1653254299);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!list.isEmpty()) {
                    it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            t8Var = (t8) it2.next();
                            if (t8Var.b.isEmpty() || t8Var.d != null) {
                                composerStartRestartGroup.startReplaceGroup(138312343);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_7 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(22.0f));
                                Modifier.Companion companion10 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_7, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                                i6 = 0;
                                long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                                int i215 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion10);
                                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                                constructor = companion11.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composerStartRestartGroup);
                                mr.z(companion11, composerM4318constructorimpl6, measurePolicyColumnMeasurePolicy5, composerM4318constructorimpl6, currentCompositionLocalMap6);
                                Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl6, Integer.valueOf(i215), composerM4318constructorimpl6));
                                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(916465581);
                                arrayList = new ArrayList();
                                while (r7.hasNext()) {
                                    if (!((t8) obj).b.isEmpty()) {
                                        arrayList.add(obj);
                                    }
                                }
                                size = arrayList.size();
                                i7 = 0;
                                while (i7 < size) {
                                    t8 t8Var5 = (t8) arrayList.get(i7);
                                    int i216 = i15 << 15;
                                    f(t8Var5.a, t8Var5.b, z3, videoVersionPrioritySettings, str3, z4, focusRequester, function3, composerStartRestartGroup, ((i23 >> 15) & 65408) | (i216 & 458752) | (i216 & 3670016) | ((i15 << 6) & 29360128));
                                    i7++;
                                    size = size;
                                    i6 = i6;
                                }
                                i8 = i6;
                                composerStartRestartGroup.endReplaceGroup();
                                if (z2) {
                                    composerStartRestartGroup.startReplaceGroup(-1653626206);
                                    if (list.isEmpty()) {
                                        i9 = i8;
                                    } else {
                                        it = list.iterator();
                                        i9 = i8;
                                        while (it.hasNext()) {
                                            if (!((t8) it.next()).c) {
                                            }
                                        }
                                    }
                                    String strF5 = x2.f(i9, "还有 ", " 个服务器搜索中...");
                                    MaterialTheme materialTheme6 = MaterialTheme.INSTANCE;
                                    int i217 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk(strF5, null, Color.m5151copywmQWz5c$default(materialTheme6.getColorScheme(composerStartRestartGroup, i217).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme6.getTypography(composerStartRestartGroup, i217).getBodyMedium(), composerStartRestartGroup, 0, 0, 131066);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-1653254299);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                            }
                        }
                    }
                }
                composerStartRestartGroup.startReplaceGroup(137958478);
                MaterialTheme materialTheme7 = MaterialTheme.INSTANCE;
                int i33 = MaterialTheme.$stable;
                TextKt.m3048TextNvy7gAk("未找到相关内容，换个关键词试试。", PaddingKt.m1001paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7813constructorimpl(12.0f), 1, null), Color.m5151copywmQWz5c$default(materialTheme7.getColorScheme(composerStartRestartGroup, i33).getOnBackground(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme7.getTypography(composerStartRestartGroup, i33).getBodyLarge(), composerStartRestartGroup, 54, 0, 131064);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            focusRequester6 = focusRequester8;
            modifier3 = modifier5;
            str5 = str7;
            function8 = function10;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str5 = str4;
            function8 = function6;
            focusRequester6 = focusRequester5;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: w7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i4);
                    m8.a(str, z, z2, list, i, bitmap, str2, z3, videoVersionPrioritySettings, str3, z4, focusRequester, focusRequester2, function1, function0, function3, modifier3, focusRequester6, str5, list2, z5, function2, list3, function4, function5, function8, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3, i5);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0192  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:110:0x0240  */
    /* JADX WARN: Code duplicated, block: B:111:0x026c  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02de  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:126:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x0182  */
    public static final void b(Bitmap bitmap, String str, List list, boolean z, Function1 function1, List list2, Function1 function2, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Function1 function3;
        List list3;
        int i4;
        int i5;
        int i6;
        Function0 function4;
        char c;
        int i7;
        boolean z2;
        Function1 function5;
        Function0 function6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        List listEmptyList;
        Function1 function7;
        Modifier.Companion companion;
        Arrangement arrangement;
        Alignment.Companion companion2;
        int i8;
        Function0 function8;
        ComposeUiNode.Companion companion3;
        Function0<ComposeUiNode> constructor;
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion4;
        ComposeUiNode.Companion companion5;
        int i9;
        Composer composer2;
        Composer composer3;
        Function0<ComposeUiNode> constructor2;
        Function0 function9;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1974894406);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(bitmap) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function3 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        } else {
            function3 = function1;
        }
        int i10 = i2 & 32;
        if (i10 == 0) {
            if ((196608 & i) == 0) {
                list3 = list2;
                i3 |= composerStartRestartGroup.changedInstance(list3) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                    function4 = function0;
                    c = ' ';
                } else {
                    function4 = function0;
                    c = ' ';
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                }
                if ((i3 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                    if (i10 != 0) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list3;
                    }
                    if (i4 != 0) {
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new a1(7);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        function7 = (Function1) objRememberedValue2;
                    } else {
                        function7 = function2;
                    }
                    if (i6 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new b1(10);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function4 = (Function0) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1974894406, i3, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchHintCard (AggregateSearchContent.kt:230)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(4.0f), 0.0f, 0.0f, 13, null);
                    arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f));
                    companion2 = Alignment.INSTANCE;
                    i8 = i3;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getTop(), composerStartRestartGroup, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    function8 = function4;
                    int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingqDBjuR0$default);
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i11), composerM4318constructorimpl));
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (bitmap == null) {
                        composerStartRestartGroup.startReplaceGroup(1028252485);
                        composerStartRestartGroup.endReplaceGroup();
                        companion4 = companion;
                        companion5 = companion3;
                        composer2 = composerStartRestartGroup;
                        i9 = 0;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1028252486);
                        ImageBitmap imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(BorderKt.m287borderxT4_qwU$default(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(160.0f)), Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutline(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), null, 4, null), Dp.m7813constructorimpl(8.0f));
                        companion4 = companion;
                        companion5 = companion3;
                        i9 = 0;
                        ImageKt.m332Image5hnEew(imageBitmapAsImageBitmap, "扫码搜索", modifierM999padding3ABfNKs, null, null, 0.0f, null, 0, composerStartRestartGroup, 48, 248);
                        composer2 = composerStartRestartGroup;
                        Unit unit = Unit.INSTANCE;
                        composer2.endReplaceGroup();
                    }
                    if (list.isEmpty()) {
                        composer3 = composer2;
                        composer3.startReplaceGroup(1028906276);
                        Modifier modifierE = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion2.getStart(), composer3, 6);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, i9);
                        int i12 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierE);
                        constructor2 = companion5.getConstructor();
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
                        mr.z(companion5, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i12), composerM4318constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        if (listEmptyList.isEmpty()) {
                            composer3.startReplaceGroup(-1455837734);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1456078945);
                            d(listEmptyList, function7, function8, composer3, (i8 >> 15) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                            composer3.endReplaceGroup();
                        }
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i13 = MaterialTheme.$stable;
                        function9 = function8;
                        TextKt.m3048TextNvy7gAk("手机扫码输入更方便", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i13).getOnBackground(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i13).getTitleMedium(), composer3, 6, 0, 131066);
                        composerStartRestartGroup = composer3;
                        TextKt.m3048TextNvy7gAk("也可以继续用遥控器在上方输入框输入关键词", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i13).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i13).getBodyMedium(), composer3, 6, 0, 131066);
                        TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i13).getOnBackground(), 0.56f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i13).getBodySmall(), composer3, (i8 >> 3) & 14, 0, 131066);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1028633104);
                        composerStartRestartGroup = composer2;
                        h(list, z, function3, zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), composerStartRestartGroup, (i8 >> 6) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                        composerStartRestartGroup.endReplaceGroup();
                        function9 = function8;
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    list3 = listEmptyList;
                    function5 = function7;
                    function6 = function9;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function5 = function2;
                    function6 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new g8(bitmap, str, list, z, function1, list3, function5, function6, i, i2));
                }
            }
            i3 |= 1572864;
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
                function4 = function0;
                c = ' ';
            } else {
                function4 = function0;
                c = ' ';
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
            }
            if ((i3 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i10 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list3;
                }
                if (i4 != 0) {
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new a1(7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function7 = (Function1) objRememberedValue2;
                } else {
                    function7 = function2;
                }
                if (i6 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new b1(10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function4 = (Function0) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1974894406, i3, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchHintCard (AggregateSearchContent.kt:230)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM1003paddingqDBjuR0$default2 = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(4.0f), 0.0f, 0.0f, 13, null);
                arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f));
                companion2 = Alignment.INSTANCE;
                i8 = i3;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, companion2.getTop(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                function8 = function4;
                int i14 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> c));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingqDBjuR0$default2);
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
                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion3, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i14), composerM4318constructorimpl3));
                rowScopeInstance = RowScopeInstance.INSTANCE;
                if (bitmap == null) {
                    composerStartRestartGroup.startReplaceGroup(1028252485);
                    composerStartRestartGroup.endReplaceGroup();
                    companion4 = companion;
                    companion5 = companion3;
                    composer2 = composerStartRestartGroup;
                    i9 = 0;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1028252486);
                    ImageBitmap imageBitmapAsImageBitmap2 = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(BorderKt.m287borderxT4_qwU$default(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(160.0f)), Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutline(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), null, 4, null), Dp.m7813constructorimpl(8.0f));
                    companion4 = companion;
                    companion5 = companion3;
                    i9 = 0;
                    ImageKt.m332Image5hnEew(imageBitmapAsImageBitmap2, "扫码搜索", modifierM999padding3ABfNKs2, null, null, 0.0f, null, 0, composerStartRestartGroup, 48, 248);
                    composer2 = composerStartRestartGroup;
                    Unit unit2 = Unit.INSTANCE;
                    composer2.endReplaceGroup();
                }
                if (list.isEmpty()) {
                    composer2.startReplaceGroup(1028633104);
                    composerStartRestartGroup = composer2;
                    h(list, z, function3, zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), composerStartRestartGroup, (i8 >> 6) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                    composerStartRestartGroup.endReplaceGroup();
                    function9 = function8;
                } else {
                    composer3 = composer2;
                    composer3.startReplaceGroup(1028906276);
                    Modifier modifierE2 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion2.getStart(), composer3, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, i9);
                    int i15 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> c));
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierE2);
                    constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion5, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i15), composerM4318constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    if (listEmptyList.isEmpty()) {
                        composer3.startReplaceGroup(-1456078945);
                        d(listEmptyList, function7, function8, composer3, (i8 >> 15) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1455837734);
                        composer3.endReplaceGroup();
                    }
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i16 = MaterialTheme.$stable;
                    function9 = function8;
                    TextKt.m3048TextNvy7gAk("手机扫码输入更方便", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer3, i16).getOnBackground(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i16).getTitleMedium(), composer3, 6, 0, 131066);
                    composerStartRestartGroup = composer3;
                    TextKt.m3048TextNvy7gAk("也可以继续用遥控器在上方输入框输入关键词", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i16).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composerStartRestartGroup, i16).getBodyMedium(), composer3, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i16).getOnBackground(), 0.56f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composerStartRestartGroup, i16).getBodySmall(), composer3, (i8 >> 3) & 14, 0, 131066);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                list3 = listEmptyList;
                function5 = function7;
                function6 = function9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function5 = function2;
                function6 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new g8(bitmap, str, list, z, function1, list3, function5, function6, i, i2));
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        list3 = list2;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                i3 |= 12582912;
                function4 = function0;
                c = ' ';
            } else {
                function4 = function0;
                c = ' ';
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
            }
            if ((i3 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i10 != 0) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = list3;
                }
                if (i4 != 0) {
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new a1(7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function7 = (Function1) objRememberedValue2;
                } else {
                    function7 = function2;
                }
                if (i6 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new b1(10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function4 = (Function0) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1974894406, i3, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchHintCard (AggregateSearchContent.kt:230)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM1003paddingqDBjuR0$default3 = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(4.0f), 0.0f, 0.0f, 13, null);
                arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_6 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f));
                companion2 = Alignment.INSTANCE;
                i8 = i3;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_6, companion2.getTop(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                function8 = function4;
                int i17 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> c));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingqDBjuR0$default3);
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
                Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion3, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl5, Integer.valueOf(i17), composerM4318constructorimpl5));
                rowScopeInstance = RowScopeInstance.INSTANCE;
                if (bitmap == null) {
                    composerStartRestartGroup.startReplaceGroup(1028252485);
                    composerStartRestartGroup.endReplaceGroup();
                    companion4 = companion;
                    companion5 = companion3;
                    composer2 = composerStartRestartGroup;
                    i9 = 0;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1028252486);
                    ImageBitmap imageBitmapAsImageBitmap3 = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
                    Modifier modifierM999padding3ABfNKs3 = PaddingKt.m999padding3ABfNKs(BorderKt.m287borderxT4_qwU$default(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(160.0f)), Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutline(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), null, 4, null), Dp.m7813constructorimpl(8.0f));
                    companion4 = companion;
                    companion5 = companion3;
                    i9 = 0;
                    ImageKt.m332Image5hnEew(imageBitmapAsImageBitmap3, "扫码搜索", modifierM999padding3ABfNKs3, null, null, 0.0f, null, 0, composerStartRestartGroup, 48, 248);
                    composer2 = composerStartRestartGroup;
                    Unit unit3 = Unit.INSTANCE;
                    composer2.endReplaceGroup();
                }
                if (list.isEmpty()) {
                    composer2.startReplaceGroup(1028633104);
                    composerStartRestartGroup = composer2;
                    h(list, z, function3, zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), composerStartRestartGroup, (i8 >> 6) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                    composerStartRestartGroup.endReplaceGroup();
                    function9 = function8;
                } else {
                    composer3 = composer2;
                    composer3.startReplaceGroup(1028906276);
                    Modifier modifierE3 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion2.getStart(), composer3, 6);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, i9);
                    int i18 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> c));
                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierE3);
                    constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion5, composerM4318constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl6, Integer.valueOf(i18), composerM4318constructorimpl6));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    if (listEmptyList.isEmpty()) {
                        composer3.startReplaceGroup(-1456078945);
                        d(listEmptyList, function7, function8, composer3, (i8 >> 15) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1455837734);
                        composer3.endReplaceGroup();
                    }
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i19 = MaterialTheme.$stable;
                    function9 = function8;
                    TextKt.m3048TextNvy7gAk("手机扫码输入更方便", null, Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composer3, i19).getOnBackground(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer3, i19).getTitleMedium(), composer3, 6, 0, 131066);
                    composerStartRestartGroup = composer3;
                    TextKt.m3048TextNvy7gAk("也可以继续用遥控器在上方输入框输入关键词", null, Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composerStartRestartGroup, i19).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composerStartRestartGroup, i19).getBodyMedium(), composer3, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composerStartRestartGroup, i19).getOnBackground(), 0.56f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composerStartRestartGroup, i19).getBodySmall(), composer3, (i8 >> 3) & 14, 0, 131066);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                list3 = listEmptyList;
                function5 = function7;
                function6 = function9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function5 = function2;
                function6 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new g8(bitmap, str, list, z, function1, list3, function5, function6, i, i2));
            }
        }
        i3 |= 1572864;
        i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
            function4 = function0;
            c = ' ';
        } else {
            function4 = function0;
            c = ' ';
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
        }
        if ((i3 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
            if (i10 != 0) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = list3;
            }
            if (i4 != 0) {
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new a1(7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                function7 = (Function1) objRememberedValue2;
            } else {
                function7 = function2;
            }
            if (i6 != 0) {
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new b1(10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function4 = (Function0) objRememberedValue;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1974894406, i3, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchHintCard (AggregateSearchContent.kt:230)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM1003paddingqDBjuR0$default4 = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(4.0f), 0.0f, 0.0f, 13, null);
            arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_7 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f));
            companion2 = Alignment.INSTANCE;
            i8 = i3;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_7, companion2.getTop(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            function8 = function4;
            int i110 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> c));
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingqDBjuR0$default4);
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
            Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion3, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl7, currentCompositionLocalMap7);
            Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl7, Integer.valueOf(i110), composerM4318constructorimpl7));
            rowScopeInstance = RowScopeInstance.INSTANCE;
            if (bitmap == null) {
                composerStartRestartGroup.startReplaceGroup(1028252485);
                composerStartRestartGroup.endReplaceGroup();
                companion4 = companion;
                companion5 = companion3;
                composer2 = composerStartRestartGroup;
                i9 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(1028252486);
                ImageBitmap imageBitmapAsImageBitmap4 = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
                Modifier modifierM999padding3ABfNKs4 = PaddingKt.m999padding3ABfNKs(BorderKt.m287borderxT4_qwU$default(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(160.0f)), Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOutline(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), null, 4, null), Dp.m7813constructorimpl(8.0f));
                companion4 = companion;
                companion5 = companion3;
                i9 = 0;
                ImageKt.m332Image5hnEew(imageBitmapAsImageBitmap4, "扫码搜索", modifierM999padding3ABfNKs4, null, null, 0.0f, null, 0, composerStartRestartGroup, 48, 248);
                composer2 = composerStartRestartGroup;
                Unit unit4 = Unit.INSTANCE;
                composer2.endReplaceGroup();
            }
            if (list.isEmpty()) {
                composer2.startReplaceGroup(1028633104);
                composerStartRestartGroup = composer2;
                h(list, z, function3, zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), composerStartRestartGroup, (i8 >> 6) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                composerStartRestartGroup.endReplaceGroup();
                function9 = function8;
            } else {
                composer3 = composer2;
                composer3.startReplaceGroup(1028906276);
                Modifier modifierE4 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion2.getStart(), composer3, 6);
                long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, i9);
                int i111 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> c));
                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierE4);
                constructor2 = companion5.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer3);
                mr.z(companion5, composerM4318constructorimpl8, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl8, currentCompositionLocalMap8);
                Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl8, Integer.valueOf(i111), composerM4318constructorimpl8));
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                if (listEmptyList.isEmpty()) {
                    composer3.startReplaceGroup(-1456078945);
                    d(listEmptyList, function7, function8, composer3, (i8 >> 15) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(-1455837734);
                    composer3.endReplaceGroup();
                }
                MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                int i112 = MaterialTheme.$stable;
                function9 = function8;
                TextKt.m3048TextNvy7gAk("手机扫码输入更方便", null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composer3, i112).getOnBackground(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer3, i112).getTitleMedium(), composer3, 6, 0, 131066);
                composerStartRestartGroup = composer3;
                TextKt.m3048TextNvy7gAk("也可以继续用遥控器在上方输入框输入关键词", null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composerStartRestartGroup, i112).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composerStartRestartGroup, i112).getBodyMedium(), composer3, 6, 0, 131066);
                TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composerStartRestartGroup, i112).getOnBackground(), 0.56f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composerStartRestartGroup, i112).getBodySmall(), composer3, (i8 >> 3) & 14, 0, 131066);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            list3 = listEmptyList;
            function5 = function7;
            function6 = function9;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function5 = function2;
            function6 = function4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g8(bitmap, str, list, z, function1, list3, function5, function6, i, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(String str, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1301019622);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1301019622, i2, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchHistoryTag (AggregateSearchContent.kt:362)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier modifierM1071widthInVpY3zN4$default = SizeKt.m1071widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7813constructorimpl(150.0f), 1, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new t1(24, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SurfaceKt.m2908Surfaceo_FOJdg(function0, FocusChangedModifierKt.onFocusChanged(modifierM1071widthInVpY3zN4$default, (Function1) objRememberedValue2), false, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), yc2.l(((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup), 0L, 0.0f, 0.0f, yc2.k(((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup), null, ComposableLambdaKt.rememberComposableLambda(2131402417, true, new c8(i3, mutableState, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 3) & 14, 6, 740);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d8(str, function0, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(List list, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        char c;
        long jM5151copywmQWz5c$default;
        List list2 = list;
        Function1 function2 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1559663905);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1559663905, i2, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchHistoryTags (AggregateSearchContent.kt:294)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
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
                composerStartRestartGroup.startReplaceGroup(991483794);
                composerStartRestartGroup.endReplaceGroup();
                c = ' ';
                jM5151copywmQWz5c$default = u61Var.s;
            } else {
                c = ' ';
                composerStartRestartGroup.startReplaceGroup(991537207);
                jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnBackground(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            final long j = jM5151copywmQWz5c$default;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyQ = mr.q(8.0f, arrangement, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyQ, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            int i6 = i2;
            TextKt.m3048TextNvy7gAk("搜索历史", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i5).getOnBackground(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i5).getTitleMedium(), composerStartRestartGroup, 6, 0, 131066);
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(34.0f));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new t1(22, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue2);
            IconButtonDefaults iconButtonDefaults = IconButtonDefaults.INSTANCE;
            long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i5).getSurfaceVariant(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            long j2 = u61Var.r;
            long j3 = u61Var.s;
            int i7 = IconButtonDefaults.$stable;
            IconButtonKt.IconButton(function0, modifierOnFocusChanged, null, false, IconButtonDefaults.scale$default(iconButtonDefaults, 0.0f, 1.08f, 0.0f, 0.0f, 0.0f, 29, null), el0.b(u61Var), null, iconButtonDefaults.m8385colorsoq7We08(jM5151copywmQWz5c$default2, j, j2, j3, 0L, 0L, 0L, 0L, composerStartRestartGroup, i7 << 24, PsExtractor.VIDEO_STREAM_MASK), iconButtonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i7 << 15, 29), null, ComposableLambdaKt.rememberComposableLambda(-87818737, true, new Function3() { // from class: v7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((BoxScope) obj).getClass();
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-87818737, iIntValue, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchHistoryTags.<anonymous>.<anonymous>.<anonymous> (AggregateSearchContent.kt:334)");
                        }
                        IconKt.m2496Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "清空搜索历史", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(18.0f)), j, composer3, 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i6 >> 6) & 14, 6, 588);
            composerStartRestartGroup.endNode();
            list2 = list;
            function2 = function1;
            FlowLayoutKt.FlowRow(null, arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-254790490, true, new t7(list2, 1, function2), composerStartRestartGroup, 54), composerStartRestartGroup, 1573296, 57);
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 0, list2, function2, function0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(String str, Function1 function1, Function0 function0, FocusRequester focusRequester, FocusRequester focusRequester2, String str2, Function1 function2, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        char c;
        MutableState mutableState;
        String str3;
        MutableState mutableState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-797640413);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-797640413, i3, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchInputBar (AggregateSearchContent.kt:584)");
            }
            if (ComposerKt.isTraceInProgress()) {
                c = ' ';
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            } else {
                c = ' ';
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                mutableState = mutableState4;
                str3 = str;
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                mutableState = mutableState4;
                str3 = str;
            }
            MutableState mutableState5 = (MutableState) objRememberedValue3;
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new i8(str3, mutableState5, null, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(str3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i4);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyQ = mr.q(16.0f, Arrangement.INSTANCE, Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            int i6 = 0;
            modifier2 = companion;
            SurfaceKt.m2905SurfaceT9BRK9s(SizeKt.m1050height3ABfNKs(zs1.E(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(48.0f)), MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium(), yc2.l(((Boolean) mutableState3.getValue()).booleanValue(), composerStartRestartGroup), 0L, 0.0f, 0.0f, yc2.k(((Boolean) mutableState3.getValue()).booleanValue(), composerStartRestartGroup), ComposableLambdaKt.rememberComposableLambda(-1880170654, true, new f2(function1, focusRequester2, focusRequester, function2, mutableState3, mutableState5), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 56);
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(modifier2, Dp.m7813constructorimpl(140.0f)), Dp.m7813constructorimpl(48.0f));
            if (focusRequester2 != null) {
                modifierM1050height3ABfNKs = FocusPropertiesKt.focusProperties(modifierM1050height3ABfNKs, new h5(focusRequester2, 1));
            }
            boolean z2 = (i3 & 3670016) == 1048576;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue5 == companion2.getEmpty()) {
                mutableState2 = mutableState;
                objRememberedValue5 = new r7(function2, mutableState2, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                mutableState2 = mutableState;
            }
            ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue5), null, false, hc2.l(1.05f), el0.a(u61Var), null, hc2.i(jc2.b, false, composerStartRestartGroup, 6, 2), 0.0f, hc2.h(composerStartRestartGroup), null, null, ComposableLambdaKt.rememberComposableLambda(-912968841, true, new e8(i6, mutableState2, str2), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f8(str, function1, function0, focusRequester, focusRequester2, str2, function2, modifier2, i));
        }
    }

    public static final void f(ServerConfig serverConfig, List list, boolean z, VideoVersionPrioritySettings videoVersionPrioritySettings, String str, boolean z2, FocusRequester focusRequester, Function3 function3, Composer composer, int i) {
        int i2;
        String str2;
        Composer composer2;
        LazyListState lazyListState;
        Composer composerStartRestartGroup = composer.startRestartGroup(946444030);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(serverConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(videoVersionPrioritySettings) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 4793491) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(946444030, i2, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchResultSection (AggregateSearchContent.kt:459)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            float f = ioVar.g;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(12.0f)));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String alias = serverConfig.getAlias();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            TextKt.m3048TextNvy7gAk(alias, null, materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i4).getTitleLarge(), composerStartRestartGroup, 0, 0, 131066);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
            PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(f, f, Dp.m7813constructorimpl(48.0f), f);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(serverConfig) | ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(videoVersionPrioritySettings) | ((458752 & i2) == 131072) | ((57344 & i2) == 16384) | ((3670016 & i2) == 1048576) | ((i2 & 29360128) == 8388608) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                lazyListState = lazyListStateRememberLazyListState;
                h8 h8Var = new h8(list, serverConfig, z, videoVersionPrioritySettings, z2, str2, focusRequester, function3, coroutineScope, lazyListState);
                composerStartRestartGroup.updateRememberedValue(h8Var);
                objRememberedValue2 = h8Var;
            } else {
                lazyListState = lazyListStateRememberLazyListState;
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyRow(null, lazyListState, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue2, composer2, 24576, 489);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new q7(serverConfig, list, z, videoVersionPrioritySettings, str, z2, focusRequester, function3, i));
        }
    }

    public static final void g(BoxScope boxScope, List list, Composer composer, int i) {
        int i2;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(262456757);
        int i3 = 2;
        int i4 = (i & 6) == 0 ? (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i5 = 0;
        boolean z = true;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(262456757, i4, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchVersionTagsOverlay (AggregateSearchContent.kt:708)");
            }
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = objRememberedValue;
                List listListOf = CollectionsKt.listOf((Object[]) new List[]{CollectionsKt.take(list, 2), CollectionsKt.take(CollectionsKt.drop(list, 2), 2)});
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listListOf) {
                    if (!((List) obj2).isEmpty()) {
                        arrayList.add(obj2);
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue;
            List list2 = (List) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(boxScope.align(companion, companion2.getBottomEnd()), 0.0f, 0.0f, Dp.m7813constructorimpl(2.0f), Dp.m7813constructorimpl(6.0f), 3, null);
            float f = 3.0f;
            int i6 = 54;
            MeasurePolicy measurePolicyP = mr.p(3.0f, Arrangement.INSTANCE, companion2.getEnd(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingqDBjuR0$default);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyP, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-542011329);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                List<String> list3 = (List) it.next();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(f));
                Modifier.Companion companion4 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i5);
                int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
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
                mr.z(companion5, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i8), composerM4318constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-2112189285);
                for (String str : list3) {
                    Color.Companion companion6 = Color.INSTANCE;
                    SurfaceKt.m2905SurfaceT9BRK9s(null, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(4.0f)), Color.m5151copywmQWz5c$default(companion6.m5178getBlack0d7_KjU(), 0.73f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(companion6.m5189getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), ComposableLambdaKt.rememberComposableLambda(-1520836357, true, new z1(str, i3), composerStartRestartGroup, i6), composerStartRestartGroup, 14156160, 57);
                    it = it;
                    z = true;
                    i3 = i3;
                    f = 3.0f;
                    i6 = i6;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                i5 = 0;
                it = it;
            }
            i2 = i5;
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i2 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a8(boxScope, list, i, i2));
        }
    }

    public static final void h(List list, boolean z, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-537187540);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-537187540, i2, -1, "com.dh.myembyapp.ui.screens.search.AggregateSuggestTags (AggregateSearchContent.kt:395)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            mr.z(companion2, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextKt.m3048TextNvy7gAk("搜索建议", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i6).getOnBackground(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i6).getTitleMedium(), composerStartRestartGroup, 6, 0, 131066);
            Composer composer3 = composerStartRestartGroup;
            if (z) {
                composer3.startReplaceGroup(1755427444);
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(14.0f)), 0L, Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composer3, 390, 58);
                composer3 = composer3;
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(1755588892);
                composer3.endReplaceGroup();
            }
            composer3.endNode();
            FlowLayoutKt.FlowRow(null, arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-950698937, true, new t7(list, i3, function1), composer3, 54), composer3, 1573296, 57);
            composer2 = composer3;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(list, z, function1, modifier, i, 0));
        }
    }
}
