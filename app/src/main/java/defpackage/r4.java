package defpackage;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FocusRequester c;

    public /* synthetic */ r4(boolean z, FocusRequester focusRequester, int i) {
        this.a = i;
        this.b = z;
        this.c = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        FocusRequester focusRequester = this.c;
        boolean z = this.b;
        FocusProperties focusProperties = (FocusProperties) obj;
        switch (i) {
            case 0:
                focusProperties.getClass();
                focusProperties.setCanFocus(z);
                focusProperties.setDown(focusRequester);
                break;
            default:
                focusProperties.getClass();
                focusProperties.setCanFocus(z);
                if (focusRequester != null) {
                    focusProperties.setDown(focusRequester);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
