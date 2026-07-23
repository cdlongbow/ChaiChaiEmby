package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NavDeepLink b;

    public /* synthetic */ b71(NavDeepLink navDeepLink, int i) {
        this.a = i;
        this.b = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zAddDeepLink$lambda$4;
        int i = this.a;
        NavDeepLink navDeepLink = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                zAddDeepLink$lambda$4 = NavDestinationImpl.addDeepLink$lambda$4(navDeepLink, str);
                break;
            default:
                zAddDeepLink$lambda$4 = NavDestinationImpl._set_route_$lambda$1(navDeepLink, str);
                break;
        }
        return Boolean.valueOf(zAddDeepLink$lambda$4);
    }
}
