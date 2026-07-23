package defpackage;

import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FloatProducer b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ w71(FloatProducer floatProducer, float f, boolean z, int i) {
        this.a = i;
        this.b = floatProducer;
        this.c = f;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return NavigationDrawerKt.horizontalScaleUp$lambda$54(this.b, this.c, this.d, (GraphicsLayerScope) obj);
            default:
                return NavigationDrawerKt.horizontalScaleDown$lambda$55(this.b, this.c, this.d, (GraphicsLayerScope) obj);
        }
    }
}
