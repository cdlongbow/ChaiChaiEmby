package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd implements Arrangement.SpacingAlignmentCalculator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Alignment.Horizontal b;

    public /* synthetic */ dd(Alignment.Horizontal horizontal, int i) {
        this.a = i;
        this.b = horizontal;
    }

    @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
    public final int align(int i, LayoutDirection layoutDirection) {
        int i2 = this.a;
        Alignment.Horizontal horizontal = this.b;
        switch (i2) {
            case 0:
                return Arrangement.spacedBy_D5KLDUw$lambda$0(horizontal, i, layoutDirection);
            case 1:
                return Arrangement.aligned$lambda$0(horizontal, i, layoutDirection);
            case 2:
                return Arrangement.Absolute.aligned$lambda$0(horizontal, i, layoutDirection);
            default:
                return Arrangement.Absolute.spacedBy_D5KLDUw$lambda$0(horizontal, i, layoutDirection);
        }
    }
}
