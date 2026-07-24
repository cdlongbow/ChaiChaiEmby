package defpackage;

import android.util.Log;

import com.dh.myembyapp.data.api.RetrofitClient;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;

/* JADX INFO: loaded from: classes4.dex */
public final class mc extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(String str, Continuation continuation) {
        super(2, continuation);
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new mc(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Long l;
        String str;
        String str2;
        String str3 = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            gc gcVarB = pc.b(pc.c(new Request.Builder().url("https://api.github.com/repos/dh374374/ChaiChaiEmbyTV/releases/latest").header(HttpRequestHeader.Accept, "application/vnd.github+json").header("X-GitHub-Api-Version", "2022-11-28").header(HttpRequestHeader.UserAgent, RetrofitClient.INSTANCE.buildUserAgent("0.3.0")).build()));
            String str4 = gcVarB.a;
            String string = null;
            String string2 = str4 != null ? StringsKt.trim((CharSequence) str4).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            if (StringsKt.isBlank(string2)) {
                
                return Result.m8824boximpl(ResultKt.createFailure(new IOException("GitHub 返回数据异常：tag_name 为空")));
            }
            String str5 = gcVarB.b;
            String string3 = str5 != null ? StringsKt.trim((CharSequence) str5).toString() : null;
            if (string3 == null || StringsKt.isBlank(string3)) {
                string3 = null;
            }
            if (string3 == null) {
                string3 = string2;
            }
            String strI = pc.i(string3);
            String strI2 = pc.i(str3);
            String str6 = gcVarB.c;
            String string4 = str6 != null ? StringsKt.trim((CharSequence) str6).toString() : null;
            if (string4 == null || StringsKt.isBlank(string4)) {
                string4 = null;
            }
            if (string4 == null) {
                string4 = "暂无更新说明";
            }
            String str7 = string4;
            boolean zA = pc.a(str3, string2);
            ic icVarD = pc.d(gcVarB.e);
            
            String str8 = gcVarB.d;
            String string5 = str8 != null ? StringsKt.trim((CharSequence) str8).toString() : null;
            String str9 = string5 == null ? "" : string5;
            String string6 = (icVarD == null || (str2 = icVarD.c) == null) ? null : StringsKt.trim((CharSequence) str2).toString();
            if (icVarD != null && (str = icVarD.a) != null) {
                string = StringsKt.trim((CharSequence) str).toString();
            }
            objM8825constructorimpl = new kc(zA, strI2, strI, str7, str9, string6, string, (icVarD == null || (l = icVarD.b == null) ? 0L : l.longValue()));
            return Result.m8824boximpl(objM8825constructorimpl);
        } catch (Exception e) {
            Log.e("AppUpdateRepository", "检查更新失败", e);
            
            objM8825constructorimpl = ResultKt.createFailure(e);
        }
    }
}
