package defpackage;

import androidx.compose.foundation.BasicMarqueeKt;
import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.ui.unit.Density;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj implements MarqueeSpacing {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ rj(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // androidx.compose.foundation.MarqueeSpacing
    public final int calculateSpacing(Density density, int i, int i2) {
        int i3 = this.a;
        float f = this.b;
        switch (i3) {
            case 0:
                return BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$0(f, density, i, i2);
            default:
                return MarqueeSpacing.Companion.fractionOfContainer$lambda$0(f, density, i, i2);
        }
    }
}
