package defpackage;

import androidx.compose.ui.focus.FocusProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class y70 implements Function1 {
    public static final y70 b = new y70(0);
    public static final y70 c = new y70(1);
    public static final y70 d = new y70(2);
    public static final y70 e = new y70(3);
    public final /* synthetic */ int a;

    public /* synthetic */ y70(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                FocusProperties focusProperties = (FocusProperties) obj;
                focusProperties.getClass();
                focusProperties.setCanFocus(false);
                return Unit.INSTANCE;
            case 1:
                FocusProperties focusProperties2 = (FocusProperties) obj;
                focusProperties2.getClass();
                focusProperties2.setCanFocus(false);
                return Unit.INSTANCE;
            case 2:
                ((Number) obj).longValue();
                return Unit.INSTANCE;
            default:
                return null;
        }
    }
}
