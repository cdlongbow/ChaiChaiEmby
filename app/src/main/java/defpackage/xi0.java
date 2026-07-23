package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xi0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ LazyListState d;
    public final /* synthetic */ FocusRequester e;

    public /* synthetic */ xi0(CoroutineScope coroutineScope, MutableState mutableState, LazyListState lazyListState, FocusRequester focusRequester, int i) {
        this.a = i;
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = lazyListState;
        this.e = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new qj0(this.c, this.d, this.e, null, 0), 3, null);
                break;
            default:
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new qj0(this.c, this.d, this.e, null, 1), 3, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
