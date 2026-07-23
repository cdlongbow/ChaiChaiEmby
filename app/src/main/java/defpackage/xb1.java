package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xb1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SubtitleVersionPrioritySettings b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ xb1(SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, Function1 function1, Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = subtitleVersionPrioritySettings;
        this.c = function1;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Function0 function0 = this.d;
        Function1 function1 = this.c;
        SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = this.b;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                cc1.x(subtitleVersionPrioritySettings, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            default:
                cc1.y(subtitleVersionPrioritySettings, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
