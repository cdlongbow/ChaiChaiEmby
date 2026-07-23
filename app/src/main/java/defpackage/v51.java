package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class v51 {
    public static final v51 a;
    public static final v51 b;
    public static final v51 c;
    public static final /* synthetic */ v51[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        v51 v51Var = new v51("VERSION", 0);
        a = v51Var;
        v51 v51Var2 = new v51("AUDIO", 1);
        b = v51Var2;
        v51 v51Var3 = new v51("SUBTITLE", 2);
        c = v51Var3;
        v51[] v51VarArr = {v51Var, v51Var2, v51Var3};
        d = v51VarArr;
        e = EnumEntriesKt.enumEntries(v51VarArr);
    }

    public static v51 valueOf(String str) {
        return (v51) Enum.valueOf(v51.class, str);
    }

    public static v51[] values() {
        return (v51[]) d.clone();
    }
}
