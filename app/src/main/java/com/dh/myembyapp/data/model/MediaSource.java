package com.dh.myembyapp.data.model;

import androidx.compose.material3.internal.TextFieldImplKt;
import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import defpackage.kb0;
import defpackage.s01;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final  class MediaSource {
    

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
