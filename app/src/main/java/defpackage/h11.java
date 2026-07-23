package defpackage;

import androidx.collection.LruCache;

/* JADX INFO: loaded from: classes4.dex */
public final class h11 {
    public static final h11 b = new h11();
    public final LruCache a = new LruCache(20);

    public final g11 a(String str) {
        if (str == null) {
            return null;
        }
        return (g11) this.a.get(str);
    }
}
