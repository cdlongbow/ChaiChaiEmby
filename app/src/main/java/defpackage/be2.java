package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class be2 {
    public static final long a = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);
    public static final /* synthetic */ int b = 0;

    public static final of a(Composer composer) {
        of ofVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074249623, 0, -1, "coil3.compose.internal.previewHandler (utils.kt:218)");
        }
        if (((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            composer.startReplaceGroup(2019030948);
            ofVar = (of) composer.consume(n01.a);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2019088453);
            composer.endReplaceGroup();
            ofVar = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ofVar;
    }

    public static final o12 b(ContentScale contentScale, Composer composer, int i) {
        Object obj;
        Object obj2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-894086142, i, -1, "coil3.compose.internal.rememberSizeResolver (utils.kt:86)");
        }
        boolean zAreEqual = Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getNone());
        boolean zChanged = composer.changed(zAreEqual);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (zAreEqual) {
                obj = o12.f;
            } else {
                mu muVar = new mu();
                muVar.a = a;
                muVar.b = new ArrayList();
                obj = muVar;
            }
            Object obj3 = obj;
            composer.updateRememberedValue(obj3);
            obj2 = obj3;
        }
        obj2 = objRememberedValue;
        o12 o12Var = (o12) obj2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return o12Var;
    }

    public static final fs0 c(Composer composer, Object obj) {
        composer.startReplaceGroup(1319639034);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1319639034, 0, -1, "coil3.compose.internal.requestOf (utils.kt:42)");
        }
        if (obj instanceof fs0) {
            composer.startReplaceGroup(1530875884);
            fs0 fs0Var = (fs0) obj;
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return fs0Var;
        }
        composer.startReplaceGroup(1530915130);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zChanged = composer.changed(context) | composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            bs0 bs0Var = new bs0(context);
            bs0Var.c = obj;
            objRememberedValue = bs0Var.a();
            composer.updateRememberedValue(objRememberedValue);
        }
        fs0 fs0Var2 = (fs0) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fs0Var2;
    }

    public static final long d(long j) {
        int iRoundToInt = MathKt.roundToInt(Float.intBitsToFloat((int) (j >> 32)));
        return IntSize.m7975constructorimpl((((long) MathKt.roundToInt(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRoundToInt) << 32));
    }

    public static void e(String str) {
        throw new IllegalArgumentException(ll0.e("Unsupported type: ", str, ". ", mr.r("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void f(fs0 fs0Var) {
        Object obj = fs0Var.b;
        if (obj instanceof bs0) {
            ra.q("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof ImageBitmap) {
            e("ImageBitmap");
            throw null;
        }
        if (obj instanceof ImageVector) {
            e("ImageVector");
            throw null;
        }
        if (obj instanceof Painter) {
            e("Painter");
            throw null;
        }
        if (fs0Var.c != null) {
            ra.q("request.target must be null.");
        } else {
            if (((Lifecycle) tl0.u(fs0Var, is0.e)) == null) {
                return;
            }
            ra.q("request.lifecycle must be null.");
        }
    }
}
