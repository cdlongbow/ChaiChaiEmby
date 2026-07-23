package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bh {
    public static final bh a;
    public static final bh b;
    public static final bh c;
    public static final bh d;
    public static final /* synthetic */ bh[] e;
    public static final /* synthetic */ EnumEntries g;

    static {
        bh bhVar = new bh(HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_PRIMARY, 0);
        a = bhVar;
        bh bhVar2 = new bh("SECONDARY", 1);
        b = bhVar2;
        bh bhVar3 = new bh("POSITIVE", 2);
        c = bhVar3;
        bh bhVar4 = new bh("DANGER", 3);
        d = bhVar4;
        bh[] bhVarArr = {bhVar, bhVar2, bhVar3, bhVar4};
        e = bhVarArr;
        g = EnumEntriesKt.enumEntries(bhVarArr);
    }

    public static bh valueOf(String str) {
        return (bh) Enum.valueOf(bh.class, str);
    }

    public static bh[] values() {
        return (bh[]) e.clone();
    }
}
