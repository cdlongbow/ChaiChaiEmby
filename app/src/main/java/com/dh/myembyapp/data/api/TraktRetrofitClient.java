package com.dh.myembyapp.data.api;

import defpackage.w82;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/dh/myembyapp/data/api/TraktRetrofitClient;", "", "<init>", "()V", "BASE_URL", "", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit$delegate", "Lkotlin/Lazy;", "apiService", "Lcom/dh/myembyapp/data/api/TraktApiService;", "getApiService", "()Lcom/dh/myembyapp/data/api/TraktApiService;", "apiService$delegate", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TraktRetrofitClient {
    private static final String BASE_URL = "https://api.trakt.tv/";
    public static final TraktRetrofitClient INSTANCE = new TraktRetrofitClient();

    /* JADX INFO: renamed from: retrofit$delegate, reason: from kotlin metadata */
    private static final Lazy retrofit = LazyKt.lazy(new w82(4));

    /* JADX INFO: renamed from: apiService$delegate, reason: from kotlin metadata */
    private static final Lazy apiService = LazyKt.lazy(new w82(5));
    public static final int $stable = 8;

    private TraktRetrofitClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TraktApiService apiService_delegate$lambda$0() {
        return (TraktApiService) INSTANCE.getRetrofit().create(TraktApiService.class);
    }

    private final Retrofit getRetrofit() {
        Object value = retrofit.getValue();
        value.getClass();
        return (Retrofit) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retrofit retrofit_delegate$lambda$0() {
        return new Retrofit.Builder().baseUrl(BASE_URL).client(ExternalHttpClient.INSTANCE.createApiClient(ExternalHttpClient.RouteMode.AUTO, false, true)).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public final TraktApiService getApiService() {
        Object value = apiService.getValue();
        value.getClass();
        return (TraktApiService) value;
    }
}
