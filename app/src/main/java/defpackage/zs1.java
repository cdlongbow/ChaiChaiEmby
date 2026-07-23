package defpackage;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.media3.exoplayer.Renderer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.savedstate.SavedStateReaderKt;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RoutePlanner;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class zs1 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
    }

    public static /* synthetic */ Object D(ScrollableState scrollableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: scroll");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollableState.scroll(mutatePriority, function2, continuation);
    }

    public static /* synthetic */ Modifier E(RowScope rowScope, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: weight");
            return null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return rowScope.weight(modifier, f, z);
    }

    public static long a(Renderer renderer) {
        if (renderer.getState() != 1) {
            return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        }
        if (renderer.isReady() || renderer.isEnded()) {
            return 1000000L;
        }
        return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static /* synthetic */ boolean c(RoutePlanner routePlanner, RealConnection realConnection, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: hasNext");
            return false;
        }
        if ((i & 1) != 0) {
            realConnection = null;
        }
        return routePlanner.hasNext(realConnection);
    }

    public static boolean d(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static float e(ScaledNumericValue scaledNumericValue, float f, float f2, float f3) {
        return (scaledNumericValue.getScale(f) * f2) + f3;
    }

    public static PathBuilder f(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.horizontalLineToRelative(f5);
        return pathBuilder;
    }

    public static String g(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static Iterator h(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return sequence.iterator();
    }

    public static List i(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List j(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.reflectiveCurveTo(f, f2, f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException k(String str) {
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        return new KotlinNothingValueException();
    }

    public static void l(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void m(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void n(Map.Entry entry, String str, ArrayList arrayList) {
        arrayList.add(TuplesKt.to(str, entry.getValue()));
    }

    public static PathBuilder o(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static List p(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static PathBuilder t(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.lineTo(f4, f5);
        return pathBuilder;
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
    }

    public static void v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }
}
