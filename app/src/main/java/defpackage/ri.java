package defpackage;
import com.badlogic.gdx.utils.SnapshotArray;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.compose.runtime.MutableState;

import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dns;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ri implements Callback, o31, Dns, es0, ax1 {
    public final /* synthetic */ int a;
    public Object b;

    public ri(t81 t81Var) {
        this.a = 9;
        Map map = t81Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), CollectionsKt.toMutableList((Collection) entry.getValue()));
        }
        this.b = linkedHashMap;
    }

    @Override // defpackage.ax1
    public void a(KClass kClass, KClass kClass2, xv0 xv0Var) {
        kClass.getClass();
        kClass2.getClass();
        xv0Var.getClass();
        ((zw1) this.b).i(kClass, kClass2, xv0Var, true);
    }

    @Override // defpackage.ax1
    public void c(KClass kClass, xv0 xv0Var) {
        kClass.getClass();
        xv0Var.getClass();
        ((zw1) this.b).j(kClass, new kv(xv0Var), true);
    }

    @Override // defpackage.o31
    public Object d(Object obj, Object obj2) {
        return ((xl0) this.b).apply(obj2);
    }

    @Override // defpackage.ax1
    public void e(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        ((zw1) this.b).d(kClass, function1, true);
    }

    @Override // defpackage.ax1
    public void f(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        ((zw1) this.b).g(kClass, function1, true);
    }

    @Override // defpackage.es0
    public void g(xg0 xg0Var) {
        ((MutableState) this.b).setValue(Boolean.FALSE);
        Log.d("PlayerScreen", "Logo 加载失败，已隐藏");
    }

    @Override // defpackage.ax1
    public void h(KClass kClass, Function1 function1) {
        kClass.getClass();
        ((zw1) this.b).j(kClass, new lv(function1), true);
    }

    public void i(StringBuilder sb, Iterator it) {
        rv0 rv0Var = (rv0) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(rv0.c(entry.getKey()));
            sb.append("=");
            sb.append(rv0.c(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) rv0Var.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(rv0.c(entry2.getKey()));
                sb.append("=");
                sb.append(rv0.c(entry2.getValue()));
            }
        }
    }

    public fs1 j() {
        fb0 fb0VarD;
        db0 db0Var = (db0) this.b;
        ib0 ib0Var = db0Var.d;
        synchronized (ib0Var.i) {
            db0Var.a(true);
            fb0VarD = ib0Var.d(db0Var.a.a);
        }
        if (fb0VarD != null) {
            return new fs1(fb0VarD);
        }
        return null;
    }

    public void k(jg0 jg0Var) {
        SnapshotArray snapshotArray = (SnapshotArray) this.b;
        Object[] objArrBegin = snapshotArray.begin();
        int i = snapshotArray.size;
        for (int i2 = 0; i2 < i; i2++) {
            xf0 xf0Var = (xf0) ((g01) objArrBegin[i2]);
            xf0Var.getClass();
            xf0Var.a.familyManager.b(jg0Var);
        }
        snapshotArray.end();
    }

    public h41 l(fs0 fs0Var, g41 g41Var, n12 n12Var, uu1 uu1Var) {
        h41 h41Var;
        int iAbs;
        h41 h41Var2;
        ln lnVar = fs0Var.j;
        jp1 jp1Var = fs0Var.r;
        if (lnVar.a) {
            os1 os1VarD = ((ks1) this.b).d();
            if (os1VarD != null) {
                synchronized (os1VarD.c) {
                    try {
                        qs1 qs1Var = (qs1) os1VarD.a.c.a.get(g41Var);
                        h41Var = qs1Var != null ? new h41(qs1Var.a, qs1Var.b) : null;
                        if (h41Var == null) {
                            l91 l91Var = os1VarD.b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) l91Var.b).get(g41Var);
                            if (arrayList == null) {
                                h41Var = null;
                            } else {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        h41Var2 = null;
                                        break;
                                    }
                                    us1 us1Var = (us1) arrayList.get(i);
                                    pr0 pr0Var = (pr0) us1Var.a.get();
                                    h41Var2 = pr0Var != null ? new h41(pr0Var, us1Var.b) : null;
                                    if (h41Var2 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                l91Var.a();
                                h41Var = h41Var2;
                            }
                        }
                        if (h41Var != null && !h41Var.a.a()) {
                            os1VarD.c(g41Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                h41Var = null;
            }
            if (h41Var != null) {
                pr0 pr0Var2 = h41Var.a;
                nl nlVar = pr0Var2 instanceof nl ? (nl) pr0Var2 : null;
                if (nlVar != null) {
                    Bitmap.Config config = nlVar.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (rl.b(config) && !((Boolean) tl0.u(fs0Var, is0.f)).booleanValue()) {
                        return null;
                    }
                }
                String str = (String) g41Var.b.get("coil#size");
                if (str == null) {
                    Object obj = h41Var.b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    if ((bool != null ? bool.booleanValue() : false) || (!Intrinsics.areEqual(n12Var, n12.c) && jp1Var != jp1.b)) {
                        int width = pr0Var2.getWidth();
                        int height = pr0Var2.getHeight();
                        n12 n12Var2 = pr0Var2 instanceof nl ? (n12) tl0.u(fs0Var, hs0.b) : n12.c;
                        ab0 ab0Var = n12Var.a;
                        int i2 = ab0Var instanceof ya0 ? ((ya0) ab0Var).a : Integer.MAX_VALUE;
                        ab0 ab0Var2 = n12Var2.a;
                        int iMin = Math.min(i2, ab0Var2 instanceof ya0 ? ((ya0) ab0Var2).a : Integer.MAX_VALUE);
                        ab0 ab0Var3 = n12Var.b;
                        int i3 = ab0Var3 instanceof ya0 ? ((ya0) ab0Var3).a : Integer.MAX_VALUE;
                        ab0 ab0Var4 = n12Var2.b;
                        int iMin2 = Math.min(i3, ab0Var4 instanceof ya0 ? ((ya0) ab0Var4).a : Integer.MAX_VALUE);
                        double d = ((double) iMin) / ((double) width);
                        double d2 = ((double) iMin2) / ((double) height);
                        int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? uu1.b : uu1Var).ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                qu.f();
                                return null;
                            }
                            if (d < d2) {
                                iAbs = Math.abs(iMin - width);
                            } else {
                                iAbs = Math.abs(iMin2 - height);
                                d = d2;
                            }
                        } else if (d > d2) {
                            iAbs = Math.abs(iMin - width);
                        } else {
                            iAbs = Math.abs(iMin2 - height);
                            d = d2;
                        }
                        if (iAbs > 1) {
                            int iOrdinal2 = jp1Var.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    qu.f();
                                    return null;
                                }
                                if (d <= 1.0d) {
                                }
                            } else if (d == 1.0d) {
                            }
                        }
                    }
                    return h41Var;
                }
                if (Intrinsics.areEqual(str, n12Var.toString())) {
                    return h41Var;
                }
            }
        }
        return null;
    }

    @Override // okhttp3.Dns
    public List lookup(String str) {
        boolean z;
        str.getClass();
        p61 p61Var = (p61) ((MyEmbyApp) this.b).e.get();
        if (p61Var == null || !StringsKt__StringsJVMKt.equals(p61Var.a, str, true)) {
            MyEmbyApp myEmbyApp = (MyEmbyApp) this.b;
            Proxy proxy = lr1.a;
            ProxyConfig proxyConfig = lr1.b;
            if (proxyConfig.getEnabled()) {
                if (proxyConfig.getBypassLan() && lr1.b(str)) {
                    Log.d("MyEmbyApp", "🔓 局域网不代理 DNS: " + str + " 使用系统 DNS（图片）");
                } else {
                    Proxy proxyF = MyEmbyApp.f(proxyConfig);
                    if (proxyF != null && proxyF.type() == Proxy.Type.SOCKS) {
                        List listH = myEmbyApp.h();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listH, 10));
                        Iterator it = listH.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ServerConfig) it.next()).getEffectiveServerConfig());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ServerConfig serverConfig = (ServerConfig) obj;
                            if (serverConfig.isLoggedIn() && StringsKt__StringsJVMKt.equals(serverConfig.getHost(), str, true)) {
                                arrayList2.add(obj);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            Proxy proxy2 = lr1.a;
                            Proxy proxy3 = lr1.a;
                            if ((proxy3 != null ? proxy3.type() : null) == Proxy.Type.SOCKS) {
                                z = true;
                            }
                        } else if (!arrayList2.isEmpty()) {
                            int size2 = arrayList2.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size2) {
                                    Object obj2 = arrayList2.get(i2);
                                    i2++;
                                    if (!((ServerConfig) obj2).getDirectOnly()) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                z = false;
            } else {
                z = false;
            }
        } else {
            z = p61Var.b;
        }
        try {
            List<InetAddress> listListOf = z ? CollectionsKt.listOf(InetAddress.getByAddress(str, new byte[]{0, 0, 0, 0})) : Dns.SYSTEM.lookup(str);
            if (p61Var != null && StringsKt__StringsJVMKt.equals(p61Var.a, str, true)) {
                ((MyEmbyApp) this.b).e.remove();
            }
            return listListOf;
        } catch (Throwable th) {
            if (p61Var != null && StringsKt__StringsJVMKt.equals(p61Var.a, str, true)) {
                ((MyEmbyApp) this.b).e.remove();
            }
            throw th;
        }
    }

    public g41 m(fs0 fs0Var, Object obj, wa1 wa1Var, yg0 yg0Var) {
        String strA;
        ln lnVar = fs0Var.j;
        Map map = fs0Var.e;
        if (lnVar != ln.DISABLED) {
            List list = ((ks1) this.b).d.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    strA = null;
                    break;
                }
                Pair pair = (Pair) list.get(i);
                cw0 cw0Var = (cw0) pair.component1();
                if (((KClass) pair.component2()).isInstance(obj)) {
                    cw0Var.getClass();
                    strA = cw0Var.a(obj, wa1Var);
                    if (strA != null) {
                        break;
                    }
                }
                i++;
            }
            if (strA != null) {
                if (((List) tl0.u(fs0Var, hs0.a)).isEmpty()) {
                    return new g41(strA, map);
                }
                Map mutableMap = MapsKt.toMutableMap(map);
                mutableMap.put("coil#size", wa1Var.b.toString());
                return new g41(strA, mutableMap);
            }
        }
        return null;
    }

    public void n(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        linkedHashMap.put(lowerCase, CollectionsKt.mutableListOf(str));
    }

    public boolean o(g41 g41Var, fs0 fs0Var, ag0 ag0Var) {
        os1 os1VarD;
        if (g41Var == null || !fs0Var.j.b || !ag0Var.a.a() || (os1VarD = ((ks1) this.b).d()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(ag0Var.b));
        String str = ag0Var.d;
        if (str != null) {
            linkedHashMap.put("coil#disk_cache_key", str);
        }
        pr0 pr0Var = ag0Var.a;
        Map mapQ = ku.Q(linkedHashMap);
        synchronized (os1VarD.c) {
            long size = pr0Var.getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            os1VarD.a.a(g41Var, pr0Var, mapQ, size);
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.b;
        
        cancellableContinuationImpl.resumeWith(ResultKt.createFailure(iOException));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        ((CancellableContinuationImpl) this.b).resume(response, yn.a);
    }

    @Override // defpackage.es0
    public void b(h52 h52Var) {
    }

    public ri(ks1 ks1Var, aa aaVar) {
        this.a = 7;
        this.b = ks1Var;
    }

    public ri(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new HashSet();
                break;
            case 14:
                this.b = new SnapshotArray();
                break;
        }
    }

    public /* synthetic */ ri(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public ri(Field field) {
        this.a = 12;
        this.b = field;
        field.setAccessible(true);
    }
}
