package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xh0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ xh0(int i, MutableState mutableState, String str) {
        this.a = i;
        this.b = str;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.menuAnchor_2Hz36ac$lambda$0(str, mutableState);
            case 1:
                if (StringsKt.isBlank((String) mutableState.getValue()) && !StringsKt.isBlank(str)) {
                    mutableState.setValue(str);
                }
                return Unit.INSTANCE;
            default:
                if (StringsKt.isBlank((String) mutableState.getValue()) && !StringsKt.isBlank(str)) {
                    mutableState.setValue(str);
                }
                return Unit.INSTANCE;
        }
    }
}
