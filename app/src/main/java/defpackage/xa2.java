package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.Renderer;


import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.api.TraktApiService;
import com.dh.myembyapp.data.api.TraktRetrofitClient;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ProviderIds;
import com.dh.myembyapp.data.model.TraktEpisode;
import com.dh.myembyapp.data.model.TraktHistoryEpisode;
import com.dh.myembyapp.data.model.TraktHistoryMovie;
import com.dh.myembyapp.data.model.TraktHistorySeason;
import com.dh.myembyapp.data.model.TraktHistoryShow;
import com.dh.myembyapp.data.model.TraktIds;
import com.dh.myembyapp.data.model.TraktMovie;
import com.dh.myembyapp.data.model.TraktPlaybackProgressItem;
import com.dh.myembyapp.data.model.TraktRefreshTokenRequest;
import com.dh.myembyapp.data.model.TraktScrobbleEpisode;
import com.dh.myembyapp.data.model.TraktScrobbleMovie;
import com.dh.myembyapp.data.model.TraktScrobbleRequest;
import com.dh.myembyapp.data.model.TraktScrobbleShow;
import com.dh.myembyapp.data.model.TraktSearchResult;
import com.dh.myembyapp.data.model.TraktShow;
import com.dh.myembyapp.data.model.TraktShowWatchedProgress;
import com.dh.myembyapp.data.model.TraktSyncHistoryNotFound;
import com.dh.myembyapp.data.model.TraktSyncHistoryRequest;
import com.dh.myembyapp.data.model.TraktSyncHistoryResponse;
import com.dh.myembyapp.data.model.TraktTokenResponse;
import com.dh.myembyapp.data.model.TraktWatchedEpisode;
import com.dh.myembyapp.data.model.TraktWatchedSeason;
import com.dh.myembyapp.data.model.UserData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class xa2 {
    public final Context a;
    public final ab2 b;
    public final TraktApiService c;
    public final uf0 d;
    public final SharedPreferences e;

    public xa2(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        applicationContext.getClass();
        this.b = new ab2(applicationContext);
        this.c = TraktRetrofitClient.INSTANCE.getApiService();
        this.d = new uf0();
        this.e = applicationContext.getSharedPreferences("trakt_episode_id_cache", 0);
    }

    public static boolean D(TraktIds traktIds, String str) {
        String string;
        Integer intOrNull;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) {
            return false;
        }
        int iIntValue = intOrNull.intValue();
        Integer tmdb = traktIds.getTmdb();
        return tmdb != null && tmdb.intValue() == iIntValue;
    }

    public static int E(TraktSyncHistoryResponse traktSyncHistoryResponse) {
        TraktSyncHistoryNotFound notFound = traktSyncHistoryResponse.getNotFound();
        List<TraktHistoryMovie> movies = notFound != null ? notFound.getMovies() : null;
        if (movies == null) {
            movies = CollectionsKt.emptyList();
        }
        int size = movies.size();
        TraktSyncHistoryNotFound notFound2 = traktSyncHistoryResponse.getNotFound();
        List<TraktHistoryShow> shows = notFound2 != null ? notFound2.getShows() : null;
        if (shows == null) {
            shows = CollectionsKt.emptyList();
        }
        int size2 = shows.size() + size;
        TraktSyncHistoryNotFound notFound3 = traktSyncHistoryResponse.getNotFound();
        List<TraktHistorySeason> seasons = notFound3 != null ? notFound3.getSeasons() : null;
        if (seasons == null) {
            seasons = CollectionsKt.emptyList();
        }
        Iterator<T> it = seasons.iterator();
        int iCoerceAtLeast = 0;
        while (it.hasNext()) {
            iCoerceAtLeast += RangesKt.coerceAtLeast(((TraktHistorySeason) it.next()).getEpisodes().size(), 1);
        }
        int i = size2 + iCoerceAtLeast;
        TraktSyncHistoryNotFound notFound4 = traktSyncHistoryResponse.getNotFound();
        List<TraktHistoryEpisode> episodes = notFound4 != null ? notFound4.getEpisodes() : null;
        if (episodes == null) {
            episodes = CollectionsKt.emptyList();
        }
        return episodes.size() + i;
    }

    public static String K(Response response) {
        String strString;
        String strReplace;
        String strTake;
        try {
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody == null || (strString = responseBodyErrorBody.string()) == null || (strReplace = new Regex("\\s+").replace(strString, " ")) == null || (strTake = StringsKt.take(strReplace, Input.Keys.NUMPAD_ENTER)) == null) {
                return "none";
            }
            return StringsKt.isBlank(strTake) ? "empty" : strTake;
        } catch (Exception unused) {
            return "unavailable";
        }
    }

    public static TraktIds P(TraktIds traktIds) {
        if (traktIds != null) {
            Integer trakt = traktIds.getTrakt();
            Integer num = (trakt == null || trakt.intValue() <= 0) ? null : trakt;
            Integer tvdb = traktIds.getTvdb();
            Integer num2 = (tvdb == null || tvdb.intValue() <= 0) ? null : tvdb;
            Integer tmdb = traktIds.getTmdb();
            Integer num3 = (tmdb == null || tmdb.intValue() <= 0) ? null : tmdb;
            if (num != null || num2 != null || num3 != null) {
                return new TraktIds(num, null, null, num3, num2, 6, null);
            }
        }
        return null;
    }

    public static TraktIds Q(ProviderIds providerIds) {
        String string;
        String string2;
        if (providerIds != null) {
            String tvdb = providerIds.getTvdb();
            Integer intOrNull = (tvdb == null || (string2 = StringsKt.trim((CharSequence) tvdb).toString()) == null) ? null : StringsKt.toIntOrNull(string2);
            String tmdb = providerIds.getTmdb();
            Integer intOrNull2 = (tmdb == null || (string = StringsKt.trim((CharSequence) tmdb).toString()) == null) ? null : StringsKt.toIntOrNull(string);
            if (intOrNull != null || intOrNull2 != null) {
                return new TraktIds(null, null, null, intOrNull2, intOrNull, 7, null);
            }
        }
        return null;
    }

    public static TraktIds R(ProviderIds providerIds) {
        String string;
        String string2;
        if (providerIds != null) {
            String tmdb = providerIds.getTmdb();
            Integer intOrNull = (tmdb == null || (string2 = StringsKt.trim((CharSequence) tmdb).toString()) == null) ? null : StringsKt.toIntOrNull(string2);
            String imdb = providerIds.getImdb();
            String str = (imdb == null || (string = StringsKt.trim((CharSequence) imdb).toString()) == null || string.length() <= 0) ? null : string;
            if (intOrNull != null || str != null) {
                return new TraktIds(null, null, str, intOrNull, null, 19, null);
            }
        }
        return null;
    }

    public static TraktIds S(TraktIds traktIds) {
        Integer trakt = traktIds.getTrakt();
        Integer num = (trakt == null || trakt.intValue() <= 0) ? null : trakt;
        if (num != null) {
            return new TraktIds(num, null, null, null, null, 30, null);
        }
        Integer tmdb = traktIds.getTmdb();
        Integer num2 = (tmdb == null || tmdb.intValue() <= 0) ? null : tmdb;
        if (num2 != null) {
            return new TraktIds(null, null, null, num2, null, 23, null);
        }
        Integer tvdb = traktIds.getTvdb();
        Integer num3 = (tvdb == null || tvdb.intValue() <= 0) ? null : tvdb;
        return num3 != null ? new TraktIds(null, null, null, null, num3, 15, null) : traktIds;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    public static List T(ProviderIds providerIds) {
        p92 p92Var;
        p92 p92Var2;
        String string;
        String string2;
        String string3;
        if (providerIds == null) {
            return CollectionsKt.emptyList();
        }
        String tvdb = providerIds.getTvdb();
        p92 p92Var3 = null;
        if (tvdb == null || (string3 = StringsKt.trim((CharSequence) tvdb).toString()) == null) {
            p92Var = null;
        } else {
            if (string3.length() <= 0) {
                string3 = null;
            }
            if (string3 != null) {
                p92Var = new p92("tvdb", string3);
            } else {
                p92Var = null;
            }
        }
        String tmdb = providerIds.getTmdb();
        if (tmdb == null || (string2 = StringsKt.trim((CharSequence) tmdb).toString()) == null) {
            p92Var2 = null;
        } else {
            if (string2.length() <= 0) {
                string2 = null;
            }
            if (string2 != null) {
                p92Var2 = new p92("tmdb", string2);
            } else {
                p92Var2 = null;
            }
        }
        String imdb = providerIds.getImdb();
        if (imdb != null && (string = StringsKt.trim((CharSequence) imdb).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                p92Var3 = new p92("imdb", string);
            }
        }
        return CollectionsKt___CollectionsKt.distinct(CollectionsKt.listOfNotNull((Object[]) new p92[]{p92Var, p92Var2, p92Var3}));
    }

    public static n92 U(MediaItem mediaItem) {
        Integer parentIndexNumber = mediaItem.getParentIndexNumber();
        if (parentIndexNumber == null) {
            return null;
        }
        int iIntValue = parentIndexNumber.intValue();
        Integer indexNumber = mediaItem.getIndexNumber();
        if (indexNumber != null) {
            return new n92(iIntValue, indexNumber.intValue());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static Set V(TraktShowWatchedProgress traktShowWatchedProgress) {
        Object EmptyList;
        String lastWatchedAt;
        List<TraktWatchedSeason> seasons = traktShowWatchedProgress.getSeasons();
        if (seasons == null) {
            seasons = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (TraktWatchedSeason traktWatchedSeason : seasons) {
            Integer number = traktWatchedSeason.getNumber();
            if (number != null) {
                int iIntValue = number.intValue();
                List<TraktWatchedEpisode> episodes = traktWatchedSeason.getEpisodes();
                if (episodes == null) {
                    episodes = CollectionsKt.emptyList();
                }
                EmptyList = new ArrayList();
                for (TraktWatchedEpisode traktWatchedEpisode : episodes) {
                    Integer number2 = traktWatchedEpisode.getNumber();
                    n92 n92Var = null;
                    if (number2 != null) {
                        int iIntValue2 = number2.intValue();
                        if (Intrinsics.areEqual(traktWatchedEpisode.getCompleted(), Boolean.TRUE) || ((lastWatchedAt = traktWatchedEpisode.getLastWatchedAt()) != null && !StringsKt.isBlank(lastWatchedAt))) {
                            n92Var = new n92(iIntValue, iIntValue2);
                        }
                    }
                    if (n92Var != null) {
                        EmptyList.add(n92Var);
                    }
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, (Iterable) EmptyList);
        }
        return CollectionsKt.toSet(arrayList);
    }

    public static final Object a(xa2 xa2Var, MediaItem mediaItem, long j, Long l, ya2 ya2Var, la2 la2Var) {
        long jLongValue;
        String strTake;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            Long runTimeTicks = mediaItem.getRunTimeTicks();
            if (runTimeTicks == null) {
                return new za2(null, null, null, null, "missing_runtime", 14);
            }
            jLongValue = runTimeTicks.longValue();
        }
        if (jLongValue <= 0) {
            return new za2(null, null, Boxing.boxLong(jLongValue / Renderer.DEFAULT_DURATION_TO_PROGRESS_US), null, "invalid_runtime", 10);
        }
        long j2 = jLongValue / Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        if (j2 <= 0) {
            return new za2(null, null, Boxing.boxLong(j2), null, "invalid_runtime_ms", 10);
        }
        double dCoerceIn = RangesKt.coerceIn((RangesKt.coerceAtLeast(j, 0L) * 100.0d) / j2, 0.0d, 100.0d);
        if (ya2Var != ya2.a && dCoerceIn < 1.0d) {
            return new za2(null, Boxing.boxDouble(dCoerceIn), Boxing.boxLong(j2), null, "progress_below_min", 8);
        }
        String type = mediaItem.getType();
        if (!Intrinsics.areEqual(type, "Movie")) {
            return Intrinsics.areEqual(type, "Episode") ? xa2Var.s(mediaItem, dCoerceIn, j2, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", la2Var) : new za2(null, Boxing.boxDouble(dCoerceIn), Boxing.boxLong(j2), null, "unsupported_type", 8);
        }
        TraktIds traktIdsR = R(mediaItem.getProviderIds());
        if (traktIdsR == null) {
            return new za2(null, Double.valueOf(dCoerceIn), Long.valueOf(j2), null, "missing_movie_external_ids", 8);
        }
        Integer productionYear = mediaItem.getProductionYear();
        if (productionYear == null) {
            String premiereDate = mediaItem.getPremiereDate();
            productionYear = (premiereDate == null || (strTake = StringsKt.take(premiereDate, 4)) == null) ? null : StringsKt.toIntOrNull(strTake);
        }
        String string = StringsKt.trim((CharSequence) mediaItem.getName()).toString();
        return new za2(new TraktScrobbleRequest(dCoerceIn, new TraktScrobbleMovie(string.length() > 0 ? string : null, productionYear, traktIdsR), null, null, 12, null), Double.valueOf(dCoerceIn), Long.valueOf(j2), null, null, 24);
    }

    public static final o92 b(xa2 xa2Var, MediaItem mediaItem, MediaItem mediaItem2) {
        o92 o92VarU;
        if (mediaItem2 != null && (o92VarU = u(mediaItem2, CollectionsKt.listOf(mediaItem))) != null) {
            return o92VarU;
        }
        TraktIds traktIdsQ = Q(mediaItem.getProviderIds());
        if (traktIdsQ == null) {
            return null;
        }
        TraktIds traktIdsS = S(traktIdsQ);
        Integer indexNumber = mediaItem.getIndexNumber();
        String string = StringsKt.trim((CharSequence) mediaItem.getName()).toString();
        return new o92(new TraktSyncHistoryRequest(null, null, CollectionsKt.listOf(new TraktHistoryEpisode(indexNumber, string.length() > 0 ? string : null, traktIdsS, null, 8, null)), 3, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0163  */
    /* JADX WARN: Code duplicated, block: B:102:0x0169  */
    /* JADX WARN: Code duplicated, block: B:108:0x017c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0182  */
    /* JADX WARN: Code duplicated, block: B:113:0x018d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:154:0x0209  */
    /* JADX WARN: Code duplicated, block: B:157:0x0210  */
    /* JADX WARN: Code duplicated, block: B:159:0x0216  */
    /* JADX WARN: Code duplicated, block: B:162:0x0221  */
    /* JADX WARN: Code duplicated, block: B:165:0x0228  */
    /* JADX WARN: Code duplicated, block: B:167:0x022e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0239  */
    /* JADX WARN: Code duplicated, block: B:185:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x012c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x00f3 A[EDGE_INSN: B:222:0x00f3->B:69:0x00f3 BREAK  A[LOOP:1: B:15:0x0042->B:224:0x0042], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(xa2 xa2Var, MediaItem mediaItem, List list, String str, ContinuationImpl continuationImpl) {
        w92 w92Var;
        Object next;
        boolean zEquals;
        String string;
        String string2;
        Integer intOrNull;
        Object next2;
        Integer num;
        Integer num2;
        TraktIds traktIds;
        TraktEpisode episode;
        Integer season;
        Integer number;
        TraktShow show;
        TraktIds ids;
        Integer trakt;
        Integer tvdb;
        Integer tmdb;
        String imdb;
        String slug;
        Integer tmdb2;
        Integer tvdb2;
        Integer trakt2;
        Integer tvdb3;
        Integer tmdb3;
        Integer tmdb4;
        Integer tvdb4;
        if (continuationImpl instanceof w92) {
            w92Var = (w92) continuationImpl;
            int i = w92Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                w92Var.g = i - Integer.MIN_VALUE;
            } else {
                w92Var = new w92(xa2Var, continuationImpl);
            }
        } else {
            w92Var = new w92(xa2Var, continuationImpl);
        }
        Object objH = w92Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = w92Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objH);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                TraktPlaybackProgressItem traktPlaybackProgressItem = (TraktPlaybackProgressItem) next;
                String type = mediaItem.getType();
                if (Intrinsics.areEqual(type, "Movie")) {
                    TraktMovie movie = traktPlaybackProgressItem.getMovie();
                    TraktIds ids2 = movie != null ? movie.getIds() : null;
                    ProviderIds providerIds = mediaItem.getProviderIds();
                    if (ids2 != null && providerIds != null) {
                        String imdb2 = providerIds.getImdb();
                        if (imdb2 == null || (string = StringsKt.trim((CharSequence) imdb2).toString()) == null) {
                            zEquals = false;
                        } else {
                            if (string.length() <= 0) {
                                string = null;
                            }
                            if (string == null) {
                                zEquals = false;
                            } else {
                                zEquals = StringsKt__StringsJVMKt.equals(ids2.getImdb(), string, true);
                            }
                        }
                        if (zEquals || D(ids2, providerIds.getTmdb())) {
                            break;
                        }
                    }
                } else if (Intrinsics.areEqual(type, "Episode")) {
                    TraktEpisode episode2 = traktPlaybackProgressItem.getEpisode();
                    TraktIds ids3 = episode2 != null ? episode2.getIds() : null;
                    ProviderIds providerIds2 = mediaItem.getProviderIds();
                    if (ids3 != null && providerIds2 != null) {
                        String tvdb5 = providerIds2.getTvdb();
                        if (tvdb5 != null && (string2 = StringsKt.trim((CharSequence) tvdb5).toString()) != null && (intOrNull = StringsKt.toIntOrNull(string2)) != null) {
                            int iIntValue = intOrNull.intValue();
                            Integer tvdb6 = ids3.getTvdb();
                            if (tvdb6 != null && tvdb6.intValue() == iIntValue) {
                                break;
                            }
                            if (D(ids3, providerIds2.getTmdb())) {
                                break;
                                break;
                            }
                        } else if (D(ids3, providerIds2.getTmdb())) {
                            break;
                        }
                    }
                } else {
                    continue;
                }
                return null;
            }
            TraktPlaybackProgressItem traktPlaybackProgressItem2 = (TraktPlaybackProgressItem) next;
            if (traktPlaybackProgressItem2 != null) {
                return new r92(traktPlaybackProgressItem2, "direct");
            }
            if (Intrinsics.areEqual(mediaItem.getType(), "Episode")) {
                w92Var.a = null;
                w92Var.b = list;
                w92Var.c = null;
                w92Var.g = 1;
                objH = xa2Var.H(mediaItem, str, w92Var);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return null;
        }
        if (i2 != 1) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = w92Var.b;
        ResultKt.throwOnFailure(objH);
        st1 st1Var = (st1) objH;
        if (st1Var != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                TraktPlaybackProgressItem traktPlaybackProgressItem3 = (TraktPlaybackProgressItem) next2;
                TraktEpisode episode3 = traktPlaybackProgressItem3.getEpisode();
                TraktIds ids4 = episode3 != null ? episode3.getIds() : null;
                TraktIds traktIds2 = st1Var.a;
                if (ids4 != null) {
                    Integer trakt3 = traktIds2.getTrakt();
                    if (trakt3 != null) {
                        int iIntValue2 = trakt3.intValue();
                        Integer trakt4 = ids4.getTrakt();
                        if (trakt4 != null && trakt4.intValue() == iIntValue2) {
                            break;
                        }
                        tvdb3 = traktIds2.getTvdb();
                        if (tvdb3 != null) {
                            int iIntValue3 = tvdb3.intValue();
                            tvdb4 = ids4.getTvdb();
                            if (tvdb4 != null && tvdb4.intValue() == iIntValue3) {
                                break;
                            }
                            tmdb3 = traktIds2.getTmdb();
                            if (tmdb3 != null) {
                                int iIntValue4 = tmdb3.intValue();
                                tmdb4 = ids4.getTmdb();
                                if (tmdb4 != null && tmdb4.intValue() == iIntValue4) {
                                    break;
                                }
                                num = st1Var.d;
                                if (num != null) {
                                    int iIntValue5 = num.intValue();
                                    num2 = st1Var.e;
                                    if (num2 != null) {
                                        int iIntValue6 = num2.intValue();
                                        traktIds = st1Var.c;
                                        if (traktIds == null && (episode = traktPlaybackProgressItem3.getEpisode()) != null && (season = episode.getSeason()) != null && season.intValue() == iIntValue5 && (number = traktPlaybackProgressItem3.getEpisode().getNumber()) != null && number.intValue() == iIntValue6) {
                                            show = traktPlaybackProgressItem3.getShow();
                                            if (show != null) {
                                                ids = show.getIds();
                                            } else {
                                                ids = null;
                                            }
                                            if (ids != null) {
                                                trakt = traktIds.getTrakt();
                                                if (trakt != null) {
                                                    int iIntValue7 = trakt.intValue();
                                                    trakt2 = ids.getTrakt();
                                                    if (trakt2 == null && trakt2.intValue() == iIntValue7) {
                                                        break;
                                                    }
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue8 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null && tvdb2.intValue() == iIntValue8) {
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue9 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null || tmdb2.intValue() != iIntValue9) {
                                                                imdb = traktIds.getImdb();
                                                                if ((imdb == null && StringsKt__StringsJVMKt.equals(ids.getImdb(), imdb, true)) || ((slug = traktIds.getSlug()) != null && StringsKt__StringsJVMKt.equals(ids.getSlug(), slug, true))) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue10 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue11 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue12 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue13 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                num = st1Var.d;
                                if (num != null) {
                                    int iIntValue14 = num.intValue();
                                    num2 = st1Var.e;
                                    if (num2 != null) {
                                        int iIntValue15 = num2.intValue();
                                        traktIds = st1Var.c;
                                        if (traktIds == null) {
                                            continue;
                                        } else {
                                            show = traktPlaybackProgressItem3.getShow();
                                            if (show != null) {
                                                ids = show.getIds();
                                            } else {
                                                ids = null;
                                            }
                                            if (ids != null) {
                                                trakt = traktIds.getTrakt();
                                                if (trakt != null) {
                                                    int iIntValue16 = trakt.intValue();
                                                    trakt2 = ids.getTrakt();
                                                    if (trakt2 == null) {
                                                        break;
                                                        break;
                                                    }
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue17 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue18 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue19 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue110 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue111 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue112 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            tmdb3 = traktIds2.getTmdb();
                            if (tmdb3 != null) {
                                int iIntValue20 = tmdb3.intValue();
                                tmdb4 = ids4.getTmdb();
                                if (tmdb4 != null) {
                                    break;
                                    break;
                                }
                                num = st1Var.d;
                                if (num != null) {
                                    int iIntValue113 = num.intValue();
                                    num2 = st1Var.e;
                                    if (num2 != null) {
                                        int iIntValue114 = num2.intValue();
                                        traktIds = st1Var.c;
                                        if (traktIds == null) {
                                            continue;
                                        } else {
                                            show = traktPlaybackProgressItem3.getShow();
                                            if (show != null) {
                                                ids = show.getIds();
                                            } else {
                                                ids = null;
                                            }
                                            if (ids != null) {
                                                trakt = traktIds.getTrakt();
                                                if (trakt != null) {
                                                    int iIntValue115 = trakt.intValue();
                                                    trakt2 = ids.getTrakt();
                                                    if (trakt2 == null) {
                                                        break;
                                                        break;
                                                    }
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue116 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue117 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue118 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue119 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue1110 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue1111 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                num = st1Var.d;
                                if (num != null) {
                                    int iIntValue1112 = num.intValue();
                                    num2 = st1Var.e;
                                    if (num2 != null) {
                                        int iIntValue1113 = num2.intValue();
                                        traktIds = st1Var.c;
                                        if (traktIds == null) {
                                            continue;
                                        } else {
                                            show = traktPlaybackProgressItem3.getShow();
                                            if (show != null) {
                                                ids = show.getIds();
                                            } else {
                                                ids = null;
                                            }
                                            if (ids != null) {
                                                trakt = traktIds.getTrakt();
                                                if (trakt != null) {
                                                    int iIntValue1114 = trakt.intValue();
                                                    trakt2 = ids.getTrakt();
                                                    if (trakt2 == null) {
                                                        break;
                                                        break;
                                                    }
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue1115 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue1116 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue1117 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue1118 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue1119 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue11110 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    } else {
                        tvdb3 = traktIds2.getTvdb();
                        if (tvdb3 != null) {
                            int iIntValue21 = tvdb3.intValue();
                            tvdb4 = ids4.getTvdb();
                            if (tvdb4 != null) {
                                break;
                                break;
                            }
                            tmdb3 = traktIds2.getTmdb();
                            if (tmdb3 != null) {
                                int iIntValue22 = tmdb3.intValue();
                                tmdb4 = ids4.getTmdb();
                                if (tmdb4 != null) {
                                    break;
                                    break;
                                }
                                num = st1Var.d;
                                if (num != null) {
                                    int iIntValue11111 = num.intValue();
                                    num2 = st1Var.e;
                                    if (num2 != null) {
                                        int iIntValue11112 = num2.intValue();
                                        traktIds = st1Var.c;
                                        if (traktIds == null) {
                                            continue;
                                        } else {
                                            show = traktPlaybackProgressItem3.getShow();
                                            if (show != null) {
                                                ids = show.getIds();
                                            } else {
                                                ids = null;
                                            }
                                            if (ids != null) {
                                                trakt = traktIds.getTrakt();
                                                if (trakt != null) {
                                                    int iIntValue11113 = trakt.intValue();
                                                    trakt2 = ids.getTrakt();
                                                    if (trakt2 == null) {
                                                        break;
                                                        break;
                                                    }
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue11114 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue11115 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue11116 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue11117 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue11118 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue11119 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                num = st1Var.d;
                                if (num != null) {
                                    int iIntValue111110 = num.intValue();
                                    num2 = st1Var.e;
                                    if (num2 != null) {
                                        int iIntValue111111 = num2.intValue();
                                        traktIds = st1Var.c;
                                        if (traktIds == null) {
                                            continue;
                                        } else {
                                            show = traktPlaybackProgressItem3.getShow();
                                            if (show != null) {
                                                ids = show.getIds();
                                            } else {
                                                ids = null;
                                            }
                                            if (ids != null) {
                                                trakt = traktIds.getTrakt();
                                                if (trakt != null) {
                                                    int iIntValue111112 = trakt.intValue();
                                                    trakt2 = ids.getTrakt();
                                                    if (trakt2 == null) {
                                                        break;
                                                        break;
                                                    }
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue111113 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue111114 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue111115 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue111116 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue111117 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue111118 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            tmdb3 = traktIds2.getTmdb();
                            if (tmdb3 != null) {
                                int iIntValue23 = tmdb3.intValue();
                                tmdb4 = ids4.getTmdb();
                                if (tmdb4 != null) {
                                    break;
                                    break;
                                }
                                num = st1Var.d;
                                if (num != null) {
                                    int iIntValue111119 = num.intValue();
                                    num2 = st1Var.e;
                                    if (num2 != null) {
                                        int iIntValue1111110 = num2.intValue();
                                        traktIds = st1Var.c;
                                        if (traktIds == null) {
                                            continue;
                                        } else {
                                            show = traktPlaybackProgressItem3.getShow();
                                            if (show != null) {
                                                ids = show.getIds();
                                            } else {
                                                ids = null;
                                            }
                                            if (ids != null) {
                                                trakt = traktIds.getTrakt();
                                                if (trakt != null) {
                                                    int iIntValue1111111 = trakt.intValue();
                                                    trakt2 = ids.getTrakt();
                                                    if (trakt2 == null) {
                                                        break;
                                                        break;
                                                    }
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue1111112 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue1111113 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue1111114 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue1111115 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue1111116 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue1111117 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                num = st1Var.d;
                                if (num != null) {
                                    int iIntValue1111118 = num.intValue();
                                    num2 = st1Var.e;
                                    if (num2 != null) {
                                        int iIntValue1111119 = num2.intValue();
                                        traktIds = st1Var.c;
                                        if (traktIds == null) {
                                            continue;
                                        } else {
                                            show = traktPlaybackProgressItem3.getShow();
                                            if (show != null) {
                                                ids = show.getIds();
                                            } else {
                                                ids = null;
                                            }
                                            if (ids != null) {
                                                trakt = traktIds.getTrakt();
                                                if (trakt != null) {
                                                    int iIntValue11111110 = trakt.intValue();
                                                    trakt2 = ids.getTrakt();
                                                    if (trakt2 == null) {
                                                        break;
                                                        break;
                                                    }
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue11111111 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue11111112 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue11111113 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    tvdb = traktIds.getTvdb();
                                                    if (tvdb != null) {
                                                        int iIntValue11111114 = tvdb.intValue();
                                                        tvdb2 = ids.getTvdb();
                                                        if (tvdb2 != null) {
                                                            break;
                                                            break;
                                                        }
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue11111115 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    } else {
                                                        tmdb = traktIds.getTmdb();
                                                        if (tmdb != null) {
                                                            int iIntValue11111116 = tmdb.intValue();
                                                            tmdb2 = ids.getTmdb();
                                                            if (tmdb2 == null) {
                                                                break;
                                                                break;
                                                            }
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        } else {
                                                            imdb = traktIds.getImdb();
                                                            if (imdb == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    num = st1Var.d;
                    if (num != null) {
                        int iIntValue11111117 = num.intValue();
                        num2 = st1Var.e;
                        if (num2 != null) {
                            int iIntValue11111118 = num2.intValue();
                            traktIds = st1Var.c;
                            if (traktIds == null) {
                                continue;
                            } else {
                                show = traktPlaybackProgressItem3.getShow();
                                if (show != null) {
                                    ids = show.getIds();
                                } else {
                                    ids = null;
                                }
                                if (ids != null) {
                                    trakt = traktIds.getTrakt();
                                    if (trakt != null) {
                                        int iIntValue11111119 = trakt.intValue();
                                        trakt2 = ids.getTrakt();
                                        if (trakt2 == null) {
                                            break;
                                            break;
                                        }
                                        tvdb = traktIds.getTvdb();
                                        if (tvdb != null) {
                                            int iIntValue111111110 = tvdb.intValue();
                                            tvdb2 = ids.getTvdb();
                                            if (tvdb2 != null) {
                                                break;
                                                break;
                                            }
                                            tmdb = traktIds.getTmdb();
                                            if (tmdb != null) {
                                                int iIntValue111111111 = tmdb.intValue();
                                                tmdb2 = ids.getTmdb();
                                                if (tmdb2 == null) {
                                                    break;
                                                    break;
                                                }
                                                imdb = traktIds.getImdb();
                                                if (imdb == null) {
                                                }
                                            } else {
                                                imdb = traktIds.getImdb();
                                                if (imdb == null) {
                                                }
                                            }
                                        } else {
                                            tmdb = traktIds.getTmdb();
                                            if (tmdb != null) {
                                                int iIntValue111111112 = tmdb.intValue();
                                                tmdb2 = ids.getTmdb();
                                                if (tmdb2 == null) {
                                                    break;
                                                    break;
                                                }
                                                imdb = traktIds.getImdb();
                                                if (imdb == null) {
                                                }
                                            } else {
                                                imdb = traktIds.getImdb();
                                                if (imdb == null) {
                                                }
                                            }
                                        }
                                    } else {
                                        tvdb = traktIds.getTvdb();
                                        if (tvdb != null) {
                                            int iIntValue111111113 = tvdb.intValue();
                                            tvdb2 = ids.getTvdb();
                                            if (tvdb2 != null) {
                                                break;
                                                break;
                                            }
                                            tmdb = traktIds.getTmdb();
                                            if (tmdb != null) {
                                                int iIntValue111111114 = tmdb.intValue();
                                                tmdb2 = ids.getTmdb();
                                                if (tmdb2 == null) {
                                                    break;
                                                    break;
                                                }
                                                imdb = traktIds.getImdb();
                                                if (imdb == null) {
                                                }
                                            } else {
                                                imdb = traktIds.getImdb();
                                                if (imdb == null) {
                                                }
                                            }
                                        } else {
                                            tmdb = traktIds.getTmdb();
                                            if (tmdb != null) {
                                                int iIntValue111111115 = tmdb.intValue();
                                                tmdb2 = ids.getTmdb();
                                                if (tmdb2 == null) {
                                                    break;
                                                    break;
                                                }
                                                imdb = traktIds.getImdb();
                                                if (imdb == null) {
                                                }
                                            } else {
                                                imdb = traktIds.getImdb();
                                                if (imdb == null) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            TraktPlaybackProgressItem traktPlaybackProgressItem4 = (TraktPlaybackProgressItem) next2;
            if (traktPlaybackProgressItem4 != null) {
                return new r92(traktPlaybackProgressItem4, kb0.x("resolved:", st1Var.b));
            }
        }
        return null;
    }

    public static final String d(xa2 xa2Var, double d) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object e(xa2 xa2Var, MediaItem mediaItem, boolean z, ContinuationImpl continuationImpl) {
        z92 z92Var;
        ab2 ab2Var = xa2Var.b;
        if (continuationImpl instanceof z92) {
            z92Var = (z92) continuationImpl;
            int i = z92Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                z92Var.g = i - Integer.MIN_VALUE;
            } else {
                z92Var = new z92(xa2Var, continuationImpl);
            }
        } else {
            z92Var = new z92(xa2Var, continuationImpl);
        }
        Object objA = z92Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = z92Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            i92 i92VarA = ab2Var.a();
            if (!i92VarA.b()) {
                StringBuilder sbZ = kb0.z("event=watched_single_sync result=skip reason=upload_disabled itemId=", mediaItem.getId(), " type=", mediaItem.getType(), " watched=");
                sbZ.append(z);
                Log.d("TraktSync", sbZ.toString());
                return null;
            }
            if (!i92.c() || !i92VarA.d()) {
                StringBuilder sbZ2 = kb0.z("event=watched_single_sync result=skip reason=not_authorized itemId=", mediaItem.getId(), " type=", mediaItem.getType(), " watched=");
                sbZ2.append(z);
                Log.w("TraktSync", sbZ2.toString());
                return null;
            }
            z92Var.a = mediaItem;
            z92Var.b = null;
            z92Var.c = z;
            z92Var.g = 1;
            objA = xa2Var.A(i92VarA, z92Var);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = z92Var.c;
            mediaItem = z92Var.a;
            ResultKt.throwOnFailure(objA);
        }
        String str = (String) objA;
        if (str != null) {
            return new ib2(ab2Var.a(), str);
        }
        StringBuilder sbZ3 = kb0.z("event=watched_single_sync result=skip reason=no_valid_token itemId=", mediaItem.getId(), " type=", mediaItem.getType(), " watched=");
        sbZ3.append(z);
        Log.w("TraktSync", sbZ3.toString());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(xa2 xa2Var, MediaItem mediaItem, MediaItem mediaItem2, ib2 ib2Var, ContinuationImpl continuationImpl) {
        fa2 fa2Var;
        if (continuationImpl instanceof fa2) {
            fa2Var = (fa2) continuationImpl;
            int i = fa2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fa2Var.g = i - Integer.MIN_VALUE;
            } else {
                fa2Var = new fa2(xa2Var, continuationImpl);
            }
        } else {
            fa2Var = new fa2(xa2Var, continuationImpl);
        }
        Object obj = fa2Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fa2Var.g;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            }
            if (i2 != 2) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        String type = mediaItem.getType();
        if (Intrinsics.areEqual(type, "Movie")) {
            fa2Var.a = null;
            fa2Var.b = null;
            fa2Var.c = null;
            fa2Var.g = 1;
            Object objG = xa2Var.G(mediaItem, ib2Var, fa2Var);
            if (objG != coroutine_suspended) {
                return objG;
            }
        } else {
            if (!Intrinsics.areEqual(type, "Episode")) {
                Result.Companion companion = Result.INSTANCE;
                return i02.n("当前媒体类型暂不支持 Trakt 已看状态读取");
            }
            fa2Var.a = null;
            fa2Var.b = null;
            fa2Var.c = null;
            fa2Var.g = 2;
            Object objF = xa2Var.F(mediaItem, mediaItem2, ib2Var, fa2Var);
            if (objF != coroutine_suspended) {
                return objF;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object i(xa2 xa2Var, ContinuationImpl continuationImpl) {
        ga2 ga2Var;
        ab2 ab2Var = xa2Var.b;
        if (continuationImpl instanceof ga2) {
            ga2Var = (ga2) continuationImpl;
            int i = ga2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ga2Var.d = i - Integer.MIN_VALUE;
            } else {
                ga2Var = new ga2(xa2Var, continuationImpl);
            }
        } else {
            ga2Var = new ga2(xa2Var, continuationImpl);
        }
        Object objA = ga2Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ga2Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            i92 i92VarA = ab2Var.a();
            if (!i92VarA.a) {
                rd1.o("请先在设置中开启 Trakt 同步");
                return null;
            }
            if (!i92.c()) {
                rd1.o("请先填写 Trakt Client ID 和 Client Secret");
                return null;
            }
            if (!i92VarA.d()) {
                rd1.o("请先完成 Trakt 授权");
                return null;
            }
            ga2Var.a = null;
            ga2Var.d = 1;
            objA = xa2Var.A(i92VarA, ga2Var);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objA);
        }
        String str = (String) objA;
        if (str != null) {
            return new ib2(ab2Var.a(), str);
        }
        rd1.o("Trakt 授权已失效，请重新授权");
        return null;
    }

    public static final Long j(xa2 xa2Var, Response response) {
        String string;
        Long longOrNull;
        String str = response.headers().get(HttpResponseHeader.RetryAfter);
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null || (longOrNull = StringsKt.toLongOrNull(string)) == null) {
            return null;
        }
        return Long.valueOf(RangesKt.coerceIn(longOrNull.longValue() * 1000, 1000L, Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
    }

    public static final String k(xa2 xa2Var, String str) {
        if (str == null) {
            str = "";
        }
        String strTake = StringsKt.take(new Regex("\\s+").replace(StringsKt.trim((CharSequence) str).toString(), "_"), 80);
        return StringsKt.isBlank(strTake) ? "empty" : strTake;
    }

    public static final Object l(xa2 xa2Var, String str, ya2 ya2Var, TraktScrobbleRequest traktScrobbleRequest, la2 la2Var) {
        int iOrdinal = ya2Var.ordinal();
        if (iOrdinal == 0) {
            return xa2Var.c.scrobbleStart(kb0.x("Bearer ", str), "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", ExifInterface.GPS_MEASUREMENT_2D, traktScrobbleRequest, la2Var);
        }
        if (iOrdinal == 1) {
            return xa2Var.c.scrobblePause(kb0.x("Bearer ", str), "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", ExifInterface.GPS_MEASUREMENT_2D, traktScrobbleRequest, la2Var);
        }
        if (iOrdinal == 2) {
            return xa2Var.c.scrobbleStop(kb0.x("Bearer ", str), "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", ExifInterface.GPS_MEASUREMENT_2D, traktScrobbleRequest, la2Var);
        }
        qu.f();
        return null;
    }

    public static final boolean m(xa2 xa2Var, Response response, ya2 ya2Var) {
        if (ya2Var == ya2.a || response.isSuccessful()) {
            return false;
        }
        if (response.code() == 408 || response.code() == 429) {
            return true;
        }
        int iCode = response.code();
        return 500 <= iCode && iCode < 600;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c2, code lost:
    
        if (r2 == r4) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(defpackage.xa2 r20, com.dh.myembyapp.data.model.MediaItem r21, defpackage.ib2 r22, kotlin.jvm.functions.Function2 r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa2.n(xa2, com.dh.myembyapp.data.model.MediaItem, ib2, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:67:0x021f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0245  */
    /* JADX WARN: Code duplicated, block: B:71:0x024d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0254  */
    /* JADX WARN: Code duplicated, block: B:75:0x0260  */
    /* JADX WARN: Code duplicated, block: B:78:0x027a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0280  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x021f, please report this as an issue */
    public static final Object o(xa2 xa2Var, MediaItem mediaItem, ib2 ib2Var, Function2 function2, ContinuationImpl continuationImpl) {
        na2 na2Var;
        Object objI;
        int i;
        Function2 function3;
        na2 na2Var2;
        String str;
        int i2;
        int i3;
        Object objD;
        ib2 ib2Var2;
        MediaItem mediaItem2;
        int i4;
        Response response;
        Function2 function4;
        MediaItem mediaItem3;
        Response response2;
        TraktSyncHistoryResponse traktSyncHistoryResponse;
        int iE;
        int iCoerceAtLeast;
        String str2;
        MediaItem mediaItem4 = mediaItem;
        ib2 ib2Var3 = ib2Var;
        if (continuationImpl instanceof na2) {
            na2Var = (na2) continuationImpl;
            int i5 = na2Var.l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                na2Var.l = i5 - Integer.MIN_VALUE;
            } else {
                na2Var = new na2(xa2Var, continuationImpl);
            }
        } else {
            na2Var = new na2(xa2Var, continuationImpl);
        }
        na2 na2Var3 = na2Var;
        Object obj = na2Var3.j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = na2Var3.l;
        int i7 = 1;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            UserData userData = mediaItem4.getUserData();
            int i8 = (userData == null || !userData.getPlayed()) ? 0 : 1;
            i92 i92Var = ib2Var3.a;
            na2Var3.a = mediaItem4;
            na2Var3.b = ib2Var3;
            na2Var3.c = function2;
            na2Var3.i = i8;
            na2Var3.l = 1;
            objI = xa2Var.I(mediaItem4, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", na2Var3);
            if (objI != coroutine_suspended) {
                i = i8;
                function3 = function2;
            }
            return coroutine_suspended;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    function4 = na2Var3.c;
                    mediaItem3 = na2Var3.a;
                    ResultKt.throwOnFailure(obj);
                    i2 = 0;
                    i7 = 1;
                    response2 = (Response) obj;
                    if (!response2.isSuccessful()) {
                        String str3 = "Trakt 写入失败: " + response2.code() + " " + response2.message();
                        v(response2);
                        Result.Companion companion = Result.INSTANCE;
                        return i02.n(str3);
                    }
                    traktSyncHistoryResponse = (TraktSyncHistoryResponse) response2.body();
                    if (traktSyncHistoryResponse != null) {
                        iE = E(traktSyncHistoryResponse);
                    } else {
                        iE = i2;
                    }
                    iCoerceAtLeast = RangesKt.coerceAtLeast(1 - iE, i2);
                    if (function4 != null) {
                        function4.invoke(Boxing.boxInt(i7), Boxing.boxInt(i7));
                    }
                    v(response2);
                    Result.Companion companion2 = Result.INSTANCE;
                    jb2 jb2Var = jb2.a;
                    String type = mediaItem3.getType();
                    if (iCoerceAtLeast > 0) {
                        str2 = "已同步到 Trakt";
                    } else {
                        str2 = "Trakt 未能匹配该电影";
                    }
                    return Result.m8825constructorimpl(new kb2(jb2Var, type, 1, iCoerceAtLeast, 0, iE, 0, str2, 80));
                }
                if (i6 != 4) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function4 = na2Var3.c;
                mediaItem3 = na2Var3.a;
                ResultKt.throwOnFailure(obj);
                i2 = 0;
                i7 = 1;
                response2 = (Response) obj;
                if (!response2.isSuccessful()) {
                    String str4 = "Trakt 写入失败: " + response2.code() + " " + response2.message();
                    v(response2);
                    Result.Companion companion3 = Result.INSTANCE;
                    return i02.n(str4);
                }
                traktSyncHistoryResponse = (TraktSyncHistoryResponse) response2.body();
                if (traktSyncHistoryResponse != null) {
                    iE = E(traktSyncHistoryResponse);
                } else {
                    iE = i2;
                }
                iCoerceAtLeast = RangesKt.coerceAtLeast(1 - iE, i2);
                if (function4 != null) {
                    function4.invoke(Boxing.boxInt(i7), Boxing.boxInt(i7));
                }
                v(response2);
                Result.Companion companion4 = Result.INSTANCE;
                jb2 jb2Var2 = jb2.a;
                String type2 = mediaItem3.getType();
                if (iCoerceAtLeast > 0) {
                    str2 = "已同步到 Trakt";
                } else {
                    str2 = "Trakt 未能匹配该电影";
                }
                return Result.m8825constructorimpl(new kb2(jb2Var2, type2, 1, iCoerceAtLeast, 0, iE, 0, str2, 80));
            }
            int i9 = na2Var3.i;
            String str5 = (String) na2Var3.d;
            Function2 function5 = na2Var3.c;
            ib2Var2 = (ib2) na2Var3.b;
            MediaItem mediaItem5 = na2Var3.a;
            ResultKt.throwOnFailure(obj);
            objD = obj;
            function3 = function5;
            str = str5;
            i2 = 0;
            mediaItem2 = mediaItem5;
            i4 = i9;
            i3 = 3;
            na2Var2 = na2Var3;
            response = (Response) objD;
            List list = (List) response.body();
            if (response.isSuccessful() || list == null) {
                String str6 = "读取 Trakt 已看记录失败: " + response.code() + " " + response.message();
                v(response);
                Result.Companion companion5 = Result.INSTANCE;
                return i02.n(str6);
            }
            int i10 = !list.isEmpty() ? 1 : 0;
            v(response);
            if (i4 == i10) {
                if (function3 != null) {
                    function3.invoke(Boxing.boxInt(i2), Boxing.boxInt(i2));
                }
                Result.Companion companion6 = Result.INSTANCE;
                return Result.m8825constructorimpl(new kb2(jb2.a, mediaItem2.getType(), 0, 0, 0, 0, 0, "已看状态一致，无需同步", Input.Keys.FORWARD_DEL));
            }
            TraktSyncHistoryRequest traktSyncHistoryRequestT = t(mediaItem2);
            if (traktSyncHistoryRequestT == null) {
                Result.Companion companion7 = Result.INSTANCE;
                return i02.n("该电影缺少 Trakt 可识别的 IMDb/TMDB 编号");
            }
            TraktApiService traktApiService = xa2Var.c;
            if (i4 != 0) {
                String strConcat = "Bearer ".concat(ib2Var2.b);
                na2Var2.a = mediaItem2;
                na2Var2.b = null;
                na2Var2.c = function3;
                na2Var2.d = null;
                na2Var2.e = null;
                na2Var2.g = null;
                na2Var2.h = null;
                na2Var2.i = i4;
                na2Var2.l = i3;
                Object objA = i02.a(traktApiService, strConcat, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", null, traktSyncHistoryRequestT, na2Var2, 4, null);
                if (objA != coroutine_suspended) {
                    Function2 function6 = function3;
                    obj = objA;
                    function4 = function6;
                    mediaItem3 = mediaItem2;
                    response2 = (Response) obj;
                    if (!response2.isSuccessful()) {
                        String str7 = "Trakt 写入失败: " + response2.code() + " " + response2.message();
                        v(response2);
                        Result.Companion companion8 = Result.INSTANCE;
                        return i02.n(str7);
                    }
                    traktSyncHistoryResponse = (TraktSyncHistoryResponse) response2.body();
                    if (traktSyncHistoryResponse != null) {
                        iE = E(traktSyncHistoryResponse);
                    } else {
                        iE = i2;
                    }
                    iCoerceAtLeast = RangesKt.coerceAtLeast(1 - iE, i2);
                    if (function4 != null) {
                        function4.invoke(Boxing.boxInt(i7), Boxing.boxInt(i7));
                    }
                    v(response2);
                    Result.Companion companion9 = Result.INSTANCE;
                    jb2 jb2Var3 = jb2.a;
                    String type3 = mediaItem3.getType();
                    if (iCoerceAtLeast > 0) {
                        str2 = "已同步到 Trakt";
                    } else {
                        str2 = "Trakt 未能匹配该电影";
                    }
                    return Result.m8825constructorimpl(new kb2(jb2Var3, type3, 1, iCoerceAtLeast, 0, iE, 0, str2, 80));
                }
            } else {
                String strConcat2 = "Bearer ".concat(ib2Var2.b);
                na2Var2.a = mediaItem2;
                na2Var2.b = null;
                na2Var2.c = function3;
                na2Var2.d = null;
                na2Var2.e = null;
                na2Var2.g = null;
                na2Var2.h = null;
                na2Var2.i = i4;
                na2Var2.l = 4;
                Object objJ = i02.J(traktApiService, strConcat2, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", null, traktSyncHistoryRequestT, na2Var2, 4, null);
                if (objJ != coroutine_suspended) {
                    Function2 function7 = function3;
                    obj = objJ;
                    function4 = function7;
                    mediaItem3 = mediaItem2;
                    response2 = (Response) obj;
                    if (!response2.isSuccessful()) {
                        String str8 = "Trakt 写入失败: " + response2.code() + " " + response2.message();
                        v(response2);
                        Result.Companion companion10 = Result.INSTANCE;
                        return i02.n(str8);
                    }
                    traktSyncHistoryResponse = (TraktSyncHistoryResponse) response2.body();
                    if (traktSyncHistoryResponse != null) {
                        iE = E(traktSyncHistoryResponse);
                    } else {
                        iE = i2;
                    }
                    iCoerceAtLeast = RangesKt.coerceAtLeast(1 - iE, i2);
                    if (function4 != null) {
                        function4.invoke(Boxing.boxInt(i7), Boxing.boxInt(i7));
                    }
                    v(response2);
                    Result.Companion companion11 = Result.INSTANCE;
                    jb2 jb2Var4 = jb2.a;
                    String type4 = mediaItem3.getType();
                    if (iCoerceAtLeast > 0) {
                        str2 = "已同步到 Trakt";
                    } else {
                        str2 = "Trakt 未能匹配该电影";
                    }
                    return Result.m8825constructorimpl(new kb2(jb2Var4, type4, 1, iCoerceAtLeast, 0, iE, 0, str2, 80));
                }
            }
            return coroutine_suspended;
        }
        int i11 = na2Var3.i;
        Function2 function8 = na2Var3.c;
        ib2 ib2Var4 = (ib2) na2Var3.b;
        MediaItem mediaItem6 = na2Var3.a;
        ResultKt.throwOnFailure(obj);
        i = i11;
        mediaItem4 = mediaItem6;
        objI = obj;
        function3 = function8;
        ib2Var3 = ib2Var4;
        String str9 = (String) objI;
        if (str9 == null) {
            Result.Companion companion12 = Result.INSTANCE;
            return i02.n("无法同步：该电影缺少 IMDb 或 TMDB 编号");
        }
        TraktApiService traktApiService2 = xa2Var.c;
        String strConcat3 = "Bearer ".concat(ib2Var3.b);
        na2Var3.a = mediaItem4;
        na2Var3.b = ib2Var3;
        na2Var3.c = function3;
        na2Var3.d = null;
        na2Var3.i = i;
        na2Var3.l = 2;
        na2Var2 = na2Var3;
        str = str9;
        int i12 = i;
        MediaItem mediaItem7 = mediaItem4;
        i2 = 0;
        i3 = 3;
        objD = i02.d(traktApiService2, str, strConcat3, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", null, null, na2Var2, 24, null);
        if (objD != coroutine_suspended) {
            ib2Var2 = ib2Var3;
            mediaItem2 = mediaItem7;
            i4 = i12;
            response = (Response) objD;
            List list2 = (List) response.body();
            if (response.isSuccessful()) {
            }
            String str10 = "读取 Trakt 已看记录失败: " + response.code() + " " + response.message();
            v(response);
            Result.Companion companion13 = Result.INSTANCE;
            return i02.n(str10);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x054e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0573  */
    /* JADX WARN: Code duplicated, block: B:105:0x0585  */
    /* JADX WARN: Code duplicated, block: B:108:0x058d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0630  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:90:0x0497  */
    /* JADX WARN: Code duplicated, block: B:93:0x0500  */
    /* JADX WARN: Code duplicated, block: B:96:0x051b  */
    /* JADX WARN: Code duplicated, block: B:97:0x052d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0541  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x05fa -> B:114:0x0612). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x07d9 -> B:143:0x07eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object p(defpackage.xa2 r37, com.dh.myembyapp.data.model.MediaItem r38, java.util.List r39, defpackage.ib2 r40, kotlin.jvm.functions.Function2 r41, kotlin.coroutines.jvm.internal.ContinuationImpl r42) {
        /*
            Method dump skipped, instruction units count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa2.p(xa2, com.dh.myembyapp.data.model.MediaItem, java.util.List, ib2, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x058d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0595  */
    /* JADX WARN: Code duplicated, block: B:106:0x0605  */
    /* JADX WARN: Code duplicated, block: B:109:0x0631  */
    /* JADX WARN: Code duplicated, block: B:158:0x047c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x045e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0474 A[LOOP:1: B:79:0x0458->B:83:0x0474, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:90:0x051e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0546  */
    /* JADX WARN: Code duplicated, block: B:94:0x0552  */
    /* JADX WARN: Code duplicated, block: B:96:0x0559  */
    /* JADX WARN: Code duplicated, block: B:99:0x0573  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0605 -> B:107:0x0615). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0631 -> B:108:0x062b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x08c6 -> B:14:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x08f1 -> B:119:0x0725). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object q(defpackage.xa2 r69, com.dh.myembyapp.data.model.MediaItem r70, java.util.List r71, defpackage.ib2 r72, kotlin.jvm.functions.Function2 r73, kotlin.coroutines.jvm.internal.ContinuationImpl r74) {
        /*
            Method dump skipped, instruction units count: 2440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa2.q(xa2, com.dh.myembyapp.data.model.MediaItem, java.util.List, ib2, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object r(xa2 xa2Var, i92 i92Var, TraktTokenResponse traktTokenResponse, ContinuationImpl continuationImpl) {
        wa2 wa2Var;
        Object k92Var;
        xa2Var.getClass();
        if (continuationImpl instanceof wa2) {
            wa2Var = (wa2) continuationImpl;
            int i = wa2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wa2Var.e = i - Integer.MIN_VALUE;
            } else {
                wa2Var = new wa2(xa2Var, continuationImpl);
            }
        } else {
            wa2Var = new wa2(xa2Var, continuationImpl);
        }
        Object objRefreshToken = wa2Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wa2Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRefreshToken);
            TraktApiService traktApiService = xa2Var.c;
            String refreshToken = traktTokenResponse.getRefreshToken();
            i92Var.getClass();
            TraktRefreshTokenRequest traktRefreshTokenRequest = new TraktRefreshTokenRequest(refreshToken, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", "0adc6e4aa2ddd7858eb346db6467d9678709322badd984c655514c97c36a8847", null, null, 24, null);
            wa2Var.a = null;
            wa2Var.b = null;
            wa2Var.e = 1;
            objRefreshToken = traktApiService.refreshToken(traktRefreshTokenRequest, wa2Var);
            if (objRefreshToken == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objRefreshToken);
        }
        Response response = (Response) objRefreshToken;
        TraktTokenResponse traktTokenResponse2 = (TraktTokenResponse) response.body();
        if (!response.isSuccessful() || traktTokenResponse2 == null) {
            Log.w("TraktSync", "event=device_token result=secret_validation_failed code=" + response.code() + " message=" + response.message() + " error=" + K(response));
            k92Var = new k92("Client Secret 校验失败，请检查后重新授权。");
        } else {
            xa2Var.b.c(traktTokenResponse2.getExpiresIn(), traktTokenResponse2.getAccessToken(), traktTokenResponse2.getRefreshToken());
            Log.d("TraktSync", "event=device_token result=success code=" + response.code() + " expiresIn=" + traktTokenResponse2.getExpiresIn());
            k92Var = new l92(traktTokenResponse2);
        }
        v(response);
        return k92Var;
    }

    public static TraktSyncHistoryRequest t(MediaItem mediaItem) {
        Integer num;
        String strTake;
        TraktIds traktIdsR = R(mediaItem.getProviderIds());
        if (traktIdsR == null) {
            return null;
        }
        Integer productionYear = mediaItem.getProductionYear();
        if (productionYear != null) {
            num = productionYear;
        } else {
            String premiereDate = mediaItem.getPremiereDate();
            if (premiereDate == null || (strTake = StringsKt.take(premiereDate, 4)) == null) {
                num = null;
            } else {
                productionYear = StringsKt.toIntOrNull(strTake);
                num = productionYear;
            }
        }
        String string = StringsKt.trim((CharSequence) mediaItem.getName()).toString();
        return new TraktSyncHistoryRequest(CollectionsKt.listOf(new TraktHistoryMovie(string.length() > 0 ? string : null, num, traktIdsR, null, 8, null)), null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static o92 u(MediaItem mediaItem, List list) {
        TraktIds traktIds;
        String string;
        String string2;
        String string3;
        TraktHistoryEpisode traktHistoryEpisode;
        String strTake;
        Integer indexNumber;
        ProviderIds providerIds = mediaItem.getProviderIds();
        Integer intOrNull = null;
        if (providerIds != null) {
            String tvdb = providerIds.getTvdb();
            Integer intOrNull2 = (tvdb == null || (string3 = StringsKt.trim((CharSequence) tvdb).toString()) == null) ? null : StringsKt.toIntOrNull(string3);
            String tmdb = providerIds.getTmdb();
            Integer intOrNull3 = (tmdb == null || (string2 = StringsKt.trim((CharSequence) tmdb).toString()) == null) ? null : StringsKt.toIntOrNull(string2);
            String imdb = providerIds.getImdb();
            String str = (imdb == null || (string = StringsKt.trim((CharSequence) imdb).toString()) == null || string.length() <= 0) ? null : string;
            if (intOrNull2 == null && intOrNull3 == null && str == null) {
                traktIds = null;
            } else {
                traktIds = new TraktIds(null, null, str, intOrNull3, intOrNull2, 3, null);
            }
        } else {
            traktIds = null;
        }
        if (traktIds != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem2 = (MediaItem) it.next();
                Integer parentIndexNumber = mediaItem2.getParentIndexNumber();
                Pair pair = (parentIndexNumber == null || (indexNumber = mediaItem2.getIndexNumber()) == null) ? null : TuplesKt.to(parentIndexNumber, indexNumber);
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayList.size();
            int size2 = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Pair pair2 = (Pair) obj;
                Integer numValueOf = Integer.valueOf(((Number) pair2.getFirst()).intValue());
                Object arrayList2 = linkedHashMap.get(numValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList2);
                }
                ((List) arrayList2).add(Integer.valueOf(((Number) pair2.getSecond()).intValue()));
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                List listSorted = CollectionsKt___CollectionsKt.sorted(CollectionsKt___CollectionsKt.distinct((List) entry.getValue()));
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSorted, 10));
                Iterator it2 = listSorted.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new TraktHistoryEpisode(Integer.valueOf(((Number) it2.next()).intValue()), null, null, null, 14, null));
                }
                arrayList3.add(new TraktHistorySeason(iIntValue, arrayList4));
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList3, new k00(17));
            if (!listSortedWith.isEmpty()) {
                String string4 = StringsKt.trim((CharSequence) mediaItem.getName()).toString();
                if (string4.length() <= 0) {
                    string4 = null;
                }
                Integer productionYear = mediaItem.getProductionYear();
                if (productionYear == null) {
                    String premiereDate = mediaItem.getPremiereDate();
                    if (premiereDate != null && (strTake = StringsKt.take(premiereDate, 4)) != null) {
                        intOrNull = StringsKt.toIntOrNull(strTake);
                    }
                } else {
                    intOrNull = productionYear;
                }
                TraktSyncHistoryRequest traktSyncHistoryRequest = new TraktSyncHistoryRequest(null, CollectionsKt.listOf(new TraktHistoryShow(string4, intOrNull, traktIds, listSortedWith)), null, 5, null);
                Iterator it3 = listSortedWith.iterator();
                while (it3.hasNext()) {
                    size2 += ((TraktHistorySeason) it3.next()).getEpisodes().size();
                }
                return new o92(traktSyncHistoryRequest, size2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            MediaItem mediaItem3 = (MediaItem) it4.next();
            TraktIds traktIdsQ = Q(mediaItem3.getProviderIds());
            if (traktIdsQ != null) {
                TraktIds traktIdsS = S(traktIdsQ);
                String string5 = StringsKt.trim((CharSequence) mediaItem3.getName()).toString();
                traktHistoryEpisode = new TraktHistoryEpisode(null, string5.length() > 0 ? string5 : null, traktIdsS, null, 9, null);
            } else {
                traktHistoryEpisode = null;
            }
            if (traktHistoryEpisode != null) {
                arrayList5.add(traktHistoryEpisode);
            }
        }
        if (arrayList5.isEmpty()) {
            return null;
        }
        return new o92(new TraktSyncHistoryRequest(null, null, arrayList5, 3, null), arrayList5.size());
    }

    public static void v(Response response) {
        Unit unit;
        Unit unit2 = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objBody = response.body();
            ResponseBody responseBody = objBody instanceof ResponseBody ? (ResponseBody) objBody : null;
            if (responseBody != null) {
                responseBody.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m8825constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8825constructorimpl(ResultKt.createFailure(th));
        }
        try {
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                responseBodyErrorBody.close();
                unit2 = Unit.INSTANCE;
            }
            Result.m8825constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m8825constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public static st1 w(TraktIds traktIds, Integer num, Integer num2) {
        if (traktIds == null) {
            return null;
        }
        return new st1(traktIds, "direct_fallback", null, num, num2, null, 228);
    }

    public static String x(MediaItem mediaItem) {
        RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
        return retrofitClient.getBaseUrl() + "|" + retrofitClient.getUserId() + "|" + mediaItem.getId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(i92 i92Var, ContinuationImpl continuationImpl) {
        aa2 aa2Var;
        if (continuationImpl instanceof aa2) {
            aa2Var = (aa2) continuationImpl;
            int i = aa2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aa2Var.e = i - Integer.MIN_VALUE;
            } else {
                aa2Var = new aa2(this, continuationImpl);
            }
        } else {
            aa2Var = new aa2(this, continuationImpl);
        }
        Object objRefreshToken = aa2Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aa2Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRefreshToken);
            i92 i92VarE = i92Var.e();
            if (i92.c() && i92VarE.d()) {
                if (i92VarE.d - System.currentTimeMillis() > 60000) {
                    return i92VarE.b;
                }
                TraktRefreshTokenRequest traktRefreshTokenRequest = new TraktRefreshTokenRequest(i92VarE.c, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", "0adc6e4aa2ddd7858eb346db6467d9678709322badd984c655514c97c36a8847", null, null, 24, null);
                aa2Var.a = null;
                aa2Var.b = null;
                aa2Var.e = 1;
                objRefreshToken = this.c.refreshToken(traktRefreshTokenRequest, aa2Var);
                if (objRefreshToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return null;
        }
        if (i2 != 1) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(objRefreshToken);
        Response response = (Response) objRefreshToken;
        TraktTokenResponse traktTokenResponse = (TraktTokenResponse) response.body();
        if (!response.isSuccessful() || traktTokenResponse == null) {
            Log.e("TraktSync", "event=token_refresh result=http_error code=" + response.code() + " message=" + response.message());
            return null;
        }
        this.b.c(traktTokenResponse.getExpiresIn(), traktTokenResponse.getAccessToken(), traktTokenResponse.getRefreshToken());
        Log.d("TraktSync", "event=token_refresh result=success code=" + response.code() + " expiresIn=" + traktTokenResponse.getExpiresIn());
        return traktTokenResponse.getAccessToken();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d A[Catch: Exception -> 0x00bb, CancellationException -> 0x0122, TryCatch #0 {CancellationException -> 0x0122, blocks: (B:13:0x003f, B:30:0x0082, B:34:0x0093, B:35:0x0097, B:37:0x009d, B:39:0x00b0, B:41:0x00b6, B:48:0x00c4, B:50:0x00c8, B:53:0x00ce, B:20:0x0056, B:22:0x0059, B:24:0x005c, B:26:0x0077), top: B:67:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[Catch: Exception -> 0x00bb, CancellationException -> 0x0122, TryCatch #0 {CancellationException -> 0x0122, blocks: (B:13:0x003f, B:30:0x0082, B:34:0x0093, B:35:0x0097, B:37:0x009d, B:39:0x00b0, B:41:0x00b6, B:48:0x00c4, B:50:0x00c8, B:53:0x00ce, B:20:0x0056, B:22:0x0059, B:24:0x005c, B:26:0x0077), top: B:67:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: Exception -> 0x00bb, CancellationException -> 0x0122, TryCatch #0 {CancellationException -> 0x0122, blocks: (B:13:0x003f, B:30:0x0082, B:34:0x0093, B:35:0x0097, B:37:0x009d, B:39:0x00b0, B:41:0x00b6, B:48:0x00c4, B:50:0x00c8, B:53:0x00ce, B:20:0x0056, B:22:0x0059, B:24:0x005c, B:26:0x0077), top: B:67:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object B(String str, p92 p92Var, String str2, ContinuationImpl continuationImpl) {
        ba2 ba2Var;
        String str3;
        String str4;
        String str5;
        p92 p92Var2;
        Object objG;
        Response response;
        List list;
        Iterator it;
        Object next;
        TraktSearchResult traktSearchResult;
        TraktSearchResult traktSearchResult2;
        TraktMovie movie;
        TraktIds ids;
        if (continuationImpl instanceof ba2) {
            ba2Var = (ba2) continuationImpl;
            int i = ba2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ba2Var.g = i - Integer.MIN_VALUE;
            } else {
                ba2Var = new ba2(this, continuationImpl);
            }
        } else {
            ba2Var = new ba2(this, continuationImpl);
        }
        ba2 ba2Var2 = ba2Var;
        Object obj = ba2Var2.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ba2Var2.g;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    TraktApiService traktApiService = this.c;
                    str3 = " idType=";
                    try {
                        String str6 = p92Var.a;
                        try {
                            String str7 = p92Var.b;
                            ba2Var2.a = str;
                            ba2Var2.b = p92Var;
                            ba2Var2.c = null;
                            ba2Var2.g = 1;
                            str4 = "TraktSync";
                            try {
                                objG = i02.g(traktApiService, str6, str7, str2, null, "movie", null, ba2Var2, 40, null);
                                if (objG == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str5 = str;
                                p92Var2 = p92Var;
                                response = (Response) objG;
                                list = (List) response.body();
                                if (response.isSuccessful()) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        traktSearchResult2 = (TraktSearchResult) next;
                                        if (!StringsKt__StringsJVMKt.equals(traktSearchResult2.getType(), "movie", true)) {
                                            movie = traktSearchResult2.getMovie();
                                            if (movie != null) {
                                                ids = movie.getIds();
                                            } else {
                                                ids = null;
                                            }
                                            if (ids != null) {
                                                break;
                                                break;
                                            }
                                        }
                                    }
                                    traktSearchResult = (TraktSearchResult) next;
                                    if (traktSearchResult != null) {
                                        return traktSearchResult.getMovie();
                                    }
                                    return null;
                                }
                                Log.w(str4, "event=movie_resolve result=lookup_http_error itemId=" + str5 + str3 + p92Var2.a + " code=" + response.code() + " message=" + response.message());
                                return null;
                            } catch (Exception e) {
                                e = e;
                                str5 = str;
                                p92Var2 = p92Var;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str4 = "TraktSync";
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str4 = "TraktSync";
                        str5 = str;
                        p92Var2 = p92Var;
                        String str8 = p92Var2.a;
                        String message = e.getMessage();
                        StringBuilder sbZ = kb0.z("event=movie_resolve result=lookup_exception itemId=", str5, str3, str8, " message=");
                        sbZ.append(message);
                        Log.e(str4, sbZ.toString(), e);
                        return null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = " idType=";
                }
            } else {
                if (i2 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p92 p92Var3 = ba2Var2.b;
                str5 = ba2Var2.a;
                try {
                    ResultKt.throwOnFailure(obj);
                    p92Var2 = p92Var3;
                    objG = obj;
                    str3 = " idType=";
                    str4 = "TraktSync";
                    try {
                        response = (Response) objG;
                        list = (List) response.body();
                        if (response.isSuccessful() && list != null) {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                traktSearchResult2 = (TraktSearchResult) next;
                                if (!StringsKt__StringsJVMKt.equals(traktSearchResult2.getType(), "movie", true)) {
                                    movie = traktSearchResult2.getMovie();
                                    if (movie != null) {
                                        ids = movie.getIds();
                                    } else {
                                        ids = null;
                                    }
                                    if (ids != null) {
                                        break;
                                    }
                                }
                            }
                            traktSearchResult = (TraktSearchResult) next;
                            if (traktSearchResult != null) {
                                return traktSearchResult.getMovie();
                            }
                            return null;
                        }
                        Log.w(str4, "event=movie_resolve result=lookup_http_error itemId=" + str5 + str3 + p92Var2.a + " code=" + response.code() + " message=" + response.message());
                        return null;
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    p92Var2 = p92Var3;
                    str3 = " idType=";
                    str4 = "TraktSync";
                }
            }
            String str9 = p92Var2.a;
            String message2 = e.getMessage();
            StringBuilder sbZ2 = kb0.z("event=movie_resolve result=lookup_exception itemId=", str5, str3, str9, " message=");
            sbZ2.append(message2);
            Log.e(str4, sbZ2.toString(), e);
            return null;
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00af A[Catch: Exception -> 0x00cd, CancellationException -> 0x0156, TryCatch #3 {Exception -> 0x00cd, blocks: (B:32:0x0094, B:36:0x00a5, B:37:0x00a9, B:39:0x00af, B:41:0x00c2, B:43:0x00c8, B:50:0x00d9, B:52:0x00dd, B:57:0x00e8), top: B:84:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8 A[Catch: Exception -> 0x00cd, CancellationException -> 0x0156, TryCatch #3 {Exception -> 0x00cd, blocks: (B:32:0x0094, B:36:0x00a5, B:37:0x00a9, B:39:0x00af, B:41:0x00c2, B:43:0x00c8, B:50:0x00d9, B:52:0x00dd, B:57:0x00e8), top: B:84:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd A[Catch: Exception -> 0x00cd, CancellationException -> 0x0156, TryCatch #3 {Exception -> 0x00cd, blocks: (B:32:0x0094, B:36:0x00a5, B:37:0x00a9, B:39:0x00af, B:41:0x00c2, B:43:0x00c8, B:50:0x00d9, B:52:0x00dd, B:57:0x00e8), top: B:84:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:94:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00a9 A[SYNTHETIC] */
    public final Object C(String str, p92 p92Var, String str2, String str3, ContinuationImpl continuationImpl) {
        ca2 ca2Var;
        String str4;
        String str5;
        String str6;
        String str7;
        p92 p92Var2;
        String str8;
        String str9;
        Object objG;
        Response response;
        List list;
        Iterator it;
        Object next;
        TraktSearchResult traktSearchResult;
        TraktShow show;
        TraktSearchResult traktSearchResult2;
        TraktShow show2;
        TraktIds ids;
        if (continuationImpl instanceof ca2) {
            ca2Var = (ca2) continuationImpl;
            int i = ca2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ca2Var.h = i - Integer.MIN_VALUE;
            } else {
                ca2Var = new ca2(this, continuationImpl);
            }
        } else {
            ca2Var = new ca2(this, continuationImpl);
        }
        ca2 ca2Var2 = ca2Var;
        Object obj = ca2Var2.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ca2Var2.h;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    TraktApiService traktApiService = this.c;
                    str4 = " idType=";
                    try {
                        String str10 = p92Var.a;
                        try {
                            String str11 = p92Var.b;
                            try {
                                ca2Var2.a = str;
                                ca2Var2.b = p92Var;
                                ca2Var2.c = null;
                                ca2Var2.d = str3;
                                ca2Var2.h = 1;
                                str9 = "TraktSync";
                                str5 = " seriesId=";
                                try {
                                    objG = i02.g(traktApiService, str10, str11, str2, null, "show", null, ca2Var2, 40, null);
                                    if (objG == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    str7 = str;
                                    p92Var2 = p92Var;
                                    str8 = str3;
                                    response = (Response) objG;
                                    list = (List) response.body();
                                    if (response.isSuccessful()) {
                                        it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                            traktSearchResult2 = (TraktSearchResult) next;
                                            if (!StringsKt__StringsJVMKt.equals(traktSearchResult2.getType(), "show", true)) {
                                                show2 = traktSearchResult2.getShow();
                                                if (show2 != null) {
                                                    ids = show2.getIds();
                                                } else {
                                                    ids = null;
                                                }
                                                if (ids != null) {
                                                    break;
                                                    break;
                                                }
                                            }
                                        }
                                        traktSearchResult = (TraktSearchResult) next;
                                        if (traktSearchResult != null) {
                                            show = traktSearchResult.getShow();
                                        } else {
                                            show = null;
                                        }
                                        if (show == null) {
                                            return null;
                                        }
                                        return show;
                                    }
                                    str6 = str9;
                                    Log.w(str6, "event=episode_resolve result=show_lookup_http_error itemId=" + str7 + str5 + str8 + str4 + p92Var2.a + " code=" + response.code() + " message=" + response.message());
                                    return null;
                                } catch (Exception e) {
                                    e = e;
                                    str6 = str9;
                                    str7 = str;
                                    p92Var2 = p92Var;
                                    str8 = str3;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str6 = "TraktSync";
                                str5 = " seriesId=";
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str6 = "TraktSync";
                            str5 = " seriesId=";
                        }
                    } catch (Exception e4) {
                        e = e4;
                        str5 = " seriesId=";
                        str6 = "TraktSync";
                        str7 = str;
                        p92Var2 = p92Var;
                        str8 = str3;
                        String str12 = p92Var2.a;
                        String message = e.getMessage();
                        StringBuilder sbZ = kb0.z("event=episode_resolve result=show_lookup_exception itemId=", str7, str5, str8, str4);
                        sbZ.append(str12);
                        sbZ.append(" message=");
                        sbZ.append(message);
                        Log.e(str6, sbZ.toString(), e);
                        return null;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str4 = " idType=";
                }
            } else {
                if (i2 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str13 = ca2Var2.d;
                p92Var2 = ca2Var2.b;
                str7 = ca2Var2.a;
                try {
                    ResultKt.throwOnFailure(obj);
                    objG = obj;
                    str4 = " idType=";
                    str9 = "TraktSync";
                    str8 = str13;
                    str5 = " seriesId=";
                    try {
                        response = (Response) objG;
                        list = (List) response.body();
                        if (response.isSuccessful() && list != null) {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                traktSearchResult2 = (TraktSearchResult) next;
                                if (!StringsKt__StringsJVMKt.equals(traktSearchResult2.getType(), "show", true)) {
                                    show2 = traktSearchResult2.getShow();
                                    if (show2 != null) {
                                        ids = show2.getIds();
                                    } else {
                                        ids = null;
                                    }
                                    if (ids != null) {
                                        break;
                                    }
                                }
                            }
                            traktSearchResult = (TraktSearchResult) next;
                            if (traktSearchResult != null) {
                                show = traktSearchResult.getShow();
                            } else {
                                show = null;
                            }
                            if (show == null) {
                                return null;
                            }
                            return show;
                        }
                        str6 = str9;
                        try {
                            Log.w(str6, "event=episode_resolve result=show_lookup_http_error itemId=" + str7 + str5 + str8 + str4 + p92Var2.a + " code=" + response.code() + " message=" + response.message());
                            return null;
                        } catch (Exception e6) {
                            e = e6;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        str6 = str9;
                    }
                } catch (Exception e8) {
                    e = e8;
                    str4 = " idType=";
                    str6 = "TraktSync";
                    str8 = str13;
                    str5 = " seriesId=";
                }
            }
            String str14 = p92Var2.a;
            String message2 = e.getMessage();
            StringBuilder sbZ2 = kb0.z("event=episode_resolve result=show_lookup_exception itemId=", str7, str5, str8, str4);
            sbZ2.append(str14);
            sbZ2.append(" message=");
            sbZ2.append(message2);
            Log.e(str6, sbZ2.toString(), e);
            return null;
        } catch (CancellationException e9) {
            throw e9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object F(MediaItem mediaItem, MediaItem mediaItem2, ib2 ib2Var, ContinuationImpl continuationImpl) {
        da2 da2Var;
        n92 n92VarU;
        MediaItem mediaItem3;
        Object obj;
        ib2 ib2Var2;
        MediaItem mediaItem4;
        n92 n92Var;
        Response response;
        MediaItem mediaItem5 = mediaItem2;
        if (continuationImpl instanceof da2) {
            da2Var = (da2) continuationImpl;
            int i = da2Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                da2Var.j = i - Integer.MIN_VALUE;
            } else {
                da2Var = new da2(this, continuationImpl);
            }
        } else {
            da2Var = new da2(this, continuationImpl);
        }
        da2 da2Var2 = da2Var;
        Object obj2 = da2Var2.h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = da2Var2.j;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            if (mediaItem5 == null) {
                Result.Companion companion = Result.INSTANCE;
                return i02.n("当前单集缺少父剧集信息，无法读取 Trakt 已看状态");
            }
            n92VarU = U(mediaItem);
            if (n92VarU == null) {
                Result.Companion companion2 = Result.INSTANCE;
                return i02.n("当前单集缺少季集编号，无法读取 Trakt 已看状态");
            }
            i92 i92Var = ib2Var.a;
            da2Var2.a = null;
            da2Var2.b = null;
            da2Var2.c = ib2Var;
            da2Var2.d = null;
            da2Var2.e = n92VarU;
            da2Var2.j = 1;
            Object objJ = J(mediaItem5, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", da2Var2);
            if (objJ != coroutine_suspended) {
                mediaItem3 = mediaItem;
                obj = objJ;
                ib2Var2 = ib2Var;
                mediaItem4 = mediaItem5;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            n92 n92Var2 = da2Var2.e;
            mediaItem4 = (MediaItem) da2Var2.d;
            ib2Var2 = (ib2) da2Var2.c;
            MediaItem mediaItem6 = (MediaItem) da2Var2.b;
            mediaItem3 = (MediaItem) da2Var2.a;
            ResultKt.throwOnFailure(obj2);
            n92VarU = n92Var2;
            mediaItem5 = mediaItem6;
            obj = obj2;
        } else {
            if (i2 != 2) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n92Var = da2Var2.e;
            ResultKt.throwOnFailure(obj2);
        }
        response = (Response) obj2;
        TraktShowWatchedProgress traktShowWatchedProgress = (TraktShowWatchedProgress) response.body();
        if (!response.isSuccessful() && traktShowWatchedProgress != null) {
            boolean zContains = V(traktShowWatchedProgress).contains(n92Var);
            v(response);
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8825constructorimpl(Boxing.boxBoolean(zContains));
        }
        String str = "读取 Trakt 剧集已看进度失败: " + response.code() + " " + response.message();
        v(response);
        Result.Companion companion4 = Result.INSTANCE;
        return i02.n(str);
        String str2 = (String) obj;
        if (str2 == null) {
            Result.Companion companion5 = Result.INSTANCE;
            return i02.n("无法同步：该剧缺少 IMDb/TMDB/TVDB 编号");
        }
        String strConcat = "Bearer ".concat(ib2Var2.b);
        da2Var2.a = null;
        da2Var2.b = null;
        da2Var2.c = null;
        da2Var2.d = null;
        da2Var2.e = n92VarU;
        da2Var2.g = null;
        da2Var2.j = 2;
        Object objF = i02.f(this.c, str2, strConcat, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6", null, false, false, false, da2Var2, 120, null);
        if (objF != coroutine_suspended) {
            n92 n92Var3 = n92VarU;
            obj2 = objF;
            n92Var = n92Var3;
            response = (Response) obj2;
            TraktShowWatchedProgress traktShowWatchedProgress2 = (TraktShowWatchedProgress) response.body();
            if (!response.isSuccessful()) {
            }
            String str3 = "读取 Trakt 剧集已看进度失败: " + response.code() + " " + response.message();
            v(response);
            Result.Companion companion6 = Result.INSTANCE;
            return i02.n(str3);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r14 == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(com.dh.myembyapp.data.model.MediaItem r12, defpackage.ib2 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa2.G(com.dh.myembyapp.data.model.MediaItem, ib2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:167:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:170:0x0416  */
    /* JADX WARN: Code duplicated, block: B:171:0x0419  */
    /* JADX WARN: Code duplicated, block: B:174:0x0422  */
    /* JADX WARN: Code duplicated, block: B:176:0x0428  */
    /* JADX WARN: Code duplicated, block: B:179:0x042f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0433  */
    /* JADX WARN: Code duplicated, block: B:184:0x043e A[PHI: r22
      0x043e: PHI (r22v8 java.lang.Object) = (r22v5 java.lang.Object), (r22v13 java.lang.Object) binds: [B:193:0x045c, B:182:0x043b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x0443  */
    /* JADX WARN: Code duplicated, block: B:187:0x0449  */
    /* JADX WARN: Code duplicated, block: B:192:0x045a  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x045e -> B:162:0x03a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x04c5 -> B:199:0x04de). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object H(com.dh.myembyapp.data.model.MediaItem r42, java.lang.String r43, kotlin.coroutines.jvm.internal.ContinuationImpl r44) {
        /*
            Method dump skipped, instruction units count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa2.H(com.dh.myembyapp.data.model.MediaItem, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(MediaItem mediaItem, String str, ContinuationImpl continuationImpl) {
        ia2 ia2Var;
        String tmdb;
        String string;
        String imdb;
        String string2;
        TraktIds ids;
        Integer trakt;
        if (continuationImpl instanceof ia2) {
            ia2Var = (ia2) continuationImpl;
            int i = ia2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ia2Var.g = i - Integer.MIN_VALUE;
            } else {
                ia2Var = new ia2(this, continuationImpl);
            }
        } else {
            ia2Var = new ia2(this, continuationImpl);
        }
        Object objB = ia2Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ia2Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            ProviderIds providerIds = mediaItem.getProviderIds();
            if (providerIds != null && (imdb = providerIds.getImdb()) != null && (string2 = StringsKt.trim((CharSequence) imdb).toString()) != null) {
                if (string2.length() <= 0) {
                    string2 = null;
                }
                if (string2 != null) {
                    return string2;
                }
            }
            ProviderIds providerIds2 = mediaItem.getProviderIds();
            if (providerIds2 != null && (tmdb = providerIds2.getTmdb()) != null && (string = StringsKt.trim((CharSequence) tmdb).toString()) != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    String id = mediaItem.getId();
                    p92 p92Var = new p92("tmdb", string);
                    ia2Var.a = null;
                    ia2Var.b = null;
                    ia2Var.c = null;
                    ia2Var.g = 1;
                    objB = B(id, p92Var, str, ia2Var);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(objB);
        TraktMovie traktMovie = (TraktMovie) objB;
        if (traktMovie != null && (ids = traktMovie.getIds()) != null && (trakt = ids.getTrakt()) != null) {
            if (trakt.intValue() <= 0) {
                trakt = null;
            }
            if (trakt != null) {
                return String.valueOf(trakt.intValue());
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0090 -> B:24:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object J(com.dh.myembyapp.data.model.MediaItem r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa2.J(com.dh.myembyapp.data.model.MediaItem, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object L(MediaItem mediaItem, long j, Long l, ya2 ya2Var, ContinuationImpl continuationImpl) {
        ka2 ka2Var;
        if (continuationImpl instanceof ka2) {
            ka2Var = (ka2) continuationImpl;
            int i = ka2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ka2Var.g = i - Integer.MIN_VALUE;
            } else {
                ka2Var = new ka2(this, continuationImpl);
            }
        } else {
            ka2Var = new ka2(this, continuationImpl);
        }
        Object objWithContext = ka2Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ka2Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            la2 la2Var = new la2(this, mediaItem, j, l, ya2Var, null);
            ka2Var.a = null;
            ka2Var.b = null;
            ka2Var.c = null;
            ka2Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, la2Var, ka2Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(MediaItem mediaItem, boolean z, MediaItem mediaItem2, ContinuationImpl continuationImpl) {
        qa2 qa2Var;
        if (continuationImpl instanceof qa2) {
            qa2Var = (qa2) continuationImpl;
            int i = qa2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa2Var.e = i - Integer.MIN_VALUE;
            } else {
                qa2Var = new qa2(this, continuationImpl);
            }
        } else {
            qa2Var = new qa2(this, continuationImpl);
        }
        Object objWithContext = qa2Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = qa2Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ra2 ra2Var = new ra2(this, mediaItem, z, mediaItem2, null);
            qa2Var.a = null;
            qa2Var.b = null;
            qa2Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, ra2Var, qa2Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(MediaItem mediaItem, List list, ta0 ta0Var, ContinuationImpl continuationImpl) {
        sa2 sa2Var;
        if (continuationImpl instanceof sa2) {
            sa2Var = (sa2) continuationImpl;
            int i = sa2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sa2Var.g = i - Integer.MIN_VALUE;
            } else {
                sa2Var = new sa2(this, continuationImpl);
            }
        } else {
            sa2Var = new sa2(this, continuationImpl);
        }
        Object objWithContext = sa2Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sa2Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ta2 ta2Var = new ta2(this, mediaItem, ta0Var, list, null);
            sa2Var.a = null;
            sa2Var.b = null;
            sa2Var.c = null;
            sa2Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, ta2Var, sa2Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(MediaItem mediaItem, List list, ta0 ta0Var, ContinuationImpl continuationImpl) {
        ua2 ua2Var;
        if (continuationImpl instanceof ua2) {
            ua2Var = (ua2) continuationImpl;
            int i = ua2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ua2Var.g = i - Integer.MIN_VALUE;
            } else {
                ua2Var = new ua2(this, continuationImpl);
            }
        } else {
            ua2Var = new ua2(this, continuationImpl);
        }
        Object objWithContext = ua2Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ua2Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            va2 va2Var = new va2(this, mediaItem, ta0Var, list, null);
            ua2Var.a = null;
            ua2Var.b = null;
            ua2Var.c = null;
            ua2Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, va2Var, ua2Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object s(MediaItem mediaItem, double d, long j, String str, ContinuationImpl continuationImpl) {
        t92 t92Var;
        long j2;
        double d2;
        if (continuationImpl instanceof t92) {
            t92Var = (t92) continuationImpl;
            int i = t92Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                t92Var.h = i - Integer.MIN_VALUE;
            } else {
                t92Var = new t92(this, continuationImpl);
            }
        } else {
            t92Var = new t92(this, continuationImpl);
        }
        Object objH = t92Var.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = t92Var.h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objH);
            t92Var.a = null;
            t92Var.b = null;
            t92Var.c = d;
            j2 = j;
            t92Var.d = j2;
            t92Var.h = 1;
            objH = H(mediaItem, str, t92Var);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
            d2 = d;
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = t92Var.d;
            d2 = t92Var.c;
            ResultKt.throwOnFailure(objH);
            j2 = j3;
        }
        st1 st1Var = (st1) objH;
        if (st1Var == null) {
            return new za2(null, Boxing.boxDouble(d2), Boxing.boxLong(j2), null, "episode_resolve_failed", 8);
        }
        TraktIds traktIds = st1Var.c;
        return new za2(new TraktScrobbleRequest(d2, null, traktIds != null ? new TraktScrobbleShow(st1Var.g, st1Var.h, traktIds) : null, new TraktScrobbleEpisode(st1Var.d, st1Var.e, st1Var.f, S(st1Var.a)), 2, null), Boxing.boxDouble(d2), Boxing.boxLong(j2), st1Var.b, null, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(MediaItem mediaItem, Long l, ContinuationImpl continuationImpl) {
        u92 u92Var;
        if (continuationImpl instanceof u92) {
            u92Var = (u92) continuationImpl;
            int i = u92Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                u92Var.e = i - Integer.MIN_VALUE;
            } else {
                u92Var = new u92(this, continuationImpl);
            }
        } else {
            u92Var = new u92(this, continuationImpl);
        }
        Object objWithContext = u92Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = u92Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            v92 v92Var = new v92(this, l, mediaItem, null);
            u92Var.a = null;
            u92Var.b = null;
            u92Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, v92Var, u92Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(i92 i92Var, ContinuationImpl continuationImpl) {
        x92 x92Var;
        if (continuationImpl instanceof x92) {
            x92Var = (x92) continuationImpl;
            int i = x92Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x92Var.d = i - Integer.MIN_VALUE;
            } else {
                x92Var = new x92(this, continuationImpl);
            }
        } else {
            x92Var = new x92(this, continuationImpl);
        }
        Object objWithContext = x92Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = x92Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            y92 y92Var = new y92(i92Var, this, null);
            x92Var.a = null;
            x92Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, y92Var, x92Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }
}
