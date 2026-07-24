package com.dh.myembyapp.data.model;

import androidx.core.text.util.LocalePreferences;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public enum SubtitleLanguagePriorityType {
    SIMPLIFIED_CHINESE("simplified_chinese", "简体中文", 1),
    SIMPLIFIED_CHINESE_BILINGUAL("simplified_chinese_bilingual", "简体中文双语", 2),
    CHINESE(LocalePreferences.CalendarType.CHINESE, "中文", 3),
    CHINESE_BILINGUAL("chinese_bilingual", "中文双语", 4),
    TRADITIONAL_CHINESE("traditional_chinese", "繁体中文", 5),
    TRADITIONAL_CHINESE_BILINGUAL("traditional_chinese_bilingual", "繁体中文双语", 6),
    ENGLISH("english", "英文", 7),
    JAPANESE("japanese", "日文", 7),
    KOREAN("korean", "韩文", 7),
    OTHER("other", "其他", 8);

    private final int defaultPriority;
    private final String label;
    private final String storageValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

        public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SubtitleLanguagePriorityType fromStorageValue(String value) {
            SubtitleLanguagePriorityType next;
            Iterator<SubtitleLanguagePriorityType> it = SubtitleLanguagePriorityType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.getStorageValue(), value)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    SubtitleLanguagePriorityType(String str, String str2, int i) {
        this.storageValue = str;
        this.label = str2;
        this.defaultPriority = i;
    }

    public static EnumEntries<SubtitleLanguagePriorityType> getEntries() {
        return $ENTRIES;
    }



}
