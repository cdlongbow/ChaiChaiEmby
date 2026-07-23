package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q92 {
    public static final q92 a;
    public static final q92 b;
    public static final q92 c;
    public static final /* synthetic */ q92[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        q92 q92Var = new q92("SUCCESS", 0);
        a = q92Var;
        q92 q92Var2 = new q92("ERROR", 1);
        b = q92Var2;
        q92 q92Var3 = new q92("INFO", 2);
        c = q92Var3;
        q92[] q92VarArr = {q92Var, q92Var2, q92Var3};
        d = q92VarArr;
        e = EnumEntriesKt.enumEntries(q92VarArr);
    }

    public static q92 valueOf(String str) {
        return (q92) Enum.valueOf(q92.class, str);
    }

    public static q92[] values() {
        return (q92[]) d.clone();
    }
}
