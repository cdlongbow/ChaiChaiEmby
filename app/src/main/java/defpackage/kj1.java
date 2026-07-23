package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kj1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ mx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(mx mxVar) {
        super(0, Intrinsics.Kotlin.class, "dismissDanmakuSearchDialog", "PlayerScreenContent$lambda$121$dismissDanmakuSearchDialog(Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlayerInteractionHandler;)V", 0);
        this.a = mxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mx mxVar = this.a;
        kx kxVar = mxVar.b;
        MutableState mutableState = kxVar.d;
        Boolean bool = Boolean.FALSE;
        mutableState.setValue(bool);
        mxVar.f.invoke(Boolean.TRUE);
        MutableState mutableState2 = kxVar.f;
        if (((Boolean) mutableState2.getValue()).booleanValue()) {
            mxVar.g.invoke();
        }
        mutableState2.setValue(bool);
        mxVar.j.invoke(Long.valueOf(System.currentTimeMillis()));
        return Unit.INSTANCE;
    }
}
