package com.dh.myembyapp.data.model;

import defpackage.i9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/dh/myembyapp/data/model/EpisodeLocator;", "", "seasonNumber", "", "episodeNumber", "fallbackToFirstEpisode", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getSeasonNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEpisodeNumber", "getFallbackToFirstEpisode", "()Z", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/dh/myembyapp/data/model/EpisodeLocator;", "equals", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class EpisodeLocator {
    public static final int $stable = 0;
    private final Integer episodeNumber;
    private final boolean fallbackToFirstEpisode;
    private final Integer seasonNumber;

    public /* synthetic */ EpisodeLocator(Integer num, Integer num2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? false : z);
    }

    public static /* synthetic */ EpisodeLocator copy$default(EpisodeLocator episodeLocator, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = episodeLocator.seasonNumber;
        }
        if ((i & 2) != 0) {
            num2 = episodeLocator.episodeNumber;
        }
        if ((i & 4) != 0) {
            z = episodeLocator.fallbackToFirstEpisode;
        }
        return episodeLocator.copy(num, num2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final EpisodeLocator copy(Integer seasonNumber, Integer episodeNumber, boolean fallbackToFirstEpisode) {
        return new EpisodeLocator(seasonNumber, episodeNumber, fallbackToFirstEpisode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EpisodeLocator)) {
            return false;
        }
        EpisodeLocator episodeLocator = (EpisodeLocator) other;
        return Intrinsics.areEqual(this.seasonNumber, episodeLocator.seasonNumber) && Intrinsics.areEqual(this.episodeNumber, episodeLocator.episodeNumber) && this.fallbackToFirstEpisode == episodeLocator.fallbackToFirstEpisode;
    }




    public int hashCode() {
        Integer num = this.seasonNumber;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.episodeNumber;
        return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + (this.fallbackToFirstEpisode ? 1231 : 1237);
    }

    public String toString() {
        Integer num = this.seasonNumber;
        Integer num2 = this.episodeNumber;
        boolean z = this.fallbackToFirstEpisode;
        StringBuilder sb = new StringBuilder("EpisodeLocator(seasonNumber=");
        sb.append(num);
        sb.append(", episodeNumber=");
        sb.append(num2);
        sb.append(", fallbackToFirstEpisode=");
        return i9.i(sb, z, ")");
    }

    public EpisodeLocator(Integer num, Integer num2, boolean z) {
        this.seasonNumber = num;
        this.episodeNumber = num2;
        this.fallbackToFirstEpisode = z;
    }

    public EpisodeLocator() {
        this(null, null, false, 7, null);
    }
}
