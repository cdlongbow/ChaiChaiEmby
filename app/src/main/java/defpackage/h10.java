package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h10 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ h10(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return DatePickerKt.DatePickerContent$lambda$25$lambda$24();
            case 1:
                return DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
            case 2:
                return Float.valueOf(DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$15$lambda$14$lambda$13());
            case 3:
                return SnapshotIntStateKt.mutableIntStateOf(0);
            case 4:
                return SnapshotIntStateKt.mutableIntStateOf(0);
            case 5:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 6:
                return SnapshotIntStateKt.mutableIntStateOf(0);
            case 7:
                return SnapshotIntStateKt.mutableIntStateOf(0);
            case 8:
                return SnapshotIntStateKt.mutableIntStateOf(0);
            case 9:
                return SnapshotIntStateKt.mutableIntStateOf(0);
            case 10:
                return SnapshotIntStateKt.mutableIntStateOf(0);
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Boolean.valueOf(DragGestureDetectorKt.detectDragGestures$lambda$5());
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Boolean.valueOf(DragGestureDetectorKt.detectDragGestures$lambda$9());
            case 22:
                return new Handler(Looper.getMainLooper());
            case 23:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 24:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 25:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 26:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 27:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 28:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            default:
                return Unit.INSTANCE;
        }
    }
}
