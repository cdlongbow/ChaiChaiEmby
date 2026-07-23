package defpackage;

import android.webkit.MimeTypeMap;
import fi.iki.elonen.NanoHTTPD;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class s81 implements ck0 {
    public final String a;
    public final wa1 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public s81(String str, wa1 wa1Var, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = str;
        this.b = wa1Var;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        this.f = lazy4;
        this.g = lazy5;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127 A[Catch: Exception -> 0x00e6, TryCatch #3 {Exception -> 0x00e6, blocks: (B:60:0x0121, B:62:0x0127, B:41:0x009b, B:43:0x00a4, B:45:0x00b2, B:54:0x00ea, B:56:0x00f6, B:48:0x00c8, B:50:0x00d2, B:66:0x0146, B:67:0x014d), top: B:96:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:80:0x0190 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:83:0x01af, B:22:0x004a, B:78:0x018c, B:80:0x0190, B:68:0x014e, B:70:0x0154, B:73:0x0163, B:74:0x0168, B:75:0x0169), top: B:93:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ac, code lost:
    
        if (r0 == r8) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [T, v81] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.s81 r17, kotlin.coroutines.Continuation r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s81.b(s81, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(s81 s81Var, q22 q22Var, ContinuationImpl continuationImpl) {
        p81 p81Var;
        Buffer buffer;
        s81Var.getClass();
        if (continuationImpl instanceof p81) {
            p81Var = (p81) continuationImpl;
            int i = p81Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p81Var.d = i - Integer.MIN_VALUE;
            } else {
                p81Var = new p81(s81Var, continuationImpl);
            }
        } else {
            p81Var = new p81(s81Var, continuationImpl);
        }
        Object obj = p81Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = p81Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Buffer buffer2 = new Buffer();
            p81Var.a = buffer2;
            p81Var.d = 1;
            q22Var.a.readAll(buffer2);
            if (Unit.INSTANCE == coroutine_suspended) {
                return coroutine_suspended;
            }
            buffer = buffer2;
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buffer = p81Var.a;
            ResultKt.throwOnFailure(obj);
        }
        return new p22(buffer, s81Var.e(), null);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0241  */
    /* JADX WARN: Code duplicated, block: B:157:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final Object d(s81 s81Var, fs1 fs1Var, v81 v81Var, v81 v81Var2, ContinuationImpl continuationImpl) {
        q81 q81Var;
        v81 v81Var3;
        ri riVar;
        ri riVar2;
        Object th;
        Object r11;
        db0 db0VarC;
        q22 q22Var;
        q22 q22Var2;
        fs1 fs1Var2 = fs1Var;
        v81 v81Var4 = v81Var2;
        s81Var.getClass();
        if (continuationImpl instanceof q81) {
            q81Var = (q81) continuationImpl;
            int i = q81Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                q81Var.g = i - Integer.MIN_VALUE;
            } else {
                q81Var = new q81(s81Var, continuationImpl);
            }
        } else {
            q81Var = new q81(s81Var, continuationImpl);
        }
        Object nnVar = q81Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = q81Var.g;
        ri riVar3 = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(nnVar);
            if (!s81Var.b.h.b) {
                if (fs1Var2 == null) {
                    return null;
                }
                try {
                    kb0.E(fs1Var2);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return null;
            }
            on onVar = (on) s81Var.e.getValue();
            q81Var.a = fs1Var2;
            q81Var.b = v81Var4;
            q81Var.g = 1;
            ((q30) onVar).getClass();
            int i3 = v81Var4.a;
            if (i3 != 304 || v81Var == null) {
                nnVar = ((200 > i3 || i3 >= 300) && !q30.b.contains(Boxing.boxInt(i3))) ? nn.b : new nn(v81Var4);
            } else {
                t81 t81Var = v81Var.d;
                t81 t81Var2 = v81Var4.d;
                t81Var.getClass();
                Map map = t81Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), CollectionsKt.toMutableList((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : t81Var2.a.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    linkedHashMap.put(lowerCase, CollectionsKt.toMutableList((Collection) list));
                }
                nnVar = new nn(new v81(v81Var4.a, v81Var4.b, v81Var4.c, new t81(MapsKt.toMap(linkedHashMap)), null, v81Var4.f));
            }
            if (nnVar == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                riVar2 = q81Var.c;
                v81Var3 = q81Var.b;
                v81Var4 = (v81) q81Var.a;
                try {
                    ResultKt.throwOnFailure(nnVar);
                    return riVar2.j();
                } catch (Exception e2) {
                    e = e2;
                    try {
                        ((db0) riVar2.b).a(false);
                    } catch (Exception unused2) {
                    }
                    q22Var = v81Var4.e;
                    if (q22Var != null) {
                        try {
                            kb0.E(q22Var);
                        } catch (RuntimeException e3) {
                            throw e3;
                        } catch (Exception unused3) {
                        }
                    }
                    q22Var2 = v81Var3.e;
                    if (q22Var2 != null) {
                        throw e;
                    }
                    try {
                        kb0.E(q22Var2);
                        throw e;
                    } catch (RuntimeException e4) {
                        throw e4;
                    } catch (Exception unused4) {
                        throw e;
                    }
                }
            }
            v81 v81Var5 = q81Var.b;
            fs1 fs1Var3 = (fs1) q81Var.a;
            ResultKt.throwOnFailure(nnVar);
            v81Var4 = v81Var5;
            fs1Var2 = fs1Var3;
            riVar3 = null;
        }
        v81Var3 = ((nn) nnVar).a;
        if (v81Var3 == null) {
            return riVar3;
        }
        if (fs1Var2 != null) {
            fb0 fb0Var = fs1Var2.a;
            ib0 ib0Var = fb0Var.c;
            synchronized (ib0Var.i) {
                fb0Var.close();
                db0VarC = ib0Var.c(fb0Var.a.a);
            }
            if (db0VarC != null) {
                riVar = new ri(db0VarC, 11);
            } else {
                riVar = riVar3;
            }
        } else {
            cb0 cb0Var = (cb0) s81Var.d.getValue();
            if (cb0Var == null) {
                riVar = riVar3;
            } else {
                String str2 = s81Var.b.e;
                if (str2 == null) {
                    str2 = s81Var.a;
                }
                db0 db0VarC2 = ((gs1) cb0Var).b.c(ByteString.INSTANCE.encodeUtf8(str2).sha256().hex());
                if (db0VarC2 != null) {
                    riVar = new ri(db0VarC2, 11);
                } else {
                    riVar = riVar3;
                }
            }
        }
        if (riVar == null) {
            return riVar3;
        }
        try {
            BufferedSink bufferedSinkBuffer = Okio.buffer(s81Var.e().sink(((db0) riVar.b).b(0), false));
            try {
                hg2.Q(v81Var3, bufferedSinkBuffer);
                Unit unit = Unit.INSTANCE;
                try {
                    bufferedSinkBuffer.close();
                    th = riVar3;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
            }
            if (th != 0) {
                throw th;
            }
            q22 q22Var3 = v81Var3.e;
            if (q22Var3 != null) {
                FileSystem fileSystemE = s81Var.e();
                Path pathB = ((db0) riVar.b).b(1);
                q81Var.a = v81Var4;
                q81Var.b = v81Var3;
                q81Var.c = riVar;
                q81Var.g = 2;
                BufferedSource bufferedSource = q22Var3.a;
                BufferedSink bufferedSinkBuffer2 = Okio.buffer(fileSystemE.sink(pathB, false));
                try {
                    Boxing.boxLong(bufferedSource.readAll(bufferedSinkBuffer2));
                    if (bufferedSinkBuffer2 != null) {
                        try {
                            bufferedSinkBuffer2.close();
                        } catch (Throwable th5) {
                            r11 = th5;
                        }
                    }
                    r11 = riVar3;
                } catch (Throwable th6) {
                    Throwable th7 = th6;
                    r11 = th7;
                    if (bufferedSinkBuffer2 != null) {
                        try {
                            bufferedSinkBuffer2.close();
                            r11 = th7;
                        } catch (Throwable th8) {
                            ExceptionsKt.addSuppressed(th7, th8);
                            r11 = th7;
                        }
                    }
                }
                if (r11 != 0) {
                    throw r11;
                }
                if (Unit.INSTANCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            riVar2 = riVar;
            return riVar2.j();
        } catch (Exception e5) {
            e = e5;
            riVar2 = riVar;
            ((db0) riVar2.b).a(false);
            q22Var = v81Var4.e;
            if (q22Var != null) {
                kb0.E(q22Var);
            }
            q22Var2 = v81Var3.e;
            if (q22Var2 != null) {
                throw e;
            }
            kb0.E(q22Var2);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    public static String f(String str, String str2) {
        String mimeTypeFromExtension;
        if (str2 == null || StringsKt__StringsJVMKt.startsWith$default(str2, NanoHTTPD.MIME_PLAINTEXT, false, 2, null)) {
            if (StringsKt.isBlank(str)) {
                mimeTypeFromExtension = null;
            } else {
                String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', "");
                if (StringsKt.isBlank(strSubstringAfterLast)) {
                    mimeTypeFromExtension = null;
                } else {
                    String lowerCase = strSubstringAfterLast.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    mimeTypeFromExtension = (String) r41.a.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
            }
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        if (str2 != null) {
            return StringsKt__StringsKt.substringBefore$default(str2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    public static void h(v81 v81Var) {
        int i = v81Var.a;
        if ((200 > i || i >= 300) && i != 304) {
            throw new hr0(i9.f(i, "HTTP "));
        }
    }

    @Override // defpackage.ck0
    public final Object a(eg0 eg0Var) {
        fu fuVar = (fu) this.g.getValue();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return fuVar.a(str, new d6(1, this, s81.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 13), eg0Var);
    }

    public final FileSystem e() {
        FileSystem fileSystem;
        cb0 cb0Var = (cb0) this.d.getValue();
        return (cb0Var == null || (fileSystem = ((gs1) cb0Var).a) == null) ? this.b.f : fileSystem;
    }

    public final u81 g() {
        ri riVar = gs0.b;
        wa1 wa1Var = this.b;
        t81 t81Var = (t81) tl0.v(wa1Var, riVar);
        t81Var.getClass();
        ri riVar2 = new ri(t81Var);
        ln lnVar = wa1Var.h;
        boolean z = lnVar.a;
        boolean z2 = wa1Var.i.a && ((iu) this.f.getValue()).a();
        if (!z2 && z) {
            riVar2.n("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                riVar2.n("no-cache, only-if-cached");
            }
        } else if (lnVar.b) {
            riVar2.n("no-cache");
        } else {
            riVar2.n("no-cache, no-store");
        }
        String str = (String) tl0.v(wa1Var, gs0.a);
        t81 t81Var2 = new t81(MapsKt.toMap((LinkedHashMap) riVar2.b));
        if (tl0.v(wa1Var, gs0.c) == null) {
            return new u81(this.a, str, t81Var2, wa1Var.j);
        }
        throw new ClassCastException();
    }

    public final fk0 i(fs1 fs1Var) {
        fb0 fb0Var = fs1Var.a;
        if (fb0Var.b) {
            rd1.o("snapshot is closed");
            return null;
        }
        Path path = (Path) fb0Var.a.c.get(1);
        FileSystem fileSystemE = e();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return hg2.c(path, fileSystemE, str, fs1Var, 16);
    }

    public final v81 j(fs1 fs1Var) throws Throwable {
        Throwable th;
        v81 v81VarG;
        try {
            FileSystem fileSystemE = e();
            fb0 fb0Var = fs1Var.a;
            if (fb0Var.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystemE.source((Path) fb0Var.a.c.get(0)));
            try {
                v81VarG = hg2.G(bufferedSourceBuffer);
                try {
                    bufferedSourceBuffer.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
                v81VarG = null;
            }
            if (th == null) {
                return v81VarG;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
