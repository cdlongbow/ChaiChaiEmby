package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ComposeShader;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Binder;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class y0 {
    public static /* synthetic */ BlendModeColorFilter a(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* synthetic */ ComposeShader b(Shader shader, Shader shader2, BlendMode blendMode) {
        return new ComposeShader(shader, shader2, blendMode);
    }

    public static /* synthetic */ RenderNode c() {
        return new RenderNode("Compose");
    }

    public static /* synthetic */ Binder d() {
        return new Binder("WINDOW_AREA_REAR_DISPLAY");
    }

    public static /* synthetic */ WindowInsets.Builder e() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder f(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo g(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ RenderNode i() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }
}
