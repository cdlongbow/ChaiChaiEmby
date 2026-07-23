package defpackage;

import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class jp0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp0(boolean z, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                return new jp0(z, (MutableState) obj2, continuation, 0);
            case 1:
                return new jp0(z, (MutableState) obj2, continuation, 1);
            case 2:
                return new jp0(z, (MutableState) obj2, continuation, 2);
            case 3:
                return new jp0(z, (MutableState) obj2, continuation, 3);
            default:
                return new jp0(z, (zq0) obj2, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((jp0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (!this.b) {
                    ((MutableState) this.c).setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                if (!this.b) {
                    bq0.V((MutableState) this.c, false);
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                if (!this.b) {
                    ((MutableState) this.c).setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                if (!this.b) {
                    ((MutableState) this.c).setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                boolean z = this.b;
                zq0 zq0Var = (zq0) this.c;
                if (z) {
                    zq0Var.H = true;
                    hq0 hq0Var = (hq0) zq0Var.c.getValue();
                    boolean zA = zq0Var.A();
                    Job job = zq0Var.z;
                    if (job == null || !job.isActive()) {
                        if (zq0Var.I || !(hq0Var instanceof gq0) || !zA) {
                            zq0Var.E(true, false);
                        } else if (zq0Var.J) {
                            zq0Var.E(false, true);
                        } else {
                            gq0 gq0Var = (gq0) hq0Var;
                            zq0Var.Q(gq0Var.a, zq0Var.G, SequencesKt.toSet(SequencesKt.filterNot(SequencesKt.map(CollectionsKt.asSequence(gq0Var.c), new vi0(29)), new d6(zq0Var, 12))));
                        }
                    }
                } else {
                    zq0Var.H = false;
                    Job job2 = zq0Var.z;
                    boolean z2 = job2 != null && job2.isActive();
                    boolean zA2 = zq0Var.A();
                    if (z2 || (zq0Var.c.getValue() instanceof fq0)) {
                        if (zA2) {
                            zq0Var.J = true;
                        } else {
                            zq0Var.I = true;
                        }
                    }
                    zq0Var.G++;
                    Job job3 = zq0Var.z;
                    if (job3 != null) {
                        Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                    }
                    zq0Var.z = null;
                    Job job4 = zq0Var.A;
                    if (job4 != null) {
                        Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
                    }
                    zq0Var.A = null;
                    zq0Var.F = zq0Var.s.getValue() != null;
                    Job job5 = zq0Var.y;
                    if (job5 != null) {
                        Job.DefaultImpls.cancel$default(job5, (CancellationException) null, 1, (Object) null);
                    }
                    zq0Var.y = null;
                    synchronized (zq0Var.L) {
                        zq0Var.L.clear();
                        Unit unit = Unit.INSTANCE;
                    }
                    zq0Var.i();
                    zq0Var.j();
                }
                return Unit.INSTANCE;
        }
    }
}
