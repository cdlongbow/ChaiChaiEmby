package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class rv1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FocusRequester d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv1(boolean z, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = z;
        this.d = focusRequester;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new rv1(this.c, this.d, this.e, this.g, this.h, this.i, continuation, 0);
            default:
                return new rv1(this.c, this.d, this.e, this.g, this.h, this.i, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((rv1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3 = this.a;
        FocusRequester focusRequester = this.d;
        boolean z = this.c;
        MutableState mutableState = this.h;
        MutableState mutableState2 = this.e;
        MutableState mutableState3 = this.g;
        MutableState mutableState4 = this.i;
        switch (i3) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                try {
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!z) {
                            return Unit.INSTANCE;
                        }
                        if (((Boolean) mutableState2.getValue()).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        if (((List) mutableState3.getValue()).isEmpty()) {
                            return Unit.INSTANCE;
                        }
                        if (((String) mutableState.getValue()) != null) {
                            Iterator it = ((List) mutableState3.getValue()).iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                } else if (Intrinsics.areEqual(((MediaItem) it.next()).getId(), (String) mutableState.getValue())) {
                                    i = i5;
                                } else {
                                    i5++;
                                }
                            }
                        } else {
                            i = -1;
                        }
                        Boolean bool = Boolean.TRUE;
                        mutableState2.setValue(bool);
                        if (((String) mutableState.getValue()) != null && i >= 0) {
                            mutableState4.setValue(bool);
                            this.b = 1;
                            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                    break;
                } catch (Exception e) {
                    Log.e("SearchPage", "Error restoring focus in recommended", e);
                }
                mutableState4.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.b;
                try {
                    if (i6 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!z) {
                            return Unit.INSTANCE;
                        }
                        if (((Boolean) mutableState2.getValue()).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        if (((List) mutableState3.getValue()).isEmpty()) {
                            return Unit.INSTANCE;
                        }
                        if (((String) mutableState.getValue()) != null) {
                            Iterator it2 = ((List) mutableState3.getValue()).iterator();
                            int i7 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i2 = -1;
                                } else if (Intrinsics.areEqual(((MediaItem) it2.next()).getId(), (String) mutableState.getValue())) {
                                    i2 = i7;
                                } else {
                                    i7++;
                                }
                            }
                        } else {
                            i2 = -1;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        mutableState2.setValue(bool2);
                        if (((String) mutableState.getValue()) != null && i2 >= 0) {
                            mutableState4.setValue(bool2);
                            this.b = 1;
                            if (DelayKt.delay(200L, this) == coroutine_suspended2) {
                                return coroutine_suspended2;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i6 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                    break;
                } catch (Exception e2) {
                    Log.e("SearchPage", "Error restoring focus", e2);
                }
                mutableState4.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
