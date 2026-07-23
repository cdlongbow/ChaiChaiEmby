package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g32 {
    public static final ImageDecoder.Source a(ks0 ks0Var, wa1 wa1Var) {
        Path pathA;
        if (ks0Var.getFileSystem() == FileSystem.SYSTEM && (pathA = ks0Var.a()) != null) {
            return ImageDecoder.createSource(pathA.toFile());
        }
        tl0 metadata = ks0Var.getMetadata();
        if (metadata instanceof ke) {
            return ImageDecoder.createSource(wa1Var.a.getAssets(), ((ke) metadata).c);
        }
        if ((metadata instanceof uu) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((uu) metadata).c;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new j11(assetFileDescriptor, 1));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof ut1) {
            ut1 ut1Var = (ut1) metadata;
            if (Intrinsics.areEqual(ut1Var.c, wa1Var.a.getPackageName())) {
                return ImageDecoder.createSource(wa1Var.a.getResources(), ut1Var.d);
            }
        }
        if (metadata instanceof gn) {
            return ImageDecoder.createSource(((gn) metadata).c);
        }
        return null;
    }
}
