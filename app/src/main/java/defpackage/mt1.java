package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mt1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Saver b;

    public /* synthetic */ mt1(Saver saver, int i) {
        this.a = i;
        this.b = saver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Saver saver = this.b;
        MutableState mutableState = (MutableState) obj;
        switch (i) {
            case 0:
                return RememberSaveableKt.mutableStateSaver$lambda$0$1(saver, mutableState);
            default:
                return SavedStateHandleSaverKt.mutableStateSaver$lambda$0$1(saver, mutableState);
        }
    }
}
