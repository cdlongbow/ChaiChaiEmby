package com.dh.myembyapp.data.model;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/model/ServerPingState;", "", NotificationCompat.CATEGORY_STATUS, "Lcom/dh/myembyapp/data/model/ServerPingStatus;", "latencyMs", "", "httpStatusCode", "", "<init>", "(Lcom/dh/myembyapp/data/model/ServerPingStatus;Ljava/lang/Long;Ljava/lang/Integer;)V", "getStatus", "()Lcom/dh/myembyapp/data/model/ServerPingStatus;", "getLatencyMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHttpStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/dh/myembyapp/data/model/ServerPingStatus;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/dh/myembyapp/data/model/ServerPingState;", "equals", "", "other", "hashCode", "toString", "", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ServerPingState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ServerPingState Idle = new ServerPingState(ServerPingStatus.IDLE, null, null, 6, null);
    private static final ServerPingState Measuring = new ServerPingState(ServerPingStatus.MEASURING, 0 == true ? 1 : 0, null, 6, null);
    private static final ServerPingState Unreachable = new ServerPingState(ServerPingStatus.UNREACHABLE, 0 == true ? 1 : 0, null, 6, null);
    private final Integer httpStatusCode;
    private final Long latencyMs;
    private final ServerPingStatus status;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/dh/myembyapp/data/model/ServerPingState$Companion;", "", "<init>", "()V", "Idle", "Lcom/dh/myembyapp/data/model/ServerPingState;", "getIdle", "()Lcom/dh/myembyapp/data/model/ServerPingState;", "Measuring", "getMeasuring", "Unreachable", "getUnreachable", "fromLatency", "latencyMs", "", "fromHttpStatusCode", "statusCode", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ServerPingState fromHttpStatusCode(int statusCode) {
            return new ServerPingState(ServerPingStatus.HTTP_ERROR, null, Integer.valueOf(statusCode), 2, null);
        }

        public final ServerPingState fromLatency(long latencyMs) {
            ServerPingStatus serverPingStatus;
            long jCoerceAtLeast = RangesKt.coerceAtLeast(latencyMs, 0L);
            if (jCoerceAtLeast <= 100) {
                serverPingStatus = ServerPingStatus.GOOD;
            } else if (jCoerceAtLeast <= 200) {
                serverPingStatus = ServerPingStatus.NORMAL;
            } else if (jCoerceAtLeast <= 300) {
                serverPingStatus = ServerPingStatus.WARNING;
            } else {
                serverPingStatus = jCoerceAtLeast <= 500 ? ServerPingStatus.HIGH : ServerPingStatus.BAD;
            }
            return new ServerPingState(serverPingStatus, Long.valueOf(jCoerceAtLeast), null, 4, null);
        }

        public final ServerPingState getIdle() {
            return ServerPingState.Idle;
        }

        public final ServerPingState getMeasuring() {
            return ServerPingState.Measuring;
        }

        public final ServerPingState getUnreachable() {
            return ServerPingState.Unreachable;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ServerPingState(ServerPingStatus serverPingStatus, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serverPingStatus, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num);
    }

    public static /* synthetic */ ServerPingState copy$default(ServerPingState serverPingState, ServerPingStatus serverPingStatus, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            serverPingStatus = serverPingState.status;
        }
        if ((i & 2) != 0) {
            l = serverPingState.latencyMs;
        }
        if ((i & 4) != 0) {
            num = serverPingState.httpStatusCode;
        }
        return serverPingState.copy(serverPingStatus, l, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */

    /* JADX INFO: renamed from: component2, reason: from getter */

    /* JADX INFO: renamed from: component3, reason: from getter */

    public final ServerPingState copy(ServerPingStatus status, Long latencyMs, Integer httpStatusCode) {
        status.getClass();
        return new ServerPingState(status, latencyMs, httpStatusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerPingState)) {
            return false;
        }
        ServerPingState serverPingState = (ServerPingState) other;
        return this.status == serverPingState.status && Intrinsics.areEqual(this.latencyMs, serverPingState.latencyMs) && Intrinsics.areEqual(this.httpStatusCode, serverPingState.httpStatusCode);
    }




    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Long l = this.latencyMs;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.httpStatusCode;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ServerPingState(status=" + this.status + ", latencyMs=" + this.latencyMs + ", httpStatusCode=" + this.httpStatusCode + ")";
    }

    public ServerPingState(ServerPingStatus serverPingStatus, Long l, Integer num) {
        serverPingStatus.getClass();
        this.status = serverPingStatus;
        this.latencyMs = l;
        this.httpStatusCode = num;
    }
}
