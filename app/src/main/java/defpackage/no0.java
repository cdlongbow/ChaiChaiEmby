package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;

import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class no0 implements Function4 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ no0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, String str, Function1 function1) {
        this.e = str;
        this.d = snapshotStateMap;
        this.c = snapshotStateMap2;
        this.b = mutableState;
        this.g = function1;
        this.h = mutableState2;
        this.i = mutableState3;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0594  */
    /* JADX WARN: Code duplicated, block: B:181:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:184:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:191:0x0609  */
    /* JADX WARN: Code duplicated, block: B:198:0x0655  */
    /* JADX WARN: Code duplicated, block: B:205:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:210:0x0714  */
    /* JADX WARN: Code duplicated, block: B:217:0x0769  */
    /* JADX WARN: Code duplicated, block: B:220:0x078f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0795  */
    /* JADX WARN: Code duplicated, block: B:227:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:229:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:234:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:241:0x087a  */
    /* JADX WARN: Code duplicated, block: B:246:0x08be  */
    /* JADX WARN: Code duplicated, block: B:251:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:256:0x090e  */
    /* JADX WARN: Code duplicated, block: B:261:0x092b  */
    /* JADX WARN: Code duplicated, block: B:264:0x0960  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Modifier modifierOnFocusChanged;
        String string;
        List list;
        Object objM8825constructorimpl;
        NavBackStackEntry navBackStackEntry;
        zq0 zq0Var;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue2;
        String str;
        va0 va0Var;
        boolean zChanged2;
        Object objRememberedValue3;
        String str2;
        String str3;
        String str4;
        final String str5;
        boolean zChanged3;
        Object objRememberedValue4;
        va0 va0Var2;
        State state;
        State state2;
        boolean zChanged4;
        Object objRememberedValue5;
        boolean zChanged5;
        Object objRememberedValue6;
        State state3;
        State state4;
        final State stateCollectAsState;
        String id;
        String alias;
        boolean zChangedInstance;
        Object objRememberedValue7;
        final zq0 zq0Var2;
        boolean zChangedInstance2;
        Object objRememberedValue8;
        String str6;
        ServerPreferences serverPreferences;
        Context context;
        UserPreferences userPreferences;
        MutableState mutableState2;
        boolean zChangedInstance3;
        Object objRememberedValue9;
        boolean zChangedInstance4;
        Object objRememberedValue10;
        boolean zChanged6;
        Object objRememberedValue11;
        boolean zChangedInstance5;
        Object objRememberedValue12;
        MutableState mutableState3;
        final MutableState mutableState4;
        final ServerConfig serverConfig;
        int i = this.a;
        MutableState mutableState5 = this.b;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.c;
        Object obj9 = this.d;
        Object obj10 = this.e;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                List list2 = (List) obj9;
                String str7 = (String) obj10;
                CoroutineScope coroutineScope = (CoroutineScope) obj8;
                LazyListState lazyListState = (LazyListState) obj7;
                FocusRequester focusRequester = (FocusRequester) obj6;
                Function2 function2 = (Function2) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((LazyItemScope) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                }
                int i4 = iIntValue2;
                if (composer.shouldExecute((i4 & Input.Keys.NUMPAD_1) != 144, i4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1535522025, i4, -1, "com.dh.myembyapp.ui.screens.home.MediaSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:2411)");
                    }
                    uv1 uv1Var = (uv1) list2.get(iIntValue);
                    if (((Boolean) mutableState5.getValue()).booleanValue() && Intrinsics.areEqual(uv1Var.a, str7)) {
                        i2 = 1;
                    }
                    String str8 = uv1Var.b;
                    String str9 = uv1Var.c;
                    if (iIntValue == 0) {
                        composer.startReplaceGroup(-959628878);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        boolean zChangedInstance6 = composer.changedInstance(coroutineScope) | composer.changed(lazyListState);
                        Object objRememberedValue13 = composer.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new g5(coroutineScope, lazyListState, 1);
                            composer.updateRememberedValue(objRememberedValue13);
                        }
                        modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue13);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-959368447);
                        composer.endReplaceGroup();
                        modifierOnFocusChanged = Modifier.INSTANCE;
                    }
                    Modifier modifier = modifierOnFocusChanged;
                    FocusRequester focusRequester2 = i2 != 0 ? focusRequester : null;
                    boolean zChanged7 = composer.changed(function2) | composer.changed(uv1Var) | composer.changed("我的媒体");
                    Object objRememberedValue14 = composer.rememberedValue();
                    if (zChanged7 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue14 = new z7(24, function2, uv1Var);
                        composer.updateRememberedValue(objRememberedValue14);
                    }
                    a41.b(str8, str9, (Function0) objRememberedValue14, modifier, focusRequester2, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                ServerConfig serverConfig2 = (ServerConfig) obj9;
                final NavHostController navHostController = (NavHostController) obj10;
                final ServerPreferences serverPreferences2 = (ServerPreferences) obj7;
                final Context context2 = (Context) obj6;
                final UserPreferences userPreferences2 = (UserPreferences) obj5;
                final CoroutineScope coroutineScope2 = (CoroutineScope) obj8;
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((AnimatedContentScope) obj).getClass();
                navBackStackEntry2.getClass();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-289563857, iIntValue3, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:779)");
                }
                Bundle arguments = navBackStackEntry2.getArguments();
                if (arguments != null && (string = arguments.getString("itemId")) != null) {
                    Bundle arguments2 = navBackStackEntry2.getArguments();
                    String string2 = arguments2 != null ? arguments2.getString("episodeId") : null;
                    final String str10 = (String) navBackStackEntry2.getSavedStateHandle().get("detailRestoreServerId");
                    Object obj11 = navBackStackEntry2.getSavedStateHandle().get("detailShouldRestoreServer");
                    Boolean bool = Boolean.TRUE;
                    final boolean zAreEqual = Intrinsics.areEqual(obj11, bool);
                    boolean zAreEqual2 = Intrinsics.areEqual(navBackStackEntry2.getSavedStateHandle().get("detailShowServerBadge"), bool);
                    String str11 = (String) navBackStackEntry2.getSavedStateHandle().get("detailPreselectMediaSourceId");
                    final boolean zAreEqual3 = Intrinsics.areEqual(navBackStackEntry2.getSavedStateHandle().get("detailOpenedFromSimilar"), bool);
                    boolean zChanged8 = composer2.changed(navBackStackEntry2);
                    Object objRememberedValue15 = composer2.rememberedValue();
                    if (zChanged8 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue15 = navBackStackEntry2.getSavedStateHandle().getStateFlow("detailReturnPersonFocusId", null);
                        composer2.updateRememberedValue(objRememberedValue15);
                    }
                    StateFlow stateFlow = (StateFlow) objRememberedValue15;
                    boolean zChanged9 = composer2.changed(navBackStackEntry2);
                    Object objRememberedValue16 = composer2.rememberedValue();
                    if (zChanged9 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue16 = navBackStackEntry2.getSavedStateHandle().getStateFlow("detailReturnPersonFocusToken", 0);
                        composer2.updateRememberedValue(objRememberedValue16);
                    }
                    State stateCollectAsState2 = SnapshotStateKt.collectAsState(stateFlow, null, composer2, 0, 1);
                    State stateCollectAsState3 = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue16, null, composer2, 0, 1);
                    boolean zChanged10 = composer2.changed(navBackStackEntry2);
                    Object objRememberedValue17 = composer2.rememberedValue();
                    if (zChanged10 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue17 = navBackStackEntry2.getSavedStateHandle().getStateFlow("detailReturnSimilarFocusId", null);
                        composer2.updateRememberedValue(objRememberedValue17);
                    }
                    StateFlow stateFlow2 = (StateFlow) objRememberedValue17;
                    boolean zChanged11 = composer2.changed(navBackStackEntry2);
                    Object objRememberedValue18 = composer2.rememberedValue();
                    if (zChanged11 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue18 = navBackStackEntry2.getSavedStateHandle().getStateFlow("detailReturnSimilarFocusToken", 0);
                        composer2.updateRememberedValue(objRememberedValue18);
                    }
                    State stateCollectAsState4 = SnapshotStateKt.collectAsState(stateFlow2, null, composer2, 0, 1);
                    State stateCollectAsState5 = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue18, null, composer2, 0, 1);
                    boolean zChanged12 = composer2.changed(navBackStackEntry2);
                    Object objRememberedValue19 = composer2.rememberedValue();
                    if (zChanged12 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue19 = navBackStackEntry2.getSavedStateHandle().getStateFlow("detailReturnCollectionFocusId", null);
                        composer2.updateRememberedValue(objRememberedValue19);
                    }
                    StateFlow stateFlow3 = (StateFlow) objRememberedValue19;
                    boolean zChanged13 = composer2.changed(navBackStackEntry2);
                    Object objRememberedValue20 = composer2.rememberedValue();
                    if (zChanged13 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue20 = navBackStackEntry2.getSavedStateHandle().getStateFlow("detailReturnCollectionFocusToken", 0);
                        composer2.updateRememberedValue(objRememberedValue20);
                    }
                    State stateCollectAsState6 = SnapshotStateKt.collectAsState(stateFlow3, null, composer2, 0, 1);
                    State stateCollectAsState7 = SnapshotStateKt.collectAsState((StateFlow) objRememberedValue20, null, composer2, 0, 1);
                    final MutableState mutableState6 = this.b;
                    boolean zChanged14 = composer2.changed((String) mutableState6.getValue());
                    Object objRememberedValue21 = composer2.rememberedValue();
                    if (zChanged14 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                        List<ServerConfig> allServers = serverPreferences2.getAllServers();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj12 : allServers) {
                            ServerConfig serverConfig3 = (ServerConfig) obj12;
                            if (serverConfig3.isVerified() && serverConfig3.isLoggedIn()) {
                                arrayList.add(obj12);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        int i5 = 0;
                        for (int size = arrayList.size(); i5 < size; size = size) {
                            Object obj13 = arrayList.get(i5);
                            i5++;
                            arrayList2.add(((ServerConfig) obj13).getEffectiveServerConfig());
                        }
                        composer2.updateRememberedValue(arrayList2);
                        objRememberedValue21 = arrayList2;
                    }
                    List list3 = (List) objRememberedValue21;
                    NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
                    va0 va0Var3 = (va0) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(va0.class), navBackStackEntry2, (String) null, (ViewModelProvider.Factory) null, navBackStackEntry2.getDefaultViewModelCreationExtras(), composer2, (((iIntValue3 >> 3) & 14) << 3) & Input.Keys.FORWARD_DEL, 0);
                    boolean zChanged15 = composer2.changed(navBackStackEntry3);
                    Object objRememberedValue22 = composer2.rememberedValue();
                    try {
                        if (!zChanged15) {
                            list = list3;
                            if (objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                            }
                            navBackStackEntry = (NavBackStackEntry) objRememberedValue22;
                            if (navBackStackEntry == null) {
                                composer2.startReplaceGroup(-2099247363);
                                composer2.endReplaceGroup();
                                zq0Var = null;
                            } else {
                                composer2.startReplaceGroup(-2099247362);
                                zq0 zq0Var3 = (zq0) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(zq0.class), navBackStackEntry, (String) null, (ViewModelProvider.Factory) null, navBackStackEntry.getDefaultViewModelCreationExtras(), composer2, 0, 0);
                                composer2.endReplaceGroup();
                                zq0Var = zq0Var3;
                            }
                            Object[] objArr = new Object[0];
                            objRememberedValue = composer2.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new o01(6);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue, composer2, 48);
                            zChanged = composer2.changed(string2) | composer2.changed(mutableState) | composer2.changedInstance(va0Var3);
                            objRememberedValue2 = composer2.rememberedValue();
                            if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                                String str12 = string2;
                                objRememberedValue2 = new e6(str12, va0Var3, mutableState, (Continuation) null, 8);
                                str = str12;
                                va0Var = va0Var3;
                                composer2.updateRememberedValue(objRememberedValue2);
                            } else {
                                va0Var = va0Var3;
                                str = string2;
                            }
                            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                            zChanged2 = composer2.changed(str11) | composer2.changed(str) | composer2.changed(string) | composer2.changedInstance(va0Var) | composer2.changedInstance(navBackStackEntry3);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                String str13 = str;
                                jy jyVar = new jy(str11, str13, string, va0Var, navBackStackEntry3, null, 2);
                                str2 = str11;
                                str3 = str13;
                                objRememberedValue3 = jyVar;
                                str4 = string;
                                navBackStackEntry3 = navBackStackEntry3;
                                composer2.updateRememberedValue(objRememberedValue3);
                            } else {
                                str4 = string;
                                str3 = str;
                                str2 = str11;
                            }
                            EffectsKt.LaunchedEffect(str4, str3, str2, (Function2) objRememberedValue3, composer2, 0);
                            str5 = str4;
                            String str14 = str3;
                            String str15 = (String) stateCollectAsState2.getValue();
                            Integer numValueOf = Integer.valueOf(((Number) stateCollectAsState3.getValue()).intValue());
                            zChanged3 = composer2.changed(stateCollectAsState2) | composer2.changed(stateCollectAsState3) | composer2.changedInstance(va0Var) | composer2.changedInstance(navBackStackEntry3);
                            objRememberedValue4 = composer2.rememberedValue();
                            if (!zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                                va0 va0Var4 = va0Var;
                                objRememberedValue4 = new d31(va0Var4, navBackStackEntry3, stateCollectAsState2, stateCollectAsState3, null, 0);
                                va0Var2 = va0Var4;
                                state = stateCollectAsState2;
                                state2 = stateCollectAsState3;
                                composer2.updateRememberedValue(objRememberedValue4);
                            } else {
                                va0Var2 = va0Var;
                                state2 = stateCollectAsState3;
                                state = stateCollectAsState2;
                            }
                            EffectsKt.LaunchedEffect(str15, numValueOf, (Function2) objRememberedValue4, composer2, 0);
                            String str16 = (String) stateCollectAsState4.getValue();
                            Integer numValueOf2 = Integer.valueOf(((Number) stateCollectAsState5.getValue()).intValue());
                            zChanged4 = composer2.changed(stateCollectAsState4) | composer2.changed(stateCollectAsState5) | composer2.changedInstance(va0Var2) | composer2.changedInstance(navBackStackEntry3);
                            objRememberedValue5 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new d31(va0Var2, navBackStackEntry3, stateCollectAsState4, stateCollectAsState5, null, 1);
                                composer2.updateRememberedValue(objRememberedValue5);
                            }
                            EffectsKt.LaunchedEffect(str16, numValueOf2, (Function2) objRememberedValue5, composer2, 0);
                            String str17 = (String) stateCollectAsState6.getValue();
                            Integer numValueOf3 = Integer.valueOf(((Number) stateCollectAsState7.getValue()).intValue());
                            zChanged5 = composer2.changed(stateCollectAsState6) | composer2.changed(stateCollectAsState7) | composer2.changedInstance(va0Var2) | composer2.changedInstance(navBackStackEntry3);
                            objRememberedValue6 = composer2.rememberedValue();
                            if (!zChanged5 || objRememberedValue6 == companion.getEmpty()) {
                                state3 = stateCollectAsState6;
                                state4 = stateCollectAsState7;
                                objRememberedValue6 = new d31(va0Var2, navBackStackEntry3, state3, state4, null, 2);
                                composer2.updateRememberedValue(objRememberedValue6);
                            } else {
                                state3 = stateCollectAsState6;
                                state4 = stateCollectAsState7;
                            }
                            EffectsKt.LaunchedEffect(str17, numValueOf3, (Function2) objRememberedValue6, composer2, 0);
                            stateCollectAsState = SnapshotStateKt.collectAsState(va0Var2.v, null, composer2, 0, 1);
                            if (serverConfig2 != null) {
                                id = serverConfig2.getId();
                            } else {
                                id = null;
                            }
                            if (serverConfig2 != null || (alias = serverConfig2.getAlias()) == null) {
                                alias = "服务器";
                            }
                            String str18 = alias;
                            String str19 = zAreEqual2 ? str14 : null;
                            String str20 = (String) state.getValue();
                            int iIntValue4 = ((Number) state2.getValue()).intValue();
                            String str21 = (String) stateCollectAsState4.getValue();
                            int iIntValue5 = ((Number) stateCollectAsState5.getValue()).intValue();
                            String str22 = (String) state3.getValue();
                            int iIntValue6 = ((Number) state4.getValue()).intValue();
                            zChangedInstance = composer2.changedInstance(va0Var2) | composer2.changedInstance(navHostController);
                            objRememberedValue7 = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = new a2(18, va0Var2, navHostController);
                                composer2.updateRememberedValue(objRememberedValue7);
                            }
                            Function2 function3 = (Function2) objRememberedValue7;
                            boolean zChanged16 = composer2.changed(zAreEqual3) | composer2.changedInstance(navHostController) | composer2.changed(str5) | composer2.changed(zAreEqual) | composer2.changed(str10) | composer2.changedInstance(serverPreferences2) | composer2.changedInstance(context2) | composer2.changed(mutableState6) | composer2.changedInstance(userPreferences2) | composer2.changed(stateCollectAsState);
                            zq0Var2 = zq0Var;
                            zChangedInstance2 = zChanged16 | composer2.changedInstance(zq0Var2) | composer2.changedInstance(coroutineScope2) | composer2.changedInstance(va0Var2);
                            objRememberedValue8 = composer2.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                                final va0 va0Var5 = va0Var2;
                                objRememberedValue8 = new Function0() { // from class: b31
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        NavBackStackEntry previousBackStackEntry;
                                        SavedStateHandle savedStateHandle;
                                        boolean z = zAreEqual3;
                                        NavHostController navHostController2 = navHostController;
                                        if (z && (previousBackStackEntry = navHostController2.getPreviousBackStackEntry()) != null) {
                                            if (!Intrinsics.areEqual(previousBackStackEntry.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                                previousBackStackEntry = null;
                                            }
                                            if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                                savedStateHandle.set("detailReturnSimilarFocusId", str5);
                                                Integer num = (Integer) savedStateHandle.get("detailReturnSimilarFocusToken");
                                                savedStateHandle.set("detailReturnSimilarFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                            }
                                        }
                                        if (zAreEqual) {
                                            String str23 = str10;
                                            MutableState mutableState7 = mutableState6;
                                            if (str23 != null) {
                                                e31.f(serverPreferences2, context2, userPreferences2, mutableState7, str23, false);
                                            } else {
                                                mutableState7.setValue(null);
                                            }
                                        }
                                        navHostController2.popBackStack();
                                        if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                                            zq0 zq0Var4 = zq0Var2;
                                            if (zq0Var4 != null) {
                                                zq0Var4.o.setValue(Boolean.TRUE);
                                            }
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new mq0(zq0Var4, null, 1), 3, null);
                                            va0Var5.u.setValue(Boolean.FALSE);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                str6 = str5;
                                serverPreferences = serverPreferences2;
                                context = context2;
                                userPreferences = userPreferences2;
                                mutableState2 = mutableState6;
                                composer2.updateRememberedValue(objRememberedValue8);
                            } else {
                                str6 = str5;
                                userPreferences = userPreferences2;
                                context = context2;
                                serverPreferences = serverPreferences2;
                                mutableState2 = mutableState6;
                            }
                            Function0 function0 = (Function0) objRememberedValue8;
                            zChangedInstance3 = composer2.changedInstance(r18);
                            objRememberedValue9 = composer2.rememberedValue();
                            String str23 = id;
                            if (zChangedInstance3 || objRememberedValue9 == companion.getEmpty()) {
                                objRememberedValue9 = new m21(r18, 9);
                                composer2.updateRememberedValue(objRememberedValue9);
                            }
                            Function1 function1 = (Function1) objRememberedValue9;
                            zChangedInstance4 = composer2.changedInstance(r18);
                            objRememberedValue10 = composer2.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue10 == companion.getEmpty()) {
                                objRememberedValue10 = new m21(r18, 10);
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            Function1 function4 = (Function1) objRememberedValue10;
                            zChanged6 = composer2.changed(mutableState2) | composer2.changedInstance(serverPreferences) | composer2.changedInstance(context) | composer2.changedInstance(userPreferences) | composer2.changedInstance(r18);
                            objRememberedValue11 = composer2.rememberedValue();
                            if (zChanged6 || objRememberedValue11 == companion.getEmpty()) {
                                w21 w21Var = new w21((NavHostController) r18, mutableState2, serverPreferences, context, userPreferences);
                                composer2.updateRememberedValue(w21Var);
                                objRememberedValue11 = w21Var;
                            }
                            Function4 function5 = (Function4) objRememberedValue11;
                            zChangedInstance5 = composer2.changedInstance(r18);
                            objRememberedValue12 = composer2.rememberedValue();
                            if (zChangedInstance5 || objRememberedValue12 == companion.getEmpty()) {
                                objRememberedValue12 = new i2(navHostController, 9);
                                composer2.updateRememberedValue(objRememberedValue12);
                            }
                            u90.G(str6, str23, str18, list, str19, str20, iIntValue4, str21, iIntValue5, str22, iIntValue6, zAreEqual2, function3, function0, function1, function4, function5, (Function3) objRememberedValue12, va0Var2, composer2, 0, 134217728);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            list = list3;
                        }
                        
                        objM8825constructorimpl = navHostController.getBackStackEntry("home");
                    } catch (Throwable th) {
                        
                        objM8825constructorimpl = ResultKt.createFailure(th);
                    }
                    if (false) {
                        objM8825constructorimpl = null;
                    }
                    objRememberedValue22 = (NavBackStackEntry) objM8825constructorimpl;
                    composer2.updateRememberedValue(objRememberedValue22);
                    navBackStackEntry = (NavBackStackEntry) objRememberedValue22;
                    if (navBackStackEntry == null) {
                        composer2.startReplaceGroup(-2099247363);
                        composer2.endReplaceGroup();
                        zq0Var = null;
                    } else {
                        composer2.startReplaceGroup(-2099247362);
                        zq0 zq0Var4 = (zq0) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(zq0.class), navBackStackEntry, (String) null, (ViewModelProvider.Factory) null, navBackStackEntry.getDefaultViewModelCreationExtras(), composer2, 0, 0);
                        composer2.endReplaceGroup();
                        zq0Var = zq0Var4;
                    }
                    Object[] objArr2 = new Object[0];
                    objRememberedValue = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new o01(6);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) objRememberedValue, composer2, 48);
                    zChanged = composer2.changed(string2) | composer2.changed(mutableState) | composer2.changedInstance(va0Var3);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        String str110 = string2;
                        objRememberedValue2 = new e6(str110, va0Var3, mutableState, (Continuation) null, 8);
                        str = str110;
                        va0Var = va0Var3;
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        String str111 = string2;
                        objRememberedValue2 = new e6(str111, va0Var3, mutableState, (Continuation) null, 8);
                        str = str111;
                        va0Var = va0Var3;
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                    zChanged2 = composer2.changed(str11) | composer2.changed(str) | composer2.changed(string) | composer2.changedInstance(va0Var) | composer2.changedInstance(navBackStackEntry3);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2) {
                        String str112 = str;
                        jy jyVar2 = new jy(str11, str112, string, va0Var, navBackStackEntry3, null, 2);
                        str2 = str11;
                        str3 = str112;
                        objRememberedValue3 = jyVar2;
                        str4 = string;
                        navBackStackEntry3 = navBackStackEntry3;
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        String str113 = str;
                        jy jyVar3 = new jy(str11, str113, string, va0Var, navBackStackEntry3, null, 2);
                        str2 = str11;
                        str3 = str113;
                        objRememberedValue3 = jyVar3;
                        str4 = string;
                        navBackStackEntry3 = navBackStackEntry3;
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    EffectsKt.LaunchedEffect(str4, str3, str2, (Function2) objRememberedValue3, composer2, 0);
                    str5 = str4;
                    String str114 = str3;
                    String str115 = (String) stateCollectAsState2.getValue();
                    Integer numValueOf4 = Integer.valueOf(((Number) stateCollectAsState3.getValue()).intValue());
                    zChanged3 = composer2.changed(stateCollectAsState2) | composer2.changed(stateCollectAsState3) | composer2.changedInstance(va0Var) | composer2.changedInstance(navBackStackEntry3);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3) {
                        va0 va0Var6 = va0Var;
                        objRememberedValue4 = new d31(va0Var6, navBackStackEntry3, stateCollectAsState2, stateCollectAsState3, null, 0);
                        va0Var2 = va0Var6;
                        state = stateCollectAsState2;
                        state2 = stateCollectAsState3;
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        va0 va0Var7 = va0Var;
                        objRememberedValue4 = new d31(va0Var7, navBackStackEntry3, stateCollectAsState2, stateCollectAsState3, null, 0);
                        va0Var2 = va0Var7;
                        state = stateCollectAsState2;
                        state2 = stateCollectAsState3;
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    EffectsKt.LaunchedEffect(str115, numValueOf4, (Function2) objRememberedValue4, composer2, 0);
                    String str116 = (String) stateCollectAsState4.getValue();
                    Integer numValueOf5 = Integer.valueOf(((Number) stateCollectAsState5.getValue()).intValue());
                    zChanged4 = composer2.changed(stateCollectAsState4) | composer2.changed(stateCollectAsState5) | composer2.changedInstance(va0Var2) | composer2.changedInstance(navBackStackEntry3);
                    objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged4) {
                        objRememberedValue5 = new d31(va0Var2, navBackStackEntry3, stateCollectAsState4, stateCollectAsState5, null, 1);
                        composer2.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new d31(va0Var2, navBackStackEntry3, stateCollectAsState4, stateCollectAsState5, null, 1);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    EffectsKt.LaunchedEffect(str116, numValueOf5, (Function2) objRememberedValue5, composer2, 0);
                    String str117 = (String) stateCollectAsState6.getValue();
                    Integer numValueOf6 = Integer.valueOf(((Number) stateCollectAsState7.getValue()).intValue());
                    zChanged5 = composer2.changed(stateCollectAsState6) | composer2.changed(stateCollectAsState7) | composer2.changedInstance(va0Var2) | composer2.changedInstance(navBackStackEntry3);
                    objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged5) {
                        state3 = stateCollectAsState6;
                        state4 = stateCollectAsState7;
                        objRememberedValue6 = new d31(va0Var2, navBackStackEntry3, state3, state4, null, 2);
                        composer2.updateRememberedValue(objRememberedValue6);
                    } else {
                        state3 = stateCollectAsState6;
                        state4 = stateCollectAsState7;
                        objRememberedValue6 = new d31(va0Var2, navBackStackEntry3, state3, state4, null, 2);
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    EffectsKt.LaunchedEffect(str117, numValueOf6, (Function2) objRememberedValue6, composer2, 0);
                    stateCollectAsState = SnapshotStateKt.collectAsState(va0Var2.v, null, composer2, 0, 1);
                    if (serverConfig2 != null) {
                        id = serverConfig2.getId();
                    } else {
                        id = null;
                    }
                    if (serverConfig2 != null) {
                        alias = "服务器";
                    } else {
                        alias = "服务器";
                    }
                    String str118 = alias;
                    if (zAreEqual2) {
                    }
                    String str24 = (String) state.getValue();
                    int iIntValue7 = ((Number) state2.getValue()).intValue();
                    String str25 = (String) stateCollectAsState4.getValue();
                    int iIntValue8 = ((Number) stateCollectAsState5.getValue()).intValue();
                    String str26 = (String) state3.getValue();
                    int iIntValue9 = ((Number) state4.getValue()).intValue();
                    zChangedInstance = composer2.changedInstance(va0Var2) | composer2.changedInstance(navHostController);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue7 = new a2(18, va0Var2, navHostController);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new a2(18, va0Var2, navHostController);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    Function2 function6 = (Function2) objRememberedValue7;
                    boolean zChanged17 = composer2.changed(zAreEqual3) | composer2.changedInstance(navHostController) | composer2.changed(str5) | composer2.changed(zAreEqual) | composer2.changed(str10) | composer2.changedInstance(serverPreferences2) | composer2.changedInstance(context2) | composer2.changed(mutableState6) | composer2.changedInstance(userPreferences2) | composer2.changed(stateCollectAsState);
                    zq0Var2 = zq0Var;
                    zChangedInstance2 = zChanged17 | composer2.changedInstance(zq0Var2) | composer2.changedInstance(coroutineScope2) | composer2.changedInstance(va0Var2);
                    objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance2) {
                        final va0 va0Var8 = va0Var2;
                        objRememberedValue8 = new Function0() { // from class: b31
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                NavBackStackEntry previousBackStackEntry;
                                SavedStateHandle savedStateHandle;
                                boolean z = zAreEqual3;
                                NavHostController navHostController2 = navHostController;
                                if (z && (previousBackStackEntry = navHostController2.getPreviousBackStackEntry()) != null) {
                                    if (!Intrinsics.areEqual(previousBackStackEntry.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                        previousBackStackEntry = null;
                                    }
                                    if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                        savedStateHandle.set("detailReturnSimilarFocusId", str5);
                                        Integer num = (Integer) savedStateHandle.get("detailReturnSimilarFocusToken");
                                        savedStateHandle.set("detailReturnSimilarFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                    }
                                }
                                if (zAreEqual) {
                                    String str27 = str10;
                                    MutableState mutableState7 = mutableState6;
                                    if (str27 != null) {
                                        e31.f(serverPreferences2, context2, userPreferences2, mutableState7, str27, false);
                                    } else {
                                        mutableState7.setValue(null);
                                    }
                                }
                                navHostController2.popBackStack();
                                if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                                    zq0 zq0Var5 = zq0Var2;
                                    if (zq0Var5 != null) {
                                        zq0Var5.o.setValue(Boolean.TRUE);
                                    }
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new mq0(zq0Var5, null, 1), 3, null);
                                    va0Var8.u.setValue(Boolean.FALSE);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        str6 = str5;
                        serverPreferences = serverPreferences2;
                        context = context2;
                        userPreferences = userPreferences2;
                        mutableState2 = mutableState6;
                        composer2.updateRememberedValue(objRememberedValue8);
                    } else {
                        final va0 va0Var9 = va0Var2;
                        objRememberedValue8 = new Function0() { // from class: b31
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                NavBackStackEntry previousBackStackEntry;
                                SavedStateHandle savedStateHandle;
                                boolean z = zAreEqual3;
                                NavHostController navHostController2 = navHostController;
                                if (z && (previousBackStackEntry = navHostController2.getPreviousBackStackEntry()) != null) {
                                    if (!Intrinsics.areEqual(previousBackStackEntry.getDestination().getRoute(), "detail/{itemId}?episodeId={episodeId}")) {
                                        previousBackStackEntry = null;
                                    }
                                    if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
                                        savedStateHandle.set("detailReturnSimilarFocusId", str5);
                                        Integer num = (Integer) savedStateHandle.get("detailReturnSimilarFocusToken");
                                        savedStateHandle.set("detailReturnSimilarFocusToken", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                    }
                                }
                                if (zAreEqual) {
                                    String str27 = str10;
                                    MutableState mutableState7 = mutableState6;
                                    if (str27 != null) {
                                        e31.f(serverPreferences2, context2, userPreferences2, mutableState7, str27, false);
                                    } else {
                                        mutableState7.setValue(null);
                                    }
                                }
                                navHostController2.popBackStack();
                                if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                                    zq0 zq0Var5 = zq0Var2;
                                    if (zq0Var5 != null) {
                                        zq0Var5.o.setValue(Boolean.TRUE);
                                    }
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new mq0(zq0Var5, null, 1), 3, null);
                                    va0Var9.u.setValue(Boolean.FALSE);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        str6 = str5;
                        serverPreferences = serverPreferences2;
                        context = context2;
                        userPreferences = userPreferences2;
                        mutableState2 = mutableState6;
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    Function0 function7 = (Function0) objRememberedValue8;
                    zChangedInstance3 = composer2.changedInstance(r18);
                    objRememberedValue9 = composer2.rememberedValue();
                    String str27 = id;
                    if (zChangedInstance3) {
                        objRememberedValue9 = new m21(r18, 9);
                        composer2.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new m21(r18, 9);
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    Function1 function8 = (Function1) objRememberedValue9;
                    zChangedInstance4 = composer2.changedInstance(r18);
                    objRememberedValue10 = composer2.rememberedValue();
                    if (zChangedInstance4) {
                        objRememberedValue10 = new m21(r18, 10);
                        composer2.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new m21(r18, 10);
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    Function1 function9 = (Function1) objRememberedValue10;
                    zChanged6 = composer2.changed(mutableState2) | composer2.changedInstance(serverPreferences) | composer2.changedInstance(context) | composer2.changedInstance(userPreferences) | composer2.changedInstance(r18);
                    objRememberedValue11 = composer2.rememberedValue();
                    if (zChanged6) {
                        w21 w21Var2 = new w21((NavHostController) r18, mutableState2, serverPreferences, context, userPreferences);
                        composer2.updateRememberedValue(w21Var2);
                        objRememberedValue11 = w21Var2;
                    } else {
                        w21 w21Var3 = new w21((NavHostController) r18, mutableState2, serverPreferences, context, userPreferences);
                        composer2.updateRememberedValue(w21Var3);
                        objRememberedValue11 = w21Var3;
                    }
                    Function4 function10 = (Function4) objRememberedValue11;
                    zChangedInstance5 = composer2.changedInstance(r18);
                    objRememberedValue12 = composer2.rememberedValue();
                    if (zChangedInstance5) {
                        objRememberedValue12 = new i2(navHostController, 9);
                        composer2.updateRememberedValue(objRememberedValue12);
                    } else {
                        objRememberedValue12 = new i2(navHostController, 9);
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    u90.G(str6, str27, str118, list, str19, str24, iIntValue7, str25, iIntValue8, str26, iIntValue9, zAreEqual2, function6, function7, function8, function9, function10, (Function3) objRememberedValue12, va0Var2, composer2, 0, 134217728);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 2:
                NavHostController navHostController2 = (NavHostController) obj9;
                ServerPreferences serverPreferences3 = (ServerPreferences) obj10;
                Context context3 = (Context) obj8;
                MutableState mutableState7 = (MutableState) obj7;
                UserPreferences userPreferences3 = (UserPreferences) obj6;
                ServerConfig serverConfig4 = (ServerConfig) obj5;
                Composer composer3 = (Composer) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((AnimatedContentScope) obj).getClass();
                ((NavBackStackEntry) obj2).getClass();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1058879701, iIntValue10, -1, "com.dh.myembyapp.MainNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:662)");
                }
                boolean zChanged18 = composer3.changed(mutableState5) | composer3.changedInstance(navHostController2);
                Object objRememberedValue23 = composer3.rememberedValue();
                if (zChanged18 || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue23 = new jx0(4, navHostController2, mutableState5);
                    composer3.updateRememberedValue(objRememberedValue23);
                }
                Function0 function11 = (Function0) objRememberedValue23;
                boolean zChangedInstance7 = composer3.changedInstance(serverPreferences3) | composer3.changedInstance(context3) | composer3.changed(mutableState7) | composer3.changedInstance(userPreferences3) | composer3.changedInstance(navHostController2);
                Object objRememberedValue24 = composer3.rememberedValue();
                if (zChangedInstance7 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                    mutableState3 = mutableState7;
                    z21 z21Var = new z21(navHostController2, mutableState3, serverPreferences3, context3, userPreferences3);
                    composer3.updateRememberedValue(z21Var);
                    objRememberedValue24 = z21Var;
                } else {
                    mutableState3 = mutableState7;
                }
                Function1 function12 = (Function1) objRememberedValue24;
                String id2 = serverConfig4 != null ? serverConfig4.getId() : null;
                boolean zChanged19 = composer3.changed(mutableState3) | composer3.changedInstance(serverPreferences3) | composer3.changedInstance(context3) | composer3.changedInstance(userPreferences3) | composer3.changedInstance(navHostController2);
                Object objRememberedValue25 = composer3.rememberedValue();
                if (zChanged19 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue25 = new o21(1, context3, mutableState3, navHostController2, serverPreferences3, userPreferences3);
                    serverPreferences3 = serverPreferences3;
                    composer3.updateRememberedValue(objRememberedValue25);
                }
                Function2 function13 = (Function2) objRememberedValue25;
                boolean zChanged20 = composer3.changed(mutableState3) | composer3.changedInstance(serverPreferences3) | composer3.changedInstance(context3) | composer3.changedInstance(userPreferences3) | composer3.changedInstance(navHostController2);
                Object objRememberedValue26 = composer3.rememberedValue();
                if (zChanged20 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue26 = new n1(navHostController2, mutableState3, serverPreferences3, context3, userPreferences3, 4);
                    context3 = context3;
                    navHostController2 = navHostController2;
                    composer3.updateRememberedValue(objRememberedValue26);
                }
                Function3 function14 = (Function3) objRememberedValue26;
                boolean zChanged21 = composer3.changed(mutableState3) | composer3.changedInstance(serverPreferences3) | composer3.changedInstance(context3) | composer3.changedInstance(userPreferences3) | composer3.changedInstance(navHostController2);
                Object objRememberedValue27 = composer3.rememberedValue();
                if (zChanged21 || objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue27 = new o21(2, context3, mutableState3, navHostController2, serverPreferences3, userPreferences3);
                    composer3.updateRememberedValue(objRememberedValue27);
                }
                f7.e(function11, function12, id2, function13, function14, (Function2) objRememberedValue27, false, false, null, null, composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            default:
                String str28 = (String) obj10;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj9;
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj8;
                final Function1 function15 = (Function1) obj7;
                final MutableState mutableState8 = (MutableState) obj6;
                final MutableState mutableState9 = (MutableState) obj5;
                int iIntValue11 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((LazyItemScope) obj).getClass();
                if ((iIntValue12 & 48) == 0) {
                    iIntValue12 |= composer4.changed(iIntValue11) ? 32 : 16;
                }
                int i6 = iIntValue12;
                if (composer4.shouldExecute((i6 & Input.Keys.NUMPAD_1) != 144, i6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-758002365, i6, -1, "com.dh.myembyapp.ui.components.ServerSortDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServerSortDialog.kt:202)");
                    }
                    final MutableState mutableState10 = this.b;
                    final ServerConfig serverConfig5 = (ServerConfig) ((List) mutableState10.getValue()).get(iIntValue11);
                    String str29 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue11 + 1)}, 1));
                    ServerConfig effectiveServerConfig = serverConfig5.getEffectiveServerConfig();
                    String strX = serverConfig5.getActiveBackupRouteId() != null ? kb0.x(" · ", serverConfig5.getCurrentRouteDisplayName()) : null;
                    if (strX == null) {
                        strX = "";
                    }
                    String strN = c61.n(effectiveServerConfig.getDisplayAddress(), strX);
                    boolean zAreEqual4 = Intrinsics.areEqual(serverConfig5.getId(), str28);
                    boolean z = iIntValue11 > 0;
                    boolean z2 = iIntValue11 < CollectionsKt.getLastIndex((List) mutableState10.getValue());
                    FocusRequester focusRequester3 = (FocusRequester) MapsKt.getValue(snapshotStateMap, serverConfig5.getId());
                    FocusRequester focusRequester4 = (FocusRequester) MapsKt.getValue(snapshotStateMap2, serverConfig5.getId());
                    boolean zChangedInstance8 = composer4.changedInstance(serverConfig5);
                    Object objRememberedValue28 = composer4.rememberedValue();
                    if (zChangedInstance8 || objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue28 = new Function1() { // from class: ty1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj14) {
                                int i7 = i2;
                                MutableState mutableState11 = mutableState8;
                                ServerConfig serverConfig6 = serverConfig5;
                                boolean zBooleanValue = ((Boolean) obj14).booleanValue();
                                switch (i7) {
                                    case 0:
                                        yy1 yy1Var = new yy1(serverConfig6.getId(), qy1.a);
                                        if (zBooleanValue) {
                                            mutableState11.setValue(yy1Var);
                                        } else if (Intrinsics.areEqual((yy1) mutableState11.getValue(), yy1Var)) {
                                            mutableState11.setValue(null);
                                        }
                                        break;
                                    default:
                                        yy1 yy1Var2 = new yy1(serverConfig6.getId(), qy1.b);
                                        if (zBooleanValue) {
                                            mutableState11.setValue(yy1Var2);
                                        } else if (Intrinsics.areEqual((yy1) mutableState11.getValue(), yy1Var2)) {
                                            mutableState11.setValue(null);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue28);
                    }
                    Function1 function16 = (Function1) objRememberedValue28;
                    boolean zChangedInstance9 = composer4.changedInstance(serverConfig5);
                    Object objRememberedValue29 = composer4.rememberedValue();
                    if (zChangedInstance9 || objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue29 = new Function1() { // from class: ty1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj14) {
                                int i7 = i3;
                                MutableState mutableState11 = mutableState8;
                                ServerConfig serverConfig6 = serverConfig5;
                                boolean zBooleanValue = ((Boolean) obj14).booleanValue();
                                switch (i7) {
                                    case 0:
                                        yy1 yy1Var = new yy1(serverConfig6.getId(), qy1.a);
                                        if (zBooleanValue) {
                                            mutableState11.setValue(yy1Var);
                                        } else if (Intrinsics.areEqual((yy1) mutableState11.getValue(), yy1Var)) {
                                            mutableState11.setValue(null);
                                        }
                                        break;
                                    default:
                                        yy1 yy1Var2 = new yy1(serverConfig6.getId(), qy1.b);
                                        if (zBooleanValue) {
                                            mutableState11.setValue(yy1Var2);
                                        } else if (Intrinsics.areEqual((yy1) mutableState11.getValue(), yy1Var2)) {
                                            mutableState11.setValue(null);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue29);
                    }
                    Function1 function17 = (Function1) objRememberedValue29;
                    boolean zChanged22 = composer4.changed(mutableState10) | composer4.changed(function15) | composer4.changedInstance(serverConfig5);
                    Object objRememberedValue30 = composer4.rememberedValue();
                    if (zChanged22 || objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                        final int i7 = 0;
                        mutableState4 = mutableState8;
                        objRememberedValue30 = new Function0() { // from class: uy1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i7;
                                ServerConfig serverConfig6 = serverConfig5;
                                switch (i8) {
                                    case 0:
                                        xy1.c(function15, mutableState10, mutableState4, mutableState9, serverConfig6.getId(), -1, qy1.a);
                                        break;
                                    default:
                                        xy1.c(function15, mutableState10, mutableState4, mutableState9, serverConfig6.getId(), 1, qy1.b);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue30);
                    } else {
                        mutableState4 = mutableState8;
                    }
                    Function0 function18 = (Function0) objRememberedValue30;
                    boolean zChanged23 = composer4.changed(mutableState10) | composer4.changed(function15) | composer4.changedInstance(serverConfig5);
                    Object objRememberedValue31 = composer4.rememberedValue();
                    if (zChanged23 || objRememberedValue31 == Composer.INSTANCE.getEmpty()) {
                        final int i8 = 1;
                        serverConfig = serverConfig5;
                        objRememberedValue31 = new Function0() { // from class: uy1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i9 = i8;
                                ServerConfig serverConfig6 = serverConfig;
                                switch (i9) {
                                    case 0:
                                        xy1.c(function15, mutableState10, mutableState4, mutableState9, serverConfig6.getId(), -1, qy1.a);
                                        break;
                                    default:
                                        xy1.c(function15, mutableState10, mutableState4, mutableState9, serverConfig6.getId(), 1, qy1.b);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue31);
                    } else {
                        serverConfig = serverConfig5;
                    }
                    xy1.d(str29, serverConfig, strN, zAreEqual4, z, z2, focusRequester3, focusRequester4, function16, function17, function18, (Function0) objRememberedValue31, composer4, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ no0(MutableState mutableState, NavHostController navHostController, ServerPreferences serverPreferences, Context context, MutableState mutableState2, UserPreferences userPreferences, ServerConfig serverConfig) {
        this.b = mutableState;
        this.d = navHostController;
        this.e = serverPreferences;
        this.c = context;
        this.g = mutableState2;
        this.h = userPreferences;
        this.i = serverConfig;
    }

    public /* synthetic */ no0(ServerConfig serverConfig, NavHostController navHostController, ServerPreferences serverPreferences, Context context, MutableState mutableState, UserPreferences userPreferences, CoroutineScope coroutineScope) {
        this.d = serverConfig;
        this.e = navHostController;
        this.g = serverPreferences;
        this.h = context;
        this.b = mutableState;
        this.i = userPreferences;
        this.c = coroutineScope;
    }

    public /* synthetic */ no0(List list, String str, CoroutineScope coroutineScope, LazyListState lazyListState, FocusRequester focusRequester, Function2 function2, MutableState mutableState) {
        this.d = list;
        this.e = str;
        this.c = coroutineScope;
        this.g = lazyListState;
        this.h = focusRequester;
        this.i = function2;
        this.b = mutableState;
    }
}
