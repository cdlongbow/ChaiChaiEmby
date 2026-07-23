package defpackage;

import androidx.compose.runtime.MutableState;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class uz implements Function1 {
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ int b;

    public uz(int i, MutableState mutableState) {
        this.a = mutableState;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        MutableState mutableState = this.a;
        List mutableList = CollectionsKt.toMutableList((Collection) mutableState.getValue());
        mutableList.set(this.b, str);
        mutableState.setValue(mutableList);
        return Unit.INSTANCE;
    }
}
