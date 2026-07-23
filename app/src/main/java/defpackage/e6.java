package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Shadow;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.DanmakuSettings;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import com.dh.myembyapp.data.preferences.ServerPreferences;

import java.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class e6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(List list, MutableState mutableState, MediaItem mediaItem, Continuation continuation) {
        super(2, continuation);
        this.a = 2;
        this.c = list;
        this.d = mutableState;
        this.b = mediaItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                return new e6((p7) obj4, (List) obj3, (MutableState) obj2, continuation, 0);
            case 1:
                return new e6((State) obj4, (DanmakuPlayer) obj3, (State) obj2, continuation, 1);
            case 2:
                return new e6((List) obj3, (MutableState) obj2, (MediaItem) obj4, continuation);
            case 3:
                return new e6((Function1) obj4, (MediaItem) obj3, (MutableState) obj2, continuation, 3);
            case 4:
                return new e6(obj4, (MutableState) obj2, (State) obj3, continuation, 4);
            case 5:
                return new e6((ServerConfig) obj4, (zq0) obj3, (MutableState) obj2, continuation, 5);
            case 6:
                return new e6((zq0) obj4, (ServerPreferences) obj3, (MutableState) obj2, continuation, 6);
            case 7:
                return new e6(obj4, (MutableState) obj2, (State) obj3, continuation, 7);
            case 8:
                return new e6((String) obj4, (va0) obj3, (MutableState) obj2, continuation, 8);
            case 9:
                return new e6((to1) obj4, (Context) obj3, (String) obj2, continuation, 9);
            case 10:
                return new e6((Activity) obj4, (Float) obj3, (on1) obj2, continuation, 10);
            case 11:
                return new e6((to1) obj4, (String) obj3, (MutableState) obj2, continuation, 11);
            case 12:
                return new e6((kx) obj4, (State) obj3, (MutableIntState) obj2, continuation, 12);
            case 13:
                return new e6((kx) obj4, (jw) obj3, (Context) obj2, continuation, 13);
            case 14:
                return new e6(obj4, (MutableState) obj2, (State) obj3, continuation, 14);
            default:
                return new e6((String) obj4, (Context) obj3, (String) obj2, continuation, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
        }
        return ((e6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0604  */
    /* JADX WARN: Code duplicated, block: B:191:0x060d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0612  */
    /* JADX WARN: Code duplicated, block: B:200:0x0628  */
    /* JADX WARN: Code duplicated, block: B:205:0x0641  */
    /* JADX WARN: Code duplicated, block: B:206:0x0644  */
    /* JADX WARN: Code duplicated, block: B:253:0x0615 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x061e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x063c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x05fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x05fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x05fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[LOOP:7: B:198:0x0622->B:261:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0233  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MediaItem mediaItem;
        rg0 rg0Var;
        String str;
        rg0 rg0Var2;
        String id;
        List list;
        Iterator it;
        ServerConfig serverConfig;
        Display defaultDisplay;
        Object next;
        jb0 jb0Var;
        View decorView;
        int i = this.a;
        int i2 = 0;
        Object r7 = 0;
        mode = null;
        mode = null;
        Display.Mode mode = null;
        string = null;
        String string = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                float f = f7.a;
                boolean zBooleanValue = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                p7 p7Var = (p7) obj4;
                AtomicLong atomicLong = p7Var.p;
                MutableStateFlow mutableStateFlow = p7Var.k;
                if (zBooleanValue) {
                    List list2 = (List) obj3;
                    list2.getClass();
                    long jIncrementAndGet = atomicLong.incrementAndGet();
                    if (list2.isEmpty()) {
                        mutableStateFlow.setValue(MapsKt.emptyMap());
                    } else {
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : list2) {
                            if (hashSet.add(((ServerConfig) obj5).getId())) {
                                arrayList.add(obj5);
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj6 = arrayList.get(i2);
                            i2++;
                            Pair pair = TuplesKt.to(((ServerConfig) obj6).getId(), ServerPingState.INSTANCE.getMeasuring());
                            linkedHashMap.put(pair.getFirst(), pair.getSecond());
                        }
                        mutableStateFlow.setValue(linkedHashMap);
                        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(p7Var), Dispatchers.getIO(), null, new n7(arrayList, p7Var, jIncrementAndGet, null, 1), 2, null);
                    }
                } else {
                    atomicLong.incrementAndGet();
                    mutableStateFlow.setValue(MapsKt.emptyMap());
                }
                return Unit.INSTANCE;
            case 1:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (((up1) ((State) obj4).getValue()) != null) {
                    l00.b((DanmakuPlayer) obj3, (State) obj2);
                }
                return Unit.INSTANCE;
            case 2:
                MutableState mutableState = (MutableState) obj2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List list3 = (List) obj3;
                if (list3.isEmpty()) {
                    Shadow shadow = u90.o;
                    mutableState.setValue(null);
                    return Unit.INSTANCE;
                }
                if (list3.isEmpty()) {
                    mediaItem = (MediaItem) obj4;
                    for (Object obj7 : list3) {
                        rg0Var2 = (rg0) obj7;
                        if (mediaItem != null) {
                            id = mediaItem.getId();
                        } else {
                            id = null;
                        }
                        if (id != null) {
                            list = rg0Var2.b;
                            if (list.isEmpty()) {
                                continue;
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        continue;
                                    } else if (Intrinsics.areEqual(((MediaItem) it.next()).getId(), mediaItem.getId())) {
                                        r7 = obj7;
                                        rg0Var = (rg0) r7;
                                        if (rg0Var != null) {
                                            str = rg0Var.a;
                                        } else {
                                            str = ((rg0) CollectionsKt.first(list3)).a;
                                        }
                                        Shadow shadow2 = u90.o;
                                        mutableState.setValue(str);
                                    }
                                }
                            }
                        }
                    }
                    rg0Var = (rg0) r7;
                    if (rg0Var != null) {
                        str = rg0Var.a;
                    } else {
                        str = ((rg0) CollectionsKt.first(list3)).a;
                    }
                    Shadow shadow3 = u90.o;
                    mutableState.setValue(str);
                } else {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        String str2 = ((rg0) it2.next()).a;
                        Shadow shadow4 = u90.o;
                        if (Intrinsics.areEqual(str2, (String) mutableState.getValue())) {
                        }
                    }
                    mediaItem = (MediaItem) obj4;
                    while (r1.hasNext()) {
                        rg0Var2 = (rg0) obj7;
                        if (mediaItem != null) {
                            id = mediaItem.getId();
                        } else {
                            id = null;
                        }
                        if (id != null) {
                            list = rg0Var2.b;
                            if (list.isEmpty()) {
                                continue;
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        continue;
                                    } else if (Intrinsics.areEqual(((MediaItem) it.next()).getId(), mediaItem.getId())) {
                                        r7 = obj7;
                                        rg0Var = (rg0) r7;
                                        if (rg0Var != null) {
                                            str = rg0Var.a;
                                        } else {
                                            str = ((rg0) CollectionsKt.first(list3)).a;
                                        }
                                        Shadow shadow5 = u90.o;
                                        mutableState.setValue(str);
                                    }
                                }
                            }
                        }
                    }
                    rg0Var = (rg0) r7;
                    if (rg0Var != null) {
                        str = rg0Var.a;
                    } else {
                        str = ((rg0) CollectionsKt.first(list3)).a;
                    }
                    Shadow shadow6 = u90.o;
                    mutableState.setValue(str);
                }
                return Unit.INSTANCE;
            case 3:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Shadow shadow7 = u90.o;
                if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                    ((Function1) obj4).invoke(((MediaItem) obj3).getId());
                }
                return Unit.INSTANCE;
            case 4:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                State state = (State) obj4;
                MutableState mutableState2 = (MutableState) obj2;
                Objects.toString((rn0) mutableState2.getValue());
                State state2 = (State) obj3;
                Objects.toString((rn0) state2.getValue());
                if (((String) state.getValue()) != null && ((rn0) mutableState2.getValue()) != ((rn0) state2.getValue())) {
                    rn0 rn0Var = (rn0) mutableState2.getValue();
                    rn0 rn0Var2 = (rn0) state2.getValue();
                    Objects.toString(rn0Var);
                    Objects.toString(rn0Var2);
                    mutableState2.setValue((rn0) state2.getValue());
                }
                return Unit.INSTANCE;
            case 5:
                zq0 zq0Var = (zq0) obj3;
                MutableStateFlow mutableStateFlow2 = zq0Var.w;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) ((MutableState) obj2).getValue()).booleanValue() || (serverConfig = (ServerConfig) obj4) == null) {
                    zq0Var.E++;
                    Job job = zq0Var.C;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    zq0Var.C = null;
                    mutableStateFlow2.setValue(MapsKt.emptyMap());
                } else {
                    long j = 1 + zq0Var.E;
                    zq0Var.E = j;
                    Job job2 = zq0Var.C;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                    zq0Var.C = null;
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    listCreateListBuilder.add(TuplesKt.to(null, ServerConfig.copy$default(serverConfig, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, false, false, false, false, null, null, null, null, 0L, 3932159, null)));
                    for (BackupRouteConfig backupRouteConfig : serverConfig.getBackupRoutesSafe()) {
                        String id2 = backupRouteConfig.getId();
                        String alias = backupRouteConfig.getAlias();
                        if (StringsKt.isBlank(alias)) {
                            alias = "未命名线路";
                        }
                        listCreateListBuilder.add(TuplesKt.to(id2, ServerConfig.copy$default(serverConfig, null, alias, backupRouteConfig.getProtocol(), backupRouteConfig.getHost(), backupRouteConfig.getPort(), backupRouteConfig.getPath(), null, null, null, null, null, 0L, false, backupRouteConfig.getDirectOnly(), false, false, false, null, backupRouteConfig.getId(), null, null, 0L, 3923905, null)));
                    }
                    List listBuild = CollectionsKt.build(listCreateListBuilder);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listBuild, 10)), 16));
                    Iterator it3 = listBuild.iterator();
                    while (it3.hasNext()) {
                        Pair pair2 = TuplesKt.to(((Pair) it3.next()).getFirst(), ServerPingState.INSTANCE.getMeasuring());
                        linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                    }
                    mutableStateFlow2.setValue(linkedHashMap2);
                    zq0Var.C = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var), null, null, new n7(listBuild, zq0Var, j, null, 2), 3, null);
                }
                return Unit.INSTANCE;
            case 6:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                zq0 zq0Var2 = (zq0) obj4;
                if (((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                    zq0Var2.I(((ServerPreferences) obj3).getAllServers());
                } else {
                    zq0Var2.D++;
                    Job job3 = zq0Var2.B;
                    if (job3 != null) {
                        Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                    }
                    zq0Var2.B = null;
                    zq0Var2.u.setValue(MapsKt.emptyMap());
                }
                return Unit.INSTANCE;
            case 7:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Context applicationContext = ((Context) obj4).getApplicationContext();
                MyEmbyApp myEmbyApp = applicationContext instanceof MyEmbyApp ? (MyEmbyApp) applicationContext : null;
                Log.d("MainNavigation", "检查崩溃信息, app=" + myEmbyApp);
                if (myEmbyApp != null) {
                    SharedPreferences sharedPreferences = myEmbyApp.getSharedPreferences("crash_log", 0);
                    if (System.currentTimeMillis() - sharedPreferences.getLong("crash_time", 0L) < 300000) {
                        string = sharedPreferences.getString("last_crash", null);
                    }
                }
                ll0.l("崩溃信息: ", string, "MainNavigation");
                if (string != null) {
                    Set set = e31.a;
                    ((MutableState) obj2).setValue(string);
                    ((MutableState) obj3).setValue(Boolean.TRUE);
                    myEmbyApp.getSharedPreferences("crash_log", 0).edit().clear().apply();
                }
                return Unit.INSTANCE;
            case 8:
                MutableState mutableState3 = (MutableState) obj2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                String str3 = (String) obj4;
                if (str3 != null) {
                    Set set2 = e31.a;
                    if (!((Boolean) mutableState3.getValue()).booleanValue()) {
                        ((va0) obj3).s.setValue(str3);
                        mutableState3.setValue(Boolean.TRUE);
                    }
                }
                return Unit.INSTANCE;
            case 9:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                to1 to1Var = (to1) obj4;
                Context context = (Context) obj3;
                to1Var.getClass();
                context.getClass();
                to1Var.b = context;
                to1Var.c = (String) obj2;
                return Unit.INSTANCE;
            case 10:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Activity activity = (Activity) obj4;
                if (activity == null) {
                    return Unit.INSTANCE;
                }
                if (((PlayerFrameRateMatchingMode) ((on1) obj2).j.getValue()) != PlayerFrameRateMatchingMode.ALWAYS) {
                    tl0.a(activity, 0);
                    return Unit.INSTANCE;
                }
                Float f2 = (Float) obj3;
                if (f2 == null) {
                    tl0.a(activity, 0);
                    Log.w("PlayerScreen", "AFR 积极匹配跳过: 当前片源未获取到有效帧率，已清除旧显示模式覆盖");
                    return Unit.INSTANCE;
                }
                Window window = activity.getWindow();
                if (window == null || (decorView = window.getDecorView()) == null || (defaultDisplay = decorView.getDisplay()) == null) {
                    defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                }
                if (defaultDisplay == null) {
                    tl0.a(activity, 0);
                    Log.w("PlayerScreen", "AFR 积极匹配跳过: 无法获取当前显示设备，已清除旧显示模式覆盖");
                    return Unit.INSTANCE;
                }
                Float fD = tl0.D(f2.floatValue());
                if (fD != null) {
                    float fFloatValue = fD.floatValue();
                    Display.Mode mode2 = defaultDisplay.getMode();
                    if (mode2 != null) {
                        Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
                        supportedModes.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Display.Mode mode3 : supportedModes) {
                            if (mode3.getPhysicalWidth() == mode2.getPhysicalWidth() && mode3.getPhysicalHeight() == mode2.getPhysicalHeight()) {
                                arrayList2.add(mode3);
                            }
                        }
                        boolean zIsEmpty = arrayList2.isEmpty();
                        List<Display.Mode> list4 = arrayList2;
                        if (zIsEmpty) {
                            Display.Mode[] supportedModes2 = defaultDisplay.getSupportedModes();
                            supportedModes2.getClass();
                            list4 = ArraysKt.toList(supportedModes2);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Display.Mode mode4 : list4) {
                            mode4.getClass();
                            float refreshRate = mode4.getRefreshRate();
                            if (Math.abs(refreshRate) > Float.MAX_VALUE || refreshRate <= 0.0f) {
                                jb0Var = null;
                            } else {
                                float f3 = refreshRate / fFloatValue;
                                if (Math.abs(f3) > Float.MAX_VALUE || f3 < 0.95f) {
                                    jb0Var = null;
                                } else {
                                    int iCoerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(f3), 1);
                                    float fAbs = Math.abs(f3 - iCoerceAtLeast);
                                    float fAbs2 = Math.abs(refreshRate - fFloatValue);
                                    if (fAbs <= 0.08f || fAbs2 <= 0.2f) {
                                        jb0Var = new jb0(kb0.s(iCoerceAtLeast - 1, 10.0f, fAbs * 1000.0f, fAbs2));
                                    } else {
                                        jb0Var = null;
                                    }
                                }
                            }
                            Pair pair3 = jb0Var != null ? TuplesKt.to(mode4, jb0Var) : null;
                            if (pair3 != null) {
                                arrayList3.add(pair3);
                            }
                        }
                        Iterator it4 = arrayList3.iterator();
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (it4.hasNext()) {
                                float f4 = ((jb0) ((Pair) next).component2()).a;
                                do {
                                    Object next2 = it4.next();
                                    float f5 = ((jb0) ((Pair) next2).component2()).a;
                                    if (Float.compare(f4, f5) > 0) {
                                        next = next2;
                                        f4 = f5;
                                    }
                                } while (it4.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Pair pair4 = (Pair) next;
                        if (pair4 != null) {
                            mode = (Display.Mode) pair4.getFirst();
                        }
                    }
                }
                if (mode == null) {
                    tl0.a(activity, 0);
                    Log.w("PlayerScreen", mr.s("AFR 积极匹配未找到合适显示模式: content=", String.format("%.3f", Arrays.copyOf(new Object[]{f2}, 1)), "fps, current=", tl0.k(defaultDisplay.getMode()), "，已清除旧显示模式覆盖"));
                    return Unit.INSTANCE;
                }
                boolean zA = tl0.a(activity, mode.getModeId());
                String str4 = String.format("%.3f", Arrays.copyOf(new Object[]{f2}, 1));
                String strK = tl0.k(defaultDisplay.getMode());
                String strK2 = tl0.k(mode);
                StringBuilder sbZ = kb0.z("AFR 积极匹配: content=", str4, "fps, current=", strK, ", target=");
                sbZ.append(strK2);
                sbZ.append(", changed=");
                sbZ.append(zA);
                Log.d("PlayerScreen", sbZ.toString());
                return Unit.INSTANCE;
            case 11:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                to1 to1Var2 = (to1) obj4;
                String str5 = (String) obj3;
                MutableState mutableState4 = (MutableState) obj2;
                vb1 vb1Var = new vb1(28, mutableState4);
                vb1 vb1Var2 = new vb1(29, mutableState4);
                Job job4 = to1Var2.g;
                if (job4 != null) {
                    Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
                }
                to1Var2.g = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(to1Var2), null, null, new wd(to1Var2, str5, vb1Var, vb1Var2, null), 3, null);
                return Unit.INSTANCE;
            case 12:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (!dn1.W((kx) obj4)) {
                    ((MutableIntState) obj2).setIntValue(((DanmakuSettings) ((State) obj3).getValue()).getTimeOffsetSec());
                }
                return Unit.INSTANCE;
            case 13:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                jw jwVar = (jw) obj3;
                ((kx) obj4).a(jwVar.a, jwVar.b, jwVar.c, jwVar.d, jwVar.e);
                Toast.makeText((Context) obj2, jwVar.f, 1).show();
                return Unit.INSTANCE;
            case 14:
                MutableState mutableState5 = (MutableState) obj3;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MutableState mutableState6 = (MutableState) obj2;
                if (((List) mutableState6.getValue()).isEmpty()) {
                    BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj4, null, null, new ac(mutableState5, mutableState6, (Continuation) r7, 13), 3, null);
                    return Unit.INSTANCE;
                }
                mutableState5.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                try {
                    File file = new File(((Context) obj3).getCacheDir(), "subtitle_" + ((String) obj4).hashCode() + "_modified.srt");
                    FilesKt.writeText(file, (String) obj2, Charsets.UTF_8);
                    Log.d("SrtParser", "字幕已保存到临时文件: " + file.getAbsolutePath());
                    return file.getAbsolutePath();
                } catch (Exception e) {
                    kb0.G("保存临时字幕文件失败: ", e.getMessage(), "SrtParser", e);
                    return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(Object obj, MutableState mutableState, State state, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = obj;
        this.d = mutableState;
        this.c = state;
    }
}
