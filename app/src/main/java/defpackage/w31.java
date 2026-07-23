package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w31 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CoroutineScope c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;

    public /* synthetic */ w31(String str, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        this.a = i;
        this.b = str;
        this.c = coroutineScope;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.g;
        MutableState mutableState2 = this.e;
        MutableState mutableState3 = this.d;
        String str = this.b;
        ff ffVar = (ff) obj;
        switch (i) {
            case 0:
                ffVar.getClass();
                Boolean bool = Boolean.TRUE;
                mutableState3.setValue(bool);
                if (!((Boolean) mutableState2.getValue()).booleanValue() && !StringsKt.isBlank(str)) {
                    mutableState2.setValue(bool);
                    BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new j20(mutableState, (Continuation) null, 1), 3, null);
                }
                break;
            default:
                ffVar.getClass();
                Boolean bool2 = Boolean.TRUE;
                mutableState3.setValue(bool2);
                if (!((Boolean) mutableState2.getValue()).booleanValue() && !StringsKt.isBlank(str)) {
                    mutableState2.setValue(bool2);
                    BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new j20(mutableState, (Continuation) null, 2), 3, null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
