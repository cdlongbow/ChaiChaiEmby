package defpackage;

import com.dh.myembyapp.MyEmbyApp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ l1(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                int i2 = MyEmbyApp.j;
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
