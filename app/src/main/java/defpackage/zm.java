package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MediaItem;
import androidx.media3.common.StreamKey;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.MediaExtractorCompatInternal;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.BundledExtractorsAdapter;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;
import java.util.Objects;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zm implements xl0 {
    public final /* synthetic */ int a;

    public /* synthetic */ zm(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    @Override // defpackage.xl0
    public final Object apply(Object obj) {
        StringBuilder sb;
        char cCharAt;
        boolean z = true;
        switch (this.a) {
            case 0:
                return BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
            case 1:
                return ((Cue) obj).toSerializableBundle();
            case 2:
                return CueGroup.lambda$static$0((Cue) obj);
            case 3:
                return Cue.fromBundle((Bundle) obj);
            case 4:
                return ((Cue) obj).toBinderBasedBundle();
            case 5:
                return DefaultGainProvider.Builder.lambda$new$0((Pair) obj);
            case 6:
                return ((TrackGroupArray) obj).toBundle();
            case 7:
                return ((DefaultTrackSelector.SelectionOverride) obj).toBundle();
            case 8:
                return TrackGroupArray.fromBundle((Bundle) obj);
            case 9:
                return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
            case 10:
                return new DefaultAnalyticsCollector((Clock) obj);
            case 11:
                return ExperimentalBitmapProcessor.lambda$applyEffectsAsync$4((Bitmap) obj);
            case 12:
                return ((Label) obj).toBundle();
            case 13:
                return Label.fromBundle((Bundle) obj);
            case 14:
                return Format.lambda$toLogString$0((Label) obj);
            case 15:
                return Boolean.valueOf(((List) obj).contains(String.class));
            case 16:
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            case 17:
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            case 18:
                return MediaExtractorCompatInternal.lambda$selectExtractor$0((Extractor) obj);
            case 19:
                return ((StreamKey) obj).toBundle();
            case 20:
                return ((MediaItem.SubtitleConfiguration) obj).toBundle();
            case 21:
                return StreamKey.fromBundle((Bundle) obj);
            case 22:
                return MediaItem.SubtitleConfiguration.fromBundle((Bundle) obj);
            case 23:
                String str = (String) obj;
                zo zoVar = f41.g;
                zoVar.getClass();
                for (int length = str.length() - 1; length >= 0; length--) {
                    if (!zoVar.c(str.charAt(length))) {
                        z = false;
                        if (!z && !str.isEmpty()) {
                            return str;
                        }
                        sb = new StringBuilder(str.length() + 16);
                        sb.append(Typography.quote);
                        for (int i = 0; i < str.length(); i++) {
                            cCharAt = str.charAt(i);
                            if (cCharAt != '\r' || cCharAt == '\\' || cCharAt == '\"') {
                                sb.append('\\');
                            }
                            sb.append(cCharAt);
                        }
                        sb.append(Typography.quote);
                        return sb.toString();
                    }
                }
                if (!z) {
                }
                sb = new StringBuilder(str.length() + 16);
                sb.append(Typography.quote);
                while (i < str.length()) {
                    cCharAt = str.charAt(i);
                    if (cCharAt != '\r') {
                        sb.append('\\');
                    } else {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append(Typography.quote);
                return sb.toString();
            case 24:
                Collection collection = (Collection) obj;
                int i2 = pt0.d;
                if (collection instanceof pt0) {
                    return (pt0) collection;
                }
                boolean z2 = collection instanceof pt0;
                int size = z2 ? ((ht1) ((jt1) ((pt0) collection)).h()).size() : 11;
                nt0 nt0Var = new nt0();
                nt0Var.b = false;
                h91 h91Var = new h91();
                h91Var.d(size);
                nt0Var.a = h91Var;
                Objects.requireNonNull(h91Var);
                if (z2) {
                    pt0 pt0Var = (pt0) collection;
                    h91 h91Var2 = pt0Var instanceof jt1 ? ((jt1) pt0Var).e : null;
                    if (h91Var2 != null) {
                        h91 h91Var3 = nt0Var.a;
                        h91Var3.a(Math.max(h91Var3.c, h91Var2.c));
                        i = h91Var2.c == 0 ? -1 : 0;
                        while (i >= 0) {
                            ig2.p(i, h91Var2.c);
                            Object obj2 = h91Var2.a[i];
                            ig2.p(i, h91Var2.c);
                            nt0Var.c(h91Var2.b[i], obj2);
                            i++;
                            if (i >= h91Var2.c) {
                                i = -1;
                            }
                        }
                    } else {
                        st0 st0VarI = pt0Var.i();
                        h91 h91Var4 = nt0Var.a;
                        h91Var4.a(Math.max(h91Var4.c, st0VarI.size()));
                        for (g91 g91Var : pt0Var.i()) {
                            nt0Var.c(g91Var.a(), g91Var.a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        nt0Var.a(it.next());
                    }
                }
                Objects.requireNonNull(nt0Var.a);
                if (nt0Var.a.c == 0) {
                    int i3 = pt0.d;
                    return jt1.i;
                }
                nt0Var.b = true;
                return new jt1(nt0Var.a);
            case 25:
                return Mp4Extractor.lambda$processMoovAtom$2((Track) obj);
            case 26:
                return Timeline.Window.fromBundle((Bundle) obj);
            case 27:
                return Timeline.Period.fromBundle((Bundle) obj);
            case 28:
                return Format.fromBundle((Bundle) obj);
            default:
                return TrackGroupArray.lambda$getTrackTypes$0((TrackGroup) obj);
        }
    }
}
