package defpackage;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ji extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ FocusRequester d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji(FocusRequester focusRequester, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ji jiVar = new ji(this.d, continuation, 0);
                jiVar.c = obj;
                return jiVar;
            case 1:
                ji jiVar2 = new ji(this.d, continuation, 1);
                jiVar2.c = obj;
                return jiVar2;
            case 2:
                ji jiVar3 = new ji(this.d, continuation, 2);
                jiVar3.c = obj;
                return jiVar3;
            case 3:
                ji jiVar4 = new ji(this.d, continuation, 3);
                jiVar4.c = obj;
                return jiVar4;
            case 4:
                ji jiVar5 = new ji(this.d, continuation, 4);
                jiVar5.c = obj;
                return jiVar5;
            case 5:
                ji jiVar6 = new ji(this.d, continuation, 5);
                jiVar6.c = obj;
                return jiVar6;
            case 6:
                ji jiVar7 = new ji(this.d, continuation, 6);
                jiVar7.c = obj;
                return jiVar7;
            case 7:
                ji jiVar8 = new ji(this.d, continuation, 7);
                jiVar8.c = obj;
                return jiVar8;
            case 8:
                ji jiVar9 = new ji(this.d, continuation, 8);
                jiVar9.c = obj;
                return jiVar9;
            case 9:
                ji jiVar10 = new ji(this.d, continuation, 9);
                jiVar10.c = obj;
                return jiVar10;
            case 10:
                ji jiVar11 = new ji(this.d, continuation, 10);
                jiVar11.c = obj;
                return jiVar11;
            case 11:
                ji jiVar12 = new ji(this.d, continuation, 11);
                jiVar12.c = obj;
                return jiVar12;
            case 12:
                ji jiVar13 = new ji(this.d, continuation, 12);
                jiVar13.c = obj;
                return jiVar13;
            case 13:
                ji jiVar14 = new ji(this.d, continuation, 13);
                jiVar14.c = obj;
                return jiVar14;
            case 14:
                ji jiVar15 = new ji(this.d, continuation, 14);
                jiVar15.c = obj;
                return jiVar15;
            case 15:
                ji jiVar16 = new ji(this.d, continuation, 15);
                jiVar16.c = obj;
                return jiVar16;
            case 16:
                ji jiVar17 = new ji(this.d, continuation, 16);
                jiVar17.c = obj;
                return jiVar17;
            case 17:
                ji jiVar18 = new ji(this.d, continuation, 17);
                jiVar18.c = obj;
                return jiVar18;
            case 18:
                ji jiVar19 = new ji(this.d, continuation, 18);
                jiVar19.c = obj;
                return jiVar19;
            case 19:
                ji jiVar20 = new ji(this.d, continuation, 19);
                jiVar20.c = obj;
                return jiVar20;
            case 20:
                ji jiVar21 = new ji(this.d, continuation, 20);
                jiVar21.c = obj;
                return jiVar21;
            case 21:
                ji jiVar22 = new ji(this.d, continuation, 21);
                jiVar22.c = obj;
                return jiVar22;
            case 22:
                ji jiVar23 = new ji(this.d, continuation, 22);
                jiVar23.c = obj;
                return jiVar23;
            case 23:
                ji jiVar24 = new ji(this.d, continuation, 23);
                jiVar24.c = obj;
                return jiVar24;
            case 24:
                ji jiVar25 = new ji(this.d, continuation, 24);
                jiVar25.c = obj;
                return jiVar25;
            default:
                ji jiVar26 = new ji(this.d, continuation, 25);
                jiVar26.c = obj;
                return jiVar26;
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
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
        }
        return ((ji) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        FocusRequester focusRequester = this.d;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th) {
                    
                    ResultKt.createFailure(th);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope2;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th2) {
                    
                    ResultKt.createFailure(th2);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.c;
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope3;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th3) {
                    
                    ResultKt.createFailure(th3);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.c;
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    b80 b80Var = new b80(15);
                    this.c = coroutineScope4;
                    this.b = 1;
                    if (MonotonicFrameClockKt.withFrameNanos(b80Var, this) == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th4) {
                    
                    ResultKt.createFailure(th4);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.c;
                Object coroutine_suspended5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.b;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    y70 y70Var = y70.d;
                    this.c = coroutineScope5;
                    this.b = 1;
                    if (MonotonicFrameClockKt.withFrameNanos(y70Var, this) == coroutine_suspended5) {
                        return coroutine_suspended5;
                    }
                } else {
                    if (i6 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th5) {
                    
                    ResultKt.createFailure(th5);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.c;
                Object coroutine_suspended6 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.b;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope6;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended6) {
                        return coroutine_suspended6;
                    }
                } else {
                    if (i7 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th6) {
                    
                    ResultKt.createFailure(th6);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.c;
                Object coroutine_suspended7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i8 = this.b;
                if (i8 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope7;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended7) {
                        return coroutine_suspended7;
                    }
                } else {
                    if (i8 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th7) {
                    
                    ResultKt.createFailure(th7);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.c;
                Object coroutine_suspended8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.b;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    vi0 vi0Var = new vi0(23);
                    this.c = coroutineScope8;
                    this.b = 1;
                    if (MonotonicFrameClockKt.withFrameNanos(vi0Var, this) == coroutine_suspended8) {
                        return coroutine_suspended8;
                    }
                } else {
                    if (i9 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th8) {
                    
                    ResultKt.createFailure(th8);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.c;
                Object coroutine_suspended9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.b;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope9;
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended9) {
                        return coroutine_suspended9;
                    }
                } else {
                    if (i10 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th9) {
                    
                    ResultKt.createFailure(th9);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.c;
                Object coroutine_suspended10 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.b;
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope10;
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended10) {
                        return coroutine_suspended10;
                    }
                } else {
                    if (i11 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th10) {
                    
                    ResultKt.createFailure(th10);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.c;
                Object coroutine_suspended11 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.b;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope11;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended11) {
                        return coroutine_suspended11;
                    }
                } else {
                    if (i12 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th11) {
                    
                    ResultKt.createFailure(th11);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.c;
                Object coroutine_suspended12 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i13 = this.b;
                if (i13 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope12;
                    this.b = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended12) {
                        return coroutine_suspended12;
                    }
                } else {
                    if (i13 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th12) {
                    
                    ResultKt.createFailure(th12);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.c;
                Object coroutine_suspended13 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i14 = this.b;
                if (i14 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope13;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended13) {
                        return coroutine_suspended13;
                    }
                } else {
                    if (i14 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th13) {
                    
                    ResultKt.createFailure(th13);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.c;
                Object coroutine_suspended14 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i15 = this.b;
                if (i15 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope14;
                    this.b = 1;
                    if (DelayKt.delay(60L, this) == coroutine_suspended14) {
                        return coroutine_suspended14;
                    }
                } else {
                    if (i15 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th14) {
                    
                    ResultKt.createFailure(th14);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.c;
                Object coroutine_suspended15 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i16 = this.b;
                if (i16 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope15;
                    this.b = 1;
                    if (DelayKt.delay(40L, this) == coroutine_suspended15) {
                        return coroutine_suspended15;
                    }
                } else {
                    if (i16 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th15) {
                    
                    ResultKt.createFailure(th15);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.c;
                Object coroutine_suspended16 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i17 = this.b;
                if (i17 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope16;
                    this.b = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended16) {
                        return coroutine_suspended16;
                    }
                } else {
                    if (i17 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th16) {
                    
                    ResultKt.createFailure(th16);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.c;
                Object coroutine_suspended17 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i18 = this.b;
                if (i18 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope17;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended17) {
                        return coroutine_suspended17;
                    }
                } else {
                    if (i18 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th17) {
                    
                    ResultKt.createFailure(th17);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.c;
                Object coroutine_suspended18 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i19 = this.b;
                if (i19 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope18;
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended18) {
                        return coroutine_suspended18;
                    }
                } else {
                    if (i19 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th18) {
                    
                    ResultKt.createFailure(th18);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.c;
                Object coroutine_suspended19 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i20 = this.b;
                if (i20 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope19;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended19) {
                        return coroutine_suspended19;
                    }
                } else {
                    if (i20 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th19) {
                    
                    ResultKt.createFailure(th19);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope20 = (CoroutineScope) this.c;
                Object coroutine_suspended20 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i21 = this.b;
                if (i21 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope20;
                    this.b = 1;
                    if (DelayKt.delay(40L, this) == coroutine_suspended20) {
                        return coroutine_suspended20;
                    }
                } else {
                    if (i21 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th20) {
                    
                    ResultKt.createFailure(th20);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope21 = (CoroutineScope) this.c;
                Object coroutine_suspended21 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i22 = this.b;
                if (i22 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope21;
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended21) {
                        return coroutine_suspended21;
                    }
                } else {
                    if (i22 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th21) {
                    
                    ResultKt.createFailure(th21);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope22 = (CoroutineScope) this.c;
                Object coroutine_suspended22 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i23 = this.b;
                if (i23 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope22;
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended22) {
                        return coroutine_suspended22;
                    }
                } else {
                    if (i23 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th22) {
                    
                    ResultKt.createFailure(th22);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope23 = (CoroutineScope) this.c;
                Object coroutine_suspended23 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i24 = this.b;
                if (i24 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope23;
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended23) {
                        return coroutine_suspended23;
                    }
                } else {
                    if (i24 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th23) {
                    
                    ResultKt.createFailure(th23);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope24 = (CoroutineScope) this.c;
                Object coroutine_suspended24 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i25 = this.b;
                if (i25 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope24;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended24) {
                        return coroutine_suspended24;
                    }
                } else {
                    if (i25 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th24) {
                    
                    ResultKt.createFailure(th24);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope25 = (CoroutineScope) this.c;
                Object coroutine_suspended25 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i26 = this.b;
                if (i26 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope25;
                    this.b = 1;
                    if (DelayKt.delay(40L, this) == coroutine_suspended25) {
                        return coroutine_suspended25;
                    }
                } else {
                    if (i26 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th25) {
                    
                    ResultKt.createFailure(th25);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope26 = (CoroutineScope) this.c;
                Object coroutine_suspended26 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i27 = this.b;
                if (i27 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c = coroutineScope26;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended26) {
                        return coroutine_suspended26;
                    }
                } else {
                    if (i27 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th26) {
                    
                    ResultKt.createFailure(th26);
                }
                return Unit.INSTANCE;
        }
    }
}
