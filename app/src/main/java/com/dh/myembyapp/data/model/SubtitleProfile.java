package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.mr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/dh/myembyapp/data/model/SubtitleProfile;", "", "format", "", "method", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFormat", "()Ljava/lang/String;", "getMethod", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SubtitleProfile {
    public static final int $stable = 0;

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
