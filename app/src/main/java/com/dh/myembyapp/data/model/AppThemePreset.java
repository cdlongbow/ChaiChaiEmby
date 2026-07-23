package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/dh/myembyapp/data/model/AppThemePreset;", "", "storageValue", "", "displayName", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStorageValue", "()Ljava/lang/String;", "getDisplayName", "getDescription", "DARK", "LIGHT", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum AppThemePreset {
    DARK("dark", "深色", "黑色系背景，白色系文字，适合夜间和影院环境。"),
    LIGHT("light", "亮色", "白色系背景，黑色系文字，适合白天和高亮环境。");

    private final String description;
    private final String displayName;
    private final String storageValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/dh/myembyapp/data/model/AppThemePreset$Companion;", "", "<init>", "()V", "fromStorageValue", "Lcom/dh/myembyapp/data/model/AppThemePreset;", "value", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
