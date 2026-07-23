package defpackage;

import com.dh.myembyapp.data.DanmakuSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nj1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ mx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj1(mx mxVar) {
        super(1, Intrinsics.Kotlin.class, "handleDanmakuSettingsChange", "PlayerScreenContent$lambda$121$handleDanmakuSettingsChange(Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlayerInteractionHandler;Lcom/dh/myembyapp/data/DanmakuSettings;)V", 0);
        this.a = mxVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DanmakuSettings danmakuSettings = (DanmakuSettings) obj;
        danmakuSettings.getClass();
        mx mxVar = this.a;
        mxVar.h.invoke(Integer.valueOf(danmakuSettings.getTimeOffsetSec()));
        BuildersKt__Builders_commonKt.launch$default(mxVar.a, null, null, new n2(mxVar, danmakuSettings, null, 1), 3, null);
        mxVar.j.invoke(Long.valueOf(System.currentTimeMillis()));
        return Unit.INSTANCE;
    }
}
