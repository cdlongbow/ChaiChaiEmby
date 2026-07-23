package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class th1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;

    public /* synthetic */ th1(ih1 ih1Var, int i) {
        this.a = i;
        this.b = ih1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ih1 ih1Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ih1Var.a.setValue(bool);
                break;
            case 1:
                Long l = (Long) obj;
                l.longValue();
                ih1Var.h.setValue(l);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ih1Var.a.setValue(bool2);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ih1Var.a.setValue(bool3);
                break;
            case 4:
                Long l2 = (Long) obj;
                l2.longValue();
                ih1Var.h.setValue(l2);
                break;
            case 5:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                ih1Var.e.setValue(bool4);
                break;
            case 6:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                ih1Var.b.setValue(bool5);
                break;
            case 7:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                ih1Var.c.setValue(bool6);
                break;
            case 8:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                ih1Var.a.setValue(bool7);
                break;
            case 9:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                ih1Var.a.setValue(bool8);
                break;
            case 10:
                ih1Var.d.setValue((nv) obj);
                break;
            default:
                Long l3 = (Long) obj;
                l3.longValue();
                ih1Var.h.setValue(l3);
                break;
        }
        return Unit.INSTANCE;
    }
}
