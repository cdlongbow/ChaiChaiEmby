package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import java.io.File;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class m2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(State state, MutableState mutableState, State state2, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.a = 3;
        this.c = state;
        this.d = mutableState;
        this.b = state2;
        this.e = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                return new m2((Function1) this.b, (State) obj2, (MutableState) obj4, (MutableState) obj3, continuation, 0);
            case 1:
                return new m2((String) this.b, (String) obj2, (Context) obj4, (String) obj3, continuation, 1);
            case 2:
                m2 m2Var = new m2((String) obj2, (qe) obj4, (ne) obj3, continuation);
                m2Var.b = obj;
                return m2Var;
            case 3:
                return new m2((State) obj2, (MutableState) obj4, (State) this.b, (MutableState) obj3, continuation);
            case 4:
                return new m2((String) obj2, (yj0) obj3, (Function1) this.b, (MutableState) obj4, continuation);
            default:
                return new m2((String) this.b, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation);
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
        }
        return ((m2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                State state = (State) obj2;
                u2 u2Var = (u2) state.getValue();
                if (u2Var instanceof s2) {
                    u2 u2Var2 = (u2) state.getValue();
                    u2Var2.getClass();
                    ((Function1) this.b).invoke(((s2) u2Var2).a);
                } else if (u2Var instanceof q2) {
                    u2 u2Var3 = (u2) state.getValue();
                    u2Var3.getClass();
                    ((MutableState) obj4).setValue(((q2) u2Var3).a);
                    ((MutableState) obj3).setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 1:
                String str = "ssa";
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                try {
                    String lowerCase = ((String) this.b).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (!Intrinsics.areEqual(StringsKt.removePrefix(lowerCase, (CharSequence) "."), "ssa")) {
                        str = "ass";
                    }
                    File file = new File(((Context) obj4).getCacheDir(), "subtitle_" + ((String) obj2).hashCode() + "_modified." + str);
                    FilesKt.writeText(file, (String) obj3, Charsets.UTF_8);
                    Log.d("AssSubtitleParser", "字幕已保存到临时文件: " + file.getAbsolutePath());
                    return file.getAbsolutePath();
                } catch (Exception e) {
                    kb0.G("保存临时字幕文件失败: ", e.getMessage(), "AssSubtitleParser", e);
                    return null;
                }
            case 2:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                String str2 = (String) obj2;
                qe qeVar = (qe) obj4;
                ne neVar = (ne) obj3;
                try {
                    
                    String string = StringsKt.trim((CharSequence) str2).toString();
                    if (StringsKt.isBlank(string)) {
                        throw new IllegalArgumentException("ASSRT API Key 为空");
                    }
                    ye yeVar = ye.a;
                    objM8825constructorimpl = ye.b(string, qeVar, neVar);
                    return Result.m8824boximpl(objM8825constructorimpl);
                } catch (Throwable th) {
                    
                    objM8825constructorimpl = ResultKt.createFailure(th);
                }
                break;
            case 3:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ((MutableState) obj4).setValue(Integer.valueOf(((Number) ((State) obj2).getValue()).intValue()));
                ((MutableState) obj3).setValue(Integer.valueOf(((Number) ((State) this.b).getValue()).intValue()));
                return Unit.INSTANCE;
            case 4:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (((String) obj2) != null && ((yj0) obj3) == null && !((Boolean) ((MutableState) obj4).getValue()).booleanValue()) {
                    ((Function1) this.b).invoke(null);
                }
                return Unit.INSTANCE;
            default:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual((String) ((MutableState) obj4).getValue(), (String) this.b)) {
                    ((MutableState) obj3).setValue(null);
                    ((MutableState) obj2).setValue(null);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(String str, qe qeVar, ne neVar, Continuation continuation) {
        super(2, continuation);
        this.a = 2;
        this.c = str;
        this.d = qeVar;
        this.e = neVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(String str, yj0 yj0Var, Function1 function1, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.a = 4;
        this.c = str;
        this.e = yj0Var;
        this.b = function1;
        this.d = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.a = 5;
        this.b = str;
        this.d = mutableState;
        this.e = mutableState2;
        this.c = mutableState3;
    }
}
