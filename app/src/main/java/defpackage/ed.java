package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed implements Arrangement.SpacingAlignmentCalculator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Alignment.Vertical b;

    public /* synthetic */ ed(Alignment.Vertical vertical, int i) {
        this.a = i;
        this.b = vertical;
    }

    @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
    public final int align(int i, LayoutDirection layoutDirection) {
        int i2 = this.a;
        Alignment.Vertical vertical = this.b;
        switch (i2) {
            case 0:
                return Arrangement.spacedBy_D5KLDUw$lambda$1(vertical, i, layoutDirection);
            case 1:
                return Arrangement.aligned$lambda$1(vertical, i, layoutDirection);
            default:
                return Arrangement.Absolute.spacedBy_D5KLDUw$lambda$1(vertical, i, layoutDirection);
        }
    }
}
