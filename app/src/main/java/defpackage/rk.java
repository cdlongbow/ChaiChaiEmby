package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ AnnotatedString b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ TextStyle d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ rk(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Map map, int i3, int i4) {
        this.b = annotatedString;
        this.c = modifier;
        this.d = textStyle;
        this.i = function1;
        this.g = i;
        this.e = z;
        this.h = i2;
        this.l = map;
        this.j = i3;
        this.k = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTextKt.BasicText_4YKlhWE$lambda$0(this.b, this.c, this.d, this.i, this.g, this.e, this.h, (Map) this.l, this.j, this.k, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ClickableTextKt.ClickableText_4YKlhWE$lambda$4(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Function1) this.l, this.j, this.k, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ rk(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, Function1 function1, Function1 function2, int i3, int i4) {
        this.b = annotatedString;
        this.c = modifier;
        this.d = textStyle;
        this.e = z;
        this.g = i;
        this.h = i2;
        this.i = function1;
        this.l = function2;
        this.j = i3;
        this.k = i4;
    }
}
