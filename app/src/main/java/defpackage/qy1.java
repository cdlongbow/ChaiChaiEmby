package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qy1 {
    public static final qy1 a;
    public static final qy1 b;
    public static final /* synthetic */ qy1[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        qy1 qy1Var = new qy1("MOVE_UP", 0);
        a = qy1Var;
        qy1 qy1Var2 = new qy1("MOVE_DOWN", 1);
        b = qy1Var2;
        qy1[] qy1VarArr = {qy1Var, qy1Var2};
        c = qy1VarArr;
        d = EnumEntriesKt.enumEntries(qy1VarArr);
    }

    public static qy1 valueOf(String str) {
        return (qy1) Enum.valueOf(qy1.class, str);
    }

    public static qy1[] values() {
        return (qy1[]) c.clone();
    }
}
