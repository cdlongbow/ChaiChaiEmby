package com.dh.myembyapp.data.api;

import defpackage.w82;
import kotlin.Lazy;
import kotlin.LazyKt;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class TraktRetrofitClient {
    private static final String BASE_URL = "https://api.trakt.tv/";
    public static final TraktRetrofitClient INSTANCE = new TraktRetrofitClient();

    /* JADX INFO: renamed from: retrofit$delegate, reason: from kotlin metadata */
    private static final Lazy retrofit = LazyKt.lazy(new w82(4));

    /* JADX INFO: renamed from: apiService$delegate, reason: from kotlin metadata */
    private static final Lazy apiService = LazyKt.lazy(new w82(5));
    

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
