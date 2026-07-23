package defpackage;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.core.view.ViewCompat;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class zx extends SuspendLambda implements Function2 {
    public final /* synthetic */ View a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ FocusRequester e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(View view, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.a = view;
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zx(this.a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zx) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        View view = this.a;
        if (view != null) {
            ViewCompat.setOnApplyWindowInsetsListener(view, new yx(this.b, this.c, this.d, this.e));
        }
        return Unit.INSTANCE;
    }
}
