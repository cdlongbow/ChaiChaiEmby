package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.ContextualFlowLayoutKt;
import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Arrangement.Vertical d;
    public final /* synthetic */ Arrangement.Horizontal e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Function4 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ FlowLayoutOverflow m;

    public /* synthetic */ jv(int i, Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, ContextualFlowRowOverflow contextualFlowRowOverflow, Function4 function4, int i4, int i5) {
        this.b = i;
        this.c = modifier;
        this.e = horizontal;
        this.d = vertical;
        this.l = vertical2;
        this.g = i2;
        this.h = i3;
        this.m = contextualFlowRowOverflow;
        this.i = function4;
        this.j = i4;
        this.k = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ContextualFlowLayoutKt.ContextualFlowRow$lambda$3(this.b, this.c, this.e, this.d, (Alignment.Vertical) this.l, this.g, this.h, (ContextualFlowRowOverflow) this.m, this.i, this.j, this.k, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ContextualFlowLayoutKt.ContextualFlowColumn$lambda$3(this.b, this.c, this.d, this.e, (Alignment.Horizontal) this.l, this.g, this.h, (ContextualFlowColumnOverflow) this.m, this.i, this.j, this.k, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ jv(int i, Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, ContextualFlowColumnOverflow contextualFlowColumnOverflow, Function4 function4, int i4, int i5) {
        this.b = i;
        this.c = modifier;
        this.d = vertical;
        this.e = horizontal;
        this.l = horizontal2;
        this.g = i2;
        this.h = i3;
        this.m = contextualFlowColumnOverflow;
        this.i = function4;
        this.j = i4;
        this.k = i5;
    }
}
