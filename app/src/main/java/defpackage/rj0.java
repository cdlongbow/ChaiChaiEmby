package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class rj0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ CoroutineScope c;
    public final /* synthetic */ LazyListState d;

    public rj0(int i, MutableState mutableState, CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.a = i;
        this.b = mutableState;
        this.c = coroutineScope;
        this.d = lazyListState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue() && this.a == 0) {
            MutableState mutableState = this.b;
            if (!((Boolean) mutableState.getValue()).booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new mg(this.d, mutableState, null, 2), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
