package com.dh.myembyapp.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoQualityStandard {
    DOVI("DOVI"),
    HDR("HDR"),
    SDR("SDR");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final String label;

    VideoQualityStandard(String str) {
        this.label = str;
    }

    public static EnumEntries<VideoQualityStandard> getEntries() {
        return $ENTRIES;
    }

}
