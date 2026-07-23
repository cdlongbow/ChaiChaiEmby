package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class u10 {
    public final Channel a = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    public final Object b = new Object();
    public boolean c;
    public boolean d;
    public int e;

    public final void a() {
        synchronized (this.b) {
            this.e++;
        }
    }

    public final void b() {
        synchronized (this.b) {
            this.c = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void c(Function0 function0) {
        synchronized (this.b) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i <= 0 || this.c) {
                    if (!this.d) {
                        SendChannel.DefaultImpls.close$default(this.a, null, 1, null);
                        function0.invoke();
                        this.d = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
