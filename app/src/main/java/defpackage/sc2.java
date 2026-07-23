package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes4.dex */
public final class sc2 implements Function4 {
    public static final sc2 b = new sc2(0);
    public static final sc2 c = new sc2(1);
    public final /* synthetic */ int a;

    public /* synthetic */ sc2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
                ((Boolean) obj2).booleanValue();
                keyEventM6229unboximpl.getClass();
                ((Function0) obj3).getClass();
                ((Function0) obj4).getClass();
                break;
            default:
                KeyEvent keyEventM6229unboximpl2 = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
                ((Boolean) obj2).booleanValue();
                keyEventM6229unboximpl2.getClass();
                ((Function0) obj3).getClass();
                ((Function0) obj4).getClass();
                break;
        }
        return Boolean.FALSE;
    }
}
