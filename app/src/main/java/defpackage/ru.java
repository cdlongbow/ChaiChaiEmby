package defpackage;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.content.UriMatcherCompat;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ru implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ru(Object obj, int i) {
        this.a = i;
        this.b = obj;
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
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((java.util.function.Predicate) obj2).test((ClipData.Item) obj);
            case 1:
                return ((ComponentName) obj2).equals((ComponentName) obj);
            case 2:
                return !((Predicate) obj2).test(obj);
            default:
                return UriMatcherCompat.lambda$asPredicate$0((UriMatcher) obj2, (Uri) obj);
        }
    }
}
