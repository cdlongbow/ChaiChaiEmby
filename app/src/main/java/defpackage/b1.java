package defpackage;

import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.material3.AppBarDslKt;
import androidx.compose.material3.BottomAppBarDefaults;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DefaultBasicAlertDialogOverride;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import io.github.peerless2012.ass.Ass;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.CharDirectionality;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ b1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return ActivityResultRegistry.generateRandomNumber$lambda$0();
            case 2:
                return ActivityResultRegistryKt.rememberLauncherForActivityResult$lambda$0$0();
            case 3:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            case 4:
                return Unit.INSTANCE;
            case 5:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 6:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 7:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 8:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            case 9:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            case 10:
                return Unit.INSTANCE;
            case 11:
                return DefaultBasicAlertDialogOverride.INSTANCE;
            case 12:
                return AppBarDslKt.rememberAppBarOverflowState$lambda$1$lambda$0();
            case 13:
                return DefaultSingleRowTopAppBarOverride.INSTANCE;
            case 14:
                return DefaultTwoRowsTopAppBarOverride.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return new Ass();
            case 17:
                return AutofillHighlightKt.LocalAutofillHighlightBrush$lambda$0();
            case 18:
                return UUID.randomUUID();
            case 19:
                return BasicText_androidKt.LocalBackgroundTextMeasurementExecutor$lambda$0();
            case 20:
                return Boolean.valueOf(BottomAppBarDefaults.exitAlwaysScrollBehavior$lambda$1$lambda$0());
            case 21:
                return new io(5);
            case 22:
                return CharDirectionality.directionalityMap_delegate$lambda$0();
            case 23:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 24:
                return ColorSchemeKt.LocalColorScheme$lambda$1();
            case 25:
                return Boolean.valueOf(ColorSchemeKt.LocalTonalElevationEnabled$lambda$2());
            case 26:
                return CompositionErrorContextKt.LocalCompositionErrorContext$lambda$0();
            case 27:
                return ComputedProvidableCompositionLocal._init_$lambda$0();
            case 28:
                return Unit.INSTANCE;
            default:
                return DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$5$lambda$4();
        }
    }
}
