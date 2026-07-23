package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ InteractionSource d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ TextFieldColors g;
    public final /* synthetic */ Shape h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ dc1(Object obj, boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, int i3) {
        this.a = i3;
        this.m = obj;
        this.b = z;
        this.c = z2;
        this.d = interactionSource;
        this.e = modifier;
        this.g = textFieldColors;
        this.h = shape;
        this.i = f;
        this.j = f2;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return OutlinedTextFieldDefaults.Container_4EFweAY$lambda$0((OutlinedTextFieldDefaults) obj3, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextFieldDefaults.Container_4EFweAY$lambda$0((TextFieldDefaults) obj3, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iIntValue2);
        }
    }
}
