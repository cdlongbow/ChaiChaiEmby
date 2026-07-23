package com.dh.myembyapp.data.api;

import androidx.exifinterface.media.ExifInterface;

import com.dh.myembyapp.data.model.TraktDeviceCodeRequest;
import com.dh.myembyapp.data.model.TraktDeviceCodeResponse;
import com.dh.myembyapp.data.model.TraktDeviceTokenRequest;
import com.dh.myembyapp.data.model.TraktEpisode;
import com.dh.myembyapp.data.model.TraktHistoryItem;
import com.dh.myembyapp.data.model.TraktPlaybackProgressItem;
import com.dh.myembyapp.data.model.TraktRefreshTokenRequest;
import com.dh.myembyapp.data.model.TraktScrobbleRequest;
import com.dh.myembyapp.data.model.TraktSearchResult;
import com.dh.myembyapp.data.model.TraktShowWatchedProgress;
import com.dh.myembyapp.data.model.TraktSyncHistoryRequest;
import com.dh.myembyapp.data.model.TraktSyncHistoryResponse;
import com.dh.myembyapp.data.model.TraktTokenResponse;
import defpackage.lm;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJB\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0003\u0010\u0016\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0017JB\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0003\u0010\u0016\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0017JL\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0003\u0010\u0016\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u001cJZ\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0003\u0010\u001f\u001a\u00020 2\b\b\u0003\u0010!\u001a\u00020 2\b\b\u0003\u0010\"\u001a\u00020 H§@¢\u0006\u0002\u0010#JV\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00100\u00032\b\b\u0001\u0010&\u001a\u00020\u00132\b\b\u0001\u0010\u001b\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0003\u0010'\u001a\u00020\u00132\b\b\u0003\u0010\u0016\u001a\u00020\u0013H§@¢\u0006\u0002\u0010(JP\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00132\b\b\u0001\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020,2\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0003\u0010\u0016\u001a\u00020\u0013H§@¢\u0006\u0002\u0010.J<\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0005\u001a\u000201H§@¢\u0006\u0002\u00102J<\u00103\u001a\b\u0012\u0004\u0012\u0002000\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0005\u001a\u000201H§@¢\u0006\u0002\u00102J<\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0005\u001a\u000206H§@¢\u0006\u0002\u00107J<\u00108\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0005\u001a\u000206H§@¢\u0006\u0002\u00107J<\u00109\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0005\u001a\u000206H§@¢\u0006\u0002\u00107¨\u0006:À\u0006\u0003"}, d2 = {"Lcom/dh/myembyapp/data/api/TraktApiService;", "", "generateDeviceCode", "Lretrofit2/Response;", "Lcom/dh/myembyapp/data/model/TraktDeviceCodeResponse;", "request", "Lcom/dh/myembyapp/data/model/TraktDeviceCodeRequest;", "(Lcom/dh/myembyapp/data/model/TraktDeviceCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollDeviceToken", "Lcom/dh/myembyapp/data/model/TraktTokenResponse;", "Lcom/dh/myembyapp/data/model/TraktDeviceTokenRequest;", "(Lcom/dh/myembyapp/data/model/TraktDeviceTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "Lcom/dh/myembyapp/data/model/TraktRefreshTokenRequest;", "(Lcom/dh/myembyapp/data/model/TraktRefreshTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviePlaybackProgress", "", "Lcom/dh/myembyapp/data/model/TraktPlaybackProgressItem;", "authorization", "", "clientId", "apiVersion", "extended", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEpisodePlaybackProgress", "getMovieWatchedHistory", "Lcom/dh/myembyapp/data/model/TraktHistoryItem;", TtmlNode.ATTR_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShowWatchedProgress", "Lcom/dh/myembyapp/data/model/TraktShowWatchedProgress;", "hidden", "", "specials", "countSpecials", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookupById", "Lcom/dh/myembyapp/data/model/TraktSearchResult;", "idType", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShowEpisode", "Lcom/dh/myembyapp/data/model/TraktEpisode;", "season", "", "episode", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToWatchedHistory", "Lcom/dh/myembyapp/data/model/TraktSyncHistoryResponse;", "Lcom/dh/myembyapp/data/model/TraktSyncHistoryRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dh/myembyapp/data/model/TraktSyncHistoryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFromWatchedHistory", "scrobbleStart", "Lokhttp3/ResponseBody;", "Lcom/dh/myembyapp/data/model/TraktScrobbleRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dh/myembyapp/data/model/TraktScrobbleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrobblePause", "scrobbleStop", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface TraktApiService {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object scrobblePause$default(TraktApiService traktApiService, String str, String str2, String str3, TraktScrobbleRequest traktScrobbleRequest, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                lm.e("Super calls with default arguments not supported in this target, function: scrobblePause");
                return null;
            }
            if ((i & 4) != 0) {
                str3 = ExifInterface.GPS_MEASUREMENT_2D;
            }
            return traktApiService.scrobblePause(str, str2, str3, traktScrobbleRequest, continuation);
        }

        public static /* synthetic */ Object scrobbleStart$default(TraktApiService traktApiService, String str, String str2, String str3, TraktScrobbleRequest traktScrobbleRequest, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                lm.e("Super calls with default arguments not supported in this target, function: scrobbleStart");
                return null;
            }
            if ((i & 4) != 0) {
                str3 = ExifInterface.GPS_MEASUREMENT_2D;
            }
            return traktApiService.scrobbleStart(str, str2, str3, traktScrobbleRequest, continuation);
        }

        public static /* synthetic */ Object scrobbleStop$default(TraktApiService traktApiService, String str, String str2, String str3, TraktScrobbleRequest traktScrobbleRequest, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                lm.e("Super calls with default arguments not supported in this target, function: scrobbleStop");
                return null;
            }
            if ((i & 4) != 0) {
                str3 = ExifInterface.GPS_MEASUREMENT_2D;
            }
            return traktApiService.scrobbleStop(str, str2, str3, traktScrobbleRequest, continuation);
        }
    }

    @POST("sync/history")
    Object addToWatchedHistory(@Header(HttpRequestHeader.Authorization) String str, @Header("trakt-api-key") String str2, @Header("trakt-api-version") String str3, @Body TraktSyncHistoryRequest traktSyncHistoryRequest, Continuation<? super Response<TraktSyncHistoryResponse>> continuation);

    @POST("oauth/device/code")
    Object generateDeviceCode(@Body TraktDeviceCodeRequest traktDeviceCodeRequest, Continuation<? super Response<TraktDeviceCodeResponse>> continuation);

    @GET("sync/playback/episodes")
    Object getEpisodePlaybackProgress(@Header(HttpRequestHeader.Authorization) String str, @Header("trakt-api-key") String str2, @Header("trakt-api-version") String str3, @Query("extended") String str4, Continuation<? super Response<List<TraktPlaybackProgressItem>>> continuation);

    @GET("sync/playback/movies")
    Object getMoviePlaybackProgress(@Header(HttpRequestHeader.Authorization) String str, @Header("trakt-api-key") String str2, @Header("trakt-api-version") String str3, @Query("extended") String str4, Continuation<? super Response<List<TraktPlaybackProgressItem>>> continuation);

    @GET("sync/history/movies/{id}")
    Object getMovieWatchedHistory(@Path(TtmlNode.ATTR_ID) String str, @Header(HttpRequestHeader.Authorization) String str2, @Header("trakt-api-key") String str3, @Header("trakt-api-version") String str4, @Query("extended") String str5, Continuation<? super Response<List<TraktHistoryItem>>> continuation);

    @GET("shows/{id}/seasons/{season}/episodes/{episode}")
    Object getShowEpisode(@Path(TtmlNode.ATTR_ID) String str, @Path("season") int i, @Path("episode") int i2, @Header("trakt-api-key") String str2, @Header("trakt-api-version") String str3, @Query("extended") String str4, Continuation<? super Response<TraktEpisode>> continuation);

    @GET("shows/{id}/progress/watched")
    Object getShowWatchedProgress(@Path(TtmlNode.ATTR_ID) String str, @Header(HttpRequestHeader.Authorization) String str2, @Header("trakt-api-key") String str3, @Header("trakt-api-version") String str4, @Query("hidden") boolean z, @Query("specials") boolean z2, @Query("count_specials") boolean z3, Continuation<? super Response<TraktShowWatchedProgress>> continuation);

    @GET("search/{idType}/{id}")
    Object lookupById(@Path("idType") String str, @Path(TtmlNode.ATTR_ID) String str2, @Header("trakt-api-key") String str3, @Header("trakt-api-version") String str4, @Query(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY) String str5, @Query("extended") String str6, Continuation<? super Response<List<TraktSearchResult>>> continuation);

    @POST("oauth/device/token")
    Object pollDeviceToken(@Body TraktDeviceTokenRequest traktDeviceTokenRequest, Continuation<? super Response<TraktTokenResponse>> continuation);

    @POST("oauth/token")
    Object refreshToken(@Body TraktRefreshTokenRequest traktRefreshTokenRequest, Continuation<? super Response<TraktTokenResponse>> continuation);

    @POST("sync/history/remove")
    Object removeFromWatchedHistory(@Header(HttpRequestHeader.Authorization) String str, @Header("trakt-api-key") String str2, @Header("trakt-api-version") String str3, @Body TraktSyncHistoryRequest traktSyncHistoryRequest, Continuation<? super Response<TraktSyncHistoryResponse>> continuation);

    @POST("scrobble/pause")
    Object scrobblePause(@Header(HttpRequestHeader.Authorization) String str, @Header("trakt-api-key") String str2, @Header("trakt-api-version") String str3, @Body TraktScrobbleRequest traktScrobbleRequest, Continuation<? super Response<ResponseBody>> continuation);

    @POST("scrobble/start")
    Object scrobbleStart(@Header(HttpRequestHeader.Authorization) String str, @Header("trakt-api-key") String str2, @Header("trakt-api-version") String str3, @Body TraktScrobbleRequest traktScrobbleRequest, Continuation<? super Response<ResponseBody>> continuation);

    @POST("scrobble/stop")
    Object scrobbleStop(@Header(HttpRequestHeader.Authorization) String str, @Header("trakt-api-key") String str2, @Header("trakt-api-version") String str3, @Body TraktScrobbleRequest traktScrobbleRequest, Continuation<? super Response<ResponseBody>> continuation);
}
