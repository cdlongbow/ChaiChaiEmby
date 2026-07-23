package defpackage;

import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ef1 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ ef1(int i, int i2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.b = i;
        this.c = i2;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                MutableState mutableState3 = (MutableState) obj2;
                hf hfVar = (hf) obj;
                hfVar.getClass();
                pr0 pr0Var = hfVar.b.a;
                int width = pr0Var.getWidth();
                int height = pr0Var.getHeight();
                if (jg1.q(width, height, this.b, this.c) == null) {
                    mutableState.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                }
                if (((Number) mutableState2.getValue()).intValue() != width || ((Number) mutableState3.getValue()).intValue() != height) {
                    mutableState2.setValue(Integer.valueOf(width));
                    mutableState3.setValue(Integer.valueOf(height));
                }
                return Unit.INSTANCE;
            default:
                return RowMeasurePolicy.placeHelper$lambda$0$0((Placeable[]) obj4, (RowMeasurePolicy) obj3, this.b, this.c, (int[]) obj2, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ ef1(Placeable[] placeableArr, RowMeasurePolicy rowMeasurePolicy, int i, int i2, int[] iArr) {
        this.d = placeableArr;
        this.e = rowMeasurePolicy;
        this.b = i;
        this.c = i2;
        this.g = iArr;
    }
}
