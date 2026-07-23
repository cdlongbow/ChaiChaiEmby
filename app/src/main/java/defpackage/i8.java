package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class i8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MutableState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8(String str, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = str;
        this.c = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        MutableState mutableState = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return new i8(str, mutableState, continuation, 0);
            case 1:
                return new i8(str, mutableState, continuation, 1);
            case 2:
                return new i8(str, mutableState, continuation, 2);
            default:
                return new i8(str, mutableState, continuation, 3);
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
        }
        return ((i8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        String str = this.b;
        MutableState mutableState = this.c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(str, ((TextFieldValue) mutableState.getValue()).getText())) {
                    String str2 = this.b;
                    mutableState.setValue(new TextFieldValue(str2, TextRangeKt.TextRange(str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                }
                break;
            case 1:
                ResultKt.throwOnFailure(obj);
                mutableState.setValue(null);
                Log.d("BufferMonitor", "🎬 重置卡死恢复预算: mediaId=" + str + " recoveries=0");
                break;
            case 2:
                ResultKt.throwOnFailure(obj);
                String text = ((TextFieldValue) mutableState.getValue()).getText();
                String str3 = this.b;
                if (!Intrinsics.areEqual(str3, text)) {
                    mutableState.setValue(new TextFieldValue(str3, TextRangeKt.TextRange(str3.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                String text2 = ((TextFieldValue) mutableState.getValue()).getText();
                String str4 = this.b;
                if (!Intrinsics.areEqual(str4, text2)) {
                    mutableState.setValue(new TextFieldValue(str4, TextRangeKt.TextRange(str4.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
