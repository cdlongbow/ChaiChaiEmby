package defpackage;

import androidx.media3.common.text.CueGroup;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class vn1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PlayerView a;
    public final /* synthetic */ CueGroup b;
    public final /* synthetic */ pl c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Function1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(PlayerView playerView, CueGroup cueGroup, pl plVar, boolean z, boolean z2, int i, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.a = playerView;
        this.b = cueGroup;
        this.c = plVar;
        this.d = z;
        this.e = z2;
        this.g = i;
        this.h = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vn1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vn1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SubtitleView subtitleView;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        pl plVar = this.c;
        plVar.getClass();
        Function1 function1 = this.h;
        function1.getClass();
        if (this.d) {
            plVar.a.evictAll();
            CueGroup cueGroup = this.b;
            if (cueGroup != null) {
                PlayerView playerView = this.a;
                if (!this.e) {
                    if (playerView != null && (subtitleView = playerView.getSubtitleView()) != null) {
                        subtitleView.setCues(cueGroup.cues);
                    }
                    function1.invoke(Boolean.FALSE);
                } else if (plVar.a(playerView, cueGroup, this.g)) {
                    function1.invoke(Boolean.FALSE);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
