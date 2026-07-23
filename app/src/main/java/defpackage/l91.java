package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class l91 {
    public int a;
    public Object b;

    public l91(int i) {
        switch (i) {
            case 1:
                this.b = new LinkedHashMap();
                break;
            default:
                this.a = 255;
                this.b = null;
                break;
        }
    }

    public void a() {
        int i = this.a;
        this.a = i + 1;
        if (i >= 10) {
            this.a = 0;
            Iterator it = ((LinkedHashMap) this.b).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    us1 us1Var = (us1) CollectionsKt.firstOrNull((List) arrayList);
                    if ((us1Var != null ? (pr0) us1Var.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((us1) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public boolean b() {
        return ((yc0) this.b) != null;
    }

    public void c(g41 g41Var, pr0 pr0Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        Object arrayList = linkedHashMap.get(g41Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(g41Var, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        us1 us1Var = new us1(new WeakReference(pr0Var), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(us1Var);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                us1 us1Var2 = (us1) arrayList2.get(i);
                if (j >= us1Var2.c) {
                    if (us1Var2.a.get() == pr0Var) {
                        arrayList2.set(i, us1Var);
                        break;
                    } else {
                        arrayList2.add(i, us1Var);
                        break;
                    }
                }
            }
        }
        a();
    }
}
