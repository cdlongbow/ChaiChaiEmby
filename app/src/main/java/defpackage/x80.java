package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.ContentScale;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x80 implements es0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    public x80(String str, List list, MutableState mutableState, MutableState mutableState2) {
        this.a = 2;
        this.b = list;
        this.c = mutableState;
        this.d = mutableState2;
    }

    @Override // defpackage.es0
    public final void b(h52 h52Var) {
        int i = this.a;
        MutableState mutableState = this.d;
        switch (i) {
            case 0:
                pr0 pr0Var = h52Var.a;
                mutableState.setValue(pr0Var.getHeight() > pr0Var.getWidth() ? ContentScale.INSTANCE.getFit() : ContentScale.INSTANCE.getCrop());
                break;
            case 1:
                pr0 pr0Var2 = h52Var.a;
                mutableState.setValue(pr0Var2.getHeight() > pr0Var2.getWidth() ? ContentScale.INSTANCE.getFit() : ContentScale.INSTANCE.getCrop());
                break;
            default:
                pr0 pr0Var3 = h52Var.a;
                mutableState.setValue(pr0Var3.getHeight() > pr0Var3.getWidth() ? ContentScale.INSTANCE.getFit() : ContentScale.INSTANCE.getCrop());
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.es0
    public final void g(xg0 xg0Var) {
        int i = this.a;
        List list = this.b;
        MutableState mutableState = this.c;
        switch (i) {
            case 0:
                if (((Number) mutableState.getValue()).intValue() < list.size() - 1) {
                    mr.A((Number) mutableState.getValue(), 1, mutableState);
                }
                break;
            case 1:
                if (((Number) mutableState.getValue()).intValue() < list.size() - 1) {
                    mr.A((Number) mutableState.getValue(), 1, mutableState);
                }
                break;
            default:
                bq0.U(mutableState);
                xg0Var.c.getMessage();
                if (((Number) mutableState.getValue()).intValue() < list.size() - 1) {
                    mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
                    ((Number) mutableState.getValue()).intValue();
                }
                break;
        }
    }

    public /* synthetic */ x80(List list, MutableState mutableState, MutableState mutableState2, int i) {
        this.a = i;
        this.b = list;
        this.c = mutableState;
        this.d = mutableState2;
    }
}
