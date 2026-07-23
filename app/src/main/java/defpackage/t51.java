package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t51 implements Function5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ t51(MovableContent movableContent, int i) {
        this.a = i;
        this.b = movableContent;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj5).intValue();
                return MovableContentKt.movableContentOf$lambda$5(this.b, obj, obj2, obj3, (Composer) obj4, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj5).intValue();
                return MovableContentKt.movableContentWithReceiverOf$lambda$5(this.b, obj, obj2, obj3, (Composer) obj4, iIntValue2);
        }
    }
}
