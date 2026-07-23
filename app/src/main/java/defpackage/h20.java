package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusState;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h20(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj2;
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                if (focusState.isFocused()) {
                    m20.c(i2, mutableState);
                }
                return Unit.INSTANCE;
            case 1:
                return ImeEditCommand_androidKt.commitText$lambda$0((String) obj2, i2, (TextFieldBuffer) obj);
            case 2:
                return LazyGridState.prefetchState$lambda$0((LazyGridState) obj2, i2, (NestedPrefetchScope) obj);
            case 3:
                return LazyListState.prefetchState$lambda$0((LazyListState) obj2, i2, (NestedPrefetchScope) obj);
            default:
                return Boolean.valueOf(SnapshotStateList.addAll$lambda$0(i2, (Collection) obj2, (List) obj));
        }
    }

    public /* synthetic */ h20(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
