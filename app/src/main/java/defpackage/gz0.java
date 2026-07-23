package defpackage;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class gz0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ lz0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(lz0 lz0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.b = lz0Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        gz0 gz0Var = new gz0(this.b, this.c, continuation);
        gz0Var.a = obj;
        return gz0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gz0) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Preferences.Key key = this.b.b;
        Set setEmptySet = (Set) mutablePreferences.get(key);
        if (setEmptySet == null) {
            setEmptySet = SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setEmptySet) {
            if (!StringsKt__StringsJVMKt.startsWith$default((String) obj2, this.c, false, 2, null)) {
                arrayList.add(obj2);
            }
        }
        mutablePreferences.set(key, CollectionsKt.toSet(arrayList));
        return Unit.INSTANCE;
    }
}
