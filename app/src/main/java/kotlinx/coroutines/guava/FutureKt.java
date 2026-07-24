package kotlinx.coroutines.guava;

import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.coroutines.Deferred;

public class FutureKt {
    public static <T> ListenableFuture<T> asListenableFuture(Deferred<T> deferred) {
        return null;
    }
    public static <T> Deferred<T> asDeferred(ListenableFuture<T> future) {
        return null;
    }
}
