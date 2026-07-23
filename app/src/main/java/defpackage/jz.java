package defpackage;

import androidx.datastore.preferences.core.MutablePreferences;
import com.dh.myembyapp.data.DanmakuSettingsManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class jz extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(int i, Continuation continuation) {
        super(2, continuation);
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        jz jzVar = new jz(this.b, continuation);
        jzVar.a = obj;
        return jzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jz) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        mutablePreferences.set(DanmakuSettingsManager.OPACITY_KEY, Boxing.boxInt(RangesKt.coerceIn(this.b, 0, 100)));
        return Unit.INSTANCE;
    }
}
