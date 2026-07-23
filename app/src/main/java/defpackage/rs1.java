package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class rs1 {
    public final LinkedHashMap a = new LinkedHashMap(0, 0.75f, true);
    public long b;
    public long c;
    public final /* synthetic */ ss1 d;

    public rs1(ss1 ss1Var, long j) {
        this.d = ss1Var;
        this.b = j;
        if (j > 0) {
            return;
        }
        ra.q("maxSize <= 0");
        throw null;
    }

    public final void a(Object obj, Object obj2, qs1 qs1Var) {
        qs1 qs1Var2 = (qs1) obj2;
        this.d.b.c((g41) obj, qs1Var2.a, qs1Var2.b, qs1Var2.c);
    }

    public final long b() {
        if (this.c == -1) {
            long jC = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                jC += c(entry.getKey(), entry.getValue());
            }
            this.c = jC;
        }
        return this.c;
    }

    public final long c(Object obj, Object obj2) throws Exception {
        try {
            long j = ((qs1) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.c = -1L;
            throw e;
        }
    }

    public final void d(long j) {
        while (b() > j) {
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.isEmpty()) {
                if (b() == 0) {
                    return;
                }
                rd1.o("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) CollectionsKt.first(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.c = b() - c(key, value);
                a(key, value, null);
            }
        }
    }
}
