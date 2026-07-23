package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q21 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NavHostController b;

    public /* synthetic */ q21(NavHostController navHostController, int i) {
        this.a = i;
        this.b = navHostController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.navigate("server_list", (Function1<? super NavOptionsBuilder, Unit>) new y21(1));
                break;
            case 1:
                NavController.navigate$default((NavController) this.b, "danmaku_settings", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 2:
                NavController.navigate$default((NavController) this.b, "dlna_settings", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 3:
                NavController.navigate$default((NavController) this.b, "add_server", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 4:
                NavController.navigate$default((NavController) this.b, "danmaku_settings", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 5:
                NavController.navigate$default((NavController) this.b, "dlna_settings", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                break;
            case 6:
                this.b.popBackStack();
                break;
            case 7:
                this.b.popBackStack();
                break;
            case 8:
                this.b.popBackStack();
                break;
            default:
                this.b.popBackStack();
                break;
        }
        return Unit.INSTANCE;
    }
}
