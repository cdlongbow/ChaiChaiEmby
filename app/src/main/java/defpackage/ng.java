package defpackage;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ng extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FocusRequester b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng(FocusRequester focusRequester, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new ng(this.b, continuation, 0);
            case 1:
                return new ng(this.b, continuation, 1);
            case 2:
                return new ng(this.b, continuation, 2);
            case 3:
                return new ng(this.b, continuation, 3);
            case 4:
                return new ng(this.b, continuation, 4);
            case 5:
                return new ng(this.b, continuation, 5);
            case 6:
                return new ng(this.b, continuation, 6);
            case 7:
                return new ng(this.b, continuation, 7);
            case 8:
                return new ng(this.b, continuation, 8);
            case 9:
                return new ng(this.b, continuation, 9);
            case 10:
                return new ng(this.b, continuation, 10);
            case 11:
                return new ng(this.b, continuation, 11);
            case 12:
                return new ng(this.b, continuation, 12);
            case 13:
                return new ng(this.b, continuation, 13);
            default:
                return new ng(this.b, continuation, 14);
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
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
        return ((ng) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 1:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 2:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 3:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 4:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 5:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 6:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 7:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 8:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 9:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 10:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 11:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 12:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            case 13:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
            default:
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default(this.b, 0, 1, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
