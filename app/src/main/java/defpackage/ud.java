package defpackage;

import android.graphics.Bitmap;
import io.github.peerless2012.ass.AssFrame;
import io.github.peerless2012.ass.AssRender;
import io.github.peerless2012.ass.AssTex;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ud implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd b;

    public /* synthetic */ ud(vd vdVar, int i) {
        this.a = i;
        this.b = vdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AssTex[] images;
        int i = this.a;
        vd vdVar = this.b;
        switch (i) {
            case 0:
                AssFrame assFrame = (AssFrame) obj;
                if (assFrame == null || assFrame.getChanged() != 0) {
                    if (assFrame != null && (images = assFrame.getImages()) != null) {
                        for (AssTex assTex : images) {
                            Bitmap bitmap = assTex.getBitmap();
                            if (bitmap != null) {
                                bitmap.prepareToDraw();
                            }
                        }
                    }
                    vdVar.d = assFrame;
                    vdVar.getHandler().post(vdVar.g);
                }
                break;
            default:
                AssRender assRender = (AssRender) obj;
                kd kdVar = vdVar.c;
                if (kdVar != null) {
                    kdVar.c.shutdown();
                }
                vdVar.c = null;
                if (assRender != null) {
                    vdVar.c = new kd(assRender);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
