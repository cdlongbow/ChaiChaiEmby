package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class wp {
    public final String a;
    public List b = CollectionsKt.emptyList();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public wp(String str) {
        this.a = str;
    }

    public static void a(wp wpVar, String str, lw1 lw1Var) {
        List listEmptyList = CollectionsKt.emptyList();
        wpVar.getClass();
        lw1Var.getClass();
        listEmptyList.getClass();
        if (!wpVar.d.add(str)) {
            ag2.e(w11.e("Element with name '", str, "' is already registered in "), wpVar.a);
            return;
        }
        wpVar.c.add(str);
        wpVar.e.add(lw1Var);
        wpVar.f.add(listEmptyList);
        wpVar.g.add(false);
    }
}
