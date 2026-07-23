package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J{\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006-"}, d2 = {"Lcom/dh/myembyapp/data/model/Library;", "", TtmlNode.ATTR_ID, "", "guid", "presentationUniqueKey", HintConstants.AUTOFILL_HINT_NAME, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "isFolder", "", "collectionType", "locationType", "imageTags", "Lcom/dh/myembyapp/data/model/ImageTags;", "primaryImageTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/dh/myembyapp/data/model/ImageTags;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getGuid", "getPresentationUniqueKey", "getName", "getType", "()Z", "getCollectionType", "getLocationType", "getImageTags", "()Lcom/dh/myembyapp/data/model/ImageTags;", "getPrimaryImageTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Library {
    public static final int $stable = 0;

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
