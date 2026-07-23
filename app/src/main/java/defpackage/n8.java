package defpackage;

import android.util.Log;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import com.dh.myembyapp.data.model.MediaSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;
import okhttp3.Handshake;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ n8(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                function0.invoke();
                return Unit.INSTANCE;
            case 1:
                function0.invoke();
                return Unit.INSTANCE;
            case 2:
                function0.invoke();
                return Unit.INSTANCE;
            case 3:
                Log.d("DanmakuSearch", "BackHandler 触发");
                function0.invoke();
                return Unit.INSTANCE;
            case 4:
                return Float.valueOf(DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$8$lambda$7(function0));
            case 5:
                return Float.valueOf(DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$10$lambda$9(function0));
            case 6:
                return Boolean.valueOf(DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$12$lambda$11(function0));
            case 7:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 8:
                function0.invoke();
                return Unit.INSTANCE;
            case 9:
                function0.invoke();
                return Unit.INSTANCE;
            case 10:
                function0.invoke();
                return Unit.INSTANCE;
            case 11:
                function0.invoke();
                return Unit.INSTANCE;
            case 12:
                return Handshake.peerCertificates_delegate$lambda$0(function0);
            case 13:
                function0.invoke();
                return Unit.INSTANCE;
            case 14:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 15:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 16:
                return Boolean.valueOf(ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$31$lambda$30$lambda$29(function0));
            case 17:
                Log.d("MoreMenu", "菜单lambda执行:视频版本");
                function0.invoke();
                return Unit.INSTANCE;
            case 18:
                Log.d("MoreMenu", "菜单lambda执行:转码质量");
                function0.invoke();
                return Unit.INSTANCE;
            case 19:
                Log.d("MoreMenu", "菜单lambda执行:片头片尾");
                function0.invoke();
                return Unit.INSTANCE;
            case 20:
                Log.d("MoreMenu", "菜单lambda执行:其他配置");
                function0.invoke();
                return Unit.INSTANCE;
            case 21:
                return NavControllerImpl.pop$lambda$6(function0);
            case 22:
                return Boolean.valueOf(NavigationDrawerKt.Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67(function0));
            case 23:
                return new tn((Call.Factory) function0.invoke());
            case 24:
                function0.invoke();
                return Unit.INSTANCE;
            case 25:
                return (String) function0.invoke();
            case 26:
                return (MediaSource) function0.invoke();
            case 27:
                function0.invoke();
                return Unit.INSTANCE;
            case 28:
                return (MediaSource) function0.invoke();
            default:
                return (String) function0.invoke();
        }
    }
}
