package com.dh.myembyapp.data.api;

import com.google.gson.annotations.SerializedName;
import defpackage.ll0;
import defpackage.qi0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/dh/myembyapp/data/api/IqiyiSuggestResponse;", "", "code", "", "data", "", "Lcom/dh/myembyapp/data/api/IqiyiSuggestItem;", "showQueryCount", "", "<init>", "(Ljava/lang/String;Ljava/util/List;I)V", "getCode", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "getShowQueryCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class IqiyiSuggestResponse {
    public static final int $stable = 8;
    private final String code;
    private final List<IqiyiSuggestItem> data;

    @SerializedName("show_query_count")
    private final int showQueryCount;

    public /* synthetic */ IqiyiSuggestResponse(String str, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IqiyiSuggestResponse copy$default(IqiyiSuggestResponse iqiyiSuggestResponse, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iqiyiSuggestResponse.code;
        }
        if ((i2 & 2) != 0) {
            list = iqiyiSuggestResponse.data;
        }
        if ((i2 & 4) != 0) {
            i = iqiyiSuggestResponse.showQueryCount;
        }
        return iqiyiSuggestResponse.copy(str, list, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    public final List<IqiyiSuggestItem> component2() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final IqiyiSuggestResponse copy(String code, List<IqiyiSuggestItem> data, int showQueryCount) {
        data.getClass();
        return new IqiyiSuggestResponse(code, data, showQueryCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IqiyiSuggestResponse)) {
            return false;
        }
        IqiyiSuggestResponse iqiyiSuggestResponse = (IqiyiSuggestResponse) other;
        return Intrinsics.areEqual(this.code, iqiyiSuggestResponse.code) && Intrinsics.areEqual(this.data, iqiyiSuggestResponse.data) && this.showQueryCount == iqiyiSuggestResponse.showQueryCount;
    }


    public final List<IqiyiSuggestItem> getData() {
        return this.data;
    }


    public int hashCode() {
        String str = this.code;
        return qi0.f(this.data, (str == null ? 0 : str.hashCode()) * 31, 31) + this.showQueryCount;
    }

    public String toString() {
        String str = this.code;
        List<IqiyiSuggestItem> list = this.data;
        int i = this.showQueryCount;
        StringBuilder sb = new StringBuilder("IqiyiSuggestResponse(code=");
        sb.append(str);
        sb.append(", data=");
        sb.append(list);
        sb.append(", showQueryCount=");
        return ll0.f(sb, i, ")");
    }

    public IqiyiSuggestResponse(String str, List<IqiyiSuggestItem> list, int i) {
        list.getClass();
        this.code = str;
        this.data = list;
        this.showQueryCount = i;
    }

    public IqiyiSuggestResponse() {
        this(null, null, 0, 7, null);
    }
}
