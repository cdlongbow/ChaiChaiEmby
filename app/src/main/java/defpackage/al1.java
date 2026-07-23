package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class al1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ to1 b;
    public final /* synthetic */ ln1 c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ ih1 g;
    public final /* synthetic */ ih1 h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al1(String str, to1 to1Var, ln1 ln1Var, MutableState mutableState, MutableState mutableState2, ih1 ih1Var, ih1 ih1Var2, MutableState mutableState3) {
        super(1, Intrinsics.Kotlin.class, "handleEpisodeSelect", "PlayerScreenContent$lambda$121$handleEpisodeSelect(Ljava/lang/String;Lcom/dh/myembyapp/ui/screens/player/PlayerViewModel;Lcom/dh/myembyapp/ui/screens/player/PlayerSeekController;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Lcom/dh/myembyapp/ui/screens/player/PlayerMenuState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", 0);
        this.a = str;
        this.b = to1Var;
        this.c = ln1Var;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = ih1Var;
        this.h = ih1Var2;
        this.i = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        long jN0 = dn1.n0(this.c);
        to1 to1Var = this.b;
        wi1 wi1Var = new wi1(2, to1Var, to1.class, "stopPlayback", "stopPlayback(Ljava/lang/String;JZ)V", 0, 1);
        ml1 ml1Var = new ml1(this.i);
        vi1 vi1Var = new vi1(1, to1Var, to1.class, "loadMediaItem", "loadMediaItem(Ljava/lang/String;ZLjava/lang/String;Lcom/dh/myembyapp/data/model/TranscodeQualityOption;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;ZZ)V", 0);
        StringBuilder sb = new StringBuilder("切换剧集: 从 ");
        String str2 = this.a;
        sb.append(str2);
        sb.append(" (位置: ");
        sb.append(jN0);
        sb.append("ms) 切换到 ");
        sb.append(str);
        Log.d("PlayerScreen", sb.toString());
        this.d.setValue(Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        wi1Var.invoke(str2, Long.valueOf(jN0));
        this.e.setValue(str);
        this.g.d.setValue(nv.a);
        this.h.a.setValue(Boolean.TRUE);
        ml1Var.invoke();
        vi1Var.invoke(str);
        return Unit.INSTANCE;
    }
}
