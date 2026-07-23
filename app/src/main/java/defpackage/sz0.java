package defpackage;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sz0 implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sz0(int i, Serializable serializable, Object obj, Object obj2) {
        this.a = i;
        this.d = obj;
        this.b = serializable;
        this.c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.c;
        Serializable serializable = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                LifecycleEffectKt.LifecycleStartEffectImpl$lambda$0$0$0((LifecycleStartStopEffectScope) obj2, (Ref.ObjectRef) serializable, (Function1) obj, lifecycleOwner, event);
                break;
            case 1:
                LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$0$0$0((LifecycleResumePauseEffectScope) obj2, (Ref.ObjectRef) serializable, (Function1) obj, lifecycleOwner, event);
                break;
            default:
                ((MenuHostHelper) obj2).lambda$addMenuProvider$1((Lifecycle.State) serializable, (MenuProvider) obj, lifecycleOwner, event);
                break;
        }
    }
}
