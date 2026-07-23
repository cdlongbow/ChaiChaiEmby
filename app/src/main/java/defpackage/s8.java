package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import com.dh.myembyapp.data.preferences.AggregateSearchHistoryPreferences;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.server.SearchInputServerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r7v20, types: [kotlin.coroutines.Continuation] */
    public static final void a(Function0 function0, Function2 function2, boolean z, boolean z2, boolean z3, Modifier modifier, v8 v8Var, Composer composer, int i) {
        Composer composer2;
        v8 v8Var2;
        Composer composer3;
        v8 v8Var3;
        int i2;
        int i3;
        Context context;
        Object o6Var;
        int i4;
        int i5;
        SnapshotMutationPolicy snapshotMutationPolicy;
        v8 v8Var4;
        boolean z4;
        boolean z5;
        List list;
        Object p6Var;
        Composer composer4;
        int i6;
        char c;
        int i7;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        State state;
        Boolean bool;
        MutableState mutableState4;
        FocusRequester focusRequester;
        MutableState mutableState5;
        UserPreferences userPreferences;
        List list2;
        State state2;
        v8 v8Var5;
        boolean z6;
        List list3;
        function0.getClass();
        function2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-934397766);
        int i8 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i8 |= 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i8) != 599186, i8 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(v8.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                composer3 = composerStartRestartGroup;
                v8Var3 = (v8) viewModel;
                i2 = i8 & (-3670017);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i2 = i8 & (-3670017);
                composer3 = composerStartRestartGroup;
                v8Var3 = v8Var;
            }
            int i9 = i2;
            composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934397766, i9, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchScreen (AggregateSearchScreen.kt:47)");
            }
            Context context2 = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composer3.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ServerPreferences(context2);
                composer3.updateRememberedValue(objRememberedValue);
            }
            ServerPreferences serverPreferences = (ServerPreferences) objRememberedValue;
            Object objRememberedValue2 = composer3.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new UserPreferences(context2);
                composer3.updateRememberedValue(objRememberedValue2);
            }
            UserPreferences userPreferences2 = (UserPreferences) objRememberedValue2;
            Object objRememberedValue3 = composer3.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new AggregateSearchHistoryPreferences(context2);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences = (AggregateSearchHistoryPreferences) objRememberedValue3;
            Object objRememberedValue4 = composer3.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                List<ServerConfig> allServers = serverPreferences.getAllServers();
                ArrayList arrayList = new ArrayList();
                for (Object obj : allServers) {
                    ServerConfig serverConfig = (ServerConfig) obj;
                    if (serverConfig.isVerified() && serverConfig.isLoggedIn()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(((ServerConfig) obj2).getEffectiveServerConfig());
                }
                composer3.updateRememberedValue(arrayList2);
                objRememberedValue4 = arrayList2;
            }
            List list4 = (List) objRememberedValue4;
            State stateCollectAsState = SnapshotStateKt.collectAsState(v8Var3.c, null, composer3, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(v8Var3.e, null, composer3, 0, 1);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(v8Var3.g, null, composer3, 0, 1);
            State stateCollectAsState4 = SnapshotStateKt.collectAsState(v8Var3.i, null, composer3, 0, 1);
            State stateCollectAsState5 = SnapshotStateKt.collectAsState(v8Var3.p, null, composer3, 0, 1);
            State stateCollectAsState6 = SnapshotStateKt.collectAsState(v8Var3.k, null, composer3, 0, 1);
            State stateCollectAsState7 = SnapshotStateKt.collectAsState(v8Var3.m, null, composer3, 0, 1);
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer3, (i9 >> 6) & 14);
            Object objRememberedValue5 = composer3.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue5 == companion2.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences2.getVideoVersionPrioritySettings(), null, 2, null);
                composer3.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue5 = mutableStateMutableStateOf$default;
                i3 = 2;
            } else {
                i3 = 2;
            }
            MutableState mutableState6 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composer3.rememberedValue();
            if (objRememberedValue6 == companion2.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aggregateSearchHistoryPreferences.getHistory(), null, i3, null);
                composer3.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue6 = mutableStateMutableStateOf$default2;
            }
            MutableState mutableState7 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composer3.rememberedValue();
            if (objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = mr.n(composer3);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue7;
            Object objRememberedValue8 = composer3.rememberedValue();
            if (objRememberedValue8 == companion2.getEmpty()) {
                if (((String) stateCollectAsState5.getValue()) == null || ((list3 = (List) stateCollectAsState3.getValue()) != null && list3.isEmpty())) {
                    z6 = false;
                    break;
                }
                Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((py1) it.next()).b.isEmpty()) {
                            z6 = true;
                            break;
                        }
                    } else {
                        z6 = false;
                        break;
                    }
                }
                objRememberedValue8 = mr.m(z6, null, 2, null, composer3);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue8;
            Boolean boolValueOf = Boolean.valueOf(z2);
            List list5 = (List) stateCollectAsState3.getValue();
            int i11 = i9 & 7168;
            boolean zChanged = (i11 == 2048) | composer3.changed(stateCollectAsState3) | composer3.changedInstance(v8Var3) | composer3.changedInstance(context2);
            Object objRememberedValue9 = composer3.rememberedValue();
            if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                v8 v8Var6 = v8Var3;
                i4 = i11;
                i5 = 2;
                snapshotMutationPolicy = null;
                o6Var = new o6(z2, stateCollectAsState3, v8Var6, context, null, 1);
                v8Var4 = v8Var6;
                composer3.updateRememberedValue(o6Var);
            } else {
                context = context2;
                o6Var = objRememberedValue9;
                i4 = i11;
                v8Var4 = v8Var3;
                i5 = 2;
                snapshotMutationPolicy = null;
            }
            int i12 = (i9 >> 9) & 14;
            EffectsKt.LaunchedEffect(boolValueOf, list5, (Function2) o6Var, composer3, i12);
            Object objRememberedValue10 = composer3.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue10 == companion3.getEmpty()) {
                objRememberedValue10 = new SearchInputServerManager(context);
                composer3.updateRememberedValue(objRememberedValue10);
            }
            SearchInputServerManager searchInputServerManager = (SearchInputServerManager) objRememberedValue10;
            Object objRememberedValue11 = composer3.rememberedValue();
            if (objRememberedValue11 == companion3.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy, i5, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue11);
            }
            MutableState mutableState9 = (MutableState) objRememberedValue11;
            Object objRememberedValue12 = composer3.rememberedValue();
            if (objRememberedValue12 == companion3.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i5, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue12);
            }
            MutableState mutableState10 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composer3.rememberedValue();
            if (objRememberedValue13 == companion3.getEmpty()) {
                objRememberedValue13 = mr.n(composer3);
            }
            FocusRequester focusRequester3 = (FocusRequester) objRememberedValue13;
            if (z3 && z2) {
                composer3.startReplaceGroup(-957515776);
                boolean z7 = (i9 & 14) == 4;
                Object objRememberedValue14 = composer3.rememberedValue();
                if (z7 || objRememberedValue14 == companion3.getEmpty()) {
                    z4 = false;
                    objRememberedValue14 = new n8(0, function0);
                    composer3.updateRememberedValue(objRememberedValue14);
                } else {
                    z4 = false;
                }
                z5 = true;
                BackHandlerKt.BackHandler(z4, (Function0) objRememberedValue14, composer3, z4 ? 1 : 0, 1);
                composer3.endReplaceGroup();
            } else {
                z4 = false;
                z5 = true;
                composer3.startReplaceGroup(-957477336);
                composer3.endReplaceGroup();
            }
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            Boolean bool2 = (Boolean) stateRememberUpdatedState.getValue();
            bool2.getClass();
            Object r25 = (((((((((i4 == 2048 ? z5 : z4) | (composer3.changedInstance(searchInputServerManager) ? 1 : 0)) | (composer3.changed(stateCollectAsState) ? 1 : 0) ? 1 : 0) | (composer3.changedInstance(aggregateSearchHistoryPreferences) ? 1 : 0)) | (composer3.changedInstance(userPreferences2) ? 1 : 0)) == true ? 1 : 0) | (composer3.changedInstance(v8Var4) ? 1 : 0)) | (composer3.changedInstance(list4) ? 1 : 0)) == true ? 1 : 0) | (composer3.changed(stateRememberUpdatedState) ? 1 : 0);
            Object objRememberedValue15 = composer3.rememberedValue();
            if (r25 != 0 || objRememberedValue15 == companion3.getEmpty()) {
                list = list4;
                composer4 = composer3;
                i6 = i9;
                c = 2;
                i7 = 2048;
                p6Var = new p6(z2, searchInputServerManager, aggregateSearchHistoryPreferences, userPreferences2, v8Var4, list, stateCollectAsState, mutableState7, mutableState6, stateRememberUpdatedState, mutableState9, mutableState10, (Continuation) null);
                mutableState = mutableState9;
                mutableState2 = mutableState10;
                mutableState3 = mutableState6;
                state = stateRememberUpdatedState;
                composer4.updateRememberedValue(p6Var);
            } else {
                composer4 = composer3;
                i6 = i9;
                c = 2;
                mutableState = mutableState9;
                state = stateRememberUpdatedState;
                list = list4;
                mutableState3 = mutableState6;
                i7 = 2048;
                mutableState2 = mutableState10;
                p6Var = objRememberedValue15;
            }
            Composer composer5 = composer4;
            List list6 = list;
            EffectsKt.LaunchedEffect(boolValueOf2, list6, bool2, (Function2) p6Var, composer5, i12);
            Boolean boolValueOf3 = Boolean.valueOf(z2);
            String str = (String) stateCollectAsState5.getValue();
            State state3 = stateCollectAsState5;
            boolean zChanged2 = (i4 == i7) | composer5.changed(state3);
            Object objRememberedValue16 = composer5.rememberedValue();
            if (zChanged2 || objRememberedValue16 == companion3.getEmpty()) {
                Object r7 = snapshotMutationPolicy;
                bool = boolValueOf3;
                mutableState4 = mutableState8;
                q6 q6Var = new q6(z2, state3, mutableState4, r7, 1);
                state3 = state3;
                composer5.updateRememberedValue(q6Var);
                objRememberedValue16 = q6Var;
            } else {
                mutableState4 = mutableState8;
                bool = boolValueOf3;
            }
            EffectsKt.LaunchedEffect(bool, str, (Function2) objRememberedValue16, composer5, i12);
            Boolean boolValueOf4 = Boolean.valueOf(z2);
            Boolean bool3 = (Boolean) mutableState4.getValue();
            bool3.getClass();
            String str2 = (String) state3.getValue();
            List list7 = (List) stateCollectAsState3.getValue();
            Object[] objArr = new Object[4];
            objArr[0] = boolValueOf4;
            objArr[1] = bool3;
            objArr[c] = str2;
            objArr[3] = list7;
            boolean zChanged3 = (i4 == 2048) | composer5.changed(state3);
            Object objRememberedValue17 = composer5.rememberedValue();
            if (zChanged3 || objRememberedValue17 == companion3.getEmpty()) {
                focusRequester = focusRequester2;
                r8 r8Var = new r8(z2, focusRequester, mutableState4, state3, (Continuation) null);
                composer5.updateRememberedValue(r8Var);
                objRememberedValue17 = r8Var;
            } else {
                focusRequester = focusRequester2;
            }
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue17, composer5, 0);
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composer5.changedInstance(searchInputServerManager);
            Object objRememberedValue18 = composer5.rememberedValue();
            if (zChangedInstance || objRememberedValue18 == companion3.getEmpty()) {
                objRememberedValue18 = new c(searchInputServerManager, 3);
                composer5.updateRememberedValue(objRememberedValue18);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue18, composer5, 6);
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer5, 0, 1);
            boolean zChanged4 = composer5.changed((List) stateCollectAsState3.getValue()) | composer5.changed(((Boolean) state.getValue()).booleanValue()) | composer5.changed((VideoVersionPrioritySettings) mutableState3.getValue());
            Object objRememberedValue19 = composer5.rememberedValue();
            if (zChanged4 || objRememberedValue19 == companion3.getEmpty()) {
                List list8 = (List) stateCollectAsState3.getValue();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                Iterator it2 = list8.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    py1 py1Var = (py1) next;
                    arrayList3.add(TuplesKt.to(Integer.valueOf(i13), new t8(py1Var.a, py1Var.b, py1Var.c, py1Var.d)));
                    it2 = it2;
                    i13 = i14;
                }
                if (((Boolean) state.getValue()).booleanValue()) {
                    List listSortedWith = CollectionsKt.sortedWith(arrayList3, new b5(1, new b2(7, mutableState3)));
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
                    Iterator it3 = listSortedWith.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add((t8) ((Pair) it3.next()).getSecond());
                    }
                    objRememberedValue19 = arrayList4;
                } else {
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj3 = arrayList3.get(i15);
                        i15++;
                        arrayList5.add((t8) ((Pair) obj3).getSecond());
                    }
                    objRememberedValue19 = arrayList5;
                }
                composer5.updateRememberedValue(objRememberedValue19);
            }
            List list9 = (List) objRememberedValue19;
            String str3 = (String) stateCollectAsState.getValue();
            boolean zBooleanValue = ((Boolean) stateCollectAsState4.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) stateCollectAsState2.getValue()).booleanValue();
            int size3 = list6.size();
            Bitmap bitmap = (Bitmap) mutableState2.getValue();
            String str4 = (String) mutableState.getValue();
            VideoVersionPrioritySettings videoVersionPrioritySettings = (VideoVersionPrioritySettings) mutableState3.getValue();
            String str5 = (String) state3.getValue();
            boolean zBooleanValue3 = ((Boolean) mutableState4.getValue()).booleanValue();
            List list10 = (List) stateCollectAsState6.getValue();
            boolean zBooleanValue4 = ((Boolean) stateCollectAsState7.getValue()).booleanValue();
            List list11 = (List) mutableState7.getValue();
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null), Dp.m7813constructorimpl(48.0f), Dp.m7813constructorimpl(16.0f));
            boolean zChangedInstance2 = composer5.changedInstance(v8Var4);
            Object objRememberedValue20 = composer5.rememberedValue();
            if (zChangedInstance2 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue20 = new c(v8Var4, 4);
                composer5.updateRememberedValue(objRememberedValue20);
            }
            Function1 function1 = (Function1) objRememberedValue20;
            State state4 = state;
            boolean zChanged5 = composer5.changed(stateCollectAsState) | composer5.changedInstance(r6) | composer5.changedInstance(r7) | composer5.changedInstance(v8Var4) | composer5.changedInstance(list6) | composer5.changed(state4);
            Object objRememberedValue21 = composer5.rememberedValue();
            if (zChanged5 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                mutableState5 = mutableState3;
                objRememberedValue21 = new c4((AggregateSearchHistoryPreferences) r6, r7, v8Var4, list6, stateCollectAsState, mutableState7, mutableState5, state4);
                userPreferences = r7;
                list2 = list6;
                state2 = stateCollectAsState;
                composer5.updateRememberedValue(objRememberedValue21);
            } else {
                mutableState5 = mutableState3;
                userPreferences = userPreferences2;
                state2 = stateCollectAsState;
                list2 = list6;
            }
            Function0 function3 = (Function0) objRememberedValue21;
            boolean zChangedInstance3 = composer5.changedInstance(v8Var4) | ((i6 & Input.Keys.FORWARD_DEL) == 32);
            Object objRememberedValue22 = composer5.rememberedValue();
            if (zChangedInstance3 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue22 = new p8(0, v8Var4, function2);
                composer5.updateRememberedValue(objRememberedValue22);
            }
            Function3 function4 = (Function3) objRememberedValue22;
            boolean zChangedInstance4 = composer5.changedInstance(v8Var4) | composer5.changed(state2) | composer5.changedInstance(r6) | composer5.changedInstance(userPreferences) | composer5.changedInstance(list2) | composer5.changed(r30);
            Object objRememberedValue23 = composer5.rememberedValue();
            if (zChangedInstance4 || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue23 = new q8(v8Var4, r6, userPreferences, list2, state2, mutableState7, mutableState5, r30, 0);
                composer5.updateRememberedValue(objRememberedValue23);
            }
            Function1 function5 = (Function1) objRememberedValue23;
            boolean zChangedInstance5 = composer5.changedInstance(v8Var4) | composer5.changed(state2) | composer5.changedInstance(r6) | composer5.changedInstance(userPreferences) | composer5.changedInstance(list2) | composer5.changed(r30);
            Object objRememberedValue24 = composer5.rememberedValue();
            if (zChangedInstance5 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                v8 v8Var7 = v8Var4;
                objRememberedValue24 = new q8(v8Var7, r6, userPreferences, list2, state2, mutableState7, mutableState5, state4, 1);
                v8Var5 = v8Var7;
                composer5.updateRememberedValue(objRememberedValue24);
            } else {
                v8Var5 = v8Var4;
            }
            Function1 function6 = (Function1) objRememberedValue24;
            boolean zChangedInstance6 = composer5.changedInstance(r6);
            Object objRememberedValue25 = composer5.rememberedValue();
            if (zChangedInstance6 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue25 = new i5(aggregateSearchHistoryPreferences, mutableState7, 1);
                composer5.updateRememberedValue(objRememberedValue25);
            }
            m8.a(str3, zBooleanValue, zBooleanValue2, list9, size3, bitmap, str4, z, videoVersionPrioritySettings, str5, zBooleanValue3, focusRequester, focusRequester3, function1, function3, function4, modifierM1000paddingVpY3zN4, null, null, list10, zBooleanValue4, function5, list11, function6, (Function0) objRememberedValue25, null, composer5, (i6 << 15) & 29360128, 432, 0, 33947648);
            composer2 = composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v8Var2 = v8Var5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            v8Var2 = v8Var;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new o8(function0, function2, z, z2, z3, modifier, v8Var2, i));
        }
    }

    public static final void b(AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, v8 v8Var, List list, MutableState mutableState, MutableState mutableState2, State state, String str) {
        v8 v8Var2 = v8Var;
        String str2 = str;
        String string = StringsKt.trim((CharSequence) str2).toString();
        if (!StringsKt.isBlank(string)) {
            mutableState.setValue(aggregateSearchHistoryPreferences.addKeyword(string));
        }
        mutableState2.setValue(userPreferences.getVideoVersionPrioritySettings());
        boolean zBooleanValue = ((Boolean) state.getValue()).booleanValue();
        v8Var2.getClass();
        list.getClass();
        str2.getClass();
        if (StringsKt.isBlank(str2)) {
            v8Var2.b();
            return;
        }
        long jIncrementAndGet = v8Var2.q.incrementAndGet();
        Job job = v8Var2.n.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Log.d("AggregateSearch", "开始聚合搜索: keyword=" + str2 + ", servers=" + list.size());
        v8Var2.b.setValue(str2);
        MutableStateFlow mutableStateFlow = v8Var2.h;
        Boolean bool = Boolean.TRUE;
        mutableStateFlow.setValue(bool);
        v8Var2.d.setValue(bool);
        MutableStateFlow mutableStateFlow2 = v8Var2.f;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new py1((ServerConfig) it.next(), CollectionsKt.emptyList(), true, null, 8));
        }
        mutableStateFlow2.setValue(arrayList);
        v8Var2.r.clear();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(v8Var2), Dispatchers.getIO(), null, new u8(v8Var2, (ServerConfig) obj, str2, zBooleanValue, jIncrementAndGet, i, null), 2, null);
            v8Var2 = v8Var;
            str2 = str;
            i = i2;
        }
    }
}
