package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ti1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState A;
    public final /* synthetic */ MutableState B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ on1 E;
    public final /* synthetic */ MutableState F;
    public final /* synthetic */ MutableState G;
    public final /* synthetic */ MutableIntState H;
    public final /* synthetic */ MutableState I;
    public final /* synthetic */ on1 J;
    public final /* synthetic */ on1 K;
    public final /* synthetic */ MutableState L;
    public final /* synthetic */ String[] M;
    public final /* synthetic */ MutableState N;
    public final /* synthetic */ MutableState O;
    public final /* synthetic */ MutableState P;
    public final /* synthetic */ MutableState Q;
    public final /* synthetic */ MutableState R;
    public final /* synthetic */ nn1 a;
    public final /* synthetic */ eo1 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ og1 g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ og1 i;
    public final /* synthetic */ og1 j;
    public final /* synthetic */ og1 k;
    public final /* synthetic */ on1 l;
    public final /* synthetic */ og1 m;
    public final /* synthetic */ State n;
    public final /* synthetic */ State o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ to1 q;
    public final /* synthetic */ DefaultBandwidthMeter r;
    public final /* synthetic */ UserPreferences s;
    public final /* synthetic */ AtomicLong t;
    public final /* synthetic */ pn1 u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;
    public final /* synthetic */ MutableState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti1(nn1 nn1Var, eo1 eo1Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, og1 og1Var, MutableState mutableState4, og1 og1Var2, og1 og1Var3, og1 og1Var4, on1 on1Var, og1 og1Var5, State state, State state2, Context context, to1 to1Var, DefaultBandwidthMeter defaultBandwidthMeter, UserPreferences userPreferences, AtomicLong atomicLong, pn1 pn1Var, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, Function0 function0, Function1 function1, on1 on1Var2, MutableState mutableState12, MutableState mutableState13, MutableIntState mutableIntState, MutableState mutableState14, on1 on1Var3, on1 on1Var4, MutableState mutableState15, String[] strArr, MutableState mutableState16, MutableState mutableState17, MutableState mutableState18, MutableState mutableState19, MutableState mutableState20, Continuation continuation) {
        super(2, continuation);
        this.a = nn1Var;
        this.b = eo1Var;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = og1Var;
        this.h = mutableState4;
        this.i = og1Var2;
        this.j = og1Var3;
        this.k = og1Var4;
        this.l = on1Var;
        this.m = og1Var5;
        this.n = state;
        this.o = state2;
        this.p = context;
        this.q = to1Var;
        this.r = defaultBandwidthMeter;
        this.s = userPreferences;
        this.t = atomicLong;
        this.u = pn1Var;
        this.v = mutableState5;
        this.w = mutableState6;
        this.x = mutableState7;
        this.y = mutableState8;
        this.z = mutableState9;
        this.A = mutableState10;
        this.B = mutableState11;
        this.C = function0;
        this.D = function1;
        this.E = on1Var2;
        this.F = mutableState12;
        this.G = mutableState13;
        this.H = mutableIntState;
        this.I = mutableState14;
        this.J = on1Var3;
        this.K = on1Var4;
        this.L = mutableState15;
        this.M = strArr;
        this.N = mutableState16;
        this.O = mutableState17;
        this.P = mutableState18;
        this.Q = mutableState19;
        this.R = mutableState20;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ti1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ti1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, KeyManagementException {
        ExoPlayer exoPlayerD0;
        eo1 eo1Var = this.b;
        long j = eo1Var.c;
        MutableState mutableState = this.g.c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutableState mutableState2 = this.c;
        if (((Boolean) mutableState2.getValue()).booleanValue()) {
            mutableState2.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        dn1.F0(this.H, "媒体重新初始化");
        this.d.setValue(null);
        this.e.setValue(Boolean.FALSE);
        String str = (String) mutableState.getValue();
        Context context = this.p;
        on1 on1Var = this.l;
        MutableState mutableState3 = this.h;
        if (str != null) {
            Log.d("PlayerScreen", "新条目开始播放，清除临时 FFmpeg 音频覆盖并恢复保存的音频解码模式");
            mutableState.setValue(null);
            ExoPlayer exoPlayer = (ExoPlayer) mutableState3.getValue();
            exoPlayerD0 = dn1.d0(context, this.q, this.r, this.s, this.t, this.u, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (String) this.i.a.getValue(), (String) this.j.b.getValue(), this.k.a(), on1Var.g.getIntValue(), this.m.b(), ((Number) this.n.getValue()).intValue(), ((Number) this.o.getValue()).intValue());
            exoPlayerD0.setTrackSelectionParameters(exoPlayer.getTrackSelectionParameters());
            exoPlayerD0.setRepeatMode(exoPlayer.getRepeatMode());
            exoPlayerD0.setShuffleModeEnabled(exoPlayer.getShuffleModeEnabled());
            exoPlayer.stop();
            exoPlayer.release();
            Log.d("PlayerScreen", "旧播放器已释放（清理临时 FFmpeg 音频覆盖）");
            mutableState3.setValue(exoPlayerD0);
            this.v.setValue(exoPlayerD0);
        } else {
            exoPlayerD0 = (ExoPlayer) mutableState3.getValue();
        }
        ExoPlayer exoPlayer2 = exoPlayerD0;
        this.w.setValue(false);
        this.x.setValue(CollectionsKt.emptyList());
        this.y.setValue(MapsKt.emptyMap());
        this.z.setValue(MapsKt.emptyMap());
        this.A.setValue(null);
        this.B.setValue(2);
        exoPlayer2.setMediaItem(dn1.a0(this.C, this.D, context, eo1Var, this.P, this.Q, this.R, this.x, MapsKt.emptyMap()));
        exoPlayer2.prepare();
        exoPlayer2.setPlaybackSpeed(this.E.b.getFloatValue());
        nn1 nn1Var = this.a;
        nn1Var.getClass();
        MutableState mutableState4 = nn1Var.e;
        long j2 = j / Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        long jCoerceAtLeast = RangesKt.coerceAtLeast(j2, 0L);
        if (((Boolean) mutableState4.getValue()).booleanValue()) {
            ph1 ph1Var = nn1Var.b;
            String str2 = nn1Var.a;
            ph1Var.getClass();
            str2.getClass();
            Long l = (Long) ph1Var.a.get(str2);
            jCoerceAtLeast = l != null ? l.longValue() : RangesKt.coerceAtLeast(j2, 0L);
        }
        long j3 = jCoerceAtLeast;
        long j4 = j / Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        long jLongValue = ((Number) nn1Var.d.getValue()).longValue();
        boolean zBooleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
        StringBuilder sbR = i02.r(j3, "播放器初始化续播位置: target=", "ms, stateStart=");
        sbR.append(j4);
        id.m(sbR, "ms, remembered=", jLongValue, "ms, hasKnown=");
        sbR.append(zBooleanValue);
        Log.d("PlayerScreen", sbR.toString());
        dn1.I0(this.t, on1Var, exoPlayer2, j3);
        nn1Var.c(j3);
        MutableState mutableState5 = this.F;
        MutableState mutableState6 = this.G;
        boolean zQ0 = dn1.q0(mutableState5, mutableState6);
        exoPlayer2.setPlayWhenReady(zQ0);
        if (!zQ0) {
            Log.d("PlayerScreen", "播放器初始化完成但保持暂停: foreground=" + ((Boolean) mutableState5.getValue()).booleanValue() + ", pausedForBackground=" + ((Boolean) mutableState6.getValue()).booleanValue());
        }
        return Unit.INSTANCE;
    }
}
