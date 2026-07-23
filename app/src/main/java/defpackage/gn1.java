package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.MediaStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class gn1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MediaStream a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn1(MediaStream mediaStream, String str, String str2, Context context, Continuation continuation) {
        super(2, continuation);
        this.a = mediaStream;
        this.b = str;
        this.c = str2;
        this.d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new gn1(this.a, this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gn1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strReplace;
        Response response;
        Throwable th;
        Throwable th2;
        Throwable th3;
        Response response2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MediaStream mediaStream = this.a;
        if (!in1.g(mediaStream)) {
            return null;
        }
        String strQ = in1.q(mediaStream);
        String str = this.c;
        str.getClass();
        RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
        String subtitleUrl = retrofitClient.getSubtitleUrl(this.b, str, mediaStream.getIndex(), in1.q(mediaStream), 0L);
        File fileK = in1.k(this.d, subtitleUrl, strQ);
        long j = 0;
        if (fileK.isFile() && fileK.length() > 0) {
            Log.d("SubtitleTrack", "复用转码字幕本地缓存: streamIndex=" + mediaStream.getIndex() + ", path=" + fileK.getAbsolutePath());
            return Uri.fromFile(fileK);
        }
        File file = new File(fileK.getParentFile(), c61.n(fileK.getName(), ".tmp"));
        try {
            OkHttpClient.Builder builderNewBuilder = retrofitClient.getOkHttpClientForExoPlayer().newBuilder();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Response responseExecute = builderNewBuilder.connectTimeout(3500L, timeUnit).readTimeout(3500L, timeUnit).callTimeout(3500L, timeUnit).build().newCall(new Request.Builder().url(subtitleUrl).build()).execute();
            try {
                if (responseExecute.getIsSuccessful()) {
                    ResponseBody responseBodyBody = responseExecute.body();
                    Ref.LongRef longRef = new Ref.LongRef();
                    InputStream inputStreamByteStream = responseBodyBody.byteStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = inputStreamByteStream.read(bArr);
                                if (i != -1) {
                                    long j2 = j;
                                    try {
                                        response2 = responseExecute;
                                        long j3 = longRef.element + ((long) i);
                                        try {
                                            longRef.element = j3;
                                            if (j3 > 4194304) {
                                                throw new IllegalStateException("字幕文件过大: " + j3 + " bytes");
                                            }
                                            fileOutputStream.write(bArr, 0, i);
                                            j = j2;
                                            responseExecute = response2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th3 = th;
                                            response = response2;
                                            try {
                                                throw th3;
                                            } catch (Throwable th5) {
                                                try {
                                                    CloseableKt.closeFinally(fileOutputStream, th3);
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    th2 = th;
                                                    try {
                                                        throw th2;
                                                    } catch (Throwable th7) {
                                                        try {
                                                            CloseableKt.closeFinally(inputStreamByteStream, th2);
                                                            throw th7;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        response2 = responseExecute;
                                    }
                                } else {
                                    Response response3 = responseExecute;
                                    long j4 = j;
                                    try {
                                        Unit unit = Unit.INSTANCE;
                                        try {
                                            CloseableKt.closeFinally(fileOutputStream, null);
                                            try {
                                                CloseableKt.closeFinally(inputStreamByteStream, null);
                                                if (longRef.element <= j4) {
                                                    Log.w("SubtitleTrack", "转码字幕缓存下载为空: streamIndex=" + mediaStream.getIndex());
                                                    CloseableKt.closeFinally(response3, null);
                                                    return null;
                                                }
                                                CloseableKt.closeFinally(response3, null);
                                                if (fileK.exists()) {
                                                    fileK.delete();
                                                }
                                                if (!file.renameTo(fileK)) {
                                                    FilesKt__UtilsKt.copyTo$default(file, fileK, true, 0, 4, null);
                                                    file.delete();
                                                }
                                                Log.d("SubtitleTrack", "转码字幕已缓存为本地文件: streamIndex=" + mediaStream.getIndex() + ", bytes=" + fileK.length() + ", path=" + fileK.getAbsolutePath());
                                                return Uri.fromFile(fileK);
                                            } catch (Throwable th10) {
                                                th = th10;
                                                response = response3;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            response = response3;
                                            th2 = th;
                                            throw th2;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        response = response3;
                                        th3 = th;
                                        throw th3;
                                    }
                                }
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            response = responseExecute;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        response = responseExecute;
                    }
                } else {
                    try {
                        Log.w("SubtitleTrack", "转码字幕缓存下载失败: streamIndex=" + mediaStream.getIndex() + ", code=" + responseExecute.code());
                        CloseableKt.closeFinally(responseExecute, null);
                        return null;
                    } catch (Throwable th15) {
                        th = th15;
                        response = responseExecute;
                    }
                }
            } catch (Throwable th16) {
                th = th16;
                response = responseExecute;
            }
            th = th;
            try {
                throw th;
            } catch (Throwable th17) {
                CloseableKt.closeFinally(response, th);
                throw th17;
            }
        } catch (Exception e) {
            file.delete();
            int index = mediaStream.getIndex();
            try {
                Uri uri = Uri.parse(subtitleUrl);
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                queryParameterNames.getClass();
                for (String str2 : queryParameterNames) {
                    List<String> queryParameters = uri.getQueryParameters(str2);
                    if (queryParameters.isEmpty()) {
                        builderClearQuery.appendQueryParameter(str2, null);
                    } else {
                        for (String str3 : queryParameters) {
                            if (StringsKt__StringsJVMKt.equals(str2, "api_key", true)) {
                                str3 = "<redacted>";
                            }
                            builderClearQuery.appendQueryParameter(str2, str3);
                        }
                    }
                }
                strReplace = builderClearQuery.build().toString();
                strReplace.getClass();
            } catch (Exception unused) {
                strReplace = new Regex("(?i)([?&]api_key=)[^&]*").replace(subtitleUrl, "$1<redacted>");
            }
            Log.w("SubtitleTrack", "转码字幕缓存下载超时或失败: streamIndex=" + index + ", url=" + strReplace, e);
            return null;
        }
    }
}
