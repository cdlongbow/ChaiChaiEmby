package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class sn0 {
    public static final sn0 a;
    public static final sn0 b;
    public static final sn0 c;
    public static final /* synthetic */ sn0[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        sn0 sn0Var = new sn0("UNCHANGED", 0);
        a = sn0Var;
        sn0 sn0Var2 = new sn0("SHOW", 1);
        b = sn0Var2;
        sn0 sn0Var3 = new sn0("HIDE", 2);
        c = sn0Var3;
        sn0[] sn0VarArr = {sn0Var, sn0Var2, sn0Var3};
        d = sn0VarArr;
        e = EnumEntriesKt.enumEntries(sn0VarArr);
    }

    public static sn0 valueOf(String str) {
        return (sn0) Enum.valueOf(sn0.class, str);
    }

    public static sn0[] values() {
        return (sn0[]) d.clone();
    }
}
