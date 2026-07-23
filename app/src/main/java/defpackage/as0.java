package defpackage;

import android.content.Context;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class as0 {
    public static final Painter a(pr0 pr0Var, Context context, int i) {
        if (pr0Var instanceof nl) {
            return BitmapPainterKt.m5768BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((nl) pr0Var).a), 0L, 0L, i, 6, null);
        }
        return pr0Var instanceof qc0 ? new tc0(ig2.e(pr0Var, context.getResources()).mutate()) : new zr0(pr0Var);
    }
}
