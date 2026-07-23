package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.server.SubtitleFontUploadServerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class k6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SubtitleFontUploadServerManager b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ y32 g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6(SubtitleFontUploadServerManager subtitleFontUploadServerManager, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, y32 y32Var, MutableState mutableState4, MutableState mutableState5, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = subtitleFontUploadServerManager;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = y32Var;
        this.h = mutableState4;
        this.i = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new k6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, continuation, 0);
            case 1:
                return new k6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, continuation, 1);
            default:
                return new k6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, continuation, 2);
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
        return ((k6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        MutableState mutableState2 = this.e;
        SubtitleFontUploadServerManager subtitleFontUploadServerManager = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                float f = f7.a;
                MutableState mutableState3 = this.c;
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    mutableState.setValue(null);
                    mutableState2.setValue(Boolean.FALSE);
                    mutableState.setValue(subtitleFontUploadServerManager.startServer(new j6(this.g, this.h, mutableState3, this.i, null, 0)));
                    String str = (String) mutableState.getValue();
                    if (str == null || StringsKt.isBlank(str)) {
                        mutableState2.setValue(Boolean.TRUE);
                    }
                } else {
                    subtitleFontUploadServerManager.stopServer();
                    mutableState.setValue(null);
                    mutableState2.setValue(Boolean.FALSE);
                }
                break;
            case 1:
                ResultKt.throwOnFailure(obj);
                MutableState mutableState4 = this.c;
                if (((Boolean) mutableState4.getValue()).booleanValue()) {
                    mutableState.setValue(null);
                    mutableState2.setValue(Boolean.FALSE);
                    mutableState.setValue(subtitleFontUploadServerManager.startServer(new j6(this.g, this.h, mutableState4, this.i, null, 1)));
                    String str2 = (String) mutableState.getValue();
                    if (str2 == null || StringsKt.isBlank(str2)) {
                        mutableState2.setValue(Boolean.TRUE);
                    }
                } else {
                    subtitleFontUploadServerManager.stopServer();
                    mutableState.setValue(null);
                    mutableState2.setValue(Boolean.FALSE);
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                MutableState mutableState5 = this.c;
                if (((Boolean) mutableState5.getValue()).booleanValue()) {
                    mutableState.setValue(null);
                    mutableState2.setValue(Boolean.FALSE);
                    mutableState.setValue(subtitleFontUploadServerManager.startServer(new j6(this.g, this.h, mutableState5, this.i, null, 2)));
                    String str3 = (String) mutableState.getValue();
                    if (str3 == null || StringsKt.isBlank(str3)) {
                        mutableState2.setValue(Boolean.TRUE);
                    }
                } else {
                    subtitleFontUploadServerManager.stopServer();
                    mutableState.setValue(null);
                    mutableState2.setValue(Boolean.FALSE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
