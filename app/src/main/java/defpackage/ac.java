package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ac extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(List list, int i, List list2, Continuation continuation) {
        super(2, continuation);
        this.a = 7;
        this.d = list;
        this.b = i;
        this.e = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ac acVar = new ac((y32) this.d, (o32) obj2, continuation, 0);
                acVar.c = obj;
                return acVar;
            case 1:
                return new ac((kf) this.d, (df) obj2, continuation, 1);
            case 2:
                return new ac((va0) this.c, (State) this.d, (MutableIntState) obj2, continuation, 2);
            case 3:
                return new ac((FocusRequester) this.c, (MutableState) this.d, (MutableState) obj2, continuation, 3);
            case 4:
                return new ac((ScrollState) this.c, (Function1) this.d, (x82) obj2, continuation, 4);
            case 5:
                return new ac((MutableState) this.c, (MutableState) this.d, (MutableState) obj2, continuation, 5);
            case 6:
                return new ac((zq0) this.d, (String) obj2, continuation, 6);
            case 7:
                ac acVar2 = new ac((List) this.d, this.b, (List) obj2, continuation);
                acVar2.c = obj;
                return acVar2;
            case 8:
                return new ac((FocusRequester) this.c, (State) this.d, (MutableState) obj2, continuation, 8);
            case 9:
                return new ac((ng1) this.d, (String) obj2, continuation, 9);
            case 10:
                return new ac((ln1) this.c, (MutableState) this.d, (MutableState) obj2, continuation, 10);
            case 11:
                ac acVar3 = new ac((sh1) this.d, (og1) obj2, continuation, 11);
                acVar3.c = obj;
                return acVar3;
            case 12:
                ac acVar4 = new ac((ks1) this.d, (fs0) obj2, continuation, 12);
                acVar4.c = obj;
                return acVar4;
            case 13:
                return new ac((MutableState) this.d, (MutableState) obj2, continuation, 13);
            case 14:
                ac acVar5 = new ac((BringIntoViewRequester) obj2, continuation);
                acVar5.d = obj;
                return acVar5;
            case 15:
                return new ac((Function0) this.c, (MutableState) this.d, (MutableState) obj2, continuation, 15);
            case 16:
                ac acVar6 = new ac(this.b, (MutableState) this.d, (FocusRequester) obj2, continuation, 16);
                acVar6.c = obj;
                return acVar6;
            default:
                ac acVar7 = new ac(this.b, (Function0) this.d, (FocusRequester) obj2, continuation, 17);
                acVar7.c = obj;
                return acVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((ac) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((ac) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0336  */
    /* JADX WARN: Code duplicated, block: B:153:0x033a A[Catch: all -> 0x02bc, Exception -> 0x02bf, TryCatch #9 {Exception -> 0x02bf, blocks: (B:130:0x02b7, B:150:0x0329, B:157:0x0349, B:153:0x033a), top: B:359:0x02b7 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0342  */
    /* JADX WARN: Code duplicated, block: B:156:0x0346  */
    /* JADX WARN: Code duplicated, block: B:305:0x069b  */
    /* JADX WARN: Code duplicated, block: B:307:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:309:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:311:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:314:0x06d0  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01fb, code lost:
    
        if (defpackage.dn1.j0(r3, r8, null, r17, 200) == r2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020c, code lost:
    
        if (defpackage.dn1.j0(r3, r8, r0, r17, 136) == r2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x061e, code lost:
    
        if (r3.p(r17) == r2) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0675, code lost:
    
        if (r1 == r2) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x074e, code lost:
    
        if (r0 == r4) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.graphics.painter.Painter] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(BringIntoViewRequester bringIntoViewRequester, Continuation continuation) {
        super(2, continuation);
        this.a = 14;
        this.e = bringIntoViewRequester;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(int i, Object obj, FocusRequester focusRequester, Continuation continuation, int i2) {
        super(2, continuation);
        this.a = i2;
        this.b = i;
        this.d = obj;
        this.e = focusRequester;
    }
}
