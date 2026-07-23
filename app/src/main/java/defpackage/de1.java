package defpackage;

import com.dh.myembyapp.data.model.VideoPrioritySortType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class de1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VideoPrioritySortType.values().length];
        try {
            iArr[VideoPrioritySortType.QUALITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoPrioritySortType.RESOLUTION.ordinal()] = 2;
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
            iArr[VideoPrioritySortType.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
