package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ky implements Function0 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ DanmakuEpisode b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;

    public ky(Map map, DanmakuEpisode danmakuEpisode, int i, MutableState mutableState, MutableState mutableState2) {
        this.a = map;
        this.b = danmakuEpisode;
        this.c = i;
        this.d = mutableState;
        this.e = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = (String) this.a.get(Long.valueOf(this.b.getEpisodeId()));
        if (str != null) {
            MutableState mutableState = this.d;
            if (!Intrinsics.areEqual(str, (String) mutableState.getValue())) {
                mutableState.setValue(str);
            }
        }
        MutableState mutableState2 = this.e;
        Integer num = (Integer) mutableState2.getValue();
        if (num != null && num.intValue() == this.c) {
            mutableState2.setValue(null);
        }
        return Unit.INSTANCE;
    }
}
