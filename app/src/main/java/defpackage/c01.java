package defpackage;

import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c01 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function e;

    public /* synthetic */ c01(long j, Object obj, Function function, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.d = obj;
        this.e = function;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ListItemKt.ProvideTextStyleFromToken_3J_VO9M$lambda$12(this.b, (TypographyKeyTokens) this.d, (Function2) this.e, this.c, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavigationItemKt.Indicator_3J_VO9M$lambda$45(this.b, (Shape) this.d, (Function0) this.e, this.c, (Composer) obj, iIntValue2);
        }
    }
}
