package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010%J\u009c\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00106J\u0014\u00107\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00109\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010:\u001a\u00020\rHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b'\u0010%R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b(\u0010%¨\u0006;"}, d2 = {"Lcom/dh/myembyapp/data/model/PlaybackInfoRequest;", "", "deviceProfile", "Lcom/dh/myembyapp/data/model/DeviceProfile;", "maxStreamingBitrate", "", "maxWidth", "", "maxHeight", "startTimeTicks", "audioStreamIndex", "subtitleStreamIndex", "mediaSourceId", "", "maxAudioChannels", "enableDirectPlay", "", "enableDirectStream", "enableTranscoding", "<init>", "(Lcom/dh/myembyapp/data/model/DeviceProfile;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDeviceProfile", "()Lcom/dh/myembyapp/data/model/DeviceProfile;", "getMaxStreamingBitrate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxHeight", "getStartTimeTicks", "getAudioStreamIndex", "getSubtitleStreamIndex", "getMediaSourceId", "()Ljava/lang/String;", "getMaxAudioChannels", "getEnableDirectPlay", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableDirectStream", "getEnableTranscoding", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/dh/myembyapp/data/model/DeviceProfile;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/dh/myembyapp/data/model/PlaybackInfoRequest;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PlaybackInfoRequest {
    public static final int $stable = 8;

    @SerializedName("AudioStreamIndex")
    private final Integer audioStreamIndex;

    @SerializedName("DeviceProfile")
    private final DeviceProfile deviceProfile;

    @SerializedName("EnableDirectPlay")
    private final Boolean enableDirectPlay;

    @SerializedName("EnableDirectStream")
    private final Boolean enableDirectStream;

    @SerializedName("EnableTranscoding")
    private final Boolean enableTranscoding;

    @SerializedName("MaxAudioChannels")
    private final Integer maxAudioChannels;

    @SerializedName("MaxHeight")
    private final Integer maxHeight;

    @SerializedName("MaxStreamingBitrate")
    private final Long maxStreamingBitrate;

    @SerializedName("MaxWidth")
    private final Integer maxWidth;

    @SerializedName("MediaSourceId")
    private final String mediaSourceId;

    @SerializedName("StartTimeTicks")
    private final Long startTimeTicks;

    @SerializedName("SubtitleStreamIndex")
    private final Integer subtitleStreamIndex;

    public /* synthetic */ PlaybackInfoRequest(DeviceProfile deviceProfile, Long l, Integer num, Integer num2, Long l2, Integer num3, Integer num4, String str, Integer num5, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceProfile, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : bool3);
    }

    public static /* synthetic */ PlaybackInfoRequest copy$default(PlaybackInfoRequest playbackInfoRequest, DeviceProfile deviceProfile, Long l, Integer num, Integer num2, Long l2, Integer num3, Integer num4, String str, Integer num5, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceProfile = playbackInfoRequest.deviceProfile;
        }
        if ((i & 2) != 0) {
            l = playbackInfoRequest.maxStreamingBitrate;
        }
        if ((i & 4) != 0) {
            num = playbackInfoRequest.maxWidth;
        }
        if ((i & 8) != 0) {
            num2 = playbackInfoRequest.maxHeight;
        }
        if ((i & 16) != 0) {
            l2 = playbackInfoRequest.startTimeTicks;
        }
        if ((i & 32) != 0) {
            num3 = playbackInfoRequest.audioStreamIndex;
        }
        if ((i & 64) != 0) {
            num4 = playbackInfoRequest.subtitleStreamIndex;
        }
        if ((i & 128) != 0) {
            str = playbackInfoRequest.mediaSourceId;
        }
        if ((i & 256) != 0) {
            num5 = playbackInfoRequest.maxAudioChannels;
        }
        if ((i & 512) != 0) {
            bool = playbackInfoRequest.enableDirectPlay;
        }
        if ((i & 1024) != 0) {
            bool2 = playbackInfoRequest.enableDirectStream;
        }
        if ((i & 2048) != 0) {
            bool3 = playbackInfoRequest.enableTranscoding;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        Integer num6 = num5;
        Boolean bool6 = bool;
        Integer num7 = num4;
        String str2 = str;
        Long l3 = l2;
        Integer num8 = num3;
        return playbackInfoRequest.copy(deviceProfile, l, num, num2, l3, num8, num7, str2, num6, bool6, bool4, bool5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component10, reason: from getter */

    /* JADX INFO: renamed from: component11, reason: from getter */

    /* JADX INFO: renamed from: component12, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final PlaybackInfoRequest copy(DeviceProfile deviceProfile, Long maxStreamingBitrate, Integer maxWidth, Integer maxHeight, Long startTimeTicks, Integer audioStreamIndex, Integer subtitleStreamIndex, String mediaSourceId, Integer maxAudioChannels, Boolean enableDirectPlay, Boolean enableDirectStream, Boolean enableTranscoding) {
        deviceProfile.getClass();
        return new PlaybackInfoRequest(deviceProfile, maxStreamingBitrate, maxWidth, maxHeight, startTimeTicks, audioStreamIndex, subtitleStreamIndex, mediaSourceId, maxAudioChannels, enableDirectPlay, enableDirectStream, enableTranscoding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackInfoRequest)) {
            return false;
        }
        PlaybackInfoRequest playbackInfoRequest = (PlaybackInfoRequest) other;
        return Intrinsics.areEqual(this.deviceProfile, playbackInfoRequest.deviceProfile) && Intrinsics.areEqual(this.maxStreamingBitrate, playbackInfoRequest.maxStreamingBitrate) && Intrinsics.areEqual(this.maxWidth, playbackInfoRequest.maxWidth) && Intrinsics.areEqual(this.maxHeight, playbackInfoRequest.maxHeight) && Intrinsics.areEqual(this.startTimeTicks, playbackInfoRequest.startTimeTicks) && Intrinsics.areEqual(this.audioStreamIndex, playbackInfoRequest.audioStreamIndex) && Intrinsics.areEqual(this.subtitleStreamIndex, playbackInfoRequest.subtitleStreamIndex) && Intrinsics.areEqual(this.mediaSourceId, playbackInfoRequest.mediaSourceId) && Intrinsics.areEqual(this.maxAudioChannels, playbackInfoRequest.maxAudioChannels) && Intrinsics.areEqual(this.enableDirectPlay, playbackInfoRequest.enableDirectPlay) && Intrinsics.areEqual(this.enableDirectStream, playbackInfoRequest.enableDirectStream) && Intrinsics.areEqual(this.enableTranscoding, playbackInfoRequest.enableTranscoding);
    }













    public int hashCode() {
        int iHashCode = this.deviceProfile.hashCode() * 31;
        Long l = this.maxStreamingBitrate;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.maxWidth;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxHeight;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.startTimeTicks;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.audioStreamIndex;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.subtitleStreamIndex;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.mediaSourceId;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.maxAudioChannels;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.enableDirectPlay;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableDirectStream;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableTranscoding;
        return iHashCode11 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "PlaybackInfoRequest(deviceProfile=" + this.deviceProfile + ", maxStreamingBitrate=" + this.maxStreamingBitrate + ", maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + ", startTimeTicks=" + this.startTimeTicks + ", audioStreamIndex=" + this.audioStreamIndex + ", subtitleStreamIndex=" + this.subtitleStreamIndex + ", mediaSourceId=" + this.mediaSourceId + ", maxAudioChannels=" + this.maxAudioChannels + ", enableDirectPlay=" + this.enableDirectPlay + ", enableDirectStream=" + this.enableDirectStream + ", enableTranscoding=" + this.enableTranscoding + ")";
    }

    public PlaybackInfoRequest(DeviceProfile deviceProfile, Long l, Integer num, Integer num2, Long l2, Integer num3, Integer num4, String str, Integer num5, Boolean bool, Boolean bool2, Boolean bool3) {
        deviceProfile.getClass();
        this.deviceProfile = deviceProfile;
        this.maxStreamingBitrate = l;
        this.maxWidth = num;
        this.maxHeight = num2;
        this.startTimeTicks = l2;
        this.audioStreamIndex = num3;
        this.subtitleStreamIndex = num4;
        this.mediaSourceId = str;
        this.maxAudioChannels = num5;
        this.enableDirectPlay = bool;
        this.enableDirectStream = bool2;
        this.enableTranscoding = bool3;
    }
}
