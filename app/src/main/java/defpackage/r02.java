package defpackage;

import android.app.RemoteAction;
import android.database.SQLException;
import android.net.Uri;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r02 implements ListenerSet.Event, TextInclusionStrategy, ExtractorsFactory, VisualTransformation {
    public final /* synthetic */ int a;

    public /* synthetic */ r02(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ RemoteAction a(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* synthetic */ void c() {
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void e(SQLException sQLException) throws DatabaseIOException {
        throw new DatabaseIOException(sQLException);
    }

    public static /* synthetic */ void f(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void g(String str, Object obj) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + i).toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new GdxRuntimeException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void k(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(StringBuilder sb, int i, int i2) {
        sb.append(i);
        sb.append((char) i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(" is less than minimum ");
        sb.append(obj);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void p() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void q(String str, Object obj) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.a) {
            case 11:
                return TsExtractor.lambda$static$1();
            default:
                return WavExtractor.lambda$static$0();
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

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        return VisualTransformation.Companion.None$lambda$0(annotatedString);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean isIncluded(Rect rect, Rect rect2) {
        switch (this.a) {
            case 6:
                return rect.overlaps(rect2);
            case 7:
                return TextInclusionStrategy.Companion.ContainsAll$lambda$0(rect, rect2);
            default:
                return TextInclusionStrategy.Companion.ContainsCenter$lambda$0(rect, rect2);
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public ExtractorsFactory mo10559setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.a;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map map) {
        switch (this.a) {
            case 11:
                return TsExtractor.lambda$static$1();
            default:
                return WavExtractor.lambda$static$0();
        }
    }
}
