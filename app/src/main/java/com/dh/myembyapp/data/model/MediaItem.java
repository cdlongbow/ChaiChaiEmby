package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.kb0;
import defpackage.s01;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bR\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0016¢\u0006\u0004\b-\u0010.J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\tHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010f\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010m\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010PJ\u000b\u0010r\u001a\u0004\u0018\u00010%HÆ\u0003J\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016HÆ\u0003J\u0010\u0010t\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010u\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010;J\u0011\u0010v\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0016HÆ\u0003J\u0011\u0010w\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0016HÆ\u0003J\u0098\u0003\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u00162\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010yJ\u0014\u0010z\u001a\u00020\t2\b\u0010{\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010|\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010}\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u00105R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00100R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00100R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bJ\u0010;R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bK\u0010;R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00100R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00100R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u001a\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bO\u0010PR\u0018\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010DR\u001a\u0010'\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bU\u0010;R\u001a\u0010(\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bV\u0010;R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010DR\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010D¨\u0006~"}, d2 = {"Lcom/dh/myembyapp/data/model/MediaItem;", "", TtmlNode.ATTR_ID, "", "guid", "presentationUniqueKey", HintConstants.AUTOFILL_HINT_NAME, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "isFolder", "", "collectionType", "locationType", "premiereDate", "dateCreated", "productionYear", "", "overview", "runTimeTicks", "", "imageTags", "Lcom/dh/myembyapp/data/model/ImageTags;", "backdropImageTags", "", "mediaSources", "Lcom/dh/myembyapp/data/model/MediaSource;", "userData", "Lcom/dh/myembyapp/data/model/UserData;", "seriesName", "seasonName", "indexNumber", "parentIndexNumber", "parentId", "seriesId", "seasonId", "communityRating", "", "providerIds", "Lcom/dh/myembyapp/data/model/ProviderIds;", "genres", "childCount", "recursiveItemCount", "people", "Lcom/dh/myembyapp/data/model/PersonInfo;", "chapters", "Lcom/dh/myembyapp/data/model/Chapter;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Lcom/dh/myembyapp/data/model/ImageTags;Ljava/util/List;Ljava/util/List;Lcom/dh/myembyapp/data/model/UserData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/dh/myembyapp/data/model/ProviderIds;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getGuid", "getPresentationUniqueKey", "getName", "getType", "()Z", "getCollectionType", "getLocationType", "getPremiereDate", "getDateCreated", "getProductionYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOverview", "getRunTimeTicks", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getImageTags", "()Lcom/dh/myembyapp/data/model/ImageTags;", "getBackdropImageTags", "()Ljava/util/List;", "getMediaSources", "getUserData", "()Lcom/dh/myembyapp/data/model/UserData;", "getSeriesName", "getSeasonName", "getIndexNumber", "getParentIndexNumber", "getParentId", "getSeriesId", "getSeasonId", "getCommunityRating", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getProviderIds", "()Lcom/dh/myembyapp/data/model/ProviderIds;", "getGenres", "getChildCount", "getRecursiveItemCount", "getPeople", "getChapters", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Lcom/dh/myembyapp/data/model/ImageTags;Ljava/util/List;Ljava/util/List;Lcom/dh/myembyapp/data/model/UserData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/dh/myembyapp/data/model/ProviderIds;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/dh/myembyapp/data/model/MediaItem;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MediaItem {
    public static final int $stable = 8;

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
