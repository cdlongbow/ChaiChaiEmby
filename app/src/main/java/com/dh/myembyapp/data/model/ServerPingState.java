package com.dh.myembyapp.data.model;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final  class ServerPingState {
    

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ServerPingState Idle = new ServerPingState(ServerPingStatus.IDLE, null, null, 6, null);
    private static final ServerPingState Measuring = new ServerPingState(ServerPingStatus.MEASURING, 0 == true ? 1 : 0, null, 6, null);
    private static final ServerPingState Unreachable = new ServerPingState(ServerPingStatus.UNREACHABLE, 0 == true ? 1 : 0, null, 6, null);
    private final Integer httpStatusCode;
    private final Long latencyMs;
    private final ServerPingStatus status;

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
