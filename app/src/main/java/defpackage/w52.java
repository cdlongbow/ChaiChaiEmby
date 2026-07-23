package defpackage;

import androidx.compose.material3.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w52 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TabRowDefaults b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ w52(TabRowDefaults tabRowDefaults, Modifier modifier, float f, long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = tabRowDefaults;
        this.c = modifier;
        this.d = f;
        this.e = j;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TabRowDefaults.Indicator_9IZ8Weo$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TabRowDefaults.SecondaryIndicator_9IZ8Weo$lambda$2(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }
}
