package defpackage;

import androidx.window.layout.SafeWindowLayoutComponentProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ju1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SafeWindowLayoutComponentProvider b;

    public /* synthetic */ ju1(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, int i) {
        this.a = i;
        this.b = safeWindowLayoutComponentProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean zIsWindowLayoutProviderValid$lambda$0;
        int i = this.a;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = this.b;
        switch (i) {
            case 0:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isWindowLayoutProviderValid$lambda$0(safeWindowLayoutComponentProvider);
                break;
            case 1:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isFoldingFeatureValid$lambda$1(safeWindowLayoutComponentProvider);
                break;
            case 2:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isSupportedWindowFeaturesValid$lambda$5(safeWindowLayoutComponentProvider);
                break;
            case 3:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isDisplayFoldFeatureValid$lambda$4(safeWindowLayoutComponentProvider);
                break;
            case 4:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isGetSupportedWindowFeaturesValid$lambda$6(safeWindowLayoutComponentProvider);
                break;
            case 5:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isMethodWindowLayoutInfoListenerJavaConsumerValid$lambda$2(safeWindowLayoutComponentProvider);
                break;
            default:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isMethodWindowLayoutInfoListenerWindowConsumerValid$lambda$3(safeWindowLayoutComponentProvider);
                break;
        }
        return Boolean.valueOf(zIsWindowLayoutProviderValid$lambda$0);
    }
}
