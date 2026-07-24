package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class h90 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(boolean z, List list, String str, FocusRequester focusRequester, FocusRequester focusRequester2, Continuation continuation) {
        super(2, continuation);
        this.e = z;
        this.g = list;
        this.d = str;
        this.h = focusRequester;
        this.i = focusRequester2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.i;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                h90 h90Var = new h90(this.e, (List) this.g, (String) obj3, (FocusRequester) this.h, (FocusRequester) obj2, continuation);
                h90Var.b = obj;
                return h90Var;
            case 1:
                return new h90((va0) obj2, (String) obj3, this.e, continuation);
            default:
                FocusRequester focusRequester = (FocusRequester) this.h;
                h90 h90Var2 = new h90(this.e, (Function0) this.g, (MutableState) obj3, (MutableState) obj2, focusRequester, continuation);
                h90Var2.b = obj;
                return h90Var2;
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
        }
        return ((h90) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x017f A[Catch: Exception -> 0x00b0, TRY_ENTER, TryCatch #0 {Exception -> 0x00b0, blocks: (B:30:0x00ab, B:60:0x0159, B:71:0x019a, B:76:0x01a4, B:77:0x01b9, B:79:0x01c3, B:81:0x01c9, B:83:0x01d2, B:82:0x01ce, B:64:0x017f, B:66:0x0189, B:68:0x018f, B:69:0x0194, B:36:0x00bc, B:42:0x00e0, B:44:0x00e6, B:48:0x00ef, B:50:0x0102, B:52:0x0108, B:54:0x0126, B:59:0x0142, B:84:0x01d8, B:86:0x01de, B:90:0x01e9, B:91:0x01f5, B:39:0x00cb), top: B:126:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x019a A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:30:0x00ab, B:60:0x0159, B:71:0x019a, B:76:0x01a4, B:77:0x01b9, B:79:0x01c3, B:81:0x01c9, B:83:0x01d2, B:82:0x01ce, B:64:0x017f, B:66:0x0189, B:68:0x018f, B:69:0x0194, B:36:0x00bc, B:42:0x00e0, B:44:0x00e6, B:48:0x00ef, B:50:0x0102, B:52:0x0108, B:54:0x0126, B:59:0x0142, B:84:0x01d8, B:86:0x01de, B:90:0x01e9, B:91:0x01f5, B:39:0x00cb), top: B:126:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a4 A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:30:0x00ab, B:60:0x0159, B:71:0x019a, B:76:0x01a4, B:77:0x01b9, B:79:0x01c3, B:81:0x01c9, B:83:0x01d2, B:82:0x01ce, B:64:0x017f, B:66:0x0189, B:68:0x018f, B:69:0x0194, B:36:0x00bc, B:42:0x00e0, B:44:0x00e6, B:48:0x00ef, B:50:0x0102, B:52:0x0108, B:54:0x0126, B:59:0x0142, B:84:0x01d8, B:86:0x01de, B:90:0x01e9, B:91:0x01f5, B:39:0x00cb), top: B:126:0x009d }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String userId;
        Object objL;
        String message;
        MediaItem mediaItemT;
        MediaItem mediaItem;
        String seriesId;
        int i = this.a;
        Object obj2 = this.d;
        boolean z = this.e;
        Object obj3 = this.i;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.c;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        return Unit.INSTANCE;
                    }
                    this.b = coroutineScope;
                    this.c = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((List) this.g).isEmpty()) {
                    if (((String) obj2) != null) {
                        FocusRequester focusRequester = (FocusRequester) obj3;
                        try {
                            
                            Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                        } catch (Throwable th) {
                            
                            ResultKt.createFailure(th);
                        }
                    }
                    break;
                } else {
                    FocusRequester focusRequester2 = (FocusRequester) this.h;
                    try {
                        
                        Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester2, 0, 1, null));
                    } catch (Throwable th2) {
                        
                        ResultKt.createFailure(th2);
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj2;
                va0 va0Var = (va0) obj3;
                MutableStateFlow mutableStateFlow = va0Var.g;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.c;
                int i4 = 2;
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        userId = RetrofitClient.INSTANCE.getUserId();
                        va0Var.d = userId;
                        uf0 uf0Var = va0Var.a;
                        this.b = userId;
                        this.c = 1;
                        objL = uf0Var.l(userId, str, this);
                        if (objL == coroutine_suspended2) {
                        }
                        return coroutine_suspended2;
                    }
                    if (i3 == 1) {
                        userId = (String) this.b;
                        ResultKt.throwOnFailure(obj);
                        objL = ((Result) obj).getValue();
                    } else {
                        if (i3 != 2) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mediaItem = (MediaItem) this.h;
                        ResultKt.throwOnFailure(obj);
                    }
                    mediaItemT = mediaItem;
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var), null, null, new gq(va0Var, mediaItemT, continuation, 5), 3, null);
                    if (StringsKt__StringsJVMKt.equals(mediaItemT.getType(), "BoxSet", true)) {
                        seriesId = null;
                    } else if (StringsKt__StringsJVMKt.equals(mediaItemT.getType(), "Episode", true) || (seriesId = mediaItemT.getSeriesId()) == null) {
                    }
                    if (seriesId != null) {
                        if (!StringsKt.isBlank(seriesId)) {
                            seriesId = null;
                        }
                        if (seriesId != null) {
                            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var), null, null, new ha0(va0Var, seriesId, continuation, i4), 3, null);
                        }
                    }
                    if (Intrinsics.areEqual(mediaItemT.getType(), "Episode") || (seriesId = mediaItemT.getSeriesId()) == null) {
                    }
                    va0Var.e0 = seriesId;
                    va0Var.f();
                    return Unit.INSTANCE;
                    if (Result.m8832isSuccessimpl(objL)) {
                        Object obj4 = false ? null : objL;
                        obj4.getClass();
                        mediaItemT = va0.t((MediaItem) obj4);
                        va0Var.c = Intrinsics.areEqual(mediaItemT.getType(), "Series") ? mediaItemT.getId() : null;
                        va0.d(va0Var, mediaItemT);
                        mutableStateFlow.setValue(new ea0(mediaItemT));
                        va0Var.z(mediaItemT.getId());
                        if (Intrinsics.areEqual(mediaItemT.getType(), "Series")) {
                            this.b = null;
                            this.g = null;
                            this.h = mediaItemT;
                            this.c = 2;
                            if (va0.c(va0Var, userId, str, true, this) != coroutine_suspended2) {
                                mediaItem = mediaItemT;
                                mediaItemT = mediaItem;
                            }
                            return coroutine_suspended2;
                        }
                        va0Var.i.setValue(CollectionsKt.emptyList());
                        va0Var.m.setValue(CollectionsKt.emptyList());
                        va0Var.k.setValue(null);
                        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var), null, null, new gq(va0Var, mediaItemT, continuation, 5), 3, null);
                        if (StringsKt__StringsJVMKt.equals(mediaItemT.getType(), "BoxSet", true)) {
                            seriesId = null;
                        } else {
                            seriesId = StringsKt__StringsJVMKt.equals(mediaItemT.getType(), "Episode", true) ? mediaItemT.getId() : mediaItemT.getId();
                        }
                        if (seriesId != null) {
                            if (!StringsKt.isBlank(seriesId)) {
                                seriesId = null;
                            }
                            if (seriesId != null) {
                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var), null, null, new ha0(va0Var, seriesId, continuation, i4), 3, null);
                            }
                        }
                        String seriesId2 = Intrinsics.areEqual(mediaItemT.getType(), "Episode") ? mediaItemT.getId() : mediaItemT.getId();
                        va0Var.e0 = seriesId2;
                        va0Var.f();
                    } else {
                        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objL);
                        if (thM8828exceptionOrNullimpl == null || (message = thM8828exceptionOrNullimpl.getMessage()) == null) {
                            message = "加载详情失败";
                        }
                        if (z) {
                            Boxing.boxInt(Log.e("DetailViewModel", "刷新详情失败，保留当前内容: ".concat(message)));
                        } else {
                            mutableStateFlow.setValue(new ca0(message));
                        }
                    }
                } catch (Exception e) {
                    String strX = kb0.x("加载详情失败: ", e.getMessage());
                    if (z) {
                        Boxing.boxInt(Log.e("DetailViewModel", "刷新详情异常，保留当前内容", e));
                    } else {
                        mutableStateFlow.setValue(new ca0(strX));
                    }
                }
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) this.g;
                MutableState mutableState = (MutableState) obj3;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.b;
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.c;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!z) {
                        return Unit.INSTANCE;
                    }
                    if (!((Boolean) ((MutableState) obj2).getValue()).booleanValue()) {
                        mutableState.setValue(Boolean.FALSE);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                    mutableState.setValue(Boolean.TRUE);
                    this.b = coroutineScope2;
                    this.c = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FocusRequester focusRequester3 = (FocusRequester) this.h;
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester3, 0, 1, null));
                    break;
                } catch (Throwable th3) {
                    
                    ResultKt.createFailure(th3);
                }
                mutableState.setValue(Boolean.FALSE);
                function0.invoke();
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(va0 va0Var, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.i = va0Var;
        this.d = str;
        this.e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(boolean z, Function0 function0, MutableState mutableState, MutableState mutableState2, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.e = z;
        this.g = function0;
        this.d = mutableState;
        this.i = mutableState2;
        this.h = focusRequester;
    }
}
