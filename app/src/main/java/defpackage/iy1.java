package defpackage;

import com.dh.myembyapp.data.ProxyProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class iy1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ProxyProtocol.values().length];
        try {
            iArr[ProxyProtocol.HTTP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProxyProtocol.HTTPS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProxyProtocol.SOCKS5.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
