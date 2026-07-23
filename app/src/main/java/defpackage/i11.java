package defpackage;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i11 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ i11(Context context, int i, String str, String str2) {
        this.a = i;
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [u30] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        g11 g11Var;
        Exception exc;
        Throwable th;
        Object r5;
        d21 d21Var;
        boolean z;
        g11 g11Var2;
        Pair pair;
        d21 d21VarG;
        switch (this.a) {
            case 0:
                Context context = this.b;
                String str = this.c;
                String str2 = this.d;
                r81 r81Var = iw0.a;
                if (r81Var == null) {
                    synchronized (r81.class) {
                        try {
                            r81Var = iw0.a;
                            if (r81Var == null) {
                                r81Var = new r81(iw0.a(context), new v30());
                                iw0.a = r81Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                r81 r81Var2 = r81Var;
                Object obj = null;
                String str3 = null;
                u30 u30Var = null;
                if (str2 != null) {
                    try {
                        File fileB = r81Var2.a.b(str);
                        if (fileB == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileB);
                            ek0 ek0Var = fileB.getAbsolutePath().endsWith(".zip") ? ek0.ZIP : fileB.getAbsolutePath().endsWith(".gz") ? ek0.GZIP : ek0.JSON;
                            fileB.getAbsolutePath();
                            r01.a();
                            pair = new Pair(ek0Var, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        g11Var = null;
                    } else {
                        ek0 ek0Var2 = (ek0) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        int iOrdinal = ek0Var2.ordinal();
                        if (iOrdinal == 1) {
                            d21VarG = m11.g(context, new ZipInputStream(inputStream), str2);
                        } else if (iOrdinal != 2) {
                            d21VarG = m11.d(inputStream, str2);
                        } else {
                            try {
                                d21VarG = m11.d(new GZIPInputStream(inputStream), str2);
                            } catch (IOException e) {
                                d21VarG = new d21(e);
                            }
                        }
                        g11Var = d21VarG.a;
                        if (g11Var == null) {
                            g11Var = null;
                        }
                    }
                    break;
                } else {
                    g11Var = null;
                }
                if (g11Var == null) {
                    r01.a();
                    r01.a();
                    try {
                        try {
                            u30 u30VarA = r81Var2.b.a(str);
                            try {
                                try {
                                    z = u30VarA.a.getResponseCode() / 100 == 2;
                                } catch (IOException unused2) {
                                }
                                if (z) {
                                    InputStream inputStream2 = u30VarA.a.getInputStream();
                                    String contentType = u30VarA.a.getContentType();
                                    d21Var = r81Var2.a(context, str, inputStream2, contentType, str2);
                                    g11 g11Var3 = d21Var.a;
                                    r01.a();
                                    str3 = contentType;
                                } else {
                                    d21Var = new d21(new IllegalArgumentException(u30VarA.b()));
                                }
                                try {
                                    u30VarA.close();
                                    obj = str3;
                                } catch (IOException e2) {
                                    r01.c("LottieFetchResult close failed ", e2);
                                    obj = str3;
                                }
                                break;
                            } catch (Exception e3) {
                                exc = e3;
                                u30Var = u30VarA;
                                d21 d21Var2 = new d21(exc);
                                if (u30Var != null) {
                                    try {
                                        u30Var.close();
                                    } catch (IOException e4) {
                                        r01.c("LottieFetchResult close failed ", e4);
                                    }
                                }
                                d21Var = d21Var2;
                                obj = u30Var;
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                                r5 = u30VarA;
                                if (r5 == 0) {
                                    throw th;
                                }
                                try {
                                    r5.close();
                                    throw th;
                                } catch (IOException e5) {
                                    r01.c("LottieFetchResult close failed ", e5);
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r5 = obj;
                        }
                    } catch (Exception e6) {
                        exc = e6;
                    }
                    break;
                } else {
                    d21Var = new d21(g11Var);
                }
                if (str2 != null && (g11Var2 = d21Var.a) != null) {
                    h11.b.a.put(str2, g11Var2);
                }
                return d21Var;
            default:
                return m11.b(this.b, this.c, this.d);
        }
    }
}
