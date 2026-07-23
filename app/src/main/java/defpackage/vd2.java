package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes4.dex */
public final class vd2 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new PathMeasure();
            case 1:
                return new Path();
            case 2:
                return new Path();
            default:
                return new float[4];
        }
    }
}
