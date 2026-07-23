package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ LazyListState c;

    public /* synthetic */ i10(LazyListState lazyListState, CoroutineScope coroutineScope, int i) {
        this.a = i;
        this.c = lazyListState;
        this.b = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zCustomScrollActions$lambda$16;
        int i = this.a;
        CoroutineScope coroutineScope = this.b;
        LazyListState lazyListState = this.c;
        switch (i) {
            case 0:
                return DatePickerKt.DatePickerContent$lambda$36$lambda$29$lambda$28(coroutineScope, lazyListState);
            case 1:
                return DatePickerKt.DatePickerContent$lambda$36$lambda$31$lambda$30(coroutineScope, lazyListState);
            case 2:
                zCustomScrollActions$lambda$16 = DateRangePickerKt.customScrollActions$lambda$16(lazyListState, coroutineScope);
                break;
            default:
                zCustomScrollActions$lambda$16 = DateRangePickerKt.customScrollActions$lambda$17(lazyListState, coroutineScope);
                break;
        }
        return Boolean.valueOf(zCustomScrollActions$lambda$16);
    }

    public /* synthetic */ i10(CoroutineScope coroutineScope, LazyListState lazyListState, int i) {
        this.a = i;
        this.b = coroutineScope;
        this.c = lazyListState;
    }
}
