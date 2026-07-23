package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.Renderer;
import com.dh.myembyapp.data.IntroOutroMemory;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tk1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ eo1 a;
    public final /* synthetic */ IntroOutroMemory b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ zu0 d;
    public final /* synthetic */ zu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk1(eo1 eo1Var, IntroOutroMemory introOutroMemory, MutableState mutableState, zu0 zu0Var, zu0 zu0Var2) {
        super(0, Intrinsics.Kotlin.class, "handleMarkOutro", "PlayerScreenContent$lambda$121$handleMarkOutro(Lcom/dh/myembyapp/ui/screens/player/PlayerUiState;Lcom/dh/myembyapp/data/IntroOutroMemory;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/introoutro/IntroOutroPlaybackState;Lcom/dh/myembyapp/ui/screens/player/introoutro/IntroOutroPlaybackState;)V", 0);
        this.a = eo1Var;
        this.b = introOutroMemory;
        this.c = mutableState;
        this.d = zu0Var;
        this.e = zu0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Long lValueOf;
        MutableState mutableState = this.e.f;
        MediaItem mediaItem = this.a.a;
        String seasonId = mediaItem.getSeasonId();
        if (seasonId == null) {
            seasonId = mediaItem.getParentId();
        }
        MutableState mutableState2 = this.c;
        long currentPosition = ((ExoPlayer) mutableState2.getValue()).getCurrentPosition();
        long duration = ((ExoPlayer) mutableState2.getValue()).getDuration();
        Long lValueOf2 = Long.valueOf(duration);
        Long lValueOf3 = null;
        if (duration <= 0) {
            lValueOf2 = null;
        }
        Long runTimeTicks = mediaItem.getRunTimeTicks();
        Long l = (Long) this.d.e.getValue();
        Long l2 = (Long) mutableState.getValue();
        IntroOutroMemory introOutroMemory = this.b;
        introOutroMemory.getClass();
        if (seasonId != null) {
            if (l2 == null) {
                if (lValueOf2 != null) {
                    lValueOf = lValueOf2.longValue() > 0 ? lValueOf2 : null;
                    if (lValueOf == null) {
                        if (runTimeTicks != null) {
                            lValueOf = Long.valueOf(runTimeTicks.longValue() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                        } else {
                            lValueOf = null;
                        }
                    }
                } else if (runTimeTicks != null) {
                    lValueOf = Long.valueOf(runTimeTicks.longValue() / Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                } else {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    if (lValueOf.longValue() <= 0) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        lValueOf3 = Long.valueOf(RangesKt.coerceAtLeast(lValueOf.longValue() - currentPosition, 0L));
                    }
                }
            }
            Log.e("IntroOutro", "标记片尾保存: currentPos=" + currentPosition + "ms, duration=" + lValueOf2 + "ms, runTimeTicks=" + runTimeTicks + ", newOutro=" + lValueOf3 + "ms");
            introOutroMemory.saveSeasonIntroOutro(seasonId, l, lValueOf3);
            mutableState.setValue(lValueOf3);
            Unit unit = Unit.INSTANCE;
            StringBuilder sb = new StringBuilder("标记片尾: ");
            sb.append(lValueOf3);
            Log.d("IntroOutro", sb.toString());
        }
        return Unit.INSTANCE;
    }
}
