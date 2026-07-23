package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.server.OnlineSubtitleConfigServerManager;
import com.dh.myembyapp.server.ServerIconLibraryInputServerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class x91 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x91(OnlineSubtitleConfigServerManager onlineSubtitleConfigServerManager, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Continuation continuation) {
        super(2, continuation);
        this.e = onlineSubtitleConfigServerManager;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new x91((OnlineSubtitleConfigServerManager) this.e, this.b, this.c, this.d, (MutableState) this.g, (MutableState) this.h, (MutableState) this.i, continuation);
            default:
                return new x91((ServerIconLibraryInputServerManager) this.e, (String) this.g, (Function1) this.h, (Function0) this.i, this.b, this.c, this.d, continuation);
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
        return ((x91) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        boolean z = true;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = this.b;
                boolean zBooleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                MutableState mutableState3 = this.c;
                String str = (String) mutableState3.getValue();
                MutableState mutableState4 = this.d;
                mutableState.setValue(((OnlineSubtitleConfigServerManager) obj5).startServer(new t91(zBooleanValue, str, (ne) mutableState4.getValue()), new g9(16, mutableState2, mutableState3, mutableState4, (MutableState) obj4)));
                MutableState mutableState5 = (MutableState) obj2;
                String str2 = (String) mutableState.getValue();
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    z = false;
                }
                mutableState5.setValue(Boolean.valueOf(z));
                break;
            default:
                ResultKt.throwOnFailure(obj);
                String strStartServer = ((ServerIconLibraryInputServerManager) obj5).startServer((String) obj4, new if1((Function1) obj3, (Function0) obj2, this.b, 5));
                MutableState mutableState6 = this.c;
                mutableState6.setValue(strStartServer);
                String str3 = (String) mutableState6.getValue();
                if (str3 != null && !StringsKt.isBlank(str3)) {
                    z = false;
                }
                this.d.setValue(Boolean.valueOf(z));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x91(ServerIconLibraryInputServerManager serverIconLibraryInputServerManager, String str, Function1 function1, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.e = serverIconLibraryInputServerManager;
        this.g = str;
        this.h = function1;
        this.i = function0;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
    }
}
