package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ue2 {
    public static final ue2 a;
    public static final ue2 b;
    public static final ue2 c;
    public static final /* synthetic */ ue2[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ue2 ue2Var = new ue2("SUCCESS", 0);
        a = ue2Var;
        ue2 ue2Var2 = new ue2("ERROR", 1);
        b = ue2Var2;
        ue2 ue2Var3 = new ue2("INFO", 2);
        c = ue2Var3;
        ue2[] ue2VarArr = {ue2Var, ue2Var2, ue2Var3};
        d = ue2VarArr;
        e = EnumEntriesKt.enumEntries(ue2VarArr);
    }

    public static ue2 valueOf(String str) {
        return (ue2) Enum.valueOf(ue2.class, str);
    }

    public static ue2[] values() {
        return (ue2[]) d.clone();
    }
}
