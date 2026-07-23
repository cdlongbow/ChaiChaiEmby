package com.dh.myembyapp.server;

import android.util.Log;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ServerConfig;
import com.google.gson.Gson;
import defpackage.rd1;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/dh/myembyapp/server/RemoteBackupRouteFetchResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.dh.myembyapp.server.BackupRouteConfigServerManager$fetchServerDomains$2", f = "BackupRouteConfigServerManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
public final class BackupRouteConfigServerManager$fetchServerDomains$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends RemoteBackupRouteFetchResult>>, Object> {
    final /* synthetic */ ServerConfig $server;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BackupRouteConfigServerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupRouteConfigServerManager$fetchServerDomains$2(ServerConfig serverConfig, BackupRouteConfigServerManager backupRouteConfigServerManager, Continuation<? super BackupRouteConfigServerManager$fetchServerDomains$2> continuation) {
        super(2, continuation);
        this.$server = serverConfig;
        this.this$0 = backupRouteConfigServerManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackupRouteConfigServerManager$fetchServerDomains$2 backupRouteConfigServerManager$fetchServerDomains$2 = new BackupRouteConfigServerManager$fetchServerDomains$2(this.$server, this.this$0, continuation);
        backupRouteConfigServerManager$fetchServerDomains$2.L$0 = obj;
        return backupRouteConfigServerManager$fetchServerDomains$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<RemoteBackupRouteFetchResult>> continuation) {
        return ((BackupRouteConfigServerManager$fetchServerDomains$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        HttpUrl.Builder builderNewBuilder;
        HttpUrl.Builder builderAddPathSegments;
        HttpUrl httpUrlBuild;
        Object objM8825constructorimpl2;
        Result resultM8824boximpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        try {
            HttpUrl httpUrl = HttpUrl.INSTANCE.parse(this.$server.getFullUrl());
            if (httpUrl == null || (builderNewBuilder = httpUrl.newBuilder()) == null || (builderAddPathSegments = builderNewBuilder.addPathSegments("emby/System/Ext/ServerDomains")) == null || (httpUrlBuild = builderAddPathSegments.build()) == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Invalid server url"))));
            }
            Request.Builder builderHeader = new Request.Builder().url(httpUrlBuild).header("Accept", "application/json").header("Accept-Language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7").header("User-Agent", RetrofitClient.INSTANCE.buildUserAgent("0.3.0"));
            String accessToken = this.$server.getAccessToken();
            String str = "";
            if (accessToken == null) {
                accessToken = "";
            }
            Response responseExecute = this.this$0.createFetchClient(this.$server, httpUrlBuild.host()).newCall(builderHeader.header("X-Emby-Token", accessToken).header("X-Emby-Authorization", this.this$0.buildEmbyAuthorizationHeader(this.$server)).get().build()).execute();
            BackupRouteConfigServerManager backupRouteConfigServerManager = this.this$0;
            ServerConfig serverConfig = this.$server;
            try {
                if (responseExecute.getIsSuccessful()) {
                    ResponseBody responseBodyBody = responseExecute.body();
                    String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                    if (strString != null) {
                        str = strString;
                    }
                    if (StringsKt.isBlank(str)) {
                        Result.Companion companion2 = Result.INSTANCE;
                        resultM8824boximpl = Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(new IllegalStateException("Empty response body"))));
                    } else {
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            ExtServerDomainsResponse extServerDomainsResponse = (ExtServerDomainsResponse) new Gson().fromJson(str, ExtServerDomainsResponse.class);
                            if (extServerDomainsResponse == null) {
                                extServerDomainsResponse = new ExtServerDomainsResponse(null, null, 3, null);
                            }
                            objM8825constructorimpl2 = Result.m8825constructorimpl(extServerDomainsResponse);
                        } catch (Throwable th) {
                            Result.Companion companion4 = Result.INSTANCE;
                            objM8825constructorimpl2 = Result.m8825constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl2);
                        if (thM8828exceptionOrNullimpl != null) {
                            Log.e("BackupRouteCfgServer", "解析备用线路列表失败", thM8828exceptionOrNullimpl);
                            Result resultM8824boximpl2 = Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(thM8828exceptionOrNullimpl)));
                            CloseableKt.closeFinally(responseExecute, null);
                            return resultM8824boximpl2;
                        }
                        ExtServerDomainsResponse extServerDomainsResponse2 = (ExtServerDomainsResponse) objM8825constructorimpl2;
                        if (!Intrinsics.areEqual(extServerDomainsResponse2.getOk(), Boxing.boxBoolean(true))) {
                            Result resultM8824boximpl3 = Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(new IllegalStateException("Response ok=false"))));
                            CloseableKt.closeFinally(responseExecute, null);
                            return resultM8824boximpl3;
                        }
                        List<ExtServerDomainItem> data = extServerDomainsResponse2.getData();
                        if (data == null) {
                            data = CollectionsKt.emptyList();
                        }
                        List listBuildImportableRoutes = backupRouteConfigServerManager.buildImportableRoutes(serverConfig, data);
                        if (listBuildImportableRoutes.isEmpty()) {
                            Result resultM8824boximpl4 = Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(new NoSuchElementException("No importable routes"))));
                            CloseableKt.closeFinally(responseExecute, null);
                            return resultM8824boximpl4;
                        }
                        objM8825constructorimpl = Result.m8825constructorimpl(new RemoteBackupRouteFetchResult(listBuildImportableRoutes.size(), CollectionsKt.take(listBuildImportableRoutes, 50)));
                        CloseableKt.closeFinally(responseExecute, null);
                    }
                    Log.e("BackupRouteCfgServer", "获取服务器备用线路失败", e);
                    Result.Companion companion5 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(e));
                } else {
                    Result.Companion companion6 = Result.INSTANCE;
                    resultM8824boximpl = Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(new IllegalStateException("HTTP " + responseExecute.code()))));
                }
                CloseableKt.closeFinally(responseExecute, null);
                return resultM8824boximpl;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(responseExecute, th2);
                    throw th3;
                }
            }
        } catch (Exception e) {
            Log.e("BackupRouteCfgServer", "获取服务器备用线路失败", e);
            Result.Companion companion7 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(e));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends RemoteBackupRouteFetchResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<RemoteBackupRouteFetchResult>>) continuation);
    }
}
