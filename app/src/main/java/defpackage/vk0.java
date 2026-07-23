package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vk0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Arrangement.Horizontal c;
    public final /* synthetic */ Arrangement.Vertical d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Function3 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ vk0(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, Function3 function3, int i3, int i4) {
        this.b = modifier;
        this.c = horizontal;
        this.d = vertical;
        this.k = vertical2;
        this.e = i;
        this.g = i2;
        this.h = function3;
        this.i = i3;
        this.j = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return FlowLayoutKt.FlowColumn$lambda$3(this.b, this.d, this.c, (Alignment.Horizontal) this.k, this.e, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return FlowLayoutKt.FlowRow$lambda$3(this.b, this.c, this.d, (Alignment.Vertical) this.k, this.e, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ vk0(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, Function3 function3, int i3, int i4) {
        this.b = modifier;
        this.d = vertical;
        this.c = horizontal;
        this.k = horizontal2;
        this.e = i;
        this.g = i2;
        this.h = function3;
        this.i = i3;
        this.j = i4;
    }
}
