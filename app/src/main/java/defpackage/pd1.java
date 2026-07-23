package defpackage;

import androidx.compose.material3.SwipeToDismissBoxDefaults;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pd1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Density b;

    public /* synthetic */ pd1(Density density, int i) {
        this.a = i;
        this.b = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Density density = this.b;
        switch (i) {
            case 0:
                return PlatformFontVariationSettings_androidKt.toAndroidString$lambda$0(density, (FontVariation.Setting) obj);
            default:
                return Float.valueOf(SwipeToDismissBoxDefaults._get_positionalThreshold_$lambda$2$lambda$1$lambda$0(density, ((Float) obj).floatValue()));
        }
    }
}
