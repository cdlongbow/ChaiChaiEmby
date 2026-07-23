package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ t4(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(i3.a);
                return Unit.INSTANCE;
            case 1:
                function1.invoke(i3.b);
                return Unit.INSTANCE;
            case 2:
                function1.invoke(i3.c);
                return Unit.INSTANCE;
            case 3:
                function1.invoke(i3.d);
                return Unit.INSTANCE;
            case 4:
                return ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$22$lambda$21(function1);
            case 5:
                function1.invoke(SystemTimeDisplayMode.OFF);
                return Unit.INSTANCE;
            case 6:
                function1.invoke(SystemTimeDisplayMode.MENU_ONLY);
                return Unit.INSTANCE;
            case 7:
                function1.invoke(SystemTimeDisplayMode.ALWAYS);
                return Unit.INSTANCE;
            case 8:
                function1.invoke(0);
                return Unit.INSTANCE;
            case 9:
                function1.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            case 10:
                return RetainedEffectKt.RetainedEffect$lambda$1$0(function1);
            case 11:
                return RetainedEffectKt.RetainedEffect$lambda$0$0(function1);
            case 12:
                return RetainedEffectKt.RetainedEffect$lambda$2$0(function1);
            case 13:
                return RetainedEffectKt.RetainedEffect$lambda$3$0(function1);
            case 14:
                return SearchBarKt.DockedSearchBar_EQC0FA8$lambda$24$lambda$23(function1);
            default:
                function1.invoke(null);
                return Unit.INSTANCE;
        }
    }
}
