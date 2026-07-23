package defpackage;

import android.os.Handler;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ba1 {
    public static final void a(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Handler handler, Ref.ObjectRef objectRef2, ExoPlayer exoPlayer, Ref.ObjectRef objectRef3) {
        Player.Listener listener;
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        Runnable runnable = (Runnable) objectRef.element;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        Runnable runnable2 = (Runnable) objectRef2.element;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
        T t = objectRef3.element;
        if (t == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
            listener = null;
        } else {
            listener = (Player.Listener) t;
        }
        exoPlayer.removeListener(listener);
    }
}
