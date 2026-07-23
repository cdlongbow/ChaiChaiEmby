package defpackage;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kp1 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kp1(Class cls, Predicate predicate) {
        this.a = 2;
        this.c = cls;
        this.b = predicate;
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
                return this.b.test(obj) || ((Predicate) this.c).test(obj);
            case 1:
                return this.b.test(obj) && ((Predicate) this.c).test(obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.c, this.b, obj);
        }
    }

    public /* synthetic */ kp1(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }
}
