package defpackage;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class c90 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public c90(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FocusProperties focusProperties = (FocusProperties) obj;
        focusProperties.getClass();
        int i = this.a;
        if (i == 0) {
            focusProperties.setLeft(FocusRequester.INSTANCE.getCancel());
        }
        if (i == CollectionsKt.getLastIndex(this.b)) {
            focusProperties.setRight(FocusRequester.INSTANCE.getCancel());
        }
        return Unit.INSTANCE;
    }
}
