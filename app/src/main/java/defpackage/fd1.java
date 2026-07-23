package defpackage;

import android.graphics.fonts.FontVariationAxis;
import java.nio.file.FileSystemException;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fd1 {
    public static /* synthetic */ FontVariationAxis a(float f) {
        return new FontVariationAxis("wght", f);
    }

    public static /* synthetic */ FontVariationAxis b(String str, float f) {
        return new FontVariationAxis(str, f);
    }

    public static /* synthetic */ FileSystemException c() {
        return new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
    }

    public static /* synthetic */ void d() {
    }
}
