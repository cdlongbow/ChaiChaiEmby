package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jc2 {
    public static final jc2 a;
    public static final jc2 b;
    public static final jc2 c;
    public static final jc2 d;
    public static final jc2 e;
    public static final jc2 g;
    public static final /* synthetic */ jc2[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        jc2 jc2Var = new jc2("LIST", 0);
        a = jc2Var;
        jc2 jc2Var2 = new jc2(HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_PRIMARY, 1);
        b = jc2Var2;
        jc2 jc2Var3 = new jc2("SECONDARY", 2);
        c = jc2Var3;
        jc2 jc2Var4 = new jc2("POSITIVE", 3);
        d = jc2Var4;
        jc2 jc2Var5 = new jc2("DANGER", 4);
        e = jc2Var5;
        jc2 jc2Var6 = new jc2("OUTLINED", 5);
        g = jc2Var6;
        jc2[] jc2VarArr = {jc2Var, jc2Var2, jc2Var3, jc2Var4, jc2Var5, jc2Var6};
        h = jc2VarArr;
        i = EnumEntriesKt.enumEntries(jc2VarArr);
    }

    public static jc2 valueOf(String str) {
        return (jc2) Enum.valueOf(jc2.class, str);
    }

    public static jc2[] values() {
        return (jc2[]) h.clone();
    }
}
