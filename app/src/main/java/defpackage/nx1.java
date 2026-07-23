package defpackage;

import android.util.Log;

import com.dh.myembyapp.data.api.ExternalHttpClient;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ServerIconEntry;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class nx1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ px1 b;
    public final /* synthetic */ ServerIconEntry c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx1(px1 px1Var, ServerIconEntry serverIconEntry, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = px1Var;
        this.c = serverIconEntry;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        nx1 nx1Var = new nx1(this.b, this.c, this.d, this.e, continuation);
        nx1Var.a = obj;
        return nx1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nx1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x019b  */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x019b, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Throwable thM8828exceptionOrNullimpl;
        Object objM8825constructorimpl2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        px1 px1Var = this.b;
        ServerIconEntry serverIconEntry = this.c;
        String str = this.d;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strA = px1.a(px1Var, serverIconEntry.getUrl());
            Response responseExecute = ExternalHttpClient.createDownloadClient$default(ExternalHttpClient.INSTANCE, null, false, true, 3, null).newCall(new Request.Builder().url(strA).get().header(HttpRequestHeader.UserAgent, RetrofitClient.buildUserAgent$default(RetrofitClient.INSTANCE, null, 1, null)).build()).execute();
            try {
                if (!responseExecute.getIsSuccessful()) {
                    throw new IllegalStateException(("图标下载失败（HTTP " + responseExecute.code() + "）").toString());
                }
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody == null) {
                    throw new IllegalStateException("图标下载失败：响应为空");
                }
                MediaType mediaTypeContentType = responseBodyBody.getMediaType();
                String string = mediaTypeContentType != null ? mediaTypeContentType.toString() : null;
                if (string == null) {
                    string = "";
                }
                String strB = px1.b(px1Var, string, strA);
                if (!StringsKt__StringsJVMKt.startsWith$default(string, "image/", false, 2, null) && !px1.c.contains(strB)) {
                    throw new IllegalStateException("所选图标不是有效的图片");
                }
                byte[] bArrBytes = responseBodyBody.bytes();
                if (bArrBytes.length == 0) {
                    throw new IllegalStateException("图标下载失败：内容为空");
                }
                File file = new File(px1Var.a.getFilesDir(), "server_icons");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, "server_" + new Regex("[^A-Za-z0-9._-]").replace(str, "_") + "_" + System.currentTimeMillis() + "." + strB);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream.write(bArrBytes);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    String str2 = this.e;
                    if (str2 != null) {
                        if (Intrinsics.areEqual(str2, file2.getAbsolutePath())) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            try {
                                File file3 = new File(str2);
                                if (!file3.exists()) {
                                    file3 = null;
                                }
                                objM8825constructorimpl2 = Result.m8825constructorimpl(file3 != null ? Boxing.boxBoolean(file3.delete()) : null);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM8825constructorimpl2 = Result.m8825constructorimpl(ResultKt.createFailure(th));
                            }
                            Throwable thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(objM8825constructorimpl2);
                            if (thM8828exceptionOrNullimpl2 != null) {
                                Log.w("ServerIconRepository", "删除旧图标失败: ".concat(str2), thM8828exceptionOrNullimpl2);
                            }
                            Result.m8824boximpl(objM8825constructorimpl2);
                        }
                    }
                    String absolutePath = file2.getAbsolutePath();
                    CloseableKt.closeFinally(responseExecute, null);
                    objM8825constructorimpl = Result.m8825constructorimpl(absolutePath);
                    thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
                    if (thM8828exceptionOrNullimpl != null) {
                        Log.e("ServerIconRepository", "下载图标失败: " + serverIconEntry.getUrl(), thM8828exceptionOrNullimpl);
                    }
                    return Result.m8824boximpl(objM8825constructorimpl);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileOutputStream, th2);
                        throw th3;
                    }
                }
                thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
                if (thM8828exceptionOrNullimpl != null) {
                    Log.e("ServerIconRepository", "下载图标失败: " + serverIconEntry.getUrl(), thM8828exceptionOrNullimpl);
                }
                return Result.m8824boximpl(objM8825constructorimpl);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(responseExecute, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            Result.Companion companion3 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th6));
        }
        Result.Companion companion4 = Result.INSTANCE;
        objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th6));
    }
}
