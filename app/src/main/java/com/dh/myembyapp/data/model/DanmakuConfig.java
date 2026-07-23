package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.i02;
import defpackage.i9;
import defpackage.qi0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0006\u0010&\u001a\u00020\u0003J\u000e\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000bJ\u000e\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u000bJ\u0010\u0010*\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J]\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u00020\u000bHÖ\u0081\u0004J\n\u00105\u001a\u00020\u0005HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR*\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012¨\u00067"}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuConfig;", "", "enabled", "", "apiUrl", "", "apiUrls", "", "apiNames", "apiUrlsUseProxy", "", "", "autoMatch", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Z)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getApiUrl", "()Ljava/lang/String;", "setApiUrl", "(Ljava/lang/String;)V", "getApiUrls", "()Ljava/util/List;", "setApiUrls", "(Ljava/util/List;)V", "getApiNames", "setApiNames", "getApiUrlsUseProxy", "()Ljava/util/Map;", "setApiUrlsUseProxy", "(Ljava/util/Map;)V", "getAutoMatch", "setAutoMatch", "getApiSlotUrls", "getApiSlotNames", "getEffectiveApiUrls", "hasValidApi", "isApiUseProxy", "index", "getApiName", "getApiDisplayName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DanmakuConfig {
    public static final int MAX_API_COUNT = 5;

    @SerializedName("apiNames")
    private List<String> apiNames;

    @SerializedName("apiUrl")
    private String apiUrl;

    @SerializedName("apiUrls")
    private List<String> apiUrls;

    @SerializedName("apiUrlsUseProxy")
    private Map<Integer, Boolean> apiUrlsUseProxy;

    @SerializedName("autoMatch")
    private boolean autoMatch;

    @SerializedName("enabled")
    private boolean enabled;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dh/myembyapp/data/model/DanmakuConfig$Companion;", "", "<init>", "()V", "MAX_API_COUNT", "", "defaultApiName", "", "index", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String defaultApiName(int index) {
            return i9.f(index + 1, "弹幕API");
        }

        private Companion() {
        }
    }

    public /* synthetic */ DanmakuConfig(boolean z, String str, List list, List list2, Map map, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? MapsKt.emptyMap() : map, (i & 32) != 0 ? true : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DanmakuConfig copy$default(DanmakuConfig danmakuConfig, boolean z, String str, List list, List list2, Map map, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = danmakuConfig.enabled;
        }
        if ((i & 2) != 0) {
            str = danmakuConfig.apiUrl;
        }
        if ((i & 4) != 0) {
            list = danmakuConfig.apiUrls;
        }
        if ((i & 8) != 0) {
            list2 = danmakuConfig.apiNames;
        }
        if ((i & 16) != 0) {
            map = danmakuConfig.apiUrlsUseProxy;
        }
        if ((i & 32) != 0) {
            z2 = danmakuConfig.autoMatch;
        }
        Map map2 = map;
        boolean z3 = z2;
        return danmakuConfig.copy(z, str, list, list2, map2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final List<String> component3() {
        return this.apiUrls;
    }

    public final List<String> component4() {
        return this.apiNames;
    }

    public final Map<Integer, Boolean> component5() {
        return this.apiUrlsUseProxy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */

    public final DanmakuConfig copy(boolean enabled, String apiUrl, List<String> apiUrls, List<String> apiNames, Map<Integer, Boolean> apiUrlsUseProxy, boolean autoMatch) {
        apiUrl.getClass();
        apiUrls.getClass();
        apiNames.getClass();
        apiUrlsUseProxy.getClass();
        return new DanmakuConfig(enabled, apiUrl, apiUrls, apiNames, apiUrlsUseProxy, autoMatch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DanmakuConfig)) {
            return false;
        }
        DanmakuConfig danmakuConfig = (DanmakuConfig) other;
        return this.enabled == danmakuConfig.enabled && Intrinsics.areEqual(this.apiUrl, danmakuConfig.apiUrl) && Intrinsics.areEqual(this.apiUrls, danmakuConfig.apiUrls) && Intrinsics.areEqual(this.apiNames, danmakuConfig.apiNames) && Intrinsics.areEqual(this.apiUrlsUseProxy, danmakuConfig.apiUrlsUseProxy) && this.autoMatch == danmakuConfig.autoMatch;
    }

    public final String getApiDisplayName(String apiUrl) {
        Object objM8825constructorimpl;
        String string = apiUrl != null ? StringsKt.trim((CharSequence) apiUrl).toString() : null;
        if (string == null) {
            string = "";
        }
        if (StringsKt.isBlank(string)) {
            return "-";
        }
        int iIndexOf = getApiSlotUrls().indexOf(string);
        if (iIndexOf >= 0) {
            return getApiName(iIndexOf);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(new URI(string).getHost());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
            objM8825constructorimpl = null;
        }
        String str = (String) objM8825constructorimpl;
        if (str == null) {
            return string;
        }
        String str2 = StringsKt.isBlank(str) ? null : str;
        return str2 != null ? str2 : string;
    }

    public final String getApiName(int index) {
        List<String> apiSlotNames = getApiSlotNames();
        return (index < 0 || index >= apiSlotNames.size()) ? INSTANCE.defaultApiName(index) : apiSlotNames.get(index);
    }

    public final List<String> getApiSlotNames() {
        List<String> apiSlotUrls = getApiSlotUrls();
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.take(this.apiNames, 5));
        while (mutableList.size() < 5) {
            mutableList.add("");
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
        int i = 0;
        for (Object obj : mutableList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String string = StringsKt.trim((CharSequence) obj).toString();
            if (StringsKt.isBlank(string)) {
                string = (!StringsKt.isBlank(apiSlotUrls.get(i)) || i < 5) ? INSTANCE.defaultApiName(i) : "";
            }
            arrayList.add(string);
            i = i2;
        }
        return arrayList;
    }

    public final List<String> getApiSlotUrls() {
        List<String> listMutableListOf;
        if (this.apiUrls.isEmpty()) {
            listMutableListOf = !StringsKt.isBlank(this.apiUrl) ? CollectionsKt.mutableListOf(this.apiUrl) : new ArrayList<>();
        } else {
            listMutableListOf = CollectionsKt.toMutableList((Collection) CollectionsKt.take(this.apiUrls, 5));
        }
        while (listMutableListOf.size() < 5) {
            listMutableListOf.add("");
        }
        return listMutableListOf;
    }

    public final List<String> getEffectiveApiUrls() {
        List<String> apiSlotUrls = getApiSlotUrls();
        ArrayList arrayList = new ArrayList();
        for (Object obj : apiSlotUrls) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean hasValidApi() {
        return !getEffectiveApiUrls().isEmpty();
    }

    public int hashCode() {
        return ((this.apiUrlsUseProxy.hashCode() + qi0.f(this.apiNames, qi0.f(this.apiUrls, i02.i((this.enabled ? 1231 : 1237) * 31, 31, this.apiUrl), 31), 31)) * 31) + (this.autoMatch ? 1231 : 1237);
    }

    public final boolean isApiUseProxy(int index) {
        Boolean bool = this.apiUrlsUseProxy.get(Integer.valueOf(index));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void setApiNames(List<String> list) {
        list.getClass();
        this.apiNames = list;
    }

    public final void setApiUrl(String str) {
        str.getClass();
        this.apiUrl = str;
    }

    public final void setApiUrls(List<String> list) {
        list.getClass();
        this.apiUrls = list;
    }

    public final void setApiUrlsUseProxy(Map<Integer, Boolean> map) {
        map.getClass();
        this.apiUrlsUseProxy = map;
    }



    public String toString() {
        return "DanmakuConfig(enabled=" + this.enabled + ", apiUrl=" + this.apiUrl + ", apiUrls=" + this.apiUrls + ", apiNames=" + this.apiNames + ", apiUrlsUseProxy=" + this.apiUrlsUseProxy + ", autoMatch=" + this.autoMatch + ")";
    }

    public DanmakuConfig(boolean z, String str, List<String> list, List<String> list2, Map<Integer, Boolean> map, boolean z2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        this.enabled = z;
        this.apiUrl = str;
        this.apiUrls = list;
        this.apiNames = list2;
        this.apiUrlsUseProxy = map;
        this.autoMatch = z2;
    }

    public DanmakuConfig() {
        this(false, null, null, null, null, false, 63, null);
    }
}
