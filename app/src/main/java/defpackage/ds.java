package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class ds {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final Lazy f;
    public final Lazy g;

    public ds(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = LazyKt.lazy(new Function0(this) { // from class: bs
            public final /* synthetic */ ds b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                ds dsVar = this.b;
                switch (i2) {
                    case 0:
                        List list6 = dsVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList, (List) ((Function0) list6.get(i3)).invoke());
                            i3++;
                        }
                        dsVar.d = CollectionsKt.emptyList();
                        return arrayList;
                    default:
                        List list7 = dsVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, (List) ((Function0) list7.get(i3)).invoke());
                            i3++;
                        }
                        dsVar.e = CollectionsKt.emptyList();
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = LazyKt.lazy(new Function0(this) { // from class: bs
            public final /* synthetic */ ds b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                int i4 = 0;
                ds dsVar = this.b;
                switch (i3) {
                    case 0:
                        List list6 = dsVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i4 < size) {
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList, (List) ((Function0) list6.get(i4)).invoke());
                            i4++;
                        }
                        dsVar.d = CollectionsKt.emptyList();
                        return arrayList;
                    default:
                        List list7 = dsVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i4 < size2) {
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, (List) ((Function0) list7.get(i4)).invoke());
                            i4++;
                        }
                        dsVar.e = CollectionsKt.emptyList();
                        return arrayList2;
                }
            }
        });
    }
}
