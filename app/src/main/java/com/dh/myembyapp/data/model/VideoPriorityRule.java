package com.dh.myembyapp.data.model;

import defpackage.kb0;
import defpackage.qu;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class VideoPriorityRule {
    
    private final Map<VideoQualityStandard, Integer> qualityPriorities;
    private final VideoPrioritySortType sortType;
    private final VideoValueSortDirection valueSortDirection;

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
