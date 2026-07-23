package defpackage;


/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ boolean a(Unsafe unsafe, y yVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(yVar, j, obj, obj2)) {
            if (unsafe.getObject(yVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
