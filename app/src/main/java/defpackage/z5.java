package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class z5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Enum g;
    public final /* synthetic */ Enum h;
    public final /* synthetic */ Function i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(boolean z, boolean z2, Enum r3, Enum r4, Function function, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = z;
        this.c = z2;
        this.g = r3;
        this.h = r4;
        this.i = function;
        this.d = mutableState;
        this.e = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Function function = this.i;
        Enum r3 = this.h;
        Enum r4 = this.g;
        switch (i) {
            case 0:
                return new z5(this.b, this.c, (i3) r4, (i3) r3, (Function0) function, this.d, this.e, continuation, 0);
            default:
                return new z5(this.b, this.c, (rn0) r4, (rn0) r3, (Function1) function, this.d, this.e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((z5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rn0 rn0Var;
        int i = this.a;
        Function function = this.i;
        Enum r2 = this.h;
        Enum r3 = this.g;
        boolean z = this.c;
        boolean z2 = this.b;
        MutableState mutableState = this.d;
        MutableState mutableState2 = this.e;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                float f = f7.a;
                if (((Boolean) mutableState.getValue()).booleanValue() && !((Boolean) mutableState2.getValue()).booleanValue() && z2 && z && ((i3) r3) != ((i3) r2)) {
                    ((Function0) function).invoke();
                }
                Boolean bool = (Boolean) mutableState.getValue();
                bool.booleanValue();
                mutableState2.setValue(bool);
                break;
            default:
                ResultKt.throwOnFailure(obj);
                float f2 = e92.a;
                if (((Boolean) mutableState.getValue()).booleanValue() && !((Boolean) mutableState2.getValue()).booleanValue() && z2 && z && ((rn0) r3) != (rn0Var = (rn0) r2)) {
                    ((Function1) function).invoke(rn0Var);
                }
                Boolean bool2 = (Boolean) mutableState.getValue();
                bool2.booleanValue();
                mutableState2.setValue(bool2);
                break;
        }
        return Unit.INSTANCE;
    }
}
