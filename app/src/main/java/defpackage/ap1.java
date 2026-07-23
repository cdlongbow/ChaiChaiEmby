package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes5.dex */
public final class ap1 extends u0 {
    public final KClass a;
    public final List b;
    public final Lazy c;

    public ap1(KClass kClass) {
        kClass.getClass();
        this.a = kClass;
        this.b = CollectionsKt.emptyList();
        this.c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new c71(this, 9));
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return (lw1) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
