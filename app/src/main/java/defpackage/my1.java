package defpackage;

import com.dh.myembyapp.data.model.ServerPingStatus;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class my1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ServerPingStatus.values().length];
        try {
            iArr[ServerPingStatus.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServerPingStatus.MEASURING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ServerPingStatus.UNREACHABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ServerPingStatus.HTTP_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ServerPingStatus.GOOD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ServerPingStatus.NORMAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ServerPingStatus.WARNING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ServerPingStatus.HIGH.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ServerPingStatus.BAD.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
