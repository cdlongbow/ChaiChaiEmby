package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuEpisode;", "", "episodeId", "", "episodeTitle", "", "<init>", "(JLjava/lang/String;)V", "getEpisodeId", "()J", "getEpisodeTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuEpisode {
    public static final int $stable = 0;
    private final long episodeId;
    private final String episodeTitle;

    public DanmakuEpisode(long j, String str) {
        str.getClass();
        this.episodeId = j;
        this.episodeTitle = str;
    }

    public static /* synthetic */ DanmakuEpisode copy$default(DanmakuEpisode danmakuEpisode, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = danmakuEpisode.episodeId;
        }
        if ((i & 2) != 0) {
            str = danmakuEpisode.episodeTitle;
        }
        return danmakuEpisode.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final DanmakuEpisode copy(long episodeId, String episodeTitle) {
        episodeTitle.getClass();
        return new DanmakuEpisode(episodeId, episodeTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuEpisode)) {
            return false;
        }
        DanmakuEpisode danmakuEpisode = (DanmakuEpisode) other;
        return this.episodeId == danmakuEpisode.episodeId && Intrinsics.areEqual(this.episodeTitle, danmakuEpisode.episodeTitle);
    }

    public int hashCode() {
        long j = this.episodeId;
        return this.episodeTitle.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public String toString() {
        return "DanmakuEpisode(episodeId=" + this.episodeId + ", episodeTitle=" + this.episodeTitle + ")";
    }
}
