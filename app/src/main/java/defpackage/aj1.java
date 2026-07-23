package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aj1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ ln1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj1(ln1 ln1Var) {
        super(0, Intrinsics.Kotlin.class, "resolvePlaybackPositionForBackgroundPause", "PlayerScreenContent$lambda$121$resolvePlaybackPositionForBackgroundPause(Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;)J", 0);
        this.a = ln1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jCoerceAtLeast;
        ln1 ln1Var = this.a;
        ExoPlayer exoPlayer = ln1Var.c;
        nn1 nn1Var = ln1Var.a;
        Long lB = nn1Var.b();
        if (lB == null) {
            jCoerceAtLeast = RangesKt.coerceAtLeast(exoPlayer.getCurrentPosition(), 0L);
        } else {
            long jA = ln1Var.a(lB.longValue());
            Job job = (Job) nn1Var.h.getValue();
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            nn1Var.h.setValue(null);
            nn1Var.g.setValue(null);
            ln1Var.d.invoke(exoPlayer, Long.valueOf(jA));
            nn1Var.c(jA);
            jCoerceAtLeast = jA;
        }
        return Long.valueOf(jCoerceAtLeast);
    }
}
