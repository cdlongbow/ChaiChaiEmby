package defpackage;

import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.android.LayoutIntrinsics_androidKt;
import androidx.media3.common.Format;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z9 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ z9(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return AndroidPrefetchScheduler.prefetchRequests$lambda$0((PriorityTask) obj, (PriorityTask) obj2);
            case 1:
                return BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
            case 2:
                return DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
            case 3:
                MediaItem mediaItem = (MediaItem) obj;
                MediaItem mediaItem2 = (MediaItem) obj2;
                Integer indexNumber = mediaItem.getIndexNumber();
                Integer indexNumber2 = mediaItem2.getIndexNumber();
                if (indexNumber != null && indexNumber2 != null) {
                    return Intrinsics.compare(indexNumber.intValue(), indexNumber2.intValue());
                }
                if (indexNumber != null) {
                    return -1;
                }
                if (indexNumber2 != null) {
                    return 1;
                }
                return StringsKt__StringsJVMKt.compareTo(mediaItem.getName(), mediaItem2.getName(), true);
            case 4:
                return HlsMediaPlaylist.Interstitial.lambda$new$0((HlsMediaPlaylist.ClientDefinedAttribute) obj, (HlsMediaPlaylist.ClientDefinedAttribute) obj2);
            case 5:
                return LayoutIntrinsics_androidKt.IntRangeComparator$lambda$0((IntRange) obj, (IntRange) obj2);
            case 6:
                return LayoutNode.ZComparator$lambda$0((LayoutNode) obj, (LayoutNode) obj2);
            case 7:
                return LazyLayoutMeasuredItemKt.LazyLayoutMeasuredItemIndexComparator$lambda$0((LazyLayoutMeasuredItem) obj, (LazyLayoutMeasuredItem) obj2);
            case 8:
                return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
            default:
                return SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
        }
    }
}
