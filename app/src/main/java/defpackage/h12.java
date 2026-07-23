package defpackage;

import android.content.Context;
import android.os.Trace;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h12 {
    public static final kf a(fs0 fs0Var, ColorPainter colorPainter, ColorPainter colorPainter2, ColorPainter colorPainter3, Function1 function1, Composer composer, int i, int i2) {
        if ((i2 & 8) != 0) {
            colorPainter3 = colorPainter2;
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        ContentScale fit = ContentScale.INSTANCE.getFit();
        int iM5653getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m5653getDefaultFilterQualityfv9h1I();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1650263642, i, -1, "coil3.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:45)");
        }
        ks1 ks1VarA = j12.a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = (i4 & 1879048192) | i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1219624997, i5, -1, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:85)");
        }
        cf cfVar = (cf) composer.consume(m01.a);
        int i6 = be2.b;
        Function1 if1Var = (colorPainter == null && colorPainter2 == null && colorPainter3 == null) ? kf.s : new if1(colorPainter, colorPainter3, colorPainter2, 19);
        ji1 ji1Var = function1 != null ? new ji1(5, function1, null) : null;
        int i7 = (i5 >> 15) & 64512;
        composer.startReplaceGroup(-1242991349);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1242991349, i7, -1, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:134)");
        }
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            fs0 fs0VarC = be2.c(composer, fs0Var);
            be2.f(fs0VarC);
            df dfVar = new df(ks1VarA, fs0VarC, cfVar);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new kf(dfVar);
                composer.updateRememberedValue(objRememberedValue);
            }
            kf kfVar = (kf) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(objRememberedValue2);
            }
            kfVar.h = (CoroutineScope) objRememberedValue2;
            kfVar.i = if1Var;
            kfVar.j = ji1Var;
            kfVar.k = fit;
            kfVar.l = iM5653getDefaultFilterQualityfv9h1I;
            kfVar.m = be2.a(composer);
            kfVar.e(dfVar);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            Trace.endSection();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return kfVar;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
