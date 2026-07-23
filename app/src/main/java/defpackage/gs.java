package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gs implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ gs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.j = obj6;
        this.k = obj7;
        this.l = obj8;
        this.m = obj9;
        this.n = obj10;
        this.o = obj11;
        this.p = obj12;
        this.q = obj13;
        this.r = obj14;
        this.s = obj15;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$13((ComposableLambdaImpl) obj3, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.b, this.c, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                u90.N((MediaItem) obj3, (String) this.e, (VideoVersionPrioritySettings) this.g, (r40) this.h, (List) this.i, (Function0) this.j, (Function1) this.k, (Function0) this.l, (Function0) this.m, (Function1) this.n, (Function1) this.o, (Function1) this.p, (Function0) this.q, (Function0) this.r, (Function1) this.s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1), RecomposeScopeImplKt.updateChangedFlags(this.c));
                return Unit.INSTANCE;
        }
    }
}
