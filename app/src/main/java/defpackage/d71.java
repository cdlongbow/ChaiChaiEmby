package defpackage;

import android.view.View;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.gestures.OffsetSmoother;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.SubtitleFormatPriorityType;
import com.dh.myembyapp.data.model.SubtitleLanguagePriorityType;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d71 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ d71(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return NavGraphBuilder.build$lambda$1$lambda$0((NavDestination) obj);
            case 1:
                return NavGraphImpl.setStartDestination$lambda$12((NavDestination) obj);
            case 2:
                return NavHostKt.NavHost$lambda$33$lambda$32((AnimatedContentTransitionScope) obj);
            case 3:
                return NavHostKt.NavHost$lambda$3$lambda$2((AnimatedContentTransitionScope) obj);
            case 4:
                return NavHostKt.NavHost$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
            case 5:
                return NavHostKt.NavHost$lambda$21$lambda$20((AnimatedContentTransitionScope) obj);
            case 6:
                return NavHostKt.NavHost$lambda$23$lambda$22((AnimatedContentTransitionScope) obj);
            case 7:
                return NavHostKt.NavHost$lambda$28$lambda$27((AnimatedContentTransitionScope) obj);
            case 8:
                return ((NavBackStackEntry) obj).getId();
            case 9:
                return NavHostKt.NavHost$lambda$30$lambda$29((AnimatedContentTransitionScope) obj);
            case 10:
                return NavHostKt.NavHost$lambda$9$lambda$8((AnimatedContentTransitionScope) obj);
            case 11:
                return NavHostKt.NavHost$lambda$11$lambda$10((AnimatedContentTransitionScope) obj);
            case 12:
                return NavHostKt.NavHost$lambda$15$lambda$14((AnimatedContentTransitionScope) obj);
            case 13:
                return NavHostKt.NavHost$lambda$17$lambda$16((AnimatedContentTransitionScope) obj);
            case 14:
                return NavHostKt.NavHost$lambda$35$lambda$34((AnimatedContentTransitionScope) obj);
            case 15:
                return NavOptionsBuilder.popUpTo$lambda$1((PopUpToBuilder) obj);
            case 16:
                return NavOptionsBuilder.popUpTo$lambda$2((PopUpToBuilder) obj);
            case 17:
                return NavOptionsBuilder.popUpTo$lambda$3((PopUpToBuilder) obj);
            case 18:
                return Navigation.findViewNavController$lambda$2((View) obj);
            case 19:
                return Navigation.findViewNavController$lambda$3((View) obj);
            case 20:
                return NavigationDrawerKt.NavigationDrawerItem$lambda$64$lambda$63((SemanticsPropertyReceiver) obj);
            case 21:
                return Boolean.valueOf(NavigationDrawerKt.rememberDrawerState$lambda$1$lambda$0((DrawerValue) obj));
            case 22:
                return Navigator.onLaunchSingleTop$lambda$3((NavOptionsBuilder) obj);
            case 23:
                return Float.valueOf(OffsetSmoother.smoothEventPosition_MK_Hz9U$lambda$1(((Long) obj).longValue()));
            case 24:
                return Float.valueOf(OffsetSmoother.smoothEventPosition_MK_Hz9U$lambda$2(((Long) obj).longValue()));
            case 25:
                MediaItem mediaItem = (MediaItem) obj;
                mediaItem.getClass();
                return mediaItem.getName();
            case 26:
                SubtitleFormatPriorityType subtitleFormatPriorityType = (SubtitleFormatPriorityType) obj;
                subtitleFormatPriorityType.getClass();
                return subtitleFormatPriorityType.getLabel();
            case 27:
                SubtitleLanguagePriorityType subtitleLanguagePriorityType = (SubtitleLanguagePriorityType) obj;
                subtitleLanguagePriorityType.getClass();
                return subtitleLanguagePriorityType.getLabel();
            case 28:
                xf xfVar = (xf) obj;
                xfVar.getClass();
                return xfVar.a;
            default:
                return AndroidOverscroll_androidKt.defaultOverscrollFactory((CompositionLocalAccessorScope) obj);
        }
    }
}
