package defpackage;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class eg1 extends SuspendLambda implements Function2 {
    public int a;
    public int b;
    public FocusRequester c;
    public Object d;
    public int e;
    public final /* synthetic */ FocusRequester g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg1(FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.g = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new eg1(this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((eg1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:22|10|11) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r1 == 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        kotlin.coroutines.jvm.internal.Boxing.boxInt(android.util.Log.w("PlayerControls", "更多按钮焦点请求失败: " + r10.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r9.c = r6;
        r9.d = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10);
        r9.a = r5;
        r9.b = r1;
        r9.e = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(40, r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0036 -> B:19:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0067 -> B:19:0x006a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.e
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 != r4) goto L1b
            int r1 = r9.b
            int r5 = r9.a
            java.lang.Object r6 = r9.d
            java.lang.Exception r6 = (java.lang.Exception) r6
            androidx.compose.ui.focus.FocusRequester r6 = r9.c
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6a
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.rd1.o(r9)
            return r2
        L21:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = 3
            androidx.compose.ui.focus.FocusRequester r1 = r9.g
            r5 = r10
            r6 = r1
            r1 = r3
        L2a:
            if (r1 >= r5) goto L6c
            androidx.compose.ui.focus.FocusRequester.m4818requestFocus3ESFkO8$default(r6, r3, r4, r2)     // Catch: java.lang.Exception -> L32
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L32
            return r9
        L32:
            r10 = move-exception
            r7 = 2
            if (r1 != r7) goto L53
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "更多按钮焦点请求失败: "
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            java.lang.String r7 = "PlayerControls"
            int r10 = android.util.Log.w(r7, r10)
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            goto L6a
        L53:
            r9.c = r6
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.d = r10
            r9.a = r5
            r9.b = r1
            r9.e = r4
            r7 = 40
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r7, r9)
            if (r10 != r0) goto L6a
            return r0
        L6a:
            int r1 = r1 + r4
            goto L2a
        L6c:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
