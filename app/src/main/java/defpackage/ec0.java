package defpackage;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingExtractor;

/* JADX INFO: loaded from: classes4.dex */
public final class ec0 extends ForwardingExtractor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec0(Extractor extractor) {
        super(extractor);
        extractor.getClass();
    }

    @Override // androidx.media3.extractor.ForwardingExtractor, androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        extractorOutput.getClass();
        extractorOutput.getClass();
        super.init(new fc0(extractorOutput));
    }
}
