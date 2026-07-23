package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p51 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function6 b;

    public /* synthetic */ p51(Function6 function6, int i) {
        this.a = i;
        this.b = function6;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object[] objArr = (Object[]) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Function6 function6 = this.b;
        switch (i) {
            case 0:
                return MovableContentKt.movableContentWithReceiverOf$lambda$6(function6, objArr, composer, iIntValue);
            default:
                return MovableContentKt.movableContentOf$lambda$6(function6, objArr, composer, iIntValue);
        }
    }
}
