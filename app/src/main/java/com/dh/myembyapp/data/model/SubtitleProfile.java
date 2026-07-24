package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.mr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class SubtitleProfile {
    

    @SerializedName("Format")
    private final String format;

    @SerializedName("Method")
    private final String method;

    public SubtitleProfile(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.format = str;
        this.method = str2;
    }

    public static /* synthetic */ SubtitleProfile copy$default(SubtitleProfile subtitleProfile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subtitleProfile.format;
        }
        if ((i & 2) != 0) {
            str2 = subtitleProfile.method;
        }
        return subtitleProfile.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final SubtitleProfile copy(String format, String method) {
        format.getClass();
        method.getClass();
        return new SubtitleProfile(format, method);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubtitleProfile)) {
            return false;
        }
        SubtitleProfile subtitleProfile = (SubtitleProfile) other;
        return Intrinsics.areEqual(this.format, subtitleProfile.format) && Intrinsics.areEqual(this.method, subtitleProfile.method);
    }



    public int hashCode() {
        return this.method.hashCode() + (this.format.hashCode() * 31);
    }

    public String toString() {
        return mr.s("SubtitleProfile(format=", this.format, ", method=", this.method, ")");
    }
}
