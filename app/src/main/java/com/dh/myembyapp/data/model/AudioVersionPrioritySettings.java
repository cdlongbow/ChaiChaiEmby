package com.dh.myembyapp.data.model;

import defpackage.c61;
import defpackage.mr;
import defpackage.qu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B]\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001b\u001a\u00020\u0000J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J_\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0014\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020\bHÖ\u0081\u0004J\n\u0010+\u001a\u00020\u001dHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006-"}, d2 = {"Lcom/dh/myembyapp/data/model/AudioVersionPrioritySettings;", "", "sortTypes", "", "Lcom/dh/myembyapp/data/model/AudioPrioritySortType;", "preferredLanguage", "Lcom/dh/myembyapp/data/model/AudioLanguagePreference;", "aacPriority", "", "ac3Priority", "eac3Priority", "dtsPriority", "truehdPriority", "flacPriority", "<init>", "(Ljava/util/List;Lcom/dh/myembyapp/data/model/AudioLanguagePreference;IIIIII)V", "getSortTypes", "()Ljava/util/List;", "getPreferredLanguage", "()Lcom/dh/myembyapp/data/model/AudioLanguagePreference;", "getAacPriority", "()I", "getAc3Priority", "getEac3Priority", "getDtsPriority", "getTruehdPriority", "getFlacPriority", "normalized", "buildPreviewText", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AudioVersionPrioritySettings {
    public static final int MAX_PRIORITY = 6;
    private final int aacPriority;
    private final int ac3Priority;
    private final int dtsPriority;
    private final int eac3Priority;
    private final int flacPriority;
    private final AudioLanguagePreference preferredLanguage;
    private final List<AudioPrioritySortType> sortTypes;
    private final int truehdPriority;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<AudioPrioritySortType> DEFAULT_SORT_TYPES = CollectionsKt.listOf((Object[]) new AudioPrioritySortType[]{AudioPrioritySortType.LANGUAGE, AudioPrioritySortType.FORMAT});
    private static final AudioVersionPrioritySettings DEFAULT = new AudioVersionPrioritySettings(null, null, 0, 0, 0, 0, 0, 0, 255, null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\fJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/dh/myembyapp/data/model/AudioVersionPrioritySettings$Companion;", "", "<init>", "()V", "MAX_PRIORITY", "", "DEFAULT_SORT_TYPES", "", "Lcom/dh/myembyapp/data/model/AudioPrioritySortType;", "getDEFAULT_SORT_TYPES", "()Ljava/util/List;", "DEFAULT", "Lcom/dh/myembyapp/data/model/AudioVersionPrioritySettings;", "getDEFAULT", "()Lcom/dh/myembyapp/data/model/AudioVersionPrioritySettings;", "cyclePriority", "value", "normalizeSortTypes", "sortTypes", "hasDistinctFormatPriorities", "", "settings", "buildFormatPriorityText", "", "buildFormatGroupText", "priority", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String buildFormatGroupText(AudioVersionPrioritySettings settings, int priority) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            if (settings.getAacPriority() == priority) {
                listCreateListBuilder.add("AAC");
            }
            if (settings.getAc3Priority() == priority) {
                listCreateListBuilder.add("AC3");
            }
            if (settings.getEac3Priority() == priority) {
                listCreateListBuilder.add("EAC3");
            }
            if (settings.getDtsPriority() == priority) {
                listCreateListBuilder.add("DTS");
            }
            if (settings.getTruehdPriority() == priority) {
                listCreateListBuilder.add("TrueHD");
            }
            if (settings.getFlacPriority() == priority) {
                listCreateListBuilder.add("FLAC");
            }
            return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.build(listCreateListBuilder), "、", null, null, 0, null, null, 62, null);
        }

        public final String buildFormatPriorityText(AudioVersionPrioritySettings settings) {
            settings.getClass();
            AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized = settings.normalized();
            IntRange intRange = new IntRange(1, 6);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                String strBuildFormatGroupText = AudioVersionPrioritySettings.INSTANCE.buildFormatGroupText(audioVersionPrioritySettingsNormalized, ((IntIterator) it).nextInt());
                if (strBuildFormatGroupText.length() <= 0) {
                    strBuildFormatGroupText = null;
                }
                String strR = strBuildFormatGroupText != null ? mr.r("【", strBuildFormatGroupText, "】") : null;
                if (strR != null) {
                    arrayList.add(strR);
                }
            }
            return CollectionsKt___CollectionsKt.joinToString$default(arrayList, " -> ", null, null, 0, null, null, 62, null);
        }

        public final int cyclePriority(int value) {
            if (RangesKt.coerceIn(value, 1, 6) >= 6) {
                return 1;
            }
            return RangesKt.coerceIn(value, 1, 6) + 1;
        }

        public final AudioVersionPrioritySettings getDEFAULT() {
            return AudioVersionPrioritySettings.DEFAULT;
        }

        public final List<AudioPrioritySortType> getDEFAULT_SORT_TYPES() {
            return AudioVersionPrioritySettings.DEFAULT_SORT_TYPES;
        }

        public final boolean hasDistinctFormatPriorities(AudioVersionPrioritySettings settings) {
            settings.getClass();
            AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized = settings.normalized();
            return SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(audioVersionPrioritySettingsNormalized.getAacPriority()), Integer.valueOf(audioVersionPrioritySettingsNormalized.getAc3Priority()), Integer.valueOf(audioVersionPrioritySettingsNormalized.getEac3Priority()), Integer.valueOf(audioVersionPrioritySettingsNormalized.getDtsPriority()), Integer.valueOf(audioVersionPrioritySettingsNormalized.getTruehdPriority()), Integer.valueOf(audioVersionPrioritySettingsNormalized.getFlacPriority())}).size() > 1;
        }

        public final List<AudioPrioritySortType> normalizeSortTypes(List<? extends AudioPrioritySortType> sortTypes) {
            sortTypes.getClass();
            ArrayList arrayList = new ArrayList();
            for (AudioPrioritySortType audioPrioritySortType : sortTypes) {
                if (!arrayList.contains(audioPrioritySortType)) {
                    arrayList.add(audioPrioritySortType);
                }
            }
            for (AudioPrioritySortType audioPrioritySortType2 : AudioPrioritySortType.getEntries()) {
                if (arrayList.size() < AudioVersionPrioritySettings.INSTANCE.getDEFAULT_SORT_TYPES().size() && !arrayList.contains(audioPrioritySortType2)) {
                    arrayList.add(audioPrioritySortType2);
                }
            }
            List<AudioPrioritySortType> listTake = CollectionsKt.take(arrayList, getDEFAULT_SORT_TYPES().size());
            return listTake.isEmpty() ? AudioVersionPrioritySettings.INSTANCE.getDEFAULT_SORT_TYPES() : listTake;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioPrioritySortType.values().length];
            try {
                iArr[AudioPrioritySortType.LANGUAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioPrioritySortType.FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AudioVersionPrioritySettings(List list, AudioLanguagePreference audioLanguagePreference, int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? DEFAULT_SORT_TYPES : list, (i7 & 2) != 0 ? AudioLanguagePreference.DEFAULT : audioLanguagePreference, (i7 & 4) != 0 ? 1 : i, (i7 & 8) != 0 ? 1 : i2, (i7 & 16) != 0 ? 1 : i3, (i7 & 32) != 0 ? 1 : i4, (i7 & 64) != 0 ? 1 : i5, (i7 & 128) != 0 ? 1 : i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioVersionPrioritySettings copy$default(AudioVersionPrioritySettings audioVersionPrioritySettings, List list, AudioLanguagePreference audioLanguagePreference, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = audioVersionPrioritySettings.sortTypes;
        }
        if ((i7 & 2) != 0) {
            audioLanguagePreference = audioVersionPrioritySettings.preferredLanguage;
        }
        if ((i7 & 4) != 0) {
            i = audioVersionPrioritySettings.aacPriority;
        }
        if ((i7 & 8) != 0) {
            i2 = audioVersionPrioritySettings.ac3Priority;
        }
        if ((i7 & 16) != 0) {
            i3 = audioVersionPrioritySettings.eac3Priority;
        }
        if ((i7 & 32) != 0) {
            i4 = audioVersionPrioritySettings.dtsPriority;
        }
        if ((i7 & 64) != 0) {
            i5 = audioVersionPrioritySettings.truehdPriority;
        }
        if ((i7 & 128) != 0) {
            i6 = audioVersionPrioritySettings.flacPriority;
        }
        int i8 = i5;
        int i9 = i6;
        int i10 = i3;
        int i11 = i4;
        return audioVersionPrioritySettings.copy(list, audioLanguagePreference, i, i2, i10, i11, i8, i9);
    }

    public final String buildPreviewText() {
        Object next;
        boolean z;
        boolean z2;
        AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized = normalized();
        AudioLanguagePreference audioLanguagePreference = audioVersionPrioritySettingsNormalized.preferredLanguage;
        Object obj = null;
        if (audioLanguagePreference == AudioLanguagePreference.DEFAULT) {
            audioLanguagePreference = null;
        }
        String label = audioLanguagePreference != null ? audioLanguagePreference.getLabel() : null;
        Companion companion = INSTANCE;
        String strBuildFormatPriorityText = companion.buildFormatPriorityText(audioVersionPrioritySettingsNormalized);
        boolean zHasDistinctFormatPriorities = companion.hasDistinctFormatPriorities(audioVersionPrioritySettingsNormalized);
        boolean z3 = label != null;
        if (!z3 && !zHasDistinctFormatPriorities) {
            return "效果：当前不区分音频语言或格式，列表保持原始顺序。";
        }
        Iterator<T> it = audioVersionPrioritySettingsNormalized.sortTypes.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i = WhenMappings.$EnumSwitchMapping$0[((AudioPrioritySortType) next).ordinal()];
            if (i == 1) {
                z2 = z3;
            } else {
                if (i != 2) {
                    qu.f();
                    return null;
                }
                z2 = zHasDistinctFormatPriorities;
            }
        } while (!z2);
        AudioPrioritySortType audioPrioritySortType = (AudioPrioritySortType) next;
        for (Object obj2 : audioVersionPrioritySettingsNormalized.sortTypes) {
            AudioPrioritySortType audioPrioritySortType2 = (AudioPrioritySortType) obj2;
            if (audioPrioritySortType2 != audioPrioritySortType) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[audioPrioritySortType2.ordinal()];
                if (i2 == 1) {
                    z = z3;
                } else {
                    if (i2 != 2) {
                        qu.f();
                        return null;
                    }
                    z = zHasDistinctFormatPriorities;
                }
                if (z) {
                    obj = obj2;
                    break;
                }
            }
        }
        AudioPrioritySortType audioPrioritySortType3 = (AudioPrioritySortType) obj;
        AudioPrioritySortType audioPrioritySortType4 = AudioPrioritySortType.LANGUAGE;
        if (audioPrioritySortType == audioPrioritySortType4 && audioPrioritySortType3 == AudioPrioritySortType.FORMAT) {
            return mr.s("效果：先优先选择", label, "音轨；同语言内再按 ", strBuildFormatPriorityText, " 分组；未命中时保持当前默认音轨。");
        }
        AudioPrioritySortType audioPrioritySortType5 = AudioPrioritySortType.FORMAT;
        if (audioPrioritySortType == audioPrioritySortType5 && audioPrioritySortType3 == audioPrioritySortType4) {
            return mr.s("效果：先按 ", strBuildFormatPriorityText, " 分组；每组内再优先选择", label, "音轨；未命中语言时继续按格式顺序选择。");
        }
        if (audioPrioritySortType == audioPrioritySortType4) {
            return mr.s("效果：优先选择", label, "音轨；若存在多个", label, "音轨，则保持原始顺序；未命中时保持当前默认音轨。");
        }
        return audioPrioritySortType == audioPrioritySortType5 ? mr.r("效果：先按 ", strBuildFormatPriorityText, " 分组；每组内保持原始顺序。") : "效果：当前不区分音频语言或格式，列表保持原始顺序。";
    }

    public final List<AudioPrioritySortType> component1() {
        return this.sortTypes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    /* JADX INFO: renamed from: component8, reason: from getter */

    public final AudioVersionPrioritySettings copy(List<? extends AudioPrioritySortType> sortTypes, AudioLanguagePreference preferredLanguage, int aacPriority, int ac3Priority, int eac3Priority, int dtsPriority, int truehdPriority, int flacPriority) {
        sortTypes.getClass();
        preferredLanguage.getClass();
        return new AudioVersionPrioritySettings(sortTypes, preferredLanguage, aacPriority, ac3Priority, eac3Priority, dtsPriority, truehdPriority, flacPriority);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioVersionPrioritySettings)) {
            return false;
        }
        AudioVersionPrioritySettings audioVersionPrioritySettings = (AudioVersionPrioritySettings) other;
        return Intrinsics.areEqual(this.sortTypes, audioVersionPrioritySettings.sortTypes) && this.preferredLanguage == audioVersionPrioritySettings.preferredLanguage && this.aacPriority == audioVersionPrioritySettings.aacPriority && this.ac3Priority == audioVersionPrioritySettings.ac3Priority && this.eac3Priority == audioVersionPrioritySettings.eac3Priority && this.dtsPriority == audioVersionPrioritySettings.dtsPriority && this.truehdPriority == audioVersionPrioritySettings.truehdPriority && this.flacPriority == audioVersionPrioritySettings.flacPriority;
    }

    public int hashCode() {
        return ((((((((((((this.preferredLanguage.hashCode() + (this.sortTypes.hashCode() * 31)) * 31) + this.aacPriority) * 31) + this.ac3Priority) * 31) + this.eac3Priority) * 31) + this.dtsPriority) * 31) + this.truehdPriority) * 31) + this.flacPriority;
    }

    public final AudioVersionPrioritySettings normalized() {
        return copy$default(this, INSTANCE.normalizeSortTypes(this.sortTypes), null, RangesKt.coerceIn(this.aacPriority, 1, 6), RangesKt.coerceIn(this.ac3Priority, 1, 6), RangesKt.coerceIn(this.eac3Priority, 1, 6), RangesKt.coerceIn(this.dtsPriority, 1, 6), RangesKt.coerceIn(this.truehdPriority, 1, 6), RangesKt.coerceIn(this.flacPriority, 1, 6), 2, null);
    }

    public String toString() {
        List<AudioPrioritySortType> list = this.sortTypes;
        AudioLanguagePreference audioLanguagePreference = this.preferredLanguage;
        int i = this.aacPriority;
        int i2 = this.ac3Priority;
        int i3 = this.eac3Priority;
        int i4 = this.dtsPriority;
        int i5 = this.truehdPriority;
        int i6 = this.flacPriority;
        StringBuilder sb = new StringBuilder("AudioVersionPrioritySettings(sortTypes=");
        sb.append(list);
        sb.append(", preferredLanguage=");
        sb.append(audioLanguagePreference);
        sb.append(", aacPriority=");
        c61.t(sb, i, ", ac3Priority=", i2, ", eac3Priority=");
        c61.t(sb, i3, ", dtsPriority=", i4, ", truehdPriority=");
        sb.append(i5);
        sb.append(", flacPriority=");
        sb.append(i6);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioVersionPrioritySettings(List<? extends AudioPrioritySortType> list, AudioLanguagePreference audioLanguagePreference, int i, int i2, int i3, int i4, int i5, int i6) {
        list.getClass();
        audioLanguagePreference.getClass();
        this.sortTypes = list;
        this.preferredLanguage = audioLanguagePreference;
        this.aacPriority = i;
        this.ac3Priority = i2;
        this.eac3Priority = i3;
        this.dtsPriority = i4;
        this.truehdPriority = i5;
        this.flacPriority = i6;
    }

    public AudioVersionPrioritySettings() {
        this(null, null, 0, 0, 0, 0, 0, 0, 255, null);
    }
}
