package com.dh.myembyapp.data.model;

import defpackage.qu;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\r"}, d2 = {"Lcom/dh/myembyapp/data/model/VideoPrioritySortType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "QUALITY", "BITRATE", "FILE_SIZE", "RESOLUTION", "label", "", "getLabel", "()Ljava/lang/String;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum VideoPrioritySortType {
    NONE,
    QUALITY,
    BITRATE,
    FILE_SIZE,
    RESOLUTION;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
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
