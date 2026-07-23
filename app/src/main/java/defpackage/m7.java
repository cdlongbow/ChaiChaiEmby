package defpackage;

import androidx.lifecycle.ViewModel;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class m7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public final /* synthetic */ ViewModel d;
    public final /* synthetic */ ServerConfig e;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(v8 v8Var, long j, int i, ServerConfig serverConfig, Continuation continuation) {
        super(2, continuation);
        this.a = 3;
        this.d = v8Var;
        this.h = j;
        this.g = i;
        this.e = serverConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        ViewModel viewModel = this.d;
        switch (i) {
            case 0:
                return new m7((p7) viewModel, this.e, this.g, this.h, continuation, 0);
            case 1:
                return new m7((p7) viewModel, this.e, this.g, this.h, continuation, 1);
            case 2:
                return new m7((p7) viewModel, this.e, this.g, this.h, continuation, 2);
            default:
                m7 m7Var = new m7((v8) viewModel, this.h, this.g, this.e, continuation);
                m7Var.b = obj;
                return m7Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((m7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((m7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((m7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((m7) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e0, code lost:
    
        if (r1 == r0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        if (r0 == r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0145, code lost:
    
        if (r0 == r11) goto L69;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(p7 p7Var, ServerConfig serverConfig, int i, long j, Continuation continuation, int i2) {
        super(2, continuation);
        this.a = i2;
        this.d = p7Var;
        this.e = serverConfig;
        this.g = i;
        this.h = j;
    }
}
