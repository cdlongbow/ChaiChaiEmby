package defpackage;

import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.material3.internal.FloatProducer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z30 implements FloatProducer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$15$lambda$12$lambda$11((SingleRowTopAppBarOverrideScope) obj);
            default:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24((TwoRowsTopAppBarOverrideScope) obj);
        }
    }
}
