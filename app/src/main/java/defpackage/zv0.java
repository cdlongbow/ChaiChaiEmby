package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zv0 {
    public static final zv0 c = new zv0("COMPOSITION");
    public final List a;
    public aw0 b;

    public zv0(zv0 zv0Var) {
        this.a = new ArrayList(zv0Var.a);
        this.b = zv0Var.b;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007e A[RETURN] */
    public final boolean a(int i, String str) {
        List list = this.a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                boolean z2 = str2.equals(str) || str2.equals("*");
                if ((z || (i == list.size() - 2 && ((String) wn.h(1, list)).equals("**"))) && z2) {
                    return true;
                }
            } else {
                if (z || !((String) list.get(i + 1)).equals(str)) {
                    if (!z) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return ((String) list.get(i2)).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) wn.h(1, list)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zv0.class == obj.getClass()) {
            zv0 zv0Var = (zv0) obj;
            if (!this.a.equals(zv0Var.a)) {
                return false;
            }
            aw0 aw0Var = this.b;
            aw0 aw0Var2 = zv0Var.b;
            if (aw0Var != null) {
                return aw0Var.equals(aw0Var2);
            }
            if (aw0Var2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        aw0 aw0Var = this.b;
        return iHashCode + (aw0Var != null ? aw0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        return wn.i(sb, this.b != null, '}');
    }

    public zv0(String... strArr) {
        this.a = Arrays.asList(strArr);
    }
}
