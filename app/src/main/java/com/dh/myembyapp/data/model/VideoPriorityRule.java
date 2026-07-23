package com.dh.myembyapp.data.model;

import defpackage.kb0;
import defpackage.qu;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/dh/myembyapp/data/model/VideoPriorityRule;", "", "sortType", "Lcom/dh/myembyapp/data/model/VideoPrioritySortType;", "qualityPriorities", "", "Lcom/dh/myembyapp/data/model/VideoQualityStandard;", "", "valueSortDirection", "Lcom/dh/myembyapp/data/model/VideoValueSortDirection;", "<init>", "(Lcom/dh/myembyapp/data/model/VideoPrioritySortType;Ljava/util/Map;Lcom/dh/myembyapp/data/model/VideoValueSortDirection;)V", "getSortType", "()Lcom/dh/myembyapp/data/model/VideoPrioritySortType;", "getQualityPriorities", "()Ljava/util/Map;", "getValueSortDirection", "()Lcom/dh/myembyapp/data/model/VideoValueSortDirection;", "normalized", "hasOrder", "", "buildOrderText", "", "buildPreviewText", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VideoPriorityRule {
    public static final int $stable = 8;
    private final Map<VideoQualityStandard, Integer> qualityPriorities;
    private final VideoPrioritySortType sortType;
    private final VideoValueSortDirection valueSortDirection;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPrioritySortType.values().length];
            try {
                iArr[VideoPrioritySortType.QUALITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPrioritySortType.BITRATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPrioritySortType.FILE_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoPrioritySortType.RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoPrioritySortType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ VideoPriorityRule(VideoPrioritySortType videoPrioritySortType, Map map, VideoValueSortDirection videoValueSortDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? VideoPrioritySortType.NONE : videoPrioritySortType, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : videoValueSortDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoPriorityRule copy$default(VideoPriorityRule videoPriorityRule, VideoPrioritySortType videoPrioritySortType, Map map, VideoValueSortDirection videoValueSortDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            videoPrioritySortType = videoPriorityRule.sortType;
        }
        if ((i & 2) != 0) {
            map = videoPriorityRule.qualityPriorities;
        }
        if ((i & 4) != 0) {
            videoValueSortDirection = videoPriorityRule.valueSortDirection;
        }
        return videoPriorityRule.copy(videoPrioritySortType, map, videoValueSortDirection);
    }

    public final String buildOrderText() {
        String strBuildQualityPriorityText;
        String label;
        int i = WhenMappings.$EnumSwitchMapping$0[this.sortType.ordinal()];
        if (i == 1) {
            Map<VideoQualityStandard, Integer> map = this.qualityPriorities;
            return (map == null || (strBuildQualityPriorityText = VideoVersionPrioritySettings.INSTANCE.buildQualityPriorityText(map)) == null) ? "空" : strBuildQualityPriorityText;
        }
        if (i == 2 || i == 3 || i == 4) {
            VideoValueSortDirection videoValueSortDirection = this.valueSortDirection;
            return (videoValueSortDirection == null || (label = videoValueSortDirection.getLabel()) == null) ? "空" : label;
        }
        if (i == 5) {
            return "";
        }
        qu.f();
        return null;
    }

    public final String buildPreviewText() {
        if (!hasOrder()) {
            return null;
        }
        String strBuildOrderText = buildOrderText();
        int i = WhenMappings.$EnumSwitchMapping$0[this.sortType.ordinal()];
        if (i == 1) {
            return kb0.x("画质标准 ", strBuildOrderText);
        }
        if (i == 2) {
            return kb0.x("码率 ", strBuildOrderText);
        }
        if (i == 3) {
            return kb0.x("文件大小 ", strBuildOrderText);
        }
        if (i == 4) {
            return kb0.x("分辨率 ", strBuildOrderText);
        }
        if (i == 5) {
            return null;
        }
        qu.f();
        return null;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    public final Map<VideoQualityStandard, Integer> component2() {
        return this.qualityPriorities;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final VideoPriorityRule copy(VideoPrioritySortType sortType, Map<VideoQualityStandard, Integer> qualityPriorities, VideoValueSortDirection valueSortDirection) {
        sortType.getClass();
        return new VideoPriorityRule(sortType, qualityPriorities, valueSortDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPriorityRule)) {
            return false;
        }
        VideoPriorityRule videoPriorityRule = (VideoPriorityRule) other;
        return this.sortType == videoPriorityRule.sortType && Intrinsics.areEqual(this.qualityPriorities, videoPriorityRule.qualityPriorities) && this.valueSortDirection == videoPriorityRule.valueSortDirection;
    }

    public final Map<VideoQualityStandard, Integer> getQualityPriorities() {
        return this.qualityPriorities;
    }

    public final boolean hasOrder() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.sortType.ordinal()];
        if (i == 1) {
            return this.qualityPriorities != null;
        }
        if (i == 2 || i == 3 || i == 4) {
            return this.valueSortDirection != null;
        }
        if (i == 5) {
            return false;
        }
        qu.f();
        return false;
    }

    public int hashCode() {
        int iHashCode = this.sortType.hashCode() * 31;
        Map<VideoQualityStandard, Integer> map = this.qualityPriorities;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        VideoValueSortDirection videoValueSortDirection = this.valueSortDirection;
        return iHashCode2 + (videoValueSortDirection != null ? videoValueSortDirection.hashCode() : 0);
    }

    public final VideoPriorityRule normalized() {
        if (this.sortType != VideoPrioritySortType.QUALITY) {
            return copy$default(this, null, null, null, 5, null);
        }
        Map<VideoQualityStandard, Integer> map = this.qualityPriorities;
        return copy$default(this, null, map != null ? VideoVersionPrioritySettings.INSTANCE.normalizeQualityPriorities(map) : null, null, 1, null);
    }

    public String toString() {
        return "VideoPriorityRule(sortType=" + this.sortType + ", qualityPriorities=" + this.qualityPriorities + ", valueSortDirection=" + this.valueSortDirection + ")";
    }

    public VideoPriorityRule(VideoPrioritySortType videoPrioritySortType, Map<VideoQualityStandard, Integer> map, VideoValueSortDirection videoValueSortDirection) {
        videoPrioritySortType.getClass();
        this.sortType = videoPrioritySortType;
        this.qualityPriorities = map;
        this.valueSortDirection = videoValueSortDirection;
    }

    public VideoPriorityRule() {
        this(null, null, null, 7, null);
    }
}
