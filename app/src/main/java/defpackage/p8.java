package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.widget.ImageView;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextFieldPressGestureFilterKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1;
import androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.api.DanmakuApiClient;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.DanmakuAnime;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import com.dh.myembyapp.data.model.EpisodeLocator;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.OtherServerResourceSection;
import com.dh.myembyapp.data.model.ProviderIds;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerIconEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p8 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
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
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        long jU;
        int i = this.a;
        ArrayList arrayList = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i2 = 16;
        boolean z = true;
        final int i3 = 0;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                s01.D(str2, str3, str4);
                ((v8) obj5).o.setValue(str2);
                ((Function2) obj4).invoke(str3, str4);
                return Unit.INSTANCE;
            case 1:
                vc vcVar = (vc) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1724388951, iIntValue, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous>.<anonymous> (AppUpdateSupport.kt:579)");
                    }
                    if (((Boolean) vcVar.i.getValue()).booleanValue()) {
                        String str5 = (String) vcVar.l.getValue();
                        str = (str5 == null || StringsKt.isBlank(str5)) ? "下载更新" : "安装更新";
                    } else {
                        str = "知道了";
                    }
                    TextKt.m3048TextNvy7gAk(str, null, hc2.k(jc2.b, ((Boolean) mutableState.getValue()).booleanValue(), false, composer, 6, 4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262138);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                BackupRouteConfig backupRouteConfig = (BackupRouteConfig) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-613165230, iIntValue2, -1, "com.dh.myembyapp.ui.components.BackupRouteManagerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BackupRouteManagerDialog.kt:711)");
                    }
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(9.0f));
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextStyle bodySmall = materialTheme.getTypography(composer2, i5).getBodySmall();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                    }
                    boolean zBooleanValue = ((Boolean) composer2.consume(n72.g)).booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    if (zBooleanValue || !((Boolean) mutableState2.getValue()).booleanValue()) {
                        jU = kb0.u(composer2, 1603037793, materialTheme, composer2, i5);
                    } else {
                        composer2.startReplaceGroup(1602903315);
                        composer2.endReplaceGroup();
                        jU = ColorKt.Color(4279308561L);
                    }
                    TextKt.m3048TextNvy7gAk("仅直连", null, jU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer2, 6, 0, 131066);
                    pi.d(backupRouteConfig.getDirectOnly(), composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                return BufferedChannel.bindCancellationFun$lambda$89((Function1) obj5, obj4, (Throwable) obj, obj2, (CoroutineContext) obj3);
            case 4:
                return ContextMenuUiKt.ContextMenuColumnBuilder$lambda$0((Function1) obj5, (ContextMenuColors) obj4, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                DanmakuAnime danmakuAnime = (DanmakuAnime) obj5;
                String str6 = (String) obj4;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(734566983, iIntValue3, -1, "com.dh.myembyapp.ui.components.AnimeResultItem.<anonymous> (DanmakuSearchDialog.kt:1033)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String animeTitle = danmakuAnime.getAnimeTitle();
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i7 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme2.getTypography(composer3, i7).getBodyLarge();
                    Color.Companion companion5 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk(animeTitle, null, companion5.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyLarge, composer3, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110586);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion3.getCenterVertically(), composer3, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion2);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion4, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i8), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    String typeDescription = danmakuAnime.getTypeDescription();
                    if (typeDescription == null) {
                        typeDescription = "";
                    }
                    List<DanmakuEpisode> episodes = danmakuAnime.getEpisodes();
                    TextKt.m3048TextNvy7gAk(typeDescription + " 共" + (episodes != null ? episodes.size() : 0) + "集", null, companion5.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i7).getBodySmall(), composer3, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    TextKt.m3048TextNvy7gAk(kb0.x("• ", DanmakuApiClient.INSTANCE.getApiDisplayName(str6)), null, ColorKt.Color(4287137928L), null, TextUnitKt.getSp(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i7).getBodySmall(), composer3, 24960, 0, 131050);
                    if (x2.m(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                final bi0 bi0Var = (bi0) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(929916622, iIntValue4, -1, "com.dh.myembyapp.ui.screens.detail.ExternalPlayerAppCard.<anonymous> (DetailScreen.kt:4475)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN5 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(14.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composer4, 54);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierM1000paddingVpY3zN5);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion7, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i9), composerM4318constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion6, Dp.m7813constructorimpl(46.0f));
                    boolean zChangedInstance = composer4.changedInstance(bi0Var);
                    Object objRememberedValue = composer4.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: g60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i10 = i3;
                                bi0 bi0Var2 = bi0Var;
                                switch (i10) {
                                    case 0:
                                        Context context = (Context) obj6;
                                        context.getClass();
                                        ImageView imageView = new ImageView(context);
                                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        imageView.setImageDrawable(bi0Var2.d);
                                        return imageView;
                                    default:
                                        ImageView imageView2 = (ImageView) obj6;
                                        imageView2.getClass();
                                        imageView2.setImageDrawable(bi0Var2.d);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    boolean zChangedInstance2 = composer4.changedInstance(bi0Var);
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final int i10 = z ? 1 : 0;
                        objRememberedValue2 = new Function1() { // from class: g60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i11 = i10;
                                bi0 bi0Var2 = bi0Var;
                                switch (i11) {
                                    case 0:
                                        Context context = (Context) obj6;
                                        context.getClass();
                                        ImageView imageView = new ImageView(context);
                                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        imageView.setImageDrawable(bi0Var2.d);
                                        return imageView;
                                    default:
                                        ImageView imageView2 = (ImageView) obj6;
                                        imageView2.getClass();
                                        imageView2.setImageDrawable(bi0Var2.d);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function1, modifierM1064size3ABfNKs, (Function1) objRememberedValue2, composer4, 48, 0);
                    id.i(12.0f, companion6, composer4, 6);
                    TextKt.m3048TextNvy7gAk(bi0Var.a, null, ((Boolean) mutableState3.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 2, 0, null, TextStyle.m7288copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 24960, 109562);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                va0 va0Var = (va0) obj5;
                List list = (List) obj4;
                MediaItem mediaItem = (MediaItem) obj;
                EpisodeLocator episodeLocator = (EpisodeLocator) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                mediaItem.getClass();
                MutableStateFlow mutableStateFlow = va0Var.j0;
                list.getClass();
                String id = mediaItem.getId();
                String type = mediaItem.getType();
                ProviderIds providerIds = mediaItem.getProviderIds();
                List<String> listBuildAnyProviderIdQueries = providerIds != null ? providerIds.buildAnyProviderIdQueries() : null;
                if (listBuildAnyProviderIdQueries == null) {
                    listBuildAnyProviderIdQueries = CollectionsKt.emptyList();
                }
                List<String> list2 = listBuildAnyProviderIdQueries;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ServerConfig) it.next()).getId());
                }
                za1 za1Var = new za1(id, type, list2, episodeLocator, arrayList2);
                jb1 jb1Var = (jb1) mutableStateFlow.getValue();
                if (zBooleanValue2 || !Intrinsics.areEqual(va0Var.f, za1Var) || !Intrinsics.areEqual(jb1Var.a, mediaItem.getId()) || (jb1Var.b.isEmpty() && jb1Var.c == null)) {
                    long j = va0Var.e + 1;
                    va0Var.e = j;
                    int i11 = 2;
                    if (list.isEmpty()) {
                        va0Var.f = za1Var;
                        mutableStateFlow.setValue(new jb1(mediaItem.getId(), arrayList, "暂无其他已登录服务器", i11));
                    } else if (mediaItem.getProviderIds() == null || mediaItem.getProviderIds().isEmpty()) {
                        va0Var.f = za1Var;
                        mutableStateFlow.setValue(new jb1(mediaItem.getId(), objArr == true ? 1 : 0, "当前资源缺少 TMDB 标识，暂时无法跨服匹配", i11));
                    } else {
                        va0Var.f = za1Var;
                        String id2 = mediaItem.getId();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(new OtherServerResourceSection((ServerConfig) it2.next(), null, true, null, 10, null));
                        }
                        mutableStateFlow.setValue(new jb1(id2, arrayList3, objArr2 == true ? 1 : 0, 4));
                        Iterator it3 = list.iterator();
                        while (true) {
                            int i12 = i3;
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                i3 = i12 + 1;
                                if (i12 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var), null, null, new la0(va0Var, (ServerConfig) next, mediaItem, episodeLocator, j, i12, null), 3, null);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 8:
                return IndicationKt.indication$lambda$1((Indication) obj5, (InteractionSource) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0((MutexImpl) obj5, obj4, (Throwable) obj, obj2, (CoroutineContext) obj3);
            case 10:
                return RouteSerializerKt.generateRouteWithArgs$lambda$5((Map) obj5, (RouteBuilder) obj4, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
            case 11:
                return SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$35$lambda$34((Density) obj5, (Animatable) obj4, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
            case 12:
                return SelectionMagnifierKt.animatedSelectionMagnifier$lambda$0((Function0) obj5, (Function1) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                ServerIconEntry serverIconEntry = (ServerIconEntry) obj5;
                ks1 ks1Var = (ks1) obj4;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1188201681, iIntValue5, -1, "com.dh.myembyapp.ui.components.ServerIconGridItem.<anonymous> (ServerIconDialogs.kt:912)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN6 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null), Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(8.0f));
                    Alignment.Companion companion9 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyP = mr.p(6.0f, Arrangement.INSTANCE, companion9.getCenterHorizontally(), composer5, 54);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i13 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierM1000paddingVpY3zN6);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion10.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor5);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion10, composerM4318constructorimpl5, measurePolicyP, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl5, Integer.valueOf(i13), composerM4318constructorimpl5));
                    Modifier modifierClip = ClipKt.clip(wn.F(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), 1.0f, false, 2, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f)));
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i14 = MaterialTheme.$stable;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierClip, Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composer5, i14).getPrimaryContainer(), 0.52f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getCenter(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i15 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer5, modifierM275backgroundbw27NRU$default);
                    Function0<ComposeUiNode> constructor6 = companion10.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor6);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion10, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl6, Integer.valueOf(i15), composerM4318constructorimpl6));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    bs0 bs0Var = new bs0((Context) composer5.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                    bs0Var.c = serverIconEntry.getUrl();
                    hs0.a(bs0Var, true);
                    bf.b(bs0Var.a(), serverIconEntry.getName(), ks1Var, SizeKt.m1064size3ABfNKs(companion8, Dp.m7813constructorimpl(64.0f)), null, ContentScale.INSTANCE.getFit(), 0.0f, 0, composer5, 12585984, 0, 3952);
                    composer5.endNode();
                    TextKt.m3048TextNvy7gAk(serverIconEntry.getName(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme3.getTypography(composer5, i14).getBodySmall(), composer5, 0, 24960, 110590);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                return SpannableExtensions_androidKt.setFontAttributes$lambda$2((Spannable) obj5, (Function4) obj4, (SpanStyle) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            case 15:
                String str7 = (String) obj5;
                Function1 function2 = (Function1) obj4;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1459410124, iIntValue6, -1, "com.dh.myembyapp.ui.components.SubtitleFontManagerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleFontManagerDialog.kt:159)");
                    }
                    boolean z2 = str7 == null;
                    boolean zChanged = composer6.changed(function2);
                    Object objRememberedValue3 = composer6.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new t4(function2, 15);
                        composer6.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    Object objRememberedValue4 = composer6.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new mu1(i2);
                        composer6.updateRememberedValue(objRememberedValue4);
                    }
                    q32.c("使用系统默认字体", z2, function0, (Function0) objRememberedValue4, composer6, 3078);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                return TabRowKt$ScrollableTabRowImpl$1$scope$1$1.tabIndicatorLayout$lambda$0((Function4) obj5, (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 17:
                return TabRowKt$TabRowImpl$1$scope$1$1.tabIndicatorLayout$lambda$0((Function4) obj5, (TabRowKt$TabRowImpl$1$scope$1$1) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 18:
                return TextFieldPressGestureFilterKt.tapPressTextFieldModifier$lambda$0((Function1) obj5, (MutableInteractionSource) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                String str8 = (String) obj5;
                List<String> list3 = (List) obj4;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1087591288, iIntValue7, -1, "com.dh.myembyapp.ui.components.WebDavPreviewInfoCard.<anonymous> (WebDavSyncDialog.kt:1009)");
                    }
                    Modifier modifierM1000paddingVpY3zN7 = PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(12.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), Alignment.INSTANCE.getStart(), composer7, 6);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i16 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer7, modifierM1000paddingVpY3zN7);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion11.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor7);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer7);
                    mr.z(companion11, composerM4318constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl7, Integer.valueOf(i16), composerM4318constructorimpl7));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i17 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(str8, null, materialTheme4.getColorScheme(composer7, i17).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer7, i17).getTitleSmall(), composer7, 0, 0, 131066);
                    composer7.startReplaceGroup(143246042);
                    for (String str9 : list3) {
                        MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                        int i18 = MaterialTheme.$stable;
                        TextKt.m3048TextNvy7gAk(str9, null, Color.m5151copywmQWz5c$default(materialTheme5.getColorScheme(composer7, i18).getOnSurface(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer7, i18).getBodySmall(), composer7, 0, 0, 131066);
                    }
                    if (i9.s(composer7)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
