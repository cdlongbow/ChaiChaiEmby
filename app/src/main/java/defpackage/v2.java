package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.AuthenticationResult;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class v2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 0;
    public int b;
    public boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(boolean z, FocusRequester focusRequester, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.c = z;
        this.d = focusRequester;
        this.e = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                return new v2((ServerConfig) obj3, (w2) obj2, continuation);
            default:
                return new v2(this.c, (FocusRequester) obj3, (MutableState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((v2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0104 A[Catch: Exception -> 0x0073, SSLHandshakeException -> 0x0076, SocketTimeoutException -> 0x0079, ConnectException -> 0x007c, UnknownHostException -> 0x007f, TryCatch #4 {ConnectException -> 0x007c, SocketTimeoutException -> 0x0079, UnknownHostException -> 0x007f, SSLHandshakeException -> 0x0076, Exception -> 0x0073, blocks: (B:26:0x0068, B:44:0x00fe, B:46:0x0104, B:50:0x010c, B:52:0x0145, B:53:0x014c, B:55:0x0154, B:56:0x015f, B:57:0x0178, B:59:0x0189, B:62:0x0192), top: B:88:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145 A[Catch: Exception -> 0x0073, SSLHandshakeException -> 0x0076, SocketTimeoutException -> 0x0079, ConnectException -> 0x007c, UnknownHostException -> 0x007f, TryCatch #4 {ConnectException -> 0x007c, SocketTimeoutException -> 0x0079, UnknownHostException -> 0x007f, SSLHandshakeException -> 0x0076, Exception -> 0x0073, blocks: (B:26:0x0068, B:44:0x00fe, B:46:0x0104, B:50:0x010c, B:52:0x0145, B:53:0x014c, B:55:0x0154, B:56:0x015f, B:57:0x0178, B:59:0x0189, B:62:0x0192), top: B:88:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0154 A[Catch: Exception -> 0x0073, SSLHandshakeException -> 0x0076, SocketTimeoutException -> 0x0079, ConnectException -> 0x007c, UnknownHostException -> 0x007f, TryCatch #4 {ConnectException -> 0x007c, SocketTimeoutException -> 0x0079, UnknownHostException -> 0x007f, SSLHandshakeException -> 0x0076, Exception -> 0x0073, blocks: (B:26:0x0068, B:44:0x00fe, B:46:0x0104, B:50:0x010c, B:52:0x0145, B:53:0x014c, B:55:0x0154, B:56:0x015f, B:57:0x0178, B:59:0x0189, B:62:0x0192), top: B:88:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0178 A[Catch: Exception -> 0x0073, SSLHandshakeException -> 0x0076, SocketTimeoutException -> 0x0079, ConnectException -> 0x007c, UnknownHostException -> 0x007f, TryCatch #4 {ConnectException -> 0x007c, SocketTimeoutException -> 0x0079, UnknownHostException -> 0x007f, SSLHandshakeException -> 0x0076, Exception -> 0x0073, blocks: (B:26:0x0068, B:44:0x00fe, B:46:0x0104, B:50:0x010c, B:52:0x0145, B:53:0x014c, B:55:0x0154, B:56:0x015f, B:57:0x0178, B:59:0x0189, B:62:0x0192), top: B:88:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Exception e;
        SSLHandshakeException e2;
        UnknownHostException e3;
        SocketTimeoutException e4;
        ConnectException e5;
        Object value;
        StringBuilder sb;
        String message;
        Throwable thM8828exceptionOrNullimpl;
        String message2;
        ServerPreferences serverPreferences;
        ServerPreferences serverPreferences2;
        Object obj2 = null;
        switch (this.a) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Proxy proxy = lr1.a;
                    boolean z2 = lr1.e;
                    try {
                        Log.d("AddServerViewModel", "验证前设置 directOnly: " + ((ServerConfig) this.d).getDirectOnly() + ", trustAllCerts: " + ((ServerConfig) this.d).getTrustAllCerts());
                        lr1.c(((ServerConfig) this.d).getDirectOnly());
                        RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
                        retrofitClient.initialize(((ServerConfig) this.d).getFullUrl());
                        retrofitClient.setTrustAllCerts(((ServerConfig) this.d).getTrustAllCerts());
                        uf0 uf0Var = ((w2) this.e).b;
                        String username = ((ServerConfig) this.d).getUsername();
                        String password = ((ServerConfig) this.d).getPassword();
                        this.c = z2;
                        this.b = 1;
                        Object objE = uf0Var.e(username, password, this);
                        if (objE == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z = z2;
                        value = objE;
                        if (Result.m8832isSuccessimpl(value)) {
                            if (false) {
                                obj2 = value;
                            }
                            obj2.getClass();
                            AuthenticationResult authenticationResult = (AuthenticationResult) obj2;
                            ((ServerConfig) this.d).setUserId(authenticationResult.getUser().getId());
                            ((ServerConfig) this.d).setAccessToken(authenticationResult.getAccessToken());
                            ((ServerConfig) this.d).setLastLoginTime(System.currentTimeMillis());
                            ((ServerConfig) this.d).setVerified(true);
                            serverPreferences = ((w2) this.e).a;
                            if (serverPreferences != null) {
                                serverPreferences.saveServer((ServerConfig) this.d);
                            }
                            serverPreferences2 = ((w2) this.e).a;
                            if (serverPreferences2 != null) {
                                serverPreferences2.setLastUsedServerId(((ServerConfig) this.d).getId());
                            }
                            Log.d("AddServerViewModel", "✅ 服务器验证成功");
                            ((w2) this.e).c.setValue(new s2((ServerConfig) this.d));
                        } else {
                            lr1.c(z);
                            MutableStateFlow mutableStateFlow = ((w2) this.e).c;
                            thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(value);
                            if (thM8828exceptionOrNullimpl != null) {
                                message2 = "连接验证失败，请检查服务器地址和登录信息";
                            } else {
                                message2 = "连接验证失败，请检查服务器地址和登录信息";
                            }
                            mutableStateFlow.setValue(new q2(message2));
                        }
                    } catch (ConnectException e6) {
                        z = z2;
                        e5 = e6;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "连接被拒绝", e5);
                        ((w2) this.e).c.setValue(new q2("无法连接到服务器\n请检查地址、端口是否正确，以及服务器是否在运行"));
                    } catch (SocketTimeoutException e7) {
                        z = z2;
                        e4 = e7;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "连接超时", e4);
                        ((w2) this.e).c.setValue(new q2("连接超时\n请检查网络连接或服务器是否可访问"));
                    } catch (UnknownHostException e8) {
                        z = z2;
                        e3 = e8;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "DNS解析失败", e3);
                        ((w2) this.e).c.setValue(new q2(mr.r("无法解析服务器地址: ", ((ServerConfig) this.d).getHost(), "\n请检查地址是否正确或网络连接")));
                    } catch (SSLHandshakeException e9) {
                        z = z2;
                        e2 = e9;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "SSL证书错误", e2);
                        ((w2) this.e).c.setValue(new q2("SSL证书验证失败\n如果使用自签名证书，请勾选「信任所有SSL证书」选项"));
                    } catch (Exception e10) {
                        z = z2;
                        e = e10;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "验证失败", e);
                        sb = new StringBuilder("验证失败: ");
                        sb.append(e.getClass().getSimpleName());
                        message = e.getMessage();
                        if (message != null) {
                            sb.append("\n");
                            sb.append(message);
                        }
                        ((w2) this.e).c.setValue(new q2(sb.toString()));
                    }
                } else {
                    if (i != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.c;
                    try {
                        ResultKt.throwOnFailure(obj);
                        value = ((Result) obj).getValue();
                        if (Result.m8832isSuccessimpl(value)) {
                            if (false) {
                                obj2 = value;
                            }
                            obj2.getClass();
                            AuthenticationResult authenticationResult2 = (AuthenticationResult) obj2;
                            ((ServerConfig) this.d).setUserId(authenticationResult2.getUser().getId());
                            ((ServerConfig) this.d).setAccessToken(authenticationResult2.getAccessToken());
                            ((ServerConfig) this.d).setLastLoginTime(System.currentTimeMillis());
                            ((ServerConfig) this.d).setVerified(true);
                            serverPreferences = ((w2) this.e).a;
                            if (serverPreferences != null) {
                                serverPreferences.saveServer((ServerConfig) this.d);
                            }
                            serverPreferences2 = ((w2) this.e).a;
                            if (serverPreferences2 != null) {
                                serverPreferences2.setLastUsedServerId(((ServerConfig) this.d).getId());
                            }
                            Log.d("AddServerViewModel", "✅ 服务器验证成功");
                            ((w2) this.e).c.setValue(new s2((ServerConfig) this.d));
                        } else {
                            lr1.c(z);
                            MutableStateFlow mutableStateFlow2 = ((w2) this.e).c;
                            thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(value);
                            if (thM8828exceptionOrNullimpl != null || (message2 = thM8828exceptionOrNullimpl.getMessage()) == null) {
                                message2 = "连接验证失败，请检查服务器地址和登录信息";
                            }
                            mutableStateFlow2.setValue(new q2(message2));
                        }
                    } catch (ConnectException e11) {
                        e5 = e11;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "连接被拒绝", e5);
                        ((w2) this.e).c.setValue(new q2("无法连接到服务器\n请检查地址、端口是否正确，以及服务器是否在运行"));
                    } catch (SocketTimeoutException e12) {
                        e4 = e12;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "连接超时", e4);
                        ((w2) this.e).c.setValue(new q2("连接超时\n请检查网络连接或服务器是否可访问"));
                    } catch (UnknownHostException e13) {
                        e3 = e13;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "DNS解析失败", e3);
                        ((w2) this.e).c.setValue(new q2(mr.r("无法解析服务器地址: ", ((ServerConfig) this.d).getHost(), "\n请检查地址是否正确或网络连接")));
                    } catch (SSLHandshakeException e14) {
                        e2 = e14;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "SSL证书错误", e2);
                        ((w2) this.e).c.setValue(new q2("SSL证书验证失败\n如果使用自签名证书，请勾选「信任所有SSL证书」选项"));
                    } catch (Exception e15) {
                        e = e15;
                        lr1.c(z);
                        Log.e("AddServerViewModel", "验证失败", e);
                        sb = new StringBuilder("验证失败: ");
                        sb.append(e.getClass().getSimpleName());
                        message = e.getMessage();
                        if (message != null) {
                            sb.append("\n");
                            sb.append(message);
                        }
                        ((w2) this.e).c.setValue(new q2(sb.toString()));
                    }
                }
                return Unit.INSTANCE;
            default:
                MutableState mutableState = (MutableState) this.e;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.c && ((Boolean) mutableState.getValue()).booleanValue()) {
                            this.b = 1;
                            if (DelayKt.delay(60L, this) == coroutine_suspended2) {
                                return coroutine_suspended2;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) this.d, 0, 1, null);
                    break;
                } catch (Exception e16) {
                    Log.e("ResumeItemSection", "Error restoring focus (item-level)", e16);
                    mutableState.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(ServerConfig serverConfig, w2 w2Var, Continuation continuation) {
        super(2, continuation);
        this.d = serverConfig;
        this.e = w2Var;
    }
}
