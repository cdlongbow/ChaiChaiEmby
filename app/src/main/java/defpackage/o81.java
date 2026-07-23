package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public final class o81 extends SuspendLambda implements Function2 {
    public Ref.ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Ref.ObjectRef d;
    public final /* synthetic */ s81 e;
    public final /* synthetic */ Ref.ObjectRef g;
    public final /* synthetic */ u81 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o81(Ref.ObjectRef objectRef, s81 s81Var, Ref.ObjectRef objectRef2, u81 u81Var, Continuation continuation) {
        super(2, continuation);
        this.d = objectRef;
        this.e = s81Var;
        this.g = objectRef2;
        this.h = u81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        o81 o81Var = new o81(this.d, this.e, this.g, this.h, continuation);
        o81Var.c = obj;
        return o81Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o81) create((v81) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, v81] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v81 v81Var;
        Ref.ObjectRef objectRef;
        T t;
        v81 v81Var2;
        t81 t81Var;
        Buffer buffer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        String strA = null;
        Ref.ObjectRef objectRef2 = this.g;
        Ref.ObjectRef objectRef3 = this.d;
        s81 s81Var = this.e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            v81Var = (v81) this.c;
            fs1 fs1Var = (fs1) objectRef3.element;
            v81 v81Var3 = (v81) objectRef2.element;
            this.c = v81Var;
            this.a = objectRef3;
            this.b = 1;
            Object objD = s81.d(s81Var, fs1Var, v81Var3, v81Var, this);
            if (objD != coroutine_suspended) {
                objectRef = objectRef3;
                t = objD;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            Ref.ObjectRef objectRef4 = this.a;
            v81 v81Var4 = (v81) this.c;
            ResultKt.throwOnFailure(obj);
            t = obj;
            v81Var = v81Var4;
            objectRef = objectRef4;
        } else {
            if (i != 2) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v81Var2 = (v81) this.c;
            ResultKt.throwOnFailure(obj);
        }
        buffer = (Buffer) obj;
        if (buffer.size() > 0) {
            return new o22(new p22(buffer, s81Var.e(), null), s81.f(s81Var.a, v81Var2.d.a()), o00.d);
        }
        return null;
        objectRef.element = t;
        s81Var.getClass();
        s81.h(v81Var);
        T t2 = objectRef3.element;
        if (t2 != 0) {
            objectRef2.element = s81Var.j((fs1) t2);
            T t3 = objectRef3.element;
            t3.getClass();
            fk0 fk0VarI = s81Var.i((fs1) t3);
            String str = s81Var.a;
            v81 v81Var5 = (v81) objectRef2.element;
            if (v81Var5 != null && (t81Var = v81Var5.d) != null) {
                strA = t81Var.a();
            }
            return new o22(fk0VarI, s81.f(str, strA), o00.d);
        }
        q22 q22Var = v81Var.e;
        if (q22Var == null) {
            rd1.o("body == null");
            return null;
        }
        this.c = v81Var;
        this.a = null;
        this.b = 2;
        Object objP = tl0.P(q22Var, this);
        if (objP != coroutine_suspended) {
            v81 v81Var6 = v81Var;
            obj = objP;
            v81Var2 = v81Var6;
            buffer = (Buffer) obj;
            if (buffer.size() > 0) {
                return new o22(new p22(buffer, s81Var.e(), null), s81.f(s81Var.a, v81Var2.d.a()), o00.d);
            }
            return null;
        }
        return coroutine_suspended;
    }
}
