package defpackage;

import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt;
import kotlin.jvm.functions.Function0;
import kotlin.properties.PropertyDelegateProvider;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ku1 implements PropertyDelegateProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavedStateHandle b;
    public final /* synthetic */ Saver c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ ku1(SavedStateHandle savedStateHandle, Saver saver, Function0 function0, int i) {
        this.a = i;
        this.b = savedStateHandle;
        this.c = saver;
        this.d = function0;
    }

    @Override // kotlin.properties.PropertyDelegateProvider
    public final Object provideDelegate(Object obj, KProperty kProperty) {
        switch (this.a) {
            case 0:
                return SavedStateHandleSaverKt.saveable$lambda$1(this.b, this.c, this.d, obj, kProperty);
            default:
                return SavedStateHandleSaverKt.saveable$lambda$2(this.b, this.c, this.d, obj, kProperty);
        }
    }
}
