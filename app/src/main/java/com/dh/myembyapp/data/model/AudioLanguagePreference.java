package com.dh.myembyapp.data.model;

import androidx.core.text.util.LocalePreferences;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/dh/myembyapp/data/model/AudioLanguagePreference;", "", "storageValue", "", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getStorageValue", "()Ljava/lang/String;", "getLabel", "DEFAULT", "CHINESE", "ENGLISH", "KOREAN", "JAPANESE", "CANTONESE", "FRENCH", "GERMAN", "SPANISH", "RUSSIAN", "ITALIAN", "THAI", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/dh/myembyapp/data/model/AudioLanguagePreference$Companion;", "", "<init>", "()V", "fromStorageValue", "Lcom/dh/myembyapp/data/model/AudioLanguagePreference;", "value", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
