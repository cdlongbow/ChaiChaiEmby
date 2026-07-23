package defpackage;

import com.dh.myembyapp.data.AudioTrackMemory;
import com.dh.myembyapp.data.model.AudioCodecPriorityType;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tg {
    public static final String a(String str) {
        String strReplace;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase != null && (strReplace = new Regex("[^a-z0-9\\u4e00-\\u9fa5]+").replace(lowerCase, "")) != null && !StringsKt.isBlank(strReplace)) {
                return strReplace;
            }
        }
        return null;
    }

    public static final int b(AudioCodecPriorityType audioCodecPriorityType, AudioVersionPrioritySettings audioVersionPrioritySettings) {
        switch (sg.$EnumSwitchMapping$1[audioCodecPriorityType.ordinal()]) {
            case 1:
                return audioVersionPrioritySettings.getAacPriority();
            case 2:
                return audioVersionPrioritySettings.getAc3Priority();
            case 3:
                return audioVersionPrioritySettings.getEac3Priority();
            case 4:
                return audioVersionPrioritySettings.getDtsPriority();
            case 5:
                return audioVersionPrioritySettings.getTruehdPriority();
            case 6:
                return audioVersionPrioritySettings.getFlacPriority();
            case 7:
                return 7;
            default:
                qu.f();
                return 0;
        }
    }

    public static final Object c(ArrayList arrayList, AudioTrackMemory audioTrackMemory, AudioVersionPrioritySettings audioVersionPrioritySettings) {
        boolean z;
        String codecType;
        ArrayList arrayList2;
        Object obj;
        Object obj2;
        audioVersionPrioritySettings.getClass();
        if (audioTrackMemory != null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                if (((rg) obj3).b) {
                    arrayList3.add(obj3);
                }
            }
            if (!arrayList3.isEmpty()) {
                if (audioTrackMemory.getItemId() != null && audioTrackMemory.getApiStreamIndex() != null) {
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            obj = null;
                            break;
                        }
                        obj = arrayList3.get(i3);
                        i3++;
                        Integer num = ((rg) obj).c;
                        int iIntValue = audioTrackMemory.getApiStreamIndex().intValue();
                        if (num != null && num.intValue() == iIntValue) {
                            break;
                        }
                    }
                    rg rgVar = (rg) obj;
                    if (rgVar != null && (obj2 = rgVar.a) != null) {
                        return obj2;
                    }
                }
                AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized = audioVersionPrioritySettings.normalized();
                boolean zHasDistinctFormatPriorities = AudioVersionPrioritySettings.INSTANCE.hasDistinctFormatPriorities(audioVersionPrioritySettingsNormalized);
                String strA = a(audioTrackMemory.getTitleKey());
                if (strA != null) {
                    ArrayList arrayList4 = new ArrayList();
                    int size3 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj4 = arrayList3.get(i4);
                        i4++;
                        if (Intrinsics.areEqual(((rg) obj4).g, strA)) {
                            arrayList4.add(obj4);
                        }
                    }
                    boolean zIsEmpty = arrayList4.isEmpty();
                    z = !zIsEmpty;
                    if (!zIsEmpty) {
                        arrayList3 = arrayList4;
                    }
                } else {
                    z = false;
                }
                Integer channelCount = audioTrackMemory.getChannelCount();
                if (channelCount != null) {
                    if (channelCount.intValue() <= 0) {
                        channelCount = null;
                    }
                    if (channelCount != null) {
                        int iIntValue2 = channelCount.intValue();
                        ArrayList arrayList5 = new ArrayList();
                        int size4 = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size4) {
                            Object obj5 = arrayList3.get(i5);
                            i5++;
                            Integer num2 = ((rg) obj5).f;
                            if (num2 != null && num2.intValue() == iIntValue2) {
                                arrayList5.add(obj5);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            z = true;
                            arrayList3 = arrayList5;
                        }
                    }
                }
                Iterator<T> it = audioVersionPrioritySettingsNormalized.getSortTypes().iterator();
                while (it.hasNext()) {
                    int i6 = sg.$EnumSwitchMapping$0[((AudioPrioritySortType) it.next()).ordinal()];
                    if (i6 == 1) {
                        AudioLanguagePreference audioLanguagePreferenceFromStorageValue = AudioLanguagePreference.INSTANCE.fromStorageValue(audioTrackMemory.getLanguagePreference());
                        if (audioLanguagePreferenceFromStorageValue == AudioLanguagePreference.DEFAULT) {
                            audioLanguagePreferenceFromStorageValue = null;
                        }
                        if (audioLanguagePreferenceFromStorageValue != null) {
                            arrayList2 = new ArrayList();
                            int size5 = arrayList3.size();
                            int i7 = 0;
                            while (i7 < size5) {
                                Object obj6 = arrayList3.get(i7);
                                i7++;
                                if (((rg) obj6).d == audioLanguagePreferenceFromStorageValue) {
                                    arrayList2.add(obj6);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                z = true;
                                arrayList3 = arrayList2;
                            }
                        }
                    } else {
                        if (i6 != 2) {
                            qu.f();
                            return null;
                        }
                        if (zHasDistinctFormatPriorities && (codecType = audioTrackMemory.getCodecType()) != null) {
                            if (StringsKt.isBlank(codecType)) {
                                codecType = null;
                            }
                            if (codecType != null) {
                                arrayList2 = new ArrayList();
                                int size6 = arrayList3.size();
                                int i8 = 0;
                                while (i8 < size6) {
                                    Object obj7 = arrayList3.get(i8);
                                    i8++;
                                    if (Intrinsics.areEqual(((rg) obj7).e.name(), codecType)) {
                                        arrayList2.add(obj7);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    z = true;
                                    arrayList3 = arrayList2;
                                }
                            }
                        }
                    }
                }
                if (z) {
                    Integer apiStreamIndex = audioTrackMemory.getApiStreamIndex();
                    if (arrayList3.size() > 1) {
                        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                        int size7 = arrayList3.size();
                        int i9 = 0;
                        while (i9 < size7) {
                            Object obj8 = arrayList3.get(i9);
                            i9++;
                            int i10 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            arrayList6.add(TuplesKt.to(Integer.valueOf(i), (rg) obj8));
                            i = i10;
                        }
                        List listSortedWith = CollectionsKt.sortedWith(arrayList6, new b5(3, new a2(6, audioVersionPrioritySettingsNormalized, apiStreamIndex)));
                        arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
                        Iterator it2 = listSortedWith.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add((rg) ((Pair) it2.next()).getSecond());
                        }
                    }
                    rg rgVar2 = (rg) CollectionsKt.firstOrNull((List) arrayList3);
                    if (rgVar2 != null) {
                        return rgVar2.a;
                    }
                }
            }
        }
        return null;
    }
}
