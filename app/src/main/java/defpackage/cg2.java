package defpackage;

import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.window.layout.WindowMetricsCalculator;
import kotlin.jvm.functions.Function1;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cg2 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ cg2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((WindowInsetsHolder) obj).getSafeDrawing();
            case 1:
                return ((WindowInsetsHolder) obj).getCaptionBar();
            case 2:
                return ((WindowInsetsHolder) obj).getWaterfall();
            case 3:
                return ((WindowInsetsHolder) obj).getSystemGestures();
            case 4:
                return ((WindowInsetsHolder) obj).getMandatorySystemGestures();
            case 5:
                return ((WindowInsetsHolder) obj).getSafeGestures();
            case 6:
                return ((WindowInsetsHolder) obj).getSafeContent();
            case 7:
                return ((WindowInsetsHolder) obj).getSystemBars();
            case 8:
                return ((WindowInsetsHolder) obj).getDisplayCutout();
            case 9:
                return ((WindowInsetsHolder) obj).getStatusBars();
            case 10:
                return ((WindowInsetsHolder) obj).getIme();
            case 11:
                return ((WindowInsetsHolder) obj).getNavigationBars();
            case 12:
                return WindowMetricsCalculator.Companion.reset$lambda$1((WindowMetricsCalculator) obj);
            case 13:
                return WindowMetricsCalculator.Companion.decorator$lambda$0((WindowMetricsCalculator) obj);
            default:
                return Boolean.valueOf(ZipFilesKt.openZip$lambda$0((ZipEntry) obj));
        }
    }
}
