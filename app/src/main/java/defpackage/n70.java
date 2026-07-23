package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n70 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ n70(Function2 function2, String str, String str2, int i) {
        this.a = i;
        this.b = function2;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c, this.d);
                break;
            default:
                this.b.invoke(this.c, this.d);
                break;
        }
        return Unit.INSTANCE;
    }
}
