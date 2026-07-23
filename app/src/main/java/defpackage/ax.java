package defpackage;

import com.dh.myembyapp.data.api.DanmakuApiClient;
import com.dh.myembyapp.data.api.DanmakuApiService;
import com.dh.myembyapp.data.model.DanmakuComment;
import com.dh.myembyapp.data.model.DanmakuResponse;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ax {
    public final Function1 a;
    public final vw b;

    public ax() {
        d6 d6Var = new d6(1, DanmakuApiClient.INSTANCE, DanmakuApiClient.class, "getServiceForUrl", "getServiceForUrl(Ljava/lang/String;)Lcom/dh/myembyapp/data/api/DanmakuApiService;", 0, 3);
        vw vwVar = new vw(new hq(6), new hq(7), new xw(0));
        this.a = d6Var;
        this.b = vwVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f9 A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:14:0x0050, B:44:0x012f, B:39:0x00f3, B:41:0x00f9, B:48:0x0138, B:46:0x0133, B:21:0x0073, B:28:0x00ba, B:30:0x00be, B:32:0x00c3, B:33:0x00d0, B:35:0x00d6, B:37:0x00e3, B:38:0x00e7, B:24:0x007b), top: B:52:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0138 A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #0 {Exception -> 0x005c, blocks: (B:14:0x0050, B:44:0x012f, B:39:0x00f3, B:41:0x00f9, B:48:0x0138, B:46:0x0133, B:21:0x0073, B:28:0x00ba, B:30:0x00be, B:32:0x00c3, B:33:0x00d0, B:35:0x00d6, B:37:0x00e3, B:38:0x00e7, B:24:0x007b), top: B:52:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012c, code lost:
    
        if (r4 == r9) goto L43;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x012c -> B:44:0x012f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.dh.myembyapp.data.model.DanmakuConfig r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax.a(long, java.lang.String, java.lang.String, java.lang.String, com.dh.myembyapp.data.model.DanmakuConfig, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    public final Object b(long j, String str, String str2, String str3, String str4, boolean z, ContinuationImpl continuationImpl) {
        zw zwVar;
        String str5;
        boolean z2;
        String str6;
        String str7;
        String str8;
        String strR;
        DanmakuResponse danmakuResponse;
        List<DanmakuComment> comments;
        if (continuationImpl instanceof zw) {
            zwVar = (zw) continuationImpl;
            int i = zwVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                zwVar.i = i - Integer.MIN_VALUE;
            } else {
                zwVar = new zw(this, continuationImpl);
            }
        } else {
            zwVar = new zw(this, continuationImpl);
        }
        Object obj = zwVar.g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zwVar.i;
        vw vwVar = this.b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                if (z) {
                    vwVar.a.invoke("使用选中的API: " + str);
                } else {
                    vwVar.a.invoke("尝试备用API: " + str);
                }
                DanmakuApiService danmakuApiService = (DanmakuApiService) this.a.invoke(str);
                zwVar.a = str;
                zwVar.b = str2;
                zwVar.c = str3;
                zwVar.d = str4;
                zwVar.e = z;
                zwVar.i = 1;
                Object danmaku = danmakuApiService.getDanmaku(j, zwVar);
                if (danmaku == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = danmaku;
                str6 = str4;
                str5 = str;
                z2 = z;
                str7 = str3;
                str8 = str2;
            } catch (Exception e) {
                e = e;
                str5 = str;
                z2 = z;
                if (z2) {
                    strR = "选中的API请求异常";
                } else {
                    strR = mr.r("API[", str5, "] 请求异常");
                }
                vwVar.b.invoke(strR + ": " + e.getMessage());
                return null;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = zwVar.e;
            str6 = zwVar.d;
            str7 = zwVar.c;
            str8 = zwVar.b;
            str5 = zwVar.a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e2) {
                e = e2;
                if (z2) {
                    strR = "选中的API请求异常";
                } else {
                    strR = mr.r("API[", str5, "] 请求异常");
                }
                vwVar.b.invoke(strR + ": " + e.getMessage());
                return null;
            }
        }
        Response response = (Response) obj;
        if (response.isSuccessful() && (danmakuResponse = (DanmakuResponse) response.body()) != null && (comments = danmakuResponse.getComments()) != null && !comments.isEmpty()) {
            List<DanmakuComment> comments2 = danmakuResponse.getComments();
            vwVar.a.invoke("弹幕加载成功: " + comments2.size() + "条");
            String str9 = str5;
            try {
                return new ww(str8, str9, str7, comments2, str6, "弹幕加载成功，共" + danmakuResponse.getCount() + "条");
            } catch (Exception e3) {
                e = e3;
                str5 = str9;
                if (z2) {
                    strR = "选中的API请求异常";
                } else {
                    strR = mr.r("API[", str5, "] 请求异常");
                }
                vwVar.b.invoke(strR + ": " + e.getMessage());
                return null;
            }
        }
        return null;
    }
}
