package defpackage;

import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a50 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ a50(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                mutableState.setValue(jb2.b);
                return Unit.INSTANCE;
            case 1:
                mutableState.setValue(jb2.a);
                return Unit.INSTANCE;
            case 2:
                mutableState.setValue(v51.a);
                return Unit.INSTANCE;
            case 3:
                mutableState.setValue(v51.b);
                return Unit.INSTANCE;
            case 4:
                mutableState.setValue(v51.c);
                return Unit.INSTANCE;
            case 5:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 7:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 8:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 9:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 10:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 11:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 12:
                return DragHandleKt.VerticalDragHandle$lambda$6$lambda$5(mutableState);
            case 13:
                return DragHandleKt.VerticalDragHandle$lambda$8$lambda$7(mutableState);
            case 14:
                return ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1(mutableState);
            case 15:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 16:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 17:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 18:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 19:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 20:
                bq0.V(mutableState, false);
                return Unit.INSTANCE;
            case 21:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 22:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 23:
                mutableState.setValue(0);
                return Unit.INSTANCE;
            case 24:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 25:
                bq0.n(mutableState, true);
                return Unit.INSTANCE;
            case 26:
                mutableState.setValue(0);
                return Unit.INSTANCE;
            case 27:
                mutableState.setValue(0);
                return Unit.INSTANCE;
            case 28:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
