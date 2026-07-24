package com.dh.myembyapp.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public enum PlayerFrameRateMatchingMode {
    SEAMLESS_ONLY("seamless_only", "自动模式", "原来的无感切换，仅在系统支持时才匹配刷新率。"),
    ALWAYS("always", "积极匹配", "优先按视频帧率切换显示模式，部分电视可能会黑屏 1-2 秒。");

    private final String description;
    private final String label;
    private final String storageValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

        public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlayerFrameRateMatchingMode fromStorageValue(String value) {
            PlayerFrameRateMatchingMode playerFrameRateMatchingMode = PlayerFrameRateMatchingMode.ALWAYS;
            if (Intrinsics.areEqual(value, playerFrameRateMatchingMode.getStorageValue())) {
                return playerFrameRateMatchingMode;
            }
            PlayerFrameRateMatchingMode playerFrameRateMatchingMode2 = PlayerFrameRateMatchingMode.SEAMLESS_ONLY;
            if (!Intrinsics.areEqual(value, playerFrameRateMatchingMode2.getStorageValue())) {
                Intrinsics.areEqual(value, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            }
            return playerFrameRateMatchingMode2;
        }

        private Companion() {
        }
    }

    PlayerFrameRateMatchingMode(String str, String str2, String str3) {
        this.storageValue = str;
        this.label = str2;
        this.description = str3;
    }

    public static EnumEntries<PlayerFrameRateMatchingMode> getEntries() {
        return $ENTRIES;
    }



}
