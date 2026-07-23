package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class hj1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ kx b;
    public final /* synthetic */ kx c;
    public final /* synthetic */ kx d;
    public final /* synthetic */ rw e;
    public final /* synthetic */ eo1 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ kx i;
    public final /* synthetic */ Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj1(kx kxVar, kx kxVar2, kx kxVar3, rw rwVar, eo1 eo1Var, boolean z, kx kxVar4, Context context, Continuation continuation) {
        super(2, continuation);
        this.b = kxVar;
        this.c = kxVar2;
        this.d = kxVar3;
        this.e = rwVar;
        this.g = eo1Var;
        this.h = z;
        this.i = kxVar4;
        this.j = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        hj1 hj1Var = new hj1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, continuation);
        hj1Var.a = obj;
        return hj1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hj1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState = this.d.h;
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        kx kxVar = this.b;
        boolean enabled = kxVar.b().getEnabled();
        kx kxVar2 = this.c;
        if (enabled && kxVar.b().hasValidApi() && kxVar.b().getAutoMatch() && kxVar2.c()) {
            Job job = (Job) mutableState.getValue();
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            mutableState.setValue(BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new c6(this.e, this.g, this.h, kxVar, kxVar2, this.i, this.j, (Continuation) null), 2, null));
        } else {
            Job job2 = (Job) mutableState.getValue();
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            mutableState.setValue(null);
            ArrayList arrayList = new ArrayList();
            if (!kxVar.b().getEnabled()) {
                arrayList.add("弹幕功能未启用");
            }
            if (!kxVar.b().hasValidApi()) {
                arrayList.add("无有效API");
            }
            if (!kxVar.b().getAutoMatch()) {
                arrayList.add("自动匹配已关闭");
            }
            if (!kxVar2.c()) {
                arrayList.add("弹幕显示已关闭");
            }
            if (!arrayList.isEmpty()) {
                ll0.l("跳过自动匹配并取消任务: ", CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null), "DanmakuPlayer");
            }
        }
        return Unit.INSTANCE;
    }
}
