package defpackage;

import com.dh.myembyapp.data.model.AppThemePreset;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class u72 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AppThemePreset.values().length];
        try {
            iArr[AppThemePreset.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppThemePreset.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
