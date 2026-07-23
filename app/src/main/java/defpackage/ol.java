package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes4.dex */
public final class ol extends LruCache {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        ((String) obj).getClass();
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }
}
