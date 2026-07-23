package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.media3.common.util.Size;
import io.github.peerless2012.ass.AssFrame;
import io.github.peerless2012.ass.AssRender;
import io.github.peerless2012.ass.AssTex;

/* JADX INFO: loaded from: classes4.dex */
public final class vd extends View {
    public final md a;
    public final Paint b;
    public kd c;
    public AssFrame d;
    public Size e;
    public final e g;
    public final ud h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(Context context, md mdVar) {
        super(context, null, 0);
        context.getClass();
        mdVar.getClass();
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.b = paint;
        Size size = Size.ZERO;
        size.getClass();
        this.e = size;
        this.g = new e(this, 5);
        this.h = new ud(this, 0);
        setWillNotDraw(false);
        this.a = mdVar;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        md mdVar = this.a;
        AssRender assRender = mdVar.b;
        if (assRender != null) {
            this.c = new kd(assRender);
        }
        mdVar.c = new ud(this, 1);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.a.c = null;
        kd kdVar = this.c;
        if (kdVar != null) {
            kdVar.c.shutdown();
        }
        this.c = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AssTex[] images;
        canvas.getClass();
        super.onDraw(canvas);
        AssFrame assFrame = this.d;
        if (assFrame == null || (images = assFrame.getImages()) == null) {
            return;
        }
        float width = this.e.getWidth() > 0 ? getWidth() / this.e.getWidth() : 1.0f;
        float height = this.e.getHeight() > 0 ? getHeight() / this.e.getHeight() : 1.0f;
        for (AssTex assTex : images) {
            Bitmap bitmap = assTex.getBitmap();
            if (bitmap != null) {
                int color = (((assTex.getColor() >> 24) & 255) << 16) | (((255 - assTex.getColor()) & 255) << 24) | (((assTex.getColor() >> 16) & 255) << 8) | ((assTex.getColor() >> 8) & 255);
                Paint paint = this.b;
                paint.setColor(color);
                if (width == 1.0f && height == 1.0f) {
                    canvas.drawBitmap(bitmap, assTex.getX(), assTex.getY(), paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, new RectF(assTex.getX() * width, assTex.getY() * height, (bitmap.getWidth() + assTex.getX()) * width, (bitmap.getHeight() + assTex.getY()) * height), paint);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        md mdVar = this.a;
        mdVar.getClass();
        Size size = new Size(i, i2);
        this.e = size;
        AssRender assRender = mdVar.b;
        if (assRender != null) {
            assRender.setFrameSize(size.getWidth(), this.e.getHeight());
        }
    }
}
