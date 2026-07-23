package defpackage;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ForwardingExtractorsFactory;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cc0 extends ForwardingExtractorsFactory {
    @Override // androidx.media3.extractor.ForwardingExtractorsFactory, androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors(Uri uri, Map map) {
        uri.getClass();
        map.getClass();
        Extractor[] extractorArrCreateExtractors = super.createExtractors(uri, map);
        extractorArrCreateExtractors.getClass();
        ArrayList arrayList = new ArrayList(extractorArrCreateExtractors.length);
        for (Extractor extractor : extractorArrCreateExtractors) {
            arrayList.add(new ec0(extractor));
        }
        return (Extractor[]) arrayList.toArray(new Extractor[0]);
    }

    @Override // androidx.media3.extractor.ForwardingExtractorsFactory, androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] extractorArrCreateExtractors = super.createExtractors();
        extractorArrCreateExtractors.getClass();
        ArrayList arrayList = new ArrayList(extractorArrCreateExtractors.length);
        for (Extractor extractor : extractorArrCreateExtractors) {
            arrayList.add(new ec0(extractor));
        }
        return (Extractor[]) arrayList.toArray(new Extractor[0]);
    }
}
