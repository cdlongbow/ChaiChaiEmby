package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bu0 {
    public static final bu0 a;
    public static final bu0 b;
    public static final bu0 c;
    public static final /* synthetic */ bu0[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        bu0 bu0Var = new bu0("STARTED", 0);
        a = bu0Var;
        bu0 bu0Var2 = new bu0("NEED_UNKNOWN_SOURCES_PERMISSION", 1);
        b = bu0Var2;
        bu0 bu0Var3 = new bu0("FAILED", 2);
        c = bu0Var3;
        bu0[] bu0VarArr = {bu0Var, bu0Var2, bu0Var3};
        d = bu0VarArr;
        e = EnumEntriesKt.enumEntries(bu0VarArr);
    }

    public static bu0 valueOf(String str) {
        return (bu0) Enum.valueOf(bu0.class, str);
    }

    public static bu0[] values() {
        return (bu0[]) d.clone();
    }
}
