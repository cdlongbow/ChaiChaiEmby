package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class x82 {
    public static final x82 a;
    public static final x82 b;
    public static final /* synthetic */ x82[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        x82 x82Var = new x82("SERVER", 0);
        a = x82Var;
        x82 x82Var2 = new x82("MEDIA", 1);
        b = x82Var2;
        x82[] x82VarArr = {x82Var, x82Var2};
        c = x82VarArr;
        d = EnumEntriesKt.enumEntries(x82VarArr);
    }

    public static x82 valueOf(String str) {
        return (x82) Enum.valueOf(x82.class, str);
    }

    public static x82[] values() {
        return (x82[]) c.clone();
    }
}
