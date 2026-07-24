package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.kb0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class ImageTags {
    

    @SerializedName("Banner")
    private final String banner;

    @SerializedName("Logo")
    private final String logo;

    @SerializedName("Primary")
    private final String primary;

    @SerializedName("Thumb")
    private final String thumb;

    public /* synthetic */ ImageTags(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ ImageTags copy$default(ImageTags imageTags, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageTags.primary;
        }
        if ((i & 2) != 0) {
            str2 = imageTags.logo;
        }
        if ((i & 4) != 0) {
            str3 = imageTags.banner;
        }
        if ((i & 8) != 0) {
            str4 = imageTags.thumb;
        }
        return imageTags.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final ImageTags copy(String primary, String logo, String banner, String thumb) {
        return new ImageTags(primary, logo, banner, thumb);
    }

    public boolean equals(Object other) {
        String str = this.primary;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.banner;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumb;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.primary;
        String str2 = this.logo;
        String str3 = this.banner;
        String str4 = this.thumb;
        StringBuilder sbZ = kb0.z("ImageTags(primary=", str, ", logo=", str2, ", banner=");
        sbZ.append(str3);
        sbZ.append(", thumb=");
        sbZ.append(str4);
        sbZ.append(")");
        return sbZ.toString();
    }

    public ImageTags(String str, String str2, String str3, String str4) {
        this.primary = str;
        this.logo = str2;
        this.banner = str3;
        this.thumb = str4;
    }

    public ImageTags() {
        this(null, null, null, null, 15, null);
    }
}
