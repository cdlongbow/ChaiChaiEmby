package defpackage;

import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vj implements CodepointTransformation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                return BasicSecureTextFieldKt.BasicSecureTextField_ltb6GB4$lambda$3$0((State) obj, i, i2);
            default:
                return SecureTextFieldController.codepointTransformation$lambda$0((SecureTextFieldController) obj, i, i2);
        }
    }
}
