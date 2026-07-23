package defpackage;

import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.VideoPrioritySortType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class bc1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[VideoPrioritySortType.values().length];
        try {
            iArr[VideoPrioritySortType.QUALITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoPrioritySortType.BITRATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoPrioritySortType.FILE_SIZE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VideoPrioritySortType.RESOLUTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[VideoPrioritySortType.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[AudioPrioritySortType.values().length];
        try {
            iArr2[AudioPrioritySortType.LANGUAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AudioPrioritySortType.FORMAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[xf.values().length];
        try {
            xf[] xfVarArr = xf.b;
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            xf[] xfVarArr2 = xf.b;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            xf[] xfVarArr3 = xf.b;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            xf[] xfVarArr4 = xf.b;
            iArr3[3] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            xf[] xfVarArr5 = xf.b;
            iArr3[4] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            xf[] xfVarArr6 = xf.b;
            iArr3[5] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[SubtitlePrioritySortType.values().length];
        try {
            iArr4[SubtitlePrioritySortType.LANGUAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[SubtitlePrioritySortType.FORMAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        $EnumSwitchMapping$3 = iArr4;
    }
}
