package defpackage;

import android.os.Bundle;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.Tracks;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f92 implements xl0 {
    public final /* synthetic */ int a;

    public /* synthetic */ f92(int i) {
        this.a = i;
    }

    @Override // defpackage.xl0
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((TrackGroup) obj).toBundle();
            case 1:
                return TrackGroup.fromBundle((Bundle) obj);
            case 2:
                return ((TrackSelectionOverride) obj).toBundle();
            case 3:
                return TrackSelectionOverride.fromBundle((Bundle) obj);
            case 4:
                return ((Tracks.Group) obj).toBundle();
            default:
                return Tracks.Group.fromBundle((Bundle) obj);
        }
    }
}
