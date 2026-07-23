package defpackage;

import android.util.Log;
import androidx.media3.common.Format;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e52 {
    public static final boolean a(ExoPlayer exoPlayer, Tracks tracks, String str) {
        exoPlayer.getClass();
        tracks.getClass();
        if (str == null || StringsKt.isBlank(str)) {
            return false;
        }
        at0 groups = tracks.getGroups();
        groups.getClass();
        int size = groups.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = groups.get(i);
            i++;
            Tracks.Group group = (Tracks.Group) obj;
            if (!z && group.getType() == 3) {
                int i2 = group.length;
                for (int i3 = 0; i3 < i2; i3++) {
                    Format trackFormat = group.getTrackFormat(i3);
                    trackFormat.getClass();
                    String str2 = trackFormat.label;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (Intrinsics.areEqual(str2, str)) {
                        TrackSelectionParameters.Builder builderBuildUpon = exoPlayer.getTrackSelectionParameters().buildUpon();
                        builderBuildUpon.getClass();
                        builderBuildUpon.clearOverridesOfType(3);
                        builderBuildUpon.setTrackTypeDisabled(3, false);
                        builderBuildUpon.addOverride(new TrackSelectionOverride(group.getMediaTrackGroup(), (List<Integer>) CollectionsKt.listOf(Integer.valueOf(i3))));
                        exoPlayer.setTrackSelectionParameters(builderBuildUpon.build());
                        Log.d("SubtitleTrack", "已按标签选中在线字幕: " + str);
                        z = true;
                    }
                }
            }
        }
        return z;
    }
}
