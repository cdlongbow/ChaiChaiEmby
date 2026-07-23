package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s51 implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ s51(MovableContent movableContent, int i) {
        this.a = i;
        this.b = movableContent;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        MovableContent movableContent = this.b;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                return MovableContentKt.movableContentOf$lambda$3(movableContent, obj, obj2, composer, iIntValue);
            default:
                return MovableContentKt.movableContentWithReceiverOf$lambda$3(movableContent, obj, obj2, composer, iIntValue);
        }
    }
}
