package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.DeviceIdManager;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.net.Proxy;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e31 {
    public static final Set a = SetsKt.setOf((Object[]) new String[]{"detail/{itemId}?episodeId={episodeId}", "player/{itemId}?mediaSourceId={mediaSourceId}", "dlna_player?uri={uri}&title={title}&useProxy={useProxy}"});

    public static final void a(NavBackStackEntry navBackStackEntry, ServerConfig serverConfig, final boolean z, Function1 function1, Function1 function2, Function1 function3, final Function2 function4, final Function2 function5, Function1 function6, Function0 function0, Function0 function7, Function0 function8, Function0 function9, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(806728593);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(navBackStackEntry) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(serverConfig) : composerStartRestartGroup.changedInstance(serverConfig) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function6) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function7) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function8) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function9) ? 256 : 128;
        }
        int i6 = i4;
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (i6 & Input.Keys.NUMPAD_3) == 146) ? false : true, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(806728593, i5, i6, "com.dh.myembyapp.HomeScreenHost (MainActivity.kt:1125)");
            }
            zq0 zq0Var = (zq0) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(zq0.class), navBackStackEntry, (String) null, (ViewModelProvider.Factory) null, navBackStackEntry.getDefaultViewModelCreationExtras(), composerStartRestartGroup, ((i5 & 14) << 3) & Input.Keys.FORWARD_DEL, 0);
            int i7 = i5 & 896;
            boolean z2 = (i7 == 256) | ((i5 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wb0(1, z, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function10 = (Function1) objRememberedValue;
            boolean z3 = (i7 == 256) | ((i5 & 57344) == 16384);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new wb0(2, z, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function11 = (Function1) objRememberedValue2;
            boolean z4 = (i7 == 256) | ((i5 & 458752) == 131072);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new wb0(3, z, function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            boolean z5 = (i7 == 256) | ((i5 & 3670016) == 1048576);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                final int i8 = 0;
                objRememberedValue4 = new Function2() { // from class: x21
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i9 = i8;
                        Function2 function13 = function4;
                        boolean z6 = z;
                        String str = (String) obj;
                        String str2 = (String) obj2;
                        switch (i9) {
                            case 0:
                                str.getClass();
                                str2.getClass();
                                if (z6) {
                                    function13.invoke(str, str2);
                                }
                                break;
                            default:
                                str.getClass();
                                str2.getClass();
                                if (z6) {
                                    function13.invoke(str, str2);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function2 function13 = (Function2) objRememberedValue4;
            boolean z6 = (i7 == 256) | ((i5 & 29360128) == 8388608);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                final int i9 = 1;
                objRememberedValue5 = new Function2() { // from class: x21
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i10 = i9;
                        Function2 function14 = function5;
                        boolean z7 = z;
                        String str = (String) obj;
                        String str2 = (String) obj2;
                        switch (i10) {
                            case 0:
                                str.getClass();
                                str2.getClass();
                                if (z7) {
                                    function14.invoke(str, str2);
                                }
                                break;
                            default:
                                str.getClass();
                                str2.getClass();
                                if (z7) {
                                    function14.invoke(str, str2);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function2 function14 = (Function2) objRememberedValue5;
            boolean z7 = (i7 == 256) | ((i5 & 234881024) == 67108864);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new wb0(4, z, function6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Function1 function15 = (Function1) objRememberedValue6;
            boolean z8 = (i7 == 256) | ((i5 & 1879048192) == 536870912);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new fv(z, function0, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            Function0 function16 = (Function0) objRememberedValue7;
            boolean z9 = (i7 == 256) | ((i6 & 14) == 4);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new fv(z, function7, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Function0 function17 = (Function0) objRememberedValue8;
            boolean z10 = (i7 == 256) | ((i6 & Input.Keys.FORWARD_DEL) == 32);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new fv(z, function8, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Function0 function18 = (Function0) objRememberedValue9;
            boolean z11 = (i7 == 256) | ((i6 & 896) == 256);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new fv(z, function9, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composer2 = composerStartRestartGroup;
            bq0.f(function10, function11, function12, function13, function14, function15, function16, function17, function18, (Function0) objRememberedValue10, new cq0(serverConfig.getId(), serverConfig.getAlias(), serverConfig.getDirectOnly(), serverConfig.getCustomIconPath(), serverConfig.getActiveBackupRouteId()), zq0Var, z, composer2, 0, i7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new so0(navBackStackEntry, serverConfig, z, function1, function2, function3, function4, function5, function6, function0, function7, function8, function9, i, i2));
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v15 Object, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void b(com.dh.myembyapp.data.preferences.UserPreferences r50, defpackage.nb0 r51, kotlin.jvm.functions.Function0 r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            Method dump skipped, instruction units count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e31.b(com.dh.myembyapp.data.preferences.UserPreferences, nb0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final boolean c(Context context, ServerPreferences serverPreferences, UserPreferences userPreferences, MutableState mutableState, ServerConfig serverConfig, boolean z) {
        if (!serverConfig.isLoggedIn()) {
            return false;
        }
        RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
        retrofitClient.initialize(serverConfig.getFullUrl());
        String accessToken = serverConfig.getAccessToken();
        accessToken.getClass();
        String userId = serverConfig.getUserId();
        userId.getClass();
        retrofitClient.setAuthToken(accessToken, userId);
        retrofitClient.setDeviceId(DeviceIdManager.INSTANCE.getDeviceId(context));
        retrofitClient.setTrustAllCerts(serverConfig.getTrustAllCerts());
        Proxy proxy = lr1.a;
        lr1.c(serverConfig.getDirectOnly());
        mutableState.setValue(serverConfig.getId());
        if (!z) {
            return true;
        }
        serverPreferences.setLastUsedServerId(serverConfig.getId());
        userPreferences.saveLastUsedAggregateHub(false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(NavHostController navHostController, MutableState mutableState, ServerPreferences serverPreferences, Context context, UserPreferences userPreferences, String str, String str2, String str3, String str4, boolean z) {
        SavedStateHandle savedStateHandle;
        String str5 = (String) mutableState.getValue();
        if (f(serverPreferences, context, userPreferences, mutableState, str, false)) {
            str2.getClass();
            NavController.navigate$default((NavController) navHostController, str3 != null ? ll0.e("detail/", str2, "?episodeId=", str3) : "detail/".concat(str2), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
            NavBackStackEntry currentBackStackEntry = navHostController.getCurrentBackStackEntry();
            if (currentBackStackEntry == null || (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) == null) {
                return;
            }
            if (Intrinsics.areEqual(str5, str)) {
                savedStateHandle.remove("detailShouldRestoreServer");
                savedStateHandle.remove("detailRestoreServerId");
            } else {
                savedStateHandle.set("detailShouldRestoreServer", Boolean.TRUE);
                savedStateHandle.set("detailRestoreServerId", str5);
            }
            if (z) {
                savedStateHandle.set("detailShowServerBadge", Boolean.TRUE);
            } else {
                savedStateHandle.remove("detailShowServerBadge");
            }
            if (str4 != null) {
                savedStateHandle.set("detailPreselectMediaSourceId", str4);
            } else {
                savedStateHandle.remove("detailPreselectMediaSourceId");
            }
        }
    }

    public static final boolean f(ServerPreferences serverPreferences, Context context, UserPreferences userPreferences, MutableState mutableState, String str, boolean z) {
        ServerConfig effectiveServerConfig;
        ServerConfig serverById = serverPreferences.getServerById(str);
        if (serverById == null || (effectiveServerConfig = serverById.getEffectiveServerConfig()) == null) {
            return false;
        }
        return c(context, serverPreferences, userPreferences, mutableState, effectiveServerConfig, z);
    }
}
