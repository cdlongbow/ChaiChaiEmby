package defpackage;

import com.dh.myembyapp.data.model.AudioCodecPriorityType;
import com.dh.myembyapp.data.model.AudioPrioritySortType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class sg {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
    }
}
