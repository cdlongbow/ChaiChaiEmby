package defpackage;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b72 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ FontStyle e;
    public final /* synthetic */ FontWeight g;
    public final /* synthetic */ FontFamily h;
    public final /* synthetic */ long i;
    public final /* synthetic */ TextDecoration j;
    public final /* synthetic */ TextAlign k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ TextStyle r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ CharSequence v;
    public final /* synthetic */ Object w;

    public /* synthetic */ b72(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, TextStyle textStyle, int i4, int i5, int i6) {
        this.v = annotatedString;
        this.b = modifier;
        this.c = j;
        this.d = j2;
        this.e = fontStyle;
        this.g = fontWeight;
        this.h = fontFamily;
        this.i = j3;
        this.j = textDecoration;
        this.k = textAlign;
        this.l = j4;
        this.m = i;
        this.n = z;
        this.o = i2;
        this.p = i3;
        this.w = map;
        this.q = function1;
        this.r = textStyle;
        this.s = i4;
        this.t = i5;
        this.u = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TextKt.Text_Nvy7gAk$lambda$2((String) this.v, this.b, this.c, (TextAutoSize) this.w, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextKt.Text_IbK3jfQ$lambda$12((AnnotatedString) this.v, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Map) this.w, this.q, this.r, this.s, this.t, this.u, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ b72(String str, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, int i4, int i5, int i6) {
        this.v = str;
        this.b = modifier;
        this.c = j;
        this.w = textAutoSize;
        this.d = j2;
        this.e = fontStyle;
        this.g = fontWeight;
        this.h = fontFamily;
        this.i = j3;
        this.j = textDecoration;
        this.k = textAlign;
        this.l = j4;
        this.m = i;
        this.n = z;
        this.o = i2;
        this.p = i3;
        this.q = function1;
        this.r = textStyle;
        this.s = i4;
        this.t = i5;
        this.u = i6;
    }
}
