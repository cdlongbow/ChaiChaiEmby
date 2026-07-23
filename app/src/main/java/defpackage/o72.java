package defpackage;

import androidx.datastore.preferences.core.MutablePreferences;
import com.dh.myembyapp.data.model.AppCardSizeLevel;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class o72 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AppThemePreset b;
    public final /* synthetic */ LightThemeBackgroundStyle c;
    public final /* synthetic */ DarkThemeStyle d;
    public final /* synthetic */ DarkThemeGlowPosition e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o72(AppThemePreset appThemePreset, LightThemeBackgroundStyle lightThemeBackgroundStyle, DarkThemeStyle darkThemeStyle, DarkThemeGlowPosition darkThemeGlowPosition, boolean z, boolean z2, int i, Continuation continuation) {
        super(2, continuation);
        this.b = appThemePreset;
        this.c = lightThemeBackgroundStyle;
        this.d = darkThemeStyle;
        this.e = darkThemeGlowPosition;
        this.g = z;
        this.h = z2;
        this.i = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        o72 o72Var = new o72(this.b, this.c, this.d, this.e, this.g, this.h, this.i, continuation);
        o72Var.a = obj;
        return o72Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o72) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        mutablePreferences.set(q72.c, this.b.getStorageValue());
        mutablePreferences.set(q72.d, this.c.getStorageValue());
        mutablePreferences.set(q72.e, this.d.getStorageValue());
        mutablePreferences.set(q72.f, this.e.getStorageValue());
        mutablePreferences.set(q72.g, Boxing.boxBoolean(this.g));
        mutablePreferences.set(q72.h, Boxing.boxBoolean(this.h));
        mutablePreferences.set(q72.i, Boxing.boxInt(AppCardSizeLevel.INSTANCE.normalize(this.i)));
        return Unit.INSTANCE;
    }
}
