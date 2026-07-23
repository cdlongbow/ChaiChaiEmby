package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.State;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class zg1 implements DisposableEffectResult {
    public final /* synthetic */ State a;
    public final /* synthetic */ State b;
    public final /* synthetic */ State c;
    public final /* synthetic */ State d;

    public zg1(State state, State state2, State state3, State state4) {
        this.a = state;
        this.b = state2;
        this.c = state3;
        this.d = state4;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        Log.d("PlayerScreen", "组件销毁，释放播放器");
        ExoPlayer exoPlayer = (ExoPlayer) ((Function0) this.a.getValue()).invoke();
        if (exoPlayer != null) {
            exoPlayer.release();
        }
        ((Function0) this.b.getValue()).invoke();
        ((Function0) this.c.getValue()).invoke();
        State state = this.d;
        tl0.h((Context) state.getValue());
        Regex regex = de.a;
        de.b((Context) state.getValue());
        Log.d("PlayerScreen", "已清理临时字幕文件");
    }
}
