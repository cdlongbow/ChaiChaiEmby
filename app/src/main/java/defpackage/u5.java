package defpackage;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ u5(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity activity;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 1:
                activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.finish();
                }
                break;
            default:
                activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.finish();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
