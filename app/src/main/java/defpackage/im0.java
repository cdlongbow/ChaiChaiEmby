package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class im0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ GapComposer b;

    public /* synthetic */ im0(GapComposer gapComposer, int i) {
        this.a = i;
        this.b = gapComposer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        GapComposer gapComposer = this.b;
        switch (i) {
            case 0:
                break;
        }
        return gapComposer.currentStackTrace();
    }
}
