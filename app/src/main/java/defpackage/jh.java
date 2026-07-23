package defpackage;

import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jh(int i, Modifier modifier, Function0 function0, int i2) {
        this.a = 4;
        this.b = i;
        this.e = modifier;
        this.d = function0;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.e;
        int i3 = this.b;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                pi.c(i3, (Function0) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                pi.b((String) obj4, (ImageVector) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i2);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                lq.f((MediaItem) obj4, i3, (FocusRequester) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                int iIntValue = ((Integer) obj2).intValue();
                return PagerLazyLayoutItemProvider.Item$lambda$1((PagerLazyLayoutItemProvider) obj4, this.b, this.e, this.c, (Composer) obj, iIntValue);
            case 4:
                ((Integer) obj2).getClass();
                v72.d(i3, (Modifier) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                hb2.f((Modifier) obj3, (Function1) obj4, i3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ jh(int i, Function function, Object obj, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.d = function;
        this.e = obj;
        this.c = i2;
    }

    public /* synthetic */ jh(Object obj, int i, Object obj2, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.c = i2;
    }

    public /* synthetic */ jh(String str, ImageVector imageVector, int i, int i2) {
        this.a = 1;
        this.d = str;
        this.e = imageVector;
        this.b = i;
        this.c = i2;
    }
}
