package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.Renderer;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.TraktCloudPlaybackProgress;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class to1 extends ViewModel {
    public final uf0 a = new uf0();
    public Context b;
    public String c;
    public final MutableStateFlow d;
    public final StateFlow e;
    public MediaItem f;
    public Job g;
    public String h;
    public String i;
    public Long j;
    public String k;
    public String l;
    public ya2 m;
    public long n;
    public long o;
    public final Object p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final MutableStateFlow s;
    public final StateFlow t;
    public long u;
    public String v;
    public boolean w;
    public boolean x;

    public to1() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(do1.a);
        this.d = MutableStateFlow;
        this.e = FlowKt.asStateFlow(MutableStateFlow);
        this.k = "DirectStream";
        this.n = Long.MIN_VALUE;
        this.p = new Object();
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.q = MutableStateFlow2;
        this.r = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.s = MutableStateFlow3;
        this.t = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public static boolean D(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return false;
        }
        return StringsKt__StringsJVMKt.startsWith(str, "http://", true) || StringsKt__StringsJVMKt.startsWith(str, "https://", true);
    }

    public static boolean E(Context context) {
        return new ab2(context).a().b();
    }

    public static String H(HttpUrl httpUrl, String str) {
        Object next;
        Iterator<T> it = httpUrl.queryParameterNames().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt__StringsJVMKt.equals((String) next, str, true));
        String str2 = (String) next;
        if (str2 == null) {
            return null;
        }
        return httpUrl.queryParameter(str2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    public static boolean J(String str, String str2, String str3) {
        HttpUrl httpUrl;
        String accessToken;
        String deviceId;
        String str4;
        String lowerCase;
        boolean zX;
        boolean z;
        boolean z2;
        boolean z3;
        if (D(str)) {
            RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
            if (retrofitClient.hasCustomRoutingPath() && str != null && (httpUrl = HttpUrl.INSTANCE.parse(str)) != null) {
                String strEncodedPath = httpUrl.encodedPath();
                Locale locale = Locale.ROOT;
                String lowerCase2 = strEncodedPath.toLowerCase(locale);
                lowerCase2.getClass();
                String strTrimEnd = StringsKt.trimEnd(lowerCase2, '/');
                String lowerCase3 = str2.toLowerCase(locale);
                lowerCase3.getClass();
                if (StringsKt__StringsKt.contains$default(strTrimEnd, (CharSequence) ("/videos/" + lowerCase3 + "/"), false, 2, (Object) null) || StringsKt__StringsJVMKt.endsWith$default(strTrimEnd, "/videos/".concat(lowerCase3), false, 2, null)) {
                    accessToken = retrofitClient.getAccessToken();
                    deviceId = retrofitClient.getDeviceId();
                    str4 = (String) CollectionsKt.lastOrNull((List) httpUrl.pathSegments());
                    if (str4 != null) {
                        lowerCase = str4.toLowerCase(locale);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                    if (lowerCase == null) {
                        lowerCase = "";
                    }
                    zX = x(H(httpUrl, "MediaSourceId"), str3);
                    if (!StringsKt__StringsJVMKt.startsWith$default(lowerCase, "stream.", false, 2, null) || Intrinsics.areEqual(lowerCase, "master.m3u8")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zX2 = x(H(httpUrl, "Static"), "true");
                    if (StringsKt.isBlank(accessToken) && x(H(httpUrl, "api_key"), accessToken)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (StringsKt.isBlank(deviceId) && x(H(httpUrl, "DeviceId"), deviceId)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!zX || z || zX2 || z2 || z3) {
                        return true;
                    }
                } else {
                    if (StringsKt__StringsKt.contains$default(strTrimEnd, (CharSequence) ("/emby/videos/" + lowerCase3 + "/"), false, 2, (Object) null) || StringsKt__StringsJVMKt.endsWith$default(strTrimEnd, "/emby/videos/".concat(lowerCase3), false, 2, null)) {
                        accessToken = retrofitClient.getAccessToken();
                        deviceId = retrofitClient.getDeviceId();
                        str4 = (String) CollectionsKt.lastOrNull((List) httpUrl.pathSegments());
                        if (str4 != null) {
                            lowerCase = str4.toLowerCase(locale);
                            lowerCase.getClass();
                        } else {
                            lowerCase = null;
                        }
                        if (lowerCase == null) {
                            lowerCase = "";
                        }
                        zX = x(H(httpUrl, "MediaSourceId"), str3);
                        if (StringsKt__StringsJVMKt.startsWith$default(lowerCase, "stream.", false, 2, null)) {
                            z = true;
                        } else {
                            z = true;
                        }
                        boolean zX3 = x(H(httpUrl, "Static"), "true");
                        if (StringsKt.isBlank(accessToken)) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (StringsKt.isBlank(deviceId)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (!zX) {
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final String a(to1 to1Var, Integer num) {
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        if (num.intValue() >= 1000000) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("%.1fMbps", Arrays.copyOf(new Object[]{Double.valueOf(((double) num.intValue()) / 1000000.0d)}, 1));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return String.format("%dKbps", Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue() / 1000)}, 1));
    }

    public static final String b(to1 to1Var, Long l) {
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        if (l.longValue() >= 1073741824) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("%.2fG", Arrays.copyOf(new Object[]{Double.valueOf(l.longValue() / 1.073741824E9d)}, 1));
        }
        if (l.longValue() >= 1048576) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return String.format("%.0fM", Arrays.copyOf(new Object[]{Double.valueOf(l.longValue() / 1048576.0d)}, 1));
        }
        if (l.longValue() >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            return String.format("%.0fK", Arrays.copyOf(new Object[]{Double.valueOf(l.longValue() / 1024.0d)}, 1));
        }
        return l + "B";
    }

    public static final ya2 e(to1 to1Var, long j, Long l) {
        to1Var.getClass();
        if (l == null) {
            return ya2.b;
        }
        long jLongValue = l.longValue() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        if (jLongValue <= 0) {
            return ya2.b;
        }
        return RangesKt.coerceIn((((double) RangesKt.coerceAtLeast(j, 0L)) * 100.0d) / ((double) jLongValue), 0.0d, 100.0d) >= 80.0d ? ya2.c : ya2.b;
    }

    public static final boolean g(to1 to1Var) {
        ServerConfig effectiveServerConfig;
        Context context = to1Var.b;
        if (context == null) {
            return false;
        }
        ServerPreferences serverPreferences = new ServerPreferences(context);
        String str = to1Var.c;
        if (str != null) {
            ServerConfig serverById = serverPreferences.getServerById(str);
            ServerConfig effectiveServerConfig2 = serverById != null ? serverById.getEffectiveServerConfig() : null;
            if (effectiveServerConfig2 != null) {
                return effectiveServerConfig2.getEnableStrmDirectPlay();
            }
        }
        ServerConfig lastUsedServer = serverPreferences.getLastUsedServer();
        if (lastUsedServer == null || (effectiveServerConfig = lastUsedServer.getEffectiveServerConfig()) == null) {
            return false;
        }
        return effectiveServerConfig.getEnableStrmDirectPlay();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object h(to1 to1Var, MediaItem mediaItem, ContinuationImpl continuationImpl) {
        ko1 ko1Var;
        Object objI;
        String str;
        MutableStateFlow mutableStateFlow = to1Var.q;
        if (continuationImpl instanceof ko1) {
            ko1Var = (ko1) continuationImpl;
            int i = ko1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ko1Var.h = i - Integer.MIN_VALUE;
            } else {
                ko1Var = new ko1(to1Var, continuationImpl);
            }
        } else {
            ko1Var = new ko1(to1Var, continuationImpl);
        }
        ko1 ko1Var2 = ko1Var;
        Object obj = ko1Var2.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ko1Var2.h;
        Object obj2 = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                String seriesId = mediaItem.getSeriesId();
                if (seriesId == null) {
                    return Unit.INSTANCE;
                }
                String seasonId = mediaItem.getSeasonId();
                if (seasonId == null) {
                    seasonId = mediaItem.getParentId();
                    if (seasonId == null || Intrinsics.areEqual(seasonId, seriesId)) {
                        seasonId = null;
                    }
                    if (seasonId == null) {
                        return Unit.INSTANCE;
                    }
                }
                String str2 = seasonId;
                String userId = RetrofitClient.INSTANCE.getUserId();
                uf0 uf0Var = to1Var.a;
                ko1Var2.a = null;
                ko1Var2.b = null;
                ko1Var2.c = str2;
                ko1Var2.d = null;
                ko1Var2.h = 1;
                objI = uf0Var.i(userId, seriesId, str2, "SortName", "Ascending", ko1Var2);
                if (objI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
            } else {
                if (i2 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ko1Var2.c;
                ResultKt.throwOnFailure(obj);
                objI = ((Result) obj).getValue();
            }
            if (!false) {
                obj2 = objI;
            }
            List listEmptyList = (List) obj2;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List listSortedWith = CollectionsKt.sortedWith(w(listEmptyList), new k00(11));
            mutableStateFlow.setValue(listSortedWith);
            Log.d("PlayerViewModel", "Loaded " + listSortedWith.size() + " episodes for current season " + str);
        } catch (Exception e) {
            Log.e("PlayerViewModel", "Failed to load episodes", e);
            mutableStateFlow.setValue(CollectionsKt.emptyList());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object i(to1 to1Var, String str, MediaItem mediaItem, long j, Long l, boolean z, String str2, TranscodeQualityOption transcodeQualityOption, Integer num, Integer num2, ContinuationImpl continuationImpl) {
        mo1 mo1Var;
        Context applicationContext;
        String str3;
        String str4;
        TranscodeQualityOption transcodeQualityOption2;
        Object objY;
        MediaItem mediaItem2;
        boolean z2;
        long j2;
        i92 i92Var;
        Integer num3;
        Integer num4;
        if (continuationImpl instanceof mo1) {
            mo1Var = (mo1) continuationImpl;
            int i = mo1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                mo1Var.p = i - Integer.MIN_VALUE;
            } else {
                mo1Var = new mo1(to1Var, continuationImpl);
            }
        } else {
            mo1Var = new mo1(to1Var, continuationImpl);
        }
        Object obj = mo1Var.n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = mo1Var.p;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = to1Var.b;
            if (context == null || (applicationContext = context.getApplicationContext()) == null) {
                return Boxing.boxBoolean(false);
            }
            ab2 ab2Var = new ab2(applicationContext);
            i92 i92VarA = ab2Var.a();
            boolean z3 = i92VarA.a;
            if (!z3) {
                return Boxing.boxBoolean(false);
            }
            if (!z3 || !i92VarA.e || !i92.c() || !i92VarA.d()) {
                return Boxing.boxBoolean(false);
            }
            xa2 xa2Var = new xa2(applicationContext);
            str3 = str;
            mo1Var.a = str3;
            mo1Var.b = mediaItem;
            mo1Var.c = null;
            str4 = str2;
            mo1Var.d = str4;
            transcodeQualityOption2 = transcodeQualityOption;
            mo1Var.e = transcodeQualityOption2;
            mo1Var.g = num;
            mo1Var.h = num2;
            mo1Var.i = null;
            mo1Var.j = null;
            mo1Var.k = i92VarA;
            mo1Var.l = j;
            mo1Var.m = z;
            mo1Var.p = 1;
            objY = xa2Var.y(mediaItem, l, mo1Var);
            if (objY == coroutine_suspended) {
                return coroutine_suspended;
            }
            mediaItem2 = mediaItem;
            z2 = z;
            j2 = j;
            i92Var = i92VarA;
            num3 = num;
            num4 = num2;
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = mo1Var.m;
            j2 = mo1Var.l;
            i92Var = mo1Var.k;
            num4 = mo1Var.h;
            Integer num5 = mo1Var.g;
            TranscodeQualityOption transcodeQualityOption3 = mo1Var.e;
            String str5 = mo1Var.d;
            mediaItem2 = mo1Var.b;
            String str6 = mo1Var.a;
            ResultKt.throwOnFailure(obj);
            objY = ((Result) obj).getValue();
            num3 = num5;
            str3 = str6;
            transcodeQualityOption2 = transcodeQualityOption3;
            str4 = str5;
        }
        TraktCloudPlaybackProgress traktCloudPlaybackProgress = (TraktCloudPlaybackProgress) (false ? null : objY);
        if (traktCloudPlaybackProgress == null) {
            return Boxing.boxBoolean(false);
        }
        long jAbs = Math.abs(traktCloudPlaybackProgress.getPositionTicks() - j2) / 10000000;
        long j3 = j2;
        if (jAbs < i92Var.g) {
            return Boxing.boxBoolean(r8);
        }
        String type = mediaItem2.getType();
        long j4 = j3 / Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        long positionTicks = traktCloudPlaybackProgress.getPositionTicks() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        double progressPercent = traktCloudPlaybackProgress.getProgressPercent();
        StringBuilder sbZ = kb0.z("event=prompt result=show itemId=", str3, " type=", type, " differenceSeconds=");
        sbZ.append(jAbs);
        id.m(sbZ, " localMs=", j4, " cloudMs=");
        sbZ.append(positionTicks);
        sbZ.append(" cloudProgress=");
        sbZ.append(progressPercent);
        Log.d("TraktSync", sbZ.toString());
        to1Var.d.setValue(new fo1(mediaItem2, str3, j3, traktCloudPlaybackProgress, z2, str4, transcodeQualityOption2, num3, num4));
        return Boxing.boxBoolean(true);
    }

    public static final String j(String str, String str2, String str3) {
        if (!J(str, str2, str3)) {
            return str;
        }
        if (str == null) {
            return null;
        }
        return RetrofitClient.INSTANCE.remapAbsoluteMediaUrlToBaseUrl(str);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0134  */
    /* JADX WARN: Code duplicated, block: B:28:0x013e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0148  */
    /* JADX WARN: Code duplicated, block: B:31:0x014d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static final Object k(to1 to1Var, io1 io1Var, ContinuationImpl continuationImpl) {
        no1 no1Var;
        String str;
        no1 no1Var2;
        String str2;
        String str3;
        io1 io1Var2;
        Object obj;
        String str4;
        io1 io1Var3;
        Object value;
        Throwable thM8828exceptionOrNullimpl;
        String message;
        to1Var.getClass();
        if (continuationImpl instanceof no1) {
            no1Var = (no1) continuationImpl;
            int i = no1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                no1Var.e = i - Integer.MIN_VALUE;
            } else {
                no1Var = new no1(to1Var, continuationImpl);
            }
        } else {
            no1Var = new no1(to1Var, continuationImpl);
        }
        no1 no1Var3 = no1Var;
        Object obj2 = no1Var3.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = no1Var3.e;
        if (i2 != 0) {
            if (i2 == 1) {
                String str5 = (String) no1Var3.b;
                io1Var2 = no1Var3.a;
                ResultKt.throwOnFailure(obj2);
                ((Result) obj2).getValue();
                str4 = str5;
                str3 = ", playMethod=";
                obj = coroutine_suspended;
                str = ", playSessionId=";
                str2 = "EmbyPlaybackReport";
                no1Var2 = no1Var3;
            } else {
                if (i2 != 2) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io1 io1Var4 = no1Var3.a;
                ResultKt.throwOnFailure(obj2);
                value = ((Result) obj2).getValue();
                io1Var3 = io1Var4;
                str = ", playSessionId=";
                str2 = "EmbyPlaybackReport";
            }
            if (Result.m8832isSuccessimpl(value)) {
                s01.E("event=stop success itemId=", io1Var3.a, str, io1Var3.c, str2);
            } else {
                String str6 = io1Var3.a;
                String str7 = io1Var3.c;
                thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(value);
                if (thM8828exceptionOrNullimpl != null) {
                    message = thM8828exceptionOrNullimpl.getMessage();
                } else {
                    message = null;
                }
                StringBuilder sbZ = kb0.z("event=stop failure itemId=", str6, str, str7, ", message=");
                sbZ.append(message);
                Log.e(str2, sbZ.toString());
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        String userId = RetrofitClient.INSTANCE.getUserId();
        String str8 = io1Var.a;
        long j = io1Var.b;
        String str9 = io1Var.c;
        String str10 = io1Var.d;
        String str11 = io1Var.f;
        StringBuilder sb = new StringBuilder("event=progress_before_stop itemId=");
        sb.append(str8);
        sb.append(", positionTicks=");
        sb.append(j);
        i02.v(sb, ", playSessionId=", str9, ", mediaSourceId=", str10);
        sb.append(", playMethod=");
        sb.append(str11);
        Log.d("EmbyPlaybackReport", sb.toString());
        uf0 uf0Var = to1Var.a;
        String str12 = io1Var.a;
        long j2 = io1Var.b;
        String str13 = io1Var.c;
        String str14 = io1Var.d;
        Long l = io1Var.e;
        str = ", playSessionId=";
        String str15 = io1Var.f;
        no1Var3.a = io1Var;
        no1Var3.b = userId;
        no1Var3.e = 1;
        no1Var2 = no1Var3;
        str2 = "EmbyPlaybackReport";
        str3 = ", playMethod=";
        if (uf0Var.C(userId, str12, j2, str13, str14, l, str15, false, no1Var2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        io1Var2 = io1Var;
        obj = coroutine_suspended;
        str4 = userId;
        String str16 = io1Var2.a;
        long j3 = io1Var2.b;
        String str17 = io1Var2.c;
        String str18 = io1Var2.d;
        String str19 = io1Var2.f;
        StringBuilder sb2 = new StringBuilder("event=stop request itemId=");
        sb2.append(str16);
        sb2.append(", positionTicks=");
        sb2.append(j3);
        i02.v(sb2, str, str17, ", mediaSourceId=", str18);
        sb2.append(str3);
        sb2.append(str19);
        Log.d(str2, sb2.toString());
        uf0 uf0Var2 = to1Var.a;
        String str20 = io1Var2.a;
        long j4 = io1Var2.b;
        String str21 = io1Var2.c;
        String str22 = io1Var2.d;
        Long l2 = io1Var2.e;
        String str23 = io1Var2.f;
        no1Var2.a = io1Var2;
        no1Var2.b = null;
        no1Var2.e = 2;
        io1Var3 = io1Var2;
        Object obj3 = obj;
        Object objE = uf0Var2.E(str4, str20, j4, str21, str22, l2, str23, no1Var2);
        if (objE == obj3) {
            return obj3;
        }
        value = objE;
        if (Result.m8832isSuccessimpl(value)) {
            s01.E("event=stop success itemId=", io1Var3.a, str, io1Var3.c, str2);
        } else {
            String str24 = io1Var3.a;
            String str25 = io1Var3.c;
            thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(value);
            if (thM8828exceptionOrNullimpl != null) {
                message = thM8828exceptionOrNullimpl.getMessage();
            } else {
                message = null;
            }
            StringBuilder sbZ2 = kb0.z("event=stop failure itemId=", str24, str, str25, ", message=");
            sbZ2.append(message);
            Log.e(str2, sbZ2.toString());
        }
        return Unit.INSTANCE;
    }

    public static final String l(to1 to1Var, String str, String str2, String str3) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        String strRemapAbsoluteMediaUrlToBaseUrl = !J(str, str2, str3) ? str : RetrofitClient.INSTANCE.remapAbsoluteMediaUrlToBaseUrl(str);
        if (strRemapAbsoluteMediaUrlToBaseUrl != null) {
            str = strRemapAbsoluteMediaUrlToBaseUrl;
        }
        if (D(str)) {
            return str;
        }
        String strTrimEnd = StringsKt.trimEnd(RetrofitClient.INSTANCE.getBaseUrl(), '/');
        if (StringsKt__StringsJVMKt.startsWith(str, "/emby", true)) {
            return c61.n(strTrimEnd, str);
        }
        return StringsKt__StringsJVMKt.startsWith$default(str, "/", false, 2, null) ? mr.C(strTrimEnd, "/emby", str) : mr.C(strTrimEnd, "/emby/", str);
    }

    public static final void m(to1 to1Var, MediaItem mediaItem) {
        CharSequence charSequence;
        MutableStateFlow mutableStateFlow = to1Var.s;
        m82 m82VarV = tl0.V(mediaItem);
        if (m82VarV == null) {
            String id = mediaItem.getId();
            String type = mediaItem.getType();
            String seriesId = mediaItem.getSeriesId();
            StringBuilder sbZ = kb0.z("播放器 Logo 不可用: itemId=", id, ", type=", type, ", seriesId=");
            sbZ.append(seriesId);
            Log.d("PlayerViewModel", sbZ.toString());
            to1Var.u++;
            to1Var.v = null;
            mutableStateFlow.setValue(null);
            return;
        }
        String str = m82VarV.a;
        String str2 = m82VarV.b;
        if (str2 == null) {
            str2 = "";
        }
        String strC = mr.C(str, "|", str2);
        if (!Intrinsics.areEqual(to1Var.v, strC) || (charSequence = (CharSequence) mutableStateFlow.getValue()) == null || StringsKt.isBlank(charSequence)) {
            long j = 1 + to1Var.u;
            to1Var.u = j;
            to1Var.v = strC;
            mutableStateFlow.setValue(null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(to1Var), null, null, new uc(to1Var, m82VarV, j, mediaItem, (Continuation) null, 3), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Integer n(to1 to1Var, MediaSource mediaSource, Integer num, boolean z) {
        MediaStream mediaStream;
        String string;
        List<MediaStream> mediaStreams;
        Object next;
        String lowerCase = null;
        if (!z || num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue >= 0) {
            if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
                mediaStream = null;
            } else {
                Iterator<T> it = mediaStreams.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    MediaStream mediaStream2 = (MediaStream) next;
                    if (Intrinsics.areEqual(mediaStream2.getType(), "Subtitle") && mediaStream2.getIndex() == iIntValue) {
                        break;
                    }
                }
                mediaStream = (MediaStream) next;
            }
            if (mediaStream == null) {
                Log.w("PlayerViewModel", "转码请求跳过未知字幕流: streamIndex=" + iIntValue);
                return -1;
            }
            boolean z2 = false;
            if (!(!Intrinsics.areEqual(mediaStream.getType(), "Subtitle") ? false : mediaStream.isExternal())) {
                if (Intrinsics.areEqual(mediaStream.getType(), "Subtitle") && !mediaStream.isExternal()) {
                    String deliveryMethod = mediaStream.getDeliveryMethod();
                    if (deliveryMethod == null) {
                        deliveryMethod = "";
                    }
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = deliveryMethod.toLowerCase(locale);
                    lowerCase2.getClass();
                    int iHashCode = lowerCase2.hashCode();
                    if (iHashCode == -1820761141 ? !lowerCase2.equals("external") : !(iHashCode == -113921284 ? lowerCase2.equals("videosidedata") : iHashCode == 103407 && lowerCase2.equals("hls"))) {
                        if (!mediaStream.isTextSubtitleStream()) {
                            String codec = mediaStream.getCodec();
                            if (codec != null && (string = StringsKt.trim((CharSequence) codec).toString()) != null) {
                                lowerCase = string.toLowerCase(locale);
                                lowerCase.getClass();
                            }
                            if (lowerCase != null) {
                                switch (lowerCase.hashCode()) {
                                    case -891530535:
                                        if (lowerCase.equals("subrip")) {
                                            z2 = true;
                                        }
                                        break;
                                    case -791786078:
                                        if (lowerCase.equals("webvtt")) {
                                            z2 = true;
                                        }
                                        break;
                                    case 96897:
                                        if (lowerCase.equals("ass")) {
                                            z2 = true;
                                        }
                                        break;
                                    case 114165:
                                        if (lowerCase.equals("srt")) {
                                            z2 = true;
                                        }
                                        break;
                                    case 114177:
                                        if (lowerCase.equals("ssa")) {
                                            z2 = true;
                                        }
                                        break;
                                    case 117110:
                                        if (lowerCase.equals("vtt")) {
                                            z2 = true;
                                        }
                                        break;
                                }
                            }
                        } else {
                            z2 = true;
                        }
                        z2 = !z2;
                    }
                }
                if (z2) {
                    return num;
                }
                Log.w("PlayerViewModel", "转码请求跳过不稳定的内封文本字幕: streamIndex=" + iIntValue + ", codec=" + mediaStream.getCodec());
                return -1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object o(to1 to1Var, Context context, MediaItem mediaItem, long j, Long l, ya2 ya2Var, ContinuationImpl continuationImpl) {
        qo1 qo1Var;
        to1Var.getClass();
        if (continuationImpl instanceof qo1) {
            qo1Var = (qo1) continuationImpl;
            int i = qo1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                qo1Var.h = i - Integer.MIN_VALUE;
            } else {
                qo1Var = new qo1(to1Var, continuationImpl);
            }
        } else {
            qo1Var = new qo1(to1Var, continuationImpl);
        }
        Object obj = qo1Var.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = qo1Var.h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            xa2 xa2Var = new xa2(context);
            qo1Var.a = null;
            qo1Var.b = null;
            qo1Var.c = null;
            qo1Var.d = null;
            qo1Var.h = 1;
            if (xa2Var.L(mediaItem, j, l, ya2Var, qo1Var) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            ((Result) obj).getValue();
        }
        return Unit.INSTANCE;
    }

    public static final void u(to1 to1Var, String str, String str2, long j) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(to1Var), Dispatchers.getIO(), null, new uc(to1Var, str, str2, j, (Continuation) null, 4), 2, null);
    }

    public static List w(List list) {
        if (list.size() <= 1) {
            return list;
        }
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            if (hashSet.add(mediaItem.getId())) {
                arrayList.add(mediaItem);
            }
        }
        return arrayList;
    }

    public static boolean x(String str, String str2) {
        return (str == null || str2 == null || !StringsKt__StringsJVMKt.equals(str, str2, true)) ? false : true;
    }

    public final StateFlow A() {
        return this.t;
    }

    public final String B(long j, ya2 ya2Var, String str) {
        String str2;
        ya2 ya2Var2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.p) {
            try {
                boolean zAreEqual = Intrinsics.areEqual(this.l, str);
                boolean z = this.m == ya2Var;
                long j2 = jCurrentTimeMillis - this.o;
                long j3 = this.n;
                long jAbs = j3 == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(j - j3);
                if (!zAreEqual || !z || j2 >= 5000 || jAbs > 5000) {
                    str2 = (zAreEqual && ya2Var == (ya2Var2 = ya2.a) && this.m == ya2Var2 && jAbs <= RangesKt.coerceAtLeast(j2, 0L) + 120000) ? "start_duplicate" : null;
                } else {
                    str2 = "dedupe";
                }
                if (str2 == null) {
                    this.l = str;
                    this.m = ya2Var;
                    this.n = j;
                    this.o = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final StateFlow C() {
        return this.e;
    }

    public final void F(String str, boolean z, String str2, TranscodeQualityOption transcodeQualityOption, Integer num, Integer num2, Long l, boolean z2, boolean z3) {
        str.getClass();
        Job job = this.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.k = z ? "Transcode" : "DirectStream";
        this.d.setValue(do1.a);
        this.w = false;
        Log.d("PlayerViewModel", "========== loadMediaItem 调用 ==========");
        Log.d("PlayerViewModel", "itemId: ".concat(str));
        Log.d("PlayerViewModel", "preferredMediaSourceId: " + str2);
        Log.d("PlayerViewModel", "========================================");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new lo1(this, str, str2, l, z2, z, transcodeQualityOption, num, num2, z3, null), 3, null);
    }

    public final void I(long j, ya2 ya2Var, String str) {
        Context context = this.b;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null && E(applicationContext)) {
            MediaItem mediaItem = this.f;
            if (mediaItem == null || !Intrinsics.areEqual(mediaItem.getId(), str)) {
                mediaItem = null;
            }
            if (mediaItem == null) {
                return;
            }
            Long l = this.j;
            if (B(j, ya2Var, str) != null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new po1(this, applicationContext, mediaItem, j, l, ya2Var, null), 2, null);
        }
    }

    public final void K(long j, boolean z, String str) {
        Long l;
        str.getClass();
        Job job = this.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        io1 io1VarV = v(str, j);
        if (io1VarV == null || (l = io1VarV.e) == null) {
            l = this.j;
        }
        Long l2 = l;
        Context context = this.b;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        MediaItem mediaItem = this.f;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new ro1(io1VarV, str, j, this, z, applicationContext, l2, (mediaItem == null || !Intrinsics.areEqual(mediaItem.getId(), str)) ? null : mediaItem, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Job job = this.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final io1 v(String str, long j) {
        String str2 = this.h;
        if (str2 == null) {
            return null;
        }
        String str3 = this.i;
        return new io1(str, str2, RangesKt.coerceAtLeast(j, 0L) * Renderer.DEFAULT_DURATION_TO_PROGRESS_US, str3 == null ? str : str3, this.k, this.j);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac A[LOOP:0: B:71:0x0195->B:76:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:95:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b0 A[EDGE_INSN: B:96:0x01b0->B:78:0x01b0 BREAK  A[LOOP:0: B:71:0x0195->B:76:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r3 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0200, code lost:
    
        if (r0 == r2) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to1.y(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final StateFlow z() {
        return this.r;
    }
}
