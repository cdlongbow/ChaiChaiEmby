package com.dh.myembyapp.data.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/dh/myembyapp/data/model/PlayerDefaultViewMode;", "", "storageValue", "", "label", "description", "useTextureView", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getStorageValue", "()Ljava/lang/String;", "getLabel", "getDescription", "getUseTextureView", "()Z", "SURFACE", "TEXTURE", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum PlayerDefaultViewMode {
    SURFACE("surface", "SurfaceView", "更省资源，保持现有默认行为，但部分厂商设备兼容性一般。", false),
    TEXTURE("texture", "TextureView", "兼容性通常更好，能绕开部分电视的 SurfaceView 合成问题。", true);

    private final String description;
    private final String label;
    private final String storageValue;
    private final boolean useTextureView;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

        public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlayerDefaultViewMode fromStorageValue(String value) {
            PlayerDefaultViewMode playerDefaultViewMode = PlayerDefaultViewMode.TEXTURE;
            if (Intrinsics.areEqual(value, playerDefaultViewMode.getStorageValue())) {
                return playerDefaultViewMode;
            }
            PlayerDefaultViewMode playerDefaultViewMode2 = PlayerDefaultViewMode.SURFACE;
            Intrinsics.areEqual(value, playerDefaultViewMode2.getStorageValue());
            return playerDefaultViewMode2;
        }

        private Companion() {
        }
    }

    PlayerDefaultViewMode(String str, String str2, String str3, boolean z) {
        this.storageValue = str;
        this.label = str2;
        this.description = str3;
        this.useTextureView = z;
    }

    public static EnumEntries<PlayerDefaultViewMode> getEntries() {
        return $ENTRIES;
    }




}
