package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.DanmakuSettings;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(String str, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.a = 9;
        this.d = str;
        this.c = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = 2;
        switch (this.a) {
            case 0:
                return new n2((lz0) this.c, (String) this.d, continuation, 0);
            case 1:
                return new n2((mx) this.c, (DanmakuSettings) this.d, continuation, 1);
            case 2:
                n2 n2Var = new n2((State) this.d, continuation, i);
                n2Var.c = obj;
                return n2Var;
            case 3:
                return new n2((ScrollState) this.c, (MutableState) this.d, continuation, 3);
            case 4:
                return new n2((zq0) this.d, continuation, 4);
            case 5:
                return new n2((MyEmbyApp) this.d, continuation, 5);
            case 6:
                n2 n2Var2 = new n2((s81) this.d, continuation, 6);
                n2Var2.c = obj;
                return n2Var2;
            case 7:
                return new n2((to1) this.c, (MediaItem) this.d, continuation, 7);
            case 8:
                return new n2(i, continuation);
            case 9:
                return new n2((String) this.d, (MutableState) this.c, continuation);
            case 10:
                return new n2((hy1) this.c, (String) this.d, continuation, 10);
            case 11:
                return new n2((i52) this.c, (String) this.d, continuation, 11);
            case 12:
                return new n2((SoftwareKeyboardController) this.c, (MutableState) this.d, continuation, 12);
            default:
                n2 n2Var3 = new n2((pf2) this.d, continuation, 13);
                n2Var3.c = obj;
                return n2Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((n2) create((v81) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((n2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((n2) create((ye2) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0475  */
    /* JADX WARN: Code duplicated, block: B:205:0x0482  */
    /* JADX WARN: Code duplicated, block: B:208:0x0490  */
    /* JADX WARN: Code duplicated, block: B:211:0x049d  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:94:0x020d  */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04b6, code lost:
    
        if (r2.updateShowBottomDanmaku(r0, r11) == r4) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if (r5 == r3) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(int i, Continuation continuation) {
        super(i, continuation);
        this.a = 8;
    }
}
