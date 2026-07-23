package com.dh.myembyapp.data.model;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/dh/myembyapp/data/model/AppCardSizeLevel;", "", "<init>", "()V", "MIN", "", "DEFAULT", "MAX", "normalize", "level", "next", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AppCardSizeLevel {
    public static final int $stable = 0;
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
