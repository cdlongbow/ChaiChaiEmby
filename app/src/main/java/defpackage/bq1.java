package defpackage;


/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bq1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bq1(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj, int i2) {
        this.a = i2;
        this.b = diagnosticsCallback;
        this.c = i;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onResultReceived(this.c, this.d);
                break;
            default:
                this.b.onDiagnosticReceived(this.c, this.d);
                break;
        }
    }
}
