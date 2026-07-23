package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Draggable2DElement;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.Velocity;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b80 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b80(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 1:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 2:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 3:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 4:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 5:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 6:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 7:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 8:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 9:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 10:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 11:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 12:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 13:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 14:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 15:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 16:
                return DragGestureDetectorKt.detectHorizontalDragGestures$lambda$0((Offset) obj);
            case 17:
                return DragGestureDetectorKt.detectDragGesturesAfterLongPress$lambda$0((Offset) obj);
            case 18:
                return DragGestureDetectorKt.detectDragGestures$lambda$0((Offset) obj);
            case 19:
                return DragGestureDetectorKt.detectVerticalDragGestures$lambda$0((Offset) obj);
            case 20:
                return DragGestureDetectorKt.detectDragGestures$lambda$7((PointerInputChange) obj);
            case 21:
                return Boolean.valueOf(Draggable2DElement.CanDrag$lambda$0((PointerType) obj));
            case 22:
                return Draggable2DKt.NoOpOnDragStart$lambda$0((Offset) obj);
            case 23:
                return Draggable2DKt.NoOpOnDragStop$lambda$0((Velocity) obj);
            case 24:
                return Boolean.valueOf(DraggableElement.CanDrag$lambda$0((PointerType) obj));
            case 25:
                return Boolean.valueOf(DrawerState._init_$lambda$0((DrawerValue) obj));
            case 26:
                return Float.valueOf(DrawerState.anchoredDraggableState$lambda$1(((Float) obj).floatValue()));
            case 27:
                return EmbeddingBackend.Companion.reset$lambda$1((EmbeddingBackend) obj);
            case 28:
                return EmbeddingBackend.Companion.decorator$lambda$0((EmbeddingBackend) obj);
            default:
                return ExecutorCoroutineDispatcher.Companion._init_$lambda$0((CoroutineContext.Element) obj);
        }
    }
}
