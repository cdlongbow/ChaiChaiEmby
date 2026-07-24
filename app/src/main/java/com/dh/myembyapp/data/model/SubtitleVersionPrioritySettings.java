package com.dh.myembyapp.data.model;

import defpackage.kb0;
import defpackage.mr;
import defpackage.qu;
import defpackage.qu1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final  class SubtitleVersionPrioritySettings {
    private static final SubtitleVersionPrioritySettings DEFAULT;
    private static final Map<SubtitleFormatPriorityType, Integer> DEFAULT_FORMAT_PRIORITIES;
    private static final Map<SubtitleLanguagePriorityType, Integer> DEFAULT_LANGUAGE_PRIORITIES;
    public static final int MAX_FORMAT_PRIORITY = 7;
    public static final int MAX_LANGUAGE_PRIORITY = 10;
    private final Map<SubtitleFormatPriorityType, Integer> formatPriorities;
    private final Map<SubtitleLanguagePriorityType, Integer> languagePriorities;
    private final List<SubtitlePrioritySortType> sortTypes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    
    private static final List<SubtitlePrioritySortType> DEFAULT_SORT_TYPES = CollectionsKt.listOf((Object[]) new SubtitlePrioritySortType[]{SubtitlePrioritySortType.LANGUAGE, SubtitlePrioritySortType.FORMAT});

        public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence buildFormatPriorityText$lambda$0$2(SubtitleFormatPriorityType subtitleFormatPriorityType) {
            subtitleFormatPriorityType.getClass();
            return subtitleFormatPriorityType.getLabel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence buildLanguagePriorityText$lambda$0$2(SubtitleLanguagePriorityType subtitleLanguagePriorityType) {
            subtitleLanguagePriorityType.getClass();
            return subtitleLanguagePriorityType.getLabel();
        }

        private final int cyclePriority(int value, int maxPriority) {
            if (RangesKt.coerceIn(value, 1, maxPriority) >= maxPriority) {
                return 1;
            }
            return RangesKt.coerceIn(value, 1, maxPriority) + 1;
        }

        public final String buildFormatPriorityText(SubtitleVersionPrioritySettings settings) {
            settings.getClass();
            Map mapNormalizedFormatPriorities = settings.normalizedFormatPriorities();
            IntRange intRange = new IntRange(1, 7);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                EnumEntries<SubtitleFormatPriorityType> entries = SubtitleFormatPriorityType.getEntries();
                ArrayList arrayList2 = new ArrayList();
                for (SubtitleFormatPriorityType subtitleFormatPriorityType : entries) {
                    Integer num = (Integer) mapNormalizedFormatPriorities.get(subtitleFormatPriorityType);
                    if (num != null && num.intValue() == iNextInt) {
                        arrayList2.add(subtitleFormatPriorityType);
                    }
                }
                ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
                String strJoinToString$default = arrayList3 != null ? CollectionsKt___CollectionsKt.joinToString$default(arrayList3, "/", null, null, 0, null, new qu1(19), 30, null) : null;
                if (strJoinToString$default != null) {
                    arrayList.add(strJoinToString$default);
                }
            }
            return CollectionsKt___CollectionsKt.joinToString$default(arrayList, " -> ", null, null, 0, null, null, 62, null);
        }

        public final String buildLanguagePriorityText(SubtitleVersionPrioritySettings settings) {
            settings.getClass();
            Map mapNormalizedLanguagePriorities = settings.normalizedLanguagePriorities();
            IntRange intRange = new IntRange(1, 10);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                EnumEntries<SubtitleLanguagePriorityType> entries = SubtitleLanguagePriorityType.getEntries();
                ArrayList arrayList2 = new ArrayList();
                for (SubtitleLanguagePriorityType subtitleLanguagePriorityType : entries) {
                    Integer num = (Integer) mapNormalizedLanguagePriorities.get(subtitleLanguagePriorityType);
                    if (num != null && num.intValue() == iNextInt) {
                        arrayList2.add(subtitleLanguagePriorityType);
                    }
                }
                ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
                String strJoinToString$default = arrayList3 != null ? CollectionsKt___CollectionsKt.joinToString$default(arrayList3, "/", null, null, 0, null, new qu1(18), 30, null) : null;
                if (strJoinToString$default != null) {
                    arrayList.add(strJoinToString$default);
                }
            }
            return CollectionsKt___CollectionsKt.joinToString$default(arrayList, " -> ", null, null, 0, null, null, 62, null);
        }

        public final int cycleFormatPriority(int value) {
            return cyclePriority(value, 7);
        }

        public final int cycleLanguagePriority(int value) {
            return cyclePriority(value, 10);
        }

        public final SubtitleVersionPrioritySettings getDEFAULT() {
            return SubtitleVersionPrioritySettings.DEFAULT;
        }

        public final Map<SubtitleFormatPriorityType, Integer> getDEFAULT_FORMAT_PRIORITIES() {
            return SubtitleVersionPrioritySettings.DEFAULT_FORMAT_PRIORITIES;
        }

        public final Map<SubtitleLanguagePriorityType, Integer> getDEFAULT_LANGUAGE_PRIORITIES() {
            return SubtitleVersionPrioritySettings.DEFAULT_LANGUAGE_PRIORITIES;
        }

        public final List<SubtitlePrioritySortType> getDEFAULT_SORT_TYPES() {
            return SubtitleVersionPrioritySettings.DEFAULT_SORT_TYPES;
        }

        public final Map<SubtitleFormatPriorityType, Integer> normalizeFormatPriorities(Map<SubtitleFormatPriorityType, Integer> priorities) {
            priorities.getClass();
            Map<SubtitleFormatPriorityType, Integer> default_format_priorities = getDEFAULT_FORMAT_PRIORITIES();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(default_format_priorities.size()));
            Iterator<T> it = default_format_priorities.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                SubtitleFormatPriorityType subtitleFormatPriorityType = (SubtitleFormatPriorityType) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                Integer num = priorities.get(subtitleFormatPriorityType);
                if (num != null) {
                    iIntValue = RangesKt.coerceIn(num.intValue(), 1, 7);
                }
                linkedHashMap.put(key, Integer.valueOf(iIntValue));
            }
            return linkedHashMap;
        }

        public final Map<SubtitleLanguagePriorityType, Integer> normalizeLanguagePriorities(Map<SubtitleLanguagePriorityType, Integer> priorities) {
            priorities.getClass();
            Map<SubtitleLanguagePriorityType, Integer> default_language_priorities = getDEFAULT_LANGUAGE_PRIORITIES();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(default_language_priorities.size()));
            Iterator<T> it = default_language_priorities.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                SubtitleLanguagePriorityType subtitleLanguagePriorityType = (SubtitleLanguagePriorityType) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                Integer num = priorities.get(subtitleLanguagePriorityType);
                if (num != null) {
                    iIntValue = RangesKt.coerceIn(num.intValue(), 1, 10);
                }
                linkedHashMap.put(key, Integer.valueOf(iIntValue));
            }
            return linkedHashMap;
        }

        public final List<SubtitlePrioritySortType> normalizeSortTypes(List<? extends SubtitlePrioritySortType> sortTypes) {
            sortTypes.getClass();
            ArrayList arrayList = new ArrayList();
            for (SubtitlePrioritySortType subtitlePrioritySortType : sortTypes) {
                if (!arrayList.contains(subtitlePrioritySortType)) {
                    arrayList.add(subtitlePrioritySortType);
                }
            }
            for (SubtitlePrioritySortType subtitlePrioritySortType2 : SubtitlePrioritySortType.getEntries()) {
                if (arrayList.size() < SubtitleVersionPrioritySettings.INSTANCE.getDEFAULT_SORT_TYPES().size() && !arrayList.contains(subtitlePrioritySortType2)) {
                    arrayList.add(subtitlePrioritySortType2);
                }
            }
            List<SubtitlePrioritySortType> listTake = CollectionsKt.take(arrayList, getDEFAULT_SORT_TYPES().size());
            return listTake.isEmpty() ? SubtitleVersionPrioritySettings.INSTANCE.getDEFAULT_SORT_TYPES() : listTake;
        }

        private Companion() {
        }
    }

        public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubtitlePrioritySortType.values().length];
            try {
                iArr[SubtitlePrioritySortType.LANGUAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubtitlePrioritySortType.FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        EnumEntries<SubtitleLanguagePriorityType> entries = SubtitleLanguagePriorityType.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10)), 16));
        for (SubtitleLanguagePriorityType subtitleLanguagePriorityType : entries) {
            linkedHashMap.put(subtitleLanguagePriorityType, Integer.valueOf(subtitleLanguagePriorityType.getDefaultPriority()));
        }
        DEFAULT_LANGUAGE_PRIORITIES = linkedHashMap;
        EnumEntries<SubtitleFormatPriorityType> entries2 = SubtitleFormatPriorityType.getEntries();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries2, 10)), 16));
        for (SubtitleFormatPriorityType subtitleFormatPriorityType : entries2) {
            linkedHashMap2.put(subtitleFormatPriorityType, Integer.valueOf(subtitleFormatPriorityType.getDefaultPriority()));
        }
        DEFAULT_FORMAT_PRIORITIES = linkedHashMap2;
        DEFAULT = new SubtitleVersionPrioritySettings(null, null, null, 7, null);
    }

    public /* synthetic */ SubtitleVersionPrioritySettings(List list, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_SORT_TYPES : list, (i & 2) != 0 ? DEFAULT_LANGUAGE_PRIORITIES : map, (i & 4) != 0 ? DEFAULT_FORMAT_PRIORITIES : map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubtitleVersionPrioritySettings copy$default(SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, List list, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = subtitleVersionPrioritySettings.sortTypes;
        }
        if ((i & 2) != 0) {
            map = subtitleVersionPrioritySettings.languagePriorities;
        }
        if ((i & 4) != 0) {
            map2 = subtitleVersionPrioritySettings.formatPriorities;
        }
        return subtitleVersionPrioritySettings.copy(list, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<SubtitleFormatPriorityType, Integer> normalizedFormatPriorities() {
        return INSTANCE.normalizeFormatPriorities(this.formatPriorities);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<SubtitleLanguagePriorityType, Integer> normalizedLanguagePriorities() {
        return INSTANCE.normalizeLanguagePriorities(this.languagePriorities);
    }

    public final String buildPreviewText() {
        SubtitleVersionPrioritySettings subtitleVersionPrioritySettingsNormalized = normalized();
        List<SubtitlePrioritySortType> list = subtitleVersionPrioritySettingsNormalized.sortTypes;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$0[((SubtitlePrioritySortType) it.next()).ordinal()];
            String strX = null;
            if (i != 1) {
                if (i != 2) {
                    qu.f();
                    return null;
                }
                if (subtitleVersionPrioritySettingsNormalized.hasFormatPriority()) {
                    strX = kb0.x("格式 ", INSTANCE.buildFormatPriorityText(subtitleVersionPrioritySettingsNormalized));
                }
            } else if (subtitleVersionPrioritySettingsNormalized.hasLanguagePriority()) {
                strX = kb0.x("语言 ", INSTANCE.buildLanguagePriorityText(subtitleVersionPrioritySettingsNormalized));
            }
            if (strX != null) {
                arrayList.add(strX);
            }
        }
        return arrayList.isEmpty() ? "效果：当前不区分字幕语言或格式，列表保持原始顺序。" : mr.r("效果：按 ", CollectionsKt___CollectionsKt.joinToString$default(arrayList, "，再按 ", null, null, 0, null, null, 62, null), " 排序；同档内保持原始顺序。");
    }

    public final List<SubtitlePrioritySortType> component1() {
        return this.sortTypes;
    }

    public final Map<SubtitleLanguagePriorityType, Integer> component2() {
        return this.languagePriorities;
    }

    public final Map<SubtitleFormatPriorityType, Integer> component3() {
        return this.formatPriorities;
    }

    public final SubtitleVersionPrioritySettings copy(List<? extends SubtitlePrioritySortType> sortTypes, Map<SubtitleLanguagePriorityType, Integer> languagePriorities, Map<SubtitleFormatPriorityType, Integer> formatPriorities) {
        sortTypes.getClass();
        languagePriorities.getClass();
        formatPriorities.getClass();
        return new SubtitleVersionPrioritySettings(sortTypes, languagePriorities, formatPriorities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubtitleVersionPrioritySettings)) {
            return false;
        }
        SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = (SubtitleVersionPrioritySettings) other;
        return Intrinsics.areEqual(this.sortTypes, subtitleVersionPrioritySettings.sortTypes) && Intrinsics.areEqual(this.languagePriorities, subtitleVersionPrioritySettings.languagePriorities) && Intrinsics.areEqual(this.formatPriorities, subtitleVersionPrioritySettings.formatPriorities);
    }

    public final int formatPriorityFor(SubtitleFormatPriorityType formatType) {
        formatType.getClass();
        Integer num = normalizedFormatPriorities().get(formatType);
        return num != null ? num.intValue() : formatType.getDefaultPriority();
    }

    public final Map<SubtitleFormatPriorityType, Integer> getFormatPriorities() {
        return this.formatPriorities;
    }

    public final Map<SubtitleLanguagePriorityType, Integer> getLanguagePriorities() {
        return this.languagePriorities;
    }

    public final List<SubtitlePrioritySortType> getSortTypes() {
        return this.sortTypes;
    }

    public final boolean hasFormatPriority() {
        return CollectionsKt.toSet(normalizedFormatPriorities().values()).size() > 1;
    }

    public final boolean hasLanguagePriority() {
        return CollectionsKt.toSet(normalizedLanguagePriorities().values()).size() > 1;
    }

    public int hashCode() {
        return this.formatPriorities.hashCode() + ((this.languagePriorities.hashCode() + (this.sortTypes.hashCode() * 31)) * 31);
    }

    public final int languagePriorityFor(SubtitleLanguagePriorityType languageType) {
        languageType.getClass();
        Integer num = normalizedLanguagePriorities().get(languageType);
        return num != null ? num.intValue() : languageType.getDefaultPriority();
    }

    public final SubtitleVersionPrioritySettings normalized() {
        Companion companion = INSTANCE;
        return copy(companion.normalizeSortTypes(this.sortTypes), companion.normalizeLanguagePriorities(this.languagePriorities), companion.normalizeFormatPriorities(this.formatPriorities));
    }

    public String toString() {
        return "SubtitleVersionPrioritySettings(sortTypes=" + this.sortTypes + ", languagePriorities=" + this.languagePriorities + ", formatPriorities=" + this.formatPriorities + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubtitleVersionPrioritySettings(List<? extends SubtitlePrioritySortType> list, Map<SubtitleLanguagePriorityType, Integer> map, Map<SubtitleFormatPriorityType, Integer> map2) {
        list.getClass();
        map.getClass();
        map2.getClass();
        this.sortTypes = list;
        this.languagePriorities = map;
        this.formatPriorities = map2;
    }

    public SubtitleVersionPrioritySettings() {
        this(null, null, null, 7, null);
    }
}
