package defpackage;

import androidx.compose.foundation.style.ResolvedStyle;
import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g70 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g70(ResolvedStyle resolvedStyle, StyleOuterNode styleOuterNode, Density density, ResolvedStyle resolvedStyle2, Ref.IntRef intRef, boolean z) {
        this.c = resolvedStyle;
        this.d = styleOuterNode;
        this.e = density;
        this.g = resolvedStyle2;
        this.h = intRef;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zBooleanValue;
        int i = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj3;
                List list = (List) obj4;
                Function0 function1 = (Function0) obj2;
                Function0 function2 = (Function0) obj;
                if (!((List) obj5).isEmpty()) {
                    zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
                } else if (list.isEmpty()) {
                    zBooleanValue = this.b ? ((Boolean) function2.invoke()).booleanValue() : false;
                } else {
                    zBooleanValue = ((Boolean) function1.invoke()).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                return StyleOuterNode.resolveStyleAndInvalidate$lambda$0((ResolvedStyle) obj5, (StyleOuterNode) obj4, (Density) obj3, (ResolvedStyle) obj2, (Ref.IntRef) obj, this.b);
        }
    }

    public /* synthetic */ g70(List list, Function0 function0, List list2, Function0 function1, boolean z, Function0 function2) {
        this.c = list;
        this.e = function0;
        this.d = list2;
        this.g = function1;
        this.b = z;
        this.h = function2;
    }
}
