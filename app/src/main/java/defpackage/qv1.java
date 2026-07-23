package defpackage;

import androidx.compose.runtime.MutableState;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class qv1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv1(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.a = coroutineScope;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qv1(this.a, this.b, this.c, this.d, this.e, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qv1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutableState mutableState = this.b;
        Job job = (Job) mutableState.getValue();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        MutableState mutableState2 = this.c;
        boolean zIsBlank = StringsKt.isBlank((String) mutableState2.getValue());
        MutableState mutableState3 = this.e;
        MutableState mutableState4 = this.d;
        if (zIsBlank) {
            mutableState4.setValue(CollectionsKt.emptyList());
            mutableState3.setValue("");
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual((String) mutableState2.getValue(), (String) mutableState3.getValue()) && !((List) mutableState4.getValue()).isEmpty()) {
            return Unit.INSTANCE;
        }
        mutableState.setValue(BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new r3(this.g, mutableState2, this.d, this.e, (Continuation) null, 8), 3, null));
        return Unit.INSTANCE;
    }
}
