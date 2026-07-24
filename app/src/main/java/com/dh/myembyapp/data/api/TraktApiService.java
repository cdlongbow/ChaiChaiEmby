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
public interface TraktApiService {

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
