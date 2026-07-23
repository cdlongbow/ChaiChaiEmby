package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jb2 {
    public static final jb2 a;
    public static final jb2 b;
    public static final /* synthetic */ jb2[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        jb2 jb2Var = new jb2("EMBY_TO_TRAKT", 0);
        a = jb2Var;
        jb2 jb2Var2 = new jb2("TRAKT_TO_EMBY", 1);
        b = jb2Var2;
        jb2[] jb2VarArr = {jb2Var, jb2Var2};
        c = jb2VarArr;
        d = EnumEntriesKt.enumEntries(jb2VarArr);
    }

    public static jb2 valueOf(String str) {
        return (jb2) Enum.valueOf(jb2.class, str);
    }

    public static jb2[] values() {
        return (jb2[]) c.clone();
    }
}
