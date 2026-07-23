package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ TextStyle c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ CharSequence l;
    public final /* synthetic */ Object m;

    public /* synthetic */ sk(CharSequence charSequence, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Object obj, int i4, int i5, int i6) {
        this.a = i6;
        this.l = charSequence;
        this.b = modifier;
        this.c = textStyle;
        this.d = function1;
        this.e = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.m = obj;
        this.j = i4;
        this.k = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTextKt.BasicText_VhcvRP8$lambda$1((AnnotatedString) this.l, this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Map) this.m, this.j, this.k, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTextKt.BasicText_VhcvRP8$lambda$0((String) this.l, this.b, this.c, this.d, this.e, this.g, this.h, this.i, (ColorProducer) this.m, this.j, this.k, (Composer) obj, iIntValue2);
        }
    }
}
