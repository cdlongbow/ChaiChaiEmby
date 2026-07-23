package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public final class j81 {
    public final g1 a;

    public j81(g1 g1Var) {
        this.a = g1Var;
    }

    public static String a(String str, ek0 ek0Var, boolean z) {
        String strConcat = ek0Var.a;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return mr.r("lottie_cache_", strReplaceAll, strConcat);
    }

    public final File b(String str) {
        File file = new File(c(), a(str, ek0.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(c(), a(str, ek0.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(c(), a(str, ek0.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public final File c() {
        File file = new File(((Context) this.a.b).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File d(String str, InputStream inputStream, ek0 ek0Var) throws IOException {
        File file = new File(c(), a(str, ek0Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }
}
