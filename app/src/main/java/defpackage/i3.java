package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i3 {
    public static final i3 a;
    public static final i3 b;
    public static final i3 c;
    public static final i3 d;
    public static final /* synthetic */ i3[] e;
    public static final /* synthetic */ EnumEntries g;

    static {
        i3 i3Var = new i3("SEARCH", 0);
        a = i3Var;
        i3 i3Var2 = new i3("MEDIA", 1);
        b = i3Var2;
        i3 i3Var3 = new i3("HISTORY", 2);
        c = i3Var3;
        i3 i3Var4 = new i3("FAVORITE", 3);
        d = i3Var4;
        i3[] i3VarArr = {i3Var, i3Var2, i3Var3, i3Var4};
        e = i3VarArr;
        g = EnumEntriesKt.enumEntries(i3VarArr);
    }

    public static i3 valueOf(String str) {
        return (i3) Enum.valueOf(i3.class, str);
    }

    public static i3[] values() {
        return (i3[]) e.clone();
    }
}
