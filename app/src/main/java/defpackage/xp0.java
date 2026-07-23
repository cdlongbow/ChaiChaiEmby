package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class xp0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp0(boolean z, boolean z2, String str, String str2, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = mutableState;
        this.g = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new xp0(this.a, this.b, this.c, this.d, this.e, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xp0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a && this.b && Intrinsics.areEqual(this.c, "继续观看") && this.d != null) {
            Boolean bool = Boolean.FALSE;
            this.e.setValue(bool);
            this.g.setValue(bool);
        }
        return Unit.INSTANCE;
    }
}
