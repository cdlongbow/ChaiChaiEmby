package defpackage;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i81 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i81(int i, int i2, MutableObjectIntMap mutableObjectIntMap, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.b = i;
        this.c = i2;
        this.d = mutableObjectIntMap;
        this.e = nearestRangeKeyIndexMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        int i2 = this.c;
        int i3 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                return NearestRangeKeyIndexMap.lambda$1$0(i3, i2, (MutableObjectIntMap) obj3, (NearestRangeKeyIndexMap) obj2, (IntervalList.Interval) obj);
            default:
                return RulerAlignmentKt.fitInside$lambda$0$1((RectRulers) obj3, i3, i2, (Placeable) obj2, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ i81(RectRulers rectRulers, int i, int i2, Placeable placeable) {
        this.d = rectRulers;
        this.b = i;
        this.c = i2;
        this.e = placeable;
    }
}
