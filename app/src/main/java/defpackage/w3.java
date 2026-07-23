package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Shadow;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.TraktApiService;
import com.dh.myembyapp.data.model.LibraryQueryResult;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.TraktDeviceTokenRequest;
import com.dh.myembyapp.data.model.TraktTokenResponse;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class w3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public int d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                w3 w3Var = new w3((b4) obj3, (ServerConfig) obj2, continuation);
                w3Var.g = obj;
                return w3Var;
            case 1:
                w3 w3Var2 = new w3((List) this.g, (MutableState) obj3, (LazyListState) obj2, continuation, 1);
                w3Var2.e = obj;
                return w3Var2;
            case 2:
                return new w3((eo1) this.b, (zu0) this.c, (zu0) this.e, (zu0) this.g, (zu0) obj3, (zu0) obj2, continuation, 2);
            case 3:
                return new w3((Context) this.b, (zn1) this.c, (Function1) this.e, (Function0) this.g, (Function1) obj3, (Function2) obj2, continuation, 3);
            default:
                return new w3((i92) this.g, (xa2) obj3, (String) obj2, continuation, 4);
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
        return ((w3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object objM;
        Object objA;
        Object objWithContext;
        i92 i92VarE;
        Object objPollDeviceToken;
        Response response;
        m92 k92Var;
        m92 m92Var;
        Object objR;
        Response response2;
        int i = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ServerConfig serverConfig = (ServerConfig) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) this.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.d;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        b4 b4Var = (b4) obj3;
                        Result.Companion companion = Result.INSTANCE;
                        EmbyApiService embyApiServiceA = b4.a(b4Var, serverConfig);
                        String strE = b4.e(b4Var, serverConfig);
                        this.g = null;
                        this.b = null;
                        this.c = null;
                        this.e = null;
                        this.d = 1;
                        objM = kb0.m(embyApiServiceA, strE, null, this, 2, null);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        objM = obj;
                    }
                    Response response3 = (Response) objM;
                    if (!response3.isSuccessful() || response3.body() == null) {
                        throw new Exception("获取媒体库失败: " + response3.code() + " " + response3.message());
                    }
                    Object objBody = response3.body();
                    objBody.getClass();
                    objM8825constructorimpl = Result.m8825constructorimpl(((LibraryQueryResult) objBody).getItems());
                    Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
                    if (thM8828exceptionOrNullimpl != null) {
                        Log.e("AggregateHubRepo", "[" + serverConfig.getAlias() + "] 获取媒体库失败", thM8828exceptionOrNullimpl);
                    }
                    return Result.m8824boximpl(objM8825constructorimpl);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                }
                break;
            case 1:
                MutableState mutableState = (MutableState) obj3;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.e;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.d;
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Shadow shadow = u90.o;
                        String str = (String) mutableState.getValue();
                        if (str == null) {
                            return Unit.INSTANCE;
                        }
                        Iterator it = ((List) this.g).iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i4 = -1;
                            } else if (!Intrinsics.areEqual(((MediaItem) it.next()).getId(), str)) {
                                i4++;
                            }
                        }
                        int i5 = i4;
                        if (i5 < 0) {
                            return Unit.INSTANCE;
                        }
                        LazyListState lazyListState = (LazyListState) obj2;
                        Result.Companion companion3 = Result.INSTANCE;
                        this.e = null;
                        this.b = null;
                        this.c = null;
                        this.d = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, i5, 0, this, 2, null) == coroutine_suspended2) {
                            return coroutine_suspended2;
                        }
                    } else {
                        if (i3 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Result.m8825constructorimpl(Unit.INSTANCE);
                    break;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m8825constructorimpl(ResultKt.createFailure(th2));
                }
                Shadow shadow2 = u90.o;
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 2:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.d;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MediaItem mediaItem = ((eo1) this.b).a;
                    this.d = 1;
                    objA = yu0.a(mediaItem, this);
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
                uu0 uu0Var = (uu0) objA;
                if (uu0Var != null) {
                    ((zu0) this.e).a.setValue(uu0Var.a);
                    ((zu0) this.g).b.setValue(uu0Var.b);
                    ((zu0) obj3).c.setValue(uu0Var.c);
                    ((zu0) obj2).d.setValue(uu0Var.d);
                } else {
                    zu0 zu0Var = (zu0) this.c;
                    zu0Var.a.setValue(null);
                    zu0Var.b.setValue(null);
                    zu0Var.c.setValue(null);
                    zu0Var.d.setValue(null);
                }
                return Unit.INSTANCE;
            case 3:
                zn1 zn1Var = (zn1) this.c;
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.d;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Context context = (Context) this.b;
                    String str2 = zn1Var.a;
                    String str3 = zn1Var.b;
                    MediaStream mediaStream = zn1Var.c;
                    this.d = 1;
                    objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new gn1(mediaStream, str2, str3, context, null), this);
                    if (objWithContext == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                } else {
                    if (i7 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objWithContext = obj;
                }
                Uri uri = (Uri) objWithContext;
                if (uri == null) {
                    ((Function1) this.e).invoke("该字幕在转码模式下暂不可显示");
                    ((Function0) this.g).invoke();
                    return Unit.INSTANCE;
                }
                ((Function1) obj3).invoke(in1.f(zn1Var.c));
                ((Function2) obj2).invoke(zn1Var.c, uri);
                return Unit.INSTANCE;
            default:
                xa2 xa2Var = (xa2) obj3;
                Object coroutine_suspended5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i8 = this.d;
                try {
                    if (i8 == 0) {
                        ResultKt.throwOnFailure(obj);
                        i92VarE = ((i92) this.g).e();
                        if (!i92.c()) {
                            Log.w("TraktSync", "event=device_token result=skip reason=missing_client_credentials credentials=" + i92.c());
                            return new k92("请先填写 Client ID 和 Client Secret");
                        }
                        TraktApiService traktApiService = xa2Var.c;
                        TraktDeviceTokenRequest traktDeviceTokenRequest = new TraktDeviceTokenRequest((String) obj2, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", "0adc6e4aa2ddd7858eb346db6467d9678709322badd984c655514c97c36a8847");
                        this.b = i92VarE;
                        this.d = 1;
                        objPollDeviceToken = traktApiService.pollDeviceToken(traktDeviceTokenRequest, this);
                        if (objPollDeviceToken == coroutine_suspended5) {
                        }
                        return coroutine_suspended5;
                    }
                    if (i8 == 1) {
                        i92 i92Var = (i92) this.b;
                        ResultKt.throwOnFailure(obj);
                        i92VarE = i92Var;
                        objPollDeviceToken = obj;
                    } else {
                        if (i8 != 2) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        response2 = (Response) this.e;
                        ResultKt.throwOnFailure(obj);
                        objR = obj;
                    }
                    m92Var = (m92) objR;
                    response = response2;
                    xa2Var.getClass();
                    xa2.v(response);
                    return m92Var;
                    response = (Response) objPollDeviceToken;
                    TraktTokenResponse traktTokenResponse = (TraktTokenResponse) response.body();
                    if (response.isSuccessful() && traktTokenResponse != null) {
                        this.b = null;
                        this.e = response;
                        this.c = null;
                        this.d = 2;
                        objR = xa2.r(xa2Var, i92VarE, traktTokenResponse, this);
                        if (objR != coroutine_suspended5) {
                            response2 = response;
                            m92Var = (m92) objR;
                            response = response2;
                        }
                        return coroutine_suspended5;
                    }
                    int iCode = response.code();
                    if (iCode == 400) {
                        k92Var = j92.d;
                    } else if (iCode == 418) {
                        Log.w("TraktSync", "event=device_token result=denied code=418");
                        k92Var = j92.b;
                    } else if (iCode == 429) {
                        Log.w("TraktSync", "event=device_token result=slow_down code=429");
                        k92Var = j92.e;
                    } else if (iCode == 409) {
                        Log.w("TraktSync", "event=device_token result=already_used code=409");
                        k92Var = j92.a;
                    } else if (iCode != 410) {
                        Log.e("TraktSync", "event=device_token result=http_error code=" + response.code() + " message=" + response.message());
                        k92Var = new k92("授权失败: " + response.code() + " " + response.message());
                    } else {
                        Log.w("TraktSync", "event=device_token result=expired code=410");
                        k92Var = j92.c;
                    }
                    m92Var = k92Var;
                    xa2Var.getClass();
                    xa2.v(response);
                    return m92Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Log.e("TraktSync", "event=device_token result=exception message=" + e2.getMessage(), e2);
                    return new k92(kb0.x("授权失败: ", e2.getMessage()));
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(b4 b4Var, ServerConfig serverConfig, Continuation continuation) {
        super(2, continuation);
        this.a = 0;
        this.h = b4Var;
        this.i = serverConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
