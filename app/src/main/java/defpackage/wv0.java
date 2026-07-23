package defpackage;

import android.media.MediaParser;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.media3.common.Format;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaParserExtractorAdapter;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wv0 implements ShouldPauseCallback, LoudnessCodecController.LoudnessParameterUpdateListener, ExtractorsFactory, MediaCodecSelector, ProgressiveMediaExtractor.Factory, HlsExtractorFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ wv0(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint c(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    public static /* bridge */ /* synthetic */ LocaleList e(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ void h(Object obj, int i, int i2, String str) {
        throw new IllegalArgumentException(str + i + obj + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(Object obj, int i, String str) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void j(Object obj, Object obj2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    public static /* synthetic */ void k(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void l(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
        return MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return MatroskaExtractor.lambda$static$1();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return MediaParserExtractorAdapter.lambda$static$0(playerId);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public HlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public HlsExtractorFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
    public List getDecoderInfos(String str, boolean z, boolean z2) {
        switch (this.a) {
            case 17:
                return MediaCodecUtil.getDecoderInfos(str, z, z2);
            default:
                return MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(MediaCodecSelector.DEFAULT.getDecoderInfos(str, z, z2));
        }
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public Format getOutputTextFormat(Format format) {
        return format;
    }

    @Override // androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener
    public Bundle onLoudnessParameterUpdate(Bundle bundle) {
        return bundle;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public HlsExtractorFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this;
    }

    @Override // androidx.compose.runtime.ShouldPauseCallback
    public boolean shouldPause() {
        return LayoutNodeSubcompositionsState.applyPausedPrecomposition$lambda$0$0$0();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map map) {
        return MatroskaExtractor.lambda$static$1();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: experimentalSetCodecsToParseWithinGopSampleDependencies, reason: collision with other method in class */
    public ExtractorsFactory mo10558experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory, reason: collision with other method in class */
    public ExtractorsFactory mo10559setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this;
    }
}
