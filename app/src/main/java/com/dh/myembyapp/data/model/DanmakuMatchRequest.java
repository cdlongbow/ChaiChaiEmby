package com.dh.myembyapp.data.model;

import defpackage.i02;
import defpackage.id;
import defpackage.kb0;
import defpackage.s01;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class DanmakuMatchRequest {
    
    private final String fileHash;
    private final String fileName;
    private final long fileSize;
    private final String matchMode;
    private final long videoDuration;

    public /* synthetic */ DanmakuMatchRequest(String str, String str2, long j, long j2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) == 0 ? j2 : 0L, (i & 16) != 0 ? "hashAndFileName" : str3);
    }

    public static /* synthetic */ DanmakuMatchRequest copy$default(DanmakuMatchRequest danmakuMatchRequest, String str, String str2, long j, long j2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = danmakuMatchRequest.fileName;
        }
        if ((i & 2) != 0) {
            str2 = danmakuMatchRequest.fileHash;
        }
        if ((i & 4) != 0) {
            j = danmakuMatchRequest.fileSize;
        }
        if ((i & 8) != 0) {
            j2 = danmakuMatchRequest.videoDuration;
        }
        if ((i & 16) != 0) {
            str3 = danmakuMatchRequest.matchMode;
        }
        String str4 = str3;
        long j3 = j2;
        return danmakuMatchRequest.copy(str, str2, j, j3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final DanmakuMatchRequest copy(String fileName, String fileHash, long fileSize, long videoDuration, String matchMode) {
        fileName.getClass();
        fileHash.getClass();
        matchMode.getClass();
        return new DanmakuMatchRequest(fileName, fileHash, fileSize, videoDuration, matchMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuMatchRequest)) {
            return false;
        }
        DanmakuMatchRequest danmakuMatchRequest = (DanmakuMatchRequest) other;
        return Intrinsics.areEqual(this.fileName, danmakuMatchRequest.fileName) && Intrinsics.areEqual(this.fileHash, danmakuMatchRequest.fileHash) && this.fileSize == danmakuMatchRequest.fileSize && this.videoDuration == danmakuMatchRequest.videoDuration && Intrinsics.areEqual(this.matchMode, danmakuMatchRequest.matchMode);
    }

    public int hashCode() {
        int i = i02.i(this.fileName.hashCode() * 31, 31, this.fileHash);
        long j = this.fileSize;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.videoDuration;
        return this.matchMode.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public String toString() {
        String str = this.fileName;
        String str2 = this.fileHash;
        long j = this.fileSize;
        long j2 = this.videoDuration;
        String str3 = this.matchMode;
        StringBuilder sbZ = kb0.z("DanmakuMatchRequest(fileName=", str, ", fileHash=", str2, ", fileSize=");
        sbZ.append(j);
        id.m(sbZ, ", videoDuration=", j2, ", matchMode=");
        return s01.w(sbZ, str3, ")");
    }

    public DanmakuMatchRequest(String str, String str2, long j, long j2, String str3) {
        s01.D(str, str2, str3);
        this.fileName = str;
        this.fileHash = str2;
        this.fileSize = j;
        this.videoDuration = j2;
        this.matchMode = str3;
    }
}
