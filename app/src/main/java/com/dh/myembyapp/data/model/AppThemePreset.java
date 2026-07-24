package com.dh.myembyapp.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public enum AppThemePreset {
    DARK("dark", "深色", "黑色系背景，白色系文字，适合夜间和影院环境。"),
    LIGHT("light", "亮色", "白色系背景，黑色系文字，适合白天和高亮环境。");

    private final String description;
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
        public final AppThemePreset fromStorageValue(String value) {
            for (AppThemePreset appThemePreset : AppThemePreset.values()) {
                if (Intrinsics.areEqual(appThemePreset.getStorageValue(), value)) {
                    if (appThemePreset == null) {
                        return AppThemePreset.DARK;
                    }
                    return appThemePreset;
                }
            }
            appThemePreset = null;
            if (appThemePreset == null) {
                return AppThemePreset.DARK;
            }
            return appThemePreset;
        }

        private Companion() {
        }
    }

    AppThemePreset(String str, String str2, String str3) {
        this.storageValue = str;
        this.displayName = str2;
        this.description = str3;
    }

    public static EnumEntries<AppThemePreset> getEntries() {
        return $ENTRIES;
    }



}
