package com.dh.myembyapp.data.repository;

import android.util.Log;
import com.dh.myembyapp.data.api.ExternalHttpClient;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ServerIconEntry;
import com.dh.myembyapp.data.model.ServerIconLibrary;
import defpackage.px1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ px1 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(px1 px1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.b = px1Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(this.b, this.c, continuation);
        aVar.a = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        String strString;
        String str;
        ServerIconEntry serverIconEntry;
        HttpUrl httpUrlResolve;
        String url;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        px1 px1Var = this.b;
        String str2 = this.c;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strA = px1.a(px1Var, str2);
            Response responseExecute = ExternalHttpClient.createApiClient$default(ExternalHttpClient.INSTANCE, null, false, true, 3, null).newCall(new Request.Builder().url(strA).get().header("Accept", "application/json").header("User-Agent", RetrofitClient.buildUserAgent$default(RetrofitClient.INSTANCE, null, 1, null)).build()).execute();
            try {
                if (!responseExecute.getIsSuccessful()) {
                    throw new IllegalStateException(("图标库加载失败（HTTP " + responseExecute.code() + "）").toString());
                }
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody != null && (strString = responseBodyBody.string()) != null) {
                    if (StringsKt.isBlank(strString)) {
                        strString = null;
                    }
                    if (strString != null) {
                        ServerIconRepository$IconLibraryPayload serverIconRepository$IconLibraryPayload = (ServerIconRepository$IconLibraryPayload) px1Var.b.fromJson(strString, ServerIconRepository$IconLibraryPayload.class);
                        if (serverIconRepository$IconLibraryPayload == null) {
                            throw new IllegalStateException("图标库格式不正确");
                        }
                        List<ServerIconRepository$IconItemPayload> icons = serverIconRepository$IconLibraryPayload.getIcons();
                        if (icons == null) {
                            icons = CollectionsKt.emptyList();
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = icons.iterator();
                        int i = 0;
                        while (true) {
                            str = "";
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            ServerIconRepository$IconItemPayload serverIconRepository$IconItemPayload = (ServerIconRepository$IconItemPayload) next;
                            String name = serverIconRepository$IconItemPayload.getName();
                            String string = name != null ? StringsKt.trim((CharSequence) name).toString() : null;
                            if (string == null) {
                                string = "";
                            }
                            String url2 = serverIconRepository$IconItemPayload.getUrl();
                            String string2 = url2 != null ? StringsKt.trim((CharSequence) url2).toString() : null;
                            if (string2 != null) {
                                str = string2;
                            }
                            if (StringsKt.isBlank(string) || StringsKt.isBlank(str)) {
                                serverIconEntry = null;
                            } else {
                                HttpUrl.Companion companion2 = HttpUrl.INSTANCE;
                                HttpUrl httpUrl = companion2.parse(str);
                                if (httpUrl != null) {
                                    url = httpUrl.getUrl();
                                } else {
                                    HttpUrl httpUrl2 = companion2.parse(strA);
                                    url = (httpUrl2 == null || (httpUrlResolve = httpUrl2.resolve(str)) == null) ? null : httpUrlResolve.getUrl();
                                }
                                if (url == null) {
                                    serverIconEntry = null;
                                } else {
                                    serverIconEntry = new ServerIconEntry(strA + "#" + i, string, url);
                                }
                            }
                            if (serverIconEntry != null) {
                                arrayList.add(serverIconEntry);
                            }
                            i = i2;
                        }
                        if (arrayList.isEmpty()) {
                            throw new IllegalStateException("图标库没有可用图标");
                        }
                        String name2 = serverIconRepository$IconLibraryPayload.getName();
                        String string3 = name2 != null ? StringsKt.trim((CharSequence) name2).toString() : null;
                        if (string3 == null || StringsKt.isBlank(string3)) {
                            string3 = null;
                        }
                        if (string3 == null) {
                            string3 = "未命名图标库";
                        }
                        String description = serverIconRepository$IconLibraryPayload.getDescription();
                        String string4 = description != null ? StringsKt.trim((CharSequence) description).toString() : null;
                        if (string4 != null) {
                            str = string4;
                        }
                        ServerIconLibrary serverIconLibrary = new ServerIconLibrary(strA, string3, str, arrayList);
                        CloseableKt.closeFinally(responseExecute, null);
                        objM8825constructorimpl = Result.m8825constructorimpl(serverIconLibrary);
                        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
                        if (thM8828exceptionOrNullimpl != null) {
                            Log.e("ServerIconRepository", "加载图标库失败: " + str2, thM8828exceptionOrNullimpl);
                        }
                        return Result.m8824boximpl(objM8825constructorimpl);
                    }
                }
                throw new IllegalStateException("图标库返回为空");
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th3));
        }
    }
}
