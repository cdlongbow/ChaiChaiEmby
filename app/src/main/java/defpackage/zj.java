package defpackage;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.util.Objects;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zj(int i, MutableState mutableState, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long onSurfaceVariant;
        int i = this.a;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4((Modifier) obj6, (MutableState) obj3, (Function2) obj5, (BasicTextContextMenuProvider) obj4, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                Function4 function4 = (Function4) obj6;
                ServerConfig serverConfig = (ServerConfig) obj;
                OtherServerResourceMatch otherServerResourceMatch = (OtherServerResourceMatch) obj2;
                serverConfig.getClass();
                otherServerResourceMatch.getClass();
                Boolean bool = Boolean.FALSE;
                ((MutableState) obj3).setValue(bool);
                ((MutableState) obj5).setValue(bool);
                ((MutableState) obj4).setValue(null);
                String id = serverConfig.getId();
                String id2 = otherServerResourceMatch.getItem().getId();
                String matchedEpisodeId = otherServerResourceMatch.getMatchedEpisodeId();
                MediaSource mediaSource = otherServerResourceMatch.getMediaSource();
                function4.invoke(id, id2, matchedEpisodeId, mediaSource != null ? mediaSource.getId() : null);
                return Unit.INSTANCE;
            case 2:
                zq0 zq0Var = (zq0) obj6;
                Function1 function1 = (Function1) obj5;
                Function1 function2 = (Function1) obj4;
                MutableState mutableState = (MutableState) obj3;
                MediaItem mediaItem = (MediaItem) obj;
                String str = (String) obj2;
                mediaItem.getClass();
                str.getClass();
                mediaItem.getId();
                mediaItem.getType();
                Objects.toString((rn0) mutableState.getValue());
                zq0Var.P((rn0) mutableState.getValue());
                zq0.O(zq0Var, mediaItem.getId(), str, sn0.c, 12);
                if (StringsKt__StringsJVMKt.equals(mediaItem.getType(), "BoxSet", true)) {
                    String id3 = mediaItem.getId();
                    if (function1 != null) {
                        function1.invoke(id3);
                    } else {
                        function2.invoke(id3);
                    }
                } else {
                    function2.invoke(mediaItem.getId());
                }
                return Unit.INSTANCE;
            case 3:
                zq0 zq0Var2 = (zq0) obj3;
                Function2 function3 = (Function2) obj5;
                Function1 function5 = (Function1) obj4;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                ServerConfig serverById = ((ServerPreferences) obj6).getServerById(str2);
                ServerConfig effectiveServerConfig = serverById != null ? serverById.getEffectiveServerConfig() : null;
                if (effectiveServerConfig == null || !effectiveServerConfig.isLoggedIn()) {
                    Log.e("HomeScreen", "Aggregate search click failed: invalid serverId=".concat(str2));
                } else {
                    String accessToken = effectiveServerConfig.getAccessToken();
                    String userId = effectiveServerConfig.getUserId();
                    if (accessToken == null || StringsKt.isBlank(accessToken) || userId == null || StringsKt.isBlank(userId)) {
                        Log.e("HomeScreen", "Aggregate search click failed: missing auth for serverId=".concat(str2));
                    } else {
                        zq0Var2.P(rn0.c);
                        zq0.O(zq0Var2, str3, "搜索", null, 28);
                        if (function3 != null) {
                            function3.invoke(effectiveServerConfig.getId(), str3);
                        } else {
                            function5.invoke(str3);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 4:
                String str4 = (String) obj6;
                Function1 function6 = (Function1) obj5;
                FocusRequester focusRequester = (FocusRequester) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 1;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600286351, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.SearchBar.<anonymous> (SearchPage.kt:485)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1001paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageVector search = SearchKt.getSearch(Icons.INSTANCE.getDefault());
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        composer.startReplaceGroup(1579694700);
                        onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1579775269);
                        onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant();
                        composer.endReplaceGroup();
                    }
                    IconKt.m2496Iconww6aTOc(search, (String) null, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(24.0f)), onSurfaceVariant, composer, 432, 0);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(12.0f)), composer, 6);
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), focusRequester);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new li1(18, mutableState2);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    yc2.b(str4, function6, modifierOnFocusChanged, false, new TextStyle(materialTheme.getColorScheme(composer, i4).getOnSurface(), TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new SolidColor(materialTheme.getColorScheme(composer, i4).getOnSurface(), null), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1345990845, true, new rb1(str4, i2), composer, 54), composer, 100663296, RendererCapabilities.DECODER_SUPPORT_MASK, 3784);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ServerConfig serverConfig2 = (ServerConfig) obj6;
                hy1 hy1Var = (hy1) obj5;
                Function1 function7 = (Function1) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                BackupRouteConfig backupRouteConfig = (BackupRouteConfig) obj;
                List list = (List) obj2;
                list.getClass();
                ServerConfig serverConfigCopy$default = ServerConfig.copy$default(serverConfig2, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, false, false, false, false, list, backupRouteConfig != null ? backupRouteConfig.getId() : null, null, null, 0L, 3801087, null);
                hy1Var.g(serverConfigCopy$default);
                mutableState3.setValue(null);
                function7.invoke(serverConfigCopy$default.getEffectiveServerConfig());
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ zj(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
