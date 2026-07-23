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
public final /* synthetic */ class qk implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ TextStyle c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ColorProducer j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ CharSequence m;
    public final /* synthetic */ Object n;

    public /* synthetic */ qk(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Map map, ColorProducer colorProducer, int i4, int i5) {
        this.m = annotatedString;
        this.b = modifier;
        this.c = textStyle;
        this.d = function1;
        this.e = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.n = map;
        this.j = colorProducer;
        this.k = i4;
        this.l = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTextKt.BasicText_RWo7tUw$lambda$3((AnnotatedString) this.m, this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Map) this.n, this.j, this.k, this.l, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTextKt.BasicText_RWo7tUw$lambda$2((String) this.m, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, (TextAutoSize) this.n, this.k, this.l, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ qk(String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, ColorProducer colorProducer, TextAutoSize textAutoSize, int i4, int i5) {
        this.m = str;
        this.b = modifier;
        this.c = textStyle;
        this.d = function1;
        this.e = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = colorProducer;
        this.n = textAutoSize;
        this.k = i4;
        this.l = i5;
    }
}
