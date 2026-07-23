package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;

import com.dh.myembyapp.data.api.RetrofitClient;
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

/* JADX INFO: loaded from: classes4.dex */
public final class fy0 implements Function4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ FocusRequester d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Function1 j;

    public fy0(List list, String str, MutableState mutableState, FocusRequester focusRequester, boolean z, Function1 function1, boolean z2, Function1 function2, Function1 function3) {
        this.a = list;
        this.b = str;
        this.c = mutableState;
        this.d = focusRequester;
        this.e = z;
        this.g = function1;
        this.h = z2;
        this.i = function2;
        this.j = function3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String imageUrl;
        String str;
        UserData userData;
        String primary;
        LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (composer.changed(lazyGridItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= composer.changed(iIntValue) ? 32 : 16;
        }
        boolean z = false;
        if (composer.shouldExecute((i & Input.Keys.NUMPAD_3) != 146, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1117249557, i, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
            }
            MediaItem mediaItem = (MediaItem) this.a.get(iIntValue);
            composer.startReplaceGroup(-1652984161);
            ImageTags imageTags = mediaItem.getImageTags();
            if (imageTags == null || (primary = imageTags.getPrimary()) == null || (imageUrl = RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, 320)) == null) {
                imageUrl = "";
            }
            String str2 = imageUrl;
            Integer productionYear = mediaItem.getProductionYear();
            if (productionYear == null || (strSubstring = String.valueOf(productionYear.intValue())) == null) {
                String premiereDate = mediaItem.getPremiereDate();
                if (premiereDate != null) {
                    if (premiereDate.length() < 4) {
                        premiereDate = null;
                    }
                    if (premiereDate != null) {
                        String strSubstring = premiereDate.substring(0, 4);
                        str = strSubstring;
                    }
                }
                str = null;
            } else {
                str = strSubstring;
            }
            Integer childCount = mediaItem.getChildCount();
            if (childCount == null) {
                UserData userData2 = mediaItem.getUserData();
                childCount = userData2 != null ? userData2.getUnplayedItemCount() : null;
            }
            boolean z2 = ((Boolean) this.c.getValue()).booleanValue() && Intrinsics.areEqual(mediaItem.getId(), this.b);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String name = mediaItem.getName();
            Float communityRating = mediaItem.getCommunityRating();
            if (Intrinsics.areEqual(mediaItem.getType(), "Movie") && (userData = mediaItem.getUserData()) != null && userData.getPlayed()) {
                z = true;
            }
            FocusRequester focusRequester = z2 ? this.d : null;
            boolean zChanged = composer.changed(this.e) | composer.changedInstance(mediaItem) | composer.changed(this.g) | composer.changed(this.h) | composer.changed(this.i) | composer.changed(this.j);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ey0 ey0Var = new ey0(this.e, mediaItem, this.g, this.h, this.i, this.j);
                composer.updateRememberedValue(ey0Var);
                objRememberedValue = ey0Var;
            }
            a41.e(name, str2, (Function0) objRememberedValue, null, str, childCount, focusRequester, false, true, communityRating, z, null, 0.0f, 0L, 0L, null, null, null, composer, 805306368, 0, 520584);
            composer.endNode();
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
