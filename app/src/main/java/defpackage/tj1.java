package defpackage;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tj1 extends FunctionReferenceImpl implements Function2 {
    public final /* synthetic */ MutableIntState a;
    public final /* synthetic */ MutableState b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj1(MutableIntState mutableIntState, MutableState mutableState) {
        super(2, Intrinsics.Kotlin.class, "isPlaybackSpeedCompatibilityRequestCurrent", "PlayerScreenContent$lambda$121$isPlaybackSpeedCompatibilityRequestCurrent(Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;ILandroidx/media3/exoplayer/ExoPlayer;)Z", 0);
        this.a = mutableIntState;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ExoPlayer exoPlayer = (ExoPlayer) obj2;
        return Boolean.valueOf(this.a.getIntValue() == ((Number) obj).intValue() && (exoPlayer == null || ((ExoPlayer) this.b.getValue()) == exoPlayer));
    }
}
