package defpackage;

import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu1 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RectRulers b;

    public /* synthetic */ fu1(RectRulers rectRulers, int i) {
        this.a = i;
        this.b = rectRulers;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        MeasureScope measureScope = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        Constraints constraints = (Constraints) obj3;
        RectRulers rectRulers = this.b;
        switch (i) {
            case 0:
                return RulerAlignmentKt.fitInside$lambda$0(rectRulers, measureScope, measurable, constraints);
            default:
                return RulerAlignmentKt.fitOutside$lambda$0(rectRulers, measureScope, measurable, constraints);
        }
    }
}
