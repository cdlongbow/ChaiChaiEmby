package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class Library {
    

    @SerializedName("CollectionType")
    private final String collectionType;

    @SerializedName("Guid")
    private final String guid;

    @SerializedName("Id")
    private final String id;

    @SerializedName("ImageTags")
    private final ImageTags imageTags;

    @SerializedName("IsFolder")
    private final boolean isFolder;

    @SerializedName("LocationType")
    private final String locationType;

    @SerializedName("Name")
    private final String name;

    @SerializedName("PresentationUniqueKey")
    private final String presentationUniqueKey;

    @SerializedName("PrimaryImageTag")
    private final String primaryImageTag;

    @SerializedName("Type")
    private final String type;

    public /* synthetic */ Library(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ImageTags imageTags, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : imageTags, (i & 512) != 0 ? null : str8);
    }

    public static /* synthetic */ Library copy$default(Library library, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ImageTags imageTags, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = library.id;
        }
        if ((i & 2) != 0) {
            str2 = library.guid;
        }
        if ((i & 4) != 0) {
            str3 = library.presentationUniqueKey;
        }
        if ((i & 8) != 0) {
            str4 = library.name;
        }
        if ((i & 16) != 0) {
            str5 = library.type;
        }
        if ((i & 32) != 0) {
            z = library.isFolder;
        }
        if ((i & 64) != 0) {
            str6 = library.collectionType;
        }
        if ((i & 128) != 0) {
            str7 = library.locationType;
        }
        if ((i & 256) != 0) {
            imageTags = library.imageTags;
        }
        if ((i & 512) != 0) {
            str8 = library.primaryImageTag;
        }
        ImageTags imageTags2 = imageTags;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        boolean z2 = z;
        return library.copy(str, str2, str3, str4, str12, z2, str10, str11, imageTags2, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component10, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final Library copy(String id, String guid, String presentationUniqueKey, String name, String type, boolean isFolder, String collectionType, String locationType, ImageTags imageTags, String primaryImageTag) {
        id.getClass();
        name.getClass();
        return new Library(id, guid, presentationUniqueKey, name, type, isFolder, collectionType, locationType, imageTags, primaryImageTag);
    }

    public boolean equals(Object other) {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.guid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.presentationUniqueKey;
        int i = i02.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.name);
        String str3 = this.type;
        int iHashCode3 = (((i + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.isFolder ? 1231 : 1237)) * 31;
        String str4 = this.collectionType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.locationType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ImageTags imageTags = this.imageTags;
        int iHashCode6 = (iHashCode5 + (imageTags == null ? 0 : imageTags.hashCode())) * 31;
        String str6 = this.primaryImageTag;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }


    public String toString() {
        String str = this.id;
        String str2 = this.guid;
        String str3 = this.presentationUniqueKey;
        String str4 = this.name;
        String str5 = this.type;
        boolean z = this.isFolder;
        String str6 = this.collectionType;
        String str7 = this.locationType;
        ImageTags imageTags = this.imageTags;
        String str8 = this.primaryImageTag;
        StringBuilder sbZ = kb0.z("Library(id=", str, ", guid=", str2, ", presentationUniqueKey=");
        i02.v(sbZ, str3, ", name=", str4, ", type=");
        sbZ.append(str5);
        sbZ.append(", isFolder=");
        sbZ.append(z);
        sbZ.append(", collectionType=");
        i02.v(sbZ, str6, ", locationType=", str7, ", imageTags=");
        sbZ.append(imageTags);
        sbZ.append(", primaryImageTag=");
        sbZ.append(str8);
        sbZ.append(")");
        return sbZ.toString();
    }

    public Library(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, ImageTags imageTags, String str8) {
        str.getClass();
        str4.getClass();
        this.id = str;
        this.guid = str2;
        this.presentationUniqueKey = str3;
        this.name = str4;
        this.type = str5;
        this.isFolder = z;
        this.collectionType = str6;
        this.locationType = str7;
        this.imageTags = imageTags;
        this.primaryImageTag = str8;
    }
}
