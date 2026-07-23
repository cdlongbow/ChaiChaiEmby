package defpackage;

import androidx.compose.material3.TooltipScope;
import androidx.compose.ui.layout.MeasureScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o82 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TooltipScope b;

    public /* synthetic */ o82(TooltipScope tooltipScope, int i) {
        this.a = i;
        this.b = tooltipScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        TooltipScope tooltipScope = this.b;
        MeasureScope measureScope = (MeasureScope) obj;
        switch (i) {
            case 0:
                break;
        }
        return tooltipScope.obtainAnchorBounds(measureScope);
    }
}
