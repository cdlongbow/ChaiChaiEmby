package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j60 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ int i;

    public /* synthetic */ j60(String str, List list, String str2, String str3, Function0 function0, Function2 function2, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = str3;
        this.g = function0;
        this.h = function2;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                u90.X(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                jg1.o(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                jg1.o(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
