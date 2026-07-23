package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cs implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a20 b;

    public /* synthetic */ cs(a20 a20Var, int i) {
        this.a = i;
        this.b = a20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        a20 a20Var = this.b;
        switch (i) {
            case 0:
                break;
        }
        return CollectionsKt.listOf(a20Var);
    }
}
