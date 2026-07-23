package defpackage;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Job.DefaultImpls.cancel$default((Job) obj, (CancellationException) null, 1, (Object) null);
                break;
            case 1:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$0((TransformedTextFieldState) obj);
                break;
            default:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1((TextFieldSelectionManager) obj);
                break;
        }
    }
}
