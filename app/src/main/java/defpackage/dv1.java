package defpackage;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dv1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ dv1(String str, String str2, int i, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return SearchBarDefaults.InputField$lambda$40$lambda$39(this.b, this.c, this.d, (SemanticsPropertyReceiver) obj);
            default:
                return SearchBarDefaults.InputField$lambda$27$lambda$26(this.b, this.c, this.d, (SemanticsPropertyReceiver) obj);
        }
    }
}
