package com.dh.myembyapp.data.model;

import androidx.core.text.util.LocalePreferences;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/dh/myembyapp/data/model/SubtitleLanguagePriorityType;", "", "storageValue", "", "label", "defaultPriority", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getStorageValue", "()Ljava/lang/String;", "getLabel", "getDefaultPriority", "()I", "SIMPLIFIED_CHINESE", "SIMPLIFIED_CHINESE_BILINGUAL", "CHINESE", "CHINESE_BILINGUAL", "TRADITIONAL_CHINESE", "TRADITIONAL_CHINESE_BILINGUAL", "ENGLISH", "JAPANESE", "KOREAN", "OTHER", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/dh/myembyapp/data/model/SubtitleLanguagePriorityType$Companion;", "", "<init>", "()V", "fromStorageValue", "Lcom/dh/myembyapp/data/model/SubtitleLanguagePriorityType;", "value", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
