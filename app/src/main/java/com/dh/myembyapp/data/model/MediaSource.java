package com.dh.myembyapp.data.model;

import androidx.compose.material3.internal.TextFieldImplKt;
import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import defpackage.s01;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010+\u001a\u00020\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¦\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0014\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010=\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010>\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006?"}, d2 = {"Lcom/dh/myembyapp/data/model/MediaSource;", "", TtmlNode.ATTR_ID, "", HintConstants.AUTOFILL_HINT_NAME, "path", TtmlNode.RUBY_CONTAINER, "size", "", "runTimeTicks", "bitrate", "", "videoType", "supportsDirectStream", "", "supportsTranscoding", "mediaStreams", "", "Lcom/dh/myembyapp/data/model/MediaStream;", "directStreamUrl", "transcodingUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getPath", "getContainer", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRunTimeTicks", "getBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVideoType", "getSupportsDirectStream", "()Z", "getSupportsTranscoding", "getMediaStreams", "()Ljava/util/List;", "getDirectStreamUrl", "getTranscodingUrl", "getDisplayName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/dh/myembyapp/data/model/MediaSource;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MediaSource {
    public static final int $stable = 8;

    @SerializedName("Bitrate")
    private final Integer bitrate;

    @SerializedName(TextFieldImplKt.ContainerId)
    private final String container;

    @SerializedName("DirectStreamUrl")
    private final String directStreamUrl;

    @SerializedName("Id")
    private final String id;

    @SerializedName("MediaStreams")
    private final List<MediaStream> mediaStreams;

    @SerializedName("Name")
    private final String name;

    @SerializedName("Path")
    private final String path;

    @SerializedName("RunTimeTicks")
    private final Long runTimeTicks;

    @SerializedName("Size")
    private final Long size;

    @SerializedName("SupportsDirectStream")
    private final boolean supportsDirectStream;

    @SerializedName("SupportsTranscoding")
    private final boolean supportsTranscoding;

    @SerializedName("TranscodingUrl")
    private final String transcodingUrl;

    @SerializedName("VideoType")
    private final String videoType;

    public /* synthetic */ MediaSource(String str, String str2, String str3, String str4, Long l, Long l2, Integer num, String str5, boolean z, boolean z2, List list, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaSource copy$default(MediaSource mediaSource, String str, String str2, String str3, String str4, Long l, Long l2, Integer num, String str5, boolean z, boolean z2, List list, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaSource.id;
        }
        return mediaSource.copy(str, (i & 2) != 0 ? mediaSource.name : str2, (i & 4) != 0 ? mediaSource.path : str3, (i & 8) != 0 ? mediaSource.container : str4, (i & 16) != 0 ? mediaSource.size : l, (i & 32) != 0 ? mediaSource.runTimeTicks : l2, (i & 64) != 0 ? mediaSource.bitrate : num, (i & 128) != 0 ? mediaSource.videoType : str5, (i & 256) != 0 ? mediaSource.supportsDirectStream : z, (i & 512) != 0 ? mediaSource.supportsTranscoding : z2, (i & 1024) != 0 ? mediaSource.mediaStreams : list, (i & 2048) != 0 ? mediaSource.directStreamUrl : str6, (i & 4096) != 0 ? mediaSource.transcodingUrl : str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component10, reason: from getter */

    public final List<MediaStream> component11() {
        return this.mediaStreams;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */

    /* JADX INFO: renamed from: component13, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final MediaSource copy(String id, String name, String path, String container, Long size, Long runTimeTicks, Integer bitrate, String videoType, boolean supportsDirectStream, boolean supportsTranscoding, List<MediaStream> mediaStreams, String directStreamUrl, String transcodingUrl) {
        id.getClass();
        path.getClass();
        container.getClass();
        return new MediaSource(id, name, path, container, size, runTimeTicks, bitrate, videoType, supportsDirectStream, supportsTranscoding, mediaStreams, directStreamUrl, transcodingUrl);
    }

public boolean equals(Object other) {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int i = i02.i(i02.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.path), 31, this.container);
        Long l = this.size;
        int iHashCode2 = (i + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.runTimeTicks;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.bitrate;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.videoType;
        int iHashCode5 = (((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.supportsDirectStream ? 1231 : 1237)) * 31) + (this.supportsTranscoding ? 1231 : 1237)) * 31;
        List<MediaStream> list = this.mediaStreams;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.directStreamUrl;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.transcodingUrl;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.path;
        String str4 = this.container;
        Long l = this.size;
        Long l2 = this.runTimeTicks;
        Integer num = this.bitrate;
        String str5 = this.videoType;
        boolean z = this.supportsDirectStream;
        boolean z2 = this.supportsTranscoding;
        List<MediaStream> list = this.mediaStreams;
        String str6 = this.directStreamUrl;
        String str7 = this.transcodingUrl;
        StringBuilder sbZ = kb0.z("MediaSource(id=", str, ", name=", str2, ", path=");
        i02.v(sbZ, str3, ", container=", str4, ", size=");
        sbZ.append(l);
        sbZ.append(", runTimeTicks=");
        sbZ.append(l2);
        sbZ.append(", bitrate=");
        sbZ.append(num);
        sbZ.append(", videoType=");
        sbZ.append(str5);
        sbZ.append(", supportsDirectStream=");
        i9.r(sbZ, z, ", supportsTranscoding=", z2, ", mediaStreams=");
        sbZ.append(list);
        sbZ.append(", directStreamUrl=");
        sbZ.append(str6);
        sbZ.append(", transcodingUrl=");
        return s01.w(sbZ, str7, ")");
    }

    public MediaSource(String str, String str2, String str3, String str4, Long l, Long l2, Integer num, String str5, boolean z, boolean z2, List<MediaStream> list, String str6, String str7) {
        s01.D(str, str3, str4);
        this.id = str;
        this.name = str2;
        this.path = str3;
        this.container = str4;
        this.size = l;
        this.runTimeTicks = l2;
        this.bitrate = num;
        this.videoType = str5;
        this.supportsDirectStream = z;
        this.supportsTranscoding = z2;
        this.mediaStreams = list;
        this.directStreamUrl = str6;
        this.transcodingUrl = str7;
    }
}
