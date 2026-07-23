package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w60 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ w60(boolean z, Function0 function0, Function0 function1, int i) {
        this.a = i;
        this.b = z;
        this.c = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function0 function0 = this.d;
        Function0 function1 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(z ? ((Boolean) function1.invoke()).booleanValue() : ((Boolean) function0.invoke()).booleanValue());
            default:
                if (z) {
                    function1.invoke();
                } else if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
