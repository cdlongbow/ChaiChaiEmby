package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class le implements bk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ le(int i) {
        this.a = i;
    }

    @Override // defpackage.bk0
    public final ck0 a(Object obj, wa1 wa1Var, ks1 ks1Var) {
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                rd2 rd2Var = (rd2) obj;
                Bitmap.Config[] configArr = ce2.a;
                if (Intrinsics.areEqual(rd2Var.c, "file") && Intrinsics.areEqual(CollectionsKt.firstOrNull(ku.A(rd2Var)), "android_asset")) {
                    return new me(rd2Var, wa1Var, i);
                }
                return null;
            case 1:
                return new ml((Bitmap) obj);
            case 2:
                return new dn((byte[]) obj, wa1Var, i);
            case 3:
                return new dn((ByteBuffer) obj, wa1Var, i2);
            case 4:
                rd2 rd2Var2 = (rd2) obj;
                if (Intrinsics.areEqual(rd2Var2.c, "content")) {
                    return new zu(rd2Var2, wa1Var);
                }
                return null;
            case 5:
                rd2 rd2Var3 = (rd2) obj;
                if (Intrinsics.areEqual(rd2Var3.c, "data")) {
                    return new r00(rd2Var3, wa1Var);
                }
                return null;
            case 6:
                return new dn((Drawable) obj, wa1Var, 2);
            case 7:
                rd2 rd2Var4 = (rd2) obj;
                String str = rd2Var4.c;
                if ((str != null && !Intrinsics.areEqual(str, "file")) || rd2Var4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = ce2.a;
                if (Intrinsics.areEqual(rd2Var4.c, "file") && Intrinsics.areEqual(CollectionsKt.firstOrNull(ku.A(rd2Var4)), "android_asset")) {
                    return null;
                }
                return new hk0(rd2Var4, wa1Var);
            case 8:
                rd2 rd2Var5 = (rd2) obj;
                if (Intrinsics.areEqual(rd2Var5.c, "jar:file")) {
                    return new qv0(rd2Var5, wa1Var);
                }
                return null;
            default:
                rd2 rd2Var6 = (rd2) obj;
                if (Intrinsics.areEqual(rd2Var6.c, "android.resource")) {
                    return new me(rd2Var6, wa1Var, i2);
                }
                return null;
        }
    }
}
