package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/model/Chapter;", "", "startPositionTicks", "", "name", "", "markerType", "chapterIndex", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getStartPositionTicks", "()J", "getName", "()Ljava/lang/String;", "getMarkerType", "getChapterIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/dh/myembyapp/data/model/Chapter;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Chapter {
    public static final int $stable = 0;

    @SerializedName("ChapterIndex")
    private final Integer chapterIndex;

    @SerializedName("MarkerType")
    private final String markerType;

    @SerializedName("Name")
    private final String name;

    @SerializedName("StartPositionTicks")
    private final long startPositionTicks;

    public /* synthetic */ Chapter(long j, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }

    public static /* synthetic */ Chapter copy$default(Chapter chapter, long j, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = chapter.startPositionTicks;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = chapter.name;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = chapter.markerType;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num = chapter.chapterIndex;
        }
        return chapter.copy(j2, str3, str4, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final Chapter copy(long startPositionTicks, String name, String markerType, Integer chapterIndex) {
        return new Chapter(startPositionTicks, name, markerType, chapterIndex);
    }

    public boolean equals(Object other) {
        long j = this.startPositionTicks;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.markerType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.chapterIndex;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Chapter(startPositionTicks=" + this.startPositionTicks + ", name=" + this.name + ", markerType=" + this.markerType + ", chapterIndex=" + this.chapterIndex + ")";
    }

    public Chapter(long j, String str, String str2, Integer num) {
        this.startPositionTicks = j;
        this.name = str;
        this.markerType = str2;
        this.chapterIndex = num;
    }
}
