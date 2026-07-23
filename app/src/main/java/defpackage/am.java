package defpackage;

import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ am(long j, float[] fArr, Ref.IntRef intRef, Ref.FloatRef floatRef) {
        this.a = 1;
        this.b = j;
        this.c = fArr;
        this.d = intRef;
        this.e = floatRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                return BorderModifierNode.drawGenericBorder$lambda$3((Rect) obj4, (Ref.ObjectRef) obj3, this.b, (ColorFilter) obj2, (ContentDrawScope) obj);
            case 1:
                return MultiParagraph.fillBoundingBoxes_8ffj60Q$lambda$0(this.b, (float[]) obj4, (Ref.IntRef) obj3, (Ref.FloatRef) obj2, (ParagraphInfo) obj);
            default:
                return PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$13$lambda$12((FloatProducer) obj4, (State) obj3, this.b, (Path) obj2, (DrawScope) obj);
        }
    }

    public /* synthetic */ am(Object obj, Object obj2, long j, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }
}
