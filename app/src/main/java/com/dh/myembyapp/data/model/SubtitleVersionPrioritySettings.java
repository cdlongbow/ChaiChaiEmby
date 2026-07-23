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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&BC\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0002J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003JE\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0014\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\bHÖ\u0081\u0004J\n\u0010%\u001a\u00020\u001bHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006'"}, d2 = {"Lcom/dh/myembyapp/data/model/SubtitleVersionPrioritySettings;", "", "sortTypes", "", "Lcom/dh/myembyapp/data/model/SubtitlePrioritySortType;", "languagePriorities", "", "Lcom/dh/myembyapp/data/model/SubtitleLanguagePriorityType;", "", "formatPriorities", "Lcom/dh/myembyapp/data/model/SubtitleFormatPriorityType;", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getSortTypes", "()Ljava/util/List;", "getLanguagePriorities", "()Ljava/util/Map;", "getFormatPriorities", "normalized", "languagePriorityFor", "languageType", "formatPriorityFor", "formatType", "hasLanguagePriority", "", "hasFormatPriority", "buildPreviewText", "", "normalizedLanguagePriorities", "normalizedFormatPriorities", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SubtitleVersionPrioritySettings {
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
    public static final int $stable = 8;
    private static final List<SubtitlePrioritySortType> DEFAULT_SORT_TYPES = CollectionsKt.listOf((Object[]) new SubtitlePrioritySortType[]{SubtitlePrioritySortType.LANGUAGE, SubtitlePrioritySortType.FORMAT});

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bJ&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rJ&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\rJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0015J\u000e\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/dh/myembyapp/data/model/SubtitleVersionPrioritySettings$Companion;", "", "<init>", "()V", "MAX_LANGUAGE_PRIORITY", "", "MAX_FORMAT_PRIORITY", "DEFAULT_SORT_TYPES", "", "Lcom/dh/myembyapp/data/model/SubtitlePrioritySortType;", "getDEFAULT_SORT_TYPES", "()Ljava/util/List;", "DEFAULT_LANGUAGE_PRIORITIES", "", "Lcom/dh/myembyapp/data/model/SubtitleLanguagePriorityType;", "getDEFAULT_LANGUAGE_PRIORITIES", "()Ljava/util/Map;", "DEFAULT_FORMAT_PRIORITIES", "Lcom/dh/myembyapp/data/model/SubtitleFormatPriorityType;", "getDEFAULT_FORMAT_PRIORITIES", "DEFAULT", "Lcom/dh/myembyapp/data/model/SubtitleVersionPrioritySettings;", "getDEFAULT", "()Lcom/dh/myembyapp/data/model/SubtitleVersionPrioritySettings;", "cycleLanguagePriority", "value", "cycleFormatPriority", "cyclePriority", "maxPriority", "normalizeSortTypes", "sortTypes", "normalizeLanguagePriorities", "priorities", "normalizeFormatPriorities", "buildLanguagePriorityText", "", "settings", "buildFormatPriorityText", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
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
