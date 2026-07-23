package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qf {
    public static final qf a;
    public static final qf b;
    public static final /* synthetic */ qf[] c;

    static {
        qf qfVar = new qf("AUTOMATIC", 0);
        a = qfVar;
        qf qfVar2 = new qf("ENABLED", 1);
        b = qfVar2;
        c = new qf[]{qfVar, qfVar2, new qf("DISABLED", 2)};
    }

    public static qf valueOf(String str) {
        return (qf) Enum.valueOf(qf.class, str);
    }

    public static qf[] values() {
        return (qf[]) c.clone();
    }
}
