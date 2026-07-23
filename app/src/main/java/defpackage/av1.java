package defpackage;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class av1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ SearchBarState c;

    public /* synthetic */ av1(SearchBarState searchBarState, CoroutineScope coroutineScope) {
        this.a = 0;
        this.c = searchBarState;
        this.b = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return SearchBarDefaults.InputField$lambda$17$lambda$16(this.c, this.b);
            case 1:
                return SearchBarKt.DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50(this.b, this.c);
            case 2:
                return SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7(this.b, this.c);
            default:
                return SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12(this.b, this.c);
        }
    }

    public /* synthetic */ av1(CoroutineScope coroutineScope, SearchBarState searchBarState, int i) {
        this.a = i;
        this.b = coroutineScope;
        this.c = searchBarState;
    }
}
