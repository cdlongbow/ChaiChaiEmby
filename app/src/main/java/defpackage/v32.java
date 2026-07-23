package defpackage;

import android.util.Base64;
import androidx.datastore.preferences.core.Preferences;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class v32 implements FlowCollector {
    public final /* synthetic */ int a;
    public final /* synthetic */ FlowCollector b;
    public final /* synthetic */ y32 c;

    public /* synthetic */ v32(FlowCollector flowCollector, y32 y32Var, int i) {
        this.a = i;
        this.b = flowCollector;
        this.c = y32Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        u32 u32Var;
        o32 o32Var;
        x32 x32Var;
        int i = this.a;
        y32 y32Var = this.c;
        FlowCollector flowCollector = this.b;
        switch (i) {
            case 0:
                if (continuation instanceof u32) {
                    u32Var = (u32) continuation;
                    int i2 = u32Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        u32Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        u32Var = new u32(this, continuation);
                    }
                } else {
                    u32Var = new u32(this, continuation);
                }
                Object obj2 = u32Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = u32Var.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    Set setEmptySet = (Set) ((Preferences) obj).get(y32Var.b);
                    if (setEmptySet == null) {
                        setEmptySet = SetsKt.emptySet();
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = setEmptySet.iterator();
                    while (it.hasNext()) {
                        List listSplit$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"|"}, false, 0, 6, (Object) null);
                        if (listSplit$default.size() != 3) {
                            o32Var = null;
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode((String) listSplit$default.get(1), 2);
                                bArrDecode.getClass();
                                Charset charset = Charsets.UTF_8;
                                String str = new String(bArrDecode, charset);
                                byte[] bArrDecode2 = Base64.decode((String) listSplit$default.get(2), 2);
                                bArrDecode2.getClass();
                                o32Var = new o32((String) listSplit$default.get(0), str, new String(bArrDecode2, charset));
                            } catch (Exception unused) {
                                o32Var = null;
                            }
                        }
                        if (o32Var != null) {
                            arrayList.add(o32Var);
                        }
                        break;
                    }
                    List listSortedWith = CollectionsKt.sortedWith(arrayList, new k00(15));
                    u32Var.c = null;
                    u32Var.e = null;
                    u32Var.g = null;
                    u32Var.h = null;
                    u32Var.b = 1;
                    if (flowCollector.emit(listSortedWith, u32Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof x32) {
                    x32Var = (x32) continuation;
                    int i4 = x32Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        x32Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        x32Var = new x32(this, continuation);
                    }
                } else {
                    x32Var = new x32(this, continuation);
                }
                Object obj3 = x32Var.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = x32Var.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj3);
                    Object obj4 = ((Preferences) obj).get(y32Var.c);
                    x32Var.c = null;
                    x32Var.e = null;
                    x32Var.g = null;
                    x32Var.h = null;
                    x32Var.b = 1;
                    if (flowCollector.emit(obj4, x32Var) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj3);
                }
                return Unit.INSTANCE;
        }
    }
}
