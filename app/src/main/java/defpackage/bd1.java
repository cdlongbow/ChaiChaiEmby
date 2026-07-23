package defpackage;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class bd1 {
    public static final /* synthetic */ int a = 0;

    static {
        Path.Companion companion = Path.INSTANCE;
    }

    public static /* synthetic */ void a(Path path, Path path2, long j, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
            return;
        }
        if ((i & 2) != 0) {
            j = Offset.INSTANCE.m4928getZeroF1C5BW0();
        }
        path.mo5045addPathUv8p0NA(path2, j);
    }

    public static /* synthetic */ void b(Path path, Rect rect, Path.Direction direction, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: addRect");
            return;
        }
        if ((i & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    public static /* synthetic */ void c(Path path, RoundRect roundRect, Path.Direction direction, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: addRoundRect");
            return;
        }
        if ((i & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }
}
