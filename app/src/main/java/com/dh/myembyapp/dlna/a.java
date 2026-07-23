package com.dh.myembyapp.dlna;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import defpackage.rd1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ DlnaSettings c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DlnaSettings dlnaSettings, Context context, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.c = dlnaSettings;
        this.d = context;
        this.e = function0;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
        this.j = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.c, this.d, this.e, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        MutableState mutableState = this.g;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            String str = (String) this.h.getValue();
            if (StringsKt.isBlank(str)) {
                str = "柴柴TV";
            }
            DlnaConfig dlnaConfig = new DlnaConfig(zBooleanValue, str, true, ((Boolean) this.i.getValue()).booleanValue(), ((Boolean) this.j.getValue()).booleanValue());
            this.a = null;
            this.b = 1;
            if (this.c.saveConfig(dlnaConfig, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean zBooleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
        Context context = this.d;
        if (zBooleanValue2) {
            DlnaService.Companion companion = DlnaService.INSTANCE;
            companion.stop(context);
            companion.start(context);
        } else {
            DlnaService.INSTANCE.stop(context);
        }
        this.e.invoke();
        return Unit.INSTANCE;
    }
}
