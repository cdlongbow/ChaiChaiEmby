package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mx0 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ mx0(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j) {
        this.d = context;
        this.e = resolveInfo;
        this.b = z;
        this.g = charSequence;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                return LazyStaggeredGridMeasureKt.measure$lambda$0$37((LazyStaggeredGridMeasureContext) obj4, (ArrayList) obj3, this.b, this.c, (LazyLayoutMeasureScope) obj2, (Placeable.PlacementScope) obj);
            default:
                return ProcessText_androidKt.addProcessedTextContextMenuItems_UAq72N0$lambda$0$0((Context) obj4, (ResolveInfo) obj3, this.b, (CharSequence) obj2, this.c, (TextContextMenuSession) obj);
        }
    }

    public /* synthetic */ mx0(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayList arrayList, boolean z, long j, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.d = lazyStaggeredGridMeasureContext;
        this.e = arrayList;
        this.b = z;
        this.c = j;
        this.g = lazyLayoutMeasureScope;
    }
}
