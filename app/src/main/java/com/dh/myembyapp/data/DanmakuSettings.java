package com.dh.myembyapp.data;

import defpackage.i9;
import defpackage.qi0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0014\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006%"}, d2 = {"Lcom/dh/myembyapp/data/DanmakuSettings;", "", "speed", "", "size", "opacity", "", "screenPart", "timeOffsetSec", "showTopDanmaku", "", "showBottomDanmaku", "<init>", "(FFIFIZZ)V", "getSpeed", "()F", "getSize", "getOpacity", "()I", "getScreenPart", "getTimeOffsetSec", "getShowTopDanmaku", "()Z", "getShowBottomDanmaku", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuSettings {
    public static final int $stable = 0;
    private final int opacity;
    private final float screenPart;
    private final boolean showBottomDanmaku;
    private final boolean showTopDanmaku;
    private final float size;
    private final float speed;
    private final int timeOffsetSec;

    public /* synthetic */ DanmakuSettings(float f, float f2, int i, float f3, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1.0f : f, (i3 & 2) != 0 ? 1.0f : f2, (i3 & 4) != 0 ? 100 : i, (i3 & 8) != 0 ? 1.0f : f3, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? true : z, (i3 & 64) != 0 ? false : z2);
    }

    public static /* synthetic */ DanmakuSettings copy$default(DanmakuSettings danmakuSettings, float f, float f2, int i, float f3, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = danmakuSettings.speed;
        }
        if ((i3 & 2) != 0) {
            f2 = danmakuSettings.size;
        }
        if ((i3 & 4) != 0) {
            i = danmakuSettings.opacity;
        }
        if ((i3 & 8) != 0) {
            f3 = danmakuSettings.screenPart;
        }
        if ((i3 & 16) != 0) {
            i2 = danmakuSettings.timeOffsetSec;
        }
        if ((i3 & 32) != 0) {
            z = danmakuSettings.showTopDanmaku;
        }
        if ((i3 & 64) != 0) {
            z2 = danmakuSettings.showBottomDanmaku;
        }
        boolean z3 = z;
        boolean z4 = z2;
        int i4 = i2;
        int i5 = i;
        return danmakuSettings.copy(f, f2, i5, f3, i4, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    /* JADX INFO: renamed from: component6, reason: from getter */

    /* JADX INFO: renamed from: component7, reason: from getter */

    public final DanmakuSettings copy(float speed, float size, int opacity, float screenPart, int timeOffsetSec, boolean showTopDanmaku, boolean showBottomDanmaku) {
        return new DanmakuSettings(speed, size, opacity, screenPart, timeOffsetSec, showTopDanmaku, showBottomDanmaku);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuSettings)) {
            return false;
        }
        DanmakuSettings danmakuSettings = (DanmakuSettings) other;
        return Float.compare(this.speed, danmakuSettings.speed) == 0 && Float.compare(this.size, danmakuSettings.size) == 0 && this.opacity == danmakuSettings.opacity && Float.compare(this.screenPart, danmakuSettings.screenPart) == 0 && this.timeOffsetSec == danmakuSettings.timeOffsetSec && this.showTopDanmaku == danmakuSettings.showTopDanmaku && this.showBottomDanmaku == danmakuSettings.showBottomDanmaku;
    }








    public int hashCode() {
        return ((((qi0.e(this.screenPart, (qi0.e(this.size, Float.floatToIntBits(this.speed) * 31, 31) + this.opacity) * 31, 31) + this.timeOffsetSec) * 31) + (this.showTopDanmaku ? 1231 : 1237)) * 31) + (this.showBottomDanmaku ? 1231 : 1237);
    }

    public String toString() {
        float f = this.speed;
        float f2 = this.size;
        int i = this.opacity;
        float f3 = this.screenPart;
        int i2 = this.timeOffsetSec;
        boolean z = this.showTopDanmaku;
        boolean z2 = this.showBottomDanmaku;
        StringBuilder sb = new StringBuilder("DanmakuSettings(speed=");
        sb.append(f);
        sb.append(", size=");
        sb.append(f2);
        sb.append(", opacity=");
        sb.append(i);
        sb.append(", screenPart=");
        sb.append(f3);
        sb.append(", timeOffsetSec=");
        sb.append(i2);
        sb.append(", showTopDanmaku=");
        sb.append(z);
        sb.append(", showBottomDanmaku=");
        return i9.i(sb, z2, ")");
    }

    public DanmakuSettings(float f, float f2, int i, float f3, int i2, boolean z, boolean z2) {
        this.speed = f;
        this.size = f2;
        this.opacity = i;
        this.screenPart = f3;
        this.timeOffsetSec = i2;
        this.showTopDanmaku = z;
        this.showBottomDanmaku = z2;
    }

    public DanmakuSettings() {
        this(0.0f, 0.0f, 0, 0.0f, 0, false, false, 127, null);
    }
}
