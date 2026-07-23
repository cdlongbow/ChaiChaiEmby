package defpackage;

import androidx.window.SafeWindowExtensionsProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iu1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SafeWindowExtensionsProvider b;

    public /* synthetic */ iu1(SafeWindowExtensionsProvider safeWindowExtensionsProvider, int i) {
        this.a = i;
        this.b = safeWindowExtensionsProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SafeWindowExtensionsProvider safeWindowExtensionsProvider = this.b;
        switch (i) {
            case 0:
                return SafeWindowExtensionsProvider.isWindowExtensionsPresent$lambda$1(safeWindowExtensionsProvider);
            default:
                return Boolean.valueOf(SafeWindowExtensionsProvider.isWindowExtensionsValid$lambda$0(safeWindowExtensionsProvider));
        }
    }
}
