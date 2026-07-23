package defpackage;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n91 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ n91(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return OffsetKt.absoluteOffset_VpY3zN4$lambda$0(this.b, this.c, (InspectorInfo) obj);
            case 1:
                return OffsetKt.offset_VpY3zN4$lambda$0(this.b, this.c, (InspectorInfo) obj);
            default:
                return PaddingKt.padding_VpY3zN4$lambda$0(this.b, this.c, (InspectorInfo) obj);
        }
    }
}
