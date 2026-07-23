package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bk1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ mx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk1(mx mxVar) {
        super(0, Intrinsics.Kotlin.class, "handleDanmakuSearch", "PlayerScreenContent$lambda$121$handleDanmakuSearch(Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlayerInteractionHandler;)V", 0);
        this.a = mxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mx mxVar = this.a;
        kx kxVar = mxVar.b;
        MutableState mutableState = kxVar.f;
        Boolean bool = Boolean.TRUE;
        mutableState.setValue(bool);
        kxVar.d.setValue(bool);
        mxVar.k.invoke();
        return Unit.INSTANCE;
    }
}
