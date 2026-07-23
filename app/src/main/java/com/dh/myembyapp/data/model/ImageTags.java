package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.kb0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/dh/myembyapp/data/model/ImageTags;", "", "primary", "", "logo", "banner", "thumb", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrimary", "()Ljava/lang/String;", "getLogo", "getBanner", "getThumb", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ImageTags {
    public static final int $stable = 0;

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
