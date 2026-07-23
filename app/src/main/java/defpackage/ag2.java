package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsHeightCalculator;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.foundation.layout.WindowInsetsWidthCalculator;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ag2 implements WindowInsetsWidthCalculator, WindowInsetsHeightCalculator {
    public final /* synthetic */ int a;

    public /* synthetic */ ag2(int i) {
        this.a = i;
    }

    public static /* synthetic */ void c(Object obj, Object obj2, Object obj3) {
        throw new AssertionError("Thread " + obj + obj2 + obj3);
    }

    public static /* synthetic */ void d(String str, Object obj) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void e(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // androidx.compose.foundation.layout.WindowInsetsHeightCalculator
    public int calculate(WindowInsets windowInsets, Density density) {
        switch (this.a) {
            case 7:
                return windowInsets.getTop(density);
            default:
                return windowInsets.getBottom(density);
        }
    }

    @Override // androidx.compose.foundation.layout.WindowInsetsWidthCalculator
    public int calculate(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
        switch (this.a) {
            case 5:
                return WindowInsetsSizeKt.startCalc$lambda$0(windowInsets, layoutDirection, density);
            default:
                return WindowInsetsSizeKt.endCalc$lambda$0(windowInsets, layoutDirection, density);
        }
    }
}
