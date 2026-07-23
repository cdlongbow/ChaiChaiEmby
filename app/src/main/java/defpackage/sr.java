package defpackage;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.State;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sr implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sr(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ComponentActivity.addObserverForBackInvoker$lambda$0((OnBackPressedDispatcher) obj2, (ComponentActivity) obj, lifecycleOwner, event);
                break;
            case 1:
                LifecycleController.observer$lambda$0((LifecycleController) obj2, (Job) obj, lifecycleOwner, event);
                break;
            case 2:
                LifecycleEffectKt.LifecycleEventEffect$lambda$1$0$0((Lifecycle.Event) obj2, (State) obj, lifecycleOwner, event);
                break;
            default:
                ((MenuHostHelper) obj2).lambda$addMenuProvider$0((MenuProvider) obj, lifecycleOwner, event);
                break;
        }
    }
}
