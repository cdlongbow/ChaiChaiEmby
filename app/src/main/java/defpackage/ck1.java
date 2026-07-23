package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ck1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ mx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck1(mx mxVar) {
        super(0, Intrinsics.Kotlin.class, "handleDanmakuToggle", "PlayerScreenContent$lambda$121$handleDanmakuToggle(Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlayerInteractionHandler;)V", 0);
        this.a = mxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mx mxVar = this.a;
        kx kxVar = mxVar.b;
        boolean z = !kxVar.c();
        Log.d("DanmakuPlayer", "弹幕显示状态切换: " + kxVar.c() + " -> " + z);
        kxVar.g.setValue(Boolean.valueOf(z));
        mxVar.c.saveDanmakuVisible(z);
        Log.d("DanmakuPlayer", "弹幕显示状态已保存: " + z);
        mxVar.k.invoke();
        return Unit.INSTANCE;
    }
}
