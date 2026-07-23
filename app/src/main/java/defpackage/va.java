package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class va implements db {
    public final ArrayList a;

    public va() {
        this.a = new ArrayList();
    }

    @Override // defpackage.db
    public ej a() {
        ArrayList arrayList = this.a;
        return ((dw0) arrayList.get(0)).c() ? new lm0(arrayList, 1) : new ed1(arrayList);
    }

    @Override // defpackage.db
    public List b() {
        return this.a;
    }

    @Override // defpackage.db
    public boolean c() {
        ArrayList arrayList = this.a;
        return arrayList.size() == 1 && ((dw0) arrayList.get(0)).c();
    }

    public void d(Path path) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ac2 ac2Var = (ac2) arrayList.get(size);
            Matrix matrix = wd2.a;
            if (ac2Var != null && !ac2Var.a) {
                wd2.a(path, ac2Var.d.l() / 100.0f, ac2Var.e.l() / 100.0f, ac2Var.f.l() / 360.0f);
            }
        }
    }

    public va(ArrayList arrayList) {
        this.a = arrayList;
    }
}
