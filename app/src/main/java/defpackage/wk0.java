package defpackage;

import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wk0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.ObjectRef b;

    public /* synthetic */ wk0(Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Ref.ObjectRef objectRef = this.b;
        switch (i) {
            case 0:
                return FlowLayoutKt.breakDownItems_di9J0FM$lambda$0$0(objectRef, (Placeable) obj);
            case 1:
                return FlowLayoutKt.breakDownItems_di9J0FM$lambda$2$0(objectRef, (Placeable) obj);
            default:
                return Boolean.valueOf(NavGraphNavigator.navigate$lambda$6(objectRef, (String) obj));
        }
    }
}
