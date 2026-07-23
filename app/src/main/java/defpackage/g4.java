package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ y32 c;

    public /* synthetic */ g4(CoroutineScope coroutineScope, y32 y32Var, int i) {
        this.a = i;
        this.b = coroutineScope;
        this.c = y32Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        y32 y32Var = this.c;
        switch (i) {
            case 0:
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new i6(y32Var, (String) obj, null, 0), 3, null);
                break;
            case 1:
                o32 o32Var = (o32) obj;
                o32Var.getClass();
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new l6(o32Var, y32Var, null, 0), 3, null);
                break;
            case 2:
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new i6(y32Var, (String) obj, null, 1), 3, null);
                break;
            case 3:
                o32 o32Var2 = (o32) obj;
                o32Var2.getClass();
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new l6(o32Var2, y32Var, null, 1), 3, null);
                break;
            case 4:
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new i6(y32Var, (String) obj, null, 2), 3, null);
                break;
            default:
                o32 o32Var3 = (o32) obj;
                o32Var3.getClass();
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new l6(o32Var3, y32Var, null, 2), 3, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
