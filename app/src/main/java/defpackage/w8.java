package defpackage;

import androidx.compose.material3.AlertDialogKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ DialogProperties d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ w8(Function0 function0, Modifier modifier, DialogProperties dialogProperties, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.c = modifier;
        this.d = dialogProperties;
        this.e = function2;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AlertDialogKt.AlertDialog$lambda$2(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AlertDialogKt.BasicAlertDialog$lambda$1(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }
}
