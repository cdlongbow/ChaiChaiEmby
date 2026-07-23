package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.TextRangeLayoutMeasureResult;
import androidx.compose.foundation.text.TextRangeLayoutMeasureScope;
import androidx.compose.foundation.text.TextRangeScopeMeasurePolicy;
import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p20 implements ListenerSet.Event, ListenerSet.IterationFinishedEvent, ExtractorsFactory, CallbackToFutureAdapter.Resolver, SlotTableEditor.VisitSlotsInRememberOrderCallback, TextRangeScopeMeasurePolicy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p20(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((ExperimentalBitmapProcessor) this.b).lambda$applyEffectsAsync$3((Bitmap) this.c, completer);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return ((DefaultMediaSourceFactory) this.b).lambda$createMediaSource$0((Format) this.c);
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

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onPlaybackParametersChanged((AnalyticsListener.EventTime) this.b, (PlaybackParameters) this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged((AnalyticsListener.EventTime) this.b, (TrackSelectionParameters) this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.b, (Player.Commands) this.c);
                break;
            case 3:
            default:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.b, (CueGroup) this.c);
                break;
            case 4:
                ((AnalyticsListener) obj).onAudioAttributesChanged((AnalyticsListener.EventTime) this.b, (AudioAttributes) this.c);
                break;
            case 5:
                ((AnalyticsListener) obj).onMetadata((AnalyticsListener.EventTime) this.b, (Metadata) this.c);
                break;
            case 6:
                ((AnalyticsListener) obj).onTracksChanged((AnalyticsListener.EventTime) this.b, (Tracks) this.c);
                break;
            case 7:
                DefaultAnalyticsCollector.lambda$onDrmKeysLoaded$65((AnalyticsListener.EventTime) this.b, (KeyRequestInfo) this.c, (AnalyticsListener) obj);
                break;
            case 8:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.b, (List<Cue>) this.c);
                break;
            case 9:
                ((AnalyticsListener) obj).onDeviceInfoChanged((AnalyticsListener.EventTime) this.b, (DeviceInfo) this.c);
                break;
            case 10:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$59((AnalyticsListener.EventTime) this.b, (VideoSize) this.c, (AnalyticsListener) obj);
                break;
        }
    }

    @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
    public TextRangeLayoutMeasureResult measure(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        return TextLinkScope.textRange$lambda$0((TextLinkScope) this.b, (AnnotatedString.Range) this.c, textRangeLayoutMeasureScope);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public ExtractorsFactory mo10559setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this;
    }

    @Override // androidx.compose.runtime.composer.linkbuffer.SlotTableEditor.VisitSlotsInRememberOrderCallback
    public boolean visit(int i, int i2, Object obj) {
        return SlotTableEditorKt.deactivateGroup$lambda$0((SlotTableEditor) this.b, (RememberManager) this.c, i, i2, obj);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors(Uri uri, Map map) {
        return createExtractors();
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((DefaultAnalyticsCollector) this.b).lambda$setPlayer$0((Player) this.c, (AnalyticsListener) obj, flagSet);
    }
}
