package defpackage;

import androidx.compose.material3.AppBarKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ xb(float f, float f2, float f3, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return AppBarKt.BottomAppBarState(this.b, this.c, this.d);
            default:
                return AppBarKt.rememberTopAppBarState$lambda$26$lambda$25(this.b, this.c, this.d);
        }
    }
}
