package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.TextStyle;
import androidx.exifinterface.media.ExifInterface;
import com.dh.myembyapp.data.api.TraktApiService;
import com.dh.myembyapp.data.model.TraktSyncHistoryRequest;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class i02 {
    public static List A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static PathBuilder C(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static PathBuilder E(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.verticalLineTo(f5);
        return pathBuilder;
    }

    public static void F(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void G(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.close();
    }

    public static void H(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void I(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static /* synthetic */ Object J(TraktApiService traktApiService, String str, String str2, String str3, TraktSyncHistoryRequest traktSyncHistoryRequest, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: removeFromWatchedHistory");
            return null;
        }
        if ((i & 4) != 0) {
            str3 = ExifInterface.GPS_MEASUREMENT_2D;
        }
        return traktApiService.removeFromWatchedHistory(str, str2, str3, traktSyncHistoryRequest, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void K(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: showMenu");
            return;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        if ((i & 16) != 0) {
            function3 = null;
        }
        if ((i & 32) != 0) {
            function4 = null;
        }
        textToolbar.showMenu(rect, function0, function1, function2, function3, function4);
    }

    public static /* synthetic */ Object a(TraktApiService traktApiService, String str, String str2, String str3, TraktSyncHistoryRequest traktSyncHistoryRequest, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: addToWatchedHistory");
            return null;
        }
        if ((i & 4) != 0) {
            str3 = ExifInterface.GPS_MEASUREMENT_2D;
        }
        return traktApiService.addToWatchedHistory(str, str2, str3, traktSyncHistoryRequest, continuation);
    }

    public static /* synthetic */ Object b(TraktApiService traktApiService, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getEpisodePlaybackProgress");
            return null;
        }
        if ((i & 4) != 0) {
            str3 = ExifInterface.GPS_MEASUREMENT_2D;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            str4 = "full";
        }
        return traktApiService.getEpisodePlaybackProgress(str, str2, str5, str4, continuation);
    }

    public static /* synthetic */ Object c(TraktApiService traktApiService, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getMoviePlaybackProgress");
            return null;
        }
        if ((i & 4) != 0) {
            str3 = ExifInterface.GPS_MEASUREMENT_2D;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            str4 = "full";
        }
        return traktApiService.getMoviePlaybackProgress(str, str2, str5, str4, continuation);
    }

    public static /* synthetic */ Object d(TraktApiService traktApiService, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getMovieWatchedHistory");
            return null;
        }
        if ((i & 8) != 0) {
            str4 = ExifInterface.GPS_MEASUREMENT_2D;
        }
        String str6 = str4;
        if ((i & 16) != 0) {
            str5 = "full";
        }
        return traktApiService.getMovieWatchedHistory(str, str2, str3, str6, str5, continuation);
    }

    public static /* synthetic */ Object e(TraktApiService traktApiService, String str, int i, int i2, String str2, String str3, String str4, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getShowEpisode");
            return null;
        }
        if ((i3 & 16) != 0) {
            str3 = ExifInterface.GPS_MEASUREMENT_2D;
        }
        String str5 = str3;
        if ((i3 & 32) != 0) {
            str4 = "full";
        }
        return traktApiService.getShowEpisode(str, i, i2, str2, str5, str4, continuation);
    }

    public static /* synthetic */ Object f(TraktApiService traktApiService, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: getShowWatchedProgress");
            return null;
        }
        if ((i & 8) != 0) {
            str4 = ExifInterface.GPS_MEASUREMENT_2D;
        }
        return traktApiService.getShowWatchedProgress(str, str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? false : z3, continuation);
    }

    public static /* synthetic */ Object g(TraktApiService traktApiService, String str, String str2, String str3, String str4, String str5, String str6, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: lookupById");
            return null;
        }
        if ((i & 8) != 0) {
            str4 = ExifInterface.GPS_MEASUREMENT_2D;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            str5 = "show";
        }
        String str8 = str5;
        if ((i & 32) != 0) {
            str6 = "full";
        }
        return traktApiService.lookupById(str, str2, str3, str7, str8, str6, continuation);
    }

    public static float h(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    public static int i(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int j(TextStyle textStyle, int i, int i2) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static int k(CharSequence charSequence, Function1 function1) {
        charSequence.getClass();
        function1.getClass();
        return charSequence.length();
    }

    public static PathBuilder l(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.verticalLineToRelative(f5);
        return pathBuilder;
    }

    public static Object m(CharSequence charSequence, int i, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i)));
    }

    public static Object n(String str) {
        return ResultKt.createFailure(new Exception(str));
    }

    public static String o(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String p(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder q(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder r(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static List s(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List t(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void v(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean w(Composer composer) {
        composer.endNode();
        composer.endNode();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static float x(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static PathBuilder y(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.lineToRelative(f4, f5);
        return pathBuilder;
    }

    public static List z(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }
}
