package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ya2 {
    public static final ya2 a;
    public static final ya2 b;
    public static final ya2 c;
    public static final /* synthetic */ ya2[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ya2 ya2Var = new ya2("START", 0);
        a = ya2Var;
        ya2 ya2Var2 = new ya2("PAUSE", 1);
        b = ya2Var2;
        ya2 ya2Var3 = new ya2("STOP", 2);
        c = ya2Var3;
        ya2[] ya2VarArr = {ya2Var, ya2Var2, ya2Var3};
        d = ya2VarArr;
        e = EnumEntriesKt.enumEntries(ya2VarArr);
    }

    public static ya2 valueOf(String str) {
        return (ya2) Enum.valueOf(ya2.class, str);
    }

    public static ya2[] values() {
        return (ya2[]) d.clone();
    }
}
