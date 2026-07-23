package defpackage;

import androidx.lifecycle.ViewModel;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class w2 extends ViewModel {
    public ServerPreferences a;
    public final uf0 b = new uf0();
    public final MutableStateFlow c;
    public final StateFlow d;

    public w2() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(r2.a);
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
    }
}
