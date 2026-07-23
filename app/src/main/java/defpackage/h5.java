package defpackage;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FocusRequester b;

    public /* synthetic */ h5(FocusRequester focusRequester, int i) {
        this.a = i;
        this.b = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        FocusRequester focusRequester = this.b;
        FocusProperties focusProperties = (FocusProperties) obj;
        switch (i) {
            case 0:
                focusProperties.getClass();
                focusProperties.setUp(focusRequester);
                break;
            case 1:
                focusProperties.getClass();
                focusProperties.setUp(focusRequester);
                break;
            case 2:
                focusProperties.getClass();
                focusProperties.setUp(focusRequester);
                break;
            case 3:
                focusProperties.getClass();
                focusProperties.setDown(focusRequester);
                break;
            case 4:
                focusProperties.getClass();
                focusProperties.setUp(focusRequester);
                break;
            case 5:
                focusProperties.getClass();
                focusProperties.setDown(focusRequester);
                break;
            case 6:
                focusProperties.getClass();
                FocusRequester.Companion companion = FocusRequester.INSTANCE;
                focusProperties.setLeft(companion.getCancel());
                focusProperties.setRight(companion.getCancel());
                focusProperties.setUp(focusRequester);
                focusProperties.setDown(companion.getCancel());
                break;
            default:
                focusProperties.getClass();
                focusProperties.setDown(focusRequester);
                break;
        }
        return Unit.INSTANCE;
    }
}
