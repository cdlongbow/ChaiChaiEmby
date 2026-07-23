package defpackage;

import android.graphics.RectF;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.draganddrop.DragAndDropSourceNode;
import androidx.compose.foundation.gestures.Scrollable2DNode;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaSourcePriorityKt;
import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt;
import kotlinx.coroutines.future.FutureKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        String imageUrl;
        String str;
        MediaSource mediaSource;
        String primary;
        int i = this.a;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int iCompareMediaItemsByBestSourcePriority = MediaSourcePriorityKt.compareMediaItemsByBestSourcePriority(((t8) pair.getSecond()).b, ((t8) pair2.getSecond()).b, (VideoVersionPrioritySettings) obj3, true);
                if (iCompareMediaItemsByBestSourcePriority == 0) {
                    iCompareMediaItemsByBestSourcePriority = Intrinsics.compare(((Number) pair.getFirst()).intValue(), ((Number) pair2.getFirst()).intValue());
                }
                return Integer.valueOf(iCompareMediaItemsByBestSourcePriority);
            case 1:
                ((Integer) obj).getClass();
                Library library = (Library) obj2;
                library.getClass();
                return mr.C(((g3) obj3).a.getId(), "_", library.getId());
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                h3 h3Var = (h3) obj2;
                h3Var.getClass();
                StringBuilder sbZ = kb0.z("recent:", ((j3) obj3).a.getId(), ":", h3Var.b.getId(), ":");
                sbZ.append(iIntValue);
                return sbZ.toString();
            case 3:
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                list.getClass();
                MutableStateFlow mutableStateFlow = ((p7) obj3).e;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, h7.a((h7) value, null, false, null, list, zBooleanValue, 15)));
                return Unit.INSTANCE;
            case 4:
                int iIntValue2 = ((Integer) obj).intValue();
                MediaItem mediaItem = (MediaItem) obj2;
                mediaItem.getClass();
                StringBuilder sbZ2 = kb0.z("search:", ((ServerConfig) obj3).getId(), ":", mediaItem.getId(), ":");
                sbZ2.append(iIntValue2);
                return sbZ2.toString();
            case 5:
                v8 v8Var = (v8) obj3;
                List list2 = (List) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                list2.getClass();
                v8Var.j.setValue(list2);
                v8Var.l.setValue(bool);
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf(AndroidParagraph.getRangeForRect_8_6BmAI$lambda$0((TextInclusionStrategy) obj3, (RectF) obj, (RectF) obj2));
            case 7:
                return BasicTextKt.selectionIdSaver$lambda$0((SelectionRegistrar) obj3, (SaverScope) obj, ((Long) obj2).longValue());
            case 8:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$8$0((CoroutineScope) obj3, (TextFieldSelectionState) obj, (TextContextMenuItems) obj2);
            case 9:
                return ComposerKt.removeCurrentGroup$lambda$0((RememberManager) obj3, ((Integer) obj).intValue(), obj2);
            case 10:
                uw uwVar = (uw) obj3;
                Composer composer = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1200679459, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.DanmakuMenuOverlay.<anonymous>.<anonymous>.<anonymous> (DanmakuMenuOverlay.kt:230)");
                    }
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), Alignment.INSTANCE.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    mr.z(companion, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String strC = mr.C(uwVar.b, "  ", uwVar.c);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(strC, null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer, i3).getBodySmall(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    TextKt.m3048TextNvy7gAk(kb0.x("来源: ", uwVar.a), null, ColorKt.Color(4291809231L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getBodySmall(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    TextKt.m3048TextNvy7gAk(kb0.x("弹幕池: ", uwVar.d), null, ColorKt.Color(4291809231L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getBodySmall(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    TextKt.m3048TextNvy7gAk(kb0.x("API: ", uwVar.e), null, ColorKt.Color(4291809231L), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer, i3).getBodySmall(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110586);
                    TextKt.m3048TextNvy7gAk(x2.f(uwVar.g, "已加载 ", " 条弹幕"), null, ColorKt.Color(4291809231L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getBodySmall(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$19((FiniteAnimationSpec) obj3, (IntSize) obj, (IntSize) obj2);
            case 12:
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0$0$0((TextContextMenuItem) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                ((va0) obj3).x(str2, str3, false);
                return Unit.INSTANCE;
            case 14:
                Function4 function4 = (Function4) obj3;
                ServerConfig serverConfig = (ServerConfig) obj;
                OtherServerResourceMatch otherServerResourceMatch = (OtherServerResourceMatch) obj2;
                serverConfig.getClass();
                otherServerResourceMatch.getClass();
                String id = serverConfig.getId();
                String id2 = otherServerResourceMatch.getItem().getId();
                String matchedEpisodeId = otherServerResourceMatch.getMatchedEpisodeId();
                MediaSource mediaSource2 = otherServerResourceMatch.getMediaSource();
                function4.invoke(id, id2, matchedEpisodeId, mediaSource2 != null ? mediaSource2.getId() : null);
                return Unit.INSTANCE;
            case 15:
                return DragAndDropSourceNode.dragAndDropModifierNode$lambda$0((DragAndDropSourceNode) obj3, (DragAndDropStartTransferScope) obj, (Offset) obj2);
            case 16:
                MediaItem mediaItem2 = (MediaItem) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1146244782, iIntValue4, -1, "com.dh.myembyapp.ui.screens.player.components.EpisodeSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpisodeSelectionOverlay.kt:145)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(8.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getTop(), composer2, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
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
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageTags imageTags = mediaItem2.getImageTags();
                    String str4 = "";
                    if (imageTags == null || (primary = imageTags.getPrimary()) == null || (imageUrl = RetrofitClient.INSTANCE.getImageUrl(mediaItem2.getId(), "Primary", primary, 200)) == null) {
                        imageUrl = "";
                    }
                    boolean zChanged = composer2.changed(imageUrl);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    if (objRememberedValue2 == companion5.getEmpty()) {
                        objRememberedValue2 = new ColorPainter(Color.INSTANCE.m5187getTransparent0d7_KjU(), defaultConstructorMarker);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    ColorPainter colorPainter = (ColorPainter) objRememberedValue2;
                    Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxHeight$default(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(120.0f)), 0.0f, 1, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(4.0f)));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierClip);
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
                    mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer2.startReplaceGroup(759282100);
                        v31.a(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(40.0f), composer2, 54, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(759518506);
                        composer2.endReplaceGroup();
                    }
                    String str5 = StringsKt.isBlank(imageUrl) ? null : imageUrl;
                    String name = mediaItem2.getName();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    ContentScale crop = ContentScale.INSTANCE.getCrop();
                    boolean zChanged2 = composer2.changed(mutableState);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion5.getEmpty()) {
                        objRememberedValue3 = new h70(11, mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function1 = (Function1) objRememberedValue3;
                    boolean zChanged3 = composer2.changed(mutableState);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == companion5.getEmpty()) {
                        objRememberedValue4 = new h70(12, mutableState);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    int i6 = ColorPainter.$stable;
                    g12.b(str5, name, modifierFillMaxSize$default, colorPainter, colorPainter, colorPainter, function1, (Function1) objRememberedValue4, null, crop, composer2, (i6 << 9) | RendererCapabilities.DECODER_SUPPORT_MASK | (i6 << 12) | (i6 << 15), 6, 31296);
                    composer2.endNode();
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), companion3.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxHeight$default);
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i7), composerM4318constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    StringBuilder sb = new StringBuilder();
                    if (mediaItem2.getParentIndexNumber() != null && mediaItem2.getIndexNumber() != null) {
                        sb.append(ExifInterface.LATITUDE_SOUTH + mediaItem2.getParentIndexNumber() + ExifInterface.LONGITUDE_EAST + StringsKt__StringsKt.padStart(String.valueOf(mediaItem2.getIndexNumber().intValue()), 3, '0') + " ");
                    }
                    sb.append(mediaItem2.getName());
                    String string = sb.toString();
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme2.getTypography(composer2, i8).getBodyMedium();
                    Color.Companion companion6 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk(string, null, companion6.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 2, 0, null, bodyMedium, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110586);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion3.getTop(), composer2, 6);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i9 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion2);
                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion4, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl5, Integer.valueOf(i9), composerM4318constructorimpl5));
                    Long runTimeTicks = mediaItem2.getRunTimeTicks();
                    if (runTimeTicks == null || runTimeTicks.longValue() == 0) {
                        str = "";
                    } else {
                        long jLongValue = runTimeTicks.longValue() / 10000000;
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue / 60), Long.valueOf(jLongValue % 60)}, 2));
                    }
                    TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(companion6.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i8).getBodySmall(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    List<MediaSource> mediaSources = mediaItem2.getMediaSources();
                    Long size = (mediaSources == null || (mediaSource = (MediaSource) CollectionsKt.firstOrNull((List) mediaSources)) == null) ? null : mediaSource.getSize();
                    if (size == null) {
                        composer2.startReplaceGroup(-385708562);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-385708561);
                        long jLongValue2 = size.longValue();
                        if (jLongValue2 != 0) {
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            str4 = String.format("%.2fG", Arrays.copyOf(new Object[]{Double.valueOf(jLongValue2 / 1.073741824E9d)}, 1));
                        }
                        TextKt.m3048TextNvy7gAk(str4, null, Color.m5151copywmQWz5c$default(companion6.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i8).getBodySmall(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                        Unit unit = Unit.INSTANCE;
                        composer2.endReplaceGroup();
                    }
                    if (i02.w(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                return FutureKt.asDeferred$lambda$5((CompletableDeferred) obj3, obj, (Throwable) obj2);
            case 18:
                State state = (State) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(221943575, iIntValue5, -1, "com.dh.myembyapp.ui.screens.home.ResumeEpisodeCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:3516)");
                    }
                    ImageVector delete = DeleteKt.getDelete(Icons.INSTANCE.getDefault());
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                    boolean zChanged4 = composer3.changed(state);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new p4(state, 4);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    IconKt.m2496Iconww6aTOc(delete, "删除", GraphicsLayerModifierKt.graphicsLayer(modifierM999padding3ABfNKs2, (Function1) objRememberedValue5), Color.INSTANCE.m5189getWhite0d7_KjU(), composer3, 3120, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                return LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$3((TextDragObserver) obj3, (PointerInputChange) obj, (Offset) obj2);
            case 20:
                String str6 = (String) obj;
                String str7 = (String) obj2;
                str6.getClass();
                str7.getClass();
                NavController.navigate$default((NavController) obj3, "detail/" + str6 + "?episodeId=" + str7, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return Unit.INSTANCE;
            case 21:
                return Integer.valueOf(MediaSourcePriorityKt.sortMediaSourcesByPriority$lambda$3((ArrayList) obj3, (Pair) obj, (Pair) obj2));
            case 22:
                return ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17((SheetState) obj3, (IntSize) obj, (Constraints) obj2);
            case 23:
                return MovableContentKt.movableContentOf$lambda$0((MovableContent) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                oh1 oh1Var = (oh1) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1453553817, iIntValue6, -1, "com.dh.myembyapp.ui.screens.player.PlayerPlaybackOverlays.<anonymous>.<anonymous> (PlayerPlaybackContent.kt:464)");
                    }
                    TextKt.m3048TextNvy7gAk(oh1Var.h + "x", PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(10.0f)), Color.INSTANCE.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(30), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 1597872, 0, 262056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                String str8 = (String) obj;
                long jLongValue3 = ((Long) obj2).longValue();
                str8.getClass();
                ((to1) obj3).I(jLongValue3, ya2.b, str8);
                return Unit.INSTANCE;
            case 26:
                return Integer.valueOf(SafeCollector_commonKt.checkContext$lambda$0((SafeCollector) obj3, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            case 27:
                return Boolean.valueOf(Scrollable2DNode.setScrollSemanticsActions$lambda$0((Scrollable2DNode) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            case 28:
                return Boolean.valueOf(ScrollableNode.setScrollSemanticsActions$lambda$0((ScrollableNode) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            default:
                return Integer.valueOf(SelectionRegistrarImpl.sort$lambda$0((LayoutCoordinates) obj3, (Selectable) obj, (Selectable) obj2));
        }
    }
}
