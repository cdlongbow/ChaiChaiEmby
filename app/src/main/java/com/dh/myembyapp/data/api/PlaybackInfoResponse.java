package com.dh.myembyapp.data.api;

import com.dh.myembyapp.data.model.MediaSource;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class PlaybackInfoResponse {
    

    @SerializedName("MediaSources")
    private final List<MediaSource> mediaSources;

    @SerializedName("PlaySessionId")
    private final String playSessionId;

    public /* synthetic */ PlaybackInfoResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaybackInfoResponse copy$default(PlaybackInfoResponse playbackInfoResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = playbackInfoResponse.mediaSources;
        }
        if ((i & 2) != 0) {
            str = playbackInfoResponse.playSessionId;
        }
        return playbackInfoResponse.copy(list, str);
    }

    public final List<MediaSource> component1() {
        return this.mediaSources;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final PlaybackInfoResponse copy(List<MediaSource> mediaSources, String playSessionId) {
        return new PlaybackInfoResponse(mediaSources, playSessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackInfoResponse)) {
            return false;
        }
        PlaybackInfoResponse playbackInfoResponse = (PlaybackInfoResponse) other;
        return Intrinsics.areEqual(this.mediaSources, playbackInfoResponse.mediaSources) && Intrinsics.areEqual(this.playSessionId, playbackInfoResponse.playSessionId);
    }

    public final List<MediaSource> getMediaSources() {
        return this.mediaSources;
    }


    public int hashCode() {
        List<MediaSource> list = this.mediaSources;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.playSessionId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PlaybackInfoResponse(mediaSources=" + this.mediaSources + ", playSessionId=" + this.playSessionId + ")";
    }

    public PlaybackInfoResponse(List<MediaSource> list, String str) {
        this.mediaSources = list;
        this.playSessionId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlaybackInfoResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
