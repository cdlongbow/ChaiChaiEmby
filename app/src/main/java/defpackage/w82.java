package defpackage;

import android.os.StatFs;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.DefaultWideNavigationRailOverride;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TypographyKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.window.area.WindowAreaController;
import androidx.window.layout.WindowInfoTracker;
import com.dh.myembyapp.data.api.TraktRetrofitClient;
import java.io.File;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w82 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ w82(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zExitUntilCollapsedScrollBehavior$lambda$10$lambda$9;
        switch (this.a) {
            case 0:
                zExitUntilCollapsedScrollBehavior$lambda$10$lambda$9 = TopAppBarDefaults.exitUntilCollapsedScrollBehavior$lambda$10$lambda$9();
                break;
            case 1:
                zExitUntilCollapsedScrollBehavior$lambda$10$lambda$9 = TopAppBarDefaults.enterAlwaysScrollBehavior$lambda$7$lambda$6();
                break;
            case 2:
                zExitUntilCollapsedScrollBehavior$lambda$10$lambda$9 = TopAppBarDefaults.pinnedScrollBehavior$lambda$2$lambda$1();
                break;
            case 3:
                zExitUntilCollapsedScrollBehavior$lambda$10$lambda$9 = TopAppBarDefaults.enterAlwaysScrollBehavior$lambda$5$lambda$4();
                break;
            case 4:
                return TraktRetrofitClient.retrofit_delegate$lambda$0();
            case 5:
                return TraktRetrofitClient.apiService_delegate$lambda$0();
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return TypographyKt.LocalTypography$lambda$0();
            case 10:
                FileSystem fileSystem = FileSystem.SYSTEM;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                Path pathResolve = FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("coil3_disk_cache");
                if (pathResolve == null) {
                    rd1.o("directory == null");
                    return null;
                }
                long jCoerceIn = 10485760;
                try {
                    File file = pathResolve.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jCoerceIn = RangesKt.coerceIn((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new gs1(jCoerceIn, pathResolve, fileSystem, emptyCoroutineContext);
            case 11:
                return CreationExtras.Empty.INSTANCE;
            case 12:
                return DefaultWideNavigationRailOverride.INSTANCE;
            case 13:
                return DefaultModalWideNavigationRailOverride.INSTANCE;
            case 14:
                return UUID.randomUUID();
            case 15:
                return WindowAreaController.windowAreaController_delegate$lambda$1();
            default:
                return WindowInfoTracker.Companion.extensionBackend_delegate$lambda$2();
        }
        return Boolean.valueOf(zExitUntilCollapsedScrollBehavior$lambda$10$lambda$9);
    }
}
