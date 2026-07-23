package defpackage;

import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.material3.DefaultNavigationBarOverride;
import androidx.compose.material3.DefaultNavigationRailOverride;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import com.dh.myembyapp.MyEmbyApp;
import java.net.Proxy;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o01 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ o01(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return LocalNavigationEventDispatcherOwner.LocalNavigationEventDispatcherOwner$lambda$0();
            case 1:
                return LocalOnBackPressedDispatcherOwner.LocalOnBackPressedDispatcherOwner$lambda$0();
            case 2:
                return ForgetfulRetainedValuesStore.INSTANCE;
            case 3:
                return LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner$lambda$3$lambda$2();
            case 4:
                return LocalViewModelStoreOwner.LocalViewModelStoreOwner$lambda$0();
            case 5:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            case 6:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            case 7:
                return ManagedRetainedValuesStoreKt.retainManagedRetainedValuesStore$lambda$0$0();
            case 8:
                return Boolean.valueOf(MaterialThemeKt.LocalUsingExpressiveTheme$lambda$3());
            case 9:
                return MaterialThemeKt._localMotionScheme$lambda$5();
            case 10:
                return UUID.randomUUID();
            case 11:
                int i = MyEmbyApp.j;
                Proxy proxy = lr1.a;
                return lr1.b;
            case 12:
                int i2 = MyEmbyApp.j;
                return on.a;
            case 13:
                int i3 = MyEmbyApp.j;
                return new w10();
            case 14:
                return NavBackStackEntryImpl.defaultFactory_delegate$lambda$0();
            case 15:
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10();
            case 16:
                return DefaultNavigationBarOverride.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return Unit.INSTANCE;
            case 27:
                return DefaultNavigationRailOverride.INSTANCE;
            case 28:
                return on.a;
            default:
                return fu.a;
        }
    }
}
