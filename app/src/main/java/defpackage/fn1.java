package defpackage;

import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class fn1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PlayerFrameRateMatchingMode.values().length];
        try {
            iArr[PlayerFrameRateMatchingMode.SEAMLESS_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerFrameRateMatchingMode.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
