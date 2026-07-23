package defpackage;

import android.content.res.AssetFileDescriptor;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j11 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Closeable b;

    public /* synthetic */ j11(Closeable closeable, int i) {
        this.a = i;
        this.b = closeable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Closeable closeable = this.b;
        switch (i) {
            case 0:
                return m11.d((ByteArrayInputStream) closeable, null);
            default:
                return (AssetFileDescriptor) closeable;
        }
    }
}
