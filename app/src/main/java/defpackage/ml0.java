package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ml0 implements CoroutineContext {
    public final CoroutineContext a;

    public ml0(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public final boolean equals(Object obj) {
        return Intrinsics.areEqual(this.a, obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.a.get(key);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        CoroutineContext coroutineContextMinusKey = this.a.minusKey(key);
        int i = be2.b;
        CoroutineDispatcher.Companion companion = CoroutineDispatcher.INSTANCE;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(companion);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) coroutineContextMinusKey.get(companion);
        if ((coroutineDispatcher instanceof k40) && !Intrinsics.areEqual(coroutineDispatcher, coroutineDispatcher2)) {
            ((k40) coroutineDispatcher).b = 0;
        }
        return new j40(coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextPlus = this.a.plus(coroutineContext);
        int i = be2.b;
        CoroutineDispatcher.Companion companion = CoroutineDispatcher.INSTANCE;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(companion);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) coroutineContextPlus.get(companion);
        if ((coroutineDispatcher instanceof k40) && !Intrinsics.areEqual(coroutineDispatcher, coroutineDispatcher2)) {
            ((k40) coroutineDispatcher).b = 0;
        }
        return new j40(coroutineContextPlus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.a + ")";
    }
}
