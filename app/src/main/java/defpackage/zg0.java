package defpackage;

import android.net.Uri;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zg0 implements ExtractorsFactory {
    public static final zg0 b = new zg0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ zg0(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ AutofillManager b(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue c(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return AutofillManager.class;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.a) {
            case 1:
                return Ac3Extractor.lambda$static$0();
            case 2:
                return Ac4Extractor.lambda$static$0();
            case 19:
                return AdtsExtractor.lambda$static$0();
            default:
                return AmrExtractor.lambda$static$0();
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
                return Ac3Extractor.lambda$static$0();
            case 2:
                return Ac4Extractor.lambda$static$0();
            case 19:
                return AdtsExtractor.lambda$static$0();
            default:
                return AmrExtractor.lambda$static$0();
        }
    }
}
