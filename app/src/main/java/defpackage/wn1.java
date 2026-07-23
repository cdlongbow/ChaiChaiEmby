package defpackage;

import android.graphics.Typeface;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.CaptionStyleCompat;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class wn1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ PlayerView b;
    public final /* synthetic */ Typeface c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ md h;
    public final /* synthetic */ SubtitlePreferences.SubtitleColor i;
    public final /* synthetic */ ExoPlayer j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn1(boolean z, PlayerView playerView, Typeface typeface, boolean z2, boolean z3, boolean z4, md mdVar, SubtitlePreferences.SubtitleColor subtitleColor, ExoPlayer exoPlayer, Continuation continuation) {
        super(2, continuation);
        this.a = z;
        this.b = playerView;
        this.c = typeface;
        this.d = z2;
        this.e = z3;
        this.g = z4;
        this.h = mdVar;
        this.i = subtitleColor;
        this.j = exoPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new wn1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wn1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SubtitleView subtitleView;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a) {
            return Unit.INSTANCE;
        }
        PlayerView playerView = this.b;
        if (playerView == null || (subtitleView = playerView.getSubtitleView()) == null) {
            return Unit.INSTANCE;
        }
        Typeface typefaceO = in1.o(this.c, this.d, this.e, this.a, this.g, this.h);
        subtitleView.setStyle(new CaptionStyleCompat(this.e ? -1 : this.i.getColorValue(), 0, 0, 1, -16777216, typefaceO));
        at0 at0Var = this.j.getCurrentCues().cues;
        at0Var.getClass();
        subtitleView.setCues(in1.b(at0Var, typefaceO));
        return Unit.INSTANCE;
    }
}
