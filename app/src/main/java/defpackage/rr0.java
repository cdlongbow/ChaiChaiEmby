package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class rr0 {
    public static final Object e = new Object();
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;
    public Object d;

    public rr0(List list) {
        this.d = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.b).add(new sz1(((r31) list.get(i)).b.a));
            ((ArrayList) this.c).add(((r31) list.get(i)).c.a());
        }
    }

    public ri0 a() {
        Bits bits = (Bits) this.b;
        Bits bits2 = (Bits) this.c;
        Bits bits3 = (Bits) this.d;
        StringBuilder sb = new StringBuilder();
        if (!bits.isEmpty()) {
            sb.append("{all:");
            sb.append(ri0.a(bits));
            sb.append("}");
        }
        if (!bits2.isEmpty()) {
            sb.append("{one:");
            sb.append(ri0.a(bits2));
            sb.append("}");
        }
        if (!bits3.isEmpty()) {
            sb.append("{exclude:");
            sb.append(ri0.a(bits3));
            sb.append("}");
        }
        String string = sb.toString();
        ObjectMap objectMap = ri0.e;
        ri0 ri0Var = (ri0) objectMap.get(string, null);
        if (ri0Var != null) {
            return ri0Var;
        }
        ri0 ri0Var2 = new ri0((Bits) this.b, (Bits) this.c, (Bits) this.d);
        objectMap.put(string, ri0Var2);
        return ri0Var2;
    }

    public void b(String str, Bitmap bitmap) {
        synchronized (e) {
            ((a21) ((Map) this.d).get(str)).f = bitmap;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.c);
                sb.append('{');
                aa aaVar = (aa) ((aa) this.b).b;
                String str = "";
                while (aaVar != null) {
                    Object obj = aaVar.a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    aaVar = (aa) aaVar.b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ rr0() {
    }

    public rr0(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.c = str.concat("/");
        } else {
            this.c = str;
        }
        this.d = map;
        if (!(callback instanceof View)) {
            this.b = null;
        } else {
            this.b = ((View) callback).getContext().getApplicationContext();
        }
    }

    public rr0(String str) {
        aa aaVar = new aa();
        this.b = aaVar;
        this.d = aaVar;
        this.c = str;
    }
}
