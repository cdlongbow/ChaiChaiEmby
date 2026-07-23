package defpackage;

import android.location.GnssStatus;
import android.net.Uri;
import android.view.WindowMetrics;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;

import java.nio.file.FileVisitResult;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xc0 implements DrmSessionManager.DrmSessionReference, ExtractorsFactory, ExoMediaDrm.Provider {
    public final /* synthetic */ int a;

    public /* synthetic */ xc0(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ GnssStatus a(Object obj) {
        return (GnssStatus) obj;
    }

    public static /* bridge */ /* synthetic */ Class b() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ FileVisitResult c(Object obj) {
        return (FileVisitResult) obj;
    }

    public static /* synthetic */ void e(Object obj, String str, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void f(String str, double d) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void g(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void i(StringBuilder sb, Object obj, Throwable th) {
        sb.append(" (");
        sb.append(obj);
        sb.append(")");
        throw new GdxRuntimeException(sb.toString(), th);
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return DeleteRangeGesture.class;
    }

    public static /* synthetic */ void k(String str, Object obj) {
        throw new GdxRuntimeException(str + obj);
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return DeleteGesture.class;
    }

    public static /* synthetic */ void m(String str, Object obj) {
        throw new GdxRuntimeException(str + obj);
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return SelectRangeGesture.class;
    }

    public static /* synthetic */ void o(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return WindowMetrics.class;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
    public ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
        return FrameworkMediaDrm.lambda$static$0(uuid);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map map) {
        switch (this.a) {
            case 15:
                return createExtractors();
            case 20:
                return FlacExtractor.lambda$static$0();
            case 22:
                return FlvExtractor.lambda$static$0();
            default:
                return FragmentedMp4Extractor.lambda$static$1();
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies */
    public ExtractorsFactory mo10558experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        int i2 = this.a;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        int i = this.a;
        return this;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
    public void release() {
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public ExtractorsFactory mo10559setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.a;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.a) {
            case 15:
                return new Extractor[0];
            case 20:
                return FlacExtractor.lambda$static$0();
            case 22:
                return FlvExtractor.lambda$static$0();
            default:
                return FragmentedMp4Extractor.lambda$static$1();
        }
    }
}
