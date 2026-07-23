package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jp1 {
    public static final jp1 a;
    public static final jp1 b;
    public static final /* synthetic */ jp1[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        jp1 jp1Var = new jp1("EXACT", 0);
        a = jp1Var;
        jp1 jp1Var2 = new jp1("INEXACT", 1);
        b = jp1Var2;
        jp1[] jp1VarArr = {jp1Var, jp1Var2};
        c = jp1VarArr;
        d = EnumEntriesKt.enumEntries(jp1VarArr);
    }

    public static jp1 valueOf(String str) {
        return (jp1) Enum.valueOf(jp1.class, str);
    }

    public static jp1[] values() {
        return (jp1[]) c.clone();
    }
}
