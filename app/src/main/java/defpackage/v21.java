package defpackage;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;

import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.UserData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v21 implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v21(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x0131  */
    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:75:0x0175  */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        va0 va0Var;
        SavedStateHandle savedStateHandle;
        SavedStateHandle savedStateHandle2;
        SavedStateHandle savedStateHandle3;
        String imageUrl;
        Integer childCount;
        Integer num;
        boolean zChanged;
        Object objRememberedValue;
        boolean z;
        UserData userData;
        String primary;
        int i = this.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                NavHostController navHostController = (NavHostController) obj6;
                ServerConfig serverConfig = (ServerConfig) obj5;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((AnimatedContentScope) obj).getClass();
                navBackStackEntry.getClass();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(11409179, iIntValue, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:972)");
                }
                Bundle arguments = navBackStackEntry.getArguments();
                if (arguments != null && (string = arguments.getString("itemId")) != null) {
                    Bundle arguments2 = navBackStackEntry.getArguments();
                    String string2 = arguments2 != null ? arguments2.getString("mediaSourceId") : null;
                    NavBackStackEntry previousBackStackEntry = navHostController.getPreviousBackStackEntry();
                    String str = (previousBackStackEntry == null || (savedStateHandle3 = previousBackStackEntry.getSavedStateHandle()) == null) ? null : (String) savedStateHandle3.get("playerPosterUrl");
                    Integer num2 = (previousBackStackEntry == null || (savedStateHandle2 = previousBackStackEntry.getSavedStateHandle()) == null) ? null : (Integer) savedStateHandle2.get("playerPreselectAudioStreamIndex");
                    Integer num3 = (previousBackStackEntry == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null) ? null : (Integer) savedStateHandle.get("playerPreselectSubtitleStreamIndex");
                    if (previousBackStackEntry == null) {
                        composer.startReplaceGroup(589318644);
                        composer.endReplaceGroup();
                        va0Var = null;
                    } else {
                        composer.startReplaceGroup(589318645);
                        va0Var = (va0) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(va0.class), previousBackStackEntry, (String) null, (ViewModelProvider.Factory) null, previousBackStackEntry.getDefaultViewModelCreationExtras(), composer, 0, 0);
                        composer.endReplaceGroup();
                    }
                    boolean zChangedInstance = composer.changedInstance(previousBackStackEntry);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new hb0(previousBackStackEntry, null, 1);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    EffectsKt.LaunchedEffect(previousBackStackEntry, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                    String id = serverConfig != null ? serverConfig.getId() : null;
                    boolean zChangedInstance2 = composer.changedInstance(va0Var) | composer.changedInstance(navHostController);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new vw0(2, va0Var, navHostController);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function1 = (Function1) objRememberedValue3;
                    boolean zChangedInstance3 = composer.changedInstance(va0Var) | composer.changedInstance(navHostController) | composer.changedInstance(navBackStackEntry);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new r5(navHostController, va0Var, navBackStackEntry, 10);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    kn1.a(string, id, string2, str, num2, num3, null, null, false, function1, (Function2) objRememberedValue4, null, composer, 0, 0, 2496);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            default:
                List list = (List) obj6;
                Function1 function2 = (Function1) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((LazyItemScope) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= composer2.changed(iIntValue2) ? 32 : 16;
                }
                if (composer2.shouldExecute((iIntValue3 & Input.Keys.NUMPAD_1) != 144, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1856037619, iIntValue3, -1, "com.dh.myembyapp.ui.screens.person.MediaSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonScreen.kt:242)");
                    }
                    MediaItem mediaItem = (MediaItem) list.get(iIntValue2);
                    ImageTags imageTags = mediaItem.getImageTags();
                    if (imageTags == null || (primary = imageTags.getPrimary()) == null || (imageUrl = RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, 300)) == null) {
                        imageUrl = "";
                    }
                    String str2 = imageUrl;
                    String type = mediaItem.getType();
                    if (Intrinsics.areEqual(type, "Series")) {
                        UserData userData2 = mediaItem.getUserData();
                        if (userData2 == null || (childCount = userData2.getUnplayedItemCount()) == null) {
                            childCount = mediaItem.getChildCount();
                        }
                    } else {
                        if (Intrinsics.areEqual(type, "Season")) {
                            childCount = mediaItem.getChildCount();
                            if (childCount == null) {
                                UserData userData3 = mediaItem.getUserData();
                                if (userData3 != null) {
                                    childCount = userData3.getUnplayedItemCount();
                                } else {
                                    num = null;
                                }
                            }
                        } else {
                            childCount = mediaItem.getChildCount();
                            if (childCount == null) {
                                UserData userData4 = mediaItem.getUserData();
                                if (userData4 != null) {
                                    childCount = userData4.getUnplayedItemCount();
                                } else {
                                    num = null;
                                }
                            }
                        }
                        String name = mediaItem.getName();
                        zChanged = composer2.changed(function2) | composer2.changedInstance(mediaItem);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new q60(function2, mediaItem, 5);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        Integer productionYear = mediaItem.getProductionYear();
                        String strValueOf = productionYear != null ? String.valueOf(productionYear.intValue()) : null;
                        Float communityRating = mediaItem.getCommunityRating();
                        if (Intrinsics.areEqual(mediaItem.getType(), "Movie") || (userData = mediaItem.getUserData()) == null || !userData.getPlayed()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                        }
                        u61 u61Var = (u61) composer2.consume(n72.b);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        a41.e(name, str2, function0, null, strValueOf, num, null, false, true, communityRating, z, Color.m5142boximpl(u61Var.b), 0.0f, 0L, 0L, null, null, null, composer2, 805306368, 0, 516552);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    num = childCount;
                    String name2 = mediaItem.getName();
                    zChanged = composer2.changed(function2) | composer2.changedInstance(mediaItem);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new q60(function2, mediaItem, 5);
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new q60(function2, mediaItem, 5);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function3 = (Function0) objRememberedValue;
                    Integer productionYear2 = mediaItem.getProductionYear();
                    String strValueOf2 = productionYear2 != null ? String.valueOf(productionYear2.intValue()) : null;
                    Float communityRating2 = mediaItem.getCommunityRating();
                    if (Intrinsics.areEqual(mediaItem.getType(), "Movie")) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                    }
                    u61 u61Var2 = (u61) composer2.consume(n72.b);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    a41.e(name2, str2, function3, null, strValueOf2, num, null, false, true, communityRating2, z, Color.m5142boximpl(u61Var2.b), 0.0f, 0L, 0L, null, null, null, composer2, 805306368, 0, 516552);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
