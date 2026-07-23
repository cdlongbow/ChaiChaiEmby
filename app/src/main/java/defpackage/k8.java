package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class k8 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public k8(int i, MutableState mutableState, MutableState mutableState2) {
        this.c = mutableState;
        this.b = i;
        this.d = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue() && i2 == 0) {
                    BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj3, null, null, new e7((LazyListState) obj2, 1, null), 3, null);
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                MutableState mutableState = (MutableState) obj3;
                List mutableList = CollectionsKt.toMutableList((Collection) mutableState.getValue());
                mutableList.set(i2, str);
                mutableState.setValue(mutableList);
                ((MutableState) obj2).setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }

    public k8(LazyListState lazyListState, CoroutineScope coroutineScope, int i) {
        this.b = i;
        this.c = coroutineScope;
        this.d = lazyListState;
    }
}
