package defpackage;


/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class s {
    public static /* synthetic */ boolean a(Unsafe unsafe, y yVar, long j, x xVar, x xVar2) {
        while (!unsafe.compareAndSwapObject(yVar, j, xVar, xVar2)) {
            if (unsafe.getObject(yVar, j) != xVar) {
                return false;
            }
        }
        return true;
    }
}
