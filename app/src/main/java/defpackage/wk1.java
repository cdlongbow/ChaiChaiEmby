package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wk1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        super(0, Intrinsics.Kotlin.class, "handleTogglePlayPause", "PlayerScreenContent$lambda$121$handleTogglePlayPause(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = mutableState;
        this.b = mutableState2;
        this.c = mutableState3;
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
        dn1.h0(this.c);
        return Unit.INSTANCE;
    }
}
