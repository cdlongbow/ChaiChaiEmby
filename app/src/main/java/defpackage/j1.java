package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultLauncherHolder;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.DeviceIdManager;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.net.Proxy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ j1(String str, ExoPlayer exoPlayer, Function2 function2, Function0 function0, Function0 function1) {
        this.a = 10;
        this.d = str;
        this.b = exoPlayer;
        this.c = function2;
        this.e = function0;
        this.g = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intent intentD;
        Object objM8825constructorimpl;
        ServerConfig serverById;
        String str;
        List<BackupRouteConfig> backupRoutesSafe;
        int i = 7;
        int i2 = 4;
        int i3 = 16;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                return ActivityResultRegistryKt.rememberLauncherForActivityResult$lambda$4$0((ActivityResultLauncherHolder) this.b, (ActivityResultRegistry) this.c, (String) this.d, (ActivityResultContract) this.e, (State) this.g, (DisposableEffectScope) obj);
            case 1:
                return AnchoredDraggableState.Companion.Saver$lambda$7((Function1) this.b, (Function0) this.c, (AnimationSpec) this.d, (DecayAnimationSpec) this.e, (Function1) this.g, obj);
            case 2:
                return AndroidLegacyPlatformTextInputServiceAdapter.startInput$lambda$0((TextFieldValue) this.b, (AndroidLegacyPlatformTextInputServiceAdapter) this.c, (ImeOptions) this.d, (Function1) this.e, (Function1) this.g, (LegacyTextInputMethodRequest) obj);
            case 3:
                MutableState mutableState = (MutableState) this.b;
                String str2 = (String) this.d;
                MutableState mutableState2 = (MutableState) this.c;
                MutableState mutableState3 = (MutableState) this.e;
                MutableState mutableState4 = (MutableState) this.g;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                List list = (List) mutableState.getValue();
                lazyListScope.items(list.size(), new w5(8, new xw(2), list), new x5(list, 7), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new oi(list, str2, mutableState2, mutableState3, mutableState4, 2)));
                return Unit.INSTANCE;
            case 4:
                MutableState mutableState5 = (MutableState) this.b;
                MutableState mutableState6 = (MutableState) this.c;
                MutableState mutableState7 = (MutableState) this.d;
                MutableState mutableState8 = (MutableState) this.e;
                FocusRequester focusRequester = (FocusRequester) this.g;
                DanmakuConfig danmakuConfig = (DanmakuConfig) obj;
                mutableState5.setValue(Boolean.valueOf(danmakuConfig.getEnabled()));
                mutableState6.setValue(CollectionsKt.toMutableList((Collection) danmakuConfig.getApiSlotNames()));
                mutableState7.setValue(CollectionsKt.toMutableList((Collection) danmakuConfig.getApiSlotUrls()));
                IntRange intRange = new IntRange(0, 4);
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10)), 16));
                Iterator<Integer> it = intRange.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    Pair pair = TuplesKt.to(Integer.valueOf(iNextInt), Boolean.valueOf(danmakuConfig.isApiUseProxy(iNextInt)));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                mutableState8.setValue(MapsKt.toMutableMap(linkedHashMap));
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new vm(focusRequester, continuation, 3), 3, null);
                return Unit.INSTANCE;
            case 5:
                List list2 = (List) this.b;
                String str3 = (String) this.d;
                String str4 = (String) this.c;
                FocusRequester focusRequester2 = (FocusRequester) this.e;
                Function2 function2 = (Function2) this.g;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                lazyListScope2.items(list2.size(), new w5(i3, new xw(i), list2), new x5(list2, 16), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new oi(list2, str3, str4, focusRequester2, function2, 3)));
                return Unit.INSTANCE;
            case 6:
                Context context = (Context) this.b;
                MutableState mutableState9 = (MutableState) this.c;
                MutableState mutableState10 = (MutableState) this.d;
                MutableState mutableState11 = (MutableState) this.e;
                MutableState mutableState12 = (MutableState) this.g;
                bi0 bi0Var = (bi0) obj;
                bi0Var.getClass();
                zh0 zh0Var = (zh0) mutableState9.getValue();
                if (zh0Var == null) {
                    return Unit.INSTANCE;
                }
                String str5 = zh0Var.b;
                String str6 = zh0Var.c;
                context.getClass();
                di0 di0Var = bi0Var.e;
                String str7 = bi0Var.c;
                String str8 = bi0Var.b;
                int iOrdinal = di0Var.ordinal();
                if (iOrdinal == 0) {
                    intentD = hi0.d(str6, str5);
                } else {
                    if (iOrdinal != 1) {
                        qu.f();
                        return null;
                    }
                    intentD = hi0.f(str6, str5);
                }
                intentD.setClassName(str8, str7);
                intentD.addFlags(268435456);
                try {
                    
                    context.startActivity(intentD);
                    objM8825constructorimpl = Unit.INSTANCE;
                    break;
                } catch (Throwable th) {
                    
                    objM8825constructorimpl = ResultKt.createFailure(th);
                }
                Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
                if (thM8828exceptionOrNullimpl != null) {
                    Log.e("ExternalPlayerSupport", ll0.e("启动外部播放器失败: ", str8, "/", str7), thM8828exceptionOrNullimpl);
                }
                if (Result.m8832isSuccessimpl(objM8825constructorimpl)) {
                    mutableState10.setValue(null);
                    mutableState9.setValue(null);
                    mutableState11.setValue(null);
                    mutableState12.setValue(Boolean.FALSE);
                } else {
                    mutableState11.setValue("启动 " + bi0Var.a + " 失败");
                }
                return Unit.INSTANCE;
            case 7:
                ServerPreferences serverPreferences = (ServerPreferences) this.b;
                Context context2 = (Context) this.c;
                zq0 zq0Var = (zq0) this.d;
                MutableState mutableState13 = (MutableState) this.e;
                MutableState mutableState14 = (MutableState) this.g;
                tn0 tn0Var = (tn0) obj;
                tn0Var.getClass();
                String str9 = tn0Var.a;
                String str10 = tn0Var.b;
                String str11 = ((cq0) mutableState13.getValue()).a;
                if (str11 != null && (serverById = serverPreferences.getServerById(str11)) != null) {
                    if (str9 == null || ((backupRoutesSafe = serverById.getBackupRoutesSafe()) != null && backupRoutesSafe.isEmpty())) {
                        str = null;
                    } else {
                        Iterator<T> it2 = backupRoutesSafe.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                str = null;
                            } else if (Intrinsics.areEqual(((BackupRouteConfig) it2.next()).getId(), str9)) {
                                str = str9;
                            }
                        }
                    }
                    ServerConfig serverConfigCopy$default = ServerConfig.copy$default(serverById, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, false, false, false, false, null, str, null, null, 0L, 3932159, null);
                    serverPreferences.saveServer(serverConfigCopy$default);
                    ServerConfig effectiveServerConfig = serverConfigCopy$default.getEffectiveServerConfig();
                    RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
                    retrofitClient.initialize(effectiveServerConfig.getFullUrl());
                    String accessToken = effectiveServerConfig.getAccessToken();
                    String userId = effectiveServerConfig.getUserId();
                    if (accessToken != null && !StringsKt.isBlank(accessToken) && userId != null && !StringsKt.isBlank(userId)) {
                        retrofitClient.setAuthToken(accessToken, userId);
                    }
                    retrofitClient.setDeviceId(DeviceIdManager.INSTANCE.getDeviceId(context2));
                    retrofitClient.setTrustAllCerts(effectiveServerConfig.getTrustAllCerts());
                    Proxy proxy = lr1.a;
                    lr1.c(effectiveServerConfig.getDirectOnly());
                    cq0 cq0Var = (cq0) mutableState13.getValue();
                    boolean directOnly = effectiveServerConfig.getDirectOnly();
                    String activeBackupRouteId = serverConfigCopy$default.getActiveBackupRouteId();
                    String str12 = cq0Var.a;
                    String str13 = cq0Var.b;
                    String str14 = cq0Var.d;
                    str13.getClass();
                    mutableState13.setValue(new cq0(str12, str13, directOnly, str14, activeBackupRouteId));
                    mutableState14.setValue(Boolean.FALSE);
                    Toast.makeText(context2, "线路已切换到" + str10, 0).show();
                    zq0Var.E(false, false);
                }
                return Unit.INSTANCE;
            case 8:
                List list3 = (List) this.b;
                Set set = (Set) this.c;
                String str15 = (String) this.d;
                FocusRequester focusRequester3 = (FocusRequester) this.e;
                Function2 function3 = (Function2) this.g;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                lazyListScope3.items(list3.size(), new w5(23, new ox0(i2), list3), new x5(list3, 23), ComposableLambdaKt.composableLambdaInstance(802480018, true, new oi(list3, set, str15, focusRequester3, function3, 4)));
                return Unit.INSTANCE;
            case 9:
                return NavControllerImpl.executeRestoreState$lambda$57((Ref.BooleanRef) this.b, (List) this.c, (Ref.IntRef) this.d, (NavControllerImpl) this.e, (Bundle) this.g, (NavBackStackEntry) obj);
            case 10:
                String str16 = (String) this.d;
                ExoPlayer exoPlayer = (ExoPlayer) this.b;
                Function2 function4 = (Function2) this.c;
                Function0 function0 = (Function0) this.e;
                Function0 function1 = (Function0) this.g;
                yf yfVar = (yf) obj;
                yfVar.getClass();
                boolean zAreEqual = Intrinsics.areEqual(yfVar.a, str16);
                pg.c(exoPlayer, yfVar);
                function4.invoke(yfVar, Boolean.valueOf(zAreEqual));
                function0.invoke();
                function1.invoke();
                return Unit.INSTANCE;
            case 11:
                return TextFieldCursorKt.cursor$lambda$0$2$0((CursorAnimationState) this.b, (OffsetMapping) this.c, (TextFieldValue) this.d, (LegacyTextFieldState) this.e, (Brush) this.g, (ContentDrawScope) obj);
            default:
                Function1 function5 = (Function1) this.b;
                MutableState mutableState15 = (MutableState) this.c;
                MutableState mutableState16 = (MutableState) this.d;
                MutableState mutableState17 = (MutableState) this.e;
                MutableState mutableState18 = (MutableState) this.g;
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState15.setValue(Boolean.valueOf(focusState.getHasFocus()));
                function5.invoke(Boolean.valueOf(focusState.getHasFocus()));
                if (!focusState.getHasFocus()) {
                    Boolean bool = Boolean.FALSE;
                    mutableState16.setValue(bool);
                    mutableState17.setValue(bool);
                    Job job = (Job) mutableState18.getValue();
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    mutableState18.setValue(null);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j1(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
    }

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.g = obj5;
    }
}
