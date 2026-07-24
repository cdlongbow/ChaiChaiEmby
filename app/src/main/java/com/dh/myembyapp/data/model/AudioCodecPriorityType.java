package com.dh.myembyapp.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
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
