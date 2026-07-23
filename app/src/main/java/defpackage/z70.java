package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;

import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.PersonInfo;
import com.dh.myembyapp.data.model.UserData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z70 implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function i;

    public z70(List list, List list2, Map map, boolean z, String str, Function1 function1, Function3 function3) {
        this.a = 2;
        this.b = list;
        this.e = list2;
        this.g = map;
        this.c = z;
        this.d = str;
        this.h = function1;
        this.i = function3;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x022e  */
    /* JADX WARN: Code duplicated, block: B:138:0x026d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0294  */
    /* JADX WARN: Code duplicated, block: B:143:0x029b  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x0300  */
    /* JADX WARN: Code duplicated, block: B:163:0x032c  */
    /* JADX WARN: Code duplicated, block: B:171:0x034e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0386  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:184:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:231:0x0491  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String imageUrl;
        String strSubstring;
        String str;
        Modifier modifierFocusProperties;
        String primary;
        int i2;
        String imageUrl2;
        String str2;
        Integer num;
        Integer childCount;
        Modifier modifierFocusProperties2;
        boolean zChanged;
        Object objRememberedValue;
        boolean z;
        boolean z2;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean zChanged3;
        Object objRememberedValue3;
        UserData userData;
        boolean zChanged4;
        Object objRememberedValue4;
        String primary2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zChanged5;
        Object objRememberedValue5;
        Function0 function0;
        boolean zChanged6;
        Object objRememberedValue6;
        int i4 = this.a;
        String str3 = this.d;
        boolean z6 = this.c;
        Map map = this.g;
        List list = this.b;
        Function function = this.i;
        int i5 = -1;
        List list2 = this.e;
        Function1 function1 = this.h;
        switch (i4) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function1 function2 = (Function1) function;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    MediaItem mediaItem = (MediaItem) list.get(iIntValue);
                    composer.startReplaceGroup(1094456862);
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
                    Integer childCount2 = mediaItem.getChildCount();
                    if (childCount2 == null) {
                        childCount2 = mediaItem.getRecursiveItemCount();
                    }
                    if (iIntValue == 0) {
                        composer.startReplaceGroup(1143696536);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        str = imageUrl;
                        boolean zChanged7 = ((((i & Input.Keys.FORWARD_DEL) ^ 48) > 32 && composer.changed(iIntValue)) || (i & 48) == 32) | composer.changed(z6) | composer.changedInstance(mediaItem) | composer.changed(str3) | composer.changedInstance(list2);
                        Object objRememberedValue7 = composer.rememberedValue();
                        if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new w70(this.c, mediaItem, this.d, iIntValue, this.e);
                            composer.updateRememberedValue(objRememberedValue7);
                        }
                        modifierFocusProperties = FocusPropertiesKt.focusProperties(companion, (Function1) objRememberedValue7);
                        composer.endReplaceGroup();
                    } else {
                        str = imageUrl;
                        if (iIntValue == CollectionsKt.getLastIndex(list2)) {
                            composer.startReplaceGroup(1143708813);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            boolean zChanged8 = composer.changed(z6) | composer.changedInstance(mediaItem) | composer.changed(str3);
                            Object objRememberedValue8 = composer.rememberedValue();
                            if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new x70(z6, mediaItem, str3);
                                composer.updateRememberedValue(objRememberedValue8);
                            }
                            modifierFocusProperties = FocusPropertiesKt.focusProperties(companion2, (Function1) objRememberedValue8);
                            composer.endReplaceGroup();
                        } else if (!z6 || Intrinsics.areEqual(mediaItem.getId(), str3)) {
                            composer.startReplaceGroup(1143720630);
                            composer.endReplaceGroup();
                            modifierFocusProperties = Modifier.INSTANCE;
                        } else {
                            composer.startReplaceGroup(1143718578);
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Object objRememberedValue9 = composer.rememberedValue();
                            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = y70.b;
                                composer.updateRememberedValue(objRememberedValue9);
                            }
                            modifierFocusProperties = FocusPropertiesKt.focusProperties(companion3, (Function1) objRememberedValue9);
                            composer.endReplaceGroup();
                        }
                    }
                    Modifier modifier = modifierFocusProperties;
                    String name = mediaItem.getName();
                    Float communityRating = mediaItem.getCommunityRating();
                    FocusRequester focusRequester = (FocusRequester) map.get(mediaItem.getId());
                    boolean z7 = !z6 || Intrinsics.areEqual(mediaItem.getId(), str3);
                    Color.Companion companion4 = Color.INSTANCE;
                    long jM5189getWhite0d7_KjU = companion4.m5189getWhite0d7_KjU();
                    long jM5189getWhite0d7_KjU2 = companion4.m5189getWhite0d7_KjU();
                    long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null);
                    boolean zChanged9 = composer.changed(function1) | composer.changedInstance(mediaItem);
                    Object objRememberedValue10 = composer.rememberedValue();
                    if (zChanged9 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new jq(function1, mediaItem, 1);
                        composer.updateRememberedValue(objRememberedValue10);
                    }
                    Function0 function3 = (Function0) objRememberedValue10;
                    Color colorM5142boximpl = Color.m5142boximpl(jM5189getWhite0d7_KjU);
                    boolean zChanged10 = composer.changed(function2) | composer.changedInstance(mediaItem);
                    Object objRememberedValue11 = composer.rememberedValue();
                    if (zChanged10 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new v70(function2, mediaItem, 0);
                        composer.updateRememberedValue(objRememberedValue11);
                    }
                    a41.e(name, str, function3, modifier, strSubstring, childCount2, focusRequester, z7, true, communityRating, false, colorM5142boximpl, 0.0f, jM5189getWhite0d7_KjU2, jM5151copywmQWz5c$default, (Function1) objRememberedValue11, null, null, composer, 805306368, 221568, 403712);
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
                Function1 function4 = (Function1) function;
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
                    MediaItem mediaItem2 = (MediaItem) list.get(iIntValue3);
                    composer2.startReplaceGroup(948972305);
                    ImageTags imageTags2 = mediaItem2.getImageTags();
                    if (imageTags2 == null || (primary2 = imageTags2.getPrimary()) == null || (imageUrl2 = RetrofitClient.INSTANCE.getImageUrl(mediaItem2.getId(), "Primary", primary2, 320)) == null) {
                        imageUrl2 = "";
                    }
                    String str4 = imageUrl2;
                    Integer productionYear2 = mediaItem2.getProductionYear();
                    if (productionYear2 == null || (strSubstring = String.valueOf(productionYear2.intValue())) == null) {
                        String premiereDate2 = mediaItem2.getPremiereDate();
                        if (premiereDate2 != null) {
                            if (premiereDate2.length() < 4) {
                                premiereDate2 = null;
                            }
                            if (premiereDate2 != null) {
                                String strSubstring2 = premiereDate2.substring(0, 4);
                                str2 = strSubstring2;
                            }
                        }
                        str2 = null;
                    } else {
                        str2 = strSubstring2;
                    }
                    String type = mediaItem2.getType();
                    if (Intrinsics.areEqual(type, "Series")) {
                        childCount = mediaItem2.getRecursiveItemCount();
                    } else {
                        if (Intrinsics.areEqual(type, "Season")) {
                            childCount = mediaItem2.getChildCount();
                        } else {
                            num = null;
                        }
                        if (iIntValue3 == 0) {
                            composer2.startReplaceGroup(949462073);
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            zChanged4 = ((((i2 & Input.Keys.FORWARD_DEL) ^ 48) <= 32 && composer2.changed(iIntValue3)) || (i2 & 48) == 32) | composer2.changed(z6) | composer2.changedInstance(mediaItem2) | composer2.changed(str3) | composer2.changedInstance(list2);
                            objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new q90(this.c, mediaItem2, this.d, iIntValue3, this.e);
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            modifierFocusProperties2 = FocusPropertiesKt.focusProperties(companion5, (Function1) objRememberedValue4);
                            composer2.endReplaceGroup();
                        } else if (iIntValue3 == CollectionsKt.getLastIndex(list2)) {
                            composer2.startReplaceGroup(949869444);
                            Modifier.Companion companion6 = Modifier.INSTANCE;
                            zChanged = composer2.changed(z6) | composer2.changedInstance(mediaItem2) | composer2.changed(str3);
                            objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new r90(z6, mediaItem2, str3);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            modifierFocusProperties2 = FocusPropertiesKt.focusProperties(companion6, (Function1) objRememberedValue);
                            composer2.endReplaceGroup();
                        } else if (z6 || Intrinsics.areEqual(mediaItem2.getId(), str3)) {
                            composer2.startReplaceGroup(950264260);
                            composer2.endReplaceGroup();
                            modifierFocusProperties2 = Modifier.INSTANCE;
                        } else {
                            composer2.startReplaceGroup(950175135);
                            Modifier.Companion companion7 = Modifier.INSTANCE;
                            Object objRememberedValue12 = composer2.rememberedValue();
                            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue12 = y70.c;
                                composer2.updateRememberedValue(objRememberedValue12);
                            }
                            modifierFocusProperties2 = FocusPropertiesKt.focusProperties(companion7, (Function1) objRememberedValue12);
                            composer2.endReplaceGroup();
                        }
                        Modifier modifier2 = modifierFocusProperties2;
                        String name2 = mediaItem2.getName();
                        FocusRequester focusRequester2 = (FocusRequester) map.get(mediaItem2.getId());
                        if (z6 || Intrinsics.areEqual(mediaItem2.getId(), str3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Float communityRating2 = mediaItem2.getCommunityRating();
                        if (Intrinsics.areEqual(mediaItem2.getType(), "Movie") || (userData = mediaItem2.getUserData()) == null || !userData.getPlayed()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        Color.Companion companion8 = Color.INSTANCE;
                        long jM5189getWhite0d7_KjU3 = companion8.m5189getWhite0d7_KjU();
                        long jM5189getWhite0d7_KjU4 = companion8.m5189getWhite0d7_KjU();
                        long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(companion8.m5189getWhite0d7_KjU(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null);
                        zChanged2 = composer2.changed(function1) | composer2.changedInstance(mediaItem2);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new jq(function1, mediaItem2, 4);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function5 = (Function0) objRememberedValue2;
                        Color colorM5142boximpl2 = Color.m5142boximpl(jM5189getWhite0d7_KjU3);
                        zChanged3 = composer2.changed(function4) | composer2.changedInstance(mediaItem2);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new v70(function4, mediaItem2, 1);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        a41.e(name2, str4, function5, modifier2, str2, num, focusRequester2, z, true, communityRating2, z2, colorM5142boximpl2, 0.0f, jM5189getWhite0d7_KjU4, jM5151copywmQWz5c$default2, (Function1) objRememberedValue3, null, null, composer2, 805306368, 221568, 401664);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    num = childCount;
                    if (iIntValue3 == 0) {
                        composer2.startReplaceGroup(949462073);
                        Modifier.Companion companion9 = Modifier.INSTANCE;
                        zChanged4 = ((((i2 & Input.Keys.FORWARD_DEL) ^ 48) <= 32 && composer2.changed(iIntValue3)) || (i2 & 48) == 32) | composer2.changed(z6) | composer2.changedInstance(mediaItem2) | composer2.changed(str3) | composer2.changedInstance(list2);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged4) {
                            objRememberedValue4 = new q90(this.c, mediaItem2, this.d, iIntValue3, this.e);
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new q90(this.c, mediaItem2, this.d, iIntValue3, this.e);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        modifierFocusProperties2 = FocusPropertiesKt.focusProperties(companion9, (Function1) objRememberedValue4);
                        composer2.endReplaceGroup();
                    } else if (iIntValue3 == CollectionsKt.getLastIndex(list2)) {
                        composer2.startReplaceGroup(949869444);
                        Modifier.Companion companion10 = Modifier.INSTANCE;
                        zChanged = composer2.changed(z6) | composer2.changedInstance(mediaItem2) | composer2.changed(str3);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new r90(z6, mediaItem2, str3);
                            composer2.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new r90(z6, mediaItem2, str3);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        modifierFocusProperties2 = FocusPropertiesKt.focusProperties(companion10, (Function1) objRememberedValue);
                        composer2.endReplaceGroup();
                    } else if (z6) {
                        composer2.startReplaceGroup(950264260);
                        composer2.endReplaceGroup();
                        modifierFocusProperties2 = Modifier.INSTANCE;
                    } else {
                        composer2.startReplaceGroup(950264260);
                        composer2.endReplaceGroup();
                        modifierFocusProperties2 = Modifier.INSTANCE;
                    }
                    Modifier modifier3 = modifierFocusProperties2;
                    String name3 = mediaItem2.getName();
                    FocusRequester focusRequester3 = (FocusRequester) map.get(mediaItem2.getId());
                    if (z6) {
                        z = true;
                    } else {
                        z = true;
                    }
                    Float communityRating3 = mediaItem2.getCommunityRating();
                    if (Intrinsics.areEqual(mediaItem2.getType(), "Movie")) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    Color.Companion companion11 = Color.INSTANCE;
                    long jM5189getWhite0d7_KjU5 = companion11.m5189getWhite0d7_KjU();
                    long jM5189getWhite0d7_KjU6 = companion11.m5189getWhite0d7_KjU();
                    long jM5151copywmQWz5c$default3 = Color.m5151copywmQWz5c$default(companion11.m5189getWhite0d7_KjU(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null);
                    zChanged2 = composer2.changed(function1) | composer2.changedInstance(mediaItem2);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new jq(function1, mediaItem2, 4);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new jq(function1, mediaItem2, 4);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function6 = (Function0) objRememberedValue2;
                    Color colorM5142boximpl3 = Color.m5142boximpl(jM5189getWhite0d7_KjU5);
                    zChanged3 = composer2.changed(function4) | composer2.changedInstance(mediaItem2);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new v70(function4, mediaItem2, 1);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new v70(function4, mediaItem2, 1);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    a41.e(name3, str4, function6, modifier3, str2, num, focusRequester3, z, true, communityRating3, z2, colorM5142boximpl3, 0.0f, jM5189getWhite0d7_KjU6, jM5151copywmQWz5c$default3, (Function1) objRememberedValue3, null, null, composer2, 805306368, 221568, 401664);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScope lazyItemScope3 = (LazyItemScope) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                Function3 function7 = (Function3) function;
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
                        ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    PersonInfo personInfo = (PersonInfo) list.get(iIntValue5);
                    composer3.startReplaceGroup(-1014841344);
                    Iterator it = list2.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((PersonInfo) it.next()).getId(), personInfo.getId())) {
                            i5 = i6;
                            FocusRequester focusRequester4 = (FocusRequester) map.get(personInfo.getId());
                            if (z6 || Intrinsics.areEqual(personInfo.getId(), str3)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (i5 == 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (i5 == CollectionsKt.getLastIndex(list2)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            zChanged5 = composer3.changed(function1) | composer3.changed(personInfo);
                            objRememberedValue5 = composer3.rememberedValue();
                            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new w5(function1, personInfo);
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            Function1 function8 = (Function1) objRememberedValue5;
                            if (function7 != null) {
                                composer3.startReplaceGroup(-1014220446);
                                zChanged6 = composer3.changed(function7) | composer3.changed(personInfo);
                                objRememberedValue6 = composer3.rememberedValue();
                                if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new ni(3, function7, personInfo);
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                composer3.endReplaceGroup();
                                function0 = (Function0) objRememberedValue6;
                            } else {
                                composer3.startReplaceGroup(-1014108661);
                                composer3.endReplaceGroup();
                                function0 = null;
                            }
                            u90.a(personInfo, focusRequester4, z3, z4, z5, function8, function0, composer3, 0);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            i6++;
                        }
                    }
                    FocusRequester focusRequester5 = (FocusRequester) map.get(personInfo.getId());
                    if (z6) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (i5 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i5 == CollectionsKt.getLastIndex(list2)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zChanged5 = composer3.changed(function1) | composer3.changed(personInfo);
                    objRememberedValue5 = composer3.rememberedValue();
                    if (zChanged5) {
                        objRememberedValue5 = new w5(function1, personInfo);
                        composer3.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new w5(function1, personInfo);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    Function1 function9 = (Function1) objRememberedValue5;
                    if (function7 != null) {
                        composer3.startReplaceGroup(-1014220446);
                        zChanged6 = composer3.changed(function7) | composer3.changed(personInfo);
                        objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged6) {
                            objRememberedValue6 = new ni(3, function7, personInfo);
                            composer3.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new ni(3, function7, personInfo);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceGroup();
                        function0 = (Function0) objRememberedValue6;
                    } else {
                        composer3.startReplaceGroup(-1014108661);
                        composer3.endReplaceGroup();
                        function0 = null;
                    }
                    u90.a(personInfo, focusRequester5, z3, z4, z5, function9, function0, composer3, 0);
                    composer3.endReplaceGroup();
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

    public /* synthetic */ z70(List list, boolean z, String str, List list2, Map map, Function1 function1, Function1 function2, int i) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = str;
        this.e = list2;
        this.g = map;
        this.h = function1;
        this.i = function2;
    }
}
