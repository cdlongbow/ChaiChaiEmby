package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class eb0 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public db0 g;
    public int h;
    public final /* synthetic */ ib0 i;

    public eb0(ib0 ib0Var, String str) {
        this.i = ib0Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.a.resolve(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.a.resolve(sb.toString()));
            sb.setLength(length);
        }
    }

    public final fb0 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ib0 ib0Var = this.i;
            if (i >= size) {
                this.h++;
                return new fb0(ib0Var, this);
            }
            if (!ib0Var.r.exists((Path) arrayList.get(i))) {
                try {
                    ib0Var.j(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
