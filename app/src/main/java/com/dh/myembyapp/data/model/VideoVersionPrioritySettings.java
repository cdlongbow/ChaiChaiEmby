package com.dh.myembyapp.data.model;

import defpackage.mr;
import defpackage.y82;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final  class VideoVersionPrioritySettings {
    public static final int MAX_RULE_COUNT = 4;
    private final List<VideoPriorityRule> rules;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    
    private static final Map<VideoQualityStandard, Integer> DEFAULT_QUALITY_PRIORITIES = MapsKt.mapOf(TuplesKt.to(VideoQualityStandard.DOVI, 1), TuplesKt.to(VideoQualityStandard.HDR, 1), TuplesKt.to(VideoQualityStandard.SDR, 1));
    private static final VideoVersionPrioritySettings DEFAULT = new VideoVersionPrioritySettings(null == true ? 1 : 0, 1, null == true ? 1 : 0);

        public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence buildQualityPriorityText$lambda$0$2(VideoQualityStandard videoQualityStandard) {
            videoQualityStandard.getClass();
            return videoQualityStandard.getLabel();
        }

        public final String buildQualityPriorityText(Map<VideoQualityStandard, Integer> priorities) {
            priorities.getClass();
            Map<VideoQualityStandard, Integer> mapNormalizeQualityPriorities = normalizeQualityPriorities(priorities);
            IntRange intRange = new IntRange(1, 3);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                EnumEntries<VideoQualityStandard> entries = VideoQualityStandard.getEntries();
                ArrayList arrayList2 = new ArrayList();
                for (VideoQualityStandard videoQualityStandard : entries) {
                    Integer num = mapNormalizeQualityPriorities.get(videoQualityStandard);
                    if (num != null && num.intValue() == iNextInt) {
                        arrayList2.add(videoQualityStandard);
                    }
                }
                ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
                String strJoinToString$default = arrayList3 != null ? CollectionsKt___CollectionsKt.joinToString$default(arrayList3, "/", null, null, 0, null, new y82(28), 30, null) : null;
                if (strJoinToString$default != null) {
                    arrayList.add(strJoinToString$default);
                }
            }
            return CollectionsKt___CollectionsKt.joinToString$default(arrayList, " -> ", null, null, 0, null, null, 62, null);
        }

        public final int cycleQualityPriority(int value) {
            int iCoerceIn = RangesKt.coerceIn(value, 1, 3);
            if (iCoerceIn != 1) {
                return iCoerceIn != 2 ? 1 : 3;
            }
            return 2;
        }

        public final VideoVersionPrioritySettings getDEFAULT() {
            return VideoVersionPrioritySettings.DEFAULT;
        }

        public final Map<VideoQualityStandard, Integer> getDEFAULT_QUALITY_PRIORITIES() {
            return VideoVersionPrioritySettings.DEFAULT_QUALITY_PRIORITIES;
        }

        public final Map<VideoQualityStandard, Integer> normalizeQualityPriorities(Map<VideoQualityStandard, Integer> priorities) {
            priorities.getClass();
            Map<VideoQualityStandard, Integer> default_quality_priorities = getDEFAULT_QUALITY_PRIORITIES();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(default_quality_priorities.size()));
            Iterator<T> it = default_quality_priorities.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                VideoQualityStandard videoQualityStandard = (VideoQualityStandard) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                Integer num = priorities.get(videoQualityStandard);
                if (num != null) {
                    iIntValue = RangesKt.coerceIn(num.intValue(), 1, 3);
                }
                linkedHashMap.put(key, Integer.valueOf(iIntValue));
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoVersionPrioritySettings(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null));
        }
        this(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoVersionPrioritySettings copy$default(VideoVersionPrioritySettings videoVersionPrioritySettings, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = videoVersionPrioritySettings.rules;
        }
        return videoVersionPrioritySettings.copy(list);
    }

    public final String buildPreviewText() {
        List<VideoPriorityRule> list = normalized().rules;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String strBuildPreviewText = ((VideoPriorityRule) it.next()).buildPreviewText();
            if (strBuildPreviewText != null) {
                arrayList.add(strBuildPreviewText);
            }
        }
        return arrayList.isEmpty() ? "效果：当前保持视频版本原始顺序。" : mr.r("效果：按 ", CollectionsKt___CollectionsKt.joinToString$default(arrayList, "，再按 ", null, null, 0, null, null, 62, null), " 排序。");
    }

    public final List<VideoPriorityRule> component1() {
        return this.rules;
    }

    public final VideoVersionPrioritySettings copy(List<VideoPriorityRule> rules) {
        rules.getClass();
        return new VideoVersionPrioritySettings(rules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VideoVersionPrioritySettings) && Intrinsics.areEqual(this.rules, ((VideoVersionPrioritySettings) other).rules);
    }

    public final List<VideoPriorityRule> getRules() {
        return this.rules;
    }

    public int hashCode() {
        return this.rules.hashCode();
    }

    public final VideoVersionPrioritySettings normalized() {
        List<VideoPriorityRule> listListOf = this.rules;
        if (listListOf.isEmpty()) {
            listListOf = CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null));
        }
        List listTake = CollectionsKt.take(listListOf, 4);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            arrayList.add(((VideoPriorityRule) it.next()).normalized());
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List<VideoPriorityRule> listListOf2 = arrayList;
        if (zIsEmpty) {
            listListOf2 = CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null));
        }
        return copy(listListOf2);
    }

    public String toString() {
        return "VideoVersionPrioritySettings(rules=" + this.rules + ")";
    }

    public VideoVersionPrioritySettings(List<VideoPriorityRule> list) {
        list.getClass();
        this.rules = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoVersionPrioritySettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
