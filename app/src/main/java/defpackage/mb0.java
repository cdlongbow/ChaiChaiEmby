package defpackage;

import androidx.compose.material3.DividerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ mb0(float f, long j, int i) {
        this.a = i;
        this.b = f;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return DividerKt.VerticalDivider_9IZ8Weo$lambda$4$lambda$3(this.b, this.c, (DrawScope) obj);
            default:
                return DividerKt.HorizontalDivider_9IZ8Weo$lambda$1$lambda$0(this.b, this.c, (DrawScope) obj);
        }
    }
}
