package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerIconLibrary;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.server.BackupRouteConfigServerManager;
import com.dh.myembyapp.server.RemoteBackupRouteFetchResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes4.dex */
public final class mi extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public /* synthetic */ Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(px1 px1Var, String str, MutableState mutableState, MutableState mutableState2, UserPreferences userPreferences, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.a = 3;
        this.h = px1Var;
        this.i = str;
        this.c = mutableState;
        this.d = mutableState2;
        this.k = userPreferences;
        this.e = mutableState3;
        this.g = mutableState4;
        this.j = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                return new mi((BackupRouteConfigServerManager) this.h, (ServerConfig) this.i, (MutableState) this.c, (MutableState) this.d, (MutableState) this.e, (MutableState) this.g, (MutableState) obj3, (MutableState) obj2, continuation, 0);
            case 1:
                return new mi((Context) this.h, (String) this.i, (String) obj3, (ne) obj2, (MutableState) this.c, (MutableState) this.d, (MutableState) this.e, (MutableState) this.g, continuation);
            case 2:
                return new mi((io1) this.h, (to1) this.i, (String) this.c, (String) this.d, (TranscodeQualityOption) this.e, (Integer) this.g, (Integer) obj3, (Long) obj2, continuation, 2);
            case 3:
                return new mi((px1) this.h, (String) this.i, (MutableState) this.c, (MutableState) this.d, (UserPreferences) obj2, (MutableState) this.e, (MutableState) this.g, (MutableState) obj3, continuation);
            case 4:
                mi miVar = new mi((ye2) this.g, (rf2) obj3, (pf2) obj2, continuation);
                miVar.e = obj;
                return miVar;
            default:
                mi miVar2 = new mi((ye2) obj3, (pf2) obj2, continuation);
                miVar2.g = obj;
                return miVar2;
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
        }
        return ((mi) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8804fetchServerDomainsgIAlus;
        Object objR;
        Object objWithTimeoutOrNull;
        Object value;
        Object objM8825constructorimpl;
        pf2 pf2Var;
        Object objA;
        Object objM8825constructorimpl2;
        ye2 ye2Var;
        pf2 pf2Var2;
        ff2 ff2Var;
        rf2 rf2VarC;
        Object objD;
        int i = this.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        int i2 = 1;
        se2 appSettingsState = null;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) this.g;
                MutableState mutableState3 = (MutableState) this.e;
                MutableState mutableState4 = (MutableState) this.d;
                MutableState mutableState5 = (MutableState) this.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutableState5.setValue(Boolean.TRUE);
                    BackupRouteConfigServerManager backupRouteConfigServerManager = (BackupRouteConfigServerManager) this.h;
                    ServerConfig serverConfig = (ServerConfig) this.i;
                    this.b = 1;
                    objM8804fetchServerDomainsgIAlus = backupRouteConfigServerManager.m8804fetchServerDomainsgIAlus(serverConfig, this);
                    if (objM8804fetchServerDomainsgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objM8804fetchServerDomainsgIAlus = ((Result) obj).getValue();
                }
                mutableState5.setValue(Boolean.FALSE);
                if (Result.m8832isSuccessimpl(objM8804fetchServerDomainsgIAlus)) {
                    RemoteBackupRouteFetchResult remoteBackupRouteFetchResult = (RemoteBackupRouteFetchResult) objM8804fetchServerDomainsgIAlus;
                    mutableState4.setValue(null);
                    mutableState3.setValue(SetsKt.emptySet());
                    mutableState2.setValue(null);
                    mutableState.setValue(new ch(remoteBackupRouteFetchResult.getTotalCount(), remoteBackupRouteFetchResult.getRoutesToImport()));
                }
                MutableState mutableState6 = (MutableState) obj2;
                if (Result.m8828exceptionOrNullimpl(objM8804fetchServerDomainsgIAlus) != null) {
                    mutableState.setValue(null);
                    mutableState4.setValue(null);
                    mutableState3.setValue(SetsKt.emptySet());
                    mutableState2.setValue(null);
                    mutableState6.setValue("该服未获取到备用地址");
                }
                return Unit.INSTANCE;
            case 1:
                MutableState mutableState7 = (MutableState) this.g;
                MutableState mutableState8 = (MutableState) this.d;
                MutableState mutableState9 = (MutableState) this.c;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    float f = ra1.a;
                    mutableState9.setValue(Boolean.TRUE);
                    this.b = 1;
                    objR = ye.a.r((Context) this.h, (String) this.i, (String) obj3, ((List) mutableState8.getValue()).size(), 10, (ne) obj2, this);
                    if (objR == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objR = ((Result) obj).getValue();
                }
                MutableState mutableState10 = (MutableState) this.e;
                if (Result.m8832isSuccessimpl(objR)) {
                    List list = (List) objR;
                    float f2 = ra1.a;
                    List list2 = (List) mutableState8.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((qe) it.next()).a);
                    }
                    HashSet hashSet = CollectionsKt___CollectionsKt.toHashSet(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list) {
                        if (hashSet.add(((qe) obj4).a)) {
                            arrayList2.add(obj4);
                        }
                    }
                    mutableState8.setValue(CollectionsKt.plus((Collection) mutableState8.getValue(), (Iterable) arrayList2));
                    mutableState10.setValue(Boolean.valueOf(list.size() >= 10));
                    if (list.isEmpty()) {
                        mutableState7.setValue("已加载全部结果");
                    }
                }
                Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objR);
                if (thM8828exceptionOrNullimpl != null) {
                    String message = thM8828exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "加载更多失败";
                    }
                    float f3 = ra1.a;
                    mutableState7.setValue(message);
                }
                float f4 = ra1.a;
                mutableState9.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                io1 io1Var = (io1) this.h;
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (io1Var != null) {
                        so1 so1Var = new so1((to1) this.i, io1Var, objArr == true ? 1 : 0, i2);
                        this.b = 1;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(5000L, so1Var, this);
                        if (objWithTimeoutOrNull == coroutine_suspended3) {
                            return coroutine_suspended3;
                        }
                    }
                    ((to1) this.i).F((String) this.c, (506 & 2) != 0 ? false : true, (506 & 4) != 0 ? null : (String) this.d, (506 & 8) != 0 ? null : (TranscodeQualityOption) this.e, (506 & 16) != 0 ? null : (Integer) this.g, (506 & 32) != 0 ? null : (Integer) obj3, (506 & 64) != 0 ? null : (Long) obj2, (506 & 128) == 0, false);
                    return Unit.INSTANCE;
                }
                if (i5 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                objWithTimeoutOrNull = obj;
                Boolean bool = (Boolean) objWithTimeoutOrNull;
                if (!(bool != null ? bool.booleanValue() : false)) {
                    Log.w("PlayerViewModel", "切换转码前停止旧 Emby 会话超时，继续打开转码会话: playSessionId=" + io1Var.c);
                }
                ((to1) this.i).F((String) this.c, (506 & 2) != 0 ? false : true, (506 & 4) != 0 ? null : (String) this.d, (506 & 8) != 0 ? null : (TranscodeQualityOption) this.e, (506 & 16) != 0 ? null : (Integer) this.g, (506 & 32) != 0 ? null : (Integer) obj3, (506 & 64) != 0 ? null : (Long) obj2, (506 & 128) == 0, false);
                return Unit.INSTANCE;
            case 3:
                MutableState mutableState11 = (MutableState) this.d;
                MutableState mutableState12 = (MutableState) this.c;
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.b;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutableState12.setValue(Boolean.TRUE);
                    mutableState11.setValue(null);
                    px1 px1Var = (px1) this.h;
                    String str = (String) this.i;
                    this.b = 1;
                    Object objD2 = px1Var.d(str, this);
                    if (objD2 == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                    value = objD2;
                } else {
                    if (i6 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    value = ((Result) obj).getValue();
                }
                UserPreferences userPreferences = (UserPreferences) obj2;
                MutableState mutableState13 = (MutableState) this.e;
                MutableState mutableState14 = (MutableState) this.g;
                MutableState mutableState15 = (MutableState) obj3;
                Throwable thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(value);
                if (thM8828exceptionOrNullimpl2 == null) {
                    ServerIconLibrary serverIconLibrary = (ServerIconLibrary) value;
                    mutableState13.setValue(serverIconLibrary);
                    mutableState14.setValue(serverIconLibrary.getSourceUrl());
                    userPreferences.saveServerIconLibraryUrl(serverIconLibrary.getSourceUrl());
                    mutableState15.setValue("");
                } else {
                    mutableState13.setValue(null);
                    String message2 = thM8828exceptionOrNullimpl2.getMessage();
                    if (message2 == null) {
                        message2 = "图标库加载失败";
                    }
                    mutableState11.setValue(message2);
                }
                mutableState12.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.e;
                Object coroutine_suspended5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.b;
                try {
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        ye2 ye2Var2 = (ye2) this.g;
                        rf2 rf2VarC2 = (rf2) obj3;
                        pf2Var = (pf2) obj2;
                        Result.Companion companion = Result.INSTANCE;
                        if (!(ye2Var2.d || ye2Var2.e)) {
                            throw new IllegalArgumentException("请至少勾选一类同步内容");
                        }
                        if (rf2VarC2 == null && (rf2VarC2 = new ff2(pf2Var, ye2Var2).c()) == null) {
                            throw new IllegalStateException("远端还没有可下载的同步文件");
                        }
                        ve2 ve2VarC = pf2.c(rf2VarC2, ye2Var2);
                        rf2 rf2Var = ve2VarC.a;
                        this.e = null;
                        this.h = pf2Var;
                        this.i = null;
                        this.c = null;
                        this.d = null;
                        this.b = 1;
                        objA = pf2.a(pf2Var, rf2Var, ye2Var2, this);
                        if (objA == coroutine_suspended5) {
                            return coroutine_suspended5;
                        }
                    } else {
                        if (i7 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pf2 pf2Var3 = (pf2) this.h;
                        ResultKt.throwOnFailure(obj);
                        pf2Var = pf2Var3;
                        objA = obj;
                    }
                    objM8825constructorimpl = Result.m8825constructorimpl(pf2.b(pf2Var, (List) objA));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM8828exceptionOrNullimpl3 = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
                if (thM8828exceptionOrNullimpl3 != null) {
                    Log.e("WebDavSyncRepository", "下载 WebDAV 配置失败", thM8828exceptionOrNullimpl3);
                }
                return Result.m8824boximpl(objM8825constructorimpl);
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.g;
                Object coroutine_suspended6 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i8 = this.b;
                try {
                    if (i8 == 0) {
                        ResultKt.throwOnFailure(obj);
                        ye2Var = (ye2) obj3;
                        pf2Var2 = (pf2) obj2;
                        Result.Companion companion3 = Result.INSTANCE;
                        if (!(ye2Var.d || ye2Var.e)) {
                            throw new IllegalArgumentException("请至少勾选一类同步内容");
                        }
                        ff2Var = new ff2(pf2Var2, ye2Var);
                        ff2Var.d();
                        rf2VarC = ff2Var.c();
                        this.g = null;
                        this.h = ye2Var;
                        this.i = pf2Var2;
                        this.c = null;
                        this.d = ff2Var;
                        this.e = rf2VarC;
                        this.b = 1;
                        objD = pf2.d(pf2Var2, ye2Var, this);
                        if (objD == coroutine_suspended6) {
                            return coroutine_suspended6;
                        }
                    } else {
                        if (i8 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rf2 rf2Var2 = (rf2) this.e;
                        ff2Var = (ff2) this.d;
                        pf2Var2 = (pf2) this.i;
                        ye2Var = (ye2) this.h;
                        ResultKt.throwOnFailure(obj);
                        rf2VarC = rf2Var2;
                        objD = obj;
                    }
                    rf2 rf2Var3 = (rf2) objD;
                    pf2Var2.getClass();
                    boolean z = ye2Var.d;
                    boolean z2 = ye2Var.e;
                    we2 serverState = z ? rf2Var3.getServerState() : rf2VarC != null ? rf2VarC.getServerState() : null;
                    if (z2) {
                        appSettingsState = rf2Var3.getAppSettingsState();
                    } else if (rf2VarC != null) {
                        appSettingsState = rf2VarC.getAppSettingsState();
                    }
                    ff2Var.e(new rf2(serverState, appSettingsState, 15));
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    if (ye2Var.d) {
                        listCreateListBuilder.add("服务器配置");
                    }
                    if (z2) {
                        listCreateListBuilder.add("应用设置");
                    }
                    objM8825constructorimpl2 = Result.m8825constructorimpl("上传成功：已更新" + CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), "、", null, null, 0, null, null, 62, null) + "。");
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM8825constructorimpl2 = Result.m8825constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM8828exceptionOrNullimpl4 = Result.m8828exceptionOrNullimpl(objM8825constructorimpl2);
                if (thM8828exceptionOrNullimpl4 != null) {
                    Log.e("WebDavSyncRepository", "上传 WebDAV 配置失败", thM8828exceptionOrNullimpl4);
                }
                return Result.m8824boximpl(objM8825constructorimpl2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(ye2 ye2Var, pf2 pf2Var, Continuation continuation) {
        super(2, continuation);
        this.a = 5;
        this.j = ye2Var;
        this.k = pf2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(ye2 ye2Var, rf2 rf2Var, pf2 pf2Var, Continuation continuation) {
        super(2, continuation);
        this.a = 4;
        this.g = ye2Var;
        this.j = rf2Var;
        this.k = pf2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(Context context, String str, String str2, ne neVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.a = 1;
        this.h = context;
        this.i = str;
        this.j = str2;
        this.k = neVar;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.h = obj;
        this.i = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.g = obj6;
        this.j = obj7;
        this.k = obj8;
    }
}
