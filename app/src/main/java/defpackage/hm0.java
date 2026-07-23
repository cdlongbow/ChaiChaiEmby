package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.MovableContent;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovableContent b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hm0(MovableContent movableContent, Object obj, int i) {
        this.a = i;
        this.b = movableContent;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return GapComposer.invokeMovableContentLambda$lambda$0(this.b, this.c, composer, iIntValue);
            default:
                return LinkComposer.invokeMovableContentLambda$lambda$0$0(this.b, this.c, composer, iIntValue);
        }
    }
}
