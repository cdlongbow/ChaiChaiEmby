package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wb0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ wb0(int i, boolean z, Function1 function1) {
        this.a = i;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.c;
        boolean z = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                if (z) {
                    function1.invoke(str);
                }
                break;
            case 1:
                str.getClass();
                if (z) {
                    function1.invoke(str);
                }
                break;
            case 2:
                str.getClass();
                if (z) {
                    function1.invoke(str);
                }
                break;
            case 3:
                str.getClass();
                if (z) {
                    function1.invoke(str);
                }
                break;
            default:
                str.getClass();
                if (z) {
                    function1.invoke(str);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
