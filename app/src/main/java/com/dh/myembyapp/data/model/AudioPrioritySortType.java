package com.dh.myembyapp.data.model;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioPrioritySortType {
    LANGUAGE("language", "语言类型"),
    FORMAT("format", "音频格式");

    private final String label;
    private final String storageValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

        public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AudioPrioritySortType fromStorageValue(String value) {
            AudioPrioritySortType next;
            Iterator<AudioPrioritySortType> it = AudioPrioritySortType.getEntries().iterator();
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

    AudioPrioritySortType(String str, String str2) {
        this.storageValue = str;
        this.label = str2;
    }

    public static EnumEntries<AudioPrioritySortType> getEntries() {
        return $ENTRIES;
    }


}
