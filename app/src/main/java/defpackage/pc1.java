package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public /* synthetic */ pc1(float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return PaddingKt.padding_qDBjuR0$lambda$0(this.b, this.c, this.d, this.e, (InspectorInfo) obj);
            default:
                return PaddingKt.absolutePadding_qDBjuR0$lambda$0(this.b, this.c, this.d, this.e, (InspectorInfo) obj);
        }
    }
}
