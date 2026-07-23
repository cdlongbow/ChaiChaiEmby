package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class fe extends FrameLayout {
    public final md a;
    public final vd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(Context context, md mdVar) {
        super(context, null, 0);
        context.getClass();
        mdVar.getClass();
        this.a = mdVar;
        rd[] rdVarArr = rd.a;
        vd vdVar = new vd(context, mdVar);
        this.b = vdVar;
        addView(vdVar, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.m = new c(this, 9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.m = null;
    }
}
