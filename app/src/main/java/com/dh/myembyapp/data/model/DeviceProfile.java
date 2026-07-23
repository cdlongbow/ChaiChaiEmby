package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.id;
import defpackage.qi0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J\u0087\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004J\n\u0010.\u001a\u00020/HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u00060"}, d2 = {"Lcom/dh/myembyapp/data/model/DeviceProfile;", "", "maxStreamingBitrate", "", "maxStaticBitrate", "musicStreamingTranscodingBitrate", "directPlayProfiles", "", "Lcom/dh/myembyapp/data/model/DirectPlayProfile;", "transcodingProfiles", "Lcom/dh/myembyapp/data/model/TranscodingProfile;", "codecProfiles", "Lcom/dh/myembyapp/data/model/CodecProfile;", "subtitleProfiles", "Lcom/dh/myembyapp/data/model/SubtitleProfile;", "responseProfiles", "Lcom/dh/myembyapp/data/model/ResponseProfile;", "containerProfiles", "<init>", "(JJJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMaxStreamingBitrate", "()J", "getMaxStaticBitrate", "getMusicStreamingTranscodingBitrate", "getDirectPlayProfiles", "()Ljava/util/List;", "getTranscodingProfiles", "getCodecProfiles", "getSubtitleProfiles", "getResponseProfiles", "getContainerProfiles", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DeviceProfile {
    public static final int $stable = 8;

    @SerializedName("CodecProfiles")
    private final List<CodecProfile> codecProfiles;

    @SerializedName("ContainerProfiles")
    private final List<Object> containerProfiles;

    @SerializedName("DirectPlayProfiles")
    private final List<DirectPlayProfile> directPlayProfiles;

    @SerializedName("MaxStaticBitrate")
    private final long maxStaticBitrate;

    @SerializedName("MaxStreamingBitrate")
    private final long maxStreamingBitrate;

    @SerializedName("MusicStreamingTranscodingBitrate")
    private final long musicStreamingTranscodingBitrate;

    @SerializedName("ResponseProfiles")
    private final List<ResponseProfile> responseProfiles;

    @SerializedName("SubtitleProfiles")
    private final List<SubtitleProfile> subtitleProfiles;

    @SerializedName("TranscodingProfiles")
    private final List<TranscodingProfile> transcodingProfiles;

    public /* synthetic */ DeviceProfile(long j, long j2, long j3, List list, List list2, List list3, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 40000000L : j, (i & 2) != 0 ? 40000000L : j2, (i & 4) != 0 ? 40000000L : j3, list, list2, list3, list4, (i & 128) != 0 ? CollectionsKt.emptyList() : list5, (i & 256) != 0 ? CollectionsKt.emptyList() : list6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceProfile copy$default(DeviceProfile deviceProfile, long j, long j2, long j3, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            j = deviceProfile.maxStreamingBitrate;
        }
        return deviceProfile.copy(j, (i & 2) != 0 ? deviceProfile.maxStaticBitrate : j2, (i & 4) != 0 ? deviceProfile.musicStreamingTranscodingBitrate : j3, (i & 8) != 0 ? deviceProfile.directPlayProfiles : list, (i & 16) != 0 ? deviceProfile.transcodingProfiles : list2, (i & 32) != 0 ? deviceProfile.codecProfiles : list3, (i & 64) != 0 ? deviceProfile.subtitleProfiles : list4, (i & 128) != 0 ? deviceProfile.responseProfiles : list5, (i & 256) != 0 ? deviceProfile.containerProfiles : list6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final List<DirectPlayProfile> component4() {
        return this.directPlayProfiles;
    }

    public final List<TranscodingProfile> component5() {
        return this.transcodingProfiles;
    }

    public final List<CodecProfile> component6() {
        return this.codecProfiles;
    }

    public final List<SubtitleProfile> component7() {
        return this.subtitleProfiles;
    }

    public final List<ResponseProfile> component8() {
        return this.responseProfiles;
    }

    public final List<Object> component9() {
        return this.containerProfiles;
    }

    public final DeviceProfile copy(long maxStreamingBitrate, long maxStaticBitrate, long musicStreamingTranscodingBitrate, List<DirectPlayProfile> directPlayProfiles, List<TranscodingProfile> transcodingProfiles, List<CodecProfile> codecProfiles, List<SubtitleProfile> subtitleProfiles, List<ResponseProfile> responseProfiles, List<? extends Object> containerProfiles) {
        directPlayProfiles.getClass();
        transcodingProfiles.getClass();
        codecProfiles.getClass();
        subtitleProfiles.getClass();
        responseProfiles.getClass();
        containerProfiles.getClass();
        return new DeviceProfile(maxStreamingBitrate, maxStaticBitrate, musicStreamingTranscodingBitrate, directPlayProfiles, transcodingProfiles, codecProfiles, subtitleProfiles, responseProfiles, containerProfiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceProfile)) {
            return false;
        }
        DeviceProfile deviceProfile = (DeviceProfile) other;
        return this.maxStreamingBitrate == deviceProfile.maxStreamingBitrate && this.maxStaticBitrate == deviceProfile.maxStaticBitrate && this.musicStreamingTranscodingBitrate == deviceProfile.musicStreamingTranscodingBitrate && Intrinsics.areEqual(this.directPlayProfiles, deviceProfile.directPlayProfiles) && Intrinsics.areEqual(this.transcodingProfiles, deviceProfile.transcodingProfiles) && Intrinsics.areEqual(this.codecProfiles, deviceProfile.codecProfiles) && Intrinsics.areEqual(this.subtitleProfiles, deviceProfile.subtitleProfiles) && Intrinsics.areEqual(this.responseProfiles, deviceProfile.responseProfiles) && Intrinsics.areEqual(this.containerProfiles, deviceProfile.containerProfiles);
    }

    public final List<CodecProfile> getCodecProfiles() {
        return this.codecProfiles;
    }

    public final List<Object> getContainerProfiles() {
        return this.containerProfiles;
    }

    public final List<DirectPlayProfile> getDirectPlayProfiles() {
        return this.directPlayProfiles;
    }




    public final List<ResponseProfile> getResponseProfiles() {
        return this.responseProfiles;
    }

    public final List<SubtitleProfile> getSubtitleProfiles() {
        return this.subtitleProfiles;
    }

    public final List<TranscodingProfile> getTranscodingProfiles() {
        return this.transcodingProfiles;
    }

    public int hashCode() {
        long j = this.maxStreamingBitrate;
        long j2 = this.maxStaticBitrate;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.musicStreamingTranscodingBitrate;
        return this.containerProfiles.hashCode() + qi0.f(this.responseProfiles, qi0.f(this.subtitleProfiles, qi0.f(this.codecProfiles, qi0.f(this.transcodingProfiles, qi0.f(this.directPlayProfiles, (i + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        long j = this.maxStreamingBitrate;
        long j2 = this.maxStaticBitrate;
        long j3 = this.musicStreamingTranscodingBitrate;
        List<DirectPlayProfile> list = this.directPlayProfiles;
        List<TranscodingProfile> list2 = this.transcodingProfiles;
        List<CodecProfile> list3 = this.codecProfiles;
        List<SubtitleProfile> list4 = this.subtitleProfiles;
        List<ResponseProfile> list5 = this.responseProfiles;
        List<Object> list6 = this.containerProfiles;
        StringBuilder sbR = i02.r(j, "DeviceProfile(maxStreamingBitrate=", ", maxStaticBitrate=");
        sbR.append(j2);
        id.m(sbR, ", musicStreamingTranscodingBitrate=", j3, ", directPlayProfiles=");
        sbR.append(list);
        sbR.append(", transcodingProfiles=");
        sbR.append(list2);
        sbR.append(", codecProfiles=");
        sbR.append(list3);
        sbR.append(", subtitleProfiles=");
        sbR.append(list4);
        sbR.append(", responseProfiles=");
        sbR.append(list5);
        sbR.append(", containerProfiles=");
        sbR.append(list6);
        sbR.append(")");
        return sbR.toString();
    }

    public DeviceProfile(long j, long j2, long j3, List<DirectPlayProfile> list, List<TranscodingProfile> list2, List<CodecProfile> list3, List<SubtitleProfile> list4, List<ResponseProfile> list5, List<? extends Object> list6) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        this.maxStreamingBitrate = j;
        this.maxStaticBitrate = j2;
        this.musicStreamingTranscodingBitrate = j3;
        this.directPlayProfiles = list;
        this.transcodingProfiles = list2;
        this.codecProfiles = list3;
        this.subtitleProfiles = list4;
        this.responseProfiles = list5;
        this.containerProfiles = list6;
    }
}
