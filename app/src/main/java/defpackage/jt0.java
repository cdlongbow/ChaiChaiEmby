package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jt0 {
    public static final ri a;
    public static final ri b;

    static {
        try {
            a = new ri(lt0.class.getDeclaredField("map"));
            try {
                b = new ri(lt0.class.getDeclaredField("size"));
            } catch (NoSuchFieldException e) {
                lm.d(e);
            }
        } catch (NoSuchFieldException e2) {
            lm.d(e2);
        }
    }
}
