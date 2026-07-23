package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.DeviceProfile;
import com.dh.myembyapp.data.model.DeviceProfileKt;
import com.dh.myembyapp.data.model.PlaybackInfoRequest;
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
public final class oe0 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public int c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ Long h;
    public final /* synthetic */ Integer i;
    public final /* synthetic */ Integer j;
    public final /* synthetic */ String k;
    public final /* synthetic */ Integer l;
    public final /* synthetic */ Boolean m;
    public final /* synthetic */ Boolean n;
    public final /* synthetic */ Boolean o;
    public final /* synthetic */ uf0 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe0(Long l, Integer num, Integer num2, Long l2, Integer num3, Integer num4, String str, Integer num5, Boolean bool, Boolean bool2, Boolean bool3, uf0 uf0Var, String str2, String str3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.d = l;
        this.e = num;
        this.g = num2;
        this.h = l2;
        this.i = num3;
        this.j = num4;
        this.k = str;
        this.l = num5;
        this.m = bool;
        this.n = bool2;
        this.o = bool3;
        this.p = uf0Var;
        this.q = str2;
        this.r = str3;
        this.s = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new oe0(this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oe0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object objN;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Long l = this.d;
                DeviceProfile deviceProfileCreateAndroidTvDeviceProfile = DeviceProfileKt.createAndroidTvDeviceProfile(l != null ? l.longValue() : 40000000L, this.e, this.g);
                PlaybackInfoRequest playbackInfoRequest = new PlaybackInfoRequest(deviceProfileCreateAndroidTvDeviceProfile, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                String str = this.q;
                String str2 = this.r;
                boolean z = this.s;
                this.a = null;
                this.b = null;
                this.c = 1;
                objN = kb0.n(apiService, str, str2, false, z, playbackInfoRequest, this, 4, null);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                objN = obj;
            }
            Response response = (Response) objN;
            if (!response.isSuccessful() || response.body() == null) {
                Log.e("EmbyRepository", "获取播放信息失败: " + response.code() + " " + response.message());
                Result.Companion companion = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception("获取播放信息失败: " + response.message())));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                Object objBody = response.body();
                objBody.getClass();
                objM8825constructorimpl = Result.m8825constructorimpl(objBody);
            }
        } catch (Exception e) {
            Log.e("EmbyRepository", "获取播放信息异常", e);
            Result.Companion companion3 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
