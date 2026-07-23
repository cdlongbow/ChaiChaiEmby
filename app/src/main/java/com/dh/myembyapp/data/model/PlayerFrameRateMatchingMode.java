package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/dh/myembyapp/data/model/PlayerFrameRateMatchingMode;", "", "storageValue", "", "label", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStorageValue", "()Ljava/lang/String;", "getLabel", "getDescription", "SEAMLESS_ONLY", "ALWAYS", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum PlayerFrameRateMatchingMode {
    SEAMLESS_ONLY("seamless_only", "自动模式", "原来的无感切换，仅在系统支持时才匹配刷新率。"),
    ALWAYS("always", "积极匹配", "优先按视频帧率切换显示模式，部分电视可能会黑屏 1-2 秒。");

    private final String description;
    private final String label;
    private final String storageValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/dh/myembyapp/data/model/PlayerFrameRateMatchingMode$Companion;", "", "<init>", "()V", "fromStorageValue", "Lcom/dh/myembyapp/data/model/PlayerFrameRateMatchingMode;", "value", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
