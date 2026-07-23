package defpackage;

import android.content.Context;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes4.dex */
public final class de {
    public static final Regex a = new Regex("^(\\s*)(Dialogue|Comment):\\s*(.*)$");

    public static final int a(String str) {
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(str, "\r\n", "\n", false, 4, (Object) null);
        int i = StringsKt__StringsKt.contains(strReplace$default, (CharSequence) "[Script Info]", true) ? 120 : 0;
        if (StringsKt__StringsKt.contains(strReplace$default, (CharSequence) "[Events]", true)) {
            i += Input.Keys.NUMPAD_ENTER;
        }
        if (StringsKt__StringsKt.contains(strReplace$default, (CharSequence) "Format:", true)) {
            i += 80;
        }
        return (SequencesKt.count(Regex.findAll$default(new Regex("(?m)^\\s*(Dialogue|Comment):"), strReplace$default, 0, 2, null)) * 25) + i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040 A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #0 {Exception -> 0x0047, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0011, B:9:0x0022, B:11:0x0031, B:13:0x0040), top: B:19:0x0003 }] */
    public static void b(Context context) {
        context.getClass();
        try {
            File[] fileArrListFiles = context.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (StringsKt__StringsJVMKt.startsWith$default(name, "subtitle_", false, 2, null)) {
                        String name2 = file.getName();
                        name2.getClass();
                        if (StringsKt__StringsJVMKt.endsWith$default(name2, "_modified.ass", false, 2, null)) {
                            file.delete();
                        } else {
                            String name3 = file.getName();
                            name3.getClass();
                            if (StringsKt__StringsJVMKt.endsWith$default(name3, "_modified.ssa", false, 2, null)) {
                                file.delete();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            kb0.G("清理临时文件失败: ", e.getMessage(), "AssSubtitleParser", e);
        }
    }

    public static String c(long j) {
        long jMax = Math.max(0L, j);
        long j2 = jMax / DurationKt.MILLIS_IN_HOUR;
        long j3 = (jMax % DurationKt.MILLIS_IN_HOUR) / 60000;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%d:%02d:%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf((jMax % 60000) / 1000), Long.valueOf((jMax % 1000) / 10)}, 4));
    }

    public static Long d(String str) {
        String strTake;
        String strPadEnd;
        try {
            List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.trim((CharSequence) str).toString(), new String[]{":"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 3) {
                return null;
            }
            long j = Long.parseLong((String) listSplit$default.get(0));
            long j2 = Long.parseLong((String) listSplit$default.get(1));
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(2), new String[]{"."}, false, 0, 6, (Object) null);
            long j3 = Long.parseLong((String) listSplit$default2.get(0));
            String str2 = (String) CollectionsKt.getOrNull(listSplit$default2, 1);
            return Long.valueOf((((str2 == null || (strTake = StringsKt.take(str2, 2)) == null || (strPadEnd = StringsKt__StringsKt.padEnd(strTake, 2, '0')) == null) ? 0L : Long.parseLong(strPadEnd)) * 10) + (j3 * 1000) + (j2 * 60000) + (j * DurationKt.MILLIS_IN_HOUR));
        } catch (Exception unused) {
            return null;
        }
    }
}
