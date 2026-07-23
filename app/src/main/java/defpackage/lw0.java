package defpackage;

import androidx.compose.material3.LabelKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lw0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.ObjectRef b;

    public /* synthetic */ lw0(Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Ref.ObjectRef objectRef = this.b;
        switch (i) {
            case 0:
                return LabelKt.Label$lambda$4$lambda$3(objectRef);
            default:
                return RealWebSocket.failWebSocket$lambda$0$0(objectRef);
        }
    }
}
