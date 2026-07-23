package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lt1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Saver b;

    public /* synthetic */ lt1(Saver saver, int i) {
        this.a = i;
        this.b = saver;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        SaverScope saverScope = (SaverScope) obj;
        MutableState mutableState = (MutableState) obj2;
        Saver saver = this.b;
        switch (i) {
            case 0:
                return RememberSaveableKt.mutableStateSaver$lambda$0$0(saver, saverScope, mutableState);
            default:
                return SavedStateHandleSaverKt.mutableStateSaver$lambda$0$0(saver, saverScope, mutableState);
        }
    }
}
