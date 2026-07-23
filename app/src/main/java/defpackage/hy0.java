package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hy0 {
    public static final hy0 a;
    public static final hy0 b;
    public static final /* synthetic */ hy0[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        hy0 hy0Var = new hy0("MOVE_UP", 0);
        a = hy0Var;
        hy0 hy0Var2 = new hy0("MOVE_DOWN", 1);
        b = hy0Var2;
        hy0[] hy0VarArr = {hy0Var, hy0Var2};
        c = hy0VarArr;
        d = EnumEntriesKt.enumEntries(hy0VarArr);
    }

    public static hy0 valueOf(String str) {
        return (hy0) Enum.valueOf(hy0.class, str);
    }

    public static hy0[] values() {
        return (hy0[]) c.clone();
    }
}
