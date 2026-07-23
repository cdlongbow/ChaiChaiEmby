package defpackage;

import androidx.activity.ImmLeaksCleaner;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalFullyDrawnReporterOwner;
import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.runtime.HostDefaultProviderKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.dh.myembyapp.data.api.IqiyiSuggestApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bo0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ bo0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            case 1:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 2:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 3:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            case 4:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 5:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
            case 6:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
            case 7:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 8:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 9:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return HostDefaultProviderKt.LocalHostDefaultProvider$lambda$0();
            case 13:
                return Dispatchers.getMain().getImmediate();
            case 14:
                return (cb0) zd2.a.getValue();
            case 15:
                return ImmLeaksCleaner.cleaner_delegate$lambda$0();
            case 16:
                return DefaultDebugIndication.INSTANCE;
            case 17:
                return InspectionTablesKt.LocalInspectionTables$lambda$0();
            case 18:
                return Boolean.valueOf(InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement$lambda$0());
            case 19:
                return InteractiveComponentSizeKt.LocalMinimumInteractiveComponentSize$lambda$1();
            case 20:
                return IqiyiSuggestApi.client_delegate$lambda$0();
            case 21:
                return Unit.INSTANCE;
            case 22:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 23:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 24:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 25:
                return LocalActivityResultRegistryOwner.LocalComposition$lambda$0();
            case 26:
                ProvidableCompositionLocal providableCompositionLocal = m01.a;
                return cf.a;
            case 27:
                return of.a;
            case 28:
                return LocalFullyDrawnReporterOwner.LocalFullyDrawnReporterOwner$lambda$0();
            default:
                return LocalLifecycleOwnerKt.LocalLifecycleOwner$lambda$0$1();
        }
    }
}
