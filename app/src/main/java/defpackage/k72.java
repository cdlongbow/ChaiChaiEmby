package defpackage;

import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k72 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[DarkThemeGlowPosition.values().length];
        try {
            iArr[DarkThemeGlowPosition.LEFT_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DarkThemeGlowPosition.CENTER_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DarkThemeGlowPosition.RIGHT_TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[LightThemeBackgroundStyle.values().length];
        try {
            iArr2[LightThemeBackgroundStyle.PLAIN_WHITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[LightThemeBackgroundStyle.MORNING_BLUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LightThemeBackgroundStyle.SAKURA_BLUSH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[LightThemeBackgroundStyle.IRIS_BREEZE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[LightThemeBackgroundStyle.SPRING_MINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[LightThemeBackgroundStyle.APRICOT_DAWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[LightThemeBackgroundStyle.CORAL_HAZE.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
