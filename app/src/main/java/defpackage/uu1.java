package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class uu1 {
    public static final uu1 a;
    public static final uu1 b;
    public static final /* synthetic */ uu1[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        uu1 uu1Var = new uu1("FILL", 0);
        a = uu1Var;
        uu1 uu1Var2 = new uu1("FIT", 1);
        b = uu1Var2;
        uu1[] uu1VarArr = {uu1Var, uu1Var2};
        c = uu1VarArr;
        d = EnumEntriesKt.enumEntries(uu1VarArr);
    }

    public static uu1 valueOf(String str) {
        return (uu1) Enum.valueOf(uu1.class, str);
    }

    public static uu1[] values() {
        return (uu1[]) c.clone();
    }
}
