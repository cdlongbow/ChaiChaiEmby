package defpackage;

import androidx.compose.foundation.style.StyleInnerNode;
import androidx.compose.material3.carousel.Arrangement;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.KeylinesKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ float d;

    public /* synthetic */ hw0(Placeable placeable, float f, float f2) {
        this.a = 2;
        this.c = placeable;
        this.b = f;
        this.d = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.d;
        float f2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return KeylinesKt.createLeftAlignedKeylineList$lambda$10(f2, (Arrangement) obj2, f, (KeylineListScope) obj);
            case 1:
                return KeylinesKt.createCenterAlignedKeylineList$lambda$16(f2, (Arrangement) obj2, f, (KeylineListScope) obj);
            default:
                return StyleInnerNode.measure_3p2s80s$lambda$0((Placeable) obj2, f2, f, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ hw0(float f, Arrangement arrangement, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = arrangement;
        this.d = f2;
    }
}
