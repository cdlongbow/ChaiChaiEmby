package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k12 implements i12 {
    @Override // defpackage.i12
    public final ks1 a(Context context) {
        xr0 xr0Var = new xr0(context);
        ri riVar = l12.b;
        Unit unit = Unit.INSTANCE;
        Map map = xr0Var.f.a;
        if (unit != null) {
            map.put(riVar, unit);
        } else {
            map.remove(riVar);
        }
        return xr0Var.a();
    }
}
