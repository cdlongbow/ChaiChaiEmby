package defpackage;

import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class xz implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ MutableState c;

    public xz(int i, MutableState mutableState, String str) {
        this.a = str;
        this.b = i;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (!StringsKt.isBlank(this.a)) {
            MutableState mutableState = this.c;
            Map map = (Map) mutableState.getValue();
            int i = this.b;
            Boolean bool = (Boolean) map.get(Integer.valueOf(i));
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Map mutableMap = MapsKt.toMutableMap((Map) mutableState.getValue());
            mutableMap.put(Integer.valueOf(i), Boolean.valueOf(!zBooleanValue));
            mutableState.setValue(mutableMap);
        }
        return Unit.INSTANCE;
    }
}
