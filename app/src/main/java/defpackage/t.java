package defpackage;


/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class t {
    public static /* synthetic */ boolean a(Unsafe unsafe, y yVar, long j, m mVar, m mVar2) {
        while (!unsafe.compareAndSwapObject(yVar, j, mVar, mVar2)) {
            if (unsafe.getObject(yVar, j) != mVar) {
                return false;
            }
        }
        return true;
    }
}
