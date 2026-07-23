package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.server.DanmakuSearchInputServerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class dy extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ CoroutineScope c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(MutableState mutableState, CoroutineScope coroutineScope, MutableState mutableState2, px1 px1Var, MutableState mutableState3, UserPreferences userPreferences, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.b = mutableState;
        this.c = coroutineScope;
        this.d = mutableState2;
        this.i = px1Var;
        this.e = mutableState3;
        this.j = userPreferences;
        this.g = mutableState4;
        this.h = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                return new dy((DanmakuSearchInputServerManager) obj3, this.c, this.b, this.d, this.e, this.g, this.h, (MutableState) obj2, continuation);
            default:
                MutableState mutableState = this.g;
                MutableState mutableState2 = this.h;
                return new dy(this.b, this.c, this.d, (px1) obj3, this.e, (UserPreferences) obj2, mutableState, mutableState2, continuation);
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
        return ((dy) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ((DanmakuSearchInputServerManager) obj3).startServer(new cy(this.c, this.b, this.d, this.e, this.g, this.h, (MutableState) obj2, 0));
                break;
            default:
                ResultKt.throwOnFailure(obj);
                MutableState mutableState = this.b;
                if (!StringsKt.isBlank((String) mutableState.getValue())) {
                    String str = (String) mutableState.getValue();
                    lx1.g(this.c, this.d, (px1) obj3, this.e, (UserPreferences) obj2, this.g, mutableState, this.h, str);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(DanmakuSearchInputServerManager danmakuSearchInputServerManager, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Continuation continuation) {
        super(2, continuation);
        this.i = danmakuSearchInputServerManager;
        this.c = coroutineScope;
        this.b = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.j = mutableState6;
    }
}
