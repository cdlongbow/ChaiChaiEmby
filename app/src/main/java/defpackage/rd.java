package defpackage;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class rd {
    public static final /* synthetic */ rd[] a;
    public static final /* synthetic */ EnumEntries b;

    /* JADX INFO: Fake field, exist only in values array */
    rd EF5;

    static {
        rd[] rdVarArr = {new rd("CUES", 0), new rd("EFFECTS_CANVAS", 1), new rd("EFFECTS_OPEN_GL", 2), new rd("OVERLAY_CANVAS", 3), new rd("OVERLAY_OPEN_GL", 4)};
        a = rdVarArr;
        b = EnumEntriesKt.enumEntries(rdVarArr);
    }

    public static rd valueOf(String str) {
        return (rd) Enum.valueOf(rd.class, str);
    }

    public static rd[] values() {
        return (rd[]) a.clone();
    }
}
