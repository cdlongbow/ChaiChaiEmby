package com.dh.myembyapp.data.model;

import androidx.core.text.util.LocalePreferences;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioLanguagePreference {
    DEFAULT("default", "默认"),
    CHINESE(LocalePreferences.CalendarType.CHINESE, "中文"),
    ENGLISH("english", "英语"),
    KOREAN("korean", "韩语"),
    JAPANESE("japanese", "日语"),
    CANTONESE("cantonese", "粤语"),
    FRENCH("french", "法语"),
    GERMAN("german", "德语"),
    SPANISH("spanish", "西班牙语"),
    RUSSIAN("russian", "俄语"),
    ITALIAN("italian", "意大利语"),
    THAI("thai", "泰语");

    private final String label;
    private final String storageValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

        public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AudioLanguagePreference fromStorageValue(String value) {
            AudioLanguagePreference next;
            Iterator<AudioLanguagePreference> it = AudioLanguagePreference.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.getStorageValue(), value));
            AudioLanguagePreference audioLanguagePreference = next;
            return audioLanguagePreference == null ? AudioLanguagePreference.DEFAULT : audioLanguagePreference;
        }

        private Companion() {
        }
    }

    AudioLanguagePreference(String str, String str2) {
        this.storageValue = str;
        this.label = str2;
    }

    public static EnumEntries<AudioLanguagePreference> getEntries() {
        return $ENTRIES;
    }


}
