package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nv {
    public static final nv a;
    public static final nv b;
    public static final /* synthetic */ nv[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        nv nvVar = new nv("Progress", 0);
        a = nvVar;
        nv nvVar2 = new nv("Buttons", 1);
        b = nvVar2;
        nv[] nvVarArr = {nvVar, nvVar2};
        c = nvVarArr;
        d = EnumEntriesKt.enumEntries(nvVarArr);
    }

    public static nv valueOf(String str) {
        return (nv) Enum.valueOf(nv.class, str);
    }

    public static nv[] values() {
        return (nv[]) c.clone();
    }
}
