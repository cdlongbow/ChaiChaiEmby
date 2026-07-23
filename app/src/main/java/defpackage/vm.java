package defpackage;

import android.util.Log;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vm extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ FocusRequester c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm(FocusRequester focusRequester, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new vm(this.c, continuation, 0);
            case 1:
                return new vm(this.c, continuation, 1);
            case 2:
                return new vm(this.c, continuation, 2);
            case 3:
                return new vm(this.c, continuation, 3);
            case 4:
                return new vm(this.c, continuation, 4);
            case 5:
                return new vm(this.c, continuation, 5);
            case 6:
                return new vm(this.c, continuation, 6);
            case 7:
                return new vm(this.c, continuation, 7);
            case 8:
                return new vm(this.c, continuation, 8);
            case 9:
                return new vm(this.c, continuation, 9);
            case 10:
                return new vm(this.c, continuation, 10);
            default:
                return new vm(this.c, continuation, 11);
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
        }
        return ((vm) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception e) {
                    Log.e("BufferSettingsDialog", "焦点请求失败", e);
                }
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception e2) {
                    Log.e("DanmakuSearch", "移动焦点失败", e2);
                }
                return Unit.INSTANCE;
            case 2:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(200L, this) == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                return Unit.INSTANCE;
            case 3:
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 4:
                Object coroutine_suspended5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended5) {
                        return coroutine_suspended5;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                return Unit.INSTANCE;
            case 5:
                Object coroutine_suspended6 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.b;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended6) {
                        return coroutine_suspended6;
                    }
                } else {
                    if (i6 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception unused2) {
                }
                return Unit.INSTANCE;
            case 6:
                Object coroutine_suspended7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.b;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended7) {
                        return coroutine_suspended7;
                    }
                } else {
                    if (i7 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception unused3) {
                }
                return Unit.INSTANCE;
            case 7:
                Object coroutine_suspended8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i8 = this.b;
                if (i8 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended8) {
                        return coroutine_suspended8;
                    }
                } else {
                    if (i8 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception unused4) {
                }
                return Unit.INSTANCE;
            case 8:
                Object coroutine_suspended9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.b;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended9) {
                        return coroutine_suspended9;
                    }
                } else {
                    if (i9 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception e3) {
                    Log.e("IntroOutroDialog", "焦点请求失败", e3);
                }
                return Unit.INSTANCE;
            case 9:
                Object coroutine_suspended10 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.b;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended10) {
                        return coroutine_suspended10;
                    }
                } else {
                    if (i10 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception e4) {
                    Log.e("LibraryScreen", "排序对话框焦点请求失败", e4);
                }
                return Unit.INSTANCE;
            case 10:
                Object coroutine_suspended11 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.b;
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended11) {
                        return coroutine_suspended11;
                    }
                } else {
                    if (i11 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception unused5) {
                }
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended12 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.b;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended12) {
                        return coroutine_suspended12;
                    }
                } else {
                    if (i12 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default(this.c, 0, 1, null);
                    break;
                } catch (Exception unused6) {
                }
                return Unit.INSTANCE;
        }
    }
}
