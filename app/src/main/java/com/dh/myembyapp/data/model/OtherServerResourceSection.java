package com.dh.myembyapp.data.model;

import defpackage.qi0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class OtherServerResourceSection {
    
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
