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
public final class gf0 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Long j;
    public final /* synthetic */ uf0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(String str, long j, boolean z, String str2, String str3, String str4, Long l, uf0 uf0Var, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.d = j;
        this.e = z;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = l;
        this.k = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new gf0(this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gf0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object objReportPlaybackProgress;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        String str = this.c;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PlaybackProgressInfo playbackProgressInfo = new PlaybackProgressInfo(this.c, this.d, this.e, this.g, false, this.h, this.i, "TimeUpdate", false, 0, null, 0, 0, this.j, null, 24336, null);
                Log.d("EmbyPlaybackReport", "api=Progress request ItemId=" + str + ", PositionTicks=" + this.d + ", IsPaused=" + this.e + ", MediaSourceId=" + this.h + ", PlaySessionId=" + this.i + ", PlayMethod=" + this.g + ", RunTimeTicks=" + this.j);
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                this.a = null;
                this.b = 1;
                objReportPlaybackProgress = apiService.reportPlaybackProgress(playbackProgressInfo, this);
                if (objReportPlaybackProgress == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                objReportPlaybackProgress = obj;
            }
            Response response = (Response) objReportPlaybackProgress;
            if (response.isSuccessful()) {
                Log.d("EmbyPlaybackReport", "api=Progress success ItemId=" + str);
                
                objM8825constructorimpl = Unit.INSTANCE;
            } else {
                Log.e("EmbyPlaybackReport", "api=Progress failure ItemId=" + str + ", code=" + response.code() + ", message=" + response.message());
                
                String strMessage = response.message();
                StringBuilder sb = new StringBuilder("上报进度失败: ");
                sb.append(strMessage);
                objM8825constructorimpl = ResultKt.createFailure(new Exception(sb.toString()));
            }
        } catch (Exception e) {
            kb0.G("api=Progress exception ItemId=", str, "EmbyPlaybackReport", e);
            
            objM8825constructorimpl = ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage())));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
