package defpackage;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b8(boolean z, boolean z2, int i) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        FocusProperties focusProperties = (FocusProperties) obj;
        switch (i) {
            case 0:
                focusProperties.getClass();
                if (z2) {
                    focusProperties.setLeft(FocusRequester.INSTANCE.getCancel());
                }
                if (z) {
                    focusProperties.setRight(FocusRequester.INSTANCE.getCancel());
                }
                break;
            case 1:
                focusProperties.getClass();
                if (z2) {
                    focusProperties.setLeft(FocusRequester.INSTANCE.getCancel());
                }
                if (z) {
                    focusProperties.setRight(FocusRequester.INSTANCE.getCancel());
                }
                break;
            default:
                focusProperties.getClass();
                if (z2) {
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
