package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qq1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int g;
    public final /* synthetic */ float h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ qq1(float f, Modifier modifier, long j, float f2, long j2, int i, int i2, int i3) {
        this.d = f;
        this.b = modifier;
        this.c = j;
        this.h = f2;
        this.e = j2;
        this.g = i;
        this.i = i2;
        this.j = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$38(this.d, this.b, this.c, this.h, this.e, this.g, this.i, this.j, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                float f = this.d;
                Modifier modifier = this.b;
                long j = this.c;
                float f2 = this.h;
                return ProgressIndicatorKt.CircularProgressIndicator_4lLiAd8$lambda$35(modifier, j, f, this.e, this.g, f2, this.i, this.j, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ qq1(Modifier modifier, long j, float f, long j2, int i, float f2, int i2, int i3) {
        this.b = modifier;
        this.c = j;
        this.d = f;
        this.e = j2;
        this.g = i;
        this.h = f2;
        this.i = i2;
        this.j = i3;
    }
}
