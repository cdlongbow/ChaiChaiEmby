package defpackage;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ u50(boolean z, boolean z2, boolean z3, int i) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        boolean z3 = this.b;
        FocusProperties focusProperties = (FocusProperties) obj;
        switch (i) {
            case 0:
                focusProperties.getClass();
                focusProperties.setCanFocus(z3);
                if (z2) {
                    focusProperties.setLeft(FocusRequester.INSTANCE.getCancel());
                }
                if (z) {
                    focusProperties.setRight(FocusRequester.INSTANCE.getCancel());
                }
                break;
            default:
                focusProperties.getClass();
                if (z3 && z2) {
                    focusProperties.setLeft(FocusRequester.INSTANCE.getCancel());
                }
                if (z) {
                    focusProperties.setRight(FocusRequester.INSTANCE.getCancel());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
