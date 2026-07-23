package defpackage;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.data.preferences.DanmakuPreferences;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class c00 extends AndroidViewModel {
    public final DanmakuPreferences a;
    public final MutableStateFlow b;
    public final StateFlow c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(Application application) {
        super(application);
        application.getClass();
        DanmakuPreferences danmakuPreferences = new DanmakuPreferences(application);
        this.a = danmakuPreferences;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new DanmakuConfig(false, null, null, null, null, false, 63, null));
        this.b = MutableStateFlow;
        this.c = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow.setValue(danmakuPreferences.getDanmakuConfig());
    }
}
