package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ln1 {
    public final nn1 a;
    public final CoroutineScope b;
    public final ExoPlayer c;
    public final om1 d;
    public final Function0 e;

    public ln1(nn1 nn1Var, CoroutineScope coroutineScope, ExoPlayer exoPlayer, om1 om1Var, Function0 function0) {
        nn1Var.getClass();
        exoPlayer.getClass();
        function0.getClass();
        this.a = nn1Var;
        this.b = coroutineScope;
        this.c = exoPlayer;
        this.d = om1Var;
        this.e = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(long j) {
        long jMax = Math.max(((Number) this.a.f.getValue()).longValue(), RangesKt.coerceAtLeast(this.c.getDuration(), 0L));
        return jMax <= 0 ? RangesKt.coerceAtLeast(j, 0L) : RangesKt.coerceIn(j, 0L, RangesKt.coerceAtLeast(jMax - 1, 0L));
    }

    public final long b() {
        nn1 nn1Var = this.a;
        Long lB = nn1Var.b();
        return lB != null ? lB.longValue() : Math.max(nn1Var.a(), RangesKt.coerceAtLeast(this.c.getCurrentPosition(), 0L));
    }
}
