package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zj0 {
    public static final zj0 a;
    public static final zj0 b;
    public static final zj0 c;
    public static final zj0 d;
    public static final /* synthetic */ zj0[] e;
    public static final /* synthetic */ EnumEntries g;

    static {
        zj0 zj0Var = new zj0("SERIES", 0);
        a = zj0Var;
        zj0 zj0Var2 = new zj0("MOVIE", 1);
        b = zj0Var2;
        zj0 zj0Var3 = new zj0("EPISODE", 2);
        c = zj0Var3;
        zj0 zj0Var4 = new zj0("BOX_SET", 3);
        d = zj0Var4;
        zj0[] zj0VarArr = {zj0Var, zj0Var2, zj0Var3, zj0Var4};
        e = zj0VarArr;
        g = EnumEntriesKt.enumEntries(zj0VarArr);
    }

    public static zj0 valueOf(String str) {
        return (zj0) Enum.valueOf(zj0.class, str);
    }

    public static zj0[] values() {
        return (zj0[]) e.clone();
    }
}
