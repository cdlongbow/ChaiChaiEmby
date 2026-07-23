package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qx0 {
    public static final qx0 a;
    public static final qx0 b;
    public static final /* synthetic */ qx0[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        qx0 qx0Var = new qx0("DIRECTORY", 0);
        a = qx0Var;
        qx0 qx0Var2 = new qx0("AGGREGATE", 1);
        b = qx0Var2;
        qx0[] qx0VarArr = {qx0Var, qx0Var2};
        c = qx0VarArr;
        d = EnumEntriesKt.enumEntries(qx0VarArr);
    }

    public static qx0 valueOf(String str) {
        return (qx0) Enum.valueOf(qx0.class, str);
    }

    public static qx0[] values() {
        return (qx0[]) c.clone();
    }
}
