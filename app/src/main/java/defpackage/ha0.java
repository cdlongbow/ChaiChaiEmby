package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.PlaybackInfoResponse;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class ha0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public final /* synthetic */ va0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha0(va0 va0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = va0Var;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        String str = this.e;
        va0 va0Var = this.d;
        switch (i) {
            case 0:
                return new ha0(va0Var, str, continuation, 0);
            case 1:
                return new ha0(va0Var, str, continuation, 1);
            case 2:
                return new ha0(va0Var, str, continuation, 2);
            default:
                return new ha0(va0Var, str, continuation, 3);
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
        }
        return ((ha0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objQ;
        Object objH;
        Object objU;
        int i = this.a;
        va0 va0Var = this.d;
        String str = this.e;
        Object obj2 = null;
        Object obj3 = null;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.c;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        String userId = va0Var.d;
                        if (userId == null) {
                            userId = RetrofitClient.INSTANCE.getUserId();
                        }
                        uf0 uf0Var = va0Var.a;
                        this.b = null;
                        this.c = 1;
                        Object objG = uf0Var.g(userId, str, this);
                        if (objG == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        value = objG;
                    } else {
                        if (i2 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        value = ((Result) obj).getValue();
                    }
                    if (Result.m8832isSuccessimpl(value)) {
                        fa0 fa0Var = (fa0) va0Var.g.getValue();
                        if (fa0Var instanceof ea0) {
                            va0Var.k(((ea0) fa0Var).a.getId(), false);
                        }
                    }
                    break;
                } catch (Exception e) {
                    kb0.G("清除播放进度失败: ", e.getMessage(), "DetailViewModel", e);
                }
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.c;
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        String userId2 = va0Var.d;
                        if (userId2 == null) {
                            userId2 = RetrofitClient.INSTANCE.getUserId();
                        }
                        String str2 = userId2;
                        uf0 uf0Var2 = va0Var.a;
                        String str3 = this.e;
                        this.b = null;
                        this.c = 1;
                        objQ = uf0Var2.q(str2, str3, (8188 & 4) != 0, null, null, null, null, null, null, null, null, null, null, (8188 & 8192) != 0 ? null : null, this);
                        if (objQ == coroutine_suspended2) {
                            return coroutine_suspended2;
                        }
                    } else {
                        if (i3 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        objQ = ((Result) obj).getValue();
                    }
                    if (Result.m8832isSuccessimpl(objQ)) {
                        if (Result.m8831isFailureimpl(objQ)) {
                            objQ = null;
                        }
                        PlaybackInfoResponse playbackInfoResponse = (PlaybackInfoResponse) objQ;
                        List<MediaSource> mediaSources = playbackInfoResponse != null ? playbackInfoResponse.getMediaSources() : null;
                        if (mediaSources == null) {
                            mediaSources = CollectionsKt.emptyList();
                        }
                        va0Var.getClass();
                        List listV = va0.v(mediaSources);
                        if (!listV.isEmpty()) {
                            MutableStateFlow mutableStateFlow = va0Var.U;
                            mutableStateFlow.setValue(MapsKt.plus((Map) mutableStateFlow.getValue(), TuplesKt.to(str, listV)));
                            va0Var.y(str);
                        }
                    } else {
                        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objQ);
                        Boxing.boxInt(Log.e("DetailViewModel", "获取 PlaybackInfo 失败: " + (thM8828exceptionOrNullimpl != null ? thM8828exceptionOrNullimpl.getMessage() : null)));
                    }
                } catch (Exception e2) {
                    Boxing.boxInt(Log.e("DetailViewModel", "获取 PlaybackInfo 异常: " + e2.getMessage()));
                }
                return Unit.INSTANCE;
            case 2:
                MutableStateFlow mutableStateFlow2 = va0Var.h0;
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.c;
                try {
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        String userId3 = va0Var.d;
                        if (userId3 == null) {
                            userId3 = RetrofitClient.INSTANCE.getUserId();
                        }
                        uf0 uf0Var3 = va0Var.a;
                        this.b = null;
                        this.c = 1;
                        objH = uf0Var3.h(userId3, str, 12, this);
                        if (objH == coroutine_suspended3) {
                            return coroutine_suspended3;
                        }
                    } else {
                        if (i4 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        objH = ((Result) obj).getValue();
                    }
                    if (Result.m8832isSuccessimpl(objH)) {
                        if (!Result.m8831isFailureimpl(objH)) {
                            obj3 = objH;
                        }
                        List listEmptyList = (List) obj3;
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        List listU = va0.u(listEmptyList);
                        mutableStateFlow2.setValue(listU);
                        Boxing.boxInt(Log.d("DetailViewModel", "加载所属合集成功: " + listU.size() + " 项"));
                    } else {
                        Throwable thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(objH);
                        Log.e("DetailViewModel", "加载所属合集失败: " + (thM8828exceptionOrNullimpl2 != null ? thM8828exceptionOrNullimpl2.getMessage() : null));
                        mutableStateFlow2.setValue(CollectionsKt.emptyList());
                    }
                } catch (Exception e3) {
                    Log.e("DetailViewModel", "加载所属合集异常: " + e3.getMessage(), e3);
                    mutableStateFlow2.setValue(CollectionsKt.emptyList());
                }
                return Unit.INSTANCE;
            default:
                MutableStateFlow mutableStateFlow3 = va0Var.c0;
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.c;
                try {
                    if (i5 == 0) {
                        ResultKt.throwOnFailure(obj);
                        String userId4 = va0Var.d;
                        if (userId4 == null) {
                            userId4 = RetrofitClient.INSTANCE.getUserId();
                        }
                        uf0 uf0Var4 = va0Var.a;
                        this.b = null;
                        this.c = 1;
                        objU = uf0Var4.u(userId4, str, 12, this);
                        if (objU == coroutine_suspended4) {
                            return coroutine_suspended4;
                        }
                    } else {
                        if (i5 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        objU = ((Result) obj).getValue();
                    }
                    if (Result.m8832isSuccessimpl(objU)) {
                        if (!Result.m8831isFailureimpl(objU)) {
                            obj2 = objU;
                        }
                        List listEmptyList2 = (List) obj2;
                        if (listEmptyList2 == null) {
                            listEmptyList2 = CollectionsKt.emptyList();
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : listEmptyList2) {
                            if (!Intrinsics.areEqual(((MediaItem) obj4).getId(), str)) {
                                arrayList.add(obj4);
                            }
                        }
                        mutableStateFlow3.setValue(va0.u(arrayList));
                        va0Var.g0 = true;
                        Log.d("DetailViewModel", "加载类似作品成功: " + ((List) mutableStateFlow3.getValue()).size() + " 项");
                    } else {
                        Throwable thM8828exceptionOrNullimpl3 = Result.m8828exceptionOrNullimpl(objU);
                        Log.e("DetailViewModel", "加载类似作品失败: " + (thM8828exceptionOrNullimpl3 != null ? thM8828exceptionOrNullimpl3.getMessage() : null));
                    }
                } catch (Exception e4) {
                    Log.e("DetailViewModel", "加载类似作品异常: " + e4.getMessage());
                } finally {
                    va0Var.f0 = false;
                }
                return Unit.INSTANCE;
        }
    }
}
