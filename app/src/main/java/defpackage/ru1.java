package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ru1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableWindowInsets b;
    public final /* synthetic */ WindowInsets c;

    public /* synthetic */ ru1(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, int i) {
        this.a = i;
        this.b = mutableWindowInsets;
        this.c = windowInsets;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        WindowInsets windowInsets = this.c;
        MutableWindowInsets mutableWindowInsets = this.b;
        WindowInsets windowInsets2 = (WindowInsets) obj;
        switch (i) {
            case 0:
                return ScaffoldKt.Scaffold_TvnljyQ$lambda$2$lambda$1(mutableWindowInsets, windowInsets, windowInsets2);
            case 1:
                return SearchBarKt.FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64(mutableWindowInsets, windowInsets, windowInsets2);
            default:
                return SearchBarKt.SearchBarLayout$lambda$42$lambda$41(mutableWindowInsets, windowInsets, windowInsets2);
        }
    }
}
