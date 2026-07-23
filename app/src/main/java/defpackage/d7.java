package defpackage;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class d7 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ FocusRequester b;
    public final /* synthetic */ int c;
    public final /* synthetic */ j3 d;

    public d7(boolean z, FocusRequester focusRequester, int i, j3 j3Var) {
        this.a = z;
        this.b = focusRequester;
        this.c = i;
        this.d = j3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FocusRequester focusRequester;
        FocusProperties focusProperties = (FocusProperties) obj;
        focusProperties.getClass();
        if (this.a && (focusRequester = this.b) != null) {
            focusProperties.setUp(focusRequester);
        }
        int i = this.c;
        if (i == 0) {
            focusProperties.setLeft(FocusRequester.INSTANCE.getCancel());
        }
        if (i == CollectionsKt.getLastIndex(this.d.b)) {
            focusProperties.setRight(FocusRequester.INSTANCE.getCancel());
        }
        return Unit.INSTANCE;
    }
}
