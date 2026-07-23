package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ao implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ao(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return CancellableContinuationImpl.resume$lambda$13$lambda$12(function1, (Throwable) obj, obj2, (CoroutineContext) obj3);
            default:
                return DragGestureDetectorKt.detectDragGestures$lambda$3(function1, (PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
        }
    }
}
