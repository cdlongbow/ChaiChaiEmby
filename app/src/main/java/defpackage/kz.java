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
public final class kz extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(float f, Continuation continuation) {
        super(2, continuation);
        this.b = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        kz kzVar = new kz(this.b, continuation);
        kzVar.a = obj;
        return kzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kz) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        mutablePreferences.set(DanmakuSettingsManager.SCREEN_PART_KEY, Boxing.boxFloat(RangesKt.coerceIn(this.b, 0.05f, 1.0f)));
        return Unit.INSTANCE;
    }
}
