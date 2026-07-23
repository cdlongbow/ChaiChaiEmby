package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxyProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yq1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    public /* synthetic */ yq1(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, int i) {
        this.a = i;
        this.b = function1;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.j = mutableState7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.j;
        MutableState mutableState2 = this.i;
        MutableState mutableState3 = this.h;
        MutableState mutableState4 = this.g;
        MutableState mutableState5 = this.e;
        MutableState mutableState6 = this.d;
        MutableState mutableState7 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                Integer intOrNull = StringsKt.toIntOrNull((String) mutableState7.getValue());
                function1.invoke(new ProxyConfig(gr1.d(mutableState6), (ProxyProtocol) mutableState5.getValue(), (String) mutableState4.getValue(), intOrNull != null ? intOrNull.intValue() : 7890, (String) mutableState3.getValue(), (String) mutableState2.getValue(), gr1.e(mutableState)));
                break;
            default:
                ye2 ye2VarG = ef2.g(mutableState7, mutableState6, mutableState5, mutableState4, mutableState3);
                mutableState7.setValue(ye2VarG.a);
                mutableState6.setValue(ye2VarG.b);
                mutableState5.setValue(ye2VarG.c);
                function1.invoke(ye2VarG);
                mutableState2.setValue("已保存 WebDAV 配置。");
                mutableState.setValue(ue2.a);
                break;
        }
        return Unit.INSTANCE;
    }
}
