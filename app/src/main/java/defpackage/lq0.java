package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
public final class lq0 extends SuspendLambda implements Function2 {
    public Ref.BooleanRef a;
    public Object b;
    public int c;
    public final /* synthetic */ jn0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ zq0 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ long j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ gq0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(jn0 jn0Var, boolean z, zq0 zq0Var, String str, boolean z2, long j, boolean z3, gq0 gq0Var, Continuation continuation) {
        super(2, continuation);
        this.d = jn0Var;
        this.e = z;
        this.g = zq0Var;
        this.h = str;
        this.i = z2;
        this.j = j;
        this.k = z3;
        this.l = gq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new lq0(this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lq0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0097, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        Exception exc;
        Ref.BooleanRef booleanRef2;
        jn0 jn0Var = this.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        zq0 zq0Var = this.g;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                try {
                    String str = jn0Var.b;
                    if (this.e) {
                        try {
                            booleanRef3.element = zq0.c(zq0Var, str, this.h, this.i, this.j, jn0Var);
                        } catch (Exception e) {
                            e = e;
                            booleanRef2 = booleanRef3;
                            exc = e;
                            if (zq0Var.C(this.j)) {
                                if (!booleanRef2.element || this.k) {
                                    Boxing.boxInt(Log.w("HomeViewModel", "加载首页失败，继续显示已有首页内容: " + exc.getMessage(), exc));
                                } else {
                                    zq0Var.c.setValue(new eq0(kb0.x("加载数据失败: ", exc.getMessage())));
                                }
                            }
                        }
                    }
                    booleanRef = booleanRef3;
                    try {
                        kq0 kq0Var = new kq0(zq0Var, this.j, booleanRef, this.k, this.l, jn0Var, str, this.h, this.i, null);
                        this.a = booleanRef;
                        this.b = null;
                        this.c = 1;
                        obj = CoroutineScopeKt.coroutineScope(kq0Var, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef2 = booleanRef;
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        booleanRef2 = booleanRef;
                        if (zq0Var.C(this.j)) {
                            if (booleanRef2.element) {
                                Boxing.boxInt(Log.w("HomeViewModel", "加载首页失败，继续显示已有首页内容: " + exc.getMessage(), exc));
                            } else {
                                Boxing.boxInt(Log.w("HomeViewModel", "加载首页失败，继续显示已有首页内容: " + exc.getMessage(), exc));
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    booleanRef = booleanRef3;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                booleanRef2 = this.a;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    if (zq0Var.C(this.j)) {
                        if (booleanRef2.element) {
                            Boxing.boxInt(Log.w("HomeViewModel", "加载首页失败，继续显示已有首页内容: " + exc.getMessage(), exc));
                        } else {
                            Boxing.boxInt(Log.w("HomeViewModel", "加载首页失败，继续显示已有首页内容: " + exc.getMessage(), exc));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        } catch (CancellationException e5) {
            throw e5;
        }
    }
}
