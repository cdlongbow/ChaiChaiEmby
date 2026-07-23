package defpackage;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ m9(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return AndroidCursorHandle_androidKt.drawCursorHandle_4WTKRHQ$lambda$0(this.b, (CacheDrawScope) obj);
            default:
                return CoreTextFieldKt.TextFieldCursorHandle$lambda$3$0(this.b, (SemanticsPropertyReceiver) obj);
        }
    }
}
