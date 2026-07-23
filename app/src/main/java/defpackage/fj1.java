package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.media3.ui.CaptionStyleCompat;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fj1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Typeface b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ on1 d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ State m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ CoroutineScope t;
    public final /* synthetic */ UserPreferences u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ sh1 w;
    public final /* synthetic */ og1 x;
    public final /* synthetic */ MutableState y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj1(boolean z, Typeface typeface, MutableState mutableState, on1 on1Var, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, State state, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, CoroutineScope coroutineScope, UserPreferences userPreferences, MutableState mutableState15, sh1 sh1Var, og1 og1Var, MutableState mutableState16) {
        super(1, Intrinsics.Kotlin.class, "createEmbeddedPlayerView", "PlayerScreenContent$lambda$121$createEmbeddedPlayerView(ZLandroid/graphics/Typeface;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lcom/dh/myembyapp/data/preferences/UserPreferences;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerRebuildController;Lcom/dh/myembyapp/ui/screens/player/PlayerDecoderState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;)Landroidx/media3/ui/PlayerView;", 0);
        this.a = z;
        this.b = typeface;
        this.c = mutableState;
        this.d = on1Var;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
        this.i = mutableState5;
        this.j = mutableState6;
        this.k = mutableState7;
        this.l = mutableState8;
        this.m = state;
        this.n = mutableState9;
        this.o = mutableState10;
        this.p = mutableState11;
        this.q = mutableState12;
        this.r = mutableState13;
        this.s = mutableState14;
        this.t = coroutineScope;
        this.u = userPreferences;
        this.v = mutableState15;
        this.w = sh1Var;
        this.x = og1Var;
        this.y = mutableState16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PlayerView playerView;
        Context context = (Context) obj;
        context.getClass();
        boolean z = this.a;
        Typeface typeface = this.b;
        MutableState mutableState = this.c;
        on1 on1Var = this.d;
        MutableState mutableState2 = this.e;
        MutableState mutableState3 = this.g;
        MutableState mutableState4 = this.h;
        MutableState mutableState5 = this.i;
        MutableState mutableState6 = this.j;
        MutableState mutableState7 = this.k;
        MutableState mutableState8 = this.l;
        uo1 uo1VarB0 = dn1.b0(z, typeface, mutableState, on1Var, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
        if (uo1VarB0.b) {
            View viewInflate = LayoutInflater.from(context).inflate(as1.player_view_texture, (ViewGroup) null, false);
            viewInflate.getClass();
            playerView = (PlayerView) viewInflate;
        } else {
            playerView = new PlayerView(context);
        }
        playerView.setPlayer(uo1VarB0.a);
        playerView.setKeepScreenOn(true);
        playerView.setResizeMode(uo1VarB0.c.getMedia3ResizeMode());
        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playerView.setUseController(false);
        playerView.setBackgroundColor(-16777216);
        playerView.setShutterBackgroundColor(-16777216);
        SubtitleView subtitleView = playerView.getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setStyle(new CaptionStyleCompat(-1, 0, 0, 1, -16777216, in1.o(uo1VarB0.f, uo1VarB0.g, uo1VarB0.h, uo1VarB0.i, uo1VarB0.j, uo1VarB0.k)));
            subtitleView.setFractionalTextSize(0.054f);
            try {
                in1.t(subtitleView, uo1VarB0.k);
                return playerView;
            } catch (Exception e) {
                dn1.f0(this.t, this.u, this.v, mutableState4, mutableState8, this.w, this.x, this.y, "挂载 ASS 字幕增强 overlay 失败，准备自动回退", e, "ASS 增强渲染出现错误，已自动回退为默认渲染");
                Unit unit = Unit.INSTANCE;
            }
        }
        return playerView;
    }
}
