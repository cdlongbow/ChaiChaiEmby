package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ State c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6(boolean z, State state, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = z;
        this.c = state;
        this.e = obj;
        this.d = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                return new o6(this.b, this.c, (p7) obj3, (Context) obj2, continuation, 0);
            case 1:
                return new o6(this.b, this.c, (v8) obj3, (Context) obj2, continuation, 1);
            default:
                return new o6(this.b, (MutableState) this.c, (MutableState) obj3, (MutableState) obj2, continuation, 2);
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
        }
        return ((o6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        State state = this.c;
        boolean z = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (z) {
                    float f = f7.a;
                    p7 p7Var = (p7) obj3;
                    Context context = (Context) obj2;
                    for (g7 g7Var : ((h7) state.getValue()).d) {
                        String str = g7Var.d;
                        ServerConfig serverConfig = g7Var.a;
                        if (str != null && !g7Var.c) {
                            String strC = mr.C(serverConfig.getId(), "_", str);
                            LinkedHashSet linkedHashSet = p7Var.q;
                            if (!linkedHashSet.contains(strC)) {
                                linkedHashSet.add(strC);
                                Toast.makeText(context, serverConfig.getAlias() + ": " + str, 0).show();
                            }
                        }
                    }
                }
                break;
            case 1:
                ResultKt.throwOnFailure(obj);
                if (z) {
                    v8 v8Var = (v8) obj3;
                    Context context2 = (Context) obj2;
                    for (py1 py1Var : (List) state.getValue()) {
                        String str2 = py1Var.d;
                        ServerConfig serverConfig2 = py1Var.a;
                        if (str2 != null && !py1Var.c) {
                            String strC2 = mr.C(serverConfig2.getId(), "_", str2);
                            LinkedHashSet linkedHashSet2 = v8Var.r;
                            if (!linkedHashSet2.contains(strC2)) {
                                linkedHashSet2.add(strC2);
                                Toast.makeText(context2, serverConfig2.getAlias() + ": " + str2, 0).show();
                            }
                        }
                    }
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                if (!z && ((String) ((MutableState) state).getValue()) != null && ((String) ((MutableState) obj3).getValue()) != null) {
                    vj0.c((MutableState) obj2, true);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
