package defpackage;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Shadow;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.PersonInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o80 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(String str, int i, boolean z, List list, Function1 function1, MediaItem mediaItem, MutableIntState mutableIntState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.i = str;
        this.d = i;
        this.b = z;
        this.c = list;
        this.j = function1;
        this.k = mediaItem;
        this.l = mutableIntState;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                MutableIntState mutableIntState = (MutableIntState) obj2;
                MutableState mutableState = this.g;
                MutableState mutableState2 = this.h;
                return new o80((String) obj5, this.d, this.b, this.c, (Function1) obj4, (MediaItem) obj3, mutableIntState, this.e, mutableState, mutableState2, continuation);
            default:
                return new o80(this.b, this.c, this.d, (List) obj5, this.e, this.g, (Map) obj4, this.h, (MutableState) obj3, (zq0) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((o80) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        int i2 = this.d;
        List list = this.c;
        boolean z = this.b;
        Object obj4 = this.i;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                MutableIntState mutableIntState = (MutableIntState) obj2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                String str = (String) obj4;
                if (str != null) {
                    Shadow shadow = u90.o;
                    if (i2 > mutableIntState.getIntValue()) {
                        if (z) {
                            mutableIntState.setIntValue(i2);
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((PersonInfo) it.next()).getId());
                            }
                            if (!CollectionsKt.toSet(arrayList).contains(str)) {
                                ((Function1) obj5).invoke(str);
                            } else {
                                s01.E("人物页返回后恢复演员焦点: itemId=", ((MediaItem) obj3).getId(), ", personId=", str, "DetailScreen");
                                this.e.setValue(str);
                                this.g.setValue(str);
                                MutableState mutableState = this.h;
                                mr.A((Number) mutableState.getValue(), 1, mutableState);
                            }
                        }
                    }
                }
                break;
            default:
                List list2 = (List) obj4;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (z) {
                    MutableState mutableState2 = this.e;
                    if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        MutableState mutableState3 = this.g;
                        if (((Number) mutableState3.getValue()).intValue() < list.size() && i2 < 0 && !list2.isEmpty()) {
                            Map map = (Map) obj5;
                            if (list2.isEmpty()) {
                                bq0.Y(this.c, mutableState2, mutableState3, this.h, (MutableState) obj3, (Map) obj5, (zq0) obj2);
                            } else {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (!map.containsKey(((Library) it2.next()).getId())) {
                                    }
                                }
                                bq0.Y(this.c, mutableState2, mutableState3, this.h, (MutableState) obj3, (Map) obj5, (zq0) obj2);
                            }
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(boolean z, List list, int i, List list2, MutableState mutableState, MutableState mutableState2, Map map, MutableState mutableState3, MutableState mutableState4, zq0 zq0Var, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = list;
        this.d = i;
        this.i = list2;
        this.e = mutableState;
        this.g = mutableState2;
        this.j = map;
        this.h = mutableState3;
        this.k = mutableState4;
        this.l = zq0Var;
    }
}
