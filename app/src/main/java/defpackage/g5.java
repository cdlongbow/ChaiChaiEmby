package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ LazyListState c;

    public /* synthetic */ g5(CoroutineScope coroutineScope, LazyListState lazyListState, int i) {
        this.a = i;
        this.b = coroutineScope;
        this.c = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        LazyListState lazyListState = this.c;
        FocusState focusState = (FocusState) obj;
        switch (i) {
            case 0:
                focusState.getClass();
                if (focusState.getHasFocus()) {
                    BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new e7(lazyListState, 0, null), 3, null);
                }
                break;
            default:
                focusState.getClass();
                if (focusState.getHasFocus()) {
                    BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new e7(lazyListState, 2, null), 3, null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
