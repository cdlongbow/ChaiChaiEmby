package defpackage;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gu0 implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ gu0(int i) {
        this.a = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                IntentSanitizer.lambda$sanitizeByThrowing$1(str);
                break;
            default:
                IntentSanitizer.lambda$sanitizeByFiltering$0(str);
                break;
        }
    }
}
