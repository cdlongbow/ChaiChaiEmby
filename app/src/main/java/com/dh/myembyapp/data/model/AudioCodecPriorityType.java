package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/dh/myembyapp/data/model/AudioCodecPriorityType;", "", "<init>", "(Ljava/lang/String;I)V", "AAC", "AC3", "EAC3", "DTS", "TRUEHD", "FLAC", "OTHER", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum AudioCodecPriorityType {
    AAC,
    AC3,
    EAC3,
    DTS,
    TRUEHD,
    FLAC,
    OTHER;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    public static EnumEntries<AudioCodecPriorityType> getEntries() {
        return $ENTRIES;
    }
}
