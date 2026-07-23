package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class bm0 implements Callable {
    public final /* synthetic */ e a;

    public bm0(e eVar) {
        this.a = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.run();
        return null;
    }
}
