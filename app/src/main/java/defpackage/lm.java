package defpackage;

import android.graphics.ColorSpace;
import androidx.compose.runtime.CancellationHandle;
import androidx.media3.common.Format;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import java.io.EOFException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lm implements BundledChunkExtractor.ManifestFormatMerger, CacheKeyFactory, CancellationHandle {
    public static /* bridge */ /* synthetic */ ColorSpace.Rgb b(Object obj) {
        return (ColorSpace.Rgb) obj;
    }

    public static /* synthetic */ void c(long j, Object obj) throws EOFException {
        throw new EOFException("\\n not found: limit=" + j + ((Object) " content=") + obj + Typography.ellipsis);
    }

    public static /* synthetic */ void d(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void f(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void i(String str, Object obj) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    @Override // androidx.media3.datasource.cache.CacheKeyFactory
    public String buildCacheKey(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
        CancellationHandle.Companion.Empty$lambda$0();
    }

    @Override // androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.ManifestFormatMerger
    public Format merge(Format format, Format format2) {
        return format2 != null ? format.withManifestFormatInfo(format2) : format;
    }
}
