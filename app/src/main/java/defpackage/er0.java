package defpackage;

import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class er0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Http2Connection b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ErrorCode d;

    public /* synthetic */ er0(Http2Connection http2Connection, int i, ErrorCode errorCode, int i2) {
        this.a = i2;
        this.b = http2Connection;
        this.c = i;
        this.d = errorCode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ErrorCode errorCode = this.d;
        int i2 = this.c;
        Http2Connection http2Connection = this.b;
        switch (i) {
            case 0:
                return Http2Connection.writeSynResetLater$lambda$0(http2Connection, i2, errorCode);
            default:
                return Http2Connection.pushResetLater$lambda$0(http2Connection, i2, errorCode);
        }
    }
}
