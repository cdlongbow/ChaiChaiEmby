package defpackage;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z0 implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(event);
                break;
            case 1:
                Lifecycle._get_currentStateFlow_$lambda$0((MutableStateFlow) obj, lifecycleOwner, event);
                break;
            case 2:
                NavControllerImpl.lifecycleObserver$lambda$1((NavControllerImpl) obj, lifecycleOwner, event);
                break;
            case 3:
                SavedStateRegistryImpl.performAttach$lambda$12((SavedStateRegistryImpl) obj, lifecycleOwner, event);
                break;
            default:
                ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1((AbstractComposeView) obj, lifecycleOwner, event);
                break;
        }
    }
}
