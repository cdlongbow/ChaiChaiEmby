package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridState$prefetchScope$1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s60 implements Function1 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ s60(int i, MeasureScope measureScope, Ref.ObjectRef objectRef, ArrayList arrayList, Arrangement.Vertical vertical, State state) {
        this.d = i;
        this.e = measureScope;
        this.g = objectRef;
        this.b = arrayList;
        this.h = vertical;
        this.c = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                xw xwVar = new xw(9);
                List list = this.b;
                lazyListScope.items(list.size(), new w5(15, xwVar, list), new x5(list, 15), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new m90(list, (String) obj5, (String) obj4, this.d, (FocusRequester) obj3, function1, 0)));
                return Unit.INSTANCE;
            case 1:
                return LazyGridState$prefetchScope$1.scheduleLinePrefetch$lambda$0$0$0$0(this.b, (Ref.IntRef) obj5, (List) obj4, (Function1) obj2, this.d, (LazyGridMeasureResult) obj3, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
            default:
                return WideNavigationRailKt.AnonymousClass1.AnonymousClass2.measure_3p2s80s$lambda$6(this.d, (MeasureScope) obj5, (Ref.ObjectRef) obj4, this.b, (Arrangement.Vertical) obj3, (State) obj2, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ s60(ArrayList arrayList, Ref.IntRef intRef, List list, Function1 function1, int i, LazyGridMeasureResult lazyGridMeasureResult) {
        this.b = arrayList;
        this.e = intRef;
        this.g = list;
        this.c = function1;
        this.d = i;
        this.h = lazyGridMeasureResult;
    }

    public /* synthetic */ s60(List list, String str, String str2, int i, FocusRequester focusRequester, Function1 function1) {
        this.b = list;
        this.e = str;
        this.g = str2;
        this.d = i;
        this.h = focusRequester;
        this.c = function1;
    }
}
