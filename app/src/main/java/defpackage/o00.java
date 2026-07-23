package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class o00 {
    public static final o00 a;
    public static final o00 b;
    public static final o00 c;
    public static final o00 d;
    public static final /* synthetic */ o00[] e;
    public static final /* synthetic */ EnumEntries g;

    static {
        o00 o00Var = new o00("MEMORY_CACHE", 0);
        a = o00Var;
        o00 o00Var2 = new o00("MEMORY", 1);
        b = o00Var2;
        o00 o00Var3 = new o00("DISK", 2);
        c = o00Var3;
        o00 o00Var4 = new o00("NETWORK", 3);
        d = o00Var4;
        o00[] o00VarArr = {o00Var, o00Var2, o00Var3, o00Var4};
        e = o00VarArr;
        g = EnumEntriesKt.enumEntries(o00VarArr);
    }

    public static o00 valueOf(String str) {
        return (o00) Enum.valueOf(o00.class, str);
    }

    public static o00[] values() {
        return (o00[]) e.clone();
    }
}
