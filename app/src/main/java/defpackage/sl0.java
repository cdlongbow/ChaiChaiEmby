package defpackage;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.TsExtractor;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sl0 implements ExtractorsFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ SubtitleParser.Factory b;

    public /* synthetic */ sl0(SubtitleParser.Factory factory, int i) {
        this.a = i;
        this.b = factory;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors(Uri uri, Map map) {
        switch (this.a) {
            case 0:
                return FragmentedMp4Extractor.lambda$newFactory$0(this.b);
            case 1:
                return MatroskaExtractor.lambda$newFactory$0(this.b);
            case 2:
                return Mp4Extractor.lambda$newFactory$0(this.b);
            default:
                return TsExtractor.lambda$newFactory$0(this.b);
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies */
    public final ExtractorsFactory mo10558experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        int i2 = this.a;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        int i = this.a;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public final ExtractorsFactory mo10559setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.a;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        int i = this.a;
        SubtitleParser.Factory factory = this.b;
        switch (i) {
            case 0:
                return FragmentedMp4Extractor.lambda$newFactory$0(factory);
            case 1:
                return MatroskaExtractor.lambda$newFactory$0(factory);
            case 2:
                return Mp4Extractor.lambda$newFactory$0(factory);
            default:
                return TsExtractor.lambda$newFactory$0(factory);
        }
    }
}
