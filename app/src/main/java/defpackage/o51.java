package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;
import kotlin.Triple;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o51 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function5 b;

    public /* synthetic */ o51(int i, Function5 function5) {
        this.a = i;
        this.b = function5;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Triple triple = (Triple) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Function5 function5 = this.b;
        switch (i) {
            case 0:
                return MovableContentKt.movableContentOf$lambda$4(function5, triple, composer, iIntValue);
            default:
                return MovableContentKt.movableContentWithReceiverOf$lambda$4(function5, triple, composer, iIntValue);
        }
    }
}
