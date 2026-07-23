package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fm1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ MutableState b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm1(MutableState mutableState, MutableState mutableState2) {
        super(0, Intrinsics.Kotlin.class, "togglePlayPause", "PlayerScreenContent$lambda$121$togglePlayPause(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = mutableState;
        this.b = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState mutableState = this.a;
        boolean playWhenReady = ((ExoPlayer) mutableState.getValue()).getPlayWhenReady();
        boolean z = !playWhenReady;
        if (!playWhenReady) {
            this.b.setValue(Boolean.FALSE);
        }
        ((ExoPlayer) mutableState.getValue()).setPlayWhenReady(z);
        return Unit.INSTANCE;
    }
}
