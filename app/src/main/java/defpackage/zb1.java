package defpackage;

import com.dh.myembyapp.data.model.SystemTimeDisplayMode;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class zb1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SystemTimeDisplayMode.values().length];
        try {
            iArr[SystemTimeDisplayMode.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SystemTimeDisplayMode.MENU_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SystemTimeDisplayMode.ALWAYS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
