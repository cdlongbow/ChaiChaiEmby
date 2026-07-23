package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class fj0 implements FlowCollector {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ fj0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                for (String str : (List) obj) {
                    ks1 ks1VarA = j12.a(context);
                    bs0 bs0Var = new bs0(context);
                    bs0Var.c = str;
                    ks1VarA.a(bs0Var.a());
                }
                break;
            default:
                for (String str2 : (List) obj) {
                    ks1 ks1VarA2 = j12.a(context);
                    bs0 bs0Var2 = new bs0(context);
                    bs0Var2.c = str2;
                    ks1VarA2.a(bs0Var2.a());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
