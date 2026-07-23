package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ha1 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ ha1(qe qeVar, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, String str, ne neVar, MutableState mutableState4, Context context, MutableState mutableState5, jj1 jj1Var) {
        this.i = qeVar;
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.j = str;
        this.k = neVar;
        this.g = mutableState4;
        this.l = context;
        this.h = mutableState5;
        this.m = jj1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                qe qeVar = (qe) obj5;
                String str = (String) obj4;
                ne neVar = (ne) obj3;
                Context context = (Context) obj2;
                jj1 jj1Var = (jj1) obj;
                MutableState mutableState = this.c;
                if (((String) mutableState.getValue()) == null) {
                    MutableState mutableState2 = this.d;
                    if (((String) mutableState2.getValue()) == null) {
                        mutableState2.setValue(qeVar.a);
                        MutableState mutableState3 = this.e;
                        mutableState3.setValue(null);
                        MutableState mutableState4 = this.g;
                        CoroutineScope coroutineScope = this.b;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new oa1(str, qeVar, neVar, mutableState4, coroutineScope, context, mutableState, this.h, mutableState3, jj1Var, mutableState2, null), 3, null);
                    }
                }
                break;
            case 1:
                MutableState mutableState5 = (MutableState) obj4;
                MutableState mutableState6 = (MutableState) obj3;
                MutableState mutableState7 = (MutableState) obj2;
                MutableState mutableState8 = (MutableState) obj;
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new fr1(this.c, this.d, this.e, this.g, this.h, (MutableState) obj5, mutableState5, mutableState6, mutableState7, mutableState8, null), 3, null);
                break;
            default:
                Function1 function1 = (Function1) obj4;
                MutableState mutableState9 = (MutableState) obj3;
                MutableState mutableState10 = (MutableState) obj2;
                MutableState mutableState11 = (MutableState) obj;
                n2 n2Var = new n2((pf2) obj5, (Continuation) null, 13);
                MutableState mutableState12 = this.c;
                if (((String) mutableState12.getValue()) == null) {
                    MutableState mutableState13 = this.d;
                    MutableState mutableState14 = this.e;
                    MutableState mutableState15 = this.g;
                    ye2 ye2VarG = ef2.g(mutableState13, mutableState14, mutableState15, this.h, mutableState9);
                    mutableState13.setValue(ye2VarG.a);
                    mutableState14.setValue(ye2VarG.b);
                    mutableState15.setValue(ye2VarG.c);
                    function1.invoke(ye2VarG);
                    mutableState12.setValue("测试连接");
                    mutableState10.setValue(null);
                    BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new r3(n2Var, ye2VarG, mutableState10, mutableState11, mutableState12, null, 10), 3, null);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ha1(pf2 pf2Var, Function1 function1, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8) {
        this.i = pf2Var;
        this.j = function1;
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.k = mutableState6;
        this.l = mutableState7;
        this.m = mutableState8;
    }

    public /* synthetic */ ha1(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10) {
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.j = mutableState7;
        this.k = mutableState8;
        this.l = mutableState9;
        this.m = mutableState10;
    }
}
