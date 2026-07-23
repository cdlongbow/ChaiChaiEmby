package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEFAULT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bBE\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lcom/dh/myembyapp/data/model/PlayerResizeMode;", "", "storageValue", "", "label", "description", "media3ResizeMode", "", "exoVideoScalingMode", "useTextureView", "", "useSurfaceCropTransform", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZ)V", "getStorageValue", "()Ljava/lang/String;", "getLabel", "getDescription", "getMedia3ResizeMode", "()I", "getExoVideoScalingMode", "getUseTextureView", "()Z", "getUseSurfaceCropTransform", "DEFAULT", "STRETCH", "CROP", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayerResizeMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PlayerResizeMode[] $VALUES;
    public static final PlayerResizeMode CROP = new PlayerResizeMode("CROP", 2, "crop", "裁切", "保持比例铺满屏幕，超出的边缘会被裁掉", 0, 1, true, true);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PlayerResizeMode DEFAULT;
    public static final PlayerResizeMode STRETCH;
    private final String description;
    private final int exoVideoScalingMode;
    private final String label;
    private final int media3ResizeMode;
    private final String storageValue;
    private final boolean useSurfaceCropTransform;
    private final boolean useTextureView;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/dh/myembyapp/data/model/PlayerResizeMode$Companion;", "", "<init>", "()V", "fromStorageValue", "Lcom/dh/myembyapp/data/model/PlayerResizeMode;", "value", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        public final PlayerResizeMode fromStorageValue(String value) {
            for (PlayerResizeMode playerResizeMode : PlayerResizeMode.values()) {
                if (Intrinsics.areEqual(playerResizeMode.getStorageValue(), value)) {
                    if (playerResizeMode == null) {
                        return PlayerResizeMode.DEFAULT;
                    }
                    return playerResizeMode;
                }
            }
            playerResizeMode = null;
            if (playerResizeMode == null) {
                return PlayerResizeMode.DEFAULT;
            }
            return playerResizeMode;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlayerResizeMode[] $values() {
        return new PlayerResizeMode[]{DEFAULT, STRETCH, CROP};
    }

    static {
        boolean z = false;
        DEFAULT = new PlayerResizeMode("DEFAULT", 0, "default", "默认", "保持原始比例，必要时显示黑边", 0, 1, false, z, 96, null);
        STRETCH = new PlayerResizeMode("STRETCH", 1, "stretch", "拉伸", "铺满整个屏幕，可能会拉伸变形", 3, 1, z, false, 96, null);
        PlayerResizeMode[] playerResizeModeArr$values = $values();
        $VALUES = playerResizeModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(playerResizeModeArr$values);
        INSTANCE = new Companion(null);
    }

    private PlayerResizeMode(String str, int i, String str2, String str3, String str4, int i2, int i3, boolean z, boolean z2) {
        super(str, i);
        this.storageValue = str2;
        this.label = str3;
        this.description = str4;
        this.media3ResizeMode = i2;
        this.exoVideoScalingMode = i3;
        this.useTextureView = z;
        this.useSurfaceCropTransform = z2;
    }

    public static EnumEntries<PlayerResizeMode> getEntries() {
        return $ENTRIES;
    }

    public static PlayerResizeMode valueOf(String str) {
        return (PlayerResizeMode) Enum.valueOf(PlayerResizeMode.class, str);
    }

    public static PlayerResizeMode[] values() {
        return (PlayerResizeMode[]) $VALUES.clone();
    }








    public /* synthetic */ PlayerResizeMode(String str, int i, String str2, String str3, String str4, int i2, int i3, boolean z, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, i2, i3, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? false : z2);
    }
}
