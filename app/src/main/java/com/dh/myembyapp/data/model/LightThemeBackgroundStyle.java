package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/dh/myembyapp/data/model/LightThemeBackgroundStyle;", "", "storageValue", "", "displayName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getStorageValue", "()Ljava/lang/String;", "getDisplayName", "PLAIN_WHITE", "MORNING_BLUE", "SAKURA_BLUSH", "IRIS_BREEZE", "SPRING_MINT", "APRICOT_DAWN", "CORAL_HAZE", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/dh/myembyapp/data/model/LightThemeBackgroundStyle$Companion;", "", "<init>", "()V", "fromStorageValue", "Lcom/dh/myembyapp/data/model/LightThemeBackgroundStyle;", "value", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
