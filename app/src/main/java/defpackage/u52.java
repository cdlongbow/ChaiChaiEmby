package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u52 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ MutableInteractionSource k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ u52(boolean z, Function0 function0, Modifier modifier, boolean z2, Function2 function2, Function2 function3, long j, long j2, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.b = z;
        this.c = function0;
        this.g = modifier;
        this.h = z2;
        this.d = function2;
        this.e = function3;
        this.i = j;
        this.j = j2;
        this.k = mutableInteractionSource;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TabKt.Tab_wqdebIU$lambda$1(this.b, this.c, this.g, this.h, this.d, this.e, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean z = this.b;
                Function0 function0 = this.c;
                Modifier modifier = this.g;
                boolean z2 = this.h;
                return TabKt.LeadingIconTab_wqdebIU$lambda$2(z, function0, this.d, this.e, modifier, z2, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ u52(boolean z, Function0 function0, Function2 function2, Function2 function3, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.b = z;
        this.c = function0;
        this.d = function2;
        this.e = function3;
        this.g = modifier;
        this.h = z2;
        this.i = j;
        this.j = j2;
        this.k = mutableInteractionSource;
        this.l = i;
        this.m = i2;
    }
}
