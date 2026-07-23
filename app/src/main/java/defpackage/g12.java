package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g12 {
    public static final void a(Object obj, String str, Modifier modifier, ContentScale contentScale, Composer composer, int i, int i2) {
        Alignment center = Alignment.INSTANCE.getCenter();
        float f = (i2 & 128) != 0 ? 1.0f : 0.36f;
        int iM5653getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m5653getDefaultFilterQualityfv9h1I();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1976030921, i, 0, "coil3.compose.AsyncImage (SingletonAsyncImage.kt:117)");
        }
        bf.b(obj, str, j12.a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())), modifier, center, contentScale, f, iM5653getDefaultFilterQualityfv9h1I, composer, (i & WebSocketProtocol.PAYLOAD_SHORT) | 12585984 | ((i << 3) & 234881024), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void b(Object obj, String str, Modifier modifier, Painter painter, Painter painter2, ColorPainter colorPainter, Function1 function1, Function1 function2, Alignment alignment, ContentScale contentScale, Composer composer, int i, int i2, int i3) {
        Painter painter3 = (i3 & 8) != 0 ? null : painter;
        Painter painter4 = (i3 & 16) != 0 ? null : painter2;
        Object obj2 = (i3 & 32) != 0 ? painter4 : colorPainter;
        Function1 function3 = (i3 & 128) != 0 ? null : function1;
        Function1 function4 = (i3 & 256) != 0 ? null : function2;
        Alignment center = (i3 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        int iM5653getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m5653getDefaultFilterQualityfv9h1I();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846727149, i, i2, "coil3.compose.AsyncImage (SingletonAsyncImage.kt:61)");
        }
        ks1 ks1VarA = j12.a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        int i4 = i << 3;
        int i5 = (i & WebSocketProtocol.PAYLOAD_SHORT) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192);
        int i6 = i2 << 3;
        int i7 = ((i >> 27) & 14) | (i6 & Input.Keys.FORWARD_DEL) | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1128374444, i5, i7, "coil3.compose.AsyncImage (AsyncImage.kt:72)");
        }
        int i8 = i5 >> 3;
        pf pfVar = new pf(obj, (cf) composer.consume(m01.a), ks1VarA);
        int i9 = be2.b;
        Function1 if1Var = (painter3 == null && painter4 == null && obj2 == null) ? kf.s : new if1(painter3, obj2, painter4, 19);
        int i10 = i7 << 15;
        bf.a(pfVar, str, modifier, if1Var, (function3 == null && function4 == null) ? null : new ji1(5, function3, function4), center, contentScale, 1.0f, null, iM5653getDefaultFilterQualityfv9h1I, true, composer, (i8 & 896) | (i5 & Input.Keys.FORWARD_DEL) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), (i7 >> 15) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
