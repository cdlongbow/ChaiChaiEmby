package defpackage;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pn implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CacheWindowLogic b;
    public final /* synthetic */ CacheWindowScope c;

    public /* synthetic */ pn(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i) {
        this.a = i;
        this.b = cacheWindowLogic;
        this.c = cacheWindowScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        CacheWindowScope cacheWindowScope = this.c;
        CacheWindowLogic cacheWindowLogic = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return CacheWindowLogic.getItemSizeOrPrefetch$lambda$4(cacheWindowLogic, cacheWindowScope, iIntValue, iIntValue2);
            case 1:
                return CacheWindowLogic.getItemSizeOrPrefetch$lambda$10(cacheWindowLogic, cacheWindowScope, iIntValue, iIntValue2);
            default:
                return CacheWindowLogic.scheduleNextItemIfNeeded$lambda$1(cacheWindowLogic, cacheWindowScope, iIntValue, iIntValue2);
        }
    }
}
