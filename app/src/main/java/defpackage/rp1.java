package defpackage;

public abstract class rp1 implements lp1 {
    public static final np1 a;
    public static final rp1[] b;

    static {
        np1 np1Var = new np1();
        a = np1Var;
        b = new rp1[]{np1Var, new rp1() {
            @Override
            public final boolean apply(Object obj) {
                return false;
            }

            @Override
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new rp1() {
            @Override
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new rp1() {
            @Override
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }
}