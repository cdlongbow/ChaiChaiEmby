package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class kq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public kq(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        boolean z = true;
        int i = this.a;
        if ((i != 0 || !Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), Key.INSTANCE.m5997getDirectionLeftEK5gGoQ())) && (i != CollectionsKt.getLastIndex(this.b) || !Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), Key.INSTANCE.m5998getDirectionRightEK5gGoQ()))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
