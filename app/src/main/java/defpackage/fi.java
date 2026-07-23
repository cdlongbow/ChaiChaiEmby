package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fi implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ fi(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, SnapshotStateList snapshotStateList, Function1 function1) {
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.o = snapshotStateList;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.j = mutableState7;
        this.k = mutableState8;
        this.l = mutableState9;
        this.m = mutableState10;
        this.n = mutableState11;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                MutableState mutableState = (MutableState) obj2;
                MutableState mutableState2 = this.c;
                ch chVar = (ch) mutableState2.getValue();
                if (chVar != null) {
                    List list = chVar.b;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        MutableState mutableState3 = this.d;
                        if (zHasNext) {
                            Object next = it.next();
                            if (((Set) mutableState3.getValue()).contains(((BackupRouteConfig) next).getId())) {
                                arrayList.add(next);
                            }
                        } else {
                            boolean zIsEmpty = arrayList.isEmpty();
                            MutableState mutableState4 = this.e;
                            if (zIsEmpty) {
                                mutableState4.setValue("请至少选择一条备选线路");
                            } else {
                                pi.l(snapshotStateList, this.g, this.h, this.i, this.j, this.k, this.l, this.m, mutableState2, mutableState3, mutableState4, mutableState, this.b, arrayList);
                            }
                        }
                    }
                }
                break;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                pf2 pf2Var = (pf2) obj;
                MutableState mutableState5 = this.c;
                if (((String) mutableState5.getValue()) == null) {
                    MutableState mutableState6 = this.d;
                    if (((gd1) mutableState6.getValue()) == null && ((hd1) this.e.getValue()) == null) {
                        MutableState mutableState7 = this.g;
                        MutableState mutableState8 = this.h;
                        MutableState mutableState9 = this.i;
                        ye2 ye2VarG = ef2.g(mutableState7, mutableState8, mutableState9, this.j, this.k);
                        mutableState7.setValue(ye2VarG.a);
                        mutableState8.setValue(ye2VarG.b);
                        mutableState9.setValue(ye2VarG.c);
                        this.b.invoke(ye2VarG);
                        mutableState5.setValue("读取下载预览");
                        MutableState mutableState10 = this.l;
                        mutableState10.setValue(null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new df2(pf2Var, ye2VarG, mutableState6, mutableState10, this.m, mutableState5, null, 1), 3, null);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ fi(Function1 function1, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, pf2 pf2Var, MutableState mutableState10) {
        this.b = function1;
        this.n = coroutineScope;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.j = mutableState7;
        this.k = mutableState8;
        this.l = mutableState9;
        this.o = pf2Var;
        this.m = mutableState10;
    }
}
