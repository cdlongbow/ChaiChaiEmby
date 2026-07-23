package defpackage;

import android.util.Log;
import androidx.media3.common.MediaItem;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sh1 {
    public final Function0 a;
    public final Function1 b;
    public final Function1 c;
    public final Function0 d;
    public final Function0 e;
    public final Function1 f;
    public final Function0 g;
    public final ki1 h;
    public final nm1 i;
    public final Function0 j;
    public final Function0 k;
    public final Function1 l;
    public final di1 m;
    public final Function0 n;
    public final di1 o;
    public final zh1 p;
    public final di1 q;
    public final Function0 r;
    public final Function0 s;

    public sh1(Function0 function0, Function1 function1, Function1 function2, Function0 function3, Function0 function4, Function1 function5, Function0 function6, ki1 ki1Var, nm1 nm1Var, Function0 function7, Function0 function8, Function1 function9, di1 di1Var, Function0 function10, di1 di1Var2, zh1 zh1Var, di1 di1Var3, Function0 function11, Function0 function12) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        function9.getClass();
        function10.getClass();
        function11.getClass();
        function12.getClass();
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = function4;
        this.f = function5;
        this.g = function6;
        this.h = ki1Var;
        this.i = nm1Var;
        this.j = function7;
        this.k = function8;
        this.l = function9;
        this.m = di1Var;
        this.n = function10;
        this.o = di1Var2;
        this.p = zh1Var;
        this.q = di1Var3;
        this.r = function11;
        this.s = function12;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x024d A[Catch: Exception -> 0x0259, TryCatch #0 {Exception -> 0x0259, blocks: (B:68:0x0230, B:70:0x024d, B:74:0x025e, B:78:0x026f), top: B:84:0x0230 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x025e A[Catch: Exception -> 0x0259, TryCatch #0 {Exception -> 0x0259, blocks: (B:68:0x0230, B:70:0x024d, B:74:0x025e, B:78:0x026f), top: B:84:0x0230 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x026e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.media3.exoplayer.ExoPlayer] */
    /* JADX WARN: Type inference failed for: r12v6 */
    public final Object a(boolean z, Float f, boolean z2, long j, String str, boolean z3, ContinuationImpl continuationImpl) {
        rh1 rh1Var;
        Object r12;
        ExoPlayer exoPlayer;
        long jLongValue;
        MediaItem currentMediaItem;
        int i;
        boolean z4;
        String str2;
        MediaItem mediaItem;
        boolean z5;
        boolean z6;
        long j2;
        float f2;
        TrackSelectionParameters trackSelectionParameters;
        String str3;
        MediaItem mediaItem2;
        boolean z7;
        long j3;
        boolean z8;
        int i2;
        ExoPlayer exoPlayer2;
        String str4;
        boolean z9;
        ExoPlayer exoPlayer3;
        boolean z10;
        if (continuationImpl instanceof rh1) {
            rh1Var = (rh1) continuationImpl;
            int i3 = rh1Var.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rh1Var.p = i3 - Integer.MIN_VALUE;
            } else {
                rh1Var = new rh1(this, continuationImpl);
            }
        } else {
            rh1Var = new rh1(this, continuationImpl);
        }
        Object obj = rh1Var.n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = rh1Var.p;
        String str5 = "旧播放器已释放（播放器重建）";
        try {
            try {
                if (i4 == 0) {
                    continuationImpl = null;
                    ResultKt.throwOnFailure(obj);
                    if (z3) {
                        this.l.invoke("播放器重建");
                    }
                    exoPlayer = (ExoPlayer) this.a.invoke();
                    boolean zBooleanValue = ((Boolean) this.e.invoke()).booleanValue();
                    Long l = (Long) this.d.invoke();
                    Long lBoxLong = l != null ? Boxing.boxLong(RangesKt.coerceAtLeast(l.longValue(), 0L)) : null;
                    long jCoerceAtLeast = RangesKt.coerceAtLeast(exoPlayer.getCurrentPosition(), 0L);
                    if (zBooleanValue) {
                        jLongValue = RangesKt.coerceAtLeast(lBoxLong != null ? lBoxLong.longValue() : jCoerceAtLeast, 0L);
                    } else {
                        jLongValue = (lBoxLong != null && (jCoerceAtLeast <= 0 || Math.abs(jCoerceAtLeast - lBoxLong.longValue()) <= 1500)) ? lBoxLong.longValue() : jCoerceAtLeast;
                    }
                    this.f.invoke(Boxing.boxLong(jLongValue));
                    boolean playWhenReady = exoPlayer.getPlayWhenReady();
                    float fFloatValue = f != null ? f.floatValue() : exoPlayer.getPlaybackParameters().speed;
                    Function0 function0 = this.g;
                    MediaItem mediaItem3 = (z || (currentMediaItem = exoPlayer.getCurrentMediaItem()) == null) ? (MediaItem) function0.invoke() : currentMediaItem;
                    TrackSelectionParameters trackSelectionParameters2 = exoPlayer.getTrackSelectionParameters();
                    trackSelectionParameters2.getClass();
                    float f3 = fFloatValue;
                    int repeatMode = exoPlayer.getRepeatMode();
                    boolean shuffleModeEnabled = exoPlayer.getShuffleModeEnabled();
                    this.k.invoke();
                    MediaItem mediaItem4 = mediaItem3;
                    long jLongValue2 = lBoxLong != null ? lBoxLong.longValue() : -1L;
                    StringBuilder sbR = i02.r(jLongValue, "播放器重建续播位置: target=", "ms, resolved=");
                    sbR.append(jLongValue2);
                    id.m(sbR, "ms, player=", jCoerceAtLeast, "ms, hadPendingSeek=");
                    i9.r(sbR, zBooleanValue, ", wasPlaying=", playWhenReady, ", forceRefreshMediaItem=");
                    sbR.append(z);
                    sbR.append(", releaseOldPlayerBeforeCreate=");
                    sbR.append(z2);
                    Log.d("PlayerScreen", sbR.toString());
                    if (z2) {
                        exoPlayer.stop();
                        exoPlayer.release();
                        Log.d("PlayerScreen", "旧播放器已释放（播放器重建）");
                        if (j > 0) {
                            rh1Var.d = null;
                            str3 = str;
                            rh1Var.e = str3;
                            rh1Var.g = exoPlayer;
                            rh1Var.h = null;
                            mediaItem2 = mediaItem4;
                            rh1Var.i = mediaItem2;
                            rh1Var.j = trackSelectionParameters2;
                            rh1Var.a = z2;
                            rh1Var.k = jLongValue;
                            rh1Var.b = playWhenReady;
                            rh1Var.l = f3;
                            rh1Var.m = repeatMode;
                            rh1Var.c = shuffleModeEnabled;
                            rh1Var.p = 1;
                            if (DelayKt.delay(j, rh1Var) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            trackSelectionParameters = trackSelectionParameters2;
                            z7 = shuffleModeEnabled;
                            j3 = jLongValue;
                            f2 = f3;
                            z8 = playWhenReady;
                            z6 = z2;
                            i2 = repeatMode;
                        }
                        MediaItem mediaItem5 = mediaItem;
                        exoPlayer2 = exoPlayer;
                        str4 = str5;
                        boolean z11 = z4;
                        z9 = z6;
                        float f4 = f2;
                        long j4 = j2;
                        int i5 = i;
                        exoPlayer3 = (ExoPlayer) this.h.invoke(this.m.invoke(), str2, this.o.invoke(), this.p.invoke(), this.q.invoke(), this.r.invoke(), this.s.invoke());
                        exoPlayer3.setTrackSelectionParameters(trackSelectionParameters);
                        exoPlayer3.setRepeatMode(i5);
                        exoPlayer3.setShuffleModeEnabled(z11);
                        exoPlayer3.setMediaItem(mediaItem5);
                        exoPlayer3.prepare();
                        exoPlayer3.setPlaybackSpeed(f4);
                        this.i.invoke(exoPlayer3, Boxing.boxLong(j4));
                        if (!z9) {
                            exoPlayer2.stop();
                            exoPlayer2.release();
                            Log.d("PlayerScreen", str4);
                        }
                        if (z5 || !((Boolean) this.j.invoke()).booleanValue()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        exoPlayer3.setPlayWhenReady(z10);
                        this.b.invoke(exoPlayer3);
                        this.c.invoke(exoPlayer3);
                        return Unit.INSTANCE;
                    }
                    str5 = "旧播放器已释放（播放器重建）";
                    i = repeatMode;
                    z4 = shuffleModeEnabled;
                    str2 = str;
                    mediaItem = mediaItem4;
                    z5 = playWhenReady;
                    z6 = z2;
                    j2 = jLongValue;
                    f2 = f3;
                    trackSelectionParameters = trackSelectionParameters2;
                    MediaItem mediaItem6 = mediaItem;
                    exoPlayer2 = exoPlayer;
                    str4 = str5;
                    boolean z12 = z4;
                    z9 = z6;
                    float f5 = f2;
                    long j5 = j2;
                    int i6 = i;
                    exoPlayer3 = (ExoPlayer) this.h.invoke(this.m.invoke(), str2, this.o.invoke(), this.p.invoke(), this.q.invoke(), this.r.invoke(), this.s.invoke());
                    exoPlayer3.setTrackSelectionParameters(trackSelectionParameters);
                    exoPlayer3.setRepeatMode(i6);
                    exoPlayer3.setShuffleModeEnabled(z12);
                    exoPlayer3.setMediaItem(mediaItem6);
                    exoPlayer3.prepare();
                    exoPlayer3.setPlaybackSpeed(f5);
                    this.i.invoke(exoPlayer3, Boxing.boxLong(j5));
                    if (!z9) {
                        exoPlayer2.stop();
                        exoPlayer2.release();
                        Log.d("PlayerScreen", str4);
                    }
                    if (z5) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    exoPlayer3.setPlayWhenReady(z10);
                    this.b.invoke(exoPlayer3);
                    this.c.invoke(exoPlayer3);
                    return Unit.INSTANCE;
                }
                if (i4 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z7 = rh1Var.c;
                i2 = rh1Var.m;
                f2 = rh1Var.l;
                z8 = rh1Var.b;
                j3 = rh1Var.k;
                z6 = rh1Var.a;
                trackSelectionParameters = rh1Var.j;
                mediaItem2 = rh1Var.i;
                continuationImpl = null;
                exoPlayer = rh1Var.g;
                String str6 = rh1Var.e;
                ResultKt.throwOnFailure(obj);
                str3 = str6;
                exoPlayer3.setTrackSelectionParameters(trackSelectionParameters);
                exoPlayer3.setRepeatMode(i6);
                exoPlayer3.setShuffleModeEnabled(z12);
                exoPlayer3.setMediaItem(mediaItem6);
                exoPlayer3.prepare();
                exoPlayer3.setPlaybackSpeed(f5);
                this.i.invoke(exoPlayer3, Boxing.boxLong(j5));
                if (!z9) {
                    exoPlayer2.stop();
                    exoPlayer2.release();
                    Log.d("PlayerScreen", str4);
                }
                if (z5) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                exoPlayer3.setPlayWhenReady(z10);
                this.b.invoke(exoPlayer3);
                this.c.invoke(exoPlayer3);
                return Unit.INSTANCE;
            } catch (Exception e) {
                e = e;
                r12 = exoPlayer3;
                if (r12 != 0) {
                    r12.release();
                }
                throw e;
            }
            i = i2;
            j2 = j3;
            str2 = str3;
            z4 = z7;
            mediaItem = mediaItem2;
            z5 = z8;
            MediaItem mediaItem7 = mediaItem;
            exoPlayer2 = exoPlayer;
            str4 = str5;
            boolean z13 = z4;
            z9 = z6;
            float f6 = f2;
            long j6 = j2;
            int i7 = i;
            exoPlayer3 = (ExoPlayer) this.h.invoke(this.m.invoke(), str2, this.o.invoke(), this.p.invoke(), this.q.invoke(), this.r.invoke(), this.s.invoke());
        } catch (Exception e2) {
            e = e2;
            r12 = continuationImpl;
        }
    }
}
