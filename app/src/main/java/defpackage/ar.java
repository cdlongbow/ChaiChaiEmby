package defpackage;

import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.material3.SegmentedButtonContentMeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MeasureScope b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ar(ArrayList arrayList, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i, ArrayList arrayList2, int i2) {
        this.e = arrayList;
        this.b = measureScope;
        this.g = segmentedButtonContentMeasurePolicy;
        this.c = i;
        this.h = arrayList2;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                return ColumnMeasurePolicy.placeHelper$lambda$0$0((Placeable[]) obj4, (ColumnMeasurePolicy) obj3, this.c, this.d, this.b, (int[]) obj2, (Placeable.PlacementScope) obj);
            default:
                return SegmentedButtonContentMeasurePolicy.measure_3p2s80s$lambda$8((ArrayList) obj4, this.b, (SegmentedButtonContentMeasurePolicy) obj3, this.c, (ArrayList) obj2, this.d, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ ar(Placeable[] placeableArr, ColumnMeasurePolicy columnMeasurePolicy, int i, int i2, MeasureScope measureScope, int[] iArr) {
        this.e = placeableArr;
        this.g = columnMeasurePolicy;
        this.c = i;
        this.d = i2;
        this.b = measureScope;
        this.h = iArr;
    }
}
