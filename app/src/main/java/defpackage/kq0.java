package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class kq0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ref.BooleanRef A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ gq0 C;
    public final /* synthetic */ jn0 D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public Ref.ObjectRef a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public List g;
    public Object h;
    public List i;
    public List j;
    public Object k;
    public Object l;
    public Collection m;
    public Object n;
    public Iterator o;
    public Object p;
    public Object q;
    public Object r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ zq0 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(zq0 zq0Var, long j, Ref.BooleanRef booleanRef, boolean z, gq0 gq0Var, jn0 jn0Var, String str, String str2, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.y = zq0Var;
        this.z = j;
        this.A = booleanRef;
        this.B = z;
        this.C = gq0Var;
        this.D = jn0Var;
        this.E = str;
        this.F = str2;
        this.G = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        kq0 kq0Var = new kq0(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, continuation);
        kq0Var.x = obj;
        return kq0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kq0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x030e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0382  */
    /* JADX WARN: Code duplicated, block: B:86:0x0388  */
    /* JADX WARN: Type inference failed for: r11v29, types: [T, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0382 -> B:84:0x0384). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 1515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
