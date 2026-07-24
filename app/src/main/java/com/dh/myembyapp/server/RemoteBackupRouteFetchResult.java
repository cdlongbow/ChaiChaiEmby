package com.dh.myembyapp.server;

import com.dh.myembyapp.data.model.BackupRouteConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class RemoteBackupRouteFetchResult {
    
    private final List<BackupRouteConfig> routesToImport;
    private final int totalCount;

    public RemoteBackupRouteFetchResult(int i, List<BackupRouteConfig> list) {
        list.getClass();
        this.totalCount = i;
        this.routesToImport = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteBackupRouteFetchResult copy$default(RemoteBackupRouteFetchResult remoteBackupRouteFetchResult, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = remoteBackupRouteFetchResult.totalCount;
        }
        if ((i2 & 2) != 0) {
            list = remoteBackupRouteFetchResult.routesToImport;
        }
        return remoteBackupRouteFetchResult.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    public final List<BackupRouteConfig> component2() {
        return this.routesToImport;
    }

    public final RemoteBackupRouteFetchResult copy(int totalCount, List<BackupRouteConfig> routesToImport) {
        routesToImport.getClass();
        return new RemoteBackupRouteFetchResult(totalCount, routesToImport);
    }

    public boolean equals(Object other) {
        return this.routesToImport.hashCode() + (this.totalCount * 31);
    }

    public String toString() {
        return "RemoteBackupRouteFetchResult(totalCount=" + this.totalCount + ", routesToImport=" + this.routesToImport + ")";
    }
}
