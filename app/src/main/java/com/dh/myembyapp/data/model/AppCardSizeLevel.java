package com.dh.myembyapp.data.model;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class AppCardSizeLevel {
    
    public static final int DEFAULT = 5;
    public static final AppCardSizeLevel INSTANCE = new AppCardSizeLevel();
    public static final int MAX = 12;
    public static final int MIN = 1;

    private AppCardSizeLevel() {
    }

    public final int next(int level) {
        int iNormalize = normalize(level);
        if (iNormalize >= 12) {
            return 1;
        }
        return iNormalize + 1;
    }

    public final int normalize(int level) {
        return RangesKt.coerceIn(level, 1, 12);
    }
}
