package com.dh.myembyapp.data.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/dh/myembyapp/data/model/AudioPrioritySortType;", "", "storageValue", "", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getStorageValue", "()Ljava/lang/String;", "getLabel", "LANGUAGE", "FORMAT", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum AudioPrioritySortType {
    LANGUAGE("language", "语言类型"),
    FORMAT("format", "音频格式");

    private final String label;
    private final String storageValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/dh/myembyapp/data/model/AudioPrioritySortType$Companion;", "", "<init>", "()V", "fromStorageValue", "Lcom/dh/myembyapp/data/model/AudioPrioritySortType;", "value", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
