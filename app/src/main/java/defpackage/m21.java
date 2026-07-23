package defpackage;

import androidx.lifecycle.SavedStateHandle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m21 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NavHostController b;

    public /* synthetic */ m21(NavHostController navHostController, int i) {
        this.a = i;
        this.b = navHostController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SavedStateHandle savedStateHandle;
        String str = (String) obj;
        switch (this.a) {
            case 0:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "detail/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 1:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "library/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 2:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "detail/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 3:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "detail/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 4:
                str.getClass();
                this.b.popBackStack();
                break;
            case 5:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "edit_server/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 6:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "detail/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 7:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "library/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 8:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "collection/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 9:
                str.getClass();
                String strConcat = "detail/".concat(str);
                NavHostController navHostController = this.b;
                NavController.navigate$default((NavController) navHostController, strConcat, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                NavBackStackEntry currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry != null && (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) != null) {
                    savedStateHandle.set("detailOpenedFromSimilar", Boolean.TRUE);
                }
                break;
            case 10:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "collection/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            default:
                str.getClass();
                NavController.navigate$default((NavController) this.b, "collection/".concat(str), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
        }
        return Unit.INSTANCE;
    }
}
