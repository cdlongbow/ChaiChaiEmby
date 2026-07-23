package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.dh.myembyapp.data.api.EmbyApiService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class r3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.a = 1;
        this.c = str;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                r3 r3Var = new r3((List) this.e, (String) this.c, (b4) this.g, (EmbyApiService) obj2, continuation, 0);
                r3Var.d = obj;
                return r3Var;
            case 1:
                return new r3((String) this.c, (MutableState) this.d, (MutableState) this.e, (MutableState) this.g, (MutableState) obj2, continuation);
            case 2:
                r3 r3Var2 = new r3((List) this.e, (LazyListState) this.g, (Integer) obj2, continuation, 2);
                r3Var2.c = obj;
                return r3Var2;
            case 3:
                r3 r3Var3 = new r3((List) this.e, (MutableState) this.g, (LazyListState) obj2, continuation, 3);
                r3Var3.c = obj;
                return r3Var3;
            case 4:
                return new r3((MutableState) this.d, (ScrollState) this.e, (MutableState) this.c, (FocusRequester) this.g, (MutableState) obj2, continuation, 4);
            case 5:
                r3 r3Var4 = new r3((md1) obj2, (String) this.c, continuation);
                r3Var4.g = obj;
                return r3Var4;
            case 6:
                return new r3((io1) this.d, (to1) this.e, (String) this.c, (String) this.g, (Long) obj2, continuation, 6);
            case 7:
                return new r3((fs0) this.d, (ks1) this.e, (n12) this.c, (yg0) this.g, (pr0) obj2, continuation, 7);
            case 8:
                return new r3((MutableState) this.e, (MutableState) this.c, (MutableState) this.g, (MutableState) obj2, continuation, 8);
            case 9:
                r3 r3Var5 = new r3((SoftwareKeyboardController) this.e, (MutableState) this.c, (FocusRequester) this.g, (MutableState) obj2, continuation, 9);
                r3Var5.d = obj;
                return r3Var5;
            default:
                return new r3((n2) this.d, (ye2) this.e, (MutableState) this.c, (MutableState) this.g, (MutableState) obj2, continuation, 10);
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
        }
        return ((r3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0134, code lost:
    
        if (r2 == r7) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.g = obj4;
        this.h = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.e = obj;
        this.c = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(md1 md1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.a = 5;
        this.h = md1Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(List list, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.e = list;
        this.g = obj;
        this.h = obj2;
    }
}
