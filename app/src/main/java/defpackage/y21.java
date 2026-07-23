package defpackage;

import android.content.Context;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.SheetValue;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.text.MultiParagraphKt;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y21 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ y21(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                navOptionsBuilder.getClass();
                navOptionsBuilder.setLaunchSingleTop(true);
                return Unit.INSTANCE;
            case 1:
                NavOptionsBuilder navOptionsBuilder2 = (NavOptionsBuilder) obj;
                navOptionsBuilder2.getClass();
                navOptionsBuilder2.popUpTo("home", (Function1<? super PopUpToBuilder, Unit>) new y21(3));
                return Unit.INSTANCE;
            case 2:
                PopUpToBuilder popUpToBuilder = (PopUpToBuilder) obj;
                popUpToBuilder.getClass();
                popUpToBuilder.setInclusive(false);
                return Unit.INSTANCE;
            case 3:
                PopUpToBuilder popUpToBuilder2 = (PopUpToBuilder) obj;
                popUpToBuilder2.getClass();
                popUpToBuilder2.setInclusive(true);
                return Unit.INSTANCE;
            case 4:
                PopUpToBuilder popUpToBuilder3 = (PopUpToBuilder) obj;
                popUpToBuilder3.getClass();
                popUpToBuilder3.setInclusive(true);
                return Unit.INSTANCE;
            case 5:
                PopUpToBuilder popUpToBuilder4 = (PopUpToBuilder) obj;
                popUpToBuilder4.getClass();
                popUpToBuilder4.setInclusive(true);
                return Unit.INSTANCE;
            case 6:
                FocusProperties focusProperties = (FocusProperties) obj;
                focusProperties.getClass();
                focusProperties.setCanFocus(false);
                return Unit.INSTANCE;
            case 7:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                graphicsLayerScope.getClass();
                graphicsLayerScope.setRotationZ(45.0f);
                return Unit.INSTANCE;
            case 8:
                GraphicsLayerScope graphicsLayerScope2 = (GraphicsLayerScope) obj;
                graphicsLayerScope2.getClass();
                graphicsLayerScope2.setRotationZ(45.0f);
                return Unit.INSTANCE;
            case 9:
                return Boolean.valueOf(ModalBottomSheetKt.rememberModalBottomSheetState$lambda$26$lambda$25((SheetValue) obj));
            case 10:
                return Float.valueOf(ModalWideNavigationRailState.anchoredDraggableState$lambda$0(((Float) obj).floatValue()));
            case 11:
                return MultiParagraphKt.findParagraphByIndex$lambda$2$0((ParagraphInfo) obj);
            case 12:
                ServerConfig serverConfig = (ServerConfig) obj;
                int i = MyEmbyApp.j;
                serverConfig.getClass();
                return serverConfig.getEffectiveServerConfig();
            case 13:
                ServerConfig serverConfig2 = (ServerConfig) obj;
                int i2 = MyEmbyApp.j;
                serverConfig2.getClass();
                return Boolean.valueOf(serverConfig2.isLoggedIn());
            case 14:
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10$lambda$9$lambda$8((CreationExtras) obj);
            case 15:
                return NavBackStackEntryProviderKt.SaveableStateProvider$lambda$2$lambda$1((CreationExtras) obj);
            case 16:
                return NavController.handleDeepLink$lambda$21$lambda$18((AnimBuilder) obj);
            case 17:
                return NavController.handleDeepLink$lambda$21$lambda$20((PopUpToBuilder) obj);
            case 18:
                return NavController.activity$lambda$1((Context) obj);
            case 19:
                return NavControllerImpl.popBackStackInternal$lambda$4((NavBackStackEntry) obj);
            case 20:
                return NavControllerImpl.executePopOperations$lambda$11((NavDestination) obj);
            case 21:
                return NavControllerImpl.executePopOperations$lambda$14((NavDestination) obj);
            case 22:
                return Integer.valueOf(NavControllerImpl.launchSingleTopInternal$lambda$47((NavDestination) obj));
            case 23:
                return NavControllerImpl.navigateInternal$lambda$3((NavBackStackEntry) obj);
            case 24:
                return NavControllerImpl.clearBackStackInternal$lambda$19((NavOptionsBuilder) obj);
            case 25:
                return NavControllerViewModelKt.FACTORY$lambda$1$lambda$0((CreationExtras) obj);
            case 26:
                return NavDeepLinkBuilder.activity$lambda$0((Context) obj);
            case 27:
                return NavDeepLinkBuilder.activity$lambda$1((Context) obj);
            case 28:
                return NavDestination.Companion._get_hierarchy_$lambda$1((NavDestination) obj);
            default:
                return NavGraph.Companion.childHierarchy$lambda$0((NavDestination) obj);
        }
    }
}
