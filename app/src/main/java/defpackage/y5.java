package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;

import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.UserData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class y5 implements Function4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ LazyListState d;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ List g;
    public final /* synthetic */ FocusRequester h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String j;
    public final /* synthetic */ FocusRequester k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Function1 m;

    public y5(List list, String str, String str2, LazyListState lazyListState, CoroutineScope coroutineScope, List list2, FocusRequester focusRequester, boolean z, String str3, FocusRequester focusRequester2, Function2 function2, Function1 function1) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = lazyListState;
        this.e = coroutineScope;
        this.g = list2;
        this.h = focusRequester;
        this.i = z;
        this.j = str3;
        this.k = focusRequester2;
        this.l = function2;
        this.m = function1;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Integer childCount;
        UserData userData;
        String seriesName;
        String primary;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= composer.changed(iIntValue) ? 32 : 16;
        }
        if (composer.shouldExecute((i & Input.Keys.NUMPAD_3) != 146, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            h3 h3Var = (h3) this.a.get(iIntValue);
            composer.startReplaceGroup(654292092);
            MediaItem mediaItem = h3Var.b;
            String id = mediaItem.getId();
            StringBuilder sbZ = kb0.z("favorite:", this.b, ":", this.c, ":");
            sbZ.append(id);
            sbZ.append(":");
            sbZ.append(iIntValue);
            String string = sbZ.toString();
            ImageTags imageTags = mediaItem.getImageTags();
            String strSubstring = "";
            String strN = (imageTags == null || (primary = imageTags.getPrimary()) == null) ? "" : ku.n(h3Var.a, mediaItem.getId(), "Primary", primary, 320);
            MediaItem mediaItem2 = h3Var.b;
            if (Intrinsics.areEqual(mediaItem2.getType(), "Episode") && (seriesName = mediaItem2.getSeriesName()) != null && !StringsKt.isBlank(seriesName)) {
                strSubstring = mediaItem2.getSeriesName();
            } else if (mediaItem2.getProductionYear() != null) {
                strSubstring = String.valueOf(mediaItem2.getProductionYear().intValue());
            } else {
                String premiereDate = mediaItem2.getPremiereDate();
                if (premiereDate != null && !StringsKt.isBlank(premiereDate) && mediaItem2.getPremiereDate().length() >= 4) {
                    strSubstring = mediaItem2.getPremiereDate().substring(0, 4);
                }
            }
            String type = mediaItem.getType();
            if (Intrinsics.areEqual(type, "Series")) {
                UserData userData2 = mediaItem.getUserData();
                if (userData2 == null || (childCount = userData2.getUnplayedItemCount()) == null) {
                    childCount = mediaItem.getChildCount();
                }
            } else if (Intrinsics.areEqual(type, "Season")) {
                childCount = mediaItem.getChildCount();
                if (childCount == null) {
                    UserData userData3 = mediaItem.getUserData();
                    if (userData3 != null) {
                        childCount = userData3.getUnplayedItemCount();
                    } else {
                        childCount = null;
                    }
                }
            } else {
                childCount = mediaItem.getChildCount();
                if (childCount == null) {
                    UserData userData4 = mediaItem.getUserData();
                    if (userData4 != null) {
                        childCount = userData4.getUnplayedItemCount();
                    } else {
                        childCount = null;
                    }
                }
            }
            String name = mediaItem.getName();
            Modifier modifierFocusProperties = Modifier.INSTANCE;
            if (iIntValue == 0) {
                modifierFocusProperties = FocusChangedModifierKt.onFocusChanged(modifierFocusProperties, new g5(this.e, this.d, 0));
            }
            int size = this.g.size();
            boolean z = iIntValue == 0;
            boolean z2 = iIntValue == size - 1;
            FocusRequester focusRequester = this.h;
            if (z || z2 || focusRequester != null) {
                modifierFocusProperties = FocusPropertiesKt.focusProperties(modifierFocusProperties, new m5(focusRequester, z, z2, 0));
            }
            Float communityRating = mediaItem.getCommunityRating();
            boolean z3 = Intrinsics.areEqual(mediaItem.getType(), "Movie") && (userData = mediaItem.getUserData()) != null && userData.getPlayed();
            FocusRequester focusRequester2 = (this.i && Intrinsics.areEqual(string, this.j)) ? this.k : null;
            Function2 function2 = this.l;
            boolean zChanged = composer.changed(function2) | composer.changed(string) | composer.changedInstance(h3Var);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new v5(function2, string, h3Var, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChanged2 = composer.changed(focusRequester);
            Function1 function1 = this.m;
            boolean zChanged3 = zChanged2 | composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new w5(0, focusRequester, function1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            a41.e(name, strN, function0, modifierFocusProperties, strSubstring, childCount, focusRequester2, false, true, communityRating, z3, null, 0.0f, 0L, 0L, (Function1) objRememberedValue2, null, null, composer, 805306368, 0, 455040);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
