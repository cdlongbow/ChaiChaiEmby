package com.dh.myembyapp.data.api;

import com.dh.myembyapp.data.model.DanmakuBangumiResponse;
import com.dh.myembyapp.data.model.DanmakuMatchRequest;
import com.dh.myembyapp.data.model.DanmakuMatchResponse;
import com.dh.myembyapp.data.model.DanmakuResponse;
import com.dh.myembyapp.data.model.DanmakuSearchResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/dh/myembyapp/data/api/DanmakuApiService;", "", "searchAnime", "Lretrofit2/Response;", "Lcom/dh/myembyapp/data/model/DanmakuSearchResponse;", "anime", "", "episode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBangumi", "Lcom/dh/myembyapp/data/model/DanmakuBangumiResponse;", "animeId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDanmaku", "Lcom/dh/myembyapp/data/model/DanmakuResponse;", "episodeId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "matchAnime", "Lcom/dh/myembyapp/data/model/DanmakuMatchResponse;", "request", "Lcom/dh/myembyapp/data/model/DanmakuMatchRequest;", "(Lcom/dh/myembyapp/data/model/DanmakuMatchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface DanmakuApiService {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
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
