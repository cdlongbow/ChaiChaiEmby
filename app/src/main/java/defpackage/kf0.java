package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.PlaybackProgressInfo;
import com.dh.myembyapp.data.api.RetrofitClient;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class kf0 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ uf0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf0(String str, long j, String str2, String str3, String str4, uf0 uf0Var, Continuation continuation) {
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
        return new kf0(this.c, this.d, this.e, this.g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kf0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object objReportPlaybackStopped;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        String str = this.c;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PlaybackProgressInfo playbackProgressInfo = new PlaybackProgressInfo(this.c, this.d, false, this.e, false, this.g, this.h, null, false, 0, null, 0, 0, null, null, 24464, null);
                Log.d("EmbyPlaybackReport", "api=Stopped request ItemId=" + str + ", PositionTicks=" + this.d + ", MediaSourceId=" + this.g + ", PlaySessionId=" + this.h + ", PlayMethod=" + this.e + ", RunTimeTicks=null");
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                this.a = null;
                this.b = 1;
                objReportPlaybackStopped = apiService.reportPlaybackStopped(playbackProgressInfo, this);
                if (objReportPlaybackStopped == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                objReportPlaybackStopped = obj;
            }
            Response response = (Response) objReportPlaybackStopped;
            if (response.isSuccessful()) {
                Log.d("EmbyPlaybackReport", "api=Stopped success ItemId=" + str);
                Result.Companion companion = Result.INSTANCE;
                return Result.m8824boximpl(Result.m8825constructorimpl(Unit.INSTANCE));
            }
            Log.e("EmbyPlaybackReport", "api=Stopped failure ItemId=" + str + ", code=" + response.code() + ", message=" + response.message());
            Result.Companion companion2 = Result.INSTANCE;
            String strMessage = response.message();
            StringBuilder sb = new StringBuilder("上报播放停止失败: ");
            sb.append(strMessage);
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(sb.toString())));
            return Result.m8824boximpl(objM8825constructorimpl);
        } catch (Exception e) {
            kb0.G("api=Stopped exception ItemId=", str, "EmbyPlaybackReport", e);
            Result.Companion companion3 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
        }
    }
}
