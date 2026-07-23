package defpackage;

import android.view.autofill.AutofillId;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.Fragment;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

import java.io.EOFException;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ra implements Arrangement.SpacingAlignmentCalculator, DefaultAudioSink.AudioOffloadSupportProvider, ListenerSet.Event, GlShaderProgram.ErrorListener {
    public final /* synthetic */ int a;

    public /* synthetic */ ra(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ AutofillId c(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher d(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void e() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void f(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void h(Fragment fragment, String str) {
        throw new IllegalStateException(str + ((Object) fragment.toString()) + ((Object) " is already attached to a FragmentManager."));
    }

    public static /* synthetic */ void i(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void j(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void k(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void l(String str, Object obj) {
        throw new NumberFormatException(str + obj);
    }

    public static /* synthetic */ void m(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void n(Throwable th) throws VideoFrameProcessingException {
        throw new VideoFrameProcessingException(th);
    }

    public static /* synthetic */ void o() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void p(String str) {
        throw new GdxRuntimeException(str);
    }

    public static /* synthetic */ void q(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
    public int align(int i, LayoutDirection layoutDirection) {
        return Arrangement.spacedBy_0680j_4$lambda$0(i, layoutDirection);
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider
    public AudioOffloadSupport getAudioOffloadSupport(Format format, AudioAttributes audioAttributes) {
        format.getClass();
        audioAttributes.getClass();
        return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 12:
                ((AudioOutput.Listener) obj).onUnderrun();
                break;
            case 13:
                ((AudioOutput.Listener) obj).onReleased();
                break;
            case 14:
                ((AudioOutput.Listener) obj).onOffloadDataRequest();
                break;
            case 15:
                ((AudioOutput.Listener) obj).onOffloadPresentationEnded();
                break;
            default:
                ((AudioOutputProvider.Listener) obj).onFormatSupportChanged();
                break;
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        Log.e(BaseGlShaderProgram.TAG, "Exception caught by default BaseGlShaderProgram errorListener.", videoFrameProcessingException);
    }
}
