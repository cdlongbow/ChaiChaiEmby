package com.dh.myembyapp.data.api;

import com.dh.myembyapp.data.model.DanmakuBangumiResponse;
import com.dh.myembyapp.data.model.DanmakuMatchRequest;
import com.dh.myembyapp.data.model.DanmakuMatchResponse;
import com.dh.myembyapp.data.model.DanmakuResponse;
import com.dh.myembyapp.data.model.DanmakuSearchResponse;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
public interface DanmakuApiService {

        public static final class DefaultImpls {
    }

    @GET("api/v2/bangumi/{animeId}")
    Object getBangumi(@Path("animeId") int i, Continuation<? super Response<DanmakuBangumiResponse>> continuation);

    @GET("api/v2/comment/{episodeId}")
    Object getDanmaku(@Path("episodeId") long j, Continuation<? super Response<DanmakuResponse>> continuation);

    @POST("api/v2/match")
    Object matchAnime(@Body DanmakuMatchRequest danmakuMatchRequest, Continuation<? super Response<DanmakuMatchResponse>> continuation);

    @GET("api/v2/search/episodes")
    Object searchAnime(@Query("anime") String str, @Query("episode") String str2, Continuation<? super Response<DanmakuSearchResponse>> continuation);
}
