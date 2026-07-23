package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.DanmakuSettings;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class q3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(List list, Function0 function0, Function1 function1, int i, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.a = 9;
        this.c = list;
        this.d = function0;
        this.e = function1;
        this.b = i;
        this.g = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new q3((MediaItem) this.c, (String) this.d, (b4) this.e, (EmbyApiService) obj2, continuation, 0);
            case 1:
                return new q3((ScrollState) this.c, (Function1) this.d, (Function1) this.e, (Function0) obj2, continuation, 1);
            case 2:
                return new q3((rm) this.c, (Function0) this.d, (MutableState) this.e, (MutableState) obj2, continuation, 2);
            case 3:
                return new q3((List) this.d, (MutableState) this.e, (DanmakuSettings) obj2, continuation, 3);
            case 4:
                return new q3((List) this.c, (LazyListState) this.d, (MutableState) this.e, (MutableState) obj2, continuation, 4);
            case 5:
                q3 q3Var = new q3((String) this.d, (MutableState) this.e, (FocusRequester) obj2, continuation, 5);
                q3Var.c = obj;
                return q3Var;
            case 6:
                return new q3((va0) this.c, (String) this.d, (String) this.e, (String) obj2, continuation, 6);
            case 7:
                return new q3((va0) obj2, (String) this.d, continuation);
            case 8:
                return new q3((List) this.c, (LazyListState) this.d, (State) this.e, (State) obj2, continuation, 8);
            case 9:
                return new q3((List) this.c, (Function0) this.d, (Function1) this.e, this.b, (MutableState) obj2, continuation);
            case 10:
                q3 q3Var2 = new q3((MutableIntState) this.d, (MutableState) this.e, (FocusRequester) obj2, continuation, 10);
                q3Var2.c = obj;
                return q3Var2;
            case 11:
                return new q3((FocusRequester) this.c, (FocusRequester) this.d, (FocusRequester) this.e, (MutableState) obj2, continuation, 11);
            case 12:
                return new q3((EmbyApiService) obj2, (String) this.d, (String) this.c, (md1) this.e, continuation);
            case 13:
                q3 q3Var3 = new q3((Function0) this.d, (FocusRequester) this.e, (FocusRequester) obj2, continuation, 13);
                q3Var3.c = obj;
                return q3Var3;
            case 14:
                return new q3((ng1) this.e, (String) obj2, continuation);
            default:
                q3 q3Var4 = new q3(this.b, (Function0) this.d, (MutableState) this.e, (FocusRequester) obj2, continuation);
                q3Var4.c = obj;
                return q3Var4;
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
            case 14:
                break;
        }
        return ((q3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0105  */
    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03df, code lost:
    
        if (r1.scrollToItem(0, 0, r18) == r2) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0475, code lost:
    
        if (r2 == r1) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0585, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.scrollToItem$default(r0, 0, 0, r18, 2, null) == r8) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x062a, code lost:
    
        if (r0.e(r2, r18) == r1) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0692, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r0, r18) == r1) goto L326;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(va0 va0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.a = 7;
        this.g = va0Var;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(ng1 ng1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.a = 14;
        this.e = ng1Var;
        this.g = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(EmbyApiService embyApiService, String str, String str2, md1 md1Var, Continuation continuation) {
        super(2, continuation);
        this.a = 12;
        this.g = embyApiService;
        this.d = str;
        this.c = str2;
        this.e = md1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(int i, Function0 function0, MutableState mutableState, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.a = 15;
        this.b = i;
        this.d = function0;
        this.e = mutableState;
        this.g = focusRequester;
    }
}
