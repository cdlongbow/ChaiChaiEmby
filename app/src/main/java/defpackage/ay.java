package defpackage;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ay extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ SoftwareKeyboardController c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(View view, SoftwareKeyboardController softwareKeyboardController, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.b = view;
        this.c = softwareKeyboardController;
        this.d = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ay(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ay) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:12:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x005b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r7)
            goto L24
        Lf:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.rd1.o(r6)
            r6 = 0
            return r6
        L16:
            kotlin.ResultKt.throwOnFailure(r7)
        L19:
            r6.a = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r7 != r0) goto L24
            return r0
        L24:
            android.view.View r7 = r6.b
            if (r7 == 0) goto L19
            androidx.core.view.WindowInsetsCompat r7 = androidx.core.view.ViewCompat.getRootWindowInsets(r7)
            if (r7 == 0) goto L37
            int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
            boolean r7 = r7.isVisible(r1)
            goto L38
        L37:
            r7 = 0
        L38:
            androidx.compose.runtime.MutableState r1 = r6.d
            boolean r3 = defpackage.qy.h(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "【持续监控】键盘状态: imeVisible="
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r5 = ", 焦点在输入框: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DanmakuSearch"
            android.util.Log.d(r4, r3)
            if (r7 == 0) goto L19
            java.lang.Object r7 = r1.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L19
            java.lang.String r7 = "【持续监控】检测到键盘开启但焦点不在输入框，关闭键盘"
            android.util.Log.d(r4, r7)
            androidx.compose.ui.platform.SoftwareKeyboardController r7 = r6.c
            if (r7 == 0) goto L19
            r7.hide()
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
