package defpackage;

import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.window.area.WindowAreaControllerImpl;
import androidx.window.area.WindowAreaPresentationSessionCallback;
import androidx.window.area.WindowAreaSessionCallback;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x62 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                TextInputServiceAndroid.sendInputCommand$lambda$0((TextInputServiceAndroid) obj);
                break;
            case 1:
                WindowAreaControllerImpl.presentContentOnWindowArea$lambda$2((WindowAreaPresentationSessionCallback) obj);
                break;
            case 2:
                WindowAreaControllerImpl.transferActivityToWindowArea$lambda$1((WindowAreaSessionCallback) obj);
                break;
            default:
                WindowAreaControllerImpl.RearDisplaySessionConsumer.onSessionFinished$lambda$2((WindowAreaControllerImpl.RearDisplaySessionConsumer) obj);
                break;
        }
    }
}
