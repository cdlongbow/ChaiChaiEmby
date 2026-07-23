package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.LiveTvKt;
import androidx.compose.material.icons.filled.MovieKt;
import androidx.compose.material.icons.filled.VideoLibraryKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.key.KeyInputModifierKt;

import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.DanmakuAnime;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.UserData;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oi implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ oi(List list, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = list;
        this.e = obj;
        this.g = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:231:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:233:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:234:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:236:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:237:0x04bc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws UnsupportedEncodingException {
        int i;
        int i2;
        String imageUrl;
        String primary;
        String type;
        String type2;
        UserData userData;
        int i3;
        DanmakuAnime danmakuAnime;
        String str;
        int i4;
        int i5;
        ImageVector liveTv;
        int i6 = this.a;
        List list = this.b;
        boolean z = true;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.g;
        Object obj8 = this.e;
        switch (i6) {
            case 0:
                boolean z2 = true;
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj5;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= composer.changed(iIntValue) ? 32 : 16;
                }
                if ((i & Input.Keys.NUMPAD_3) == 146) {
                    z2 = false;
                }
                if (composer.shouldExecute(z2, i & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    BackupRouteConfig backupRouteConfig = (BackupRouteConfig) list.get(iIntValue);
                    composer.startReplaceGroup(-1190386958);
                    boolean zContains = ((Set) obj8).contains(backupRouteConfig.getId());
                    String id = backupRouteConfig.getId();
                    BackupRouteConfig backupRouteConfig2 = (BackupRouteConfig) CollectionsKt.firstOrNull(((ch) obj7).b);
                    Modifier modifierFocusRequester = Intrinsics.areEqual(id, backupRouteConfig2 != null ? backupRouteConfig2.getId() : null) ? FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, (FocusRequester) obj6) : Modifier.INSTANCE;
                    boolean zChanged = composer.changed(function1) | composer.changed(backupRouteConfig);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ni(0, function1, backupRouteConfig);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    pi.g(backupRouteConfig, zContains, modifierFocusRequester, (Function0) objRememberedValue, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                LazyItemScope lazyItemScope2 = (LazyItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                Function1 function2 = (Function1) obj5;
                List list2 = (List) obj8;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (composer2.changed(lazyItemScope2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if (composer2.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    MediaItem mediaItem = (MediaItem) list.get(iIntValue3);
                    composer2.startReplaceGroup(-871084792);
                    String id2 = mediaItem.getId();
                    ImageTags imageTags = mediaItem.getImageTags();
                    boolean zChanged2 = composer2.changed(id2) | composer2.changed(imageTags != null ? imageTags.getPrimary() : null);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        ImageTags imageTags2 = mediaItem.getImageTags();
                        if (imageTags2 == null || (primary = imageTags2.getPrimary()) == null || (imageUrl = RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, 320)) == null) {
                            imageUrl = "";
                        }
                        objRememberedValue2 = imageUrl;
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    String str2 = (String) objRememberedValue2;
                    boolean zChanged3 = composer2.changed(mediaItem.getType()) | composer2.changed(mediaItem.getRecursiveItemCount()) | composer2.changed(mediaItem.getChildCount());
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        if (Intrinsics.areEqual(mediaItem.getType(), "Series")) {
                            Integer recursiveItemCount = mediaItem.getRecursiveItemCount();
                            if (recursiveItemCount == null) {
                                recursiveItemCount = mediaItem.getChildCount();
                            }
                            objRememberedValue3 = recursiveItemCount;
                        } else {
                            objRememberedValue3 = null;
                        }
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Integer num = (Integer) objRememberedValue3;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChangedInstance = ((((i2 & Input.Keys.FORWARD_DEL) ^ 48) > 32 && composer2.changed(iIntValue3)) || (i2 & 48) == 32) | composer2.changedInstance(list2);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new kq(iIntValue3, list2);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion, (Function1) objRememberedValue4);
                    String name = mediaItem.getName();
                    Integer productionYear = mediaItem.getProductionYear();
                    if (productionYear == null || (type2 = String.valueOf(productionYear.intValue())) == null) {
                        String premiereDate = mediaItem.getPremiereDate();
                        if (premiereDate == null) {
                            type = mediaItem.getType();
                            if (Intrinsics.areEqual(type, "Movie")) {
                                type2 = "电影";
                            } else if (Intrinsics.areEqual(type, "Series")) {
                                type2 = "剧集";
                            } else {
                                type2 = mediaItem.getType();
                            }
                        } else {
                            if (premiereDate.length() < 4) {
                                premiereDate = null;
                            }
                            if (premiereDate != null) {
                                type2 = premiereDate.substring(0, 4);
                            } else {
                                type = mediaItem.getType();
                                if (Intrinsics.areEqual(type, "Movie")) {
                                    type2 = "电影";
                                } else if (Intrinsics.areEqual(type, "Series")) {
                                    type2 = "剧集";
                                } else {
                                    type2 = mediaItem.getType();
                                }
                            }
                        }
                    }
                    String str3 = type2;
                    Float communityRating = mediaItem.getCommunityRating();
                    boolean z3 = Intrinsics.areEqual(mediaItem.getType(), "Movie") && (userData = mediaItem.getUserData()) != null && userData.getPlayed();
                    Color.Companion companion2 = Color.INSTANCE;
                    long jM5189getWhite0d7_KjU = companion2.m5189getWhite0d7_KjU();
                    long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null);
                    long jM5189getWhite0d7_KjU2 = companion2.m5189getWhite0d7_KjU();
                    FocusRequester focusRequester = Intrinsics.areEqual(mediaItem.getId(), (String) obj7) ? (FocusRequester) obj6 : null;
                    boolean zChanged4 = composer2.changed(function2) | composer2.changedInstance(mediaItem);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new jq(function2, mediaItem, 0);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    a41.e(name, str2, (Function0) objRememberedValue5, modifierOnPreviewKeyEvent, str3, num, focusRequester, false, true, communityRating, z3, Color.m5142boximpl(jM5189getWhite0d7_KjU2), 0.0f, jM5189getWhite0d7_KjU, jM5151copywmQWz5c$default, null, null, null, composer2, 805306368, 221568, 467328);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                LazyItemScope lazyItemScope3 = (LazyItemScope) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (composer3.changed(lazyItemScope3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= composer3.changed(iIntValue5) ? 32 : 16;
                }
                if (composer3.shouldExecute((i3 & Input.Keys.NUMPAD_3) != 146, i3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    Pair pair = (Pair) list.get(iIntValue5);
                    composer3.startReplaceGroup(1514868555);
                    DanmakuAnime danmakuAnime2 = (DanmakuAnime) pair.component1();
                    String str4 = (String) pair.component2();
                    boolean z4 = ((Number) ((MutableState) obj7).getValue()).intValue() == iIntValue5 && ((DanmakuAnime) ((MutableState) obj6).getValue()) == null;
                    if ((((i3 & Input.Keys.FORWARD_DEL) ^ 48) <= 32 || !composer3.changed(iIntValue5)) && (i3 & 48) != 32) {
                        z = false;
                    }
                    boolean zChangedInstance2 = composer3.changedInstance(danmakuAnime2) | z | composer3.changed(str4) | composer3.changed((String) obj8);
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new iy(iIntValue5, danmakuAnime2, str4, (String) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj5);
                        danmakuAnime = danmakuAnime2;
                        str = str4;
                        composer3.updateRememberedValue(objRememberedValue6);
                    } else {
                        str = str4;
                        danmakuAnime = danmakuAnime2;
                    }
                    qy.a(danmakuAnime, str, z4, (Function0) objRememberedValue6, composer3, 0);
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 3:
                LazyItemScope lazyItemScope4 = (LazyItemScope) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                Function2 function3 = (Function2) obj5;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (composer4.changed(lazyItemScope4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= composer4.changed(iIntValue7) ? 32 : 16;
                }
                if (composer4.shouldExecute((i4 & Input.Keys.NUMPAD_3) != 146, i4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039820996, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    ya1 ya1Var = (ya1) list.get(iIntValue7);
                    composer4.startReplaceGroup(-2086925420);
                    ServerConfig serverConfig = ya1Var.a;
                    OtherServerResourceMatch otherServerResourceMatch = ya1Var.b;
                    String str5 = (String) obj8;
                    String id3 = serverConfig.getId();
                    String id4 = otherServerResourceMatch.getItem().getId();
                    MediaSource mediaSource = otherServerResourceMatch.getMediaSource();
                    boolean zAreEqual = Intrinsics.areEqual(str5, id3 + ":" + id4 + ":" + (mediaSource != null ? mediaSource.getId() : null));
                    boolean zAreEqual2 = Intrinsics.areEqual(serverConfig.getId(), (String) obj7);
                    int i7 = iIntValue7 + 1;
                    FocusRequester focusRequester2 = zAreEqual ? (FocusRequester) obj6 : null;
                    boolean zChanged5 = composer4.changed(function3) | composer4.changedInstance(serverConfig) | composer4.changedInstance(otherServerResourceMatch);
                    Object objRememberedValue7 = composer4.rememberedValue();
                    if (zChanged5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new n90(function3, serverConfig, otherServerResourceMatch, 0);
                        composer4.updateRememberedValue(objRememberedValue7);
                    }
                    u90.m0(serverConfig, otherServerResourceMatch, zAreEqual2, i7, focusRequester2, (Function0) objRememberedValue7, composer4, 0);
                    composer4.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScope lazyItemScope5 = (LazyItemScope) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                Function2 function4 = (Function2) obj5;
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (composer5.changed(lazyItemScope5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= composer5.changed(iIntValue9) ? 32 : 16;
                }
                if (composer5.shouldExecute((i5 & Input.Keys.NUMPAD_3) != 146, i5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    Library library = (Library) list.get(iIntValue9);
                    composer5.startReplaceGroup(1705659389);
                    boolean z5 = !((Set) obj8).contains(library.getId());
                    boolean zChanged6 = composer5.changed(library.getCollectionType());
                    Object objRememberedValue8 = composer5.rememberedValue();
                    if (zChanged6 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        String collectionType = library.getCollectionType();
                        if (Intrinsics.areEqual(collectionType, "movies")) {
                            liveTv = MovieKt.getMovie(Icons.INSTANCE.getDefault());
                        } else {
                            liveTv = Intrinsics.areEqual(collectionType, "tvshows") ? LiveTvKt.getLiveTv(Icons.INSTANCE.getDefault()) : VideoLibraryKt.getVideoLibrary(Icons.INSTANCE.getDefault());
                        }
                        objRememberedValue8 = liveTv;
                        composer5.updateRememberedValue(objRememberedValue8);
                    }
                    ImageVector imageVector = (ImageVector) objRememberedValue8;
                    String name2 = library.getName();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierThen = companion3.then(Intrinsics.areEqual(library.getId(), (String) obj7) ? FocusRequesterModifierKt.focusRequester(companion3, (FocusRequester) obj6) : companion3);
                    boolean zChanged7 = composer5.changed(function4) | composer5.changed(library) | composer5.changed(z5);
                    Object objRememberedValue9 = composer5.rememberedValue();
                    if (zChanged7 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new ez0(z5, function4, 0, library);
                        composer5.updateRememberedValue(objRememberedValue9);
                    }
                    fz0.b(name2, imageVector, z5, (Function0) objRememberedValue9, modifierThen, composer5, 0);
                    composer5.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
