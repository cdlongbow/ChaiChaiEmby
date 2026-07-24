package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.compose.ui.graphics.painter.Painter;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;
import okio.FileSystem;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public class aa implements d62, ww1, zc1 {
    public Object a;
    public Object b;

    public aa(Context context) {
        context.getClass();
        this.a = context.getApplicationContext().getSharedPreferences("home_snapshot_cache", 0);
        this.b = new Gson();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x0069, TryCatch #0 {IOException -> 0x0069, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
    public static aa f(String... strArr) {
        String str;
        try {
            ByteString[] byteStringArr = new ByteString[strArr.length];
            Buffer buffer = new Buffer();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = tv0.e;
                buffer.writeByte(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i2 < i3) {
                                buffer.writeUtf8(str2, i2, i3);
                            }
                            buffer.writeUtf8(str);
                            i2 = i3 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            buffer.writeUtf8(str2, i2, i3);
                        }
                        buffer.writeUtf8(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    buffer.writeUtf8(str2, i2, length);
                }
                buffer.writeByte(34);
                buffer.readByte();
                byteStringArr[i] = buffer.readByteString();
            }
            return new aa((String[]) strArr.clone(), Options.of(byteStringArr));
        } catch (IOException e) {
            lm.d(e);
            return null;
        }
    }

    public static String h(String str, String str2, boolean z) throws NoSuchAlgorithmException {
        String str3 = str + "|" + str2 + "|" + z;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        return kb0.x("home_snapshot_", ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new vi0(28), 30, (Object) null));
    }

    @Override // defpackage.zc1
    public Object a(KClass kClass, ArrayList arrayList) {
        Object objM8825constructorimpl;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class javaClass = JvmClassMappingKt.getJavaClass(kClass);
        Object yc1Var = concurrentHashMap.get(javaClass);
        if (yc1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (yc1Var = new yc1()))) != null) {
            yc1Var = objPutIfAbsent;
        }
        yc1 yc1Var2 = (yc1) yc1Var;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(new yv0((KType) obj));
        }
        ConcurrentHashMap concurrentHashMap2 = yc1Var2.a;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                
                objM8825constructorimpl = (xv0 ((Function2) this.a).invoke(kClass, arrayList));
            } catch (Throwable th) {
                
                objM8825constructorimpl = ResultKt.createFailure(th);
            }
            Result resultM8824boximpl = Result.m8824boximpl(objM8825constructorimpl);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, resultM8824boximpl);
            obj2 = objPutIfAbsent2 == null ? resultM8824boximpl : objPutIfAbsent2;
        }
        obj2.getClass();
        return ((Result) obj2).getValue();
    }

    @Override // defpackage.d62
    public void b(pr0 pr0Var) {
        Painter painterC;
        fs0 fs0Var = (fs0) this.a;
        kf kfVar = (kf) this.b;
        Painter painterA = pr0Var != null ? as0.a(pr0Var, fs0Var.a, kfVar.l) : null;
        if (painterA == null && ((Boolean) tl0.u(fs0Var, tl0.a)).booleanValue() && (painterC = kfVar.c()) != null) {
            painterA = painterC;
        }
        kf.b(kfVar, new gf(painterA));
    }

    @Override // defpackage.ww1
    public xv0 c(KClass kClass) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class javaClass = JvmClassMappingKt.getJavaClass(kClass);
        Object knVar = concurrentHashMap.get(javaClass);
        if (knVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (knVar = new kn((xv0) ((Function1) this.a).invoke(kClass))))) != null) {
            knVar = objPutIfAbsent;
        }
        return ((kn) knVar).a;
    }

    public dq0 d(String str, String str2, boolean z) throws NoSuchAlgorithmException {
        str2.getClass();
        if (str == null || StringsKt.isBlank(str) || StringsKt.isBlank(str2)) {
            return null;
        }
        String strH = h(str, str2, z);
        dq0 dq0VarE = e(strH, str, str2, z, true);
        if (dq0VarE != null) {
            return dq0VarE;
        }
        dq0 dq0VarE2 = e("last_home_snapshot", str, str2, z, false);
        if (dq0VarE2 == null) {
            return null;
        }
        try {
            ((SharedPreferences) this.a).edit().putString(strH, ((Gson) this.b).toJson(dq0VarE2)).apply();
            return dq0VarE2;
        } catch (Exception e) {
            Log.w("HomeSnapshotCache", "迁移首页快照失败", e);
            return dq0VarE2;
        }
    }

    public dq0 e(String str, String str2, String str3, boolean z, boolean z2) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.a;
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            try {
                dq0 dq0Var = (dq0) ((Gson) this.b).fromJson(string, dq0.class);
                if (dq0Var != null) {
                    boolean z3 = true;
                    if (dq0Var.getSchemaVersion() == 1 && Intrinsics.areEqual(dq0Var.getServerId(), str2) && Intrinsics.areEqual(dq0Var.getUserId(), str3) && dq0Var.getHidePlayed() == z) {
                        long jE = dq0Var.getSavedAtMillis();
                        if (jE > 0 && System.currentTimeMillis() - jE <= 604800000) {
                            z3 = false;
                        }
                        if (!z3) {
                            return dq0Var;
                        }
                    }
                    if (z2) {
                        sharedPreferences.edit().remove(str).apply();
                        return null;
                    }
                }
            } catch (Exception e) {
                if (z2) {
                    sharedPreferences.edit().remove(str).apply();
                }
                Log.w("HomeSnapshotCache", "读取首页快照失败", e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    public wa1 g(fs0 fs0Var, n12 n12Var) {
        Context context;
        n12 n12Var2;
        boolean z;
        boolean z2;
        Map mutableMap;
        Context context2 = fs0Var.a;
        uu1 uu1Var = fs0Var.q;
        jp1 jp1Var = fs0Var.r;
        FileSystem fileSystem = fs0Var.f;
        ln lnVar = fs0Var.j;
        ln lnVar2 = fs0Var.k;
        ln lnVar3 = fs0Var.l;
        ri riVar = is0.b;
        Bitmap.Config config = (Bitmap.Config) tl0.u(fs0Var, riVar);
        ri riVar2 = is0.g;
        boolean zBooleanValue = ((Boolean) tl0.u(fs0Var, riVar2)).booleanValue();
        ri riVar3 = hs0.a;
        boolean z3 = ((List) tl0.u(fs0Var, riVar3)).isEmpty() || ArraysKt.contains(ce2.a, (Bitmap.Config) tl0.u(fs0Var, riVar));
        if (rl.b((Bitmap.Config) tl0.u(fs0Var, riVar))) {
            if (!rl.b((Bitmap.Config) tl0.u(fs0Var, riVar)) || ((Boolean) tl0.u(fs0Var, is0.f)).booleanValue()) {
                context = context2;
                n12Var2 = n12Var;
                if (((zm0) this.b).c(n12Var2)) {
                }
                if (z3 || !z) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue || !((List) tl0.u(fs0Var, riVar3)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                mutableMap = MapsKt.toMutableMap(MapsKt.plus(fs0Var.u.n.a, fs0Var.s.a));
                if (config != ((Bitmap.Config) tl0.u(fs0Var, riVar))) {
                    if (config != null) {
                        mutableMap.put(riVar, config);
                    } else {
                        mutableMap.remove(riVar);
                    }
                }
                if (z2 != ((Boolean) tl0.u(fs0Var, riVar2)).booleanValue()) {
                    mutableMap.put(riVar2, Boolean.valueOf(z2));
                }
                return new wa1(context, n12Var2, uu1Var, jp1Var, null, fileSystem, lnVar, lnVar2, lnVar3, new pi0(ku.Q(mutableMap)));
            }
            context = context2;
            n12Var2 = n12Var;
            z = false;
            if (z3) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z2 = false;
            } else {
                z2 = false;
            }
            mutableMap = MapsKt.toMutableMap(MapsKt.plus(fs0Var.u.n.a, fs0Var.s.a));
            if (config != ((Bitmap.Config) tl0.u(fs0Var, riVar))) {
                if (config != null) {
                    mutableMap.put(riVar, config);
                } else {
                    mutableMap.remove(riVar);
                }
            }
            if (z2 != ((Boolean) tl0.u(fs0Var, riVar2)).booleanValue()) {
                mutableMap.put(riVar2, Boolean.valueOf(z2));
            }
            return new wa1(context, n12Var2, uu1Var, jp1Var, null, fileSystem, lnVar, lnVar2, lnVar3, new pi0(ku.Q(mutableMap)));
        }
        context = context2;
        n12Var2 = n12Var;
        z = true;
        if (z3) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z2 = false;
        } else {
            z2 = false;
        }
        mutableMap = MapsKt.toMutableMap(MapsKt.plus(fs0Var.u.n.a, fs0Var.s.a));
        if (config != ((Bitmap.Config) tl0.u(fs0Var, riVar))) {
            if (config != null) {
                mutableMap.put(riVar, config);
            } else {
                mutableMap.remove(riVar);
            }
        }
        if (z2 != ((Boolean) tl0.u(fs0Var, riVar2)).booleanValue()) {
            mutableMap.put(riVar2, Boolean.valueOf(z2));
        }
        return new wa1(context, n12Var2, uu1Var, jp1Var, null, fileSystem, lnVar, lnVar2, lnVar3, new pi0(ku.Q(mutableMap)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    public void i() {
        dq0 dq0Var;
        Pair pair;
        SharedPreferences sharedPreferences = (SharedPreferences) this.a;
        Map<String, ?> all = sharedPreferences.getAll();
        all.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            Pair pair2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            Object value = next.getValue();
            key.getClass();
            if (StringsKt.startsWith$default(key, "home_snapshot_", false, 2, null)) {
                String str = value instanceof String ? (String) value : null;
                if (str != null) {
                    try {
                        dq0Var = (dq0) ((Gson) this.b).fromJson(str, dq0.class);
                    } catch (Exception unused) {
                        dq0Var = null;
                    }
                    if (dq0Var == null || dq0Var.getSchemaVersion() != 1) {
                        pair = TuplesKt.to(key, null);
                    } else {
                        long jE = dq0Var.getSavedAtMillis();
                        if (jE <= 0 || System.currentTimeMillis() - jE > 604800000) {
                            pair = TuplesKt.to(key, null);
                        } else {
                            pair = TuplesKt.to(key, Long.valueOf(dq0Var.getSavedAtMillis()));
                        }
                    }
                    pair2 = pair;
                }
            }
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((Pair) obj).getSecond() == null) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            arrayList3.add((String) ((Pair) obj2).getFirst());
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList.size();
        while (i < size3) {
            Object obj3 = arrayList.get(i);
            i++;
            Pair pair3 = (Pair) obj3;
            String str2 = (String) pair3.component1();
            Long l = (Long) pair3.component2();
            Pair pair4 = l != null ? TuplesKt.to(str2, Long.valueOf(l.longValue())) : null;
            if (pair4 != null) {
                arrayList4.add(pair4);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList4, new k00(6));
        if (listSortedWith.size() > 30) {
            List listDrop = CollectionsKt.drop(listSortedWith, 30);
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDrop, 10));
            Iterator it2 = listDrop.iterator();
            while (it2.hasNext()) {
                arrayList5.add((String) ((Pair) it2.next()).getFirst());
            }
            CollectionsKt.addAll(mutableList, arrayList5);
        }
        if (mutableList.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator it3 = mutableList.iterator();
        while (it3.hasNext()) {
            editorEdit.remove((String) it3.next());
        }
        editorEdit.apply();
    }

    public wa1 j(wa1 wa1Var) {
        boolean z;
        pi0 pi0Var = wa1Var.j;
        ri riVar = is0.b;
        if (!rl.b((Bitmap.Config) tl0.v(wa1Var, riVar)) || ((zm0) this.b).e()) {
            z = false;
        } else {
            pi0Var.getClass();
            Map mutableMap = MapsKt.toMutableMap(pi0Var.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                mutableMap.put(riVar, config);
            } else {
                mutableMap.remove(riVar);
            }
            pi0Var = new pi0(ku.Q(mutableMap));
            z = true;
        }
        return z ? new wa1(wa1Var.a, wa1Var.b, wa1Var.c, wa1Var.d, wa1Var.e, wa1Var.f, wa1Var.g, wa1Var.h, wa1Var.i, pi0Var) : wa1Var;
    }

    public /* synthetic */ aa(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public aa(Function1 function1) {
        this.a = function1;
        this.b = new ConcurrentHashMap();
    }

    public aa(Function2 function2) {
        this.a = function2;
        this.b = new ConcurrentHashMap();
    }
}
