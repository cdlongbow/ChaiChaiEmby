package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ls implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ls(WindowInsets windowInsets, Function2 function2, Function2 function3, Function2 function4, int i, Function2 function5, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function6) {
        this.a = 2;
        this.c = windowInsets;
        this.d = function2;
        this.e = function3;
        this.g = function4;
        this.b = i;
        this.h = function5;
        this.i = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.j = function6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$5((ComposableLambdaImpl) obj9, this.d, this.e, this.g, this.h, this.i, this.j, this.b, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                u90.W((List) obj9, (LazyListState) obj8, (String) obj7, (Map) obj6, (Function1) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.INSTANCE;
            default:
                return ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$15$lambda$14((WindowInsets) obj9, (Function2) obj8, (Function2) obj7, (Function2) obj6, this.b, (Function2) obj5, (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) obj4, (Function2) obj3, (SubcomposeMeasureScope) obj, (Constraints) obj2);
        }
    }

    public /* synthetic */ ls(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
        this.j = obj7;
        this.b = i;
    }
}
