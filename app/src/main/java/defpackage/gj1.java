package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.CaptionStyleCompat;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.R;
import androidx.media3.ui.SubtitleView;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.PlayerResizeMode;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gj1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ og1 A;
    public final /* synthetic */ MutableState B;
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ vo1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Typeface e;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ UserPreferences h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ on1 j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ State r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;
    public final /* synthetic */ sh1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj1(MutableState mutableState, Context context, vo1 vo1Var, boolean z, Typeface typeface, CoroutineScope coroutineScope, UserPreferences userPreferences, MutableState mutableState2, on1 on1Var, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, State state, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, sh1 sh1Var, og1 og1Var, MutableState mutableState17) {
        super(1, Intrinsics.Kotlin.class, "updateEmbeddedPlayerView", "PlayerScreenContent$lambda$121$updateEmbeddedPlayerView(Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lcom/dh/myembyapp/ui/screens/player/PlayerViewSubtitleLogState;ZLandroid/graphics/Typeface;Lkotlinx/coroutines/CoroutineScope;Lcom/dh/myembyapp/data/preferences/UserPreferences;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerSettingsState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/dh/myembyapp/ui/screens/player/PlayerRebuildController;Lcom/dh/myembyapp/ui/screens/player/PlayerDecoderState;Landroidx/compose/runtime/MutableState;Landroidx/media3/ui/PlayerView;)V", 0);
        this.a = mutableState;
        this.b = context;
        this.c = vo1Var;
        this.d = z;
        this.e = typeface;
        this.g = coroutineScope;
        this.h = userPreferences;
        this.i = mutableState2;
        this.j = on1Var;
        this.k = mutableState3;
        this.l = mutableState4;
        this.m = mutableState5;
        this.n = mutableState6;
        this.o = mutableState7;
        this.p = mutableState8;
        this.q = mutableState9;
        this.r = state;
        this.s = mutableState10;
        this.t = mutableState11;
        this.u = mutableState12;
        this.v = mutableState13;
        this.w = mutableState14;
        this.x = mutableState15;
        this.y = mutableState16;
        this.z = sh1Var;
        this.A = og1Var;
        this.B = mutableState17;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        float f2;
        int i;
        final PlayerView playerView = (PlayerView) obj;
        playerView.getClass();
        this.a.setValue(playerView);
        boolean z = this.d;
        Typeface typeface = this.e;
        MutableState mutableState = this.i;
        on1 on1Var = this.j;
        MutableState mutableState2 = this.k;
        MutableState mutableState3 = this.l;
        MutableState mutableState4 = this.m;
        MutableState mutableState5 = this.n;
        MutableState mutableState6 = this.o;
        MutableState mutableState7 = this.p;
        MutableState mutableState8 = this.q;
        uo1 uo1VarB0 = dn1.b0(z, typeface, mutableState, on1Var, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, this.r, this.s, this.t, this.u, this.v, this.w, this.x);
        vo1 vo1Var = this.c;
        vo1Var.getClass();
        if (!playerView.getKeepScreenOn()) {
            playerView.setKeepScreenOn(true);
        }
        Player player = playerView.getPlayer();
        ExoPlayer exoPlayer = uo1VarB0.a;
        final PlayerResizeMode playerResizeMode = uo1VarB0.c;
        if (!Intrinsics.areEqual(player, exoPlayer)) {
            Log.d("PlayerScreen", "更新 PlayerView 的播放器引用");
            playerView.setPlayer(exoPlayer);
        }
        if (exoPlayer.getVideoScalingMode() != playerResizeMode.getExoVideoScalingMode()) {
            Log.d("PlayerScreen", "更新视频缩放模式: " + playerResizeMode.getLabel() + ", scalingMode=" + playerResizeMode.getExoVideoScalingMode());
            exoPlayer.setVideoScalingMode(playerResizeMode.getExoVideoScalingMode());
        }
        if (playerView.getResizeMode() != playerResizeMode.getMedia3ResizeMode()) {
            Log.d("PlayerScreen", mr.s("更新播放器画面模式: ", playerResizeMode.getLabel(), " (", playerResizeMode.getStorageValue(), ")"));
            playerView.setResizeMode(playerResizeMode.getMedia3ResizeMode());
        }
        final int i2 = uo1VarB0.d;
        final int i3 = uo1VarB0.e;
        final View videoSurfaceView = playerView.getVideoSurfaceView();
        if (videoSurfaceView != null) {
            videoSurfaceView.post(new Runnable() { // from class: en1
                @Override // java.lang.Runnable
                public final void run() {
                    float f3;
                    PlayerView playerView2 = playerView;
                    int width = playerView2.getWidth();
                    int height = playerView2.getHeight();
                    View view = videoSurfaceView;
                    int width2 = view.getWidth();
                    int height2 = view.getHeight();
                    if (width <= 0 || height <= 0 || width2 <= 0 || height2 <= 0) {
                        return;
                    }
                    PlayerResizeMode playerResizeMode2 = playerResizeMode;
                    boolean useSurfaceCropTransform = playerResizeMode2.getUseSurfaceCropTransform();
                    int i4 = i2;
                    int i5 = i3;
                    if (!useSurfaceCropTransform || i4 <= 0 || i5 <= 0) {
                        f3 = 1.0f;
                    } else {
                        float f4 = width / height;
                        float f5 = i4 / i5;
                        f3 = f4 > f5 ? f4 / f5 : f5 / f4;
                    }
                    view.setPivotX(width2 / 2.0f);
                    view.setPivotY(height2 / 2.0f);
                    if (view.getScaleX() == f3 && view.getScaleY() == f3) {
                        return;
                    }
                    String storageValue = playerResizeMode2.getStorageValue();
                    String str = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
                    String simpleName = view.getClass().getSimpleName();
                    StringBuilder sb = new StringBuilder("应用裁切变换: mode=");
                    sb.append(storageValue);
                    sb.append(", container=");
                    sb.append(width);
                    sb.append("x");
                    c61.t(sb, height, ", surface=", width2, "x");
                    c61.t(sb, height2, ", video=", i4, "x");
                    sb.append(i5);
                    sb.append(", scale=");
                    sb.append(str);
                    sb.append(", surfaceType=");
                    sb.append(simpleName);
                    Log.d("PlayerScreen", sb.toString());
                    view.setScaleX(f3);
                    view.setScaleY(f3);
                }
            });
        }
        playerView.setClipChildren(false);
        playerView.setClipToPadding(false);
        ViewParent parent = playerView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) playerView.findViewById(R.id.exo_content_frame);
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setClipChildren(false);
            aspectRatioFrameLayout.setClipToPadding(false);
        }
        SubtitleView subtitleView = playerView.getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setVisibility(0);
            try {
                in1.t(subtitleView, uo1VarB0.l);
            } catch (Exception e) {
                dn1.f0(this.g, this.h, this.y, mutableState4, mutableState8, this.z, this.A, this.B, "更新 ASS 字幕增强 overlay 失败，准备自动回退", e, "ASS 增强渲染出现错误，已自动回退为默认渲染");
                Unit unit = Unit.INSTANCE;
            }
            boolean z2 = uo1VarB0.h;
            int i4 = uo1VarB0.p;
            SubtitlePreferences.SubtitleColor subtitleColor = uo1VarB0.o;
            boolean z3 = uo1VarB0.i;
            int i5 = uo1VarB0.m;
            int i6 = uo1VarB0.n;
            boolean z4 = uo1VarB0.f != null;
            boolean z5 = uo1VarB0.g;
            int width = subtitleView.getWidth();
            int height = subtitleView.getHeight();
            StringBuilder sb = new StringBuilder("native=");
            sb.append(z2);
            sb.append("|bitmap=");
            sb.append(z3);
            sb.append("|scale=");
            c61.t(sb, i5, "|offset=", i6, "|color=");
            sb.append(subtitleColor);
            sb.append("|bitmapBrightness=");
            sb.append(i4);
            sb.append("|font=");
            i9.r(sb, z4, "|assEnhance=", z5, "|size=");
            sb.append(width);
            sb.append("x");
            sb.append(height);
            String string = sb.toString();
            if (!Intrinsics.areEqual(string, vo1Var.b)) {
                int width2 = subtitleView.getWidth();
                int height2 = subtitleView.getHeight();
                StringBuilder sb2 = new StringBuilder("SubtitleView: useNative=");
                sb2.append(z2);
                sb2.append(", isBitmap=");
                sb2.append(z3);
                sb2.append(", scale=");
                c61.t(sb2, i5, ", verticalOffset=", i6, ", color=");
                sb2.append(subtitleColor);
                sb2.append(", bitmapBrightness=");
                sb2.append(i4);
                sb2.append(", size=");
                sb2.append(width2);
                sb2.append("x");
                sb2.append(height2);
                Log.d("SubtitleDebug", sb2.toString());
                vo1Var.b = string;
            }
            Context context = this.b;
            String str = ", view=";
            if (z2 != 0 && z3) {
                subtitleView.setPivotX(subtitleView.getWidth() / 2.0f);
                subtitleView.setPivotY(subtitleView.getHeight() / 2.0f);
                int i7 = uo1VarB0.q;
                int i8 = uo1VarB0.r;
                if (i7 <= 0 || i8 <= 0) {
                    f = 0.08f;
                    int i9 = uo1VarB0.d;
                    float f3 = (i9 <= 0 || (i = uo1VarB0.e) <= 0) ? 0.0f : i9 / i;
                    float fMin = f3 <= 0.0f ? 1.7777778f : Math.min(f3, 1.7777778f);
                    if (!vo1Var.a) {
                        Log.d("SubtitleDebug", mr.s("PGS 画布未知，回退宽高比=", String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(fMin)}, 1)), " (videoAspect=", String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1)), ")"));
                        vo1Var.a = true;
                    }
                    f2 = fMin;
                } else {
                    f = 0.08f;
                    f2 = i7 / i8;
                    context = context;
                    str = ", view=";
                }
                float width3 = subtitleView.getHeight() > 0 ? (subtitleView.getWidth() > 0 ? subtitleView.getWidth() / f2 : subtitleView.getHeight()) / subtitleView.getHeight() : 1.0f;
                if (width3 <= 1.01f) {
                    width3 = 1.0f;
                }
                float f4 = i5 / 100.0f;
                subtitleView.setScaleX(f4);
                subtitleView.setScaleY(width3 * f4);
                subtitleView.setTranslationY(((-i6) * context.getResources().getDisplayMetrics().density) + ((f4 - 1.0f) * subtitleView.getHeight() * f * width3));
                subtitleView.setApplyEmbeddedStyles(true);
                subtitleView.setApplyEmbeddedFontSizes(true);
                subtitleView.setStyle(CaptionStyleCompat.DEFAULT);
                subtitleView.setFractionalTextSize(0.0533f);
                subtitleView.setBottomPaddingFraction(f);
                int width4 = subtitleView.getWidth();
                int height3 = subtitleView.getHeight();
                StringBuilder sb3 = new StringBuilder("baseY=");
                sb3.append(width3);
                sb3.append("|user=");
                sb3.append(f4);
                sb3.append("|offset=");
                c61.t(sb3, i6, "|brightness=", i4, "|canvas=");
                c61.t(sb3, i7, "x", i8, "|view=");
                sb3.append(width4);
                sb3.append("x");
                sb3.append(height3);
                String string2 = sb3.toString();
                if (!Intrinsics.areEqual(string2, vo1Var.d)) {
                    int width5 = subtitleView.getWidth();
                    int height4 = subtitleView.getHeight();
                    StringBuilder sb4 = new StringBuilder("PGS/DVB: reset scale/translation/style, baseScaleY=");
                    sb4.append(width3);
                    sb4.append(", userScale=");
                    sb4.append(f4);
                    sb4.append(", offset=");
                    c61.t(sb4, i6, ", brightness=", i4, ", canvas=");
                    c61.t(sb4, i7, "x", i8, str);
                    sb4.append(width5);
                    sb4.append("x");
                    sb4.append(height4);
                    Log.d("SubtitleDebug", sb4.toString());
                    vo1Var.d = string2;
                }
            } else if (z2) {
                float f5 = i5 / 100.0f;
                subtitleView.setPivotX(subtitleView.getWidth() / 2.0f);
                subtitleView.setPivotY(subtitleView.getHeight());
                subtitleView.setScaleX(f5);
                subtitleView.setScaleY(f5);
                float f6 = context.getResources().getDisplayMetrics().density;
                subtitleView.setTranslationY(((-i6) * f6) + ((f5 - 1.0f) * 20.0f * f6));
                subtitleView.setApplyEmbeddedStyles(true);
                subtitleView.setApplyEmbeddedFontSizes(true);
                subtitleView.setStyle(new CaptionStyleCompat(-1, 0, 0, 1, -16777216, in1.o(uo1VarB0.f, uo1VarB0.g, uo1VarB0.h, uo1VarB0.i, uo1VarB0.j, uo1VarB0.k)));
                subtitleView.setFractionalTextSize(0.0533f);
                subtitleView.setBottomPaddingFraction(0.08f);
                String str2 = "nativeText|user=" + f5 + "|offset=" + i6 + "|ty=" + subtitleView.getTranslationY() + "|view=" + subtitleView.getWidth() + "x" + subtitleView.getHeight();
                if (!Intrinsics.areEqual(str2, vo1Var.c)) {
                    float translationY = subtitleView.getTranslationY();
                    int width6 = subtitleView.getWidth();
                    int height5 = subtitleView.getHeight();
                    StringBuilder sb5 = new StringBuilder("NativeTextSubtitle: userScale=");
                    sb5.append(f5);
                    sb5.append(", translationY=");
                    sb5.append(translationY);
                    sb5.append(", offset=");
                    c61.t(sb5, i6, ", view=", width6, "x");
                    sb5.append(height5);
                    Log.d("SubtitleDebug", sb5.toString());
                    vo1Var.c = str2;
                }
            } else {
                float f7 = i5 / 100.0f;
                subtitleView.setPivotX(subtitleView.getWidth() / 2.0f);
                subtitleView.setPivotY(subtitleView.getHeight());
                subtitleView.setScaleX(1.0f);
                subtitleView.setScaleY(1.0f);
                subtitleView.setApplyEmbeddedStyles(true);
                subtitleView.setApplyEmbeddedFontSizes(false);
                float fCoerceIn = RangesKt.coerceIn(0.054f * f7, 0.015f, 0.18f);
                subtitleView.setFractionalTextSize(fCoerceIn);
                subtitleView.setBottomPaddingFraction(0.08f);
                float f8 = context.getResources().getDisplayMetrics().density;
                subtitleView.setTranslationY((20 - i6) * f8);
                String str3 = "scale=" + f7 + "|textSize=" + fCoerceIn + "|ty=" + subtitleView.getTranslationY() + "|density=" + f8;
                if (!Intrinsics.areEqual(str3, vo1Var.c)) {
                    Log.d("SubtitleDebug", "TextSubtitle: scaleFactor=" + f7 + ", textSizeFraction=" + fCoerceIn + ", translationY=" + subtitleView.getTranslationY() + ", density=" + f8);
                    vo1Var.c = str3;
                }
                boolean z6 = uo1VarB0.h;
                if (!z6) {
                    subtitleView.setStyle(new CaptionStyleCompat(subtitleColor.getColorValue(), 0, 0, 1, -16777216, in1.o(uo1VarB0.f, uo1VarB0.g, z6, uo1VarB0.i, uo1VarB0.j, uo1VarB0.k)));
                    if (!Intrinsics.areEqual(str3, vo1Var.c)) {
                        Log.d("SubtitleDebug", "TextSubtitle: apply CaptionStyle color=" + subtitleColor.getColorValue());
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
