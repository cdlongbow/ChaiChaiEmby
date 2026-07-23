package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hu0 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ hu0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return c61.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final Predicate negate() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return new ru(this, 2);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.a;
        return c61.d(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return IntentSanitizer.Builder.lambda$allowExtraOutput$16(str, (Uri) obj);
            case 1:
                return str.equals((String) obj);
            case 2:
                return IntentSanitizer.Builder.lambda$allowComponentWithPackage$9(str, (ComponentName) obj);
            case 3:
                return IntentSanitizer.Builder.lambda$allowDataWithAuthority$8(str, (Uri) obj);
            case 4:
                return IntentSanitizer.Builder.lambda$allowClipDataUriWithAuthority$11(str, (Uri) obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtraStreamUriWithAuthority$15(str, (Uri) obj);
        }
    }
}
