package defpackage;


/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DefaultVideoFrameProcessor b;
    public final /* synthetic */ InterruptedException c;

    public /* synthetic */ i40(DefaultVideoFrameProcessor defaultVideoFrameProcessor, InterruptedException interruptedException, int i) {
        this.a = i;
        this.b = defaultVideoFrameProcessor;
        this.c = interruptedException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        InterruptedException interruptedException = this.c;
        DefaultVideoFrameProcessor defaultVideoFrameProcessor = this.b;
        switch (i) {
            case 0:
                defaultVideoFrameProcessor.lambda$registerInputStream$1(interruptedException);
                break;
            default:
                defaultVideoFrameProcessor.lambda$flush$4(interruptedException);
                break;
        }
    }
}
