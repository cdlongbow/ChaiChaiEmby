package com.dh.myembyapp.data.model;

import defpackage.a5;
import defpackage.b5;
import defpackage.kb0;
import defpackage.ll0;
import defpackage.mr;
import defpackage.qu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSourcePriorityKt {

        public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VersionVideoFormat.values().length];
            try {
                iArr[VersionVideoFormat.DOVI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VersionVideoFormat.HDR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VersionVideoFormat.SDR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoPrioritySortType.values().length];
            try {
                iArr2[VideoPrioritySortType.QUALITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoPrioritySortType.BITRATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoPrioritySortType.FILE_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VideoPrioritySortType.RESOLUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoPrioritySortType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VideoValueSortDirection.values().length];
            try {
                iArr3[VideoValueSortDirection.DESCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[VideoValueSortDirection.ASCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final String buildDynamicRangeLabel(MediaSource mediaSource) {
        MediaStream mediaStream;
        List<MediaStream> mediaStreams;
        Object next;
        if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
            mediaStream = null;
        } else {
            Iterator<T> it = mediaStreams.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((MediaStream) next).getType(), "Video"));
            mediaStream = (MediaStream) next;
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaStream != null ? mediaStream.getExtendedVideoSubType() : null, mediaStream != null ? mediaStream.getExtendedVideoSubTypeDescription() : null}), " ", null, null, 0, null, null, 62, null);
        Locale locale = Locale.ROOT;
        String lowerCase = strJoinToString$default.toLowerCase(locale);
        lowerCase.getClass();
        String dolbyVisionProfile = parseDolbyVisionProfile(lowerCase);
        String lowerCase2 = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaSource != null ? mediaSource.getVideoType() : null, mediaStream != null ? mediaStream.getVideoRangeType() : null, mediaStream != null ? mediaStream.getVideoRange() : null, mediaStream != null ? mediaStream.getExtendedVideoType() : null, mediaStream != null ? mediaStream.getExtendedVideoSubType() : null, mediaStream != null ? mediaStream.getExtendedVideoSubTypeDescription() : null, mediaStream != null ? mediaStream.getDisplayTitle() : null, mediaStream != null ? mediaStream.getTitle() : null, mediaStream != null ? mediaStream.getColorTransfer() : null, mediaStream != null ? mediaStream.getColorSpace() : null, mediaStream != null ? mediaStream.getColorPrimaries() : null}), " ", null, null, 0, null, null, 62, null).toLowerCase(locale);
        lowerCase2.getClass();
        String name = mediaSource != null ? mediaSource.getName() : null;
        if (name == null) {
            name = "";
        }
        String path = mediaSource != null ? mediaSource.getPath() : null;
        String lowerCase3 = (name + " " + (path != null ? path : "") + " " + lowerCase2).toLowerCase(locale);
        lowerCase3.getClass();
        if (StringsKt__lowerCase3.contains("dolbyvision") || StringsKt__lowerCase3.contains("dolby vision") || StringsKt__lowerCase3.contains("dovi")) {
            return dolbyVisionProfile != null ? mr.r("DV(", dolbyVisionProfile, ")") : "DV";
        }
        if (isHdr10PlusText(lowerCase3)) {
            return "HDR10+";
        }
        if (isHdr10Text(lowerCase3)) {
            return "HDR10";
        }
        if (StringsKt__lowerCase3.contains("hdr")) {
            return "HDR";
        }
        if (mediaSource != null) {
            return "SDR";
        }
        return null;
    }

    public static final List<MediaSource> buildVersionPickerMediaSources(List<MediaSource> list, List<MediaSource> list2, VideoVersionPrioritySettings videoVersionPrioritySettings) {
        videoVersionPrioritySettings.getClass();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            return sortMediaSourcesByPriority(list2, videoVersionPrioritySettings);
        }
        if (list2.isEmpty()) {
            return sortMediaSourcesByPriority(list, videoVersionPrioritySettings);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((MediaSource) obj).getId(), obj);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (MediaSource mediaSource : list2) {
            arrayList.add(mergeVersionPickerMediaSource(mediaSource, (MediaSource) linkedHashMap.get(mediaSource.getId())));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            MediaSource mediaSource2 = (MediaSource) obj2;
            if (!list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!Intrinsics.areEqual(((MediaSource) it.next()).getId(), mediaSource2.getId()));
            }
            arrayList2.add(obj2);
        }
        return sortMediaSourcesByPriority(CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2), videoVersionPrioritySettings);
    }

    public static final String buildVideoTypeLabel(MediaSource mediaSource) {
        String strBuildDynamicRangeLabel = buildDynamicRangeLabel(mediaSource);
        if (strBuildDynamicRangeLabel == null) {
            return null;
        }
        if (StringsKt__StringsJVMKt.startsWith(strBuildDynamicRangeLabel, "DV", true)) {
            return kb0.x("DOVI", StringsKt___StringsKt.drop(strBuildDynamicRangeLabel, 2));
        }
        if (StringsKt__StringsJVMKt.equals(strBuildDynamicRangeLabel, "HDR", true)) {
            return "HDR";
        }
        if (StringsKt__StringsJVMKt.equals(strBuildDynamicRangeLabel, "SDR", true)) {
            return "SDR";
        }
        String upperCase = strBuildDynamicRangeLabel.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    private static final int compareByDirection(Long l, Long l2, VideoValueSortDirection videoValueSortDirection) {
        int i = WhenMappings.$EnumSwitchMapping$2[videoValueSortDirection.ordinal()];
        if (i == 1) {
            return compareNullableLongDesc(l, l2);
        }
        if (i == 2) {
            return compareNullableLongAsc(l, l2);
        }
        qu.f();
        return 0;
    }

    private static final int compareByRule(MediaSource mediaSource, MediaSource mediaSource2, VideoPriorityRule videoPriorityRule) {
        int i = WhenMappings.$EnumSwitchMapping$1[videoPriorityRule.getSortType().ordinal()];
        if (i == 1) {
            return Intrinsics.compare(resolveFormatPriority(mediaSource, videoPriorityRule), resolveFormatPriority(mediaSource2, videoPriorityRule));
        }
        if (i == 2) {
            Integer bitrate = mediaSource.getBitrate();
            Long lValueOf = bitrate != null ? Long.valueOf(bitrate.intValue()) : null;
            Integer bitrate2 = mediaSource2.getBitrate();
            Long lValueOf2 = bitrate2 != null ? Long.valueOf(bitrate2.intValue()) : null;
            VideoValueSortDirection valueSortDirection = videoPriorityRule.getValueSortDirection();
            if (valueSortDirection == null) {
                return 0;
            }
            return compareByDirection(lValueOf, lValueOf2, valueSortDirection);
        }
        if (i == 3) {
            Long size = mediaSource.getSize();
            Long size2 = mediaSource2.getSize();
            VideoValueSortDirection valueSortDirection2 = videoPriorityRule.getValueSortDirection();
            if (valueSortDirection2 == null) {
                return 0;
            }
            return compareByDirection(size, size2, valueSortDirection2);
        }
        if (i != 4) {
            if (i == 5) {
                return 0;
            }
            qu.f();
            return 0;
        }
        Long lResolveKnownVideoResolutionSortValue = resolveKnownVideoResolutionSortValue(mediaSource);
        Long lResolveKnownVideoResolutionSortValue2 = resolveKnownVideoResolutionSortValue(mediaSource2);
        VideoValueSortDirection valueSortDirection3 = videoPriorityRule.getValueSortDirection();
        if (valueSortDirection3 == null) {
            return 0;
        }
        return compareByDirection(lResolveKnownVideoResolutionSortValue, lResolveKnownVideoResolutionSortValue2, valueSortDirection3);
    }

    public static final int compareMediaItemsByBestSourcePriority(List<MediaItem> list, List<MediaItem> list2, VideoVersionPrioritySettings videoVersionPrioritySettings, boolean z) {
        Integer bitrate;
        Integer bitrate2;
        list.getClass();
        list2.getClass();
        videoVersionPrioritySettings.getClass();
        List<VideoPriorityRule> rules = videoVersionPrioritySettings.normalized().getRules();
        ArrayList arrayList = new ArrayList();
        for (Object obj : rules) {
            if (((VideoPriorityRule) obj).hasOrder()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() && !z) {
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<MediaSource> mediaSources = ((MediaItem) it.next()).getMediaSources();
            if (mediaSources == null) {
                mediaSources = CollectionsKt.emptyList();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, mediaSources);
        }
        MediaSource mediaSourceSelectBestMediaSourceByPriority = selectBestMediaSourceByPriority(arrayList2, videoVersionPrioritySettings, z);
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            List<MediaSource> mediaSources2 = ((MediaItem) it2.next()).getMediaSources();
            if (mediaSources2 == null) {
                mediaSources2 = CollectionsKt.emptyList();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, mediaSources2);
        }
        MediaSource mediaSourceSelectBestMediaSourceByPriority2 = selectBestMediaSourceByPriority(arrayList3, videoVersionPrioritySettings, z);
        if (!arrayList.isEmpty()) {
            return compareSourcesByRules(mediaSourceSelectBestMediaSourceByPriority, mediaSourceSelectBestMediaSourceByPriority2, arrayList);
        }
        Long lValueOf = null;
        Long lValueOf2 = (mediaSourceSelectBestMediaSourceByPriority == null || (bitrate2 = mediaSourceSelectBestMediaSourceByPriority.getBitrate()) == null) ? null : Long.valueOf(bitrate2.intValue());
        if (mediaSourceSelectBestMediaSourceByPriority2 != null && (bitrate = mediaSourceSelectBestMediaSourceByPriority2.getBitrate()) != null) {
            lValueOf = Long.valueOf(bitrate.intValue());
        }
        return compareNullableLongDesc(lValueOf2, lValueOf);
    }

    public static /* synthetic */ int compareMediaItemsByBestSourcePriority$default(List list, List list2, VideoVersionPrioritySettings videoVersionPrioritySettings, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return compareMediaItemsByBestSourcePriority(list, list2, videoVersionPrioritySettings, z);
    }

    private static final int compareNullableLongAsc(Long l, Long l2) {
        if (l == null && l2 == null) {
            return 0;
        }
        if (l == null) {
            return 1;
        }
        if (l2 == null) {
            return -1;
        }
        return Intrinsics.compare(l.longValue(), l2.longValue());
    }

    private static final int compareNullableLongDesc(Long l, Long l2) {
        if (l == null && l2 == null) {
            return 0;
        }
        if (l == null) {
            return 1;
        }
        if (l2 == null) {
            return -1;
        }
        return Intrinsics.compare(l2.longValue(), l.longValue());
    }

    private static final int compareSourcesByRules(MediaSource mediaSource, MediaSource mediaSource2, List<VideoPriorityRule> list) {
        if (mediaSource == null && mediaSource2 == null) {
            return 0;
        }
        if (mediaSource == null) {
            return 1;
        }
        if (mediaSource2 == null) {
            return -1;
        }
        Iterator<VideoPriorityRule> it = list.iterator();
        while (it.hasNext()) {
            int iCompareByRule = compareByRule(mediaSource, mediaSource2, it.next());
            if (iCompareByRule != 0) {
                return iCompareByRule;
            }
        }
        return 0;
    }

    private static final boolean isHdr10PlusText(String str) {
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, "-", "", false, 4, (Object) null), "_", "", false, 4, (Object) null), " ", "", false, 4, (Object) null);
        return StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "hdr10plus", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "hdr10+", false, 2, (Object) null);
    }

    private static final boolean isHdr10Text(String str) {
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, "-", "", false, 4, (Object) null), "_", "", false, 4, (Object) null), " ", "", false, 4, (Object) null);
        return StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "hdr10", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "smpte2084", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "st2084", false, 2, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0017  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    private static final MediaSource mergeVersionPickerMediaSource(MediaSource mediaSource, MediaSource mediaSource2) {
        List<MediaStream> mediaStreams;
        if (mediaSource2 == null) {
            return mediaSource;
        }
        String name = mediaSource2.getName();
        if (name == null) {
            name = mediaSource.getName();
        } else {
            if (StringsKt.isBlank(name)) {
                name = null;
            }
            if (name == null) {
                name = mediaSource.getName();
            }
        }
        String str = name;
        String path = mediaSource.getPath();
        if (StringsKt.isBlank(path)) {
            path = null;
        }
        if (path == null) {
            path = mediaSource2.getPath();
        }
        String str2 = path;
        String container = mediaSource.getContainer();
        if (StringsKt.isBlank(container)) {
            container = null;
        }
        if (container == null) {
            container = mediaSource2.getContainer();
        }
        String str3 = container;
        Long size = mediaSource.getSize();
        if (size == null) {
            size = mediaSource2.getSize();
        }
        Long l = size;
        Long runTimeTicks = mediaSource.getRunTimeTicks();
        if (runTimeTicks == null) {
            runTimeTicks = mediaSource2.getRunTimeTicks();
        }
        Long l2 = runTimeTicks;
        Integer bitrate = mediaSource.getBitrate();
        if (bitrate == null) {
            bitrate = mediaSource2.getBitrate();
        }
        Integer num = bitrate;
        String videoType = mediaSource.getVideoType();
        if (videoType == null) {
            videoType = mediaSource2.getVideoType();
        }
        String str4 = videoType;
        boolean z = mediaSource.getSupportsDirectStream() || mediaSource2.getSupportsDirectStream();
        boolean z2 = mediaSource.getSupportsTranscoding() || mediaSource2.getSupportsTranscoding();
        List<MediaStream> mediaStreams2 = mediaSource.getMediaStreams();
        if (mediaStreams2 == null) {
            mediaStreams = mediaSource2.getMediaStreams();
        } else {
            mediaStreams = mediaStreams2.isEmpty() ? null : mediaStreams2;
            if (mediaStreams == null) {
                mediaStreams = mediaSource2.getMediaStreams();
            }
        }
        List<MediaStream> list = mediaStreams;
        String directStreamUrl = mediaSource.getDirectStreamUrl();
        if (directStreamUrl == null) {
            directStreamUrl = mediaSource2.getDirectStreamUrl();
        }
        String str5 = directStreamUrl;
        String transcodingUrl = mediaSource.getTranscodingUrl();
        if (transcodingUrl == null) {
            transcodingUrl = mediaSource2.getTranscodingUrl();
        }
        return MediaSource.copy$default(mediaSource, null, str, str2, str3, l, l2, num, str4, z, z2, list, str5, transcodingUrl, 1, null);
    }

    private static final String parseDolbyVisionProfile(String str) {
        List<String> groupValues;
        String str2;
        if (str != null && !StringsKt.isBlank(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Regex regex = new Regex("dovi\\s*profile\\s*(\\d+)");
            Regex regex2 = new Regex("profile\\s*(\\d+(?:\\.\\d+)?)");
            MatchResult matchResultFind$default = Regex.find$default(regex, lowerCase, 0, 2, null);
            if (matchResultFind$default == null) {
                matchResultFind$default = Regex.find$default(regex2, lowerCase, 0, 2, null);
            }
            String string = (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str2 = (String) CollectionsKt.getOrNull(groupValues, 1)) == null) ? null : StringsKt.trim((CharSequence) str2).toString();
            if (string == null) {
                string = "";
            }
            if (!StringsKt.isBlank(string)) {
                if (StringsKt__string.contains(".")) {
                    return "P".concat(string);
                }
                StringBuilder sb = new StringBuilder();
                int length = string.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = string.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string2 = sb.toString();
                if (string2.length() >= 2) {
                    return ll0.e("P", StringsKt.dropLast(string2, 1), ".", StringsKt.takeLast(string2, 1));
                }
            }
        }
        return null;
    }

    private static final int resolveFormatPriority(MediaSource mediaSource, VideoPriorityRule videoPriorityRule) {
        VideoQualityStandard videoQualityStandard;
        int i = WhenMappings.$EnumSwitchMapping$0[resolveVersionVideoFormat(mediaSource).ordinal()];
        if (i == 1) {
            videoQualityStandard = VideoQualityStandard.DOVI;
        } else if (i == 2) {
            videoQualityStandard = VideoQualityStandard.HDR;
        } else {
            if (i != 3) {
                qu.f();
                return 0;
            }
            videoQualityStandard = VideoQualityStandard.SDR;
        }
        VideoVersionPrioritySettings.Companion companion = VideoVersionPrioritySettings.INSTANCE;
        Map<VideoQualityStandard, Integer> qualityPriorities = videoPriorityRule.getQualityPriorities();
        if (qualityPriorities == null) {
            qualityPriorities = MapsKt.emptyMap();
        }
        Integer num = companion.normalizeQualityPriorities(qualityPriorities).get(videoQualityStandard);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    private static final Long resolveKnownVideoResolutionSortValue(MediaSource mediaSource) {
        Integer numValueOf = Integer.valueOf(VideoResolutionKt.resolveVideoResolutionSortValue(mediaSource));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return Long.valueOf(numValueOf.intValue());
        }
        return null;
    }

    private static final VersionVideoFormat resolveVersionVideoFormat(MediaSource mediaSource) {
        if (buildVideoTypeLabel(mediaSource) == null) {
            return VersionVideoFormat.SDR;
        }
        String strBuildVideoTypeLabel = buildVideoTypeLabel(mediaSource);
        if (strBuildVideoTypeLabel == null) {
            strBuildVideoTypeLabel = "";
        }
        if (StringsKt__StringsJVMKt.startsWith(strBuildVideoTypeLabel, "DOVI", true)) {
            return VersionVideoFormat.DOVI;
        }
        return StringsKt__StringsJVMKt.startsWith(strBuildVideoTypeLabel, "HDR", true) ? VersionVideoFormat.HDR : VersionVideoFormat.SDR;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.dh.myembyapp.data.model.MediaSourcePriorityKt$selectBestMediaSourceByPriority$$inlined$thenBy$2] */
    public static final MediaSource selectBestMediaSourceByPriority(List<MediaSource> list, VideoVersionPrioritySettings videoVersionPrioritySettings, boolean z) {
        list.getClass();
        videoVersionPrioritySettings.getClass();
        if (list.isEmpty()) {
            return null;
        }
        List<VideoPriorityRule> rules = videoVersionPrioritySettings.normalized().getRules();
        ArrayList arrayList = new ArrayList();
        for (Object obj : rules) {
            if (((VideoPriorityRule) obj).hasOrder()) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return (MediaSource) CollectionsKt.firstOrNull((List) sortMediaSourcesByPriority(list, videoVersionPrioritySettings));
        }
        if (!z) {
            return (MediaSource) CollectionsKt.firstOrNull((List) list);
        }
        final Comparator comparator = new Comparator() { // from class: com.dh.myembyapp.data.model.MediaSourcePriorityKt$selectBestMediaSourceByPriority$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Integer num = 0;
                Integer bitrate = ((MediaSource) t).getBitrate();
                if (bitrate == null) {
                    bitrate = num;
                }
                Integer bitrate2 = ((MediaSource) t2).getBitrate();
                return ComparisonsKt.compareValues(bitrate, bitrate2 != null ? bitrate2 : 0);
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.dh.myembyapp.data.model.MediaSourcePriorityKt$selectBestMediaSourceByPriority$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Long l = 0L;
                int iCompare = comparator.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Long size = ((MediaSource) t).getSize();
                if (size == null) {
                    size = l;
                }
                Long size2 = ((MediaSource) t2).getSize();
                return ComparisonsKt.compareValues(size, size2 != null ? size2 : 0L);
            }
        };
        return (MediaSource) CollectionsKt___CollectionsKt.maxWithOrNull(list, new Comparator() { // from class: com.dh.myembyapp.data.model.MediaSourcePriorityKt$selectBestMediaSourceByPriority$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Integer.valueOf(VideoResolutionKt.resolveVideoResolutionSortValue((MediaSource) t)), Integer.valueOf(VideoResolutionKt.resolveVideoResolutionSortValue((MediaSource) t2)));
            }
        });
    }

    public static /* synthetic */ MediaSource selectBestMediaSourceByPriority$default(List list, VideoVersionPrioritySettings videoVersionPrioritySettings, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return selectBestMediaSourceByPriority(list, videoVersionPrioritySettings, z);
    }

    public static final List<MediaSource> sortMediaSourcesByPriority(List<MediaSource> list, VideoVersionPrioritySettings videoVersionPrioritySettings) {
        list.getClass();
        videoVersionPrioritySettings.getClass();
        if (list.size() <= 1) {
            return list;
        }
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        for (MediaSource mediaSource : list) {
            if (hashSet.add(mediaSource.getId())) {
                arrayList.add(mediaSource);
            }
        }
        if (arrayList.size() > 1) {
            List<VideoPriorityRule> rules = videoVersionPrioritySettings.normalized().getRules();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : rules) {
                if (((VideoPriorityRule) obj).hasOrder()) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList3.add(TuplesKt.to(Integer.valueOf(i), (MediaSource) obj2));
                    i = i3;
                }
                List listSortedWith = CollectionsKt.sortedWith(arrayList3, new b5(7, new a5(arrayList2, 21)));
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
                Iterator it = listSortedWith.iterator();
                while (it.hasNext()) {
                    arrayList4.add((MediaSource) ((Pair) it.next()).getSecond());
                }
                return arrayList4;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortMediaSourcesByPriority$lambda$3(List list, Pair pair, Pair pair2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iCompareByRule = compareByRule((MediaSource) pair.getSecond(), (MediaSource) pair2.getSecond(), (VideoPriorityRule) it.next());
            if (iCompareByRule != 0) {
                return iCompareByRule;
            }
        }
        return Intrinsics.compare(((Number) pair.getFirst()).intValue(), ((Number) pair2.getFirst()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortMediaSourcesByPriority$lambda$4(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }
}
