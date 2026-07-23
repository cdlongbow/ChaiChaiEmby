package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.Renderer;
import com.dh.myembyapp.data.api.RetrofitClient;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class oo1 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ to1 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ long i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo1(to1 to1Var, String str, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.g = to1Var;
        this.h = str;
        this.i = j;
        this.j = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        oo1 oo1Var = new oo1(this.g, this.h, this.i, this.j, continuation);
        oo1Var.e = obj;
        return oo1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oo1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        long j = this.i;
        to1 to1Var = this.g;
        CoroutineScope coroutineScope = (CoroutineScope) this.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        boolean z = this.j;
        String str = this.h;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str2 = to1Var.h;
                if (str2 == null) {
                    Log.w("EmbyPlaybackReport", "event=progress_now skipped reason=no_play_session itemId=" + str);
                    return Unit.INSTANCE;
                }
                String str3 = to1Var.i;
                if (str3 == null) {
                    str3 = str;
                }
                long jCoerceAtLeast = RangesKt.coerceAtLeast(j, 0L) * Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
                String str4 = z ? "progress_now_pause" : "progress_now_playing";
                Log.d("EmbyPlaybackReport", "event=" + str4 + " itemId=" + str + ", positionMs=" + j + ", positionTicks=" + jCoerceAtLeast + ", isPaused=" + z + ", playSessionId=" + str2 + ", mediaSourceId=" + str3 + ", playMethod=" + to1Var.k);
                uf0 uf0Var = to1Var.a;
                String userId = RetrofitClient.INSTANCE.getUserId();
                String str5 = this.h;
                Long l = to1Var.j;
                String str6 = to1Var.k;
                String str7 = str3;
                boolean z2 = this.j;
                this.e = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 1;
                objC = uf0Var.C(userId, str5, jCoerceAtLeast, str2, str7, l, str6, z2, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                objC = ((Result) obj).getValue();
            }
            Result.m8824boximpl(objC);
        } catch (Exception e) {
            Boxing.boxInt(Log.w("EmbyPlaybackReport", "event=progress_now exception itemId=" + str + ", isPaused=" + z, e));
        }
        return Unit.INSTANCE;
    }
}
