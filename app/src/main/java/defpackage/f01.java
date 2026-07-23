package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public interface f01 extends Future {
    void addListener(Runnable runnable, Executor executor);
}
