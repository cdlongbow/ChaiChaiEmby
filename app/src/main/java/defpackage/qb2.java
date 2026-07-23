package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class qb2 {
    public static ViewModel a(ViewModelProvider.Factory factory, KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        creationExtras.getClass();
        return factory.create(JvmClassMappingKt.getJavaClass(kClass), creationExtras);
    }

    public static long b(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec) {
        return ((long) (vectorizedDurationBasedAnimationSpec.getDurationMillis() + vectorizedDurationBasedAnimationSpec.getDelayMillis())) * 1000000;
    }

    public static boolean c(Transition.Segment segment, Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, segment.getInitialState()) && Intrinsics.areEqual(obj2, segment.getTargetState());
    }

    public static PathBuilder d(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static Object e(byte[] bArr, int i, Function1 function1) {
        return function1.invoke(UByte.m8837boximpl(UByteArray.m8901getw2LRezQ(bArr, i)));
    }

    public static Object f(int[] iArr, int i, Function1 function1) {
        return function1.invoke(UInt.m8914boximpl(UIntArray.m8980getpVg5ArA(iArr, i)));
    }

    public static Object g(long[] jArr, int i, Function1 function1) {
        return function1.invoke(ULong.m8993boximpl(ULongArray.m9059getsVKNKU(jArr, i)));
    }

    public static Object h(short[] sArr, int i, Function1 function1) {
        return function1.invoke(UShort.m9100boximpl(UShortArray.m9164getMh2AYeg(sArr, i)));
    }

    public static String i(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static List j(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void k(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void l(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static /* synthetic */ void m(Response response) throws Exception {
        if (response instanceof AutoCloseable) {
            response.close();
        } else if (response instanceof ExecutorService) {
            b0.i();
        } else {
            rd1.u();
        }
    }

    public static PathBuilder n(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static List o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void p(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static /* synthetic */ Object v(TransformableState transformableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: transform");
            return null;
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return transformableState.transform(mutatePriority, function2, continuation);
    }

    public static /* synthetic */ void w(TransformScope transformScope, long j, float f, long j2, float f2, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: transformByWithCentroid-IEwrmTk");
            return;
        }
        if ((i & 1) != 0) {
            j = Offset.INSTANCE.m4927getUnspecifiedF1C5BW0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j2 = Offset.INSTANCE.m4928getZeroF1C5BW0();
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        transformScope.mo462transformByWithCentroidIEwrmTk(j3, f3, j4, f2);
    }
}
