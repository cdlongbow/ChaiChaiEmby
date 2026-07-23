package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Shadow;
import com.dh.myembyapp.data.model.EpisodeLocator;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class m80 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MediaItem a;
    public final /* synthetic */ EpisodeLocator b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ Function3 e;
    public final /* synthetic */ MutableState g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(MediaItem mediaItem, EpisodeLocator episodeLocator, boolean z, MutableState mutableState, Function3 function3, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.a = mediaItem;
        this.b = episodeLocator;
        this.c = z;
        this.d = mutableState;
        this.e = function3;
        this.g = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m80(this.a, this.b, this.c, this.d, this.e, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MediaItem mediaItem = this.a;
        boolean zAreEqual = Intrinsics.areEqual(mediaItem.getType(), "Series");
        EpisodeLocator episodeLocator = this.b;
        boolean z = (zAreEqual && episodeLocator == null) ? false : true;
        if (this.c) {
            Shadow shadow = u90.o;
            if (!((Boolean) this.d.getValue()).booleanValue() && z) {
                u90.A(mediaItem, this.e, this.g, episodeLocator, false);
            }
        }
        return Unit.INSTANCE;
    }
}
