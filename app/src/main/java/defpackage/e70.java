package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e70 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ e70(String str, boolean z, ExoPlayer exoPlayer, Context context, ArrayList arrayList, qk1 qk1Var, Function1 function1, Function0 function0, Function0 function2) {
        this.e = str;
        this.b = z;
        this.g = exoPlayer;
        this.h = context;
        this.i = arrayList;
        this.j = qk1Var;
        this.k = function1;
        this.c = function0;
        this.d = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        int i = this.a;
        Function0 function0 = this.d;
        Function0 function1 = this.c;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        boolean z = this.b;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                Map map = (Map) obj6;
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                MutableState mutableState3 = (MutableState) obj2;
                String str = (String) obj;
                str.getClass();
                ((MutableState) obj5).setValue(null);
                if (((List) obj7).isEmpty()) {
                    zBooleanValue = z ? ((Boolean) function1.invoke()).booleanValue() : ((Boolean) function0.invoke()).booleanValue();
                } else {
                    String str2 = (String) map.get(str);
                    if (str2 == null) {
                        zBooleanValue = false;
                    } else {
                        mutableState.setValue(str2);
                        mutableState2.setValue(str2);
                        zBooleanValue = true;
                        mr.A((Number) mutableState3.getValue(), 1, mutableState3);
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                ExoPlayer exoPlayer = (ExoPlayer) obj6;
                Context context = (Context) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                qk1 qk1Var = (qk1) obj3;
                Function1 function2 = (Function1) obj2;
                h42 h42Var = (h42) obj;
                h42Var.getClass();
                String str3 = h42Var.a;
                g52 g52Var = h42Var.d;
                boolean zAreEqual = Intrinsics.areEqual(str3, (String) obj7);
                if (!z || g52Var != null) {
                    n42.c(exoPlayer, h42Var, context);
                }
                if (g52Var != null || h42Var.e != null || (z && Intrinsics.areEqual(str3, "subtitle_off"))) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj8 = arrayList.get(i2);
                        i2++;
                        h42 h42Var2 = (h42) obj8;
                        if (h42Var2.d != null || h42Var2.e != null) {
                            arrayList2.add(obj8);
                        }
                    }
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < size2) {
                            Object obj9 = arrayList2.get(i3);
                            i3++;
                            if (!Intrinsics.areEqual(((h42) obj9).a, str3)) {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                        }
                    }
                    if (i4 >= 0 || (z && Intrinsics.areEqual(str3, "subtitle_off"))) {
                        qk1Var.invoke(h42Var, Integer.valueOf(i4), Boolean.valueOf(zAreEqual));
                    }
                }
                function2.invoke(Boolean.FALSE);
                function1.invoke();
                function0.invoke();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e70(List list, boolean z, Function0 function0, Function0 function1, Map map, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.e = list;
        this.b = z;
        this.c = function0;
        this.d = function1;
        this.g = map;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = mutableState3;
        this.k = mutableState4;
    }
}
