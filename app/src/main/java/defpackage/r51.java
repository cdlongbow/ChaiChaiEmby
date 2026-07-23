package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r51 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ r51(MovableContent movableContent, int i) {
        this.a = i;
        this.b = movableContent;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        MovableContent movableContent = this.b;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return MovableContentKt.movableContentOf$lambda$1(movableContent, obj, composer, iIntValue);
            default:
                return MovableContentKt.movableContentWithReceiverOf$lambda$1(movableContent, obj, composer, iIntValue);
        }
    }
}
