package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ State h;
    public final /* synthetic */ State i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ qz(MutableIntState mutableIntState, MutableState mutableState, State state, State state2, State state3, State state4, State state5, Player player, DanmakuPlayer danmakuPlayer) {
        this.a = 1;
        this.c = player;
        this.d = state;
        this.b = mutableState;
        this.e = mutableIntState;
        this.g = danmakuPlayer;
        this.h = state2;
        this.i = state3;
        this.j = state4;
        this.k = state5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.g;
        Object obj5 = this.b;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                u61 u61Var = (u61) obj7;
                MutableState mutableState = (MutableState) this.h;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                d.a(lazyListScope, null, null, zs.a, 3, null);
                d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(163617396, true, new n1((FocusRequester) obj8, u61Var, (c00) obj6, (MutableState) obj5, (MutableState) obj4)), 3, null);
                d.a(lazyListScope, null, null, zs.b, 3, null);
                List list = (List) mutableState.getValue();
                lazyListScope.items(list.size(), null, new x5(list, 9), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new a00(list, u61Var, (MutableState) this.i, (MutableState) obj3, mutableState, (MutableState) obj2)));
                return Unit.INSTANCE;
            case 1:
                Player player = (Player) obj8;
                ((DisposableEffectScope) obj).getClass();
                j00 j00Var = new j00((MutableIntState) obj6, (MutableState) obj5, (State) obj7, this.h, this.i, (State) obj3, (State) obj2, player, (DanmakuPlayer) obj4);
                player.addListener(j00Var);
                return new r6(i2, player, j00Var);
            default:
                ExoPlayer exoPlayer = (ExoPlayer) obj8;
                State state = (State) obj7;
                ((DisposableEffectScope) obj).getClass();
                eh1 eh1Var = new eh1((State) obj6, state, exoPlayer, (String) obj5, (DefaultBandwidthMeter) obj4, this.h, this.i, (Context) obj3, (CoroutineScope) obj2);
                exoPlayer.addListener(eh1Var);
                Log.d("PlayerScreen", "添加播放器监听器，当前状态: " + exoPlayer.getPlaybackState());
                ((ch1) state.getValue()).h.invoke(Integer.valueOf(exoPlayer.getPlaybackState()));
                return new r6(4, exoPlayer, eh1Var);
        }
    }

    public /* synthetic */ qz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, State state, State state2, Object obj6, Object obj7, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
        this.g = obj5;
        this.h = state;
        this.i = state2;
        this.j = obj6;
        this.k = obj7;
    }
}
