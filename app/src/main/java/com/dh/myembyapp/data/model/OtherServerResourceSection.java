package com.dh.myembyapp.data.model;

import defpackage.qi0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/model/OtherServerResourceSection;", "", "server", "Lcom/dh/myembyapp/data/model/ServerConfig;", "matches", "", "Lcom/dh/myembyapp/data/model/OtherServerResourceMatch;", "isLoading", "", "error", "", "<init>", "(Lcom/dh/myembyapp/data/model/ServerConfig;Ljava/util/List;ZLjava/lang/String;)V", "getServer", "()Lcom/dh/myembyapp/data/model/ServerConfig;", "getMatches", "()Ljava/util/List;", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OtherServerResourceSection {
    public static final int $stable = 8;
    private final String error;
    private final boolean isLoading;
    private final List<OtherServerResourceMatch> matches;
    private final ServerConfig server;

    public /* synthetic */ OtherServerResourceSection(ServerConfig serverConfig, List list, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serverConfig, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtherServerResourceSection copy$default(OtherServerResourceSection otherServerResourceSection, ServerConfig serverConfig, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            serverConfig = otherServerResourceSection.server;
        }
        if ((i & 2) != 0) {
            list = otherServerResourceSection.matches;
        }
        if ((i & 4) != 0) {
            z = otherServerResourceSection.isLoading;
        }
        if ((i & 8) != 0) {
            str = otherServerResourceSection.error;
        }
        return otherServerResourceSection.copy(serverConfig, list, z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    public final List<OtherServerResourceMatch> component2() {
        return this.matches;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */

    /* JADX INFO: renamed from: component4, reason: from getter */

    public final OtherServerResourceSection copy(ServerConfig server, List<OtherServerResourceMatch> matches, boolean isLoading, String error) {
        server.getClass();
        matches.getClass();
        return new OtherServerResourceSection(server, matches, isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherServerResourceSection)) {
            return false;
        }
        OtherServerResourceSection otherServerResourceSection = (OtherServerResourceSection) other;
        return Intrinsics.areEqual(this.server, otherServerResourceSection.server) && Intrinsics.areEqual(this.matches, otherServerResourceSection.matches) && this.isLoading == otherServerResourceSection.isLoading && Intrinsics.areEqual(this.error, otherServerResourceSection.error);
    }


    public final List<OtherServerResourceMatch> getMatches() {
        return this.matches;
    }


    public int hashCode() {
        int iF = (qi0.f(this.matches, this.server.hashCode() * 31, 31) + (this.isLoading ? 1231 : 1237)) * 31;
        String str = this.error;
        return iF + (str == null ? 0 : str.hashCode());
    }


    public String toString() {
        return "OtherServerResourceSection(server=" + this.server + ", matches=" + this.matches + ", isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public OtherServerResourceSection(ServerConfig serverConfig, List<OtherServerResourceMatch> list, boolean z, String str) {
        serverConfig.getClass();
        list.getClass();
        this.server = serverConfig;
        this.matches = list;
        this.isLoading = z;
        this.error = str;
    }
}
