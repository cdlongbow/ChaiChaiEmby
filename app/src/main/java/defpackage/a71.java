package defpackage;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ a71(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean matchingArguments$lambda$13;
        int i = this.a;
        Bundle bundle = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                matchingArguments$lambda$13 = NavDeepLink.getMatchingArguments$lambda$13(bundle, str);
                break;
            default:
                matchingArguments$lambda$13 = NavDestinationImpl.hasRequiredArguments$lambda$7(bundle, str);
                break;
        }
        return Boolean.valueOf(matchingArguments$lambda$13);
    }
}
