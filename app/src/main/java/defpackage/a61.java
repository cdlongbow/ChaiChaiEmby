package defpackage;

import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.StrategyKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a61 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a61(int i, int i2, int i3, Object obj) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return MultiParagraph.getPathForRange$lambda$1((Path) obj2, i3, i2, (ParagraphInfo) obj);
            default:
                return StrategyKt.moveKeylineAndCreateShiftedKeylineList$lambda$5((KeylineList) obj2, i3, i2, (KeylineListScope) obj);
        }
    }
}
