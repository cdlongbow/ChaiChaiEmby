package defpackage;

import android.graphics.Bitmap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class ik0 implements cw0 {
    @Override // defpackage.cw0
    public final String a(Object obj, wa1 wa1Var) {
        String strZ;
        rd2 rd2Var = (rd2) obj;
        String str = rd2Var.c;
        if ((str == null || Intrinsics.areEqual(str, "file")) && rd2Var.e != null) {
            Bitmap.Config[] configArr = ce2.a;
            if ((!Intrinsics.areEqual(rd2Var.c, "file") || !Intrinsics.areEqual(CollectionsKt.firstOrNull(ku.A(rd2Var)), "android_asset")) && ((Boolean) tl0.v(wa1Var, hs0.c)).booleanValue() && (strZ = ku.z(rd2Var)) != null) {
                return rd2Var + "-" + wa1Var.f.metadata(Path.Companion.get$default(Path.INSTANCE, strZ, false, 1, (Object) null)).getLastModifiedAtMillis();
            }
        }
        return null;
    }
}
