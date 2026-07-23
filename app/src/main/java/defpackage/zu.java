package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.common.MimeTypes;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class zu implements ck0 {
    public final rd2 a;
    public final wa1 b;

    public zu(rd2 rd2Var, wa1 wa1Var) {
        this.a = rd2Var;
        this.b = wa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    @Override // defpackage.ck0
    public final Object a(eg0 eg0Var) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listA;
        int size;
        Bundle bundle;
        rd2 rd2Var = this.a;
        Uri uri = Uri.parse(rd2Var.a);
        wa1 wa1Var = this.b;
        ContentResolver contentResolver = wa1Var.a.getContentResolver();
        String str = rd2Var.d;
        if (Intrinsics.areEqual(str, "com.android.contacts") && Intrinsics.areEqual(CollectionsKt.lastOrNull(ku.A(rd2Var)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                qu.g(uri, "Unable to find a contact photo associated with '", "'.");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.areEqual(str, "media") && (size = (listA = ku.A(rd2Var)).size()) >= 3 && Intrinsics.areEqual(listA.get(size - 3), MimeTypes.BASE_TYPE_AUDIO) && Intrinsics.areEqual(listA.get(size - 2), "albums")) {
            n12 n12Var = wa1Var.b;
            ab0 ab0Var = n12Var.a;
            ya0 ya0Var = ab0Var instanceof ya0 ? (ya0) ab0Var : null;
            if (ya0Var != null) {
                int i = ya0Var.a;
                ab0 ab0Var2 = n12Var.b;
                ya0 ya0Var2 = ab0Var2 instanceof ya0 ? (ya0) ab0Var2 : null;
                if (ya0Var2 != null) {
                    int i2 = ya0Var2.a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                qu.g(uri, "Unable to find a music thumbnail associated with '", "'.");
                return null;
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                qu.g(uri, "Unable to open '", "'.");
                return null;
            }
        }
        return new o22(new p22(Okio.buffer(Okio.source(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), wa1Var.f, new uu(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), o00.c);
    }
}
