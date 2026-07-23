package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class di0 {
    public static final di0 a;
    public static final di0 b;
    public static final /* synthetic */ di0[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        di0 di0Var = new di0("StandardView", 0);
        a = di0Var;
        di0 di0Var2 = new di0("MiTvSchemePlay", 1);
        b = di0Var2;
        di0[] di0VarArr = {di0Var, di0Var2};
        c = di0VarArr;
        d = EnumEntriesKt.enumEntries(di0VarArr);
    }

    public static di0 valueOf(String str) {
        return (di0) Enum.valueOf(di0.class, str);
    }

    public static di0[] values() {
        return (di0[]) c.clone();
    }
}
