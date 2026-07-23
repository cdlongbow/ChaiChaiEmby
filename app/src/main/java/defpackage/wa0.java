package defpackage;

import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wa0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wa0(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return DialogHostKt.PopulateVisibleList$lambda$12$lambda$11$lambda$10((NavBackStackEntry) obj3, z, (List) obj2, (DisposableEffectScope) obj);
            case 1:
                return PagerKt.pagerSemantics$lambda$0(z, (PagerState) obj3, (CoroutineScope) obj2, (SemanticsPropertyReceiver) obj);
            case 2:
                return SearchBarDefaults.InputField$lambda$9$lambda$8(z, (CoroutineScope) obj3, (SearchBarState) obj2, (FocusState) obj);
            default:
                return SegmentedButtonKt.interactionZIndex$lambda$19$lambda$18((State) obj3, z, (Placeable) obj2, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ wa0(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
