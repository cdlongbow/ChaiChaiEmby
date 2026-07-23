package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class r81 {
    public final j81 a;
    public final v30 b;

    public r81(j81 j81Var, v30 v30Var) {
        this.a = j81Var;
        this.b = v30Var;
    }

    public final d21 a(Context context, String str, InputStream inputStream, String str2, String str3) {
        d21 d21VarG;
        ek0 ek0Var;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        j81 j81Var = this.a;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            r01.a();
            ek0 ek0Var2 = ek0.ZIP;
            d21VarG = str3 != null ? m11.g(context, new ZipInputStream(new FileInputStream(j81Var.d(str, inputStream, ek0Var2))), str) : m11.g(context, new ZipInputStream(inputStream), null);
            ek0Var = ek0Var2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            r01.a();
            ek0Var = ek0.GZIP;
            d21VarG = str3 != null ? m11.d(new GZIPInputStream(new FileInputStream(j81Var.d(str, inputStream, ek0Var))), str) : m11.d(new GZIPInputStream(inputStream), null);
        } else {
            r01.a();
            ek0Var = ek0.JSON;
            d21VarG = str3 != null ? m11.d(new FileInputStream(j81Var.d(str, inputStream, ek0Var).getAbsolutePath()), str) : m11.d(inputStream, null);
        }
        if (str3 != null && d21VarG.a != null) {
            File file = new File(j81Var.c(), j81.a(str, ek0Var, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            r01.a();
            if (!zRenameTo) {
                r01.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return d21VarG;
    }
}
