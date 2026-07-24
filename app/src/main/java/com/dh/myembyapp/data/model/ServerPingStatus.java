package com.dh.myembyapp.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
public enum ServerPingStatus {
    IDLE,
    MEASURING,
    GOOD,
    NORMAL,
    WARNING,
    HIGH,
    BAD,
    HTTP_ERROR,
    UNREACHABLE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    public static EnumEntries<ServerPingStatus> getEntries() {
        return $ENTRIES;
    }
}
