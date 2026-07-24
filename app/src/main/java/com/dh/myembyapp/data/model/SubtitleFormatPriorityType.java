package com.dh.myembyapp.data.model;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public enum SubtitleFormatPriorityType {
    ASS_SSA("ass_ssa", "ASS/SSA", 0, 4, null),
    SRT("srt", "SRT", 0, 4, null),
    VTT("vtt", "VTT", 0, 4, null),
    PGS("pgs", "PGS", 0, 4, null),
    DVB("dvb", "DVB", 0, 4, null),
    SUB("sub", "SUB", 0, 4, null),
    OTHER("other", "其他", 0, 4, null);

    private final int defaultPriority;
    private final String label;
    private final String storageValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

        public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        
            if (r0.equals("DVBSUB") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            if (r0.equals("ASS/SSA") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        
            if (r0.equals("VTT") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        
            if (r0.equals("SSA") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        
            if (r0.equals("SRT") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
        
            if (r0.equals("PGS") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
        
            if (r0.equals("DVB") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
        
            return com.dh.myembyapp.data.model.SubtitleFormatPriorityType.DVB;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
        
            if (r0.equals("ASS") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x007f, code lost:
        
            return com.dh.myembyapp.data.model.SubtitleFormatPriorityType.ASS_SSA;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0086, code lost:
        
            if (r0.equals("HDMV_PGS_SUBTITLE") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
        
            if (r0.equals("WEBVTT") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
        
            return com.dh.myembyapp.data.model.SubtitleFormatPriorityType.VTT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x009b, code lost:
        
            if (r0.equals("SUBRIP") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a0, code lost:
        
            return com.dh.myembyapp.data.model.SubtitleFormatPriorityType.SRT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a7, code lost:
        
            if (r0.equals("PGSSUB") == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00ac, code lost:
        
            return com.dh.myembyapp.data.model.SubtitleFormatPriorityType.PGS;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.dh.myembyapp.data.model.SubtitleFormatPriorityType fromLabel(java.lang.String r1) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dh.myembyapp.data.model.SubtitleFormatPriorityType.Companion.fromLabel(java.lang.String):com.dh.myembyapp.data.model.SubtitleFormatPriorityType");
        }

        public final SubtitleFormatPriorityType fromStorageValue(String value) {
            SubtitleFormatPriorityType next;
            Iterator<SubtitleFormatPriorityType> it = SubtitleFormatPriorityType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.getStorageValue(), value)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    /* synthetic */ SubtitleFormatPriorityType(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 1 : i);
    }

    public static EnumEntries<SubtitleFormatPriorityType> getEntries() {
        return $ENTRIES;
    }




    SubtitleFormatPriorityType(String str, String str2, int i) {
        this.storageValue = str;
        this.label = str2;
        this.defaultPriority = i;
    }
}
