package com.dh.myembyapp.data.api;

import com.google.gson.annotations.SerializedName;
import defpackage.ll0;
import defpackage.qi0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class IqiyiSuggestResponse {
    
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
