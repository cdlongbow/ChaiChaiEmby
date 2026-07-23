package defpackage;

import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class ib0 implements AutoCloseable {
    public static final Regex s = new Regex("[a-z0-9_-]{1,120}");
    public final Path a;
    public final long b;
    public final Path c;
    public final Path d;
    public final Path e;
    public final LinkedHashMap g;
    public final CoroutineScope h;
    public final Object i;
    public long j;
    public int k;
    public BufferedSink l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final gb0 r;

    public ib0(FileSystem fileSystem, Path path, CoroutineContext coroutineContext, long j) {
        this.a = path;
        this.b = j;
        if (j <= 0) {
            ra.q("maxSize <= 0");
            throw null;
        }
        this.c = path.resolve("journal");
        this.d = path.resolve("journal.tmp");
        this.e = path.resolve("journal.bkp");
        this.g = new LinkedHashMap(0, 0.75f, true);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.INSTANCE);
        this.h = CoroutineScopeKt.CoroutineScope(coroutineContextPlus.plus(CoroutineDispatcher.limitedParallelism$default(coroutineDispatcher == null ? Dispatchers.getIO() : coroutineDispatcher, 1, null, 2, null)));
        this.i = new Object();
        this.r = new gb0(fileSystem);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010e A[Catch: all -> 0x0033, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0011, B:12:0x0018, B:14:0x001e, B:16:0x002e, B:24:0x003c, B:27:0x0056, B:29:0x0065, B:31:0x0075, B:33:0x007c, B:28:0x005a, B:37:0x009c, B:39:0x00a3, B:42:0x00a8, B:44:0x00b9, B:47:0x00be, B:52:0x00fa, B:54:0x0105, B:59:0x0111, B:58:0x010e, B:48:0x00d6, B:50:0x00eb, B:51:0x00f7, B:36:0x008c, B:62:0x0115, B:63:0x011c), top: B:66:0x0003 }] */
    public static final void b(ib0 ib0Var, db0 db0Var, boolean z) {
        synchronized (ib0Var.i) {
            eb0 eb0Var = db0Var.a;
            if (!Intrinsics.areEqual(eb0Var.g, db0Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || eb0Var.f) {
                for (int i = 0; i < 2; i++) {
                    ib0Var.r.delete((Path) eb0Var.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (db0Var.c[i2] && !ib0Var.r.exists((Path) eb0Var.d.get(i2))) {
                        db0Var.a(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    Path path = (Path) eb0Var.d.get(i3);
                    Path path2 = (Path) eb0Var.c.get(i3);
                    boolean zExists = ib0Var.r.exists(path);
                    gb0 gb0Var = ib0Var.r;
                    if (zExists) {
                        gb0Var.atomicMove(path, path2);
                    } else {
                        gk0.a(gb0Var, (Path) eb0Var.c.get(i3));
                    }
                    long j = eb0Var.b[i3];
                    Long size = ib0Var.r.metadata(path2).getSize();
                    long jLongValue = size != null ? size.longValue() : 0L;
                    eb0Var.b[i3] = jLongValue;
                    ib0Var.j = (ib0Var.j - j) + jLongValue;
                }
            }
            eb0Var.g = null;
            if (eb0Var.f) {
                ib0Var.j(eb0Var);
                return;
            }
            ib0Var.k++;
            BufferedSink bufferedSink = ib0Var.l;
            bufferedSink.getClass();
            if (z || eb0Var.e) {
                eb0Var.e = true;
                bufferedSink.writeUtf8("CLEAN");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(eb0Var.a);
                for (long j2 : eb0Var.b) {
                    bufferedSink.writeByte(32).writeDecimalLong(j2);
                }
                bufferedSink.writeByte(10);
            } else {
                ib0Var.g.remove(eb0Var.a);
                bufferedSink.writeUtf8("REMOVE");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(eb0Var.a);
                bufferedSink.writeByte(10);
            }
            bufferedSink.flush();
            if (ib0Var.j > ib0Var.b) {
                ib0Var.f();
            } else if (ib0Var.k >= 2000) {
                ib0Var.f();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public static void l(String str) {
        if (s.matches(str)) {
            return;
        }
        lc1.f(mr.r("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public final db0 c(String str) {
        synchronized (this.i) {
            if (this.o) {
                throw new IllegalStateException("cache is closed");
            }
            l(str);
            e();
            eb0 eb0Var = (eb0) this.g.get(str);
            if ((eb0Var != null ? eb0Var.g : null) != null) {
                return null;
            }
            if (eb0Var != null && eb0Var.h != 0) {
                return null;
            }
            if (!this.p && !this.q) {
                BufferedSink bufferedSink = this.l;
                bufferedSink.getClass();
                bufferedSink.writeUtf8("DIRTY");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.m) {
                    return null;
                }
                if (eb0Var == null) {
                    eb0Var = new eb0(this, str);
                    this.g.put(str, eb0Var);
                }
                db0 db0Var = new db0(this, eb0Var);
                eb0Var.g = db0Var;
                return db0Var;
            }
            f();
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.i) {
            try {
                if (this.n && !this.o) {
                    for (eb0 eb0Var : (eb0[]) this.g.values().toArray(new eb0[0])) {
                        db0 db0Var = eb0Var.g;
                        if (db0Var != null) {
                            eb0 eb0Var2 = db0Var.a;
                            if (Intrinsics.areEqual(eb0Var2.g, db0Var)) {
                                eb0Var2.f = true;
                            }
                        }
                    }
                    k();
                    CoroutineScopeKt.cancel$default(this.h, null, 1, null);
                    BufferedSink bufferedSink = this.l;
                    bufferedSink.getClass();
                    bufferedSink.close();
                    this.l = null;
                    this.o = true;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                this.o = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final fb0 d(String str) {
        fb0 fb0VarA;
        synchronized (this.i) {
            if (this.o) {
                throw new IllegalStateException("cache is closed");
            }
            l(str);
            e();
            eb0 eb0Var = (eb0) this.g.get(str);
            if (eb0Var != null && (fb0VarA = eb0Var.a()) != null) {
                boolean z = true;
                this.k++;
                BufferedSink bufferedSink = this.l;
                bufferedSink.getClass();
                bufferedSink.writeUtf8("READ");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.k < 2000) {
                    z = false;
                }
                if (z) {
                    f();
                }
                return fb0VarA;
            }
            return null;
        }
    }

    public final void e() {
        synchronized (this.i) {
            try {
                if (this.n) {
                    return;
                }
                this.r.delete(this.d);
                if (this.r.exists(this.e)) {
                    boolean zExists = this.r.exists(this.c);
                    gb0 gb0Var = this.r;
                    Path path = this.e;
                    if (zExists) {
                        gb0Var.delete(path);
                    } else {
                        gb0Var.atomicMove(path, this.c);
                    }
                }
                if (this.r.exists(this.c)) {
                    try {
                        h();
                        g();
                        this.n = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            gk0.b(this.r, this.a);
                            this.o = false;
                            m();
                            this.n = true;
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            this.o = false;
                            throw th;
                        }
                    }
                }
                m();
                this.n = true;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new hb0(this, null, 0), 3, null);
    }

    public final void g() throws IOException {
        Iterator it = this.g.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            eb0 eb0Var = (eb0) it.next();
            int i = 0;
            if (eb0Var.g == null) {
                while (i < 2) {
                    j += eb0Var.b[i];
                    i++;
                }
            } else {
                eb0Var.g = null;
                while (i < 2) {
                    Path path = (Path) eb0Var.c.get(i);
                    gb0 gb0Var = this.r;
                    gb0Var.delete(path);
                    gb0Var.delete((Path) eb0Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.j = j;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    public final void h() throws Throwable {
        gb0 gb0Var = this.r;
        Path path = this.c;
        BufferedSource bufferedSourceBuffer = Okio.buffer(gb0Var.source(path));
        try {
            String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
            if (!Intrinsics.areEqual("libcore.io.DiskLruCache", utf8LineStrict) || !Intrinsics.areEqual(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, utf8LineStrict2) || !Intrinsics.areEqual(String.valueOf(3), utf8LineStrict3) || !Intrinsics.areEqual(String.valueOf(2), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict3 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    i(bufferedSourceBuffer.readUtf8LineStrict());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.g.size();
                    if (bufferedSourceBuffer.exhausted()) {
                        this.l = Okio.buffer(new ui0(gb0Var.appendingSink(path), new c(this, 29)));
                    } else {
                        m();
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        bufferedSourceBuffer.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th == null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    ExceptionsKt.addSuppressed(th, th3);
                }
            }
            if (th == null) {
                throw th;
            }
        }
    }

    public final void i(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            vm0.m(kb0.x("unexpected journal line: ", str));
            return;
        }
        int i = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = this.g;
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf$default == 6 && StringsKt__StringsJVMKt.startsWith$default(str, "REMOVE", false, 2, null)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf$default2);
        }
        Object eb0Var = linkedHashMap.get(strSubstring);
        if (eb0Var == null) {
            eb0Var = new eb0(this, strSubstring);
            linkedHashMap.put(strSubstring, eb0Var);
        }
        eb0 eb0Var2 = (eb0) eb0Var;
        if (iIndexOf$default2 == -1 || iIndexOf$default != 5 || !StringsKt__StringsJVMKt.startsWith$default(str, "CLEAN", false, 2, null)) {
            if (iIndexOf$default2 == -1 && iIndexOf$default == 5 && StringsKt__StringsJVMKt.startsWith$default(str, "DIRTY", false, 2, null)) {
                eb0Var2.g = new db0(this, eb0Var2);
                return;
            } else {
                if (iIndexOf$default2 == -1 && iIndexOf$default == 4 && StringsKt__StringsJVMKt.startsWith$default(str, "READ", false, 2, null)) {
                    return;
                }
                vm0.m(kb0.x("unexpected journal line: ", str));
                return;
            }
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str.substring(iIndexOf$default2 + 1), new char[]{' '}, false, 0, 6, (Object) null);
        eb0Var2.e = true;
        eb0Var2.g = null;
        if (listSplit$default.size() != 2) {
            throw new IOException("unexpected journal line: " + listSplit$default);
        }
        try {
            int size = listSplit$default.size();
            for (int i2 = 0; i2 < size; i2++) {
                eb0Var2.b[i2] = Long.parseLong((String) listSplit$default.get(i2));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listSplit$default);
        }
    }

    public final void j(eb0 eb0Var) {
        BufferedSink bufferedSink;
        int i = eb0Var.h;
        String str = eb0Var.a;
        if (i > 0 && (bufferedSink = this.l) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (eb0Var.h > 0 || eb0Var.g != null) {
            eb0Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.r.delete((Path) eb0Var.c.get(i2));
            long j = this.j;
            long[] jArr = eb0Var.b;
            this.j = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.k++;
        BufferedSink bufferedSink2 = this.l;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(str);
            bufferedSink2.writeByte(10);
            bufferedSink2.flush();
        }
        this.g.remove(str);
        if (this.k >= 2000) {
            f();
        }
    }

    public final void k() {
        while (this.j > this.b) {
            for (eb0 eb0Var : this.g.values()) {
                if (!eb0Var.f) {
                    j(eb0Var);
                }
            }
            return;
        }
        this.p = false;
    }

    public final void m() {
        Throwable th;
        synchronized (this.i) {
            try {
                BufferedSink bufferedSink = this.l;
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                BufferedSink bufferedSinkBuffer = Okio.buffer(this.r.sink(this.d, false));
                try {
                    bufferedSinkBuffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                    bufferedSinkBuffer.writeUtf8(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(3L).writeByte(10);
                    bufferedSinkBuffer.writeDecimalLong(2L).writeByte(10);
                    bufferedSinkBuffer.writeByte(10);
                    for (eb0 eb0Var : this.g.values()) {
                        if (eb0Var.g != null) {
                            bufferedSinkBuffer.writeUtf8("DIRTY");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(eb0Var.a);
                            bufferedSinkBuffer.writeByte(10);
                        } else {
                            bufferedSinkBuffer.writeUtf8("CLEAN");
                            bufferedSinkBuffer.writeByte(32);
                            bufferedSinkBuffer.writeUtf8(eb0Var.a);
                            for (long j : eb0Var.b) {
                                bufferedSinkBuffer.writeByte(32).writeDecimalLong(j);
                            }
                            bufferedSinkBuffer.writeByte(10);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        bufferedSinkBuffer.close();
                        th = null;
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
                if (th != null) {
                    throw th;
                }
                boolean zExists = this.r.exists(this.c);
                gb0 gb0Var = this.r;
                if (zExists) {
                    gb0Var.atomicMove(this.c, this.e);
                    this.r.atomicMove(this.d, this.c);
                    this.r.delete(this.e);
                } else {
                    gb0Var.atomicMove(this.d, this.c);
                }
                this.l = Okio.buffer(new ui0(this.r.appendingSink(this.c), new c(this, 29)));
                this.k = 0;
                this.m = false;
                this.q = false;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
