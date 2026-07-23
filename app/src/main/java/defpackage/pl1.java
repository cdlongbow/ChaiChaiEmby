package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pl1 extends FunctionReferenceImpl implements Function2 {
    public final /* synthetic */ AtomicLong a;
    public final /* synthetic */ on1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl1(AtomicLong atomicLong, on1 on1Var) {
        super(2, Intrinsics.Kotlin.class, "seekPlayerTo", "PlayerScreenContent$lambda$121$seekPlayerTo(Ljava/util/concurrent/atomic/AtomicLong;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;Landroidx/media3/exoplayer/ExoPlayer;J)V", 0);
        this.a = atomicLong;
        this.b = on1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ExoPlayer exoPlayer = (ExoPlayer) obj;
        long jLongValue = ((Number) obj2).longValue();
        exoPlayer.getClass();
        dn1.I0(this.a, this.b, exoPlayer, jLongValue);
        return Unit.INSTANCE;
    }
}
