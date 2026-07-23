package defpackage;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: loaded from: classes4.dex */
public final class w10 implements fu {
    public final LinkedHashMap b = new LinkedHashMap();
    public final Object c = new Object();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.fu
    public final Object a(String str, d6 d6Var, Continuation continuation) throws Throwable {
        v10 v10Var;
        u10 u10Var;
        Function1 function1;
        String str2;
        u10 u10Var2;
        if (continuation instanceof v10) {
            v10Var = (v10) continuation;
            int i = v10Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                v10Var.g = i - Integer.MIN_VALUE;
            } else {
                v10Var = new v10(this, (ContinuationImpl) continuation);
            }
        } else {
            v10Var = new v10(this, (ContinuationImpl) continuation);
        }
        Object objInvoke = v10Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = v10Var.g;
        int i3 = 13;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                synchronized (this.c) {
                    try {
                        LinkedHashMap linkedHashMap = this.b;
                        Object u10Var3 = linkedHashMap.get(str);
                        if (u10Var3 == null) {
                            booleanRef.element = false;
                            u10Var3 = new u10();
                            linkedHashMap.put(str, u10Var3);
                        }
                        u10Var = (u10) u10Var3;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                u10Var.a();
                function1 = d6Var;
                if (booleanRef.element) {
                    Channel channel = u10Var.a;
                    v10Var.a = str;
                    v10Var.b = d6Var;
                    v10Var.c = u10Var;
                    v10Var.g = 1;
                    if (channel.mo10317receiveCatchingJP2dKIU(v10Var) != coroutine_suspended) {
                    }
                }
                function1 = d6Var;
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u10Var2 = (u10) v10Var.b;
                str2 = v10Var.a;
                try {
                    try {
                        ResultKt.throwOnFailure(objInvoke);
                        u10Var2.b();
                        u10Var2.c(new z7(i3, this, str2));
                        return objInvoke;
                    } catch (Exception e) {
                        e = e;
                        u10Var2.a.mo10311trySendJP2dKIU(Unit.INSTANCE);
                        throw e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    u10Var2.c(new z7(i3, this, str2));
                    throw th;
                }
            }
            u10 u10Var4 = v10Var.c;
            Function1 function2 = (Function1) v10Var.b;
            String str3 = v10Var.a;
            ResultKt.throwOnFailure(objInvoke);
            ((ChannelResult) objInvoke).getHolder();
            u10Var = u10Var4;
            str = str3;
            function1 = function2;
            function1 = d6Var;
            v10Var.a = str;
            v10Var.b = u10Var;
            v10Var.c = null;
            v10Var.g = 2;
            objInvoke = function1.invoke(v10Var);
            if (objInvoke != coroutine_suspended) {
                str2 = str;
                u10Var2 = u10Var;
                u10Var2.b();
                u10Var2.c(new z7(i3, this, str2));
                return objInvoke;
            }
            function1 = d6Var;
            return coroutine_suspended;
        } catch (Exception e2) {
            e = e2;
            str2 = str;
            u10Var2 = u10Var;
            u10Var2.a.mo10311trySendJP2dKIU(Unit.INSTANCE);
            throw e;
        } catch (Throwable th3) {
            th = th3;
            str2 = str;
            u10Var2 = u10Var;
            u10Var2.c(new z7(i3, this, str2));
            throw th;
        }
    }
}
