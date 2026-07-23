package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vr implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ComponentActivity._init_$lambda$3((ComponentActivity) obj);
            case 1:
                return DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0((SaveableStateRegistry) obj);
            case 2:
                return ((FragmentActivity) obj).lambda$init$0();
            case 3:
                return ((FragmentManager) obj).lambda$attachController$4();
            default:
                return SavedStateHandleImpl.savedStateProvider$lambda$0((SavedStateHandleImpl) obj);
        }
    }
}
