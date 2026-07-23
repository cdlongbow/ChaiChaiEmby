package defpackage;

import android.util.Log;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ForwardingTrackOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class gc0 extends ForwardingTrackOutput {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc0(TrackOutput trackOutput, int i) {
        super(trackOutput);
        trackOutput.getClass();
        this.a = i;
    }

    @Override // androidx.media3.extractor.ForwardingTrackOutput, androidx.media3.extractor.TrackOutput
    public final void format(Format format) {
        String lowerCase;
        List<String> groupValues;
        String str;
        format.getClass();
        Regex regex = dc0.a;
        if (Intrinsics.areEqual(format.sampleMimeType, MimeTypes.VIDEO_DOLBY_VISION)) {
            Regex regex2 = dc0.a;
            String str2 = format.codecs;
            Integer intOrNull = null;
            if (str2 != null) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            MatchResult matchResultFind$default = Regex.find$default(regex2, lowerCase, 0, 2, null);
            if (matchResultFind$default != null && (groupValues = matchResultFind$default.getGroupValues()) != null && (str = (String) CollectionsKt.getOrNull(groupValues, 1)) != null) {
                intOrNull = StringsKt.toIntOrNull(str);
            }
            if (intOrNull != null && intOrNull.intValue() == 7) {
                String h265BaseLayerCodecsString = NalUnitUtil.getH265BaseLayerCodecsString(format.initializationData);
                String str3 = format.codecs;
                if (str3 == null) {
                    str3 = "-";
                }
                Log.w("DoviBaseLayerCompat", "将 Dolby Vision P7 轨道改写为 HEVC 基底层: track=" + this.a + " codecs=" + str3 + " baseLayerCodecs=" + (h265BaseLayerCodecsString != null ? h265BaseLayerCodecsString : "-"));
                format = format.buildUpon().setSampleMimeType(MimeTypes.VIDEO_H265).setCodecs(h265BaseLayerCodecsString).build();
                format.getClass();
            }
        }
        super.format(format);
    }
}
