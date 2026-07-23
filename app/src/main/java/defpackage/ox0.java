package defpackage;

import androidx.activity.compose.LocalActivityKt;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.material3.ListItemKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.ImeAction;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ox0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ox0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return LegacyTextInputMethodRequest.onImeActionPerformed$lambda$0((ImeAction) obj);
            case 1:
                MediaItem mediaItem = (MediaItem) obj;
                mediaItem.getClass();
                return mediaItem.getId();
            case 2:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 3:
                MediaItem mediaItem2 = (MediaItem) obj;
                mediaItem2.getClass();
                return mediaItem2.getId();
            case 4:
                Library library = (Library) obj;
                library.getClass();
                return library.getId();
            case 5:
                return ListItemKt.ListItem_HXNGIdc$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
            case 6:
                return LocalActivityKt.LocalActivity$lambda$0((CompositionLocalAccessorScope) obj);
            case 7:
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                navOptionsBuilder.getClass();
                navOptionsBuilder.popUpTo("server_list", (Function1<? super PopUpToBuilder, Unit>) new ox0(12));
                return Unit.INSTANCE;
            case 8:
                NavOptionsBuilder navOptionsBuilder2 = (NavOptionsBuilder) obj;
                navOptionsBuilder2.getClass();
                navOptionsBuilder2.popUpTo("server_list", (Function1<? super PopUpToBuilder, Unit>) new y21(4));
                return Unit.INSTANCE;
            case 9:
                NavOptionsBuilder navOptionsBuilder3 = (NavOptionsBuilder) obj;
                navOptionsBuilder3.getClass();
                navOptionsBuilder3.popUpTo("home", (Function1<? super PopUpToBuilder, Unit>) new ox0(26));
                navOptionsBuilder3.setLaunchSingleTop(true);
                return Unit.INSTANCE;
            case 10:
                NavOptionsBuilder navOptionsBuilder4 = (NavOptionsBuilder) obj;
                navOptionsBuilder4.getClass();
                navOptionsBuilder4.popUpTo("aggregate_search", (Function1<? super PopUpToBuilder, Unit>) new y21(5));
                navOptionsBuilder4.setLaunchSingleTop(true);
                return Unit.INSTANCE;
            case 11:
                NavOptionsBuilder navOptionsBuilder5 = (NavOptionsBuilder) obj;
                navOptionsBuilder5.getClass();
                navOptionsBuilder5.popUpTo("server_list", (Function1<? super PopUpToBuilder, Unit>) new y21(2));
                return Unit.INSTANCE;
            case 12:
                PopUpToBuilder popUpToBuilder = (PopUpToBuilder) obj;
                popUpToBuilder.getClass();
                popUpToBuilder.setInclusive(false);
                return Unit.INSTANCE;
            case 13:
                PopUpToBuilder popUpToBuilder2 = (PopUpToBuilder) obj;
                popUpToBuilder2.getClass();
                popUpToBuilder2.setInclusive(true);
                return Unit.INSTANCE;
            case 14:
                NavArgumentBuilder navArgumentBuilder = (NavArgumentBuilder) obj;
                navArgumentBuilder.getClass();
                navArgumentBuilder.setType(NavType.StringType);
                return Unit.INSTANCE;
            case 15:
                NavArgumentBuilder navArgumentBuilder2 = (NavArgumentBuilder) obj;
                navArgumentBuilder2.getClass();
                navArgumentBuilder2.setType(NavType.StringType);
                navArgumentBuilder2.setNullable(true);
                navArgumentBuilder2.setDefaultValue(null);
                return Unit.INSTANCE;
            case 16:
                NavArgumentBuilder navArgumentBuilder3 = (NavArgumentBuilder) obj;
                navArgumentBuilder3.getClass();
                navArgumentBuilder3.setType(NavType.StringType);
                return Unit.INSTANCE;
            case 17:
                NavArgumentBuilder navArgumentBuilder4 = (NavArgumentBuilder) obj;
                navArgumentBuilder4.getClass();
                navArgumentBuilder4.setType(NavType.StringType);
                navArgumentBuilder4.setNullable(true);
                navArgumentBuilder4.setDefaultValue(null);
                return Unit.INSTANCE;
            case 18:
                NavArgumentBuilder navArgumentBuilder5 = (NavArgumentBuilder) obj;
                navArgumentBuilder5.getClass();
                navArgumentBuilder5.setType(NavType.StringType);
                return Unit.INSTANCE;
            case 19:
                NavArgumentBuilder navArgumentBuilder6 = (NavArgumentBuilder) obj;
                navArgumentBuilder6.getClass();
                navArgumentBuilder6.setType(NavType.StringType);
                navArgumentBuilder6.setDefaultValue("");
                return Unit.INSTANCE;
            case 20:
                NavArgumentBuilder navArgumentBuilder7 = (NavArgumentBuilder) obj;
                navArgumentBuilder7.getClass();
                navArgumentBuilder7.setType(NavType.StringType);
                navArgumentBuilder7.setNullable(true);
                navArgumentBuilder7.setDefaultValue(null);
                return Unit.INSTANCE;
            case 21:
                PopUpToBuilder popUpToBuilder3 = (PopUpToBuilder) obj;
                popUpToBuilder3.getClass();
                popUpToBuilder3.setInclusive(true);
                return Unit.INSTANCE;
            case 22:
                NavArgumentBuilder navArgumentBuilder8 = (NavArgumentBuilder) obj;
                navArgumentBuilder8.getClass();
                navArgumentBuilder8.setType(NavType.StringType);
                return Unit.INSTANCE;
            case 23:
                NavArgumentBuilder navArgumentBuilder9 = (NavArgumentBuilder) obj;
                navArgumentBuilder9.getClass();
                navArgumentBuilder9.setType(NavType.StringType);
                navArgumentBuilder9.setDefaultValue("");
                return Unit.INSTANCE;
            case 24:
                NavArgumentBuilder navArgumentBuilder10 = (NavArgumentBuilder) obj;
                navArgumentBuilder10.getClass();
                navArgumentBuilder10.setType(NavType.BoolType);
                navArgumentBuilder10.setDefaultValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 25:
                NavArgumentBuilder navArgumentBuilder11 = (NavArgumentBuilder) obj;
                navArgumentBuilder11.getClass();
                navArgumentBuilder11.setType(NavType.StringType);
                return Unit.INSTANCE;
            case 26:
                PopUpToBuilder popUpToBuilder4 = (PopUpToBuilder) obj;
                popUpToBuilder4.getClass();
                popUpToBuilder4.setInclusive(false);
                return Unit.INSTANCE;
            case 27:
                NavArgumentBuilder navArgumentBuilder12 = (NavArgumentBuilder) obj;
                navArgumentBuilder12.getClass();
                navArgumentBuilder12.setType(NavType.StringType);
                return Unit.INSTANCE;
            case 28:
                NavArgumentBuilder navArgumentBuilder13 = (NavArgumentBuilder) obj;
                navArgumentBuilder13.getClass();
                navArgumentBuilder13.setType(NavType.StringType);
                return Unit.INSTANCE;
            default:
                PopUpToBuilder popUpToBuilder5 = (PopUpToBuilder) obj;
                popUpToBuilder5.getClass();
                popUpToBuilder5.setInclusive(true);
                return Unit.INSTANCE;
        }
    }
}
