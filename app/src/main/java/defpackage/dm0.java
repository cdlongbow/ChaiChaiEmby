package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class dm0 {
    public static final dm0 a;
    public static final CopyOnWriteArraySet b;
    public static final /* synthetic */ dm0[] c;

    static {
        dm0 dm0Var = new dm0("INSTANCE", 0);
        a = dm0Var;
        c = new dm0[]{dm0Var};
        b = new CopyOnWriteArraySet();
    }

    public static dm0 valueOf(String str) {
        return (dm0) Enum.valueOf(dm0.class, str);
    }

    public static dm0[] values() {
        return (dm0[]) c.clone();
    }
}
