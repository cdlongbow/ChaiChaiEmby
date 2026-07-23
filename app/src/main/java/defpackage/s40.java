package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s40 {
    public static final s40 a;
    public static final s40 b;
    public static final /* synthetic */ s40[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        s40 s40Var = new s40("HEADER_ACTION", 0);
        a = s40Var;
        s40 s40Var2 = new s40("EPISODE_RAIL", 1);
        b = s40Var2;
        s40[] s40VarArr = {s40Var, s40Var2};
        c = s40VarArr;
        d = EnumEntriesKt.enumEntries(s40VarArr);
    }

    public static s40 valueOf(String str) {
        return (s40) Enum.valueOf(s40.class, str);
    }

    public static s40[] values() {
        return (s40[]) c.clone();
    }
}
