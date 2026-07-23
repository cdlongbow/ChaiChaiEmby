package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dc {
    public static final dc a;
    public static final dc b;
    public static final /* synthetic */ dc[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        dc dcVar = new dc("ORIGINAL_GITHUB", 0);
        a = dcVar;
        dc dcVar2 = new dc("FRONT_PROXY", 1);
        b = dcVar2;
        dc[] dcVarArr = {dcVar, dcVar2};
        c = dcVarArr;
        d = EnumEntriesKt.enumEntries(dcVarArr);
    }

    public static dc valueOf(String str) {
        return (dc) Enum.valueOf(dc.class, str);
    }

    public static dc[] values() {
        return (dc[]) c.clone();
    }
}
