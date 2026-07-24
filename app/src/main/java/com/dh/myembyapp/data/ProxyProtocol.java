package com.dh.myembyapp.data;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
public enum ProxyProtocol {
    HTTP("HTTP"),
    HTTPS("HTTPS"),
    SOCKS5("SOCKS5");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final String displayName;

    ProxyProtocol(String str) {
        this.displayName = str;
    }

    public static EnumEntries<ProxyProtocol> getEntries() {
        return $ENTRIES;
    }

}
