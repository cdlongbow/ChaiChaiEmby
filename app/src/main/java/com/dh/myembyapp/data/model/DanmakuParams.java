package com.dh.myembyapp.data.model;

import defpackage.c61;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuParams;", "", "time", "", "mode", "", "color", "fontSize", "source", "", "<init>", "(FIIILjava/lang/String;)V", "getTime", "()F", "getMode", "()I", "getColor", "getFontSize", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuParams {
    public static final int $stable = 0;
    private final int color;
    private final int fontSize;
    private final int mode;
    private final String source;
    private final float time;

    public DanmakuParams(float f, int i, int i2, int i3, String str) {
        str.getClass();
        this.time = f;
        this.mode = i;
        this.color = i2;
        this.fontSize = i3;
        this.source = str;
    }

    public static /* synthetic */ DanmakuParams copy$default(DanmakuParams danmakuParams, float f, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f = danmakuParams.time;
        }
        if ((i4 & 2) != 0) {
            i = danmakuParams.mode;
        }
        if ((i4 & 4) != 0) {
            i2 = danmakuParams.color;
        }
        if ((i4 & 8) != 0) {
            i3 = danmakuParams.fontSize;
        }
        if ((i4 & 16) != 0) {
            str = danmakuParams.source;
        }
        String str2 = str;
        int i5 = i2;
        return danmakuParams.copy(f, i, i5, i3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    /* JADX INFO: renamed from: component5, reason: from getter */

    public final DanmakuParams copy(float time, int mode, int color, int fontSize, String source) {
        source.getClass();
        return new DanmakuParams(time, mode, color, fontSize, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuParams)) {
            return false;
        }
        DanmakuParams danmakuParams = (DanmakuParams) other;
        return Float.compare(this.time, danmakuParams.time) == 0 && this.mode == danmakuParams.mode && this.color == danmakuParams.color && this.fontSize == danmakuParams.fontSize && Intrinsics.areEqual(this.source, danmakuParams.source);
    }

    public int hashCode() {
        return this.source.hashCode() + (((((((Float.floatToIntBits(this.time) * 31) + this.mode) * 31) + this.color) * 31) + this.fontSize) * 31);
    }

    public String toString() {
        float f = this.time;
        int i = this.mode;
        int i2 = this.color;
        int i3 = this.fontSize;
        String str = this.source;
        StringBuilder sb = new StringBuilder("DanmakuParams(time=");
        sb.append(f);
        sb.append(", mode=");
        sb.append(i);
        sb.append(", color=");
        c61.t(sb, i2, ", fontSize=", i3, ", source=");
        return s01.w(sb, str, ")");
    }
}
