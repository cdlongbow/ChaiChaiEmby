package defpackage;




/* JADX INFO: loaded from: classes4.dex */
public final class es {
    public static final ObjectMap b = new ObjectMap();
    public static int c = 0;
    public final int a;

    public es() {
        int i = c;
        c = i + 1;
        this.a = i;
    }

    public static Bits a(Class... clsArr) {
        Bits bits = new Bits();
        for (Class cls : clsArr) {
            bits.set(b(cls).a);
        }
        return bits;
    }

    public static es b(Class cls) {
        ObjectMap objectMap = b;
        es esVar = (es) objectMap.get(cls);
        if (esVar != null) {
            return esVar;
        }
        es esVar2 = new es();
        objectMap.put(cls, esVar2);
        return esVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && es.class == obj.getClass() && this.a == ((es) obj).a;
    }

}
