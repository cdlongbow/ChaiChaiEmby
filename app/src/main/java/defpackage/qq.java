package defpackage;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qq extends ViewModel {
    public final uf0 a = new uf0();
    public String b;
    public final MutableStateFlow c;
    public final StateFlow d;

    public qq() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(nq.a);
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
    }
}
