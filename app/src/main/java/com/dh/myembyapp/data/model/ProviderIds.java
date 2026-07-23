package com.dh.myembyapp.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.kb0;
import defpackage.s01;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/dh/myembyapp/data/model/ProviderIds;", "", "tmdb", "", "imdb", "tvdb", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTmdb", "()Ljava/lang/String;", "getImdb", "getTvdb", "buildAnyProviderIdQueries", "", "isEmpty", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProviderIds {
    public static final int $stable = 0;

    @SerializedName("Imdb")
    private final String imdb;

    @SerializedName("Tmdb")
    private final String tmdb;

    @SerializedName("Tvdb")
    private final String tvdb;

    public /* synthetic */ ProviderIds(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ ProviderIds copy$default(ProviderIds providerIds, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = providerIds.tmdb;
        }
        if ((i & 2) != 0) {
            str2 = providerIds.imdb;
        }
        if ((i & 4) != 0) {
            str3 = providerIds.tvdb;
        }
        return providerIds.copy(str, str2, str3);
    }

    public final List<String> buildAnyProviderIdQueries() {
        String string;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String str = this.tmdb;
        if (str != null && (string = StringsKt.trim((CharSequence) str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                listCreateListBuilder.add("tmdb.".concat(string));
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final ProviderIds copy(String tmdb, String imdb, String tvdb) {
        return new ProviderIds(tmdb, imdb, tvdb);
    }

    public boolean equals(Object other) {
        String str = this.tmdb;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imdb;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tvdb;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return buildAnyProviderIdQueries().isEmpty();
    }

    public String toString() {
        String str = this.tmdb;
        String str2 = this.imdb;
        return s01.w(kb0.z("ProviderIds(tmdb=", str, ", imdb=", str2, ", tvdb="), this.tvdb, ")");
    }

    public ProviderIds(String str, String str2, String str3) {
        this.tmdb = str;
        this.imdb = str2;
        this.tvdb = str3;
    }

    public ProviderIds() {
        this(null, null, null, 7, null);
    }
}
