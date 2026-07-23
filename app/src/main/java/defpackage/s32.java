package defpackage;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s32 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ y32 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s32(y32 y32Var, String str, Continuation continuation) {
        super(2, continuation);
        this.b = y32Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        s32 s32Var = new s32(this.b, this.c, continuation);
        s32Var.a = obj;
        return s32Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s32) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Collection linkedHashSet;
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        y32 y32Var = this.b;
        Preferences.Key key = y32Var.c;
        Preferences.Key key2 = y32Var.b;
        Set set = (Set) mutablePreferences.get(key2);
        if (set == null || (linkedHashSet = CollectionsKt.toMutableSet(set)) == null) {
            linkedHashSet = new LinkedHashSet();
        }
        String str = this.c;
        ((java.util.Collection) linkedHashSet).removeIf(new oy1(new dl(str, 21), 2));
        mutablePreferences.set(key2, linkedHashSet);
        if (Intrinsics.areEqual(mutablePreferences.get(key), str)) {
            mutablePreferences.remove(key);
        }
        return Unit.INSTANCE;
    }
}
