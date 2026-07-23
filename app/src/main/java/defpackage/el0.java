package defpackage;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class el0 {
    public static ButtonGlow a(u61 u61Var) {
        float f = u61Var.d;
        u61Var.getClass();
        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
        Color.Companion companion = Color.INSTANCE;
        return ButtonDefaults.glow$default(buttonDefaults, null, new Glow(companion.m5187getTransparent0d7_KjU(), Dp.m7813constructorimpl(0.0f), null), new Glow(companion.m5187getTransparent0d7_KjU(), Dp.m7813constructorimpl(0.0f), null), 1, null);
    }

    public static ButtonGlow b(u61 u61Var) {
        IconButtonDefaults iconButtonDefaults = IconButtonDefaults.INSTANCE;
        Color.Companion companion = Color.INSTANCE;
        return IconButtonDefaults.glow$default(iconButtonDefaults, null, new Glow(companion.m5187getTransparent0d7_KjU(), Dp.m7813constructorimpl(0.0f), null), new Glow(companion.m5187getTransparent0d7_KjU(), Dp.m7813constructorimpl(0.0f), null), 1, null);
    }

    public static ClickableSurfaceGlow c(u61 u61Var) {
        float f = u61Var.d;
        u61Var.getClass();
        ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
        Color.Companion companion = Color.INSTANCE;
        return ClickableSurfaceDefaults.glow$default(clickableSurfaceDefaults, null, new Glow(companion.m5187getTransparent0d7_KjU(), Dp.m7813constructorimpl(0.0f), null), new Glow(companion.m5187getTransparent0d7_KjU(), Dp.m7813constructorimpl(0.0f), null), 1, null);
    }
}
