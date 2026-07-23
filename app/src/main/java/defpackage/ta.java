package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ta extends si {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta(List list, int i) {
        super(list);
        this.b = i;
    }

    @Override // defpackage.db
    public final ej a() {
        switch (this.b) {
            case 0:
                return new vq(this.a, 0);
            case 1:
                return new lm0(this.a, 0);
            case 2:
                return new vq(this.a, 1);
            case 3:
                return new lm0(this.a, 1);
            case 4:
                return new lm0(this.a, 2);
            case 5:
                return new sz1(this.a);
            default:
                return new vq(this.a, 2);
        }
    }
}
