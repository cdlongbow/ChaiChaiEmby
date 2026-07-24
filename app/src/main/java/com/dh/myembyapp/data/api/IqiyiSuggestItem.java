package com.dh.myembyapp.data.api;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.qi0;
import defpackage.s01;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class IqiyiSuggestItem {
    
    private final String cname;
    private final List<String> director;
    private final String link;

    @SerializedName("main_actor")
    private final List<String> mainActor;

    @SerializedName("match_part")
    private final String matchPart;
    private final String name;

    @SerializedName("normalize_query")
    private final String normalizeQuery;

    @SerializedName("picture_url")
    private final String pictureUrl;
    private final int year;

    public /* synthetic */ IqiyiSuggestItem(String str, String str2, String str3, String str4, List list, List list2, int i, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IqiyiSuggestItem copy$default(IqiyiSuggestItem iqiyiSuggestItem, String str, String str2, String str3, String str4, List list, List list2, int i, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iqiyiSuggestItem.name;
        }
        if ((i2 & 2) != 0) {
            str2 = iqiyiSuggestItem.cname;
        }
        if ((i2 & 4) != 0) {
            str3 = iqiyiSuggestItem.link;
        }
        if ((i2 & 8) != 0) {
            str4 = iqiyiSuggestItem.pictureUrl;
        }
        if ((i2 & 16) != 0) {
            list = iqiyiSuggestItem.director;
        }
        if ((i2 & 32) != 0) {
            list2 = iqiyiSuggestItem.mainActor;
        }
        if ((i2 & 64) != 0) {
            i = iqiyiSuggestItem.year;
        }
        if ((i2 & 128) != 0) {
            str5 = iqiyiSuggestItem.normalizeQuery;
        }
        if ((i2 & 256) != 0) {
            str6 = iqiyiSuggestItem.matchPart;
        }
        String str7 = str5;
        String str8 = str6;
        List list3 = list2;
        int i3 = i;
        List list4 = list;
        String str9 = str3;
        return iqiyiSuggestItem.copy(str, str2, str9, str4, list4, list3, i3, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final List<String> component5() {
        return this.director;
    }

    public final List<String> component6() {
        return this.mainActor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    /* JADX INFO: renamed from: component9, reason: from getter */

    public final IqiyiSuggestItem copy(String name, String cname, String link, String pictureUrl, List<String> director, List<String> mainActor, int year, String normalizeQuery, String matchPart) {
        name.getClass();
        cname.getClass();
        link.getClass();
        pictureUrl.getClass();
        director.getClass();
        mainActor.getClass();
        normalizeQuery.getClass();
        matchPart.getClass();
        return new IqiyiSuggestItem(name, cname, link, pictureUrl, director, mainActor, year, normalizeQuery, matchPart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IqiyiSuggestItem)) {
            return false;
        }
        IqiyiSuggestItem iqiyiSuggestItem = (IqiyiSuggestItem) other;
        return Intrinsics.areEqual(this.name, iqiyiSuggestItem.name) && Intrinsics.areEqual(this.cname, iqiyiSuggestItem.cname) && Intrinsics.areEqual(this.link, iqiyiSuggestItem.link) && Intrinsics.areEqual(this.pictureUrl, iqiyiSuggestItem.pictureUrl) && Intrinsics.areEqual(this.director, iqiyiSuggestItem.director) && Intrinsics.areEqual(this.mainActor, iqiyiSuggestItem.mainActor) && this.year == iqiyiSuggestItem.year && Intrinsics.areEqual(this.normalizeQuery, iqiyiSuggestItem.normalizeQuery) && Intrinsics.areEqual(this.matchPart, iqiyiSuggestItem.matchPart);
    }

    public int hashCode() {
        return this.matchPart.hashCode() + i02.i((qi0.f(this.mainActor, qi0.f(this.director, i02.i(i02.i(i02.i(this.name.hashCode() * 31, 31, this.cname), 31, this.link), 31, this.pictureUrl), 31), 31) + this.year) * 31, 31, this.normalizeQuery);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.cname;
        String str3 = this.link;
        String str4 = this.pictureUrl;
        List<String> list = this.director;
        List<String> list2 = this.mainActor;
        int i = this.year;
        String str5 = this.normalizeQuery;
        String str6 = this.matchPart;
        StringBuilder sbZ = kb0.z("IqiyiSuggestItem(name=", str, ", cname=", str2, ", link=");
        i02.v(sbZ, str3, ", pictureUrl=", str4, ", director=");
        sbZ.append(list);
        sbZ.append(", mainActor=");
        sbZ.append(list2);
        sbZ.append(", year=");
        sbZ.append(i);
        sbZ.append(", normalizeQuery=");
        sbZ.append(str5);
        sbZ.append(", matchPart=");
        return s01.w(sbZ, str6, ")");
    }

    public IqiyiSuggestItem(String str, String str2, String str3, String str4, List<String> list, List<String> list2, int i, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        str5.getClass();
        str6.getClass();
        this.name = str;
        this.cname = str2;
        this.link = str3;
        this.pictureUrl = str4;
        this.director = list;
        this.mainActor = list2;
        this.year = i;
        this.normalizeQuery = str5;
        this.matchPart = str6;
    }

    public IqiyiSuggestItem() {
        this(null, null, null, null, null, null, 0, null, null, 0, null);
    }
}
