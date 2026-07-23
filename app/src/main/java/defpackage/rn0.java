package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class rn0 {
    public static final rn0 a;
    public static final rn0 b;
    public static final rn0 c;
    public static final /* synthetic */ rn0[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        rn0 rn0Var = new rn0("MEDIA", 0);
        a = rn0Var;
        rn0 rn0Var2 = new rn0("FAVORITE", 1);
        b = rn0Var2;
        rn0 rn0Var3 = new rn0("SEARCH", 2);
        c = rn0Var3;
        rn0[] rn0VarArr = {rn0Var, rn0Var2, rn0Var3};
        d = rn0VarArr;
        e = EnumEntriesKt.enumEntries(rn0VarArr);
    }

    public static rn0 valueOf(String str) {
        return (rn0) Enum.valueOf(rn0.class, str);
    }

    public static rn0[] values() {
        return (rn0[]) d.clone();
    }
}
