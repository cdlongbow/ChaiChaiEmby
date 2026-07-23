package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class he {
    public static final he a;
    public static final /* synthetic */ he[] b;
    public static final /* synthetic */ EnumEntries c;

    /* JADX INFO: Fake field, exist only in values array */
    he EF0;

    static {
        he heVar = new he("BITMAP_RGBA", 0);
        he heVar2 = new he("BITMAP_ALPHA", 1);
        a = heVar2;
        he[] heVarArr = {heVar, heVar2, new he("TEXTURE", 2)};
        b = heVarArr;
        c = EnumEntriesKt.enumEntries(heVarArr);
    }

    public static he valueOf(String str) {
        return (he) Enum.valueOf(he.class, str);
    }

    public static he[] values() {
        return (he[]) b.clone();
    }
}
