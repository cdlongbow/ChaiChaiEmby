package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class MediaItem {
    

    @SerializedName("BackdropImageTags")
    private final List<String> backdropImageTags;

    @SerializedName("Chapters")
    private final List<Chapter> chapters;

    @SerializedName("ChildCount")
    private final Integer childCount;

    @SerializedName("CollectionType")
    private final String collectionType;

    @SerializedName("CommunityRating")
    private final Float communityRating;

    @SerializedName("DateCreated")
    private final String dateCreated;

    @SerializedName("Genres")
    private final List<String> genres;

    @SerializedName("Guid")
    private final String guid;

    @SerializedName("Id")
    private final String id;

    @SerializedName("ImageTags")
    private final ImageTags imageTags;

    @SerializedName("IndexNumber")
    private final Integer indexNumber;

    @SerializedName("IsFolder")
    private final boolean isFolder;

    @SerializedName("LocationType")
    private final String locationType;

    @SerializedName("MediaSources")
    private final List<MediaSource> mediaSources;

    @SerializedName("Name")
    private final String name;

    @SerializedName("Overview")
    private final String overview;

    @SerializedName("ParentId")
    private final String parentId;

    @SerializedName("ParentIndexNumber")
    private final Integer parentIndexNumber;

    @SerializedName("People")
    private final List<PersonInfo> people;

    @SerializedName("PremiereDate")
    private final String premiereDate;

    @SerializedName("PresentationUniqueKey")
    private final String presentationUniqueKey;

    @SerializedName("ProductionYear")
    private final Integer productionYear;

    @SerializedName("ProviderIds")
    private final ProviderIds providerIds;

    @SerializedName("RecursiveItemCount")
    private final Integer recursiveItemCount;

    @SerializedName("RunTimeTicks")
    private final Long runTimeTicks;

    @SerializedName("SeasonId")
    private final String seasonId;

    @SerializedName("SeasonName")
    private final String seasonName;

    @SerializedName("SeriesId")
    private final String seriesId;

    @SerializedName("SeriesName")
    private final String seriesName;

    @SerializedName("Type")
    private final String type;

    @SerializedName("UserData")
    private final UserData userData;

    public /* synthetic */ MediaItem(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, Integer num, String str10, Long l, ImageTags imageTags, List list, List list2, UserData userData, String str11, String str12, Integer num2, Integer num3, String str13, String str14, String str15, Float f, ProviderIds providerIds, List list3, Integer num4, Integer num5, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : l, (i & 8192) != 0 ? null : imageTags, (i & 16384) != 0 ? null : list, (32768 & i) != 0 ? null : list2, (65536 & i) != 0 ? null : userData, (131072 & i) != 0 ? null : str11, (262144 & i) != 0 ? null : str12, (524288 & i) != 0 ? null : num2, (1048576 & i) != 0 ? null : num3, (2097152 & i) != 0 ? null : str13, (4194304 & i) != 0 ? null : str14, (8388608 & i) != 0 ? null : str15, (16777216 & i) != 0 ? null : f, (33554432 & i) != 0 ? null : providerIds, (67108864 & i) != 0 ? null : list3, (134217728 & i) != 0 ? null : num4, (268435456 & i) != 0 ? null : num5, (536870912 & i) != 0 ? null : list4, (i & 1073741824) != 0 ? null : list5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, Integer num, String str10, Long l, ImageTags imageTags, List list, List list2, UserData userData, String str11, String str12, Integer num2, Integer num3, String str13, String str14, String str15, Float f, ProviderIds providerIds, List list3, Integer num4, Integer num5, List list4, List list5, int i, Object obj) {
        List list6;
        List list7;
        String str16 = (i & 1) != 0 ? mediaItem.id : str;
        String str17 = (i & 2) != 0 ? mediaItem.guid : str2;
        String str18 = (i & 4) != 0 ? mediaItem.presentationUniqueKey : str3;
        String str19 = (i & 8) != 0 ? mediaItem.name : str4;
        String str20 = (i & 16) != 0 ? mediaItem.type : str5;
        boolean z2 = (i & 32) != 0 ? mediaItem.isFolder : z;
        String str21 = (i & 64) != 0 ? mediaItem.collectionType : str6;
        String str22 = (i & 128) != 0 ? mediaItem.locationType : str7;
        String str23 = (i & 256) != 0 ? mediaItem.premiereDate : str8;
        String str24 = (i & 512) != 0 ? mediaItem.dateCreated : str9;
        Integer num6 = (i & 1024) != 0 ? mediaItem.productionYear : num;
        String str25 = (i & 2048) != 0 ? mediaItem.overview : str10;
        Long l2 = (i & 4096) != 0 ? mediaItem.runTimeTicks : l;
        ImageTags imageTags2 = (i & 8192) != 0 ? mediaItem.imageTags : imageTags;
        String str26 = str16;
        List list8 = (i & 16384) != 0 ? mediaItem.backdropImageTags : list;
        List list9 = (i & 32768) != 0 ? mediaItem.mediaSources : list2;
        UserData userData2 = (i & 65536) != 0 ? mediaItem.userData : userData;
        String str27 = (i & 131072) != 0 ? mediaItem.seriesName : str11;
        String str28 = (i & 262144) != 0 ? mediaItem.seasonName : str12;
        Integer num7 = (i & 524288) != 0 ? mediaItem.indexNumber : num2;
        Integer num8 = (i & 1048576) != 0 ? mediaItem.parentIndexNumber : num3;
        String str29 = (i & 2097152) != 0 ? mediaItem.parentId : str13;
        String str30 = (i & 4194304) != 0 ? mediaItem.seriesId : str14;
        String str31 = (i & 8388608) != 0 ? mediaItem.seasonId : str15;
        Float f2 = (i & 16777216) != 0 ? mediaItem.communityRating : f;
        ProviderIds providerIds2 = (i & 33554432) != 0 ? mediaItem.providerIds : providerIds;
        List list10 = (i & 67108864) != 0 ? mediaItem.genres : list3;
        Integer num9 = (i & 134217728) != 0 ? mediaItem.childCount : num4;
        Integer num10 = (i & 268435456) != 0 ? mediaItem.recursiveItemCount : num5;
        List list11 = (i & 536870912) != 0 ? mediaItem.people : list4;
        if ((i & 1073741824) != 0) {
            list7 = list11;
            list6 = mediaItem.chapters;
        } else {
            list6 = list5;
            list7 = list11;
        }
        return mediaItem.copy(str26, str17, str18, str19, str20, z2, str21, str22, str23, str24, num6, str25, l2, imageTags2, list8, list9, userData2, str27, str28, num7, num8, str29, str30, str31, f2, providerIds2, list10, num9, num10, list7, list6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component10, reason: from getter */

    /* JADX INFO: renamed from: component11, reason: from getter */

    /* JADX INFO: renamed from: component12, reason: from getter */

    /* JADX INFO: renamed from: component13, reason: from getter */

    /* JADX INFO: renamed from: component14, reason: from getter */

    public final List<String> component15() {
        return this.backdropImageTags;
    }

    public final List<MediaSource> component16() {
        return this.mediaSources;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */

    /* JADX INFO: renamed from: component18, reason: from getter */

    /* JADX INFO: renamed from: component19, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component20, reason: from getter */

    /* JADX INFO: renamed from: component21, reason: from getter */

    /* JADX INFO: renamed from: component22, reason: from getter */

    /* JADX INFO: renamed from: component23, reason: from getter */

    /* JADX INFO: renamed from: component24, reason: from getter */

    /* JADX INFO: renamed from: component25, reason: from getter */

    /* JADX INFO: renamed from: component26, reason: from getter */

    public final List<String> component27() {
        return this.genres;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */

    /* JADX INFO: renamed from: component29, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final List<PersonInfo> component30() {
        return this.people;
    }

    public final List<Chapter> component31() {
        return this.chapters;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final MediaItem copy(String id, String guid, String presentationUniqueKey, String name, String type, boolean isFolder, String collectionType, String locationType, String premiereDate, String dateCreated, Integer productionYear, String overview, Long runTimeTicks, ImageTags imageTags, List<String> backdropImageTags, List<MediaSource> mediaSources, UserData userData, String seriesName, String seasonName, Integer indexNumber, Integer parentIndexNumber, String parentId, String seriesId, String seasonId, Float communityRating, ProviderIds providerIds, List<String> genres, Integer childCount, Integer recursiveItemCount, List<PersonInfo> people, List<Chapter> chapters) {
        id.getClass();
        name.getClass();
        type.getClass();
        return new MediaItem(id, guid, presentationUniqueKey, name, type, isFolder, collectionType, locationType, premiereDate, dateCreated, productionYear, overview, runTimeTicks, imageTags, backdropImageTags, mediaSources, userData, seriesName, seasonName, indexNumber, parentIndexNumber, parentId, seriesId, seasonId, communityRating, providerIds, genres, childCount, recursiveItemCount, people, chapters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) other;
        return Intrinsics.areEqual(this.id, mediaItem.id) && Intrinsics.areEqual(this.guid, mediaItem.guid) && Intrinsics.areEqual(this.presentationUniqueKey, mediaItem.presentationUniqueKey) && Intrinsics.areEqual(this.name, mediaItem.name) && Intrinsics.areEqual(this.type, mediaItem.type) && this.isFolder == mediaItem.isFolder && Intrinsics.areEqual(this.collectionType, mediaItem.collectionType) && Intrinsics.areEqual(this.locationType, mediaItem.locationType) && Intrinsics.areEqual(this.premiereDate, mediaItem.premiereDate) && Intrinsics.areEqual(this.dateCreated, mediaItem.dateCreated) && Intrinsics.areEqual(this.productionYear, mediaItem.productionYear) && Intrinsics.areEqual(this.overview, mediaItem.overview) && Intrinsics.areEqual(this.runTimeTicks, mediaItem.runTimeTicks) && Intrinsics.areEqual(this.imageTags, mediaItem.imageTags) && Intrinsics.areEqual(this.backdropImageTags, mediaItem.backdropImageTags) && Intrinsics.areEqual(this.mediaSources, mediaItem.mediaSources) && Intrinsics.areEqual(this.userData, mediaItem.userData) && Intrinsics.areEqual(this.seriesName, mediaItem.seriesName) && Intrinsics.areEqual(this.seasonName, mediaItem.seasonName) && Intrinsics.areEqual(this.indexNumber, mediaItem.indexNumber) && Intrinsics.areEqual(this.parentIndexNumber, mediaItem.parentIndexNumber) && Intrinsics.areEqual(this.parentId, mediaItem.parentId) && Intrinsics.areEqual(this.seriesId, mediaItem.seriesId) && Intrinsics.areEqual(this.seasonId, mediaItem.seasonId) && Intrinsics.areEqual((Object) this.communityRating, (Object) mediaItem.communityRating) && Intrinsics.areEqual(this.providerIds, mediaItem.providerIds) && Intrinsics.areEqual(this.genres, mediaItem.genres) && Intrinsics.areEqual(this.childCount, mediaItem.childCount) && Intrinsics.areEqual(this.recursiveItemCount, mediaItem.recursiveItemCount) && Intrinsics.areEqual(this.people, mediaItem.people) && Intrinsics.areEqual(this.chapters, mediaItem.chapters);
    }

    public final List<String> getBackdropImageTags() {
        return this.backdropImageTags;
    }

    public final List<Chapter> getChapters() {
        return this.chapters;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.guid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.presentationUniqueKey;
        int i = (i02.i(i02.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.name), 31, this.type) + (this.isFolder ? 1231 : 1237)) * 31;
        String str3 = this.collectionType;
        int iHashCode3 = (i + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.locationType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.premiereDate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dateCreated;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.productionYear;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.overview;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.runTimeTicks;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        ImageTags imageTags = this.imageTags;
        int iHashCode10 = (iHashCode9 + (imageTags == null ? 0 : imageTags.hashCode())) * 31;
        List<String> list = this.backdropImageTags;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<MediaSource> list2 = this.mediaSources;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UserData userData = this.userData;
        int iHashCode13 = (iHashCode12 + (userData == null ? 0 : userData.hashCode())) * 31;
        String str8 = this.seriesName;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.seasonName;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.indexNumber;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.parentIndexNumber;
        int iHashCode17 = (iHashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.parentId;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.seriesId;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.seasonId;
        int iHashCode20 = (iHashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Float f = this.communityRating;
        int iHashCode21 = (iHashCode20 + (f == null ? 0 : f.hashCode())) * 31;
        ProviderIds providerIds = this.providerIds;
        int iHashCode22 = (iHashCode21 + (providerIds == null ? 0 : providerIds.hashCode())) * 31;
        List<String> list3 = this.genres;
        int iHashCode23 = (iHashCode22 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num4 = this.childCount;
        int iHashCode24 = (iHashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.recursiveItemCount;
        int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<PersonInfo> list4 = this.people;
        int iHashCode26 = (iHashCode25 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Chapter> list5 = this.chapters;
        return iHashCode26 + (list5 != null ? list5.hashCode() : 0);
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
        String str8 = this.premiereDate;
        String str9 = this.dateCreated;
        Integer num = this.productionYear;
        String str10 = this.overview;
        Long l = this.runTimeTicks;
        ImageTags imageTags = this.imageTags;
        List<String> list = this.backdropImageTags;
        List<MediaSource> list2 = this.mediaSources;
        UserData userData = this.userData;
        String str11 = this.seriesName;
        String str12 = this.seasonName;
        Integer num2 = this.indexNumber;
        Integer num3 = this.parentIndexNumber;
        String str13 = this.parentId;
        String str14 = this.seriesId;
        String str15 = this.seasonId;
        Float f = this.communityRating;
        ProviderIds providerIds = this.providerIds;
        List<String> list3 = this.genres;
        Integer num4 = this.childCount;
        Integer num5 = this.recursiveItemCount;
        List<PersonInfo> list4 = this.people;
        List<Chapter> list5 = this.chapters;
        StringBuilder sbZ = kb0.z("MediaItem(id=", str, ", guid=", str2, ", presentationUniqueKey=");
        i02.v(sbZ, str3, ", name=", str4, ", type=");
        sbZ.append(str5);
        sbZ.append(", isFolder=");
        sbZ.append(z);
        sbZ.append(", collectionType=");
        i02.v(sbZ, str6, ", locationType=", str7, ", premiereDate=");
        i02.v(sbZ, str8, ", dateCreated=", str9, ", productionYear=");
        sbZ.append(num);
        sbZ.append(", overview=");
        sbZ.append(str10);
        sbZ.append(", runTimeTicks=");
        sbZ.append(l);
        sbZ.append(", imageTags=");
        sbZ.append(imageTags);
        sbZ.append(", backdropImageTags=");
        sbZ.append(list);
        sbZ.append(", mediaSources=");
        sbZ.append(list2);
        sbZ.append(", userData=");
        sbZ.append(userData);
        sbZ.append(", seriesName=");
        sbZ.append(str11);
        sbZ.append(", seasonName=");
        sbZ.append(str12);
        sbZ.append(", indexNumber=");
        sbZ.append(num2);
        sbZ.append(", parentIndexNumber=");
        sbZ.append(num3);
        sbZ.append(", parentId=");
        sbZ.append(str13);
        sbZ.append(", seriesId=");
        i02.v(sbZ, str14, ", seasonId=", str15, ", communityRating=");
        sbZ.append(f);
        sbZ.append(", providerIds=");
        sbZ.append(providerIds);
        sbZ.append(", genres=");
        sbZ.append(list3);
        sbZ.append(", childCount=");
        sbZ.append(num4);
        sbZ.append(", recursiveItemCount=");
        sbZ.append(num5);
        sbZ.append(", people=");
        sbZ.append(list4);
        sbZ.append(", chapters=");
        sbZ.append(list5);
        sbZ.append(")");
        return sbZ.toString();
    }

    public MediaItem(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, Integer num, String str10, Long l, ImageTags imageTags, List<String> list, List<MediaSource> list2, UserData userData, String str11, String str12, Integer num2, Integer num3, String str13, String str14, String str15, Float f, ProviderIds providerIds, List<String> list3, Integer num4, Integer num5, List<PersonInfo> list4, List<Chapter> list5) {
        s01.D(str, str4, str5);
        this.id = str;
        this.guid = str2;
        this.presentationUniqueKey = str3;
        this.name = str4;
        this.type = str5;
        this.isFolder = z;
        this.collectionType = str6;
        this.locationType = str7;
        this.premiereDate = str8;
        this.dateCreated = str9;
        this.productionYear = num;
        this.overview = str10;
        this.runTimeTicks = l;
        this.imageTags = imageTags;
        this.backdropImageTags = list;
        this.mediaSources = list2;
        this.userData = userData;
        this.seriesName = str11;
        this.seasonName = str12;
        this.indexNumber = num2;
        this.parentIndexNumber = num3;
        this.parentId = str13;
        this.seriesId = str14;
        this.seasonId = str15;
        this.communityRating = f;
        this.providerIds = providerIds;
        this.genres = list3;
        this.childCount = num4;
        this.recursiveItemCount = num5;
        this.people = list4;
        this.chapters = list5;
    }
}
