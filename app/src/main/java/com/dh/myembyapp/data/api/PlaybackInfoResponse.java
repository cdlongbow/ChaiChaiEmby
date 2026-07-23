package com.dh.myembyapp.data.api;

import com.dh.myembyapp.data.model.MediaSource;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/dh/myembyapp/data/api/PlaybackInfoResponse;", "", "mediaSources", "", "Lcom/dh/myembyapp/data/model/MediaSource;", "playSessionId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getMediaSources", "()Ljava/util/List;", "getPlaySessionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PlaybackInfoResponse {
    public static final int $stable = 8;

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
