package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m11 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static f21 a(final String str, Callable callable, e eVar) {
        g11 g11VarA = str == null ? null : h11.b.a(str);
        f21 f21Var = g11VarA != null ? new f21(g11VarA) : null;
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            f21Var = (f21) map.get(str);
        }
        if (f21Var != null) {
            if (eVar != null) {
                eVar.run();
            }
            return f21Var;
        }
        final int i = 0;
        f21 f21Var2 = new f21(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            f21Var2.b(new b21() { // from class: k11
                @Override // defpackage.b21
                public final void onResult(Object obj) {
                    int i2 = i;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i2) {
                        case 0:
                            HashMap map2 = m11.a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                m11.j();
                            }
                            break;
                        default:
                            HashMap map3 = m11.a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                m11.j();
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            f21Var2.a(new b21() { // from class: k11
                @Override // defpackage.b21
                public final void onResult(Object obj) {
                    int i3 = i2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i3) {
                        case 0:
                            HashMap map2 = m11.a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                m11.j();
                            }
                            break;
                        default:
                            HashMap map3 = m11.a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                m11.j();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, f21Var2);
                if (map.size() == 1) {
                    j();
                }
            }
        }
        return f21Var2;
    }

    public static d21 b(Context context, String str, String str2) {
        g11 g11VarA = str2 == null ? null : h11.b.a(str2);
        if (g11VarA != null) {
            return new d21(g11VarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new d21(e);
        }
    }

    public static d21 c(Context context, InputStream inputStream, String str) {
        g11 g11VarA = str == null ? null : h11.b.a(str);
        if (g11VarA != null) {
            return new d21(g11VarA);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(inputStream));
            if (i(bufferedSourceBuffer, c).booleanValue()) {
                return g(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str);
            }
            if (i(bufferedSourceBuffer, d).booleanValue()) {
                return d(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str);
            }
            String[] strArr = tv0.e;
            return e(new uv0(bufferedSourceBuffer), str, true);
        } catch (IOException e) {
            return new d21(e);
        }
    }

    public static d21 d(InputStream inputStream, String str) {
        BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(inputStream));
        String[] strArr = tv0.e;
        return e(new uv0(bufferedSourceBuffer), str, true);
    }

    public static d21 e(uv0 uv0Var, String str, boolean z) {
        try {
            g11 g11VarA = str == null ? null : h11.b.a(str);
            if (g11VarA != null) {
                return new d21(g11VarA);
            }
            g11 g11VarA2 = n11.a(uv0Var);
            if (str != null) {
                h11.b.a.put(str, g11VarA2);
            }
            return new d21(g11VarA2);
        } catch (Exception e) {
            return new d21(e);
        } finally {
            if (z) {
                wd2.b(uv0Var);
            }
        }
    }

    public static d21 f(Context context, int i, String str) {
        g11 g11VarA = str == null ? null : h11.b.a(str);
        if (g11VarA != null) {
            return new d21(g11VarA);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i)));
            if (i(bufferedSourceBuffer, c).booleanValue()) {
                return g(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str);
            }
            if (!i(bufferedSourceBuffer, d).booleanValue()) {
                String[] strArr = tv0.e;
                return e(new uv0(bufferedSourceBuffer), str, true);
            }
            try {
                return d(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str);
            } catch (IOException e) {
                return new d21(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new d21(e2);
        }
    }

    public static d21 g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            wd2.b(zipInputStream);
        }
    }

    public static d21 h(Context context, ZipInputStream zipInputStream, String str) {
        g11 g11VarA;
        a21 a21Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            g11VarA = null;
        } else {
            try {
                g11VarA = h11.b.a(str);
            } catch (IOException e) {
                return new d21(e);
            }
        }
        if (g11VarA != null) {
            return new d21(g11VarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        g11 g11Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(zipInputStream));
                String[] strArr = tv0.e;
                g11Var = e(new uv0(bufferedSourceBuffer), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new d21(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    r01.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    r01.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (g11Var == null) {
            return new d21(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) g11Var.c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    a21Var = null;
                    break;
                }
                a21Var = (a21) it.next();
            } while (!a21Var.d.equals(str4));
            if (a21Var != null) {
                a21Var.f = wd2.d((Bitmap) entry.getValue(), a21Var.a, a21Var.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (fl0 fl0Var : g11Var.f.values()) {
                if (fl0Var.a.equals(entry2.getKey())) {
                    fl0Var.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                r01.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) g11Var.c()).entrySet().iterator();
            while (it2.hasNext()) {
                a21 a21Var2 = (a21) ((Map.Entry) it2.next()).getValue();
                if (a21Var2 == null) {
                    return null;
                }
                String str5 = a21Var2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = Input.Keys.NUMPAD_ENTER;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        a21Var2.f = wd2.d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), a21Var2.a, a21Var2.b);
                    } catch (IllegalArgumentException e2) {
                        r01.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            h11.b.a.put(str, g11Var);
        }
        return new d21(g11Var);
    }

    public static Boolean i(BufferedSource bufferedSource, byte[] bArr) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b2 : bArr) {
                if (bufferedSourcePeek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            bufferedSourcePeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            r01.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String k(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
