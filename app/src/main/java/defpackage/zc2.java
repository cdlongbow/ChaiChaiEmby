package defpackage;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zc2 {
    public static final SwitchColors a(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(407485037, 0, -1, "com.dh.myembyapp.ui.theme.materialSwitchColors (TvToggle.kt:32)");
        }
        SwitchColors switchColorsM2935colorsV1nXRL4 = SwitchDefaults.INSTANCE.m2935colorsV1nXRL4(c(true), b(false, composer, 1), 0L, 0L, c(true), d(false, composer, 1), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, SwitchDefaults.$stable << 18, 65484);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return switchColorsM2935colorsV1nXRL4;
    }

    public static final long b(boolean z, Composer composer, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-340998218, 0, -1, "com.dh.myembyapp.ui.theme.tvToggleCheckedTrackColor (TvToggle.kt:9)");
        }
        long jG = hc2.g(0, composer, 1);
        if (!z) {
            jG = Color.m5151copywmQWz5c$default(jG, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jG;
    }

    public static final long c(boolean z) {
        return Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), z ? 1.0f : 0.65f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final long d(boolean z, Composer composer, int i) {
        boolean z2 = (i & 1) == 0 ? z : true;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(657364367, 0, -1, "com.dh.myembyapp.ui.theme.tvToggleUncheckedTrackColor (TvToggle.kt:15)");
        }
        long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null);
        if (!z2) {
            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(jM5151copywmQWz5c$default, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM5151copywmQWz5c$default;
    }
}
