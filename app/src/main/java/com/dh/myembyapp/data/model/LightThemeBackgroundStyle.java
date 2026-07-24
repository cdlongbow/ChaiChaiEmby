package com.dh.myembyapp.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public enum LightThemeBackgroundStyle {
    PLAIN_WHITE("plain_white", "素白"),
    MORNING_BLUE("morning_blue", "晨雾蔚蓝"),
    SAKURA_BLUSH("sakura_blush", "樱语柔粉"),
    IRIS_BREEZE("iris_breeze", "鸢尾晴岚"),
    SPRING_MINT("spring_mint", "春芽薄荷"),
    APRICOT_DAWN("apricot_dawn", "杏霞晨光"),
    CORAL_HAZE("coral_haze", "珊瑚轻霞");

    private final String displayName;
    private final String storageValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

        public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        public final LightThemeBackgroundStyle fromStorageValue(String value) {
            for (LightThemeBackgroundStyle lightThemeBackgroundStyle : LightThemeBackgroundStyle.values()) {
                if (Intrinsics.areEqual(lightThemeBackgroundStyle.getStorageValue(), value)) {
                    if (lightThemeBackgroundStyle == null) {
                        return LightThemeBackgroundStyle.PLAIN_WHITE;
                    }
                    return lightThemeBackgroundStyle;
                }
            }
            lightThemeBackgroundStyle = null;
            if (lightThemeBackgroundStyle == null) {
                return LightThemeBackgroundStyle.PLAIN_WHITE;
            }
            return lightThemeBackgroundStyle;
        }

        private Companion() {
        }
    }

    LightThemeBackgroundStyle(String str, String str2) {
        this.storageValue = str;
        this.displayName = str2;
    }

    public static EnumEntries<LightThemeBackgroundStyle> getEntries() {
        return $ENTRIES;
    }


}
