package defpackage;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;

/* JADX INFO: loaded from: classes4.dex */
public final class xn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Call) obj2).cancel();
                return Unit.INSTANCE;
            default:
                KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
                keyEventM6229unboximpl.getClass();
                int keyCode = keyEventM6229unboximpl.getKeyCode();
                if (keyCode == 82 || keyCode == 165 || keyCode == 256 || keyCode == 226) {
                    z = true;
                    if (keyEventM6229unboximpl.getAction() == 1) {
                        ((Function0) obj2).invoke();
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
