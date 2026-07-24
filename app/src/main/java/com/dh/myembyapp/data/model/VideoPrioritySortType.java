package com.dh.myembyapp.data.model;

import defpackage.qu;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoPrioritySortType {
    NONE,
    QUALITY,
    BITRATE,
    FILE_SIZE,
    RESOLUTION;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPrioritySortType.values().length];
            try {
                iArr[VideoPrioritySortType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPrioritySortType.QUALITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPrioritySortType.BITRATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoPrioritySortType.FILE_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoPrioritySortType.RESOLUTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<VideoPrioritySortType> getEntries() {
        return $ENTRIES;
    }

    public final String getLabel() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "空";
        }
        if (i == 2) {
            return "画质标准";
        }
        if (i == 3) {
            return "码率大小";
        }
        if (i == 4) {
            return "文件大小";
        }
        if (i == 5) {
            return "分辨率大小";
        }
        qu.f();
        return null;
    }
}
