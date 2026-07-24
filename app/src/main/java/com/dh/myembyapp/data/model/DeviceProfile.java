package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.id;
import defpackage.qi0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DeviceProfile {
    

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
