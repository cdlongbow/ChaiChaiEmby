package defpackage;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommandScope;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ms0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ImeEditCommandScope d;

    public /* synthetic */ ms0(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        this.a = 0;
        this.d = imeEditCommandScope;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.b;
                return ImeEditCommand_androidKt.setSelection$lambda$0(this.d, i, this.c, (TextFieldBuffer) obj);
            case 1:
                return ImeEditCommand_androidKt.deleteSurroundingText$lambda$0(this.b, this.c, this.d, (TextFieldBuffer) obj);
            default:
                return ImeEditCommand_androidKt.setComposingRegion$lambda$0(this.b, this.c, this.d, (TextFieldBuffer) obj);
        }
    }

    public /* synthetic */ ms0(int i, int i2, ImeEditCommandScope imeEditCommandScope, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = imeEditCommandScope;
    }
}
