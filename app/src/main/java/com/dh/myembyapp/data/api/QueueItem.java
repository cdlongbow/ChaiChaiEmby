package com.dh.myembyapp.data.api;

import defpackage.mr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class QueueItem {
    
    private final String Id;
    private final String PlaylistItemId;

    public QueueItem(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.Id = str;
        this.PlaylistItemId = str2;
    }

    public static /* synthetic */ QueueItem copy$default(QueueItem queueItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queueItem.Id;
        }
        if ((i & 2) != 0) {
            str2 = queueItem.PlaylistItemId;
        }
        return queueItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    public final QueueItem copy(String Id, String PlaylistItemId) {
        Id.getClass();
        PlaylistItemId.getClass();
        return new QueueItem(Id, PlaylistItemId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueueItem)) {
            return false;
        }
        QueueItem queueItem = (QueueItem) other;
        return Intrinsics.areEqual(this.Id, queueItem.Id) && Intrinsics.areEqual(this.PlaylistItemId, queueItem.PlaylistItemId);
    }



    public int hashCode() {
        return this.PlaylistItemId.hashCode() + (this.Id.hashCode() * 31);
    }

    public String toString() {
        return mr.s("QueueItem(Id=", this.Id, ", PlaylistItemId=", this.PlaylistItemId, ")");
    }
}
