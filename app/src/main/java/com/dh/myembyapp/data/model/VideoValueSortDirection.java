package com.dh.myembyapp.data.model;

import defpackage.qu;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, d2 = {"Lcom/dh/myembyapp/data/model/VideoValueSortDirection;", "", "<init>", "(Ljava/lang/String;I)V", "DESCENDING", "ASCENDING", "label", "", "getLabel", "()Ljava/lang/String;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum VideoValueSortDirection {
    DESCENDING,
    ASCENDING;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoValueSortDirection.values().length];
            try {
                iArr[VideoValueSortDirection.DESCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoValueSortDirection.ASCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<VideoValueSortDirection> getEntries() {
        return $ENTRIES;
    }

    public final String getLabel() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "大 -> 小";
        }
        if (i == 2) {
            return "小 -> 大";
        }
        qu.f();
        return null;
    }
}
