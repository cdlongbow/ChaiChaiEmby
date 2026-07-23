package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nt1 {
    public static final nt1 a;
    public static final nt1 b;
    public static final nt1 c;
    public static final /* synthetic */ nt1[] d;

    static {
        nt1 nt1Var = new nt1("AUTOMATIC", 0);
        a = nt1Var;
        nt1 nt1Var2 = new nt1("HARDWARE", 1);
        b = nt1Var2;
        nt1 nt1Var3 = new nt1("SOFTWARE", 2);
        c = nt1Var3;
        d = new nt1[]{nt1Var, nt1Var2, nt1Var3};
    }

    public static nt1 valueOf(String str) {
        return (nt1) Enum.valueOf(nt1.class, str);
    }

    public static nt1[] values() {
        return (nt1[]) d.clone();
    }
}
