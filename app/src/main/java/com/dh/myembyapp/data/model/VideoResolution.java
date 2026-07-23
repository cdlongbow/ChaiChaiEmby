package com.dh.myembyapp.data.model;

import defpackage.qu;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0013"}, d2 = {"Lcom/dh/myembyapp/data/model/VideoResolution;", "", "sortValue", "", "standardLabel", "", "uppercaseLabel", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getSortValue", "()I", "UHD_4K", "QHD_2K", "FULL_HD_1080", "HD_720", "SD_480", "label", "style", "Lcom/dh/myembyapp/data/model/ResolutionLabelStyle;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
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
