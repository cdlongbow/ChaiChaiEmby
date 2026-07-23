package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cx1 {
    public static final cx1 a;
    public static final cx1 b;
    public static final /* synthetic */ cx1[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        cx1 cx1Var = new cx1("ACCENT", 0);
        a = cx1Var;
        cx1 cx1Var2 = new cx1("SECONDARY", 1);
        b = cx1Var2;
        cx1[] cx1VarArr = {cx1Var, cx1Var2, new cx1("DANGER", 2)};
        c = cx1VarArr;
        d = EnumEntriesKt.enumEntries(cx1VarArr);
    }

    public static cx1 valueOf(String str) {
        return (cx1) Enum.valueOf(cx1.class, str);
    }

    public static cx1[] values() {
        return (cx1[]) c.clone();
    }
}
