package defpackage;

import com.dh.myembyapp.data.model.AudioCodecPriorityType;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class s90 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[AudioPrioritySortType.values().length];
        try {
            iArr[AudioPrioritySortType.LANGUAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudioPrioritySortType.FORMAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[AudioCodecPriorityType.values().length];
        try {
            iArr2[AudioCodecPriorityType.AAC.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[AudioCodecPriorityType.AC3.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AudioCodecPriorityType.EAC3.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AudioCodecPriorityType.DTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AudioCodecPriorityType.TRUEHD.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[AudioCodecPriorityType.FLAC.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[AudioCodecPriorityType.OTHER.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[SubtitlePrioritySortType.values().length];
        try {
            iArr3[SubtitlePrioritySortType.LANGUAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[SubtitlePrioritySortType.FORMAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[v51.values().length];
        try {
            v51 v51Var = v51.a;
            iArr4[0] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            v51 v51Var2 = v51.a;
            iArr4[1] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            v51 v51Var3 = v51.a;
            iArr4[2] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        $EnumSwitchMapping$3 = iArr4;
    }
}
