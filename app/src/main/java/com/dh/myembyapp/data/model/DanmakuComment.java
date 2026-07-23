package com.dh.myembyapp.data.model;

import androidx.core.view.ViewCompat;
import defpackage.mr;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuComment;", "", "p", "", "manifest", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getP", "()Ljava/lang/String;", "getM", "parseParams", "Lcom/dh/myembyapp/data/model/DanmakuParams;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuComment {
    public static final int $stable = 0;
    private final String m;
    private final String p;

    public DanmakuComment(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.p = str;
        this.m = str2;
    }

    public static /* synthetic */ DanmakuComment copy$default(DanmakuComment danmakuComment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = danmakuComment.p;
        }
        if ((i & 2) != 0) {
            str2 = danmakuComment.m;
        }
        return danmakuComment.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final DanmakuComment copy(String p, String m) {
        p.getClass();
        m.getClass();
        return new DanmakuComment(p, m);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuComment)) {
            return false;
        }
        DanmakuComment danmakuComment = (DanmakuComment) other;
        return Intrinsics.areEqual(this.p, danmakuComment.p) && Intrinsics.areEqual(this.m, danmakuComment.m);
    }

    public int hashCode() {
        return this.m.hashCode() + (this.p.hashCode() * 31);
    }

    public final DanmakuParams parseParams() {
        Integer intOrNull;
        Integer intOrNull2;
        Float floatOrNull;
        Integer intOrNull3;
        Integer intOrNull4;
        Float floatOrNull2;
        List listSplit$default = StringsKt__StringsKt.split$default(this.p, new String[]{","}, false, 0, 6, (Object) null);
        int size = listSplit$default.size();
        int iIntValue = ViewCompat.MEASURED_SIZE_MASK;
        float fFloatValue = 0.0f;
        int iIntValue2 = 1;
        if (size < 5) {
            String str = (String) CollectionsKt.getOrNull(listSplit$default, 0);
            if (str != null && (floatOrNull = StringsKt.toFloatOrNull(str)) != null) {
                fFloatValue = floatOrNull.floatValue();
            }
            float f = fFloatValue;
            String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
            if (str2 != null && (intOrNull2 = StringsKt.toIntOrNull(str2)) != null) {
                iIntValue2 = intOrNull2.intValue();
            }
            int i = iIntValue2;
            String str3 = (String) CollectionsKt.getOrNull(listSplit$default, 2);
            if (str3 != null && (intOrNull = StringsKt.toIntOrNull(str3)) != null) {
                iIntValue = intOrNull.intValue();
            }
            String str4 = (String) CollectionsKt.getOrNull(listSplit$default, 3);
            return new DanmakuParams(f, i, iIntValue, 25, str4 == null ? "" : str4);
        }
        String str5 = (String) CollectionsKt.getOrNull(listSplit$default, 0);
        if (str5 != null && (floatOrNull2 = StringsKt.toFloatOrNull(str5)) != null) {
            fFloatValue = floatOrNull2.floatValue();
        }
        float f2 = fFloatValue;
        String str6 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
        if (str6 != null && (intOrNull4 = StringsKt.toIntOrNull(str6)) != null) {
            iIntValue2 = intOrNull4.intValue();
        }
        int i2 = iIntValue2;
        String str7 = (String) CollectionsKt.getOrNull(listSplit$default, 2);
        if (str7 != null && (intOrNull3 = StringsKt.toIntOrNull(str7)) != null) {
            iIntValue = intOrNull3.intValue();
        }
        int i3 = iIntValue;
        String str8 = (String) CollectionsKt.getOrNull(listSplit$default, 4);
        return new DanmakuParams(f2, i2, i3, 25, str8 == null ? "" : str8);
    }

    public String toString() {
        return mr.s("DanmakuComment(p=", this.p, ", m=", this.m, ")");
    }
}
