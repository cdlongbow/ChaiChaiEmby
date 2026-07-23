package defpackage;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w01 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextDragObserver b;

    public /* synthetic */ w01(TextDragObserver textDragObserver, int i) {
        this.a = i;
        this.b = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        TextDragObserver textDragObserver = this.b;
        switch (i) {
            case 0:
                return LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$0(textDragObserver, (Offset) obj);
            case 1:
                return SelectionGesturesKt.touchSelectionFirstPress$lambda$0(textDragObserver, (PointerInputChange) obj);
            default:
                return SelectionGesturesKt.touchSelectionSubsequentPress$lambda$0(textDragObserver, (PointerInputChange) obj);
        }
    }
}
