package defpackage;

import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iu0 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ iu0(int i) {
        this.a = i;
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
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
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
        switch (this.a) {
            case 0:
                return IntentSanitizer.Builder.lambda$allowAnyComponent$10((ComponentName) obj);
            case 1:
                return IntentSanitizer.Builder.lambda$allowExtra$14(obj);
            case 2:
                return IntentSanitizer.Builder.lambda$new$0((String) obj);
            case 3:
                return IntentSanitizer.Builder.lambda$new$1((Uri) obj);
            case 4:
                return IntentSanitizer.Builder.lambda$new$2((String) obj);
            case 5:
                return IntentSanitizer.Builder.lambda$new$3((String) obj);
            case 6:
                return IntentSanitizer.Builder.lambda$new$4((String) obj);
            case 7:
                return IntentSanitizer.Builder.lambda$new$5((ComponentName) obj);
            case 8:
                return IntentSanitizer.Builder.lambda$new$6((Uri) obj);
            case 9:
                return IntentSanitizer.Builder.lambda$new$7((ClipData) obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtra$12(obj);
        }
    }
}
