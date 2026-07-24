package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import androidx.lifecycle.ViewModel;
import androidx.media3.exoplayer.Renderer;
import com.dh.myembyapp.data.api.UserDataRequest;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class uc extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(zq0 zq0Var, ServerConfig serverConfig, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.a = 2;
        this.d = zq0Var;
        this.g = serverConfig;
        this.c = j;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                return new uc((vc) obj4, (String) obj3, (String) obj2, this.c, continuation, 0);
            case 1:
                return new uc((va0) obj4, (m82) obj3, this.c, (MediaItem) obj2, continuation, 1);
            case 2:
                return new uc((zq0) obj4, (ServerConfig) obj2, this.c, (String) obj3, continuation);
            case 3:
                return new uc((to1) obj4, (m82) obj3, this.c, (MediaItem) obj2, continuation, 3);
            default:
                return new uc((to1) obj4, (String) obj3, (String) obj2, this.c, continuation, 4);
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
        }
        return ((uc) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Object objF;
        boolean z2;
        String str;
        Object objF2;
        Object objA;
        Object value;
        Map mapPlus;
        DisplayMetrics displayMetrics;
        Object objF3;
        Resources resources;
        String str2;
        Object value2;
        int i = this.a;
        String str3 = "";
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.g;
        long j = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                vc vcVar = (vc) obj3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                int i4 = 0;
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        pc pcVar = pc.a;
                        try {
                            Context context = vcVar.a;
                            String str4 = (String) obj2;
                            String str5 = (String) obj4;
                            rc rcVar = new rc(vcVar, i2);
                            this.b = 1;
                            boolean z3 = false;
                            try {
                                objF = pcVar.f(context, str4, str5, rcVar, this);
                                z2 = z3;
                                if (objF == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z = z3;
                                if (j == vcVar.q && !vcVar.p) {
                                    vcVar.g(z);
                                    vcVar.o = null;
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z = 0;
                        }
                    } else {
                        if (i3 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        objF = ((Result) obj).getValue();
                        z2 = false;
                    }
                    i4 = (j > vcVar.q ? 1 : (j == vcVar.q ? 0 : -1));
                    if (i4 == 0 && !vcVar.p) {
                        vcVar.g(z2);
                        if (Result.m8832isSuccessimpl(objF)) {
                            cc ccVar = (cc) objF;
                            vcVar.f(ccVar.a.getAbsolutePath());
                            vcVar.h(null);
                            int iOrdinal = ccVar.b.ordinal();
                            if (iOrdinal == 0) {
                                str = "下载源：原始 GitHub 地址";
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = ccVar.c ? "下载源：gh-proxy（已自动切换）" : "下载源：gh-proxy";
                            }
                            StringBuilder sb = new StringBuilder();
                            String str6 = (String) vcVar.h.getValue();
                            if (str6 != null) {
                                str3 = str6;
                            }
                            sb.append(str3);
                            sb.append("\n\n下载完成：" + ccVar.a.getName());
                            sb.append("\n".concat(str));
                            sb.append("\n请点击“安装更新”继续");
                            vcVar.i(sb.toString());
                        }
                        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objF);
                        if (thM8828exceptionOrNullimpl != null) {
                            vcVar.j("下载失败");
                            String message = thM8828exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = "下载更新包失败，请稍后重试";
                            }
                            vcVar.i(message);
                        }
                        if (j == vcVar.q && !vcVar.p) {
                            vcVar.g(z2);
                            vcVar.o = null;
                        }
                        return Unit.INSTANCE;
                    }
                    Unit unit = Unit.INSTANCE;
                    if (i4 == 0 && !vcVar.p) {
                        vcVar.g(z2);
                        vcVar.o = null;
                    }
                    return unit;
                } catch (Throwable th3) {
                    th = th3;
                    z = i4;
                }
                break;
            case 1:
                MediaItem mediaItem = (MediaItem) obj4;
                va0 va0Var = (va0) obj3;
                MutableStateFlow mutableStateFlow = va0Var.W;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                    displayMetrics2.getClass();
                    int iRoundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, 400.0f, displayMetrics2));
                    uf0 uf0Var = va0Var.a;
                    m82 m82Var = (m82) obj2;
                    String str7 = m82Var.a;
                    String str8 = m82Var.b;
                    Integer numBoxInt = Boxing.boxInt(iRoundToInt);
                    this.b = 1;
                    objF2 = uf0Var.F(str7, str8, numBoxInt, this);
                    if (objF2 == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objF2 = ((Result) obj).getValue();
                }
                if (j != va0Var.Y) {
                    return Unit.INSTANCE;
                }
                if (Result.m8832isSuccessimpl(objF2)) {
                    String str9 = (String) (false ? null : objF2);
                    if (str9 == null || StringsKt.isBlank(str9)) {
                        Log.d("DetailViewModel", "详情页 Logo 解析结果为空: itemId=" + mediaItem.getId());
                        mutableStateFlow.setValue(new y90(mediaItem.getId()));
                    } else {
                        Log.d("DetailViewModel", "详情页 Logo 已解析: itemId=" + mediaItem.getId() + ", resolvedUrl=" + str9);
                        mutableStateFlow.setValue(new v90(mediaItem.getId(), str9));
                    }
                } else {
                    Throwable thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(objF2);
                    Log.e("DetailViewModel", "解析详情页 Logo 失败: " + (thM8828exceptionOrNullimpl2 != null ? thM8828exceptionOrNullimpl2.getMessage() : null));
                    mutableStateFlow.setValue(new y90(mediaItem.getId()));
                }
                return Unit.INSTANCE;
            case 2:
                zq0 zq0Var = (zq0) obj3;
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.b;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    objA = zq0Var.b.a((ServerConfig) obj4, this);
                    if (objA == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i6 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objA = obj;
                }
                ServerPingState serverPingState = (ServerPingState) objA;
                MutableStateFlow mutableStateFlow2 = zq0Var.w;
                String str10 = (String) obj2;
                do {
                    value = mutableStateFlow2.getValue();
                    mapPlus = (Map) value;
                    if (j == zq0Var.E && mapPlus.containsKey(str10)) {
                        mapPlus = MapsKt.plus(mapPlus, TuplesKt.to(str10, serverPingState));
                    }
                } while (!mutableStateFlow2.compareAndSet(value, mapPlus));
                return Unit.INSTANCE;
            case 3:
                to1 to1Var = (to1) obj3;
                MutableStateFlow mutableStateFlow3 = to1Var.s;
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.b;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Context context2 = to1Var.b;
                    if (context2 == null || (resources = context2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                        displayMetrics = Resources.getSystem().getDisplayMetrics();
                    }
                    displayMetrics.getClass();
                    int iRoundToInt2 = MathKt.roundToInt(TypedValue.applyDimension(1, 250.0f, displayMetrics));
                    uf0 uf0Var2 = to1Var.a;
                    m82 m82Var2 = (m82) obj2;
                    String str11 = m82Var2.a;
                    String str12 = m82Var2.b;
                    Integer numBoxInt2 = Boxing.boxInt(iRoundToInt2);
                    this.b = 1;
                    objF3 = uf0Var2.F(str11, str12, numBoxInt2, this);
                    if (objF3 == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                } else {
                    if (i7 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objF3 = ((Result) obj).getValue();
                }
                if (j != to1Var.u) {
                    return Unit.INSTANCE;
                }
                if (Result.m8832isSuccessimpl(objF3)) {
                    if (false) {
                        objF3 = null;
                    }
                    String str13 = (String) objF3;
                    String str14 = (str13 == null || StringsKt.isBlank(str13)) ? null : str13;
                    s01.E("播放器 Logo 已解析: itemId=", ((MediaItem) obj4).getId(), ", resolvedUrl=", str14 != null ? str14 : "", "PlayerViewModel");
                    mutableStateFlow3.setValue(str14);
                } else {
                    Throwable thM8828exceptionOrNullimpl3 = Result.m8828exceptionOrNullimpl(objF3);
                    Log.e("PlayerViewModel", "播放器 Logo 解析失败: " + (thM8828exceptionOrNullimpl3 != null ? thM8828exceptionOrNullimpl3.getMessage() : null));
                    mutableStateFlow3.setValue(null);
                }
                return Unit.INSTANCE;
            default:
                String str15 = (String) obj4;
                Object coroutine_suspended5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i8 = this.b;
                try {
                    if (i8 == 0) {
                        ResultKt.throwOnFailure(obj);
                        uf0 uf0Var3 = ((to1) obj3).a;
                        String str16 = (String) obj2;
                        str2 = " message=";
                        try {
                            UserDataRequest userDataRequest = new UserDataRequest(this.c, null, null, null, null, 30, null);
                            this.b = 1;
                            Object objI = uf0Var3.I(str16, str15, userDataRequest, this);
                            if (objI == coroutine_suspended5) {
                                return coroutine_suspended5;
                            }
                            value2 = objI;
                        } catch (Exception e) {
                            e = e;
                            Log.e("TraktSync", "event=emby_sync result=exception itemId=" + str15 + " positionMs=" + (j / Renderer.DEFAULT_DURATION_TO_PROGRESS_US) + str2 + e.getMessage(), e);
                        }
                    } else {
                        if (i8 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        value2 = ((Result) obj).getValue();
                        str2 = " message=";
                    }
                    if (false) {
                        long j2 = j / Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
                        Throwable thM8828exceptionOrNullimpl4 = Result.m8828exceptionOrNullimpl(value2);
                        Log.w("TraktSync", "event=emby_sync result=failure itemId=" + str15 + " positionMs=" + j2 + str2 + (thM8828exceptionOrNullimpl4 != null ? thM8828exceptionOrNullimpl4.getMessage() : null));
                    }
                    break;
                } catch (Exception e2) {
                    e = e2;
                    str2 = " message=";
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc(ViewModel viewModel, m82 m82Var, long j, MediaItem mediaItem, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = viewModel;
        this.e = m82Var;
        this.c = j;
        this.g = mediaItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc(Object obj, String str, String str2, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = obj;
        this.e = str;
        this.g = str2;
        this.c = j;
    }
}
