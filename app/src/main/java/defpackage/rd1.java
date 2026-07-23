package defpackage;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.ProfilingManager;
import android.text.PrecomputedText;
import android.view.textclassifier.TextClassifier;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rd1 implements ExtractorsFactory, DoubleFunction, GlShaderProgram.ErrorListener {
    public static /* bridge */ /* synthetic */ ShortcutInfo a(Object obj) {
        return (ShortcutInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ ProfilingManager c(Object obj) {
        return (ProfilingManager) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier d(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return ProfilingManager.class;
    }

    public static /* synthetic */ void f() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void g(int i, int i2) {
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i + ((Object) " is less than minimum ") + i2 + '.');
    }

    public static /* synthetic */ void h(int i, int i2, String str) {
        throw new IllegalArgumentException(str + i + 'x' + i2);
    }

    public static /* synthetic */ void i(int i, long j) throws IOException {
        throw new IOException("Content-Length (" + j + ((Object) ") and stream length (") + i + ((Object) ") disagree"));
    }

    public static /* synthetic */ void j(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void k(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void l(Object obj, int i, int i2, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void n(Object obj, String str, Object obj2) {
        throw new NoSuchElementException(str + obj + obj2);
    }

    public static /* synthetic */ void o(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void p(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void q(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void r(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void u() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void v(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void w(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void x(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return PsExtractor.lambda$static$0();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies */
    public ExtractorsFactory mo10558experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return this;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        return Rgb.DoubleIdentity$lambda$0(d);
    }

    @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        SeparableConvolutionShaderProgram.lambda$new$0(videoFrameProcessingException);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public ExtractorsFactory mo10559setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map map) {
        return PsExtractor.lambda$static$0();
    }
}
