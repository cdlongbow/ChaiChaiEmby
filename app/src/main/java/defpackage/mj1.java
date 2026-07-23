package defpackage;

import androidx.compose.runtime.State;
import com.dh.myembyapp.data.DanmakuSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mj1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ mx a;
    public final /* synthetic */ State b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj1(mx mxVar, State state) {
        super(0, Intrinsics.Kotlin.class, "dismissDanmakuSettingsDialog", "PlayerScreenContent$lambda$121$dismissDanmakuSettingsDialog(Lcom/dh/myembyapp/ui/screens/player/danmaku/DanmakuPlayerInteractionHandler;Landroidx/compose/runtime/State;)V", 0);
        this.a = mxVar;
        this.b = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DanmakuSettings danmakuSettings = (DanmakuSettings) this.b.getValue();
        danmakuSettings.getClass();
        mx mxVar = this.a;
        mxVar.h.invoke(Integer.valueOf(danmakuSettings.getTimeOffsetSec()));
        mxVar.b.e.setValue(Boolean.FALSE);
        mxVar.f.invoke(Boolean.TRUE);
        mxVar.g.invoke();
        mxVar.j.invoke(Long.valueOf(System.currentTimeMillis()));
        return Unit.INSTANCE;
    }
}
