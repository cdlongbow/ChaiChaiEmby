package defpackage;

import com.dh.myembyapp.data.VideoVersionMemory;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaSourcePriorityKt;
import com.dh.myembyapp.data.model.VideoPriorityRule;
import com.dh.myembyapp.data.model.VideoResolutionKt;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ee1 {
    public static final List a(List list, VideoVersionMemory videoVersionMemory) {
        String quality = videoVersionMemory.getQuality();
        if (quality == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(e((MediaSource) obj), quality)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List b(List list, VideoVersionMemory videoVersionMemory) {
        String quality = videoVersionMemory.getQuality();
        if (quality == null) {
            return CollectionsKt.emptyList();
        }
        Integer resolutionSortValue = videoVersionMemory.getResolutionSortValue();
        if (resolutionSortValue != null) {
            if (resolutionSortValue.intValue() <= 0) {
                resolutionSortValue = null;
            }
            if (resolutionSortValue != null) {
                int iIntValue = resolutionSortValue.intValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    MediaSource mediaSource = (MediaSource) obj;
                    if (Intrinsics.areEqual(e(mediaSource), quality) && VideoResolutionKt.resolveVideoResolutionSortValue(mediaSource) == iIntValue) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    public static final List c(List list, VideoVersionMemory videoVersionMemory) {
        Integer resolutionSortValue = videoVersionMemory.getResolutionSortValue();
        if (resolutionSortValue != null) {
            if (resolutionSortValue.intValue() <= 0) {
                resolutionSortValue = null;
            }
            if (resolutionSortValue != null) {
                int iIntValue = resolutionSortValue.intValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (VideoResolutionKt.resolveVideoResolutionSortValue((MediaSource) obj) == iIntValue) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.util.ArrayList] */
    public static final MediaSource d(List list, VideoVersionPrioritySettings videoVersionPrioritySettings, VideoVersionMemory videoVersionMemory) {
        MediaSource mediaSource;
        Object next;
        list.getClass();
        videoVersionPrioritySettings.getClass();
        if (videoVersionMemory != null && !list.isEmpty()) {
            String mediaSourceId = videoVersionMemory.getMediaSourceId();
            if (mediaSourceId != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((MediaSource) next).getId(), mediaSourceId));
                MediaSource mediaSource2 = (MediaSource) next;
                if (mediaSource2 != null) {
                    return mediaSource2;
                }
            }
            VideoVersionPrioritySettings videoVersionPrioritySettingsNormalized = videoVersionPrioritySettings.normalized();
            List listB = b(list, videoVersionMemory);
            if (!listB.isEmpty()) {
                List<MediaSource> listSortMediaSourcesByPriority = MediaSourcePriorityKt.sortMediaSourcesByPriority(listB, videoVersionPrioritySettingsNormalized);
                Integer stableMatchIndex = videoVersionMemory.getStableMatchIndex();
                if (stableMatchIndex != null) {
                    Integer num = stableMatchIndex.intValue() >= 0 ? stableMatchIndex : null;
                    if (num != null && (mediaSource = (MediaSource) CollectionsKt.getOrNull(listSortMediaSourcesByPriority, num.intValue())) != null) {
                        return mediaSource;
                    }
                }
                return (MediaSource) CollectionsKt.firstOrNull((List) listSortMediaSourcesByPriority);
            }
            List<VideoPriorityRule> rules = videoVersionPrioritySettingsNormalized.getRules();
            ArrayList arrayList = new ArrayList();
            for (Object obj : rules) {
                if (((VideoPriorityRule) obj).hasOrder()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                List listC = c(list, videoVersionMemory);
                if (listC.isEmpty()) {
                    listC = null;
                }
                if (listC != null) {
                    return (MediaSource) CollectionsKt.firstOrNull((List) MediaSourcePriorityKt.sortMediaSourcesByPriority(listC, videoVersionPrioritySettingsNormalized));
                }
                List listA = a(list, videoVersionMemory);
                if (listA.isEmpty()) {
                    listA = null;
                }
                if (listA != null) {
                    return (MediaSource) CollectionsKt.firstOrNull((List) MediaSourcePriorityKt.sortMediaSourcesByPriority(listA, videoVersionPrioritySettingsNormalized));
                }
            } else {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = list;
                int size = arrayList.size();
                boolean z = false;
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    int i2 = de1.$EnumSwitchMapping$0[((VideoPriorityRule) obj2).getSortType().ordinal()];
                    if (i2 == 1) {
                        String quality = videoVersionMemory.getQuality();
                        if (quality != null) {
                            Iterable iterable = (Iterable) objectRef.element;
                            Object arrayList2 = new ArrayList();
                            for (Object obj3 : iterable) {
                                if (Intrinsics.areEqual(e((MediaSource) obj3), quality)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            objectRef.element = arrayList2;
                            z = true;
                        }
                    } else if (i2 == 2) {
                        Integer resolutionSortValue = videoVersionMemory.getResolutionSortValue();
                        if (resolutionSortValue != null) {
                            if (resolutionSortValue.intValue() <= 0) {
                                resolutionSortValue = null;
                            }
                            if (resolutionSortValue != null) {
                                int iIntValue = resolutionSortValue.intValue();
                                Iterable iterable2 = (Iterable) objectRef.element;
                                Object arrayList3 = new ArrayList();
                                for (Object obj4 : iterable2) {
                                    if (VideoResolutionKt.resolveVideoResolutionSortValue((MediaSource) obj4) == iIntValue) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                objectRef.element = arrayList3;
                                z = true;
                            }
                        }
                    } else if (i2 != 3 && i2 != 4 && i2 != 5) {
                        qu.f();
                        return null;
                    }
                }
                List listEmptyList = z ? (List) objectRef.element : CollectionsKt.emptyList();
                if (!listEmptyList.isEmpty()) {
                    return (MediaSource) CollectionsKt.firstOrNull((List) MediaSourcePriorityKt.sortMediaSourcesByPriority(listEmptyList, videoVersionPrioritySettingsNormalized));
                }
            }
        }
        return null;
    }

    public static final String e(MediaSource mediaSource) {
        String strBuildVideoTypeLabel = MediaSourcePriorityKt.buildVideoTypeLabel(mediaSource);
        if (strBuildVideoTypeLabel == null) {
            return null;
        }
        String upperCase = strBuildVideoTypeLabel.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (StringsKt__StringsJVMKt.startsWith$default(upperCase, "DOVI", false, 2, null)) {
            return "DOVI";
        }
        if (StringsKt__StringsJVMKt.startsWith$default(upperCase, "HDR", false, 2, null)) {
            return "HDR";
        }
        return StringsKt__StringsJVMKt.startsWith$default(upperCase, "SDR", false, 2, null) ? "SDR" : upperCase;
    }
}
