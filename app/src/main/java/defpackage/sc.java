package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.dlna.DlnaConfig;
import com.dh.myembyapp.dlna.DlnaSettings;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sc extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new sc((vc) obj2, continuation, 0);
            case 1:
                return new sc((va0) obj2, continuation, 1);
            case 2:
                return new sc((DlnaSettings) obj2, continuation, 2);
            default:
                return new sc((ln1) obj2, continuation, 3);
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
        return ((sc) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objE;
        Object obj2;
        String strConcat;
        int i = this.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                vc vcVar = (vc) obj3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        vcVar.e.setValue(Boolean.TRUE);
                        pc pcVar = pc.a;
                        this.b = 1;
                        objE = pcVar.e("0.3.0", this);
                        if (objE == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        objE = ((Result) obj).getValue();
                    }
                    if (Result.m8832isSuccessimpl(objE)) {
                        kc kcVar = (kc) objE;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        boolean z = kcVar.a;
                        String str = kcVar.b;
                        String str2 = kcVar.e;
                        String str3 = kcVar.g;
                        String str4 = kcVar.f;
                        String str5 = kcVar.c;
                        vcVar.k(jCurrentTimeMillis, z);
                        MutableState mutableState = vcVar.k;
                        MutableState mutableState2 = vcVar.j;
                        boolean z2 = kcVar.a;
                        MutableState mutableState3 = vcVar.i;
                        obj2 = objE;
                        if (z2) {
                            mutableState3.setValue(Boolean.TRUE);
                            mutableState2.setValue(str4);
                            mutableState.setValue(str3);
                            vcVar.f(null);
                            vcVar.h(null);
                            vcVar.j("发现新版本：" + str5);
                            String strConcat2 = !StringsKt.isBlank(str2) ? "\n\n发布页：".concat(str2) : "";
                            if (str4 == null || StringsKt.isBlank(str4)) {
                                strConcat = "\n\n提示：该版本未找到可下载 APK 资源，请前往发布页手动下载。";
                            } else {
                                if (str3 == null) {
                                    str3 = "update.apk";
                                }
                                strConcat = "\n可下载更新包：".concat(str3);
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("当前版本：" + str + "\n");
                            sb.append("最新版本：" + str5 + "\n\n");
                            sb.append("更新说明：\n");
                            sb.append(kcVar.d);
                            sb.append(strConcat);
                            sb.append(strConcat2);
                            vcVar.i(sb.toString());
                        } else {
                            mutableState3.setValue(Boolean.FALSE);
                            mutableState2.setValue(null);
                            mutableState.setValue(null);
                            vcVar.f(null);
                            vcVar.h(null);
                            vcVar.j("已是最新版本");
                            vcVar.i("当前版本：" + str + "\n最新版本：" + str5);
                        }
                    } else {
                        obj2 = objE;
                    }
                    Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(obj2);
                    if (thM8828exceptionOrNullimpl != null) {
                        vcVar.i.setValue(Boolean.FALSE);
                        vcVar.j.setValue(null);
                        vcVar.k.setValue(null);
                        vcVar.f(null);
                        vcVar.h(null);
                        vcVar.j("检查更新失败");
                        String message = thM8828exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "网络异常，请稍后重试";
                        }
                        vcVar.i(message);
                        break;
                    }
                    vcVar.e.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    vcVar.e.setValue(Boolean.FALSE);
                    throw th;
                }
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.b = 1;
                        if (((va0) obj3).q(this) == coroutine_suspended2) {
                            return coroutine_suspended2;
                        }
                    } else {
                        if (i3 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    break;
                } catch (Exception e) {
                    kb0.G("刷新剧集进度失败: ", e.getMessage(), "DetailViewModel", e);
                }
                return Unit.INSTANCE;
            case 2:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                Flow<DlnaConfig> configFlow = ((DlnaSettings) obj3).getConfigFlow();
                this.b = 1;
                Object objFirst = FlowKt.first(configFlow, this);
                return objFirst == coroutine_suspended3 ? coroutine_suspended3 : objFirst;
            default:
                ln1 ln1Var = (ln1) obj3;
                nn1 nn1Var = ln1Var.a;
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(800L, this) == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Long lB = nn1Var.b();
                if (lB == null) {
                    return Unit.INSTANCE;
                }
                long jLongValue = lB.longValue();
                ln1Var.d.invoke(ln1Var.c, Boxing.boxLong(jLongValue));
                nn1Var.c(jLongValue);
                nn1Var.g.setValue(null);
                nn1Var.h.setValue(null);
                return Unit.INSTANCE;
        }
    }
}
