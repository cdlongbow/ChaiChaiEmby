package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
public final class ab {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public ab(ds dsVar) {
        this.a = CollectionsKt.toMutableList((Collection) dsVar.a);
        this.b = CollectionsKt.toMutableList((Collection) dsVar.b);
        this.c = CollectionsKt.toMutableList((Collection) dsVar.c);
        List list = (List) dsVar.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c0((Pair) it.next(), 9));
        }
        this.d = arrayList;
        List list2 = (List) dsVar.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new cs((a20) it2.next(), 0));
        }
        this.e = arrayList2;
    }

    public void a(bk0 bk0Var, KClass kClass) {
        ((ArrayList) this.d).add(new z7(10, bk0Var, kClass));
    }

    public ab(ta taVar, ta taVar2, ua uaVar, ua uaVar2, ta taVar3) {
        this.a = taVar;
        this.b = taVar2;
        this.c = uaVar;
        this.d = uaVar2;
        this.e = taVar3;
    }

    public ab(Drawable.Callback callback) {
        this.a = new j61();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = ".ttf";
        if (!(callback instanceof View)) {
            r01.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getAssets();
        }
    }

    public ab(ta taVar, ua uaVar, ua uaVar2, ua uaVar3, ua uaVar4) {
        this.a = taVar;
        this.c = uaVar;
        this.d = uaVar2;
        this.b = uaVar3;
        this.e = uaVar4;
    }
}
