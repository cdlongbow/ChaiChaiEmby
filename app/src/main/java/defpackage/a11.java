package defpackage;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a11 implements b21 {
    @Override // defpackage.b21
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        a11 a11Var = LottieAnimationView.o;
        Matrix matrix = wd2.a;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            r01.c("Unable to load composition.", th);
        } else {
            rd1.q("Unable to parse composition", th);
        }
    }
}
