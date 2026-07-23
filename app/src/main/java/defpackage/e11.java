package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e11 {
    public static final e11 a;
    public static final e11 b;
    public static final e11 c;
    public static final e11 d;
    public static final e11 e;
    public static final e11 g;
    public static final /* synthetic */ e11[] h;

    static {
        e11 e11Var = new e11("SET_ANIMATION", 0);
        a = e11Var;
        e11 e11Var2 = new e11("SET_PROGRESS", 1);
        b = e11Var2;
        e11 e11Var3 = new e11("SET_REPEAT_MODE", 2);
        c = e11Var3;
        e11 e11Var4 = new e11("SET_REPEAT_COUNT", 3);
        d = e11Var4;
        e11 e11Var5 = new e11("SET_IMAGE_ASSETS", 4);
        e = e11Var5;
        e11 e11Var6 = new e11("PLAY_OPTION", 5);
        g = e11Var6;
        h = new e11[]{e11Var, e11Var2, e11Var3, e11Var4, e11Var5, e11Var6};
    }

    public static e11 valueOf(String str) {
        return (e11) Enum.valueOf(e11.class, str);
    }

    public static e11[] values() {
        return (e11[]) h.clone();
    }
}
