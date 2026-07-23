package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.KeyInputModifierKt;

import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.UserData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class tj0 implements Function4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ List g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ CoroutineScope i;
    public final /* synthetic */ FocusRequester j;
    public final /* synthetic */ FocusRequester k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ LazyListState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ FocusRequester o;

    public tj0(List list, boolean z, String str, String str2, String str3, List list2, boolean z2, CoroutineScope coroutineScope, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function1, LazyListState lazyListState, MutableState mutableState, FocusRequester focusRequester3) {
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.g = list2;
        this.h = z2;
        this.i = coroutineScope;
        this.j = focusRequester;
        this.k = focusRequester2;
        this.l = function1;
        this.m = lazyListState;
        this.n = mutableState;
        this.o = focusRequester3;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x0206  */
    /* JADX WARN: Code duplicated, block: B:129:0x020e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0242  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String imageUrl;
        String strSubstring;
        Integer childCount;
        FocusRequester focusRequester;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifier;
        LazyListState lazyListState;
        boolean zChanged2;
        Object objRememberedValue2;
        UserData userData;
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
            MediaItem mediaItem = (MediaItem) this.a.get(iIntValue);
            composer.startReplaceGroup(-1061302015);
            ImageTags imageTags = mediaItem.getImageTags();
            if (imageTags == null || (primary = imageTags.getPrimary()) == null || (imageUrl = RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, 320)) == null) {
                imageUrl = "";
            }
            Integer productionYear = mediaItem.getProductionYear();
            if (productionYear == null || (strSubstring = String.valueOf(productionYear.intValue())) == null) {
                String premiereDate = mediaItem.getPremiereDate();
                if (premiereDate == null) {
                    strSubstring = null;
                } else {
                    if (premiereDate.length() < 4) {
                        premiereDate = null;
                    }
                    if (premiereDate != null) {
                        strSubstring = premiereDate.substring(0, 4);
                    } else {
                        strSubstring = null;
                    }
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
            boolean z = this.b && Intrinsics.areEqual(mediaItem.getId(), this.c) && Intrinsics.areEqual(this.d, this.e);
            Modifier modifierOnPreviewKeyEvent = Modifier.INSTANCE;
            int size = this.g.size();
            boolean z2 = this.h;
            boolean z3 = !z2;
            boolean z4 = iIntValue == 0;
            boolean z5 = iIntValue == size - 1;
            Modifier modifierFocusProperties = (z4 || z5) ? FocusPropertiesKt.focusProperties(modifierOnPreviewKeyEvent, new u50(z4, z3, z5, 1)) : modifierOnPreviewKeyEvent;
            MutableState mutableState = this.n;
            CoroutineScope coroutineScope = this.i;
            if (iIntValue == 0 && z2) {
                composer.startReplaceGroup(-1060127767);
                boolean zChangedInstance = composer.changedInstance(coroutineScope);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new sj0(coroutineScope, mutableState, this.o);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnPreviewKeyEvent, (Function1) objRememberedValue3);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1059337577);
                composer.endReplaceGroup();
            }
            Modifier modifierThen = modifierFocusProperties.then(modifierOnPreviewKeyEvent);
            String name = mediaItem.getName();
            boolean z6 = z;
            Float communityRating = mediaItem.getCommunityRating();
            if (Intrinsics.areEqual(mediaItem.getType(), "Movie") && (userData = mediaItem.getUserData()) != null) {
                boolean z7 = userData.getPlayed();
                if (z6) {
                    focusRequester = this.j;
                } else if (iIntValue == 0) {
                    focusRequester = this.k;
                } else {
                    focusRequester = null;
                }
                Function1 function1 = this.l;
                zChanged = composer.changed(function1) | composer.changedInstance(mediaItem);
                int i2 = i;
                objRememberedValue = composer.rememberedValue();
                if (zChanged) {
                    modifier = modifierThen;
                } else {
                    modifier = modifierThen;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    boolean zChangedInstance2 = ((((i2 & Input.Keys.FORWARD_DEL) ^ 48) <= 32 && composer.changed(iIntValue)) || (i2 & 48) == 32) | composer.changedInstance(coroutineScope);
                    lazyListState = this.m;
                    zChanged2 = zChangedInstance2 | composer.changed(lazyListState);
                    objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new rj0(iIntValue, mutableState, coroutineScope, lazyListState);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    a41.e(name, imageUrl, function0, modifier, strSubstring, childCount, focusRequester, false, true, communityRating, z7, null, 0.0f, 0L, 0L, (Function1) objRememberedValue2, null, null, composer, 805306368, 0, 455040);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                objRememberedValue = new jq(function1, mediaItem, 6);
                composer.updateRememberedValue(objRememberedValue);
                Function0 function2 = (Function0) objRememberedValue;
                boolean zChangedInstance3 = ((((i2 & Input.Keys.FORWARD_DEL) ^ 48) <= 32 && composer.changed(iIntValue)) || (i2 & 48) == 32) | composer.changedInstance(coroutineScope);
                lazyListState = this.m;
                zChanged2 = zChangedInstance3 | composer.changed(lazyListState);
                objRememberedValue2 = composer.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new rj0(iIntValue, mutableState, coroutineScope, lazyListState);
                    composer.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new rj0(iIntValue, mutableState, coroutineScope, lazyListState);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                a41.e(name, imageUrl, function2, modifier, strSubstring, childCount, focusRequester, false, true, communityRating, z7, null, 0.0f, 0L, 0L, (Function1) objRememberedValue2, null, null, composer, 805306368, 0, 455040);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            if (z6) {
                focusRequester = this.j;
            } else if (iIntValue == 0) {
                focusRequester = this.k;
            } else {
                focusRequester = null;
            }
            Function1 function3 = this.l;
            zChanged = composer.changed(function3) | composer.changedInstance(mediaItem);
            int i3 = i;
            objRememberedValue = composer.rememberedValue();
            if (zChanged) {
                modifier = modifierThen;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                Function0 function4 = (Function0) objRememberedValue;
                boolean zChangedInstance4 = ((((i3 & Input.Keys.FORWARD_DEL) ^ 48) <= 32 && composer.changed(iIntValue)) || (i3 & 48) == 32) | composer.changedInstance(coroutineScope);
                lazyListState = this.m;
                zChanged2 = zChangedInstance4 | composer.changed(lazyListState);
                objRememberedValue2 = composer.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new rj0(iIntValue, mutableState, coroutineScope, lazyListState);
                    composer.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new rj0(iIntValue, mutableState, coroutineScope, lazyListState);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                a41.e(name, imageUrl, function4, modifier, strSubstring, childCount, focusRequester, false, true, communityRating, z7, null, 0.0f, 0L, 0L, (Function1) objRememberedValue2, null, null, composer, 805306368, 0, 455040);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                modifier = modifierThen;
            }
            objRememberedValue = new jq(function3, mediaItem, 6);
            composer.updateRememberedValue(objRememberedValue);
            Function0 function5 = (Function0) objRememberedValue;
            boolean zChangedInstance5 = ((((i3 & Input.Keys.FORWARD_DEL) ^ 48) <= 32 && composer.changed(iIntValue)) || (i3 & 48) == 32) | composer.changedInstance(coroutineScope);
            lazyListState = this.m;
            zChanged2 = zChangedInstance5 | composer.changed(lazyListState);
            objRememberedValue2 = composer.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new rj0(iIntValue, mutableState, coroutineScope, lazyListState);
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new rj0(iIntValue, mutableState, coroutineScope, lazyListState);
                composer.updateRememberedValue(objRememberedValue2);
            }
            a41.e(name, imageUrl, function5, modifier, strSubstring, childCount, focusRequester, false, true, communityRating, z7, null, 0.0f, 0L, 0L, (Function1) objRememberedValue2, null, null, composer, 805306368, 0, 455040);
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
