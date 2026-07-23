package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.model.DanmakuConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ek1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ mx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek1(mx mxVar) {
        super(1, Intrinsics.Kotlin.class, "handleToggleAutoMatch", "PlayerScreenContent$lambda$121$handleToggleAutoMatch(Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlayerInteractionHandler;Z)V", 0);
        this.a = mxVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Log.d("DanmakuPlayer", "切换自动匹配: " + zBooleanValue);
        mx mxVar = this.a;
        kx kxVar = mxVar.b;
        DanmakuConfig danmakuConfigCopy$default = DanmakuConfig.copy$default(kxVar.b(), false, null, null, null, null, zBooleanValue, 31, null);
        danmakuConfigCopy$default.getClass();
        kxVar.a.setValue(danmakuConfigCopy$default);
        mxVar.c.saveDanmakuConfig(kxVar.b());
        Log.d("DanmakuPlayer", "自动匹配状态已保存到配置");
        mxVar.k.invoke();
        return Unit.INSTANCE;
    }
}
