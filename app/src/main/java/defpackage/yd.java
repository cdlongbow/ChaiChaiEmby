package defpackage;

import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes4.dex */
public final class yd implements ExtractorOutput {
    public final ExtractorOutput a;
    public final md b;
    public final od c;

    public yd(ExtractorOutput extractorOutput, md mdVar, od odVar) {
        extractorOutput.getClass();
        mdVar.getClass();
        this.a = extractorOutput;
        this.b = mdVar;
        this.c = odVar;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void endTracks() {
        this.a.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void seekMap(SeekMap seekMap) {
        seekMap.getClass();
        this.a.seekMap(seekMap);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput track(int i, int i2) {
        ExtractorOutput extractorOutput = this.a;
        if (i2 == 3) {
            TrackOutput trackOutputTrack = extractorOutput.track(i, i2);
            trackOutputTrack.getClass();
            return new je(trackOutputTrack, this.b, this.c);
        }
        TrackOutput trackOutputTrack2 = extractorOutput.track(i, i2);
        trackOutputTrack2.getClass();
        return trackOutputTrack2;
    }
}
