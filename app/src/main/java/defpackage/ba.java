package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ba implements cw0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ba(int i) {
        this.a = i;
    }

    @Override // defpackage.cw0
    public final String a(Object obj, wa1 wa1Var) {
        switch (this.a) {
            case 0:
                rd2 rd2Var = (rd2) obj;
                if (!Intrinsics.areEqual(rd2Var.c, "android.resource")) {
                    return null;
                }
                Configuration configuration = wa1Var.a.getResources().getConfiguration();
                Bitmap.Config[] configArr = ce2.a;
                return rd2Var + ":" + (configuration.uiMode & 48);
            default:
                return ((rd2) obj).a;
        }
    }
}
