package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dk1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ mx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk1(mx mxVar) {
        super(0, Intrinsics.Kotlin.class, "handleDanmakuSettings", "PlayerScreenContent$lambda$121$handleDanmakuSettings(Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlayerInteractionHandler;)V", 0);
        this.a = mxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mx mxVar = this.a;
        mxVar.b.e.setValue(Boolean.TRUE);
        mxVar.k.invoke();
        return Unit.INSTANCE;
    }
}
