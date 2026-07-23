package com.dh.myembyapp.data.model;

import defpackage.mr;
import defpackage.y82;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u000bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u000bHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/data/model/VideoVersionPrioritySettings;", "", "rules", "", "Lcom/dh/myembyapp/data/model/VideoPriorityRule;", "<init>", "(Ljava/util/List;)V", "getRules", "()Ljava/util/List;", "normalized", "buildPreviewText", "", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VideoVersionPrioritySettings {
    public static final int MAX_RULE_COUNT = 4;
    private final List<VideoPriorityRule> rules;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Map<VideoQualityStandard, Integer> DEFAULT_QUALITY_PRIORITIES = MapsKt.mapOf(TuplesKt.to(VideoQualityStandard.DOVI, 1), TuplesKt.to(VideoQualityStandard.HDR, 1), TuplesKt.to(VideoQualityStandard.SDR, 1));
    private static final VideoVersionPrioritySettings DEFAULT = new VideoVersionPrioritySettings(null == true ? 1 : 0, 1, null == true ? 1 : 0);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007J&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u001a\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/data/model/VideoVersionPrioritySettings$Companion;", "", "<init>", "()V", "DEFAULT_QUALITY_PRIORITIES", "", "Lcom/dh/myembyapp/data/model/VideoQualityStandard;", "", "getDEFAULT_QUALITY_PRIORITIES", "()Ljava/util/Map;", "DEFAULT", "Lcom/dh/myembyapp/data/model/VideoVersionPrioritySettings;", "getDEFAULT", "()Lcom/dh/myembyapp/data/model/VideoVersionPrioritySettings;", "MAX_RULE_COUNT", "cycleQualityPriority", "value", "normalizeQualityPriorities", "priorities", "buildQualityPriorityText", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
