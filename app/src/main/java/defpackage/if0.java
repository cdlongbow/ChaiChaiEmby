package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.PlaybackProgressInfo;
import com.dh.myembyapp.data.api.QueueItem;
import com.dh.myembyapp.data.api.RetrofitClient;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class if0 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ uf0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if0(String str, long j, String str2, String str3, String str4, uf0 uf0Var, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.d = j;
        this.e = str2;
        this.g = str3;
        this.h = str4;
        this.i = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new if0(this.c, this.d, this.e, this.g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((if0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object objReportPlaybackStart;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        String str = this.c;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str2 = this.c;
                PlaybackProgressInfo playbackProgressInfo = new PlaybackProgressInfo(str2, this.d, false, this.e, false, this.g, this.h, null, false, 0, null, 0, 0, null, CollectionsKt.listOf(new QueueItem(str2, "playlistItem0")), 16272, null);
                Log.d("EmbyPlaybackReport", "api=Start request ItemId=" + str + ", PositionTicks=" + this.d + ", MediaSourceId=" + this.g + ", PlaySessionId=" + this.h + ", PlayMethod=" + this.e + ", NowPlayingQueue=[{Id=" + str + ", PlaylistItemId=playlistItem0}]");
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                this.a = null;
                this.b = 1;
                objReportPlaybackStart = apiService.reportPlaybackStart(playbackProgressInfo, this);
                if (objReportPlaybackStart == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                objReportPlaybackStart = obj;
            }
            Response response = (Response) objReportPlaybackStart;
            if (response.isSuccessful()) {
                Log.d("EmbyPlaybackReport", "api=Start success ItemId=" + str);
                Result.Companion companion = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(Unit.INSTANCE);
            } else {
                Log.e("EmbyPlaybackReport", "api=Start failure ItemId=" + str + ", code=" + response.code() + ", message=" + response.message());
                Result.Companion companion2 = Result.INSTANCE;
                String strMessage = response.message();
                StringBuilder sb = new StringBuilder("上报播放开始失败: ");
                sb.append(strMessage);
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(sb.toString())));
            }
        } catch (Exception e) {
            kb0.G("api=Start exception ItemId=", str, "EmbyPlaybackReport", e);
            Result.Companion companion3 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
