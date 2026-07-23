package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wr0 extends gj {
    public final jw0 D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final a21 H;
    public ee2 I;
    public ee2 J;
    public final bd0 K;
    public m91 L;
    public l91 M;

    public wr0(x11 x11Var, mw0 mw0Var) {
        super(x11Var, mw0Var);
        this.D = new jw0(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = mw0Var.g;
        g11 g11Var = x11Var.a;
        this.H = g11Var == null ? null : (a21) ((HashMap) g11Var.c()).get(str);
        ab abVar = this.p.x;
        if (abVar != null) {
            this.K = new bd0(this, this, abVar);
        }
    }

    @Override // defpackage.gj, defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        a21 a21Var = this.H;
        if (a21Var != null) {
            float fC = wd2.c();
            if (this.o.n) {
                rectF.set(0.0f, 0.0f, a21Var.a * fC, a21Var.b * fC);
            } else {
                rectF.set(0.0f, 0.0f, r().getWidth() * fC, r().getHeight() * fC);
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // defpackage.gj, defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        super.f(i21Var, obj);
        if (obj == c21.F) {
            this.I = new ee2(i21Var, null);
            return;
        }
        if (obj == c21.I) {
            this.J = new ee2(i21Var, null);
            return;
        }
        bd0 bd0Var = this.K;
        if (obj == 5 && bd0Var != null) {
            bd0Var.c.j(i21Var);
            return;
        }
        if (obj == c21.B && bd0Var != null) {
            bd0Var.c(i21Var);
            return;
        }
        if (obj == c21.C && bd0Var != null) {
            bd0Var.e.j(i21Var);
            return;
        }
        if (obj == c21.D && bd0Var != null) {
            bd0Var.f.j(i21Var);
        } else {
            if (obj != c21.E || bd0Var == null) {
                return;
            }
            bd0Var.g.j(i21Var);
        }
    }

    @Override // defpackage.gj
    public final void j(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        a21 a21Var;
        Bitmap bitmapR = r();
        if (bitmapR == null || bitmapR.isRecycled() || (a21Var = this.H) == null) {
            return;
        }
        float fC = wd2.c();
        jw0 jw0Var = this.D;
        jw0Var.setAlpha(i);
        ee2 ee2Var = this.I;
        if (ee2Var != null) {
            jw0Var.setColorFilter((ColorFilter) ee2Var.e());
        }
        bd0 bd0Var = this.K;
        if (bd0Var != null) {
            yc0Var = bd0Var.b(matrix, i);
        }
        int width = bitmapR.getWidth();
        int height = bitmapR.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.n;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (a21Var.a * fC), (int) (a21Var.b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapR.getWidth() * fC), (int) (bitmapR.getHeight() * fC));
        }
        boolean z2 = yc0Var != null;
        if (z2) {
            if (this.L == null) {
                this.L = new m91();
            }
            if (this.M == null) {
                this.M = new l91(0);
            }
            l91 l91Var = this.M;
            l91Var.a = 255;
            l91Var.b = null;
            yc0Var.getClass();
            yc0 yc0Var2 = new yc0(yc0Var);
            l91Var.b = yc0Var2;
            yc0Var2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapR, rect, rect2, jw0Var);
        if (z2) {
            this.L.c();
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    public final Bitmap r() {
        Bitmap bitmapD;
        Bitmap bitmap;
        ee2 ee2Var = this.J;
        if (ee2Var != null && (bitmap = (Bitmap) ee2Var.e()) != null) {
            return bitmap;
        }
        String str = this.p.g;
        x11 x11Var = this.o;
        rr0 rr0Var = x11Var.h;
        if (rr0Var != null) {
            Context contextH = x11Var.h();
            Context context = (Context) rr0Var.b;
            if (contextH != null) {
                if (context instanceof Application) {
                    contextH = contextH.getApplicationContext();
                }
                if (contextH != context) {
                    x11Var.h = null;
                }
            } else if (context != null) {
                x11Var.h = null;
            }
        }
        if (x11Var.h == null) {
            x11Var.h = new rr0(x11Var.getCallback(), x11Var.i, x11Var.a.c());
        }
        rr0 rr0Var2 = x11Var.h;
        if (rr0Var2 != null) {
            String str2 = (String) rr0Var2.c;
            a21 a21Var = (a21) ((Map) rr0Var2.d).get(str);
            if (a21Var == null) {
                bitmapD = null;
            } else {
                int i = a21Var.b;
                int i2 = a21Var.a;
                bitmapD = a21Var.f;
                if (bitmapD == null) {
                    Context context2 = (Context) rr0Var2.b;
                    if (context2 == null) {
                        bitmapD = null;
                    } else {
                        String str3 = a21Var.d;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = Input.Keys.NUMPAD_ENTER;
                        if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                    if (bitmapDecodeStream == null) {
                                        r01.b("Decoded image `" + str + "` is null.");
                                        bitmapD = null;
                                    } else {
                                        bitmapD = wd2.d(bitmapDecodeStream, i2, i);
                                        rr0Var2.b(str, bitmapD);
                                    }
                                } catch (IllegalArgumentException e) {
                                    r01.c("Unable to decode image `" + str + "`.", e);
                                }
                            } catch (IOException e2) {
                                r01.c("Unable to open asset.", e2);
                            }
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                bitmapD = wd2.d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), i2, i);
                                synchronized (rr0.e) {
                                    ((a21) ((Map) rr0Var2.d).get(str)).f = bitmapD;
                                }
                            } catch (IllegalArgumentException e3) {
                                r01.c("data URL did not have correct base64 format.", e3);
                                bitmapD = null;
                            }
                        }
                    }
                }
            }
        } else {
            bitmapD = null;
        }
        if (bitmapD != null) {
            return bitmapD;
        }
        a21 a21Var2 = this.H;
        if (a21Var2 != null) {
            return a21Var2.f;
        }
        return null;
    }
}
