package com.dh.myembyapp.data.model;

import defpackage.qu;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoValueSortDirection {
    DESCENDING,
    ASCENDING;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoValueSortDirection.values().length];
            try {
                iArr[VideoValueSortDirection.DESCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoValueSortDirection.ASCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<VideoValueSortDirection> getEntries() {
        return $ENTRIES;
    }

    public final String getLabel() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "大 -> 小";
        }
        if (i == 2) {
            return "小 -> 大";
        }
        qu.f();
        return null;
    }
}
