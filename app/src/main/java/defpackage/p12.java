package defpackage;

import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p12 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SliderColors b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p12(SliderColors sliderColors, boolean z, int i) {
        this.a = i;
        this.b = sliderColors;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        DrawScope drawScope = (DrawScope) obj;
        Offset offset = (Offset) obj2;
        switch (this.a) {
            case 0:
                return SliderDefaults.Track_mnvyFg4$lambda$19$lambda$18(this.b, this.c, drawScope, offset);
            case 1:
                return SliderDefaults.Track_4EFweAY$lambda$35$lambda$34(this.b, this.c, drawScope, offset);
            case 2:
                return SliderDefaults.CenteredTrack_7LSsfP0$lambda$23$lambda$22(this.b, this.c, drawScope, offset);
            case 3:
                return SliderDefaults.Track_4EFweAY$lambda$15$lambda$14(this.b, this.c, drawScope, offset);
            default:
                return SliderDefaults.Track_mnvyFg4$lambda$39$lambda$38(this.b, this.c, drawScope, offset);
        }
    }
}
