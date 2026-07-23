package defpackage;


/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExperimentalBitmapProcessor b;
    public final /* synthetic */ int c;

    public /* synthetic */ qh0(ExperimentalBitmapProcessor experimentalBitmapProcessor, int i, int i2) {
        this.a = i2;
        this.b = experimentalBitmapProcessor;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        ExperimentalBitmapProcessor experimentalBitmapProcessor = this.b;
        switch (i) {
            case 0:
                experimentalBitmapProcessor.lambda$setEffectsAsync$2(i2);
                break;
            default:
                experimentalBitmapProcessor.lambda$applyEffectsAsync$5(i2);
                break;
        }
    }
}
