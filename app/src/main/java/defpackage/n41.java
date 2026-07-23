package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.Person;
import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.text.SubtitleParser;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n41 implements ExtractorsFactory, Id3Decoder.FramePredicate {
    public final /* synthetic */ int a;

    public /* synthetic */ n41(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ NotificationChannel a(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup b(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* bridge */ /* synthetic */ Person c(Object obj) {
        return (Person) obj;
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    public static /* synthetic */ void h(Object obj, int i, int i2, String str) {
        throw new GdxRuntimeException(str + i + obj + i2);
    }

    public static /* synthetic */ void i(Object obj, int i, String str) {
        throw new IllegalStateException((str + i + obj).toString());
    }

    public static /* synthetic */ void j(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void k(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void m(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void p(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void q(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void r(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void u(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void w(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.a) {
            case 1:
                return Mp3Extractor.lambda$static$0();
            case 2:
            default:
                return OggExtractor.lambda$static$0();
            case 3:
                return Mp4Extractor.lambda$static$1();
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        return Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
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

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public ExtractorsFactory mo10559setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.a;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map map) {
        switch (this.a) {
            case 1:
                return Mp3Extractor.lambda$static$0();
            case 2:
            default:
                return OggExtractor.lambda$static$0();
            case 3:
                return Mp4Extractor.lambda$static$1();
        }
    }
}
