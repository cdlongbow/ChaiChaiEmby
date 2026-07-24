package com.dh.myembyapp.data.model;

import defpackage.qu;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
public enum VideoResolution {
    UHD_4K(2160, "4K", "4K"),
    QHD_2K(1440, "2K", "2K"),
    FULL_HD_1080(1080, "1080p", "1080P"),
    HD_720(720, "720p", "720P"),
    SD_480(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, "480p", "480P");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int sortValue;
    private final String standardLabel;
    private final String uppercaseLabel;

        public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolutionLabelStyle.values().length];
            try {
                iArr[ResolutionLabelStyle.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolutionLabelStyle.UPPERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    VideoResolution(int i, String str, String str2) {
        this.sortValue = i;
        this.standardLabel = str;
        this.uppercaseLabel = str2;
    }

    public static EnumEntries<VideoResolution> getEntries() {
        return $ENTRIES;
    }


    public final String label(ResolutionLabelStyle style) {
        style.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1) {
            return this.standardLabel;
        }
        if (i == 2) {
            return this.uppercaseLabel;
        }
        qu.f();
        return null;
    }
}
