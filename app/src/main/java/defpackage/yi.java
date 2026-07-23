package defpackage;


/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseGlShaderProgram b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ yi(BaseGlShaderProgram baseGlShaderProgram, Exception exc, int i) {
        this.a = i;
        this.b = baseGlShaderProgram;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Exception exc = this.c;
        BaseGlShaderProgram baseGlShaderProgram = this.b;
        switch (i) {
            case 0:
                baseGlShaderProgram.lambda$queueInputFrame$1(exc);
                break;
            default:
                baseGlShaderProgram.lambda$onError$2(exc);
                break;
        }
    }
}
