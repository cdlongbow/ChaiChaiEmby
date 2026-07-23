package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sz implements Function0 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ sz(c00 c00Var, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.g = c00Var;
        this.h = function0;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.i = mutableState5;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[PHI: r0
      0x0065: PHI (r0v35 java.lang.String) = (r0v26 java.lang.String), (r0v36 java.lang.String) binds: [B:26:0x0077, B:19:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:67:0x0161  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        Object obj;
        rg0 rg0Var;
        String id;
        int i = this.a;
        int i2 = 0;
        boolean z = false;
        Object obj2 = null;
        Object obj3 = this.h;
        Object obj4 = this.i;
        MutableState mutableState = this.e;
        Object obj5 = this.g;
        MutableState mutableState2 = this.d;
        MutableState mutableState3 = this.c;
        MutableState mutableState4 = this.b;
        switch (i) {
            case 0:
                c00 c00Var = (c00) obj5;
                Function0 function0 = (Function0) obj3;
                MutableState mutableState5 = (MutableState) obj4;
                List list = (List) mutableState4.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
                }
                List list2 = (List) mutableState3.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                int i3 = 0;
                for (Object obj6 : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String string = StringsKt.trim((CharSequence) obj6).toString();
                    if (StringsKt.isBlank(string)) {
                        string = DanmakuConfig.INSTANCE.defaultApiName(i3);
                    }
                    arrayList2.add(string);
                    i3 = i4;
                }
                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i5 = 0;
                        do {
                            if (i5 < size) {
                                obj = arrayList.get(i5);
                                i5++;
                            }
                        } while (StringsKt.isBlank((String) obj));
                    }
                    mutableState.setValue(Boolean.TRUE);
                    return Unit.INSTANCE;
                }
                boolean zBooleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj7 = arrayList.get(i2);
                    i2++;
                    if (!StringsKt.isBlank((String) obj7)) {
                        obj2 = obj7;
                        str = (String) obj2;
                        if (str == null) {
                            str = "";
                        }
                        DanmakuConfig danmakuConfig = new DanmakuConfig(zBooleanValue, str, arrayList, arrayList2, MapsKt.toMap((Map) mutableState5.getValue()), false, 32, null);
                        c00Var.a.saveDanmakuConfig(danmakuConfig);
                        c00Var.b.setValue(danmakuConfig);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }
                str = (String) obj2;
                if (str == null) {
                    str = "";
                }
                DanmakuConfig danmakuConfig2 = new DanmakuConfig(zBooleanValue, str, arrayList, arrayList2, MapsKt.toMap((Map) mutableState5.getValue()), false, 32, null);
                c00Var.a.saveDanmakuConfig(danmakuConfig2);
                c00Var.b.setValue(danmakuConfig2);
                function0.invoke();
                return Unit.INSTANCE;
            case 1:
                MediaItem mediaItem = (MediaItem) obj5;
                List list3 = (List) obj3;
                Map map = (Map) obj4;
                u90.n(mutableState4, false);
                String str2 = (String) mutableState3.getValue();
                if (str2 == null) {
                    if (mediaItem != null || (id = mediaItem.getId()) == null) {
                        str2 = null;
                    } else {
                        str2 = (String) map.get(id);
                    }
                    if (str2 == null) {
                        rg0Var = (rg0) CollectionsKt.firstOrNull(list3);
                        if (rg0Var != null) {
                            obj2 = rg0Var.a;
                        }
                    } else {
                        obj2 = str2;
                    }
                } else {
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        do {
                            if (!it2.hasNext()) {
                                str2 = null;
                            }
                        } while (!Intrinsics.areEqual(((rg0) it2.next()).a, str2));
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        obj2 = str2;
                    } else {
                        if (mediaItem != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            rg0Var = (rg0) CollectionsKt.firstOrNull(list3);
                            if (rg0Var != null) {
                                obj2 = rg0Var.a;
                            }
                        } else {
                            obj2 = str2;
                        }
                    }
                }
                if (obj2 != null) {
                    mutableState3.setValue(obj2);
                    mutableState2.setValue(obj2);
                    z = true;
                    mr.A((Number) mutableState.getValue(), 1, mutableState);
                }
                return Boolean.valueOf(z);
            default:
                mutableState4.setValue(null);
                mutableState3.setValue(null);
                mutableState2.setValue(null);
                return Boolean.valueOf(u90.y((List) obj5, mutableState, (MutableState) obj4, (MutableState) obj3));
        }
    }

    public /* synthetic */ sz(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, List list, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.g = list;
        this.e = mutableState4;
        this.i = mutableState5;
        this.h = mutableState6;
    }

    public /* synthetic */ sz(MediaItem mediaItem, List list, MutableState mutableState, MutableState mutableState2, Map map, MutableState mutableState3, MutableState mutableState4) {
        this.g = mediaItem;
        this.h = list;
        this.b = mutableState;
        this.c = mutableState2;
        this.i = map;
        this.d = mutableState3;
        this.e = mutableState4;
    }
}
