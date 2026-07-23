package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BasicTooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PopupPositionProvider b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ BasicTooltipState d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ xk(PopupPositionProvider popupPositionProvider, Function2 function2, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, Function2 function3, int i, int i2, int i3) {
        this.a = i3;
        this.b = popupPositionProvider;
        this.c = function2;
        this.d = basicTooltipState;
        this.e = modifier;
        this.g = z;
        this.h = z2;
        this.i = function3;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.BasicTooltipBox$lambda$3(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTooltip_androidKt.BasicTooltipBoxAndroid$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue2);
        }
    }
}
